package com.spotify.identity.proto.v3;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y070;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class IdentityV3$UserProfile extends h implements v2j0 {
    public static final int ABUSE_REPORTED_BIO_FIELD_NUMBER = 17;
    public static final int ABUSE_REPORTED_IMAGE_FIELD_NUMBER = 8;
    public static final int ABUSE_REPORTED_NAME_FIELD_NUMBER = 7;
    public static final int ACCOUNT_ID_FIELD_NUMBER = 24;
    public static final int BIO_FIELD_NUMBER = 15;
    public static final int COLOR_FIELD_NUMBER = 11;
    private static final IdentityV3$UserProfile DEFAULT_INSTANCE;
    public static final int EDIT_BIO_DISABLED_FIELD_NUMBER = 20;
    public static final int EDIT_IMAGE_DISABLED_FIELD_NUMBER = 19;
    public static final int EDIT_NAME_DISABLED_FIELD_NUMBER = 18;
    public static final int EDIT_PROFILE_DISABLED_FIELD_NUMBER = 5;
    public static final int HAS_SPOTIFY_IMAGE_FIELD_NUMBER = 10;
    public static final int HAS_SPOTIFY_NAME_FIELD_NUMBER = 9;
    public static final int IMAGES_FIELD_NUMBER = 3;
    public static final int IS_KID_FIELD_NUMBER = 21;
    public static final int IS_PRIVATE_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REPORT_ABUSE_DISABLED_FIELD_NUMBER = 6;
    public static final int SOCIAL_HANDLE_FIELD_NUMBER = 22;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int VERIFIED_FIELD_NUMBER = 4;
    private BoolValue abuseReportedBio_;
    private BoolValue abuseReportedImage_;
    private BoolValue abuseReportedName_;
    private StringValue accountId_;
    private StringValue bio_;
    private int bitField0_;
    private Int32Value color_;
    private BoolValue editBioDisabled_;
    private BoolValue editImageDisabled_;
    private BoolValue editNameDisabled_;
    private BoolValue editProfileDisabled_;
    private BoolValue hasSpotifyImage_;
    private BoolValue hasSpotifyName_;
    private h290 images_ = h.emptyProtobufList();
    private BoolValue isKid_;
    private BoolValue isPrivate_;
    private StringValue name_;
    private BoolValue reportAbuseDisabled_;
    private StringValue socialHandle_;
    private StringValue username_;
    private BoolValue verified_;

    static {
        IdentityV3$UserProfile identityV3$UserProfile = new IdentityV3$UserProfile();
        DEFAULT_INSTANCE = identityV3$UserProfile;
        h.registerDefaultInstance(IdentityV3$UserProfile.class, identityV3$UserProfile);
    }

    private IdentityV3$UserProfile() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u0018\u0014\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\fဉ\n\u000fဉ\u000b\u0011ဉ\f\u0012ဉ\r\u0013ဉ\u000e\u0014ဉ\u000f\u0015ဉ\u0010\u0016ဉ\u0011\u0018ဉ\u0012", new Object[]{"bitField0_", "username_", "name_", "images_", IdentityV3$Image.class, "verified_", "editProfileDisabled_", "reportAbuseDisabled_", "abuseReportedName_", "abuseReportedImage_", "hasSpotifyName_", "hasSpotifyImage_", "color_", "isPrivate_", "bio_", "abuseReportedBio_", "editNameDisabled_", "editImageDisabled_", "editBioDisabled_", "isKid_", "socialHandle_", "accountId_"});
        }
        if (iOrdinal == 3) {
            return new IdentityV3$UserProfile();
        }
        if (iOrdinal == 4) {
            return new y070((byte) 17);
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
        synchronized (IdentityV3$UserProfile.class) {
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

    public final Int32Value getColor() {
        Int32Value int32Value = this.color_;
        return int32Value == null ? Int32Value.o() : int32Value;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BoolValue o() {
        BoolValue boolValue = this.abuseReportedImage_;
        return boolValue == null ? BoolValue.o() : boolValue;
    }

    public final BoolValue p() {
        BoolValue boolValue = this.abuseReportedName_;
        return boolValue == null ? BoolValue.o() : boolValue;
    }

    public final StringValue q() {
        StringValue stringValue = this.accountId_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    public final BoolValue r() {
        BoolValue boolValue = this.editProfileDisabled_;
        return boolValue == null ? BoolValue.o() : boolValue;
    }

    public final BoolValue s() {
        BoolValue boolValue = this.hasSpotifyImage_;
        return boolValue == null ? BoolValue.o() : boolValue;
    }

    public final BoolValue t() {
        BoolValue boolValue = this.hasSpotifyName_;
        return boolValue == null ? BoolValue.o() : boolValue;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.images_;
    }

    public final BoolValue v() {
        BoolValue boolValue = this.isKid_;
        return boolValue == null ? BoolValue.o() : boolValue;
    }

    public final StringValue w() {
        StringValue stringValue = this.name_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    public final BoolValue x() {
        BoolValue boolValue = this.reportAbuseDisabled_;
        return boolValue == null ? BoolValue.o() : boolValue;
    }

    public final StringValue y() {
        StringValue stringValue = this.socialHandle_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    public final StringValue z() {
        StringValue stringValue = this.username_;
        return stringValue == null ? StringValue.o() : stringValue;
    }
}
