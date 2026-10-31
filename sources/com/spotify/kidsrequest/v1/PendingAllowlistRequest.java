package com.spotify.kidsrequest.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PendingAllowlistRequest extends h implements v2j0 {
    public static final int AUDIOBOOK_FIELD_NUMBER = 3;
    public static final int CREATED_AT_FIELD_NUMBER = 4;
    private static final PendingAllowlistRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int TRACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp createdAt_;
    private Object data_;
    private int dataCase_ = 0;
    private String requestId_ = "";

    static {
        PendingAllowlistRequest pendingAllowlistRequest = new PendingAllowlistRequest();
        DEFAULT_INSTANCE = pendingAllowlistRequest;
        h.registerDefaultInstance(PendingAllowlistRequest.class, pendingAllowlistRequest);
    }

    private PendingAllowlistRequest() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004ဉ\u0000", new Object[]{"data_", "dataCase_", "bitField0_", "requestId_", TrackAllowlistRequestData.class, AudiobookAllowlistRequestData.class, "createdAt_"});
        }
        if (iOrdinal == 3) {
            return new PendingAllowlistRequest();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (PendingAllowlistRequest.class) {
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

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final AudiobookAllowlistRequestData n() {
        return this.dataCase_ == 3 ? (AudiobookAllowlistRequestData) this.data_ : AudiobookAllowlistRequestData.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.dataCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final String p() {
        return this.requestId_;
    }

    public final TrackAllowlistRequestData q() {
        return this.dataCase_ == 2 ? (TrackAllowlistRequestData) this.data_ : TrackAllowlistRequestData.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
