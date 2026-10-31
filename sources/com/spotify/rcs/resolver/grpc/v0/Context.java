package com.spotify.rcs.resolver.grpc.v0;

import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Context extends com.google.protobuf.h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final Context DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 context_ = com.google.protobuf.h.emptyProtobufList();

    public static final class ContextEntry extends com.google.protobuf.h implements v2j0 {
        public static final int BOOL_VALUE_FIELD_NUMBER = 11;
        private static final ContextEntry DEFAULT_INSTANCE;
        public static final int LONG_VALUE_FIELD_NUMBER = 12;
        private static volatile qzr0 PARSER = null;
        public static final int POLICY_INPUT_NAME_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 10;
        private Object context_;
        private Object val_;
        private int contextCase_ = 0;
        private int valCase_ = 0;

        static {
            ContextEntry contextEntry = new ContextEntry();
            DEFAULT_INSTANCE = contextEntry;
            com.google.protobuf.h.registerDefaultInstance(ContextEntry.class, contextEntry);
        }

        private ContextEntry() {
        }

        public static i n() {
            return (i) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0002\u0000\u0002\f\u0004\u0000\u0000\u0000\u0002Ȼ\u0000\nȻ\u0001\u000b:\u0001\f5\u0001", new Object[]{"context_", "contextCase_", "val_", "valCase_"});
            }
            if (iOrdinal == 3) {
                return new ContextEntry();
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
            synchronized (ContextEntry.class) {
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

        public final void o(boolean z) {
            this.valCase_ = 11;
            this.val_ = Boolean.valueOf(z);
        }

        public final void p(String str) {
            str.getClass();
            this.contextCase_ = 2;
            this.context_ = str;
        }

        public final void q(String str) {
            str.getClass();
            this.valCase_ = 10;
            this.val_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Context context = new Context();
        DEFAULT_INSTANCE = context;
        com.google.protobuf.h.registerDefaultInstance(Context.class, context);
    }

    private Context() {
    }

    public static h o() {
        return (h) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"context_", ContextEntry.class});
        }
        if (iOrdinal == 3) {
            return new Context();
        }
        if (iOrdinal == 4) {
            return new h(DEFAULT_INSTANCE);
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
        synchronized (Context.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.context_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.context_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
