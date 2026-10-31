package com.spotify.show_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zsg0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class MarkShowAsPlayedResponse extends h implements v2j0 {
    private static final MarkShowAsPlayedResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Status status_;

    static {
        MarkShowAsPlayedResponse markShowAsPlayedResponse = new MarkShowAsPlayedResponse();
        DEFAULT_INSTANCE = markShowAsPlayedResponse;
        h.registerDefaultInstance(MarkShowAsPlayedResponse.class, markShowAsPlayedResponse);
    }

    private MarkShowAsPlayedResponse() {
    }

    public static zsg0 o() {
        return (zsg0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MarkShowAsPlayedResponse p(byte[] bArr) {
        return (MarkShowAsPlayedResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "status_"});
        }
        if (iOrdinal == 3) {
            return new MarkShowAsPlayedResponse();
        }
        if (iOrdinal == 4) {
            return new zsg0(DEFAULT_INSTANCE);
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
        synchronized (MarkShowAsPlayedResponse.class) {
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

    public final Status n() {
        Status status = this.status_;
        return status == null ? Status.o() : status;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q(Status status) {
        status.getClass();
        this.status_ = status;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
