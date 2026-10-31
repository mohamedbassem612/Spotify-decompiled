package com.spotify.listeningactivity.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SubscribePresenceRequest extends h implements v2j0 {
    private static final SubscribePresenceRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PUSHER_FIELD_NUMBER = 1;
    private int bitField0_;
    private PusherChannel pusher_;

    static {
        SubscribePresenceRequest subscribePresenceRequest = new SubscribePresenceRequest();
        DEFAULT_INSTANCE = subscribePresenceRequest;
        h.registerDefaultInstance(SubscribePresenceRequest.class, subscribePresenceRequest);
    }

    private SubscribePresenceRequest() {
    }

    public static a o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "pusher_"});
        }
        if (iOrdinal == 3) {
            return new SubscribePresenceRequest();
        }
        if (iOrdinal == 4) {
            return new a();
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
        synchronized (SubscribePresenceRequest.class) {
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

    public final void p(PusherChannel pusherChannel) {
        pusherChannel.getClass();
        this.pusher_ = pusherChannel;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
