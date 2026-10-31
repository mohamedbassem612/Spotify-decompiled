package com.spotify.kidsaccount.api.v2.proto;

import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetChildAccountSettingsResponse extends h implements v2j0 {
    public static final int COLOR_FIELD_NUMBER = 11;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    public static final int DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 4;
    public static final int DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 3;
    private static final GetChildAccountSettingsResponse DEFAULT_INSTANCE;
    public static final int ENFORCED_DATE_OF_BIRTH_MAX_DATE_FIELD_NUMBER = 6;
    public static final int ENFORCED_DATE_OF_BIRTH_MIN_DATE_FIELD_NUMBER = 5;
    public static final int IMAGE_URI_FIELD_NUMBER = 10;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PARENTAL_CONTROL_CONNECT_FIELD_NUMBER = 7;
    public static final int PARENTAL_CONTROL_EXPLICIT_CONTENT_FIELD_NUMBER = 8;
    public static final int PARENTAL_CONTROL_VIDEO_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Int32Value color_;
    private StringValue imageUri_;
    private ParentalControl parentalControlConnect_;
    private ParentalControl parentalControlExplicitContent_;
    private ParentalControl parentalControlVideo_;
    private String name_ = "";
    private String dateOfBirth_ = "";
    private String dateOfBirthMinDate_ = "";
    private String dateOfBirthMaxDate_ = "";
    private String enforcedDateOfBirthMinDate_ = "";
    private String enforcedDateOfBirthMaxDate_ = "";

    static {
        GetChildAccountSettingsResponse getChildAccountSettingsResponse = new GetChildAccountSettingsResponse();
        DEFAULT_INSTANCE = getChildAccountSettingsResponse;
        h.registerDefaultInstance(GetChildAccountSettingsResponse.class, getChildAccountSettingsResponse);
    }

    private GetChildAccountSettingsResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\tဉ\u0002\nဉ\u0003\u000bဉ\u0004", new Object[]{"bitField0_", "name_", "dateOfBirth_", "dateOfBirthMinDate_", "dateOfBirthMaxDate_", "enforcedDateOfBirthMinDate_", "enforcedDateOfBirthMaxDate_", "parentalControlConnect_", "parentalControlExplicitContent_", "parentalControlVideo_", "imageUri_", "color_"});
        }
        if (iOrdinal == 3) {
            return new GetChildAccountSettingsResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (GetChildAccountSettingsResponse.class) {
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

    public final StringValue getImageUri() {
        StringValue stringValue = this.imageUri_;
        return stringValue == null ? StringValue.o() : stringValue;
    }

    public final String getName() {
        return this.name_;
    }

    public final String n() {
        return this.enforcedDateOfBirthMinDate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ParentalControl o() {
        ParentalControl parentalControl = this.parentalControlExplicitContent_;
        return parentalControl == null ? ParentalControl.n() : parentalControl;
    }

    public final ParentalControl p() {
        ParentalControl parentalControl = this.parentalControlVideo_;
        return parentalControl == null ? ParentalControl.n() : parentalControl;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
