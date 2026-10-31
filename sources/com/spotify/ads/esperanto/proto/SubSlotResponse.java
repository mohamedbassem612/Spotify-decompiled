package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class SubSlotResponse extends h implements v2j0 {
    public static final int AD_SLOT_EVENT_FIELD_NUMBER = 1;
    private static final SubSlotResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private AdSlotEvent adSlotEvent_;
    private int bitField0_;

    static {
        SubSlotResponse subSlotResponse = new SubSlotResponse();
        DEFAULT_INSTANCE = subSlotResponse;
        h.registerDefaultInstance(SubSlotResponse.class, subSlotResponse);
    }

    private SubSlotResponse() {
    }

    public static SubSlotResponse o(byte[] bArr) {
        return (SubSlotResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "adSlotEvent_"});
        }
        if (iOrdinal == 3) {
            return new SubSlotResponse();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (SubSlotResponse.class) {
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

    public final AdSlotEvent n() {
        AdSlotEvent adSlotEvent = this.adSlotEvent_;
        return adSlotEvent == null ? AdSlotEvent.o() : adSlotEvent;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
