package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.b3c1;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class StoreTransitionRequest extends h implements v2j0 {
    private static final StoreTransitionRequest DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    public static final int TRANSITION_FIELD_NUMBER = 3;
    private String playlistUri_ = "";
    private phc itemId_ = phc.b;
    private String transition_ = "";

    static {
        StoreTransitionRequest storeTransitionRequest = new StoreTransitionRequest();
        DEFAULT_INSTANCE = storeTransitionRequest;
        h.registerDefaultInstance(StoreTransitionRequest.class, storeTransitionRequest);
    }

    private StoreTransitionRequest() {
    }

    public static b3c1 n() {
        return (b3c1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003Ȉ", new Object[]{"playlistUri_", "itemId_", "transition_"});
        }
        if (iOrdinal == 3) {
            return new StoreTransitionRequest();
        }
        if (iOrdinal == 4) {
            return new b3c1(DEFAULT_INSTANCE);
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
        synchronized (StoreTransitionRequest.class) {
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

    public final void o(hhc hhcVar) {
        this.itemId_ = hhcVar;
    }

    public final void p(String str) {
        str.getClass();
        this.playlistUri_ = str;
    }

    public final void q(String str) {
        this.transition_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
