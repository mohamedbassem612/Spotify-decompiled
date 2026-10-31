package com.spotify.voting.proto.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x461;
import p.z461;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SendVotesRequestV2 extends h implements v2j0 {
    public static final int AWARD_ID_FIELD_NUMBER = 2;
    public static final int CONTEST_ID_FIELD_NUMBER = 1;
    private static final SendVotesRequestV2 DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int VOTES_FIELD_NUMBER = 3;
    private qng0 votes_ = qng0.b;
    private String contestId_ = "";
    private String awardId_ = "";
    private String entrypointUri_ = "";

    static {
        SendVotesRequestV2 sendVotesRequestV2 = new SendVotesRequestV2();
        DEFAULT_INSTANCE = sendVotesRequestV2;
        h.registerDefaultInstance(SendVotesRequestV2.class, sendVotesRequestV2);
    }

    private SendVotesRequestV2() {
    }

    public static x461 o() {
        return (x461) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ", new Object[]{"contestId_", "awardId_", "votes_", z461.a, "entrypointUri_"});
        }
        if (iOrdinal == 3) {
            return new SendVotesRequestV2();
        }
        if (iOrdinal == 4) {
            return new x461(DEFAULT_INSTANCE);
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
        synchronized (SendVotesRequestV2.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.votes_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.votes_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.awardId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.contestId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.entrypointUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
