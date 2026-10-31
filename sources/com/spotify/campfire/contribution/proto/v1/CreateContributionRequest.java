package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.dvm;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ujn;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CreateContributionRequest extends h implements v2j0 {
    private static final CreateContributionRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int TARGET_FIELD_NUMBER = 1;
    private int bitField0_;
    private ContributionPayload payload_;
    private int source_;
    private ContributionTarget target_;

    static {
        CreateContributionRequest createContributionRequest = new CreateContributionRequest();
        DEFAULT_INSTANCE = createContributionRequest;
        h.registerDefaultInstance(CreateContributionRequest.class, createContributionRequest);
    }

    private CreateContributionRequest() {
    }

    public static ujn n() {
        return (ujn) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "target_", "payload_", "source_"});
        }
        if (iOrdinal == 3) {
            return new CreateContributionRequest();
        }
        if (iOrdinal == 4) {
            return new ujn(DEFAULT_INSTANCE);
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
        synchronized (CreateContributionRequest.class) {
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

    public final void o(ContributionPayload contributionPayload) {
        this.payload_ = contributionPayload;
        this.bitField0_ |= 2;
    }

    public final void p(dvm dvmVar) {
        this.source_ = dvmVar.getNumber();
    }

    public final void q(ContributionTarget contributionTarget) {
        this.target_ = contributionTarget;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
