package com.spotify.home.slotloading.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bn81;
import p.ff91;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class Slot extends h implements v2j0 {
    private static final Slot DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    static {
        Slot slot = new Slot();
        DEFAULT_INSTANCE = slot;
        h.registerDefaultInstance(Slot.class, slot);
    }

    private Slot() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
        }
        if (iOrdinal == 3) {
            return new Slot();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (Slot.class) {
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

    public final ff91 n() {
        ff91 ff91Var;
        int i = this.type_;
        if (i == 0) {
            ff91Var = ff91.SLOT_UNKNOWN;
        } else if (i == 1) {
            ff91Var = ff91.SHORTCUT;
        } else if (i != 2) {
            ff91Var = i != 3 ? null : ff91.FEED;
        } else {
            ff91Var = ff91.HERO;
        }
        return ff91Var == null ? ff91.UNRECOGNIZED : ff91Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
