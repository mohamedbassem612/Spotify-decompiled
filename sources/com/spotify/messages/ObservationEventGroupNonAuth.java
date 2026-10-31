package com.spotify.messages;

import com.google.protobuf.h;
import p.ahp0;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservationEventGroupNonAuth extends h implements v2j0 {
    private static final ObservationEventGroupNonAuth DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 3;
    public static final int EVENT_GROUP_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SEGMENT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String eventGroupId_ = "";
    private phc events_ = phc.b;
    private int segment_;

    static {
        ObservationEventGroupNonAuth observationEventGroupNonAuth = new ObservationEventGroupNonAuth();
        DEFAULT_INSTANCE = observationEventGroupNonAuth;
        h.registerDefaultInstance(ObservationEventGroupNonAuth.class, observationEventGroupNonAuth);
    }

    private ObservationEventGroupNonAuth() {
    }

    public static ahp0 o() {
        return (ahp0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"bitField0_", "eventGroupId_", "segment_", "events_"});
        }
        if (iOrdinal == 3) {
            return new ObservationEventGroupNonAuth();
        }
        if (iOrdinal == 4) {
            return new ahp0(DEFAULT_INSTANCE);
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
        synchronized (ObservationEventGroupNonAuth.class) {
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
        return this.eventGroupId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.eventGroupId_ = str;
    }

    public final void q(phc phcVar) {
        this.bitField0_ |= 4;
        this.events_ = phcVar;
    }

    public final void r(int i) {
        this.bitField0_ |= 2;
        this.segment_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
