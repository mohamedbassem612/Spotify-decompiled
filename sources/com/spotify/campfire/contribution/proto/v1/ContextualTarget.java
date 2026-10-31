package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jnm;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ContextualTarget extends h implements v2j0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 1;
    private static final ContextualTarget DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 3;
    public static final int ITEM_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String contextUri_ = "";
    private String itemUri_ = "";
    private String itemId_ = "";

    static {
        ContextualTarget contextualTarget = new ContextualTarget();
        DEFAULT_INSTANCE = contextualTarget;
        h.registerDefaultInstance(ContextualTarget.class, contextualTarget);
    }

    private ContextualTarget() {
    }

    public static ContextualTarget o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static jnm s() {
        return (jnm) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "contextUri_", "itemUri_", "itemId_"});
        }
        if (iOrdinal == 3) {
            return new ContextualTarget();
        }
        if (iOrdinal == 4) {
            return new jnm(DEFAULT_INSTANCE);
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
        synchronized (ContextualTarget.class) {
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

    public final boolean hasItemId() {
        return (this.bitField0_ & 2) != 0;
    }

    public final String n() {
        return this.contextUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.itemId_;
    }

    public final String q() {
        return this.itemUri_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void t(String str) {
        str.getClass();
        this.contextUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.itemId_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.itemUri_ = str;
    }
}
