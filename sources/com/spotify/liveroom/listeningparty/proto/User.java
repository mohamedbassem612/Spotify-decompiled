package com.spotify.liveroom.listeningparty.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class User extends com.google.protobuf.h implements v2j0 {
    public static final int ATTENDEE_FIELD_NUMBER = 2;
    private static final User DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int userDataCase_ = 0;
    private Object userData_;

    public static final class Attendee extends com.google.protobuf.h implements v2j0 {
        private static final Attendee DEFAULT_INSTANCE;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
        public static final int IMAGE_URL_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private String username_ = "";
        private String displayName_ = "";
        private String imageUrl_ = "";

        static {
            Attendee attendee = new Attendee();
            DEFAULT_INSTANCE = attendee;
            com.google.protobuf.h.registerDefaultInstance(Attendee.class, attendee);
        }

        private Attendee() {
        }

        public static Attendee n() {
            return DEFAULT_INSTANCE;
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"username_", "displayName_", "imageUrl_"});
            }
            if (iOrdinal == 3) {
                return new Attendee();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (Attendee.class) {
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

        public final String getDisplayName() {
            return this.displayName_;
        }

        public final String getImageUrl() {
            return this.imageUrl_;
        }

        public final String getUsername() {
            return this.username_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Host extends com.google.protobuf.h implements v2j0 {
        private static final Host DEFAULT_INSTANCE;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
        public static final int HOST_ID_FIELD_NUMBER = 2;
        public static final int IMAGE_URL_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER;
        private String hostId_ = "";
        private String displayName_ = "";
        private String imageUrl_ = "";

        static {
            Host host = new Host();
            DEFAULT_INSTANCE = host;
            com.google.protobuf.h.registerDefaultInstance(Host.class, host);
        }

        private Host() {
        }

        public static Host n() {
            return DEFAULT_INSTANCE;
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"hostId_", "displayName_", "imageUrl_"});
            }
            if (iOrdinal == 3) {
                return new Host();
            }
            if (iOrdinal == 4) {
                return new k(DEFAULT_INSTANCE);
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
            synchronized (Host.class) {
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

        public final String getDisplayName() {
            return this.displayName_;
        }

        public final String getImageUrl() {
            return this.imageUrl_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.hostId_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        User user = new User();
        DEFAULT_INSTANCE = user;
        com.google.protobuf.h.registerDefaultInstance(User.class, user);
    }

    private User() {
    }

    public static User o() {
        return DEFAULT_INSTANCE;
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"userData_", "userDataCase_", Host.class, Attendee.class});
        }
        if (iOrdinal == 3) {
            return new User();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE);
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
        synchronized (User.class) {
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

    public final Attendee n() {
        return this.userDataCase_ == 2 ? (Attendee) this.userData_ : Attendee.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Host p() {
        return this.userDataCase_ == 1 ? (Host) this.userData_ : Host.n();
    }

    public final int q() {
        int i = this.userDataCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
