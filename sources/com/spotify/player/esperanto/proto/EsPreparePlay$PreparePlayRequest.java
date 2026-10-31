package com.spotify.player.esperanto.proto;

import p.bf40;
import p.jf40;
import p.jqz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class EsPreparePlay$PreparePlayRequest extends com.google.protobuf.h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsPreparePlay$PreparePlayRequest DEFAULT_INSTANCE;
    public static final int LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAY_ORIGIN_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsContext$Context context_;
    private String logicalPlaybackIdentifier_ = "";
    private EsPreparePlayOptions$PreparePlayOptions options_;
    private EsPlayOrigin.PlayOrigin playOrigin_;

    static {
        EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest = new EsPreparePlay$PreparePlayRequest();
        DEFAULT_INSTANCE = esPreparePlay$PreparePlayRequest;
        com.google.protobuf.h.registerDefaultInstance(EsPreparePlay$PreparePlayRequest.class, esPreparePlay$PreparePlayRequest);
    }

    private EsPreparePlay$PreparePlayRequest() {
    }

    public static jqz n() {
        return (jqz) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "context_", "options_", "playOrigin_", "logicalPlaybackIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new EsPreparePlay$PreparePlayRequest();
        }
        if (iOrdinal == 4) {
            return new jqz(DEFAULT_INSTANCE);
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
        synchronized (EsPreparePlay$PreparePlayRequest.class) {
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

    public final void o(EsContext$Context esContext$Context) {
        esContext$Context.getClass();
        this.context_ = esContext$Context;
        this.bitField0_ |= 1;
    }

    public final void p(EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions) {
        esPreparePlayOptions$PreparePlayOptions.getClass();
        this.options_ = esPreparePlayOptions$PreparePlayOptions;
        this.bitField0_ |= 2;
    }

    public final void q(EsPlayOrigin.PlayOrigin playOrigin) {
        playOrigin.getClass();
        this.playOrigin_ = playOrigin;
        this.bitField0_ |= 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
