package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.byv0;
import p.cyv0;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class PrepareSlotRequest extends h implements v2j0 {
    private static final PrepareSlotRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 1;
    public static final int TARGETING_MAP_FIELD_NUMBER = 2;
    private qng0 targetingMap_ = qng0.b;
    private String slotId_ = "";

    static {
        PrepareSlotRequest prepareSlotRequest = new PrepareSlotRequest();
        DEFAULT_INSTANCE = prepareSlotRequest;
        h.registerDefaultInstance(PrepareSlotRequest.class, prepareSlotRequest);
    }

    private PrepareSlotRequest() {
    }

    public static byv0 o() {
        return (byv0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"slotId_", "targetingMap_", cyv0.a});
        }
        if (iOrdinal == 3) {
            return new PrepareSlotRequest();
        }
        if (iOrdinal == 4) {
            return new byv0(DEFAULT_INSTANCE);
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
        synchronized (PrepareSlotRequest.class) {
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

    public final void p(String str) {
        str.getClass();
        this.slotId_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
