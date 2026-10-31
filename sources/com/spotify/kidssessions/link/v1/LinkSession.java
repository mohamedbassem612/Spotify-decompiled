package com.spotify.kidssessions.link.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.ghc0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ukc0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class LinkSession extends h implements v2j0 {
    private static final LinkSession DEFAULT_INSTANCE;
    public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int VALID_UNTIL_FIELD_NUMBER = 2;
    private int bitField0_;
    private String linkSessionId_ = "";
    private int status_;
    private Timestamp validUntil_;

    static {
        LinkSession linkSession = new LinkSession();
        DEFAULT_INSTANCE = linkSession;
        h.registerDefaultInstance(LinkSession.class, linkSession);
    }

    private LinkSession() {
    }

    public static LinkSession n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\f", new Object[]{"bitField0_", "linkSessionId_", "validUntil_", "status_"});
        }
        if (iOrdinal == 3) {
            return new LinkSession();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (LinkSession.class) {
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

    public final String o() {
        return this.linkSessionId_;
    }

    public final ukc0 p() {
        ukc0 ukc0Var;
        switch (this.status_) {
            case 0:
                ukc0Var = ukc0.LINK_SESSION_STATUS_UNSPECIFIED;
                break;
            case 1:
                ukc0Var = ukc0.LINK_SESSION_STATUS_AWAITING_DEPENDENT;
                break;
            case 2:
                ukc0Var = ukc0.LINK_SESSION_STATUS_AWAITING_PARENT;
                break;
            case 3:
                ukc0Var = ukc0.LINK_SESSION_STATUS_AWAITING_COMPLETION;
                break;
            case 4:
                ukc0Var = ukc0.LINK_SESSION_STATUS_COMPLETE;
                break;
            case 5:
                ukc0Var = ukc0.LINK_SESSION_STATUS_REDEEMED;
                break;
            case 6:
                ukc0Var = ukc0.LINK_SESSION_STATUS_TERMINATED;
                break;
            default:
                ukc0Var = null;
                break;
        }
        return ukc0Var == null ? ukc0.UNRECOGNIZED : ukc0Var;
    }

    public final Timestamp q() {
        Timestamp timestamp = this.validUntil_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
