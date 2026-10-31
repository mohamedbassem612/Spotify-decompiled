package com.spotify.playlistediting.history.apiimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.l1k0;
import p.ljj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class MixingEnablementChanged extends h implements v2j0 {
    private static final MixingEnablementChanged DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    static {
        MixingEnablementChanged mixingEnablementChanged = new MixingEnablementChanged();
        DEFAULT_INSTANCE = mixingEnablementChanged;
        h.registerDefaultInstance(MixingEnablementChanged.class, mixingEnablementChanged);
    }

    private MixingEnablementChanged() {
    }

    public static MixingEnablementChanged n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "type_"});
        }
        if (iOrdinal == 3) {
            return new MixingEnablementChanged();
        }
        if (iOrdinal == 4) {
            return new ljj0(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (MixingEnablementChanged.class) {
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

    public final l1k0 o() {
        l1k0 l1k0Var;
        int i = this.type_;
        if (i == 0) {
            l1k0Var = l1k0.MIXING_ENABLEMENT_CHANGE_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            l1k0Var = i != 2 ? null : l1k0.MIXING_ENABLEMENT_CHANGE_TYPE_DISABLED;
        } else {
            l1k0Var = l1k0.MIXING_ENABLEMENT_CHANGE_TYPE_ENABLED;
        }
        return l1k0Var == null ? l1k0.UNRECOGNIZED : l1k0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
