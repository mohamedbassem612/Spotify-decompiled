package com.spotify.campfire.contribution.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ContributionCapabilities extends h implements v2j0 {
    public static final int CAN_CONTROL_FEATURE_FIELD_NUMBER = 5;
    public static final int CAN_CREATE_FIELD_NUMBER = 1;
    public static final int CAN_EDIT_FIELD_NUMBER = 2;
    public static final int CAN_REMOVE_FIELD_NUMBER = 3;
    public static final int CAN_VIEW_FIELD_NUMBER = 4;
    private static final ContributionCapabilities DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean canControlFeature_;
    private boolean canCreate_;
    private boolean canEdit_;
    private boolean canRemove_;
    private boolean canView_;

    static {
        ContributionCapabilities contributionCapabilities = new ContributionCapabilities();
        DEFAULT_INSTANCE = contributionCapabilities;
        h.registerDefaultInstance(ContributionCapabilities.class, contributionCapabilities);
    }

    private ContributionCapabilities() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ContributionCapabilities s() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "canCreate_", "canEdit_", "canRemove_", "canView_", "canControlFeature_"});
        }
        if (iOrdinal == 3) {
            return new ContributionCapabilities();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (ContributionCapabilities.class) {
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

    public final boolean n() {
        return this.canControlFeature_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.canCreate_;
    }

    public final boolean p() {
        return this.canEdit_;
    }

    public final boolean q() {
        return this.canRemove_;
    }

    public final boolean r() {
        return this.canView_;
    }

    public final boolean t() {
        return (this.bitField0_ & 16) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) != 0;
    }
}
