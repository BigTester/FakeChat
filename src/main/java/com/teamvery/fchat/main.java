package com.teamvery.fchat;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("활성화 됨");
        Objects.requireNonNull(getCommand("fchat")).setExecutor(new cmd());

    }

}
