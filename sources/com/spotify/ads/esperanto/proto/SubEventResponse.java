package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vkc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SubEventResponse extends h implements v2j0 {
    public static final int ADEVENT_FIELD_NUMBER = 2;
    private static final SubEventResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private AdEvent adEvent_;
    private int bitField0_;
    private int status_;

    static {
        SubEventResponse subEventResponse = new SubEventResponse();
        DEFAULT_INSTANCE = subEventResponse;
        h.registerDefaultInstance(SubEventResponse.class, subEventResponse);
    }

    private SubEventResponse() {
    }

    public static SubEventResponse p(byte[] bArr) {
        return (SubEventResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "status_", "adEvent_"});
        }
        if (iOrdinal == 3) {
            return new SubEventResponse();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (SubEventResponse.class) {
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

    public final AdEvent n() {
        AdEvent adEvent = this.adEvent_;
        return adEvent == null ? AdEvent.o() : adEvent;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final vkc1 o() {
        vkc1 vkc1Var;
        int i = this.status_;
        if (i == 0) {
            vkc1Var = vkc1.OK;
        } else if (i != 1) {
            vkc1Var = i != 2 ? null : vkc1.INVALID_FORMAT;
        } else {
            vkc1Var = vkc1.INVALID_SLOT;
        }
        return vkc1Var == null ? vkc1.UNRECOGNIZED : vkc1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
