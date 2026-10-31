package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.fkl;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ConsumerShareRequest extends com.google.protobuf.h implements v2j0 {
    private static final ConsumerShareRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROPOSED_TRACK_URI_FIELD_NUMBER = 4;
    public static final int SCHEME_FIELD_NUMBER = 2;
    public static final int SHARE_CARD_ID_FIELD_NUMBER = 1;
    public static final int STORY_PARAMETERS_FIELD_NUMBER = 3;
    private int bitField0_;
    private ConsumerShareRequestParameters storyParameters_;
    private String shareCardId_ = "";
    private String scheme_ = "";
    private String proposedTrackUri_ = "";

    static {
        ConsumerShareRequest consumerShareRequest = new ConsumerShareRequest();
        DEFAULT_INSTANCE = consumerShareRequest;
        com.google.protobuf.h.registerDefaultInstance(ConsumerShareRequest.class, consumerShareRequest);
    }

    private ConsumerShareRequest() {
    }

    public static fkl n() {
        return (fkl) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "shareCardId_", "scheme_", "storyParameters_", "proposedTrackUri_"});
        }
        if (iOrdinal == 3) {
            return new ConsumerShareRequest();
        }
        if (iOrdinal == 4) {
            return new fkl(DEFAULT_INSTANCE);
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
        synchronized (ConsumerShareRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.proposedTrackUri_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.scheme_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.shareCardId_ = str;
    }

    public final void r(ConsumerShareRequestParameters consumerShareRequestParameters) {
        consumerShareRequestParameters.getClass();
        this.storyParameters_ = consumerShareRequestParameters;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
