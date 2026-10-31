package spotify.restrictions.permissions.permissions_proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.t2b;
import p.v2j0;
import p.vns0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PermissionsEsperanto$CanPlayContentResult extends h implements v2j0 {
    public static final int ASSURANCE_REQUIRED_DETAILS_FIELD_NUMBER = 4;
    public static final int CAN_PLAY_FIELD_NUMBER = 2;
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final PermissionsEsperanto$CanPlayContentResult DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int RESTRICTION_REASON_FIELD_NUMBER = 5;
    private static final c290 restrictionReason_converter_ = new t2b((byte) 19);
    private AssuranceRequiredDetails assuranceRequiredDetails_;
    private int bitField0_;
    private boolean canPlay_;
    private int reason_;
    private int restrictionReasonMemoizedSerializedSize;
    private String contentUri_ = "";
    private b290 restrictionReason_ = h.emptyIntList();

    public static final class AssuranceRequiredDetails extends h implements v2j0 {
        public static final int AGE_THRESHOLD_FIELD_NUMBER = 1;
        private static final AssuranceRequiredDetails DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private int ageThreshold_;

        static {
            AssuranceRequiredDetails assuranceRequiredDetails = new AssuranceRequiredDetails();
            DEFAULT_INSTANCE = assuranceRequiredDetails;
            h.registerDefaultInstance(AssuranceRequiredDetails.class, assuranceRequiredDetails);
        }

        private AssuranceRequiredDetails() {
        }

        public static AssuranceRequiredDetails o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"ageThreshold_"});
            }
            if (iOrdinal == 3) {
                return new AssuranceRequiredDetails();
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
            synchronized (AssuranceRequiredDetails.class) {
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

        public final int getAgeThreshold() {
            return this.ageThreshold_;
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
        PermissionsEsperanto$CanPlayContentResult permissionsEsperanto$CanPlayContentResult = new PermissionsEsperanto$CanPlayContentResult();
        DEFAULT_INSTANCE = permissionsEsperanto$CanPlayContentResult;
        h.registerDefaultInstance(PermissionsEsperanto$CanPlayContentResult.class, permissionsEsperanto$CanPlayContentResult);
    }

    private PermissionsEsperanto$CanPlayContentResult() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\f\u0004ဉ\u0000\u0005,", new Object[]{"bitField0_", "contentUri_", "canPlay_", "reason_", "assuranceRequiredDetails_", "restrictionReason_"});
        }
        if (iOrdinal == 3) {
            return new PermissionsEsperanto$CanPlayContentResult();
        }
        if (iOrdinal == 4) {
            return new b();
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
        synchronized (PermissionsEsperanto$CanPlayContentResult.class) {
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

    public final AssuranceRequiredDetails o() {
        AssuranceRequiredDetails assuranceRequiredDetails = this.assuranceRequiredDetails_;
        return assuranceRequiredDetails == null ? AssuranceRequiredDetails.o() : assuranceRequiredDetails;
    }

    public final boolean p() {
        return this.canPlay_;
    }

    public final String q() {
        return this.contentUri_;
    }

    public final vns0 r() {
        vns0 vns0Var;
        int i = this.reason_;
        if (i == 0) {
            vns0Var = vns0.AGE_ASSURANCE_REASON_UNKNOWN;
        } else if (i == 1) {
            vns0Var = vns0.AGE_ASSURANCE_REASON_UNAVAILABLE;
        } else if (i != 2) {
            vns0Var = i != 3 ? null : vns0.AGE_ASSURANCE_REASON_ALLOW;
        } else {
            vns0Var = vns0.AGE_ASSURANCE_REASON_REQUIRES_AGE_ASSURANCE;
        }
        return vns0Var == null ? vns0.UNRECOGNIZED : vns0Var;
    }

    public final d290 s() {
        return new d290(this.restrictionReason_, restrictionReason_converter_);
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
