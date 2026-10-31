package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.hhc;
import p.i9;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ManualOps extends h implements v2j0 {
    private static final ManualOps DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int POSTOPS_FIELD_NUMBER = 2;
    public static final int PREOPS_FIELD_NUMBER = 1;
    private int bitField0_;
    private PostOps postOps_;
    private PreOps preOps_;

    public static final class Move extends h implements v2j0 {
        public static final int BEFORE_FIELD_NUMBER = 3;
        private static final Move DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SOURCEITEMID_FIELD_NUMBER = 1;
        public static final int TARGETITEMID_FIELD_NUMBER = 2;
        private boolean before_;
        private phc sourceItemId_;
        private phc targetItemId_;

        static {
            Move move = new Move();
            DEFAULT_INSTANCE = move;
            h.registerDefaultInstance(Move.class, move);
        }

        private Move() {
            hhc hhcVar = phc.b;
            this.sourceItemId_ = hhcVar;
            this.targetItemId_ = hhcVar;
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0007", new Object[]{"sourceItemId_", "targetItemId_", "before_"});
            }
            if (iOrdinal == 3) {
                return new Move();
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
            synchronized (Move.class) {
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
            this.before_ = z;
        }

        public final void p(hhc hhcVar) {
            this.sourceItemId_ = hhcVar;
        }

        public final void q(hhc hhcVar) {
            this.targetItemId_ = hhcVar;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Op extends h implements v2j0 {
        private static final Op DEFAULT_INSTANCE;
        public static final int MOVE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int REMOVE_FIELD_NUMBER = 2;
        private int operationCase_ = 0;
        private Object operation_;

        static {
            Op op = new Op();
            DEFAULT_INSTANCE = op;
            h.registerDefaultInstance(Op.class, op);
        }

        private Op() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"operation_", "operationCase_", Move.class, Remove.class});
            }
            if (iOrdinal == 3) {
                return new Op();
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
            synchronized (Op.class) {
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

        public final void o(Move move) {
            move.getClass();
            this.operation_ = move;
            this.operationCase_ = 1;
        }

        public final void p(Remove remove) {
            remove.getClass();
            this.operation_ = remove;
            this.operationCase_ = 2;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PostOps extends h implements v2j0 {
        private static final PostOps DEFAULT_INSTANCE;
        public static final int OPS_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private h290 ops_ = h.emptyProtobufList();

        static {
            PostOps postOps = new PostOps();
            DEFAULT_INSTANCE = postOps;
            h.registerDefaultInstance(PostOps.class, postOps);
        }

        private PostOps() {
        }

        public static d o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"ops_", Op.class});
            }
            if (iOrdinal == 3) {
                return new PostOps();
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
            synchronized (PostOps.class) {
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
            h290 h290VarMutableCopy = this.ops_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
                this.ops_ = h290VarMutableCopy;
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

    public static final class PreOps extends h implements v2j0 {
        private static final PreOps DEFAULT_INSTANCE;
        public static final int OPS_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private h290 ops_ = h.emptyProtobufList();

        static {
            PreOps preOps = new PreOps();
            DEFAULT_INSTANCE = preOps;
            h.registerDefaultInstance(PreOps.class, preOps);
        }

        private PreOps() {
        }

        public static e o() {
            return (e) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"ops_", Op.class});
            }
            if (iOrdinal == 3) {
                return new PreOps();
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
            synchronized (PreOps.class) {
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
            h290 h290VarMutableCopy = this.ops_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
                this.ops_ = h290VarMutableCopy;
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

    public static final class Remove extends h implements v2j0 {
        private static final Remove DEFAULT_INSTANCE;
        public static final int ITEMID_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private phc itemId_ = phc.b;

        static {
            Remove remove = new Remove();
            DEFAULT_INSTANCE = remove;
            h.registerDefaultInstance(Remove.class, remove);
        }

        private Remove() {
        }

        public static f n() {
            return (f) DEFAULT_INSTANCE.createBuilder();
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"itemId_"});
            }
            if (iOrdinal == 3) {
                return new Remove();
            }
            if (iOrdinal == 4) {
                return new f(DEFAULT_INSTANCE);
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
            synchronized (Remove.class) {
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
            this.itemId_ = hhcVar;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ManualOps manualOps = new ManualOps();
        DEFAULT_INSTANCE = manualOps;
        h.registerDefaultInstance(ManualOps.class, manualOps);
    }

    private ManualOps() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "preOps_", "postOps_"});
        }
        if (iOrdinal == 3) {
            return new ManualOps();
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
        synchronized (ManualOps.class) {
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

    public final void o(PostOps postOps) {
        postOps.getClass();
        this.postOps_ = postOps;
        this.bitField0_ |= 2;
    }

    public final void p(PreOps preOps) {
        preOps.getClass();
        this.preOps_ = preOps;
        this.bitField0_ |= 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
