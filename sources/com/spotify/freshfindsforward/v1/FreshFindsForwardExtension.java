package com.spotify.freshfindsforward.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sn30;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class FreshFindsForwardExtension extends h implements v2j0 {
    public static final int BADGE_URL_FIELD_NUMBER = 3;
    public static final int COHORT_YEAR_FIELD_NUMBER = 4;
    private static final FreshFindsForwardExtension DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_ENTITY_BANNER_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private String badgeUrl_ = "";
    private String cohortYear_ = "";
    private boolean showEntityBanner_;
    private int status_;

    static {
        FreshFindsForwardExtension freshFindsForwardExtension = new FreshFindsForwardExtension();
        DEFAULT_INSTANCE = freshFindsForwardExtension;
        h.registerDefaultInstance(FreshFindsForwardExtension.class, freshFindsForwardExtension);
    }

    private FreshFindsForwardExtension() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static FreshFindsForwardExtension r(byte[] bArr) {
        return (FreshFindsForwardExtension) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003Ȉ\u0004Ȉ", new Object[]{"status_", "showEntityBanner_", "badgeUrl_", "cohortYear_"});
        }
        if (iOrdinal == 3) {
            return new FreshFindsForwardExtension();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (FreshFindsForwardExtension.class) {
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
        return this.badgeUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.cohortYear_;
    }

    public final boolean p() {
        return this.showEntityBanner_;
    }

    public final sn30 q() {
        sn30 sn30Var;
        int i = this.status_;
        if (i == 0) {
            sn30Var = sn30.FRESH_FINDS_FORWARD_STATUS_UNSPECIFIED;
        } else if (i != 1) {
            sn30Var = i != 2 ? null : sn30.FRESH_FINDS_FORWARD_STATUS_ALUMNI;
        } else {
            sn30Var = sn30.FRESH_FINDS_FORWARD_STATUS_ACTIVE;
        }
        return sn30Var == null ? sn30.UNRECOGNIZED : sn30Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
