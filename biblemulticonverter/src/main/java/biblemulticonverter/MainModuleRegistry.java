package biblemulticonverter;

import java.util.*;

import biblemulticonverter.format.*;
import biblemulticonverter.tools.*;

public class MainModuleRegistry extends ModuleRegistry {

	@Override
	public Collection<Module<ImportFormat>> getImportFormats() {
		List<Module<ImportFormat>> result = new ArrayList<ModuleRegistry.Module<ImportFormat>>();
		result.add(new Module<ImportFormat>("StrongDictionary", "Importer for creating a Strong's dictionary from public domain resources.", StrongDictionary.HELP_TEXT, StrongDictionary.class));
		return result;
	}

	@Override
	public Collection<Module<ExportFormat>> getExportFormats() {
		List<Module<ExportFormat>> result = new ArrayList<ModuleRegistry.Module<ExportFormat>>();
		result.add(new Module<ExportFormat>("Validate", "Validate bible for inconsistencies", Validate.HELP_TEXT, Validate.class));
		result.add(new Module<ExportFormat>("StrippedDiffable", "Like Diffable, but with features stripped.", StrippedDiffable.HELP_TEXT, StrippedDiffable.class));
		result.add(new Module<ExportFormat>("ZefaniaXMLMyBible", "Zefania XML - well known bible format (with MyBible optimizations).", ZefaniaXMLMyBible.HELP_TEXT, ZefaniaXMLMyBible.class));
		result.add(new Module<ExportFormat>("YCHPalmBible", "Export format for YCHBibleConverter for PalmBible+", YCHPalmBible.HELP_TEXT, YCHPalmBible.class));
		result.add(new Module<ExportFormat>("MobiPocket", "MobiPocket ebook format (predecessor of Kindle's format)", MobiPocket.HELP_TEXT, MobiPocket.class));
		result.add(new Module<ExportFormat>("ESwordHTML", "HTML Export format for E-Sword", ESwordHTML.HELP_TEXT, ESwordHTML.class));
		result.add(new Module<ExportFormat>("StrongConcordance", "Add concordance information to a Strong dictionary", StrongConcordance.HELP_TEXT, StrongConcordance.class));
		result.add(new Module<ExportFormat>("ScrambledDiffable", "Like Diffable, but with scrambled text; for tests with non-free bibles.", ScrambledDiffable.HELP_TEXT, ScrambledDiffable.class));
		return result;
	}

	@Override
	public Collection<Module<RoundtripFormat>> getRoundtripFormats() {
		List<Module<RoundtripFormat>> result = new ArrayList<ModuleRegistry.Module<RoundtripFormat>>();
		result.add(new Module<RoundtripFormat>("Compact", "A text-format that is small and well-compressible.", Compact.HELP_TEXT, Compact.class));
		result.add(new Module<RoundtripFormat>("Diffable", "A VPL-like text-format that can be diffed easily.", Diffable.HELP_TEXT, Diffable.class));
		result.add(new Module<RoundtripFormat>("RoundtripHTML", "Roundtrip HTML Export", RoundtripHTML.HELP_TEXT, RoundtripHTML.class));
		result.add(new Module<RoundtripFormat>("ZefaniaXML", "Zefania XML - well known bible format.", ZefaniaXML.HELP_TEXT, ZefaniaXML.class));
		result.add(new Module<RoundtripFormat>("ZefaniaXMLRoundtrip", "Zefania XML - well known bible format (Roundtrip converter).", ZefaniaXMLRoundtrip.HELP_TEXT, ZefaniaXMLRoundtrip.class));
		result.add(new Module<RoundtripFormat>("HaggaiXML", "Haggai XML - used by Free Scriptures project.", HaggaiXML.HELP_TEXT, HaggaiXML.class));
		result.add(new Module<RoundtripFormat>("OSIS", "Very rudimentary OSIS (Open Scripture Information Standard) import/export.", OSIS.HELP_TEXT, OSIS.class));
		result.add(new Module<RoundtripFormat>("TheWord", "Bible format used by theWord", TheWord.HELP_TEXT, TheWord.class));
		result.add(new Module<RoundtripFormat>("RoundtripODT", "ODT export and re-import [Unfinished]", RoundtripODT.HELP_TEXT, RoundtripODT.class));
		return result;
	}

	@Override
	public Collection<Module<Tool>> getTools() {
		List<Module<Tool>> result = new ArrayList<ModuleRegistry.Module<Tool>>();
		result.add(new Module<Tool>("help", "Show help about an import format, export format or tool.", HelpTool.HELP_TEXT, HelpTool.class));
		result.add(new Module<Tool>("MobiPocketTOCBuilder", "Create MobiPocket TOC file from multiple bibles", MobiPocketTOCBuilder.HELP_TEXT, MobiPocketTOCBuilder.class));
		result.add(new Module<Tool>("ESwordRTFPostprocessor", "Postprocess RTF for exporting to E-Sword", ESwordRTFPostprocessor.HELP_TEXT, ESwordRTFPostprocessor.class));
		return result;
	}
}
