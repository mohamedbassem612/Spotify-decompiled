package com.spotify.show_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zq40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetUnfinishedEpisodesRequest extends h implements v2j0 {
    public static final int ABS_TIME_LEFT_TOLERANCE_FIELD_NUMBER = 6;
    private static final GetUnfinishedEpisodesRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int POLICY_FIELD_NUMBER = 9;
    public static final int PREFER_CACHED_FIELD_NUMBER = 8;
    public static final int RANGE_LENGTH_FIELD_NUMBER = 2;
    public static final int RANGE_START_FIELD_NUMBER = 1;
    public static final int REL_TIME_LEFT_TOLERANCE_FIELD_NUMBER = 7;
    public static final int SORT_FIELD_NUMBER = 3;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 5;
    private int absTimeLeftTolerance_;
    private int bitField0_;
    private ListPolicy policy_;
    private boolean preferCached_;
    private int rangeLength_;
    private int rangeStart_;
    private double relTimeLeftTolerance_;
    private int updateThrottling_;
    private String sort_ = "";
    private String filter_ = "";

    static {
        GetUnfinishedEpisodesRequest getUnfinishedEpisodesRequest = new GetUnfinishedEpisodesRequest();
        DEFAULT_INSTANCE = getUnfinishedEpisodesRequest;
        h.registerDefaultInstance(GetUnfinishedEpisodesRequest.class, getUnfinishedEpisodesRequest);
    }

    private GetUnfinishedEpisodesRequest() {
    }

    public static zq40 n() {
        return (zq40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002င\u0000\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u0000\b\u0007\tဉ\u0001", new Object[]{"bitField0_", "rangeStart_", "rangeLength_", "sort_", "filter_", "updateThrottling_", "absTimeLeftTolerance_", "relTimeLeftTolerance_", "preferCached_", "policy_"});
        }
        if (iOrdinal == 3) {
            return new GetUnfinishedEpisodesRequest();
        }
        if (iOrdinal == 4) {
            return new zq40(DEFAULT_INSTANCE);
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
        synchronized (GetUnfinishedEpisodesRequest.class) {
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

    public final void o(int i) {
        this.absTimeLeftTolerance_ = i;
    }

    public final void p(String str) {
        this.filter_ = str;
    }

    public final void q(ListPolicy listPolicy) {
        this.policy_ = listPolicy;
        this.bitField0_ |= 2;
    }

    public final void r(int i) {
        this.bitField0_ |= 1;
        this.rangeLength_ = i;
    }

    public final void s(int i) {
        this.rangeStart_ = i;
    }

    public final void t(double d) {
        this.relTimeLeftTolerance_ = d;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.sort_ = str;
    }

    public final void v() {
        this.updateThrottling_ = 500;
    }
}
