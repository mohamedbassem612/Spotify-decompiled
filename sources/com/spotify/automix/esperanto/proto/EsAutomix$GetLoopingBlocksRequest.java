package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.b290;
import p.bf40;
import p.i9;
import p.jf40;
import p.klz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$GetLoopingBlocksRequest extends h implements v2j0 {
    private static final EsAutomix$GetLoopingBlocksRequest DEFAULT_INSTANCE;
    public static final int LOOPING_STYLE_IDS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int loopingStyleIdsMemoizedSerializedSize = -1;
    private b290 loopingStyleIds_ = h.emptyIntList();

    static {
        EsAutomix$GetLoopingBlocksRequest esAutomix$GetLoopingBlocksRequest = new EsAutomix$GetLoopingBlocksRequest();
        DEFAULT_INSTANCE = esAutomix$GetLoopingBlocksRequest;
        h.registerDefaultInstance(EsAutomix$GetLoopingBlocksRequest.class, esAutomix$GetLoopingBlocksRequest);
    }

    private EsAutomix$GetLoopingBlocksRequest() {
    }

    public static klz o() {
        return (klz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"loopingStyleIds_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$GetLoopingBlocksRequest();
        }
        if (iOrdinal == 4) {
            return new klz(DEFAULT_INSTANCE);
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
        synchronized (EsAutomix$GetLoopingBlocksRequest.class) {
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
        b290 b290VarMutableCopy = this.loopingStyleIds_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.loopingStyleIds_ = b290VarMutableCopy;
        }
        s8.addAll(arrayList, b290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
