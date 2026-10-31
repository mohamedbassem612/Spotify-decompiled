package com.spotify.aipartner.aipartnerapi.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h0u;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zot;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Device extends h implements v2j0 {
    private static final Device DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SOURCE_DEVICE_FIELD_NUMBER = 1;
    public static final int TARGET_DEVICE_FIELD_NUMBER = 2;
    private int sourceDevice_;
    private int targetDevice_;

    static {
        Device device = new Device();
        DEFAULT_INSTANCE = device;
        h.registerDefaultInstance(Device.class, device);
    }

    private Device() {
    }

    public static Device n() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static zot q() {
        return (zot) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"sourceDevice_", "targetDevice_"});
        }
        if (iOrdinal == 3) {
            return new Device();
        }
        if (iOrdinal == 4) {
            return new zot(DEFAULT_INSTANCE);
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
        synchronized (Device.class) {
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

    public final h0u o() {
        h0u h0uVarA = h0u.a(this.sourceDevice_);
        return h0uVarA == null ? h0u.Y : h0uVarA;
    }

    public final h0u p() {
        h0u h0uVarA = h0u.a(this.targetDevice_);
        return h0uVarA == null ? h0u.Y : h0uVarA;
    }

    public final void r(h0u h0uVar) {
        this.sourceDevice_ = h0uVar.getNumber();
    }

    public final void s(h0u h0uVar) {
        this.targetDevice_ = h0uVar.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
