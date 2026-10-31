package com.spotify.crashreporting.processstatesummary.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xrw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ProcessStateSummaryEnvelope extends h implements v2j0 {
    public static final int CORE_THREAD_STALL_LEVEL_FIELD_NUMBER = 5;
    private static final ProcessStateSummaryEnvelope DEFAULT_INSTANCE;
    public static final int DIAGNOSTIC_SESSION_ID_FIELD_NUMBER = 1;
    public static final int INTERACTION_ID_FIELD_NUMBER = 3;
    public static final int MAIN_THREAD_STALL_LEVEL_FIELD_NUMBER = 4;
    public static final int MEMORY_HEADROOM_LEVEL_FIELD_NUMBER = 6;
    public static final int OWN_CPU_LEVEL_FIELD_NUMBER = 7;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int coreThreadStallLevel_;
    private int mainThreadStallLevel_;
    private int memoryHeadroomLevel_;
    private int ownCpuLevel_;
    private phc diagnosticSessionId_ = phc.b;
    private String pageInstanceId_ = "";
    private String interactionId_ = "";

    static {
        ProcessStateSummaryEnvelope processStateSummaryEnvelope = new ProcessStateSummaryEnvelope();
        DEFAULT_INSTANCE = processStateSummaryEnvelope;
        h.registerDefaultInstance(ProcessStateSummaryEnvelope.class, processStateSummaryEnvelope);
    }

    private ProcessStateSummaryEnvelope() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static xrw0 u() {
        return (xrw0) DEFAULT_INSTANCE.createBuilder();
    }

    public static ProcessStateSummaryEnvelope v(byte[] bArr) {
        return (ProcessStateSummaryEnvelope) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final void A(int i) {
        this.memoryHeadroomLevel_ = i;
    }

    public final void B(int i) {
        this.ownCpuLevel_ = i;
    }

    public final void C(String str) {
        str.getClass();
        this.pageInstanceId_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b", new Object[]{"diagnosticSessionId_", "pageInstanceId_", "interactionId_", "mainThreadStallLevel_", "coreThreadStallLevel_", "memoryHeadroomLevel_", "ownCpuLevel_"});
        }
        if (iOrdinal == 3) {
            return new ProcessStateSummaryEnvelope();
        }
        if (iOrdinal == 4) {
            return new xrw0(DEFAULT_INSTANCE);
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
        synchronized (ProcessStateSummaryEnvelope.class) {
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

    public final int n() {
        return this.coreThreadStallLevel_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final phc o() {
        return this.diagnosticSessionId_;
    }

    public final String p() {
        return this.interactionId_;
    }

    public final int q() {
        return this.mainThreadStallLevel_;
    }

    public final int r() {
        return this.memoryHeadroomLevel_;
    }

    public final int s() {
        return this.ownCpuLevel_;
    }

    public final String t() {
        return this.pageInstanceId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void w(int i) {
        this.coreThreadStallLevel_ = i;
    }

    public final void x(hhc hhcVar) {
        this.diagnosticSessionId_ = hhcVar;
    }

    public final void y(String str) {
        str.getClass();
        this.interactionId_ = str;
    }

    public final void z(int i) {
        this.mainThreadStallLevel_ = i;
    }
}
