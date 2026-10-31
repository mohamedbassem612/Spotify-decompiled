package com.spotify.karaoke.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.coa0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tm90;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class KaraokeSubEventsResponse extends h implements v2j0 {
    private static final KaraokeSubEventsResponse DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 4;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private int errorCode_;
    private int id_;
    private String trackUri_ = "";
    private String errorMessage_ = "";

    static {
        KaraokeSubEventsResponse karaokeSubEventsResponse = new KaraokeSubEventsResponse();
        DEFAULT_INSTANCE = karaokeSubEventsResponse;
        h.registerDefaultInstance(KaraokeSubEventsResponse.class, karaokeSubEventsResponse);
    }

    private KaraokeSubEventsResponse() {
    }

    public static KaraokeSubEventsResponse p(byte[] bArr) {
        return (KaraokeSubEventsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"id_", "trackUri_", "errorMessage_", "errorCode_"});
        }
        if (iOrdinal == 3) {
            return new KaraokeSubEventsResponse();
        }
        if (iOrdinal == 4) {
            return new tm90(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (KaraokeSubEventsResponse.class) {
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

    public final String n() {
        return this.errorMessage_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final coa0 o() {
        coa0 coa0Var;
        int i = this.id_;
        if (i != 0) {
            coa0Var = i != 1 ? null : coa0.ERROR;
        } else {
            coa0Var = coa0.MASK_READY;
        }
        return coa0Var == null ? coa0.UNRECOGNIZED : coa0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
