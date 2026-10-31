package com.spotify.musicquizservice.v1;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class GetShareCardForQuizResponse extends com.google.protobuf.h implements v2j0 {
    public static final int CARD_METADATA_FIELD_NUMBER = 1;
    public static final int COMPLETION_ID_FIELD_NUMBER = 4;
    private static final GetShareCardForQuizResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHARE_TARGET_FIELD_NUMBER = 2;
    public static final int SHARE_TEXT_FIELD_NUMBER = 3;
    private int bitField0_;
    private CardMetadata cardMetadata_;
    private ShareTarget shareTarget_;
    private String shareText_ = "";
    private String completionId_ = "";

    static {
        GetShareCardForQuizResponse getShareCardForQuizResponse = new GetShareCardForQuizResponse();
        DEFAULT_INSTANCE = getShareCardForQuizResponse;
        com.google.protobuf.h.registerDefaultInstance(GetShareCardForQuizResponse.class, getShareCardForQuizResponse);
    }

    private GetShareCardForQuizResponse() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "cardMetadata_", "shareTarget_", "shareText_", "completionId_"});
        }
        if (iOrdinal == 3) {
            return new GetShareCardForQuizResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (GetShareCardForQuizResponse.class) {
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
        return this.completionId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShareTarget o() {
        ShareTarget shareTarget = this.shareTarget_;
        return shareTarget == null ? ShareTarget.o() : shareTarget;
    }

    public final String p() {
        return this.shareText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
