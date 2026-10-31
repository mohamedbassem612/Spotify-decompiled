package com.spotify.stream_reporting_attribution.proto;

import com.google.protobuf.h;
import p.bec1;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class StreamReportingAttributionOuterClass$StreamReportingAttribution extends h implements v2j0 {
    private static final StreamReportingAttributionOuterClass$StreamReportingAttribution DEFAULT_INSTANCE;
    public static final int LEAF_SPECIFICATION_ID_FIELD_NUMBER = 4;
    public static final int PAGE_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROVENANCE_FIELD_NUMBER = 1;
    public static final int ROOT_SPECIFICATION_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private String provenance_ = "";
    private String pageId_ = "";
    private String rootSpecificationId_ = "";
    private String leafSpecificationId_ = "";

    static {
        StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttribution = new StreamReportingAttributionOuterClass$StreamReportingAttribution();
        DEFAULT_INSTANCE = streamReportingAttributionOuterClass$StreamReportingAttribution;
        h.registerDefaultInstance(StreamReportingAttributionOuterClass$StreamReportingAttribution.class, streamReportingAttributionOuterClass$StreamReportingAttribution);
    }

    private StreamReportingAttributionOuterClass$StreamReportingAttribution() {
    }

    public static bec1 n() {
        return (bec1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "provenance_", "pageId_", "rootSpecificationId_", "leafSpecificationId_"});
        }
        if (iOrdinal == 3) {
            return new StreamReportingAttributionOuterClass$StreamReportingAttribution();
        }
        if (iOrdinal == 4) {
            return new bec1(DEFAULT_INSTANCE);
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
        synchronized (StreamReportingAttributionOuterClass$StreamReportingAttribution.class) {
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
        this.bitField0_ |= 8;
        this.leafSpecificationId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.pageId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.provenance_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 4;
        this.rootSpecificationId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
