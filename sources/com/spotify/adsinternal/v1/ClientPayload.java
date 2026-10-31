package com.spotify.adsinternal.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wkg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ClientPayload extends h implements v2j0 {
    public static final int CAROUSEL_ITEM_FIELD_NUMBER = 2;
    private static final ClientPayload DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SURVEY_FIELD_NUMBER = 1;
    private int maybePayloadCase_ = 0;
    private Object maybePayload_;

    static {
        ClientPayload clientPayload = new ClientPayload();
        DEFAULT_INSTANCE = clientPayload;
        h.registerDefaultInstance(ClientPayload.class, clientPayload);
    }

    private ClientPayload() {
    }

    public static wkg n() {
        return (wkg) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"maybePayload_", "maybePayloadCase_", Survey.class, CarouselItem.class});
        }
        if (iOrdinal == 3) {
            return new ClientPayload();
        }
        if (iOrdinal == 4) {
            return new wkg(DEFAULT_INSTANCE);
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
        synchronized (ClientPayload.class) {
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

    public final void o(CarouselItem carouselItem) {
        carouselItem.getClass();
        this.maybePayload_ = carouselItem;
        this.maybePayloadCase_ = 2;
    }

    public final void p(Survey survey) {
        survey.getClass();
        this.maybePayload_ = survey;
        this.maybePayloadCase_ = 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
