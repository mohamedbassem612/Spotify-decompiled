package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xe11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class RemoveMemberBenefits extends h implements v2j0 {
    public static final int BENEFITS_FIELD_NUMBER = 3;
    private static final RemoveMemberBenefits DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 4;
    public static final int HEADER_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 1;
    private int bitField0_;
    private MemberProfile profile_;
    private String header_ = "";
    private h290 benefits_ = h.emptyProtobufList();
    private String footer_ = "";

    static {
        RemoveMemberBenefits removeMemberBenefits = new RemoveMemberBenefits();
        DEFAULT_INSTANCE = removeMemberBenefits;
        h.registerDefaultInstance(RemoveMemberBenefits.class, removeMemberBenefits);
    }

    private RemoveMemberBenefits() {
    }

    public static RemoveMemberBenefits o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"bitField0_", "profile_", "header_", "benefits_", "footer_"});
        }
        if (iOrdinal == 3) {
            return new RemoveMemberBenefits();
        }
        if (iOrdinal == 4) {
            return new xe11(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (RemoveMemberBenefits.class) {
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

    public final h290 n() {
        return this.benefits_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.footer_;
    }

    public final String q() {
        return this.header_;
    }

    public final MemberProfile r() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.n() : memberProfile;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
