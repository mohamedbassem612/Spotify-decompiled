package com.spotify.listeningactivity.v1;

import com.google.protobuf.h;
import java.util.ArrayList;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.hn40;
import p.i9;
import p.jf40;
import p.lqc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tp10;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class GetFeedRequest extends h implements v2j0 {
    private static final GetFeedRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_SOURCES_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private static final c290 includeSources_converter_ = new lqc((byte) 11);
    private int includeSourcesMemoizedSerializedSize;
    private b290 includeSources_ = h.emptyIntList();
    private boolean unused_;

    static {
        GetFeedRequest getFeedRequest = new GetFeedRequest();
        DEFAULT_INSTANCE = getFeedRequest;
        h.registerDefaultInstance(GetFeedRequest.class, getFeedRequest);
    }

    private GetFeedRequest() {
    }

    public static hn40 p() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u0007\u0003,", new Object[]{"unused_", "includeSources_"});
        }
        if (iOrdinal == 3) {
            return new GetFeedRequest();
        }
        if (iOrdinal == 4) {
            return new hn40();
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
        synchronized (GetFeedRequest.class) {
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

    public final void o(ArrayList arrayList) {
        i9 i9Var = this.includeSources_;
        if (!i9Var.a) {
            this.includeSources_ = h.mutableCopy(i9Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tp10 tp10Var = (tp10) it.next();
            this.includeSources_.c(tp10Var.getNumber());
        }
    }

    public final void q() {
        this.unused_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
