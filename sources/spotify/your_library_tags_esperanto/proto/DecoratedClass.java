package spotify.your_library_tags_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.g7r;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class DecoratedClass extends h implements v2j0 {
    public static final int CLASS_NAME_FIELD_NUMBER = 2;
    public static final int CLASS_URI_FIELD_NUMBER = 1;
    private static final DecoratedClass DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TAG_FIELD_NUMBER = 3;
    private String classUri_ = "";
    private String className_ = "";
    private h290 tag_ = h.emptyProtobufList();

    static {
        DecoratedClass decoratedClass = new DecoratedClass();
        DEFAULT_INSTANCE = decoratedClass;
        h.registerDefaultInstance(DecoratedClass.class, decoratedClass);
    }

    private DecoratedClass() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"classUri_", "className_", "tag_", DecoratedTag.class});
        }
        if (iOrdinal == 3) {
            return new DecoratedClass();
        }
        if (iOrdinal == 4) {
            return new g7r(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (DecoratedClass.class) {
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

    public final String n() {
        return this.className_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.tag_;
    }

    public final h290 p() {
        return this.tag_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
