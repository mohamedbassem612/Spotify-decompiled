package com.spotify.kidssessions.link.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class StartLinkSessionRequest extends h implements v2j0 {
    private static final StartLinkSessionRequest DEFAULT_INSTANCE;
    public static final int DEPENDENT_INITIATED_FIELD_NUMBER = 2;
    public static final int PARENT_INITIATED_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int flowCase_ = 0;
    private Object flow_;

    public static final class DependentInitiatedFlow extends h implements v2j0 {
        private static final DependentInitiatedFlow DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
        private String spotifyId_ = "";

        static {
            DependentInitiatedFlow dependentInitiatedFlow = new DependentInitiatedFlow();
            DEFAULT_INSTANCE = dependentInitiatedFlow;
            h.registerDefaultInstance(DependentInitiatedFlow.class, dependentInitiatedFlow);
        }

        private DependentInitiatedFlow() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"spotifyId_"});
            }
            if (iOrdinal == 3) {
                return new DependentInitiatedFlow();
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
            synchronized (DependentInitiatedFlow.class) {
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
            this.spotifyId_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ParentInitiatedFlow extends h implements v2j0 {
        private static final ParentInitiatedFlow DEFAULT_INSTANCE;
        public static final int DEPENDENT_DATE_OF_BIRTH_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String dependentDateOfBirth_ = "";

        static {
            ParentInitiatedFlow parentInitiatedFlow = new ParentInitiatedFlow();
            DEFAULT_INSTANCE = parentInitiatedFlow;
            h.registerDefaultInstance(ParentInitiatedFlow.class, parentInitiatedFlow);
        }

        private ParentInitiatedFlow() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"dependentDateOfBirth_"});
            }
            if (iOrdinal == 3) {
                return new ParentInitiatedFlow();
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
            synchronized (ParentInitiatedFlow.class) {
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
        StartLinkSessionRequest startLinkSessionRequest = new StartLinkSessionRequest();
        DEFAULT_INSTANCE = startLinkSessionRequest;
        h.registerDefaultInstance(StartLinkSessionRequest.class, startLinkSessionRequest);
    }

    private StartLinkSessionRequest() {
    }

    public static a n() {
        return (a) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"flow_", "flowCase_", ParentInitiatedFlow.class, DependentInitiatedFlow.class});
        }
        if (iOrdinal == 3) {
            return new StartLinkSessionRequest();
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
        synchronized (StartLinkSessionRequest.class) {
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

    public final void o(DependentInitiatedFlow dependentInitiatedFlow) {
        dependentInitiatedFlow.getClass();
        this.flow_ = dependentInitiatedFlow;
        this.flowCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
