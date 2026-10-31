package spotify.list.v1.model.attributes;

import com.google.protobuf.h;
import p.bf40;
import p.epd1;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class TagsOuterClass$TagManifest extends h implements v2j0 {
    private static final TagsOuterClass$TagManifest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TAGS_FIELD_NUMBER = 1;
    private h290 tags_ = h.emptyProtobufList();

    static {
        TagsOuterClass$TagManifest tagsOuterClass$TagManifest = new TagsOuterClass$TagManifest();
        DEFAULT_INSTANCE = tagsOuterClass$TagManifest;
        h.registerDefaultInstance(TagsOuterClass$TagManifest.class, tagsOuterClass$TagManifest);
    }

    private TagsOuterClass$TagManifest() {
    }

    public static TagsOuterClass$TagManifest n() {
        return DEFAULT_INSTANCE;
    }

    public static epd1 o(TagsOuterClass$TagManifest tagsOuterClass$TagManifest) {
        return (epd1) DEFAULT_INSTANCE.createBuilder(tagsOuterClass$TagManifest);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"tags_", TagsOuterClass.TagDefinition.class});
        }
        if (iOrdinal == 3) {
            return new TagsOuterClass$TagManifest();
        }
        if (iOrdinal == 4) {
            return new epd1(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (TagsOuterClass$TagManifest.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
