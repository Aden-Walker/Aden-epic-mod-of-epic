package com.aemoe.events;



import org.apache.logging.log4j.Logger;

import com.aemoe.Main;
import com.aemoe.lists.BlockList;
import com.aemoe.lists.ItemList;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
	public static final Logger LOGGER = Main.LOGGER;
	public static final String MOD_ID = Main.MOD_ID;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll
		(
			ItemList.green_iron = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("green_iron")),
			ItemList.green_iron_katana = new Item(new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(location("green_iron_katana")),
			ItemList.green_iron_block = new BlockItem(BlockList.green_iron_block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(BlockList.green_iron_block.getRegistryName())
			
		);
		
	}
	
	
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll
		(
				
			BlockList.green_iron_block = new Block(Block.Properties.create(Material.ANVIL).sound(SoundType.ANVIL).hardnessAndResistance(3)).setRegistryName(location("green_iron_block"))
		);
	}
	
	
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(MOD_ID, name);
	}
}
