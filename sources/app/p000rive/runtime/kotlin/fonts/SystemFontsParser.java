package app.p000rive.runtime.kotlin.fonts;

import android.util.Xml;
import app.p000rive.RiveLog;
import com.comscore.streaming.ContentType;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.b7x;
import p.eg;
import p.hhg1;
import p.ihc1;
import p.k4p1;
import p.l1d;
import p.mmr0;
import p.nhc1;
import p.o7h;
import p.p7h;
import p.q7h;
import p.rih1;
import p.smc0;
import p.u890;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/SystemFontsParser;", "", "()V", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SystemFontsParser {
    public static final int $stable = 0;
    public static final String FALLBACK_FONTS_XML_PATH = "/system/etc/system_fallback.xml";
    public static final String FONTS_XML_PATH = "/system/etc/fonts.xml";
    public static final String SYSTEM_FONTS_XML_PATH = "/system/etc/system_fonts.xml";
    private static final String TAG = "SystemFontsParser";
    private static final List<mmr0> fontFilesOrder;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> SYSTEM_FONTS_PATHS = p7h.M(new String[]{"/system/fonts/", "/system/font/", "/data/fonts/", "/system/product/fonts/"});

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J+\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b\u0018\u00010#2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010%JY\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010 \u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b+\u0010,JK\u00101\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0#2\u0006\u0010 \u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u00072\b\u00100\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u0010\rJ\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010\rJ\u001f\u0010;\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010<J-\u0010>\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010AJ#\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bD\u0010EJ\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bG\u0010HR \u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010Q\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\bQ\u0010OR\u0014\u0010R\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010OR&\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u00070#0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010K¨\u0006U"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/SystemFontsParser$Companion;", "", "<init>", "()V", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "readRootElementMap", "(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/Map;", "", "readRootElement", "(Lorg/xmlpull/v1/XmlPullParser;)Ljava/util/List;", "", "familiesMap", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Alias;", "aliases", "Lp/rih1;", "readNestedFamilies", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/Map;Ljava/util/List;)V", "readNestedFamiliesList", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)Ljava/util/List;", "readFamilyEntry", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;)Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "readAlias", "(Lorg/xmlpull/v1/XmlPullParser;)Lapp/rive/runtime/kotlin/fonts/Fonts$Alias;", "alias", "ogFamily", "remapAlias", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Alias;Lapp/rive/runtime/kotlin/fonts/Fonts$Family;)Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "familyName", "readFamily", "(Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "Lp/mmr0;", "readLegacyFamily", "(Lorg/xmlpull/v1/XmlPullParser;)Lp/mmr0;", "Lapp/rive/runtime/kotlin/fonts/Fonts$FileFont;", "filesList", "aliasNames", "familyLang", "familyVariant", "fromFileFonts", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lp/mmr0;", "Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "fontList", "lang", "variant", "fromFontList", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lp/mmr0;", "readFont", "(Lorg/xmlpull/v1/XmlPullParser;)Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "Lapp/rive/runtime/kotlin/fonts/Fonts$Axis;", "readAxis", "(Lorg/xmlpull/v1/XmlPullParser;)Lapp/rive/runtime/kotlin/fonts/Fonts$Axis;", "readNameset", "readFileset", "name", "getRequiredAttribute", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;", "default", "getOptionalAttribute", "(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "skip", "(Lorg/xmlpull/v1/XmlPullParser;)V", "Ljava/io/InputStream;", "xmlFileStream", "parseFontsXMLMap$kotlin_release", "(Ljava/io/InputStream;)Ljava/util/Map;", "parseFontsXMLMap", "parseFontsXML$kotlin_release", "(Ljava/io/InputStream;)Ljava/util/List;", "parseFontsXML", "SYSTEM_FONTS_PATHS", "Ljava/util/List;", "getSYSTEM_FONTS_PATHS$kotlin_release", "()Ljava/util/List;", "FALLBACK_FONTS_XML_PATH", "Ljava/lang/String;", "FONTS_XML_PATH", "SYSTEM_FONTS_XML_PATH", "TAG", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "fontFilesOrder", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final mmr0 fromFileFonts(List<Fonts.FileFont> filesList, List<String> aliasNames, String familyName, String familyLang, String familyVariant) {
            String lang = familyLang;
            String variant = familyVariant;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = filesList.iterator();
            int i = 0;
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    if (linkedHashMap.isEmpty()) {
                        RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new SystemFontsParser$Companion$fromFileFonts$2(familyName));
                        return new mmr0(new Fonts.Family(familyName, variant, lang, b7x.a), z6x.a);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = aliasNames.iterator();
                    while (it2.hasNext()) {
                        String string = ihc1.e1((String) it2.next()).toString();
                        Fonts.Alias alias = string.length() > 0 ? new Fonts.Alias(string, familyName, null) : null;
                        if (alias != null) {
                            arrayList.add(alias);
                        }
                    }
                    if (variant == null) {
                        Fonts.FileFont fileFont = (Fonts.FileFont) o7h.s0(filesList);
                        variant = fileFont != null ? fileFont.getVariant() : null;
                    }
                    if (lang == null) {
                        Fonts.FileFont fileFont2 = (Fonts.FileFont) o7h.s0(filesList);
                        lang = fileFont2 != null ? fileFont2.getLang() : null;
                    }
                    String string2 = variant != null ? ihc1.e1(variant).toString() : null;
                    if (string2 == null || ihc1.y0(string2)) {
                        string2 = null;
                    }
                    String string3 = lang != null ? ihc1.e1(lang).toString() : null;
                    if (string3 != null && !ihc1.y0(string3)) {
                        str = string3;
                    }
                    return new mmr0(new Fonts.Family(familyName, string2, str, linkedHashMap), arrayList);
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                Fonts.FileFont fileFont3 = (Fonts.FileFont) next;
                if (i >= SystemFontsParser.fontFilesOrder.size()) {
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$fromFileFonts$1$1(familyName, fileFont3));
                } else {
                    mmr0 mmr0Var = (mmr0) SystemFontsParser.fontFilesOrder.get(i);
                    Fonts.Weight weight = (Fonts.Weight) mmr0Var.a;
                    String str2 = (String) mmr0Var.b;
                    String string4 = ihc1.e1(fileFont3.getName()).toString();
                    if (string4.length() == 0) {
                        RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$fromFileFonts$1$2(familyName));
                    } else {
                        Fonts.Font font = new Fonts.Font(weight, str2, string4, null, 0, null, null, ContentType.LONG_FORM_ON_DEMAND, null);
                        Object arrayList2 = linkedHashMap.get(weight);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(weight, arrayList2);
                        }
                        ((List) arrayList2).add(font);
                    }
                }
                i = i2;
            }
        }

        private final mmr0 fromFontList(String familyName, List<Fonts.Font> fontList, String lang, String variant) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Fonts.Font font : fontList) {
                if (ihc1.y0(font.getName())) {
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$fromFontList$1$1(familyName));
                } else {
                    Fonts.Weight weight = font.getWeight();
                    Object arrayList = linkedHashMap.get(weight);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(weight, arrayList);
                    }
                    ((List) arrayList).add(font);
                }
            }
            boolean zIsEmpty = linkedHashMap.isEmpty();
            z6x z6xVar = z6x.a;
            if (!zIsEmpty) {
                return new mmr0(new Fonts.Family(familyName, variant, lang, linkedHashMap), z6xVar);
            }
            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$fromFontList$2(familyName));
            return new mmr0(new Fonts.Family(familyName, variant, lang, b7x.a), z6xVar);
        }

        private final String getOptionalAttribute(XmlPullParser parser, String name, String str) {
            String attributeValue = parser.getAttributeValue(null, name);
            return attributeValue == null ? str : attributeValue;
        }

        public static /* synthetic */ String getOptionalAttribute$default(Companion companion, XmlPullParser xmlPullParser, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.getOptionalAttribute(xmlPullParser, str, str2);
        }

        private final String getRequiredAttribute(XmlPullParser parser, String name) {
            String attributeValue = parser.getAttributeValue(null, name);
            if (attributeValue != null) {
                return attributeValue;
            }
            hhg1.n(l1d.m("Missing required attribute: ", name));
            return null;
        }

        private final Fonts.Alias readAlias(XmlPullParser parser) throws XmlPullParserException, IOException {
            Companion companion;
            XmlPullParser xmlPullParser;
            parser.require(2, null, "alias");
            try {
                String requiredAttribute = getRequiredAttribute(parser, "name");
                String requiredAttribute2 = getRequiredAttribute(parser, "to");
                companion = this;
                xmlPullParser = parser;
                try {
                    String optionalAttribute$default = getOptionalAttribute$default(companion, xmlPullParser, "weight", null, 4, null);
                    Fonts.Weight weightFromString = optionalAttribute$default != null ? Fonts.Weight.INSTANCE.fromString(optionalAttribute$default) : null;
                    companion.skip(xmlPullParser);
                    if (!ihc1.y0(requiredAttribute) && !ihc1.y0(requiredAttribute2)) {
                        return new Fonts.Alias(ihc1.e1(requiredAttribute).toString(), ihc1.e1(requiredAttribute2).toString(), weightFromString);
                    }
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$readAlias$1(requiredAttribute, requiredAttribute2));
                    return null;
                } catch (IllegalArgumentException e) {
                    e = e;
                    RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new SystemFontsParser$Companion$readAlias$2(e));
                    companion.skip(xmlPullParser);
                    return null;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                companion = this;
                xmlPullParser = parser;
            }
        }

        private final Fonts.Axis readAxis(XmlPullParser parser) throws XmlPullParserException, IOException {
            String requiredAttribute = getRequiredAttribute(parser, "tag");
            String requiredAttribute2 = getRequiredAttribute(parser, "stylevalue");
            skip(parser);
            if (!ihc1.y0(requiredAttribute) && !ihc1.y0(requiredAttribute2)) {
                return new Fonts.Axis(requiredAttribute, requiredAttribute2);
            }
            hhg1.n("Axis tag found with blank 'tag' or 'stylevalue'.");
            return null;
        }

        private final Fonts.Family readFamily(String familyName, XmlPullParser parser) throws XmlPullParserException, IOException {
            Companion companion = SystemFontsParser.INSTANCE;
            String optionalAttribute$default = getOptionalAttribute$default(companion, parser, "lang", null, 4, null);
            String optionalAttribute$default2 = getOptionalAttribute$default(companion, parser, "variant", null, 4, null);
            String optionalAttribute$default3 = getOptionalAttribute$default(companion, parser, "ignore", null, 4, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    if (u890.j(ihc1.e1(parser.getName()).toString(), "font")) {
                        try {
                            Fonts.Font font = readFont(parser);
                            Fonts.Weight weight = font.getWeight();
                            Object arrayList = linkedHashMap.get(weight);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(weight, arrayList);
                            }
                            ((List) arrayList).add(font);
                        } catch (Exception e) {
                            RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new SystemFontsParser$Companion$readFamily$2(familyName, e));
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
            if (o7h.i0(p7h.M(new String[]{"true", "1"}), optionalAttribute$default3) || linkedHashMap.isEmpty()) {
                return null;
            }
            return new Fonts.Family(familyName, optionalAttribute$default2, optionalAttribute$default, linkedHashMap);
        }

        private final Fonts.Family readFamilyEntry(XmlPullParser parser, List<Fonts.Alias> aliases) throws XmlPullParserException, IOException {
            parser.require(2, null, "family");
            String optionalAttribute$default = getOptionalAttribute$default(this, parser, "name", null, 4, null);
            String string = optionalAttribute$default != null ? ihc1.e1(optionalAttribute$default).toString() : null;
            if (string != null && string.length() > 0) {
                return readFamily(string, parser);
            }
            mmr0 legacyFamily = readLegacyFamily(parser);
            if (legacyFamily == null) {
                return null;
            }
            Fonts.Family family = (Fonts.Family) legacyFamily.a;
            List list = (List) legacyFamily.b;
            if (!list.isEmpty()) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, SystemFontsParser$Companion$readFamilyEntry$1$1.INSTANCE);
                aliases.addAll(list);
            }
            return family;
        }

        private final List<Fonts.FileFont> readFileset(XmlPullParser parser) throws XmlPullParserException, IOException {
            XmlPullParser xmlPullParser;
            String string;
            smc0 smc0VarN = k4p1.n();
            parser.require(2, null, "fileset");
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    if (u890.j(ihc1.e1(parser.getName()).toString(), "file")) {
                        Companion companion = SystemFontsParser.INSTANCE;
                        xmlPullParser = parser;
                        String optionalAttribute$default = getOptionalAttribute$default(companion, xmlPullParser, "variant", null, 4, null);
                        if (optionalAttribute$default == null || ihc1.y0(optionalAttribute$default)) {
                            optionalAttribute$default = null;
                        }
                        String optionalAttribute$default2 = getOptionalAttribute$default(companion, xmlPullParser, "lang", null, 4, null);
                        if (optionalAttribute$default2 == null || ihc1.y0(optionalAttribute$default2)) {
                            optionalAttribute$default2 = null;
                        }
                        StringBuilder sb = new StringBuilder();
                        if (xmlPullParser.next() == 4) {
                            String text = xmlPullParser.getText();
                            if (text == null || (string = ihc1.e1(text).toString()) == null) {
                                string = "";
                            }
                            sb.append(string);
                            xmlPullParser.next();
                        }
                        String string2 = sb.toString();
                        if (xmlPullParser.getEventType() != 3 || !u890.j(ihc1.e1(xmlPullParser.getName()).toString(), "file")) {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$readFileset$1$1(xmlPullParser));
                        }
                        if (string2.length() == 0) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            smc0VarN.add(new Fonts.FileFont(string2, optionalAttribute$default, optionalAttribute$default2));
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, SystemFontsParser$Companion$readFileset$1$4.INSTANCE);
                        }
                    } else {
                        xmlPullParser = parser;
                        SystemFontsParser.INSTANCE.skip(xmlPullParser);
                    }
                    parser = xmlPullParser;
                }
            }
            return k4p1.k(smc0VarN);
        }

        private final Fonts.Font readFont(XmlPullParser parser) throws XmlPullParserException, IOException {
            String text;
            Integer numC0;
            parser.require(2, null, "font");
            Fonts.Weight.Companion companion = Fonts.Weight.INSTANCE;
            Fonts.Weight weightFromString = companion.fromString(getOptionalAttribute(parser, "weight", String.valueOf(companion.getNORMAL().getWeight())));
            String optionalAttribute = getOptionalAttribute(parser, "style", Fonts.Font.STYLE_NORMAL);
            String str = optionalAttribute == null ? Fonts.Font.STYLE_NORMAL : optionalAttribute;
            String optionalAttribute$default = getOptionalAttribute$default(this, parser, "index", null, 4, null);
            int iIntValue = (optionalAttribute$default == null || (numC0 = nhc1.c0(optionalAttribute$default)) == null) ? 0 : numC0.intValue();
            String optionalAttribute$default2 = getOptionalAttribute$default(this, parser, "postScriptName", null, 4, null);
            if (optionalAttribute$default2 == null || ihc1.y0(optionalAttribute$default2)) {
                optionalAttribute$default2 = null;
            }
            String optionalAttribute$default3 = getOptionalAttribute$default(this, parser, "fallbackFor", null, 4, null);
            String str2 = (optionalAttribute$default3 == null || ihc1.y0(optionalAttribute$default3)) ? null : optionalAttribute$default3;
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            while (parser.next() != 3) {
                int eventType = parser.getEventType();
                if (eventType != 2) {
                    if (eventType == 4 && (text = parser.getText()) != null) {
                        sb.append(text);
                    }
                } else if (u890.j(ihc1.e1(parser.getName()).toString(), "axis")) {
                    try {
                        arrayList.add(readAxis(parser));
                    } catch (Exception e) {
                        RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new SystemFontsParser$Companion$readFont$3(e));
                    }
                } else {
                    skip(parser);
                }
            }
            String string = ihc1.e1(sb.toString()).toString();
            String str3 = string.length() == 0 ? null : string;
            if (str3 != null) {
                return new Fonts.Font(weightFromString, str, str3, !arrayList.isEmpty() ? arrayList : null, iIntValue, optionalAttribute$default2, str2);
            }
            eg.m("Font tag found with empty filename");
            return null;
        }

        private final mmr0 readLegacyFamily(XmlPullParser parser) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String optionalAttribute$default = getOptionalAttribute$default(this, parser, "variant", null, 4, null);
            String optionalAttribute$default2 = getOptionalAttribute$default(this, parser, "lang", null, 4, null);
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    try {
                        String string = ihc1.e1(parser.getName()).toString();
                        int iHashCode = string.hashCode();
                        if (iHashCode != -854981274) {
                            if (iHashCode != 3148879) {
                                if (iHashCode == 1721971191 && string.equals("nameset")) {
                                    arrayList.addAll(readNameset(parser));
                                } else {
                                    skip(parser);
                                }
                            } else if (string.equals("font")) {
                                arrayList3.add(readFont(parser));
                            } else {
                                skip(parser);
                            }
                        } else if (string.equals("fileset")) {
                            arrayList2.addAll(readFileset(parser));
                        } else {
                            skip(parser);
                        }
                    } catch (Exception e) {
                        RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new SystemFontsParser$Companion$readLegacyFamily$1(parser, e));
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                return fromFontList(arrayList.isEmpty() ? "" : arrayList.remove(0), arrayList3, optionalAttribute$default2, optionalAttribute$default);
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
            return fromFileFonts(arrayList2, arrayList, ihc1.e1(arrayList.remove(0)).toString(), optionalAttribute$default2, optionalAttribute$default);
        }

        private final List<String> readNameset(XmlPullParser parser) throws XmlPullParserException, IOException {
            String string;
            parser.require(2, null, "nameset");
            ArrayList arrayList = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    if (u890.j(ihc1.e1(parser.getName()).toString(), "name")) {
                        String str = "";
                        if (parser.next() == 4) {
                            String text = parser.getText();
                            if (text != null && (string = ihc1.e1(text).toString()) != null) {
                                str = string;
                            }
                            parser.next();
                        }
                        if (parser.getEventType() != 3 || !u890.j(ihc1.e1(parser.getName()).toString(), "name")) {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$readNameset$1(parser));
                        }
                        if (!ihc1.y0(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
            return arrayList;
        }

        private final void readNestedFamilies(XmlPullParser parser, Map<String, Fonts.Family> familiesMap, List<Fonts.Alias> aliases) throws XmlPullParserException, IOException {
            parser.require(2, null, "familyset");
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String string = ihc1.e1(parser.getName()).toString();
                    if (u890.j(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(parser, aliases);
                        if (familyEntry != null) {
                            String name = familyEntry.getName();
                            familiesMap.put((name == null || name.length() == 0) ? ((Fonts.Font) o7h.q0(q7h.V(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                        }
                    } else if (u890.j(string, "alias")) {
                        Fonts.Alias alias = readAlias(parser);
                        if (alias != null) {
                            aliases.add(alias);
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
        }

        private final List<Fonts.Family> readNestedFamiliesList(XmlPullParser parser, List<Fonts.Alias> aliases) throws XmlPullParserException, IOException {
            parser.require(2, null, "familyset");
            ArrayList arrayList = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String string = ihc1.e1(parser.getName()).toString();
                    if (u890.j(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(parser, aliases);
                        if (familyEntry != null) {
                            arrayList.add(familyEntry);
                        }
                    } else if (u890.j(string, "alias")) {
                        Fonts.Alias alias = readAlias(parser);
                        if (alias != null) {
                            aliases.add(alias);
                        }
                    } else {
                        skip(parser);
                    }
                }
            }
            return arrayList;
        }

        private final List<Fonts.Family> readRootElement(XmlPullParser parser) throws XmlPullParserException, IOException {
            boolean z;
            Object next;
            Fonts.Family familyRemapAlias;
            Object next2;
            parser.require(2, null, null);
            String name = parser.getName();
            if (!u890.j(name, "familyset") && !u890.j(name, "fonts-modification") && !u890.j(name, "config")) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$readRootElement$1(name));
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<Fonts.Alias> arrayList2 = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String string = ihc1.e1(parser.getName()).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(parser);
                                if (alias != null) {
                                    arrayList2.add(alias);
                                }
                            } else {
                                skip(parser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(parser, arrayList2);
                            if (familyEntry != null) {
                                arrayList.add(familyEntry);
                            }
                        } else {
                            skip(parser);
                        }
                    } else if (string.equals("familyset")) {
                        arrayList.addAll(readNestedFamiliesList(parser, arrayList2));
                    } else {
                        skip(parser);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Fonts.Family) it.next()).getName());
            }
            Set setO1 = o7h.o1(arrayList3);
            for (Fonts.Alias alias2 : arrayList2) {
                if (!setO1.contains(alias2.getName())) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!u890.j(((Fonts.Family) next2).getName(), alias2.getOriginal()));
                    Fonts.Family family = (Fonts.Family) next2;
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.INSTANCE.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            setO1.add(alias2.getName());
                            arrayList.add(familyRemapAlias2);
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$readRootElement$4$2$2(alias2));
                        }
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(arrayList2);
            for (boolean z2 = true; z2 && !arrayList4.isEmpty(); z2 = z) {
                Iterator it3 = arrayList4.iterator();
                z = false;
                while (it3.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it3.next();
                    if (setO1.contains(alias3.getName())) {
                        it3.remove();
                    } else {
                        Iterator it4 = arrayList.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                        } while (!u890.j(((Fonts.Family) next).getName(), alias3.getOriginal()));
                        Fonts.Family family2 = (Fonts.Family) next;
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.INSTANCE.remapAlias(alias3, family2)) != null) {
                            setO1.add(alias3.getName());
                            arrayList.add(familyRemapAlias);
                            it3.remove();
                            z = true;
                        }
                    }
                }
            }
            return arrayList;
        }

        private final Map<String, Fonts.Family> readRootElementMap(XmlPullParser parser) throws XmlPullParserException, IOException {
            boolean z;
            Fonts.Family familyRemapAlias;
            rih1 rih1Var;
            parser.require(2, null, null);
            String name = parser.getName();
            if (!u890.j(name, "familyset") && !u890.j(name, "fonts-modification") && !u890.j(name, "config")) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$readRootElementMap$1(name));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList<Fonts.Alias> arrayList = new ArrayList();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String string = ihc1.e1(parser.getName()).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(parser);
                                if (alias != null) {
                                    arrayList.add(alias);
                                }
                            } else {
                                skip(parser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(parser, arrayList);
                            if (familyEntry != null) {
                                String name2 = familyEntry.getName();
                                linkedHashMap.put((name2 == null || name2.length() == 0) ? ((Fonts.Font) o7h.q0(q7h.V(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                            }
                        } else {
                            skip(parser);
                        }
                    } else if (string.equals("familyset")) {
                        readNestedFamilies(parser, linkedHashMap, arrayList);
                    } else {
                        skip(parser);
                    }
                }
            }
            for (Fonts.Alias alias2 : arrayList) {
                if (linkedHashMap.containsKey(alias2.getName())) {
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$readRootElementMap$4$2(alias2));
                } else {
                    Fonts.Family family = (Fonts.Family) linkedHashMap.get(alias2.getOriginal());
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.INSTANCE.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            linkedHashMap.put(alias2.getName(), familyRemapAlias2);
                            rih1Var = rih1.a;
                        } else {
                            rih1Var = null;
                        }
                        if (rih1Var == null) {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$readRootElementMap$4$1$2(alias2));
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (boolean z2 = true; z2 && !arrayList2.isEmpty(); z2 = z) {
                Iterator it = arrayList2.iterator();
                z = false;
                while (it.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it.next();
                    if (linkedHashMap.containsKey(alias3.getName())) {
                        it.remove();
                    } else {
                        Fonts.Family family2 = (Fonts.Family) linkedHashMap.get(alias3.getOriginal());
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.INSTANCE.remapAlias(alias3, family2)) != null) {
                            linkedHashMap.put(alias3.getName(), familyRemapAlias);
                            it.remove();
                            z = true;
                        }
                    }
                }
            }
            return linkedHashMap;
        }

        private final Fonts.Family remapAlias(Fonts.Alias alias, Fonts.Family ogFamily) {
            Fonts.Weight weight = alias.getWeight();
            if (weight == null) {
                return new Fonts.Family(alias.getName(), ogFamily.getVariant(), ogFamily.getLang(), ogFamily.getFonts());
            }
            List<Fonts.Font> list = ogFamily.getFonts().get(weight);
            if (list == null || list.isEmpty()) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new SystemFontsParser$Companion$remapAlias$1(alias, weight));
                return null;
            }
            return new Fonts.Family(alias.getName(), ogFamily.getVariant(), ogFamily.getLang(), Collections.singletonMap(weight, list));
        }

        private final void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
            int i = 1;
            while (i > 0) {
                int next = parser.next();
                if (next == 1) {
                    return;
                }
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
        }

        public final List<String> getSYSTEM_FONTS_PATHS$kotlin_release() {
            return SystemFontsParser.SYSTEM_FONTS_PATHS;
        }

        public final List<Fonts.Family> parseFontsXML$kotlin_release(InputStream xmlFileStream) throws XmlPullParserException, IOException {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(xmlFileStream, null);
            xmlPullParserNewPullParser.nextTag();
            return readRootElement(xmlPullParserNewPullParser);
        }

        public final Map<String, Fonts.Family> parseFontsXMLMap$kotlin_release(InputStream xmlFileStream) throws XmlPullParserException, IOException {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(xmlFileStream, null);
            xmlPullParserNewPullParser.nextTag();
            return readRootElementMap(xmlPullParserNewPullParser);
        }

        private Companion() {
        }
    }

    static {
        Fonts.Weight.Companion companion = Fonts.Weight.INSTANCE;
        fontFilesOrder = p7h.M(new mmr0[]{new mmr0(companion.getNORMAL(), Fonts.Font.STYLE_NORMAL), new mmr0(companion.getBOLD(), Fonts.Font.STYLE_NORMAL), new mmr0(companion.getNORMAL(), Fonts.Font.STYLE_ITALIC), new mmr0(companion.getBOLD(), Fonts.Font.STYLE_ITALIC)});
    }
}
