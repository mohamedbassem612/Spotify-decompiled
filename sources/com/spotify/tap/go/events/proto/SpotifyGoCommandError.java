package com.spotify.tap.go.events.proto;

import com.google.protobuf.h;
import p.b4b1;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class SpotifyGoCommandError extends h implements v2j0 {
    public static final int COMMAND_FIELD_NUMBER = 1;
    private static final SpotifyGoCommandError DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private phc command_ = phc.b;
    private String errorMessage_ = "";

    static {
        SpotifyGoCommandError spotifyGoCommandError = new SpotifyGoCommandError();
        DEFAULT_INSTANCE = spotifyGoCommandError;
        h.registerDefaultInstance(SpotifyGoCommandError.class, spotifyGoCommandError);
    }

    private SpotifyGoCommandError() {
    }

    public static b4b1 n() {
        return (b4b1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "command_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new SpotifyGoCommandError();
        }
        if (iOrdinal == 4) {
            return new b4b1(DEFAULT_INSTANCE);
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
        synchronized (SpotifyGoCommandError.class) {
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
        this.bitField0_ |= 1;
        this.command_ = hhcVar;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.errorMessage_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
