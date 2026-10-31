package com.spotify.puffin_esperanto.proto;

import com.google.protobuf.h;
import p.aqy0;
import p.bf40;
import p.bqy0;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PuffinFilterRequestOuterClass$PuffinFilterRequest extends h implements v2j0 {
    private static final PuffinFilterRequestOuterClass$PuffinFilterRequest DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int IS_O_FIELD_NUMBER = 3;
    public static final int IS_V_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 5;
    private h290 filters_ = h.emptyProtobufList();
    private boolean isO_;
    private boolean isV_;
    private int reason_;

    static {
        PuffinFilterRequestOuterClass$PuffinFilterRequest puffinFilterRequestOuterClass$PuffinFilterRequest = new PuffinFilterRequestOuterClass$PuffinFilterRequest();
        DEFAULT_INSTANCE = puffinFilterRequestOuterClass$PuffinFilterRequest;
        h.registerDefaultInstance(PuffinFilterRequestOuterClass$PuffinFilterRequest.class, puffinFilterRequestOuterClass$PuffinFilterRequest);
    }

    private PuffinFilterRequestOuterClass$PuffinFilterRequest() {
    }

    public static aqy0 o() {
        return (aqy0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u001c\u0003\u0007\u0004\u0007\u0005\f", new Object[]{"filters_", "isO_", "isV_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new PuffinFilterRequestOuterClass$PuffinFilterRequest();
        }
        if (iOrdinal == 4) {
            return new aqy0(DEFAULT_INSTANCE);
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
        synchronized (PuffinFilterRequestOuterClass$PuffinFilterRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.filters_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.filters_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(boolean z) {
        this.isO_ = z;
    }

    public final void q(boolean z) {
        this.isV_ = z;
    }

    public final void r(bqy0 bqy0Var) {
        this.reason_ = bqy0Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
