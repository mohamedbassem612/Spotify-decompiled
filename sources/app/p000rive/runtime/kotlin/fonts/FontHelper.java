package app.p000rive.runtime.kotlin.fonts;

import app.p000rive.RiveLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.b7x;
import p.cix0;
import p.f46;
import p.fp20;
import p.i46;
import p.ihc1;
import p.n561;
import p.o7h;
import p.pap1;
import p.q7h;
import p.sgg1;
import p.u890;
import p.v7x;
import p.y520;
import p.z561;
import p.z6x;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontHelper;", "", "()V", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontHelper {
    public static final int $stable = 0;
    private static final String TAG = "Rive/FontHelper";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicReference<Map<String, Fonts.Family>> familiesMapCache = new AtomicReference<>(null);
    private static final AtomicReference<List<Fonts.Family>> familiesListCache = new AtomicReference<>(null);

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001cJ\u001b\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0018H\u0000¢\u0006\u0004\b!\u0010\u001eJ\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b#\u0010 J\u001b\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00182\b\b\u0002\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b+\u0010/J\u0017\u00102\u001a\u0004\u0018\u0001012\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0004\u0018\u0001042\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b5\u00106J\u001b\u00107\u001a\u0004\u0018\u0001042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0007¢\u0006\u0004\b9\u0010\u0003R\u0014\u0010:\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010;R \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u00180<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>¨\u0006@"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontHelper$Companion;", "", "<init>", "()V", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Family;", "families", "", "Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "resultSet", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "weight", "", "style", "Lp/rih1;", "filterFamilies", "(Ljava/util/List;Ljava/util/Set;Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;Ljava/lang/String;)V", "Lp/n561;", "matchingFamiliesSequence", "requestedLang", "requestedWeight", "requestedStyle", "processMatchingFamilies", "(Lp/n561;Ljava/lang/String;Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;Ljava/lang/String;)Ljava/util/List;", "", "fontFamilies", "filterNonExistingFonts", "(Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/List;)Ljava/util/List;", "getSystemFonts", "()Ljava/util/Map;", "getSystemFontList", "()Ljava/util/List;", "loadFonts$kotlin_release", "loadFonts", "loadFontList$kotlin_release", "loadFontList", "Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "opts", "getFallbackFont", "(Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Lapp/rive/runtime/kotlin/fonts/Fonts$Font;", "getFallbackFonts", "(Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Ljava/util/List;", "findMatches$kotlin_release", "(Ljava/util/Map;Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Ljava/util/List;", "findMatches", "fontFamiliesList", "(Ljava/util/List;Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Ljava/util/List;", "font", "Ljava/io/File;", "getFontFile", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Font;)Ljava/io/File;", "", "getFontBytes", "(Lapp/rive/runtime/kotlin/fonts/Fonts$Font;)[B", "getFallbackFontBytes", "(Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)[B", "resetForTesting", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicReference;", "familiesListCache", "Ljava/util/concurrent/atomic/AtomicReference;", "familiesMapCache", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void filterFamilies(List<Fonts.Family> families, Set<Fonts.Font> resultSet, Fonts.Weight weight, String style) {
            fp20<Fonts.Font> i46Var;
            for (Fonts.Family family : families) {
                if (weight == null) {
                    i46Var = new fp20(new i46(family.getFonts().values(), (byte) 1), new cix0((byte) 17), new cix0((byte) 16));
                } else {
                    List<Fonts.Font> list = family.getFonts().get(weight);
                    i46Var = list != null ? new i46(list, (byte) 1) : v7x.a;
                }
                for (Fonts.Font font : i46Var) {
                    if (style == null || ihc1.y0(style) || u890.j(font.getStyle(), style)) {
                        resultSet.add(font);
                    }
                }
            }
        }

        private final List<Fonts.Family> filterNonExistingFonts(List<Fonts.Family> fontFamilies) {
            if (fontFamilies.isEmpty()) {
                return fontFamilies;
            }
            ArrayList arrayList = new ArrayList();
            for (Fonts.Family family : fontFamilies) {
                Map<Fonts.Weight, List<Fonts.Font>> fonts = family.getFonts();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(fonts.size()));
                Iterator<T> it = fonts.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (FontHelper.INSTANCE.getFontFile((Fonts.Font) obj) != null) {
                            arrayList2.add(obj);
                        }
                    }
                    linkedHashMap.put(key, arrayList2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!((List) entry2.getValue()).isEmpty()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Fonts.Family family2 = !linkedHashMap2.isEmpty() ? new Fonts.Family(family.getName(), family.getVariant(), family.getLang(), linkedHashMap2) : null;
                if (family2 != null) {
                    arrayList.add(family2);
                }
            }
            return arrayList;
        }

        public static /* synthetic */ List findMatches$kotlin_release$default(Companion companion, Map map, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 2) != 0) {
                fontOpts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return companion.findMatches$kotlin_release((Map<String, Fonts.Family>) map, fontOpts);
        }

        public static /* synthetic */ Fonts.Font getFallbackFont$default(Companion companion, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFont(fontOpts);
        }

        public static /* synthetic */ byte[] getFallbackFontBytes$default(Companion companion, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFontBytes(fontOpts);
        }

        public static /* synthetic */ List getFallbackFonts$default(Companion companion, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 1) != 0) {
                fontOpts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return companion.getFallbackFonts(fontOpts);
        }

        private final List<Fonts.Font> processMatchingFamilies(n561 matchingFamiliesSequence, final String requestedLang, Fonts.Weight requestedWeight, String requestedStyle) {
            List listK0 = z561.k0(matchingFamiliesSequence);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listK0) {
                String name = ((Fonts.Family) obj).getName();
                if (name == null || ihc1.y0(name)) {
                    arrayList2.add(obj);
                } else {
                    arrayList.add(obj);
                }
            }
            List<Fonts.Family> listA1 = o7h.a1(arrayList, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return pap1.t(Boolean.valueOf(u890.j(((Fonts.Family) t2).getLang(), requestedLang)), Boolean.valueOf(u890.j(((Fonts.Family) t).getLang(), requestedLang)));
                }
            });
            List<Fonts.Family> listA2 = o7h.a1(arrayList2, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return pap1.t(Boolean.valueOf(u890.j(((Fonts.Family) t2).getLang(), requestedLang)), Boolean.valueOf(u890.j(((Fonts.Family) t).getLang(), requestedLang)));
                }
            });
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            filterFamilies(listA1, linkedHashSet, requestedWeight, requestedStyle);
            filterFamilies(listA2, linkedHashSet, requestedWeight, requestedStyle);
            return o7h.l1(linkedHashSet);
        }

        public final List<Fonts.Font> findMatches$kotlin_release(Map<String, Fonts.Family> fontFamilies, Fonts.FontOpts opts) {
            String familyName = opts.getFamilyName();
            String lang = opts.getLang();
            return processMatchingFamilies(new sgg1(FontHelper$Companion$findMatches$matchingFamiliesSequence$2.INSTANCE, z561.T(new FontHelper$Companion$findMatches$matchingFamiliesSequence$1(familyName, lang), new i46(fontFamilies.entrySet(), (byte) 1))), opts.getLang(), opts.getWeight(), opts.getStyle());
        }

        public final Fonts.Font getFallbackFont(Fonts.FontOpts opts) {
            if (opts == null) {
                opts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return (Fonts.Font) o7h.s0(getFallbackFonts(opts));
        }

        public final byte[] getFallbackFontBytes(Fonts.FontOpts opts) {
            if (opts == null) {
                opts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            Fonts.Font fallbackFont = getFallbackFont(opts);
            if (fallbackFont != null) {
                return FontHelper.INSTANCE.getFontBytes(fallbackFont);
            }
            return null;
        }

        public final List<Fonts.Font> getFallbackFonts(Fonts.FontOpts opts) {
            List<Fonts.Family> systemFontList = getSystemFontList();
            if (!systemFontList.isEmpty()) {
                return findMatches$kotlin_release(systemFontList, opts);
            }
            RiveLog.INSTANCE.getLogger().e(FontHelper.TAG, null, FontHelper$Companion$getFallbackFonts$1.INSTANCE);
            return z6x.a;
        }

        public final byte[] getFontBytes(Fonts.Font font) {
            File fontFile = getFontFile(font);
            if (fontFile != null) {
                return y520.G(fontFile);
            }
            return null;
        }

        public final File getFontFile(Fonts.Font font) {
            Object objInvoke;
            List<String> sYSTEM_FONTS_PATHS$kotlin_release = SystemFontsParser.INSTANCE.getSYSTEM_FONTS_PATHS$kotlin_release();
            FontHelper$Companion$getFontFile$1 fontHelper$Companion$getFontFile$1 = new FontHelper$Companion$getFontFile$1(font);
            Iterator<T> it = sYSTEM_FONTS_PATHS$kotlin_release.iterator();
            while (it.hasNext()) {
                objInvoke = fontHelper$Companion$getFontFile$1.invoke(it.next());
                if (((File) objInvoke).exists()) {
                    return (File) objInvoke;
                }
            }
            objInvoke = null;
            return (File) objInvoke;
        }

        public final List<Fonts.Family> getSystemFontList() {
            List<Fonts.Family> listLoadFontList$kotlin_release;
            List<Fonts.Family> list = (List) FontHelper.familiesListCache.get();
            if (list != null) {
                return list;
            }
            synchronized (this) {
                listLoadFontList$kotlin_release = (List) FontHelper.familiesListCache.get();
                if (listLoadFontList$kotlin_release == null) {
                    listLoadFontList$kotlin_release = FontHelper.INSTANCE.loadFontList$kotlin_release();
                }
            }
            return listLoadFontList$kotlin_release;
        }

        @adt
        public final Map<String, Fonts.Family> getSystemFonts() {
            Map<String, Fonts.Family> mapLoadFonts$kotlin_release;
            Map<String, Fonts.Family> map = (Map) FontHelper.familiesMapCache.get();
            if (map != null) {
                return map;
            }
            synchronized (this) {
                mapLoadFonts$kotlin_release = (Map) FontHelper.familiesMapCache.get();
                if (mapLoadFonts$kotlin_release == null) {
                    mapLoadFonts$kotlin_release = FontHelper.INSTANCE.loadFonts$kotlin_release();
                }
            }
            return mapLoadFonts$kotlin_release;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0061  */
        public final List<Fonts.Family> loadFontList$kotlin_release() throws IOException {
            Object objInvoke;
            List<Fonts.Family> fontsXML$kotlin_release;
            n561 n561VarI = f46.I(new String[]{SystemFontsParser.FONTS_XML_PATH, SystemFontsParser.SYSTEM_FONTS_XML_PATH, SystemFontsParser.FALLBACK_FONTS_XML_PATH});
            FontHelper$Companion$loadFontList$validPath$1 fontHelper$Companion$loadFontList$validPath$1 = FontHelper$Companion$loadFontList$validPath$1.INSTANCE;
            Iterator it = n561VarI.iterator();
            do {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = fontHelper$Companion$loadFontList$validPath$1.invoke(it.next());
            } while (!((File) objInvoke).exists());
            File file = (File) objInvoke;
            List<Fonts.Family> list = z6x.a;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fontsXML$kotlin_release = SystemFontsParser.INSTANCE.parseFontsXML$kotlin_release(fileInputStream);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(fileInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception e) {
                    RiveLog.INSTANCE.getLogger().e(FontHelper.TAG, null, new FontHelper$Companion$loadFontList$loadedFonts$1$1(e));
                    fontsXML$kotlin_release = list;
                }
                fileInputStream.close();
                if (fontsXML$kotlin_release != null) {
                    list = fontsXML$kotlin_release;
                } else {
                    RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, FontHelper$Companion$loadFontList$loadedFonts$2$1.INSTANCE);
                }
            } else {
                RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, FontHelper$Companion$loadFontList$loadedFonts$2$1.INSTANCE);
            }
            List<Fonts.Family> listFilterNonExistingFonts = filterNonExistingFonts(list);
            FontHelper.familiesListCache.set(listFilterNonExistingFonts);
            return listFilterNonExistingFonts;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0061  */
        public final Map<String, Fonts.Family> loadFonts$kotlin_release() throws IOException {
            Object objInvoke;
            Map<String, Fonts.Family> fontsXMLMap$kotlin_release;
            n561 n561VarI = f46.I(new String[]{SystemFontsParser.FONTS_XML_PATH, SystemFontsParser.SYSTEM_FONTS_XML_PATH, SystemFontsParser.FALLBACK_FONTS_XML_PATH});
            FontHelper$Companion$loadFonts$validPath$1 fontHelper$Companion$loadFonts$validPath$1 = FontHelper$Companion$loadFonts$validPath$1.INSTANCE;
            Iterator it = n561VarI.iterator();
            do {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = fontHelper$Companion$loadFonts$validPath$1.invoke(it.next());
            } while (!((File) objInvoke).exists());
            File file = (File) objInvoke;
            Map<String, Fonts.Family> map = b7x.a;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fontsXMLMap$kotlin_release = SystemFontsParser.INSTANCE.parseFontsXMLMap$kotlin_release(fileInputStream);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(fileInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception e) {
                    RiveLog.INSTANCE.getLogger().e(FontHelper.TAG, null, new FontHelper$Companion$loadFonts$loadedFonts$1$1(e));
                    fontsXMLMap$kotlin_release = map;
                }
                fileInputStream.close();
                if (fontsXMLMap$kotlin_release != null) {
                    map = fontsXMLMap$kotlin_release;
                } else {
                    RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, FontHelper$Companion$loadFonts$loadedFonts$2$1.INSTANCE);
                }
            } else {
                RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, FontHelper$Companion$loadFonts$loadedFonts$2$1.INSTANCE);
            }
            Map<String, Fonts.Family> mapFilterNonExistingFonts = filterNonExistingFonts(map);
            FontHelper.familiesMapCache.set(mapFilterNonExistingFonts);
            return mapFilterNonExistingFonts;
        }

        public final void resetForTesting() {
            FontHelper.familiesMapCache.set(null);
            FontHelper.familiesListCache.set(null);
        }

        private Companion() {
        }

        public static /* synthetic */ List findMatches$kotlin_release$default(Companion companion, List list, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 2) != 0) {
                fontOpts = Fonts.FontOpts.INSTANCE.getDEFAULT();
            }
            return companion.findMatches$kotlin_release((List<Fonts.Family>) list, fontOpts);
        }

        public final List<Fonts.Font> findMatches$kotlin_release(List<Fonts.Family> fontFamiliesList, Fonts.FontOpts opts) {
            String familyName = opts.getFamilyName();
            String lang = opts.getLang();
            return processMatchingFamilies(z561.T(new FontHelper$Companion$findMatches$matchingFamiliesSequence$3(familyName, lang), new i46(fontFamiliesList, (byte) 1)), opts.getLang(), opts.getWeight(), opts.getStyle());
        }

        private final Map<String, Fonts.Family> filterNonExistingFonts(Map<String, Fonts.Family> fontFamilies) {
            String name;
            if (fontFamilies.isEmpty()) {
                return fontFamilies;
            }
            List<Fonts.Family> listFilterNonExistingFonts = filterNonExistingFonts(o7h.l1(fontFamilies.values()));
            int iS = zno1.s(q7h.U(listFilterNonExistingFonts, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj : listFilterNonExistingFonts) {
                Fonts.Family family = (Fonts.Family) obj;
                String name2 = family.getName();
                if (name2 != null && name2.length() != 0) {
                    name = family.getName();
                } else {
                    name = ((Fonts.Font) o7h.q0(q7h.V(family.getFonts().values()))).getName();
                }
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }
    }
}
