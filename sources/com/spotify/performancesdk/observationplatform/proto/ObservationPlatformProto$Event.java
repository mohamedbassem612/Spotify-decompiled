package com.spotify.performancesdk.observationplatform.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.shp0;
import p.thp0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservationPlatformProto$Event extends h implements v2j0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 4;
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final ObservationPlatformProto$Event DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TIMESTAMP_US_FIELD_NUMBER = 3;
    private qng0 attributes_ = qng0.b;
    private String category_ = "";
    private String name_ = "";
    private long timestampUs_;

    static {
        ObservationPlatformProto$Event observationPlatformProto$Event = new ObservationPlatformProto$Event();
        DEFAULT_INSTANCE = observationPlatformProto$Event;
        h.registerDefaultInstance(ObservationPlatformProto$Event.class, observationPlatformProto$Event);
    }

    private ObservationPlatformProto$Event() {
    }

    public static thp0 o() {
        return (thp0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u00042", new Object[]{"category_", "name_", "timestampUs_", "attributes_", shp0.a});
        }
        if (iOrdinal == 3) {
            return new ObservationPlatformProto$Event();
        }
        if (iOrdinal == 4) {
            return new thp0(DEFAULT_INSTANCE);
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
        synchronized (ObservationPlatformProto$Event.class) {
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
        qng0 qng0Var = this.attributes_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.attributes_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.category_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.name_ = str;
    }

    public final void r(long j) {
        this.timestampUs_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
