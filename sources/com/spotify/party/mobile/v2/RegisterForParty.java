package com.spotify.party.mobile.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lld0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class RegisterForParty extends h implements v2j0 {
    private static final RegisterForParty DEFAULT_INSTANCE;
    public static final int NOTIFY_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REGISTERED_FIELD_NUMBER = 1;
    public static final int RSVP_FIELD_NUMBER = 2;
    private int registerTypeCase_ = 0;
    private Object registerType_;
    private boolean registered_;

    public static final class Notify extends h implements v2j0 {
        private static final Notify DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int RESTRICTION_FIELD_NUMBER = 1;
        private int restriction_;

        static {
            Notify notify = new Notify();
            DEFAULT_INSTANCE = notify;
            h.registerDefaultInstance(Notify.class, notify);
        }

        private Notify() {
        }

        public static Notify n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"restriction_"});
            }
            if (iOrdinal == 3) {
                return new Notify();
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
            synchronized (Notify.class) {
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

        public final lld0 o() {
            lld0 lld0VarA = lld0.a(this.restriction_);
            return lld0VarA == null ? lld0.h : lld0VarA;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Rsvp extends h implements v2j0 {
        private static final Rsvp DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int RESTRICTION_FIELD_NUMBER = 1;
        private int restriction_;

        static {
            Rsvp rsvp = new Rsvp();
            DEFAULT_INSTANCE = rsvp;
            h.registerDefaultInstance(Rsvp.class, rsvp);
        }

        private Rsvp() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"restriction_"});
            }
            if (iOrdinal == 3) {
                return new Rsvp();
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
            synchronized (Rsvp.class) {
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
        RegisterForParty registerForParty = new RegisterForParty();
        DEFAULT_INSTANCE = registerForParty;
        h.registerDefaultInstance(RegisterForParty.class, registerForParty);
    }

    private RegisterForParty() {
    }

    public static RegisterForParty n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002<\u0000\u0003<\u0000", new Object[]{"registerType_", "registerTypeCase_", "registered_", Rsvp.class, Notify.class});
        }
        if (iOrdinal == 3) {
            return new RegisterForParty();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (RegisterForParty.class) {
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

    public final Notify o() {
        return this.registerTypeCase_ == 3 ? (Notify) this.registerType_ : Notify.n();
    }

    public final boolean p() {
        return this.registered_;
    }

    public final boolean q() {
        return this.registerTypeCase_ == 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
