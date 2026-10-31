package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.myy0;
import p.nyy0;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class PutTargetingRequest extends h implements v2j0 {
    private static final PutTargetingRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TARGETING_MAP_FIELD_NUMBER = 1;
    private qng0 targetingMap_ = qng0.b;

    static {
        PutTargetingRequest putTargetingRequest = new PutTargetingRequest();
        DEFAULT_INSTANCE = putTargetingRequest;
        h.registerDefaultInstance(PutTargetingRequest.class, putTargetingRequest);
    }

    private PutTargetingRequest() {
    }

    public static myy0 o() {
        return (myy0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"targetingMap_", nyy0.a});
        }
        if (iOrdinal == 3) {
            return new PutTargetingRequest();
        }
        if (iOrdinal == 4) {
            return new myy0(DEFAULT_INSTANCE);
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
        synchronized (PutTargetingRequest.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.targetingMap_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.targetingMap_ = qng0VarH;
        return qng0VarH;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
