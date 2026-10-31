package com.spotify.searchview.v1;

import com.google.protobuf.h;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.i940;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GatingDecision extends h implements v2j0 {
    private static final GatingDecision DEFAULT_INSTANCE;
    public static final int DENY_FIELD_NUMBER = 2;
    public static final int GATING_CONTEXT_FIELD_NUMBER = 4;
    public static final int INDICATOR_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PERMIT_FIELD_NUMBER = 1;
    private int bitField0_;
    private GatingContext gatingContext_;
    private int indicator_;
    private int resultCase_ = 0;
    private Object result_;

    public static final class Deny extends h implements v2j0 {
        private static final Deny DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int REASONS_FIELD_NUMBER = 1;
        private static final c290 reasons_converter_ = new b();
        private int reasonsMemoizedSerializedSize;
        private b290 reasons_ = h.emptyIntList();

        static {
            Deny deny = new Deny();
            DEFAULT_INSTANCE = deny;
            h.registerDefaultInstance(Deny.class, deny);
        }

        private Deny() {
        }

        public static Deny n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"reasons_"});
            }
            if (iOrdinal == 3) {
                return new Deny();
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
            synchronized (Deny.class) {
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

        public final List o() {
            return new d290(this.reasons_, reasons_converter_);
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class GatingContext extends h implements v2j0 {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final GatingContext DEFAULT_INSTANCE;
        public static final int FEATURE_ID_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String featureId_ = "";
        private String action_ = "";

        static {
            GatingContext gatingContext = new GatingContext();
            DEFAULT_INSTANCE = gatingContext;
            h.registerDefaultInstance(GatingContext.class, gatingContext);
        }

        private GatingContext() {
        }

        public static GatingContext o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"featureId_", "action_"});
            }
            if (iOrdinal == 3) {
                return new GatingContext();
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
            synchronized (GatingContext.class) {
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

        public final String n() {
            return this.action_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.featureId_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Permit extends h implements v2j0 {
        private static final Permit DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Permit permit = new Permit();
            DEFAULT_INSTANCE = permit;
            h.registerDefaultInstance(Permit.class, permit);
        }

        private Permit() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Permit();
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
            synchronized (Permit.class) {
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
        GatingDecision gatingDecision = new GatingDecision();
        DEFAULT_INSTANCE = gatingDecision;
        h.registerDefaultInstance(GatingDecision.class, gatingDecision);
    }

    private GatingDecision() {
    }

    public static GatingDecision n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\f\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", Permit.class, Deny.class, "indicator_", "gatingContext_"});
        }
        if (iOrdinal == 3) {
            return new GatingDecision();
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
        synchronized (GatingDecision.class) {
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

    public final Deny o() {
        return this.resultCase_ == 2 ? (Deny) this.result_ : Deny.n();
    }

    public final GatingContext p() {
        GatingContext gatingContext = this.gatingContext_;
        return gatingContext == null ? GatingContext.o() : gatingContext;
    }

    public final i940 q() {
        i940 i940Var;
        int i = this.indicator_;
        if (i != 0) {
            i940Var = i != 1 ? null : i940.GATING_INDICATOR_PREMIUM;
        } else {
            i940Var = i940.GATING_INDICATOR_UNSPECIFIED;
        }
        return i940Var == null ? i940.UNRECOGNIZED : i940Var;
    }

    public final int r() {
        int i = this.resultCase_;
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

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
