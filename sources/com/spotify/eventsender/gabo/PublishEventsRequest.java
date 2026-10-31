package com.spotify.eventsender.gabo;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.mny0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class PublishEventsRequest extends h implements v2j0 {
    private static final PublishEventsRequest DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SUPPRESS_PERSIST_FIELD_NUMBER = 2;
    private h290 event_ = h.emptyProtobufList();
    private boolean suppressPersist_;

    static {
        PublishEventsRequest publishEventsRequest = new PublishEventsRequest();
        DEFAULT_INSTANCE = publishEventsRequest;
        h.registerDefaultInstance(PublishEventsRequest.class, publishEventsRequest);
    }

    private PublishEventsRequest() {
    }

    public static mny0 p() {
        return (mny0) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"event_", EventEnvelope.class, "suppressPersist_"});
        }
        if (iOrdinal == 3) {
            return new PublishEventsRequest();
        }
        if (iOrdinal == 4) {
            return new mny0(DEFAULT_INSTANCE);
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
        synchronized (PublishEventsRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.event_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.event_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(EventEnvelope eventEnvelope) {
        h290 h290VarMutableCopy = this.event_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.event_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(eventEnvelope);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
