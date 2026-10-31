package com.spotify.metadata.classic.proto;

import com.google.protobuf.h;
import java.util.List;
import p.a01;
import p.bf40;
import p.bjj0;
import p.cjj0;
import p.ejj0;
import p.h290;
import p.jf40;
import p.phc;
import p.qij0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$Show extends h implements v2j0 {
    public static final int AVAILABILITY_FIELD_NUMBER = 78;
    public static final int CATEGORIES_FIELD_NUMBER = 80;
    public static final int CONSUMPTION_ORDER_FIELD_NUMBER = 75;
    public static final int COPYRIGHT_FIELD_NUMBER = 71;
    public static final int COUNTRY_OF_ORIGIN_FIELD_NUMBER = 79;
    public static final int COVER_IMAGE_FIELD_NUMBER = 69;
    private static final Metadata$Show DEFAULT_INSTANCE;
    public static final int DEPRECATED_POPULARITY_FIELD_NUMBER = 65;
    public static final int DESCRIPTION_FIELD_NUMBER = 64;
    public static final int EMPLOYEE_ONLY_FIELD_NUMBER = 82;
    public static final int EXPLICIT_FIELD_NUMBER = 68;
    public static final int GID_FIELD_NUMBER = 1;
    public static final int INTERPRET_RESTRICTION_USING_GEOIP_FIELD_NUMBER = 76;
    public static final int IS_AUDIOBOOK_FIELD_NUMBER = 89;
    public static final int IS_CREATOR_CHANNEL_FIELD_NUMBER = 90;
    public static final int KEYWORD_FIELD_NUMBER = 73;
    public static final int LANGUAGE_FIELD_NUMBER = 67;
    public static final int LOCALIZED_NAME_FIELD_NUMBER = 29;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 74;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER = 85;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PASSTHROUGH_FIELD_NUMBER = 81;
    public static final int PUBLISHER_FIELD_NUMBER = 66;
    public static final int RESTRICTION_FIELD_NUMBER = 72;
    public static final int SALE_PERIOD_FIELD_NUMBER = 77;
    public static final int TRAILER_URI_FIELD_NUMBER = 83;
    private int bitField0_;
    private Metadata$ImageGroup coverImage_;
    private int deprecatedPopularity_;
    private boolean employeeOnly_;
    private boolean explicit_;
    private boolean interpretRestrictionUsingGeoip_;
    private boolean isAudiobook_;
    private boolean isCreatorChannel_;
    private int mediaType_;
    private boolean musicAndTalk_;
    private int passthrough_;
    private phc gid_ = phc.b;
    private String name_ = "";
    private h290 localizedName_ = h.emptyProtobufList();
    private String description_ = "";
    private String publisher_ = "";
    private String language_ = "";
    private h290 copyright_ = h.emptyProtobufList();
    private h290 restriction_ = h.emptyProtobufList();
    private h290 keyword_ = h.emptyProtobufList();
    private int consumptionOrder_ = 1;
    private h290 salePeriod_ = h.emptyProtobufList();
    private h290 availability_ = h.emptyProtobufList();
    private String countryOfOrigin_ = "";
    private h290 categories_ = h.emptyProtobufList();
    private String trailerUri_ = "";

    static {
        Metadata$Show metadata$Show = new Metadata$Show();
        DEFAULT_INSTANCE = metadata$Show;
        h.registerDefaultInstance(Metadata$Show.class, metadata$Show);
    }

    private Metadata$Show() {
    }

    public static Metadata$Show p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Metadata$Show v(byte[] bArr) {
        return (Metadata$Show) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0019\u0000\u0001\u0001Z\u0019\u0000\u0007\u0000\u0001ည\u0000\u0002ဈ\u0001\u001d\u001b@ဈ\u0002Aဏ\u0003Bဈ\u0004Cဈ\u0005Dဇ\u0006Eဉ\u0007G\u001bH\u001bI\u001aJ᠌\bK᠌\tLဇ\nM\u001bN\u001bOဈ\u000bP\u001bQ᠌\fRဇ\rSဈ\u000eUဇ\u000fYဇ\u0010Zဇ\u0011", new Object[]{"bitField0_", "gid_", "name_", "localizedName_", Metadata$LocalizedString.class, "description_", "deprecatedPopularity_", "publisher_", "language_", "explicit_", "coverImage_", "copyright_", Metadata$Copyright.class, "restriction_", Metadata$Restriction.class, "keyword_", "mediaType_", cjj0.c, "consumptionOrder_", a01.E, "interpretRestrictionUsingGeoip_", "salePeriod_", Metadata$SalePeriod.class, "availability_", Metadata$Availability.class, "countryOfOrigin_", "categories_", Metadata$Categories.class, "passthrough_", cjj0.d, "employeeOnly_", "trailerUri_", "musicAndTalk_", "isAudiobook_", "isCreatorChannel_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Show();
        }
        if (iOrdinal == 4) {
            return new qij0(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (Metadata$Show.class) {
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

    public final List getCopyrightList() {
        return this.copyright_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final String getLanguage() {
        return this.language_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getPublisher() {
        return this.publisher_;
    }

    public final String getTrailerUri() {
        return this.trailerUri_;
    }

    public final bjj0 n() {
        bjj0 bjj0VarA = bjj0.a(this.consumptionOrder_);
        return bjj0VarA == null ? bjj0.SEQUENTIAL : bjj0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Metadata$ImageGroup o() {
        Metadata$ImageGroup metadata$ImageGroup = this.coverImage_;
        return metadata$ImageGroup == null ? Metadata$ImageGroup.n() : metadata$ImageGroup;
    }

    public final boolean q() {
        return this.explicit_;
    }

    public final phc r() {
        return this.gid_;
    }

    public final boolean s() {
        return this.isAudiobook_;
    }

    public final ejj0 t() {
        ejj0 ejj0VarA = ejj0.a(this.mediaType_);
        return ejj0VarA == null ? ejj0.MIXED : ejj0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.musicAndTalk_;
    }
}
