package com.spotify.identity.proto.v3;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tn70;
import p.v2j0;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class Identity$SocialHandleResponse extends h implements v2j0 {
    private static final Identity$SocialHandleResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    public static final int VALID_FIELD_NUMBER = 1;
    private int reason_;
    private boolean valid_;

    static {
        Identity$SocialHandleResponse identity$SocialHandleResponse = new Identity$SocialHandleResponse();
        DEFAULT_INSTANCE = identity$SocialHandleResponse;
        h.registerDefaultInstance(Identity$SocialHandleResponse.class, identity$SocialHandleResponse);
    }

    private Identity$SocialHandleResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"valid_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new Identity$SocialHandleResponse();
        }
        if (iOrdinal == 4) {
            return new y070(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (Identity$SocialHandleResponse.class) {
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

    public final tn70 n() {
        tn70 tn70Var;
        switch (this.reason_) {
            case 0:
                tn70Var = tn70.UNSPECIFIED;
                break;
            case 1:
                tn70Var = tn70.INVALID_FORMAT;
                break;
            case 2:
                tn70Var = tn70.ALREADY_TAKEN;
                break;
            case 3:
                tn70Var = tn70.UPDATE_LIMITED;
                break;
            case 4:
                tn70Var = tn70.CONTAINS_BLOCKED_WORD;
                break;
            case 5:
                tn70Var = tn70.INVALID_LENGTH;
                break;
            case 6:
                tn70Var = tn70.INVALID_BOUNDARY_CHARACTER;
                break;
            default:
                tn70Var = null;
                break;
        }
        return tn70Var == null ? tn70.UNRECOGNIZED : tn70Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.valid_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
