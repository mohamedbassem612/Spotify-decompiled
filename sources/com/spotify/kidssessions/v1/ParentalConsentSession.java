package com.spotify.kidssessions.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.ci61;
import p.gtq0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ParentalConsentSession extends h implements v2j0 {
    public static final int CHILD_ID_FIELD_NUMBER = 5;
    public static final int CREATED_AT_FIELD_NUMBER = 2;
    private static final ParentalConsentSession DEFAULT_INSTANCE;
    public static final int HAS_TRANSITIONING_MA_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 6;
    public static final int VALID_UNTIL_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp createdAt_;
    private boolean hasTransitioningMa_;
    private int status_;
    private Timestamp validUntil_;
    private String sessionId_ = "";
    private String spotifyId_ = "";
    private String childId_ = "";

    static {
        ParentalConsentSession parentalConsentSession = new ParentalConsentSession();
        DEFAULT_INSTANCE = parentalConsentSession;
        h.registerDefaultInstance(ParentalConsentSession.class, parentalConsentSession);
    }

    private ParentalConsentSession() {
    }

    public static ParentalConsentSession n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005Ȉ\u0006\f\u0007\u0007", new Object[]{"bitField0_", "sessionId_", "createdAt_", "validUntil_", "spotifyId_", "childId_", "status_", "hasTransitioningMa_"});
        }
        if (iOrdinal == 3) {
            return new ParentalConsentSession();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (ParentalConsentSession.class) {
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

    public final String getChildId() {
        return this.childId_;
    }

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.hasTransitioningMa_;
    }

    public final String p() {
        return this.spotifyId_;
    }

    public final ci61 q() {
        ci61 ci61Var;
        int i = this.status_;
        if (i == 0) {
            ci61Var = ci61.SESSION_STATUS_UNSPECIFIED;
        } else if (i == 1) {
            ci61Var = ci61.SESSION_STATUS_PENDING;
        } else if (i == 2) {
            ci61Var = ci61.SESSION_STATUS_COMPLETE;
        } else if (i != 3) {
            ci61Var = i != 4 ? null : ci61.SESSION_STATUS_REDEEMED;
        } else {
            ci61Var = ci61.SESSION_STATUS_TERMINATED;
        }
        return ci61Var == null ? ci61.UNRECOGNIZED : ci61Var;
    }

    public final Timestamp r() {
        Timestamp timestamp = this.validUntil_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
