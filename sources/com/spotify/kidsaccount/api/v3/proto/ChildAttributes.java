package com.spotify.kidsaccount.api.v3.proto;

import com.google.protobuf.h;
import p.b0g;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ChildAttributes extends h implements v2j0 {
    public static final int ALLOW_CHILD_VIDEO_FIELD_NUMBER = 2;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 1;
    private static final ChildAttributes DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private boolean allowChildVideo_;
    private boolean allowExplicitContent_;

    static {
        ChildAttributes childAttributes = new ChildAttributes();
        DEFAULT_INSTANCE = childAttributes;
        h.registerDefaultInstance(ChildAttributes.class, childAttributes);
    }

    private ChildAttributes() {
    }

    public static b0g n() {
        return (b0g) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"allowExplicitContent_", "allowChildVideo_"});
        }
        if (iOrdinal == 3) {
            return new ChildAttributes();
        }
        if (iOrdinal == 4) {
            return new b0g(DEFAULT_INSTANCE);
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
        synchronized (ChildAttributes.class) {
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
        this.allowChildVideo_ = z;
    }

    public final void p(boolean z) {
        this.allowExplicitContent_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
