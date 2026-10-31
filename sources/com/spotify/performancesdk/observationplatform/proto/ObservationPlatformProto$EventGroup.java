package com.spotify.performancesdk.observationplatform.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uhp0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservationPlatformProto$EventGroup extends h implements v2j0 {
    private static final ObservationPlatformProto$EventGroup DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 events_ = h.emptyProtobufList();

    static {
        ObservationPlatformProto$EventGroup observationPlatformProto$EventGroup = new ObservationPlatformProto$EventGroup();
        DEFAULT_INSTANCE = observationPlatformProto$EventGroup;
        h.registerDefaultInstance(ObservationPlatformProto$EventGroup.class, observationPlatformProto$EventGroup);
    }

    private ObservationPlatformProto$EventGroup() {
    }

    public static uhp0 o() {
        return (uhp0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"events_", ObservationPlatformProto$Event.class});
        }
        if (iOrdinal == 3) {
            return new ObservationPlatformProto$EventGroup();
        }
        if (iOrdinal == 4) {
            return new uhp0(DEFAULT_INSTANCE);
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
        synchronized (ObservationPlatformProto$EventGroup.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.events_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.events_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
