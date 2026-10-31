package spotify.your_library_tags_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.par;
import p.qar;
import p.qzr0;
import p.r2j0;
import p.s2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class DecoratedTag extends h implements qar {
    private static final DecoratedTag DEFAULT_INSTANCE;
    public static final int ENTITY_COUNT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TAG_NAME_FIELD_NUMBER = 3;
    public static final int TAG_URI_FIELD_NUMBER = 1;
    private int entityCount_;
    private String tagUri_ = "";
    private String tagName_ = "";

    static {
        DecoratedTag decoratedTag = new DecoratedTag();
        DEFAULT_INSTANCE = decoratedTag;
        h.registerDefaultInstance(DecoratedTag.class, decoratedTag);
    }

    private DecoratedTag() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // p.qar
    public final int a() {
        return this.entityCount_;
    }

    @Override // p.qar
    public final String b() {
        return this.tagUri_;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"tagUri_", "tagName_", "entityCount_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedTag();
        }
        if (iOrdinal == 4) {
            return new par(DEFAULT_INSTANCE);
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
        synchronized (DecoratedTag.class) {
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

    @Override // p.qar
    public final String getTagName() {
        return this.tagName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
