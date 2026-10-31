package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.elz;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$GetComputedTransitionsRequest extends h implements v2j0 {
    private static final EsAutomix$GetComputedTransitionsRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_PAIRS_FIELD_NUMBER = 1;
    private h290 trackPairs_ = h.emptyProtobufList();

    static {
        EsAutomix$GetComputedTransitionsRequest esAutomix$GetComputedTransitionsRequest = new EsAutomix$GetComputedTransitionsRequest();
        DEFAULT_INSTANCE = esAutomix$GetComputedTransitionsRequest;
        h.registerDefaultInstance(EsAutomix$GetComputedTransitionsRequest.class, esAutomix$GetComputedTransitionsRequest);
    }

    private EsAutomix$GetComputedTransitionsRequest() {
    }

    public static elz o() {
        return (elz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"trackPairs_", EsAutomix$TrackPair.class});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetComputedTransitionsRequest();
        }
        if (iOrdinal == 4) {
            return new elz(DEFAULT_INSTANCE);
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
        synchronized (EsAutomix$GetComputedTransitionsRequest.class) {
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
        h290 h290VarMutableCopy = this.trackPairs_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.trackPairs_ = h290VarMutableCopy;
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
