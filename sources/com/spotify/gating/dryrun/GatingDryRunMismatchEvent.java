package com.spotify.gating.dryrun;

import com.google.protobuf.h;
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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GatingDryRunMismatchEvent extends h implements v2j0 {
    private static final GatingDryRunMismatchEvent DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 1;
    public static final int MISMATCHES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String featureId_ = "";
    private h290 mismatches_ = h.emptyProtobufList();

    public static final class Mismatches extends h implements v2j0 {
        public static final int ACTION_NAME_FIELD_NUMBER = 1;
        public static final int ACTUAL_DENIAL_REASON_FIELD_NUMBER = 4;
        public static final int ACTUAL_GRANTED_FIELD_NUMBER = 3;
        private static final Mismatches DEFAULT_INSTANCE;
        public static final int EXPECTED_GRANTED_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private String actionName_ = "";
        private String actualDenialReason_ = "";
        private boolean actualGranted_;
        private int bitField0_;
        private boolean expectedGranted_;

        static {
            Mismatches mismatches = new Mismatches();
            DEFAULT_INSTANCE = mismatches;
            h.registerDefaultInstance(Mismatches.class, mismatches);
        }

        private Mismatches() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "actionName_", "expectedGranted_", "actualGranted_", "actualDenialReason_"});
            }
            if (iOrdinal == 3) {
                return new Mismatches();
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
            synchronized (Mismatches.class) {
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
            this.bitField0_ |= 1;
            this.actionName_ = str;
        }

        public final void p(String str) {
            this.bitField0_ |= 8;
            this.actualDenialReason_ = str;
        }

        public final void q(boolean z) {
            this.bitField0_ |= 4;
            this.actualGranted_ = z;
        }

        public final void r(boolean z) {
            this.bitField0_ |= 2;
            this.expectedGranted_ = z;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GatingDryRunMismatchEvent gatingDryRunMismatchEvent = new GatingDryRunMismatchEvent();
        DEFAULT_INSTANCE = gatingDryRunMismatchEvent;
        h.registerDefaultInstance(GatingDryRunMismatchEvent.class, gatingDryRunMismatchEvent);
    }

    private GatingDryRunMismatchEvent() {
    }

    public static a o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "featureId_", "mismatches_", Mismatches.class});
        }
        if (iOrdinal == 3) {
            return new GatingDryRunMismatchEvent();
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
        synchronized (GatingDryRunMismatchEvent.class) {
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
        h290 h290VarMutableCopy = this.mismatches_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.mismatches_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.featureId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
