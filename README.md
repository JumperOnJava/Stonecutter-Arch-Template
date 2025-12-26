# Stonecutter template

If you have some issues with template ping me (@JavaJumper) in [Kiku's realm](https://discord.gg/TBgNUCfryS) or official fabric discord

This template allows you create multiloader multversion mod using stonecutter and architectury 

It is based on my CustomCursor project

## Setup

To change versions check settings.gradle.kts
Currently default versions are these,
but you can easily add other versions if you need that
- 1.20.1, fabric, lexforge
- 1.20.4, fabric, neoforge
- 1.21.1, fabric, neoforge
- 1.21.3, fabric, neoforge
- 1.21.4, fabric, neoforge
- 1.21.5, fabric, neoforge
- 1.21.6, fabric, neoforge
- 1.21.7, fabric, neoforge
- 1.21.8, fabric, neoforge
- 1.21.9, fabric, neoforge
- 1.21.10, fabric, neoforge
- 1.21.11, fabric, neoforge

You can use c# script to automatically change all template names.
Open RenameTemplate.cs, change names in replacements array and run "dotnet run" in this directory
I would highly recommend to do this before opening project in your IDE, and then remove all c# related files from project
(obj and bin folders, .csproj and script itself). Also you can remove c# stuff from .gitignore (there is comment for that)


## Build tools usage

To start current active version use runActive task

For testing all versions you can use chiseledRunAllClients, it runs all possible version and loader variants (in random(?) order)

Also template had publishing set up, you need to specify project id for modrinth and curseforge in gradle.properties, and tokens for these sites in local.properties (it is gitignored, check local.properties.example). After that use chiseledPublishMods task

## Template usage

Template already has some code setup: 
- common and platform specific entrypoints
- ModPlatform interface for platform specific code
- example config screen with mod menu integration 
- example mixin (clientside)
- class for simple file IO 
- common entrypoint with logger, modid, ModPlatform object instance
- en_us lang file
