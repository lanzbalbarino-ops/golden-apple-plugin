package com.example.goldenapple;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class GoldenApplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Define the output item (1 Golden Apple)
        ItemStack result = new ItemStack(Material.GOLDEN_APPLE);

        // Create a unique key for this custom recipe
        NamespacedKey key = new NamespacedKey(this, "custom_golden_apple");

        // Create a shapeless recipe: order in crafting grid does not matter
        ShapelessRecipe recipe = new ShapelessRecipe(key, result);
        recipe.addIngredient(Material.APPLE);
        recipe.addIngredient(Material.GOLD_INGOT);

        // Register the recipe with the server
        getServer().addRecipe(recipe);

        getLogger().info("GoldenAppleRecipe plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("GoldenAppleRecipe plugin has been disabled.");
    }
  }
