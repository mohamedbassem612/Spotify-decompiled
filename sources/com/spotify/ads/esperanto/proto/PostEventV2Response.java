package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.r4v0;
import p.s2j0;
import p.ugv0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class PostEventV2Response extends h implements v2j0 {
    private static final PostEventV2Response DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        PostEventV2Response postEventV2Response = new PostEventV2Response();
        DEFAULT_INSTANCE = postEventV2Response;
        h.registerDefaultInstance(PostEventV2Response.class, postEventV2Response);
    }

    private PostEventV2Response() {
    }

    public static PostEventV2Response o(byte[] bArr) {
        return (PostEventV2Response) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new PostEventV2Response();
        }
        if (iOrdinal == 4) {
            return new r4v0(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (PostEventV2Response.class) {
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

    public final ugv0 n() {
        ugv0 ugv0Var;
        int i = this.status_;
        if (i == 0) {
            ugv0Var = ugv0.SUCCESS;
        } else if (i == 1) {
            ugv0Var = ugv0.FAIL;
        } else if (i == 2) {
            ugv0Var = ugv0.INVALID_SLOT;
        } else if (i != 3) {
            ugv0Var = i != 4 ? null : ugv0.INVALID_ELIGIBILITY_STATUS;
        } else {
            ugv0Var = ugv0.INVALID_DEMAND_STATUS;
        }
        return ugv0Var == null ? ugv0.UNRECOGNIZED : ugv0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
