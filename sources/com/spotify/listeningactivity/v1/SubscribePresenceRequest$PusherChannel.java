package com.spotify.listeningactivity.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SubscribePresenceRequest$PusherChannel extends h implements v2j0 {
    public static final int CONNECTION_ID_FIELD_NUMBER = 1;
    private static final SubscribePresenceRequest$PusherChannel DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String connectionId_ = "";

    static {
        SubscribePresenceRequest$PusherChannel subscribePresenceRequest$PusherChannel = new SubscribePresenceRequest$PusherChannel();
        DEFAULT_INSTANCE = subscribePresenceRequest$PusherChannel;
        h.registerDefaultInstance(SubscribePresenceRequest$PusherChannel.class, subscribePresenceRequest$PusherChannel);
    }

    private SubscribePresenceRequest$PusherChannel() {
    }

    public static b n() {
        return (b) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"connectionId_"});
        }
        if (iOrdinal == 3) {
            return new SubscribePresenceRequest$PusherChannel();
        }
        if (iOrdinal == 4) {
            return new b(DEFAULT_INSTANCE);
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
        synchronized (SubscribePresenceRequest$PusherChannel.class) {
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

    public final void o(String str) {
        str.getClass();
        this.connectionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
