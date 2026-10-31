package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GenAlphaManaged extends h implements v2j0 {
    public static final int ALLOW_CONNECT_FIELD_NUMBER = 5;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 3;
    public static final int ALLOW_VIDEO_FIELD_NUMBER = 4;
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 8;
    public static final int DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 7;
    private static final GenAlphaManaged DEFAULT_INSTANCE;
    public static final int GRADUATION_BANNER_FIELD_NUMBER = 10;
    public static final int IS_EXPIRING_FIELD_NUMBER = 11;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private boolean allowConnect_;
    private boolean allowExplicitContent_;
    private boolean allowVideo_;
    private int bitField0_;
    private GraduationBanner graduationBanner_;
    private boolean isExpiring_;
    private MemberProfile profile_;
    private String childId_ = "";
    private String dateOfBirth_ = "";
    private String dateOfBirthMinDate_ = "";
    private String dateOfBirthMaxDate_ = "";

    static {
        GenAlphaManaged genAlphaManaged = new GenAlphaManaged();
        DEFAULT_INSTANCE = genAlphaManaged;
        h.registerDefaultInstance(GenAlphaManaged.class, genAlphaManaged);
    }

    private GenAlphaManaged() {
    }

    public static GenAlphaManaged n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004\u0007\u0005ဇ\u0001\u0006Ȉ\u0007Ȉ\bȈ\nဉ\u0002\u000bဇ\u0003", new Object[]{"bitField0_", "childId_", "profile_", "allowExplicitContent_", "allowVideo_", "allowConnect_", "dateOfBirth_", "dateOfBirthMinDate_", "dateOfBirthMaxDate_", "graduationBanner_", "isExpiring_"});
        }
        if (iOrdinal == 3) {
            return new GenAlphaManaged();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (GenAlphaManaged.class) {
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

    public final boolean getAllowConnect() {
        return this.allowConnect_;
    }

    public final boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    public final boolean getAllowVideo() {
        return this.allowVideo_;
    }

    public final String getChildId() {
        return this.childId_;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    public final String getDateOfBirthMaxDate() {
        return this.dateOfBirthMaxDate_;
    }

    public final String getDateOfBirthMinDate() {
        return this.dateOfBirthMinDate_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getIsExpiring() {
        return this.isExpiring_;
    }

    public final boolean hasAllowConnect() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasGraduationBanner() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final GraduationBanner o() {
        GraduationBanner graduationBanner = this.graduationBanner_;
        return graduationBanner == null ? GraduationBanner.n() : graduationBanner;
    }

    public final MemberProfile p() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.n() : memberProfile;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
