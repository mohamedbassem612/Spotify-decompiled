package com.spotify.playlist.policy.proto;

import com.google.protobuf.h;
import p.bf40;
import p.clc0;
import p.fj90;
import p.hz00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ItemExtensionPolicy extends h implements v2j0 {
    private static final ItemExtensionPolicy DEFAULT_INSTANCE;
    public static final int EXTENSION_FIELD_NUMBER = 2;
    public static final int LINK_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int extension_;
    private int linkType_;

    static {
        ItemExtensionPolicy itemExtensionPolicy = new ItemExtensionPolicy();
        DEFAULT_INSTANCE = itemExtensionPolicy;
        h.registerDefaultInstance(ItemExtensionPolicy.class, itemExtensionPolicy);
    }

    private ItemExtensionPolicy() {
    }

    public static fj90 n() {
        return (fj90) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"linkType_", "extension_"});
        }
        if (iOrdinal == 3) {
            return new ItemExtensionPolicy();
        }
        if (iOrdinal == 4) {
            return new fj90(DEFAULT_INSTANCE);
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
        synchronized (ItemExtensionPolicy.class) {
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

    public final void o(hz00 hz00Var) {
        this.extension_ = hz00Var.getNumber();
    }

    public final void p(int i) {
        this.extension_ = i;
    }

    public final void q(clc0 clc0Var) {
        this.linkType_ = clc0Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
