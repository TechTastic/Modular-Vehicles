package io.github.techtastic.modularvehicles;

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import io.github.techtastic.modularvehicles.commands.ExampleCommand;
import io.github.techtastic.modularvehicles.events.ExampleEvent;

import javax.annotation.Nonnull;

public class ModularVehicles extends JavaPlugin {

    public ModularVehicles(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        this.getCommandRegistry().registerCommand(new ExampleCommand("example", "An example command"));
        this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, ExampleEvent::onPlayerReady);
    }
}