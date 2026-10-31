package com.spotify.listeningactivity.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class UserSubscription extends h implements v2j0 {
    private static final UserSubscription DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PUSHER_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int WEBHOOK_FIELD_NUMBER = 3;
    private Object channel_;
    private int channelCase_ = 0;
    private String username_ = "";

    public static final class PusherChannel extends h implements v2j0 {
        public static final int CONNECTION_ID_FIELD_NUMBER = 1;
        private static final PusherChannel DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private String connectionId_ = "";

        static {
            PusherChannel pusherChannel = new PusherChannel();
            DEFAULT_INSTANCE = pusherChannel;
            h.registerDefaultInstance(PusherChannel.class, pusherChannel);
        }

        private PusherChannel() {
        }

        public static d n() {
            return (d) DEFAULT_INSTANCE.createBuilder();
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
                return new PusherChannel();
            }
            if (iOrdinal == 4) {
                return new d(DEFAULT_INSTANCE);
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
            synchronized (PusherChannel.class) {
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

    public static final class WebhookChannel extends h implements v2j0 {
        public static final int CALLBACK_URL_FIELD_NUMBER = 1;
        private static final WebhookChannel DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 2;
        private String callbackUrl_ = "";
        private String protocol_ = "";

        static {
            WebhookChannel webhookChannel = new WebhookChannel();
            DEFAULT_INSTANCE = webhookChannel;
            h.registerDefaultInstance(WebhookChannel.class, webhookChannel);
        }

        private WebhookChannel() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callbackUrl_", "protocol_"});
            }
            if (iOrdinal == 3) {
                return new WebhookChannel();
            }
            if (iOrdinal == 4) {
                return new e(DEFAULT_INSTANCE);
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
            synchronized (WebhookChannel.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        UserSubscription userSubscription = new UserSubscription();
        DEFAULT_INSTANCE = userSubscription;
        h.registerDefaultInstance(UserSubscription.class, userSubscription);
    }

    private UserSubscription() {
    }

    public static c n() {
        return (c) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"channel_", "channelCase_", "username_", PusherChannel.class, WebhookChannel.class});
        }
        if (iOrdinal == 3) {
            return new UserSubscription();
        }
        if (iOrdinal == 4) {
            return new c(DEFAULT_INSTANCE);
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
        synchronized (UserSubscription.class) {
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

    public final void o(PusherChannel pusherChannel) {
        pusherChannel.getClass();
        this.channel_ = pusherChannel;
        this.channelCase_ = 2;
    }

    public final void p(String str) {
        str.getClass();
        this.username_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
