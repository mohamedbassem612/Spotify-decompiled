package spotify.playlist.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z2c0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class LensDefinition extends h implements v2j0 {
    public static final int ACTIVE_FIELD_NUMBER = 2;
    private static final LensDefinition DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REMOVE_BY_PREFIX_FIELD_NUMBER = 3;
    private boolean active_;
    private String identifier_ = "";
    private boolean removeByPrefix_;

    static {
        LensDefinition lensDefinition = new LensDefinition();
        DEFAULT_INSTANCE = lensDefinition;
        h.registerDefaultInstance(LensDefinition.class, lensDefinition);
    }

    private LensDefinition() {
    }

    public static z2c0 n() {
        return (z2c0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"identifier_", "active_", "removeByPrefix_"});
        }
        if (iOrdinal == 3) {
            return new LensDefinition();
        }
        if (iOrdinal == 4) {
            return new z2c0(DEFAULT_INSTANCE);
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
        synchronized (LensDefinition.class) {
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

    public final void o(boolean z) {
        this.active_ = z;
    }

    public final void p(String str) {
        str.getClass();
        this.identifier_ = str;
    }

    public final void q(boolean z) {
        this.removeByPrefix_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
