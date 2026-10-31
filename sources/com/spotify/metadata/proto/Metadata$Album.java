package com.spotify.metadata.proto;

import com.google.protobuf.h;
import p.a01;
import p.bf40;
import p.eij0;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Metadata$Album extends h implements v2j0 {
    public static final int ARTIST_FIELD_NUMBER = 3;
    public static final int AVAILABILITY_FIELD_NUMBER = 23;
    public static final int CONTENT_ACCESS_STATUS_FIELD_NUMBER = 44;
    public static final int COPYRIGHT_FIELD_NUMBER = 13;
    public static final int COVER_FIELD_NUMBER = 9;
    public static final int COVER_GROUP_FIELD_NUMBER = 17;
    public static final int DATE_FIELD_NUMBER = 6;
    private static final Metadata$Album DEFAULT_INSTANCE;
    public static final int DISC_FIELD_NUMBER = 11;
    public static final int EXTERNAL_ID_FIELD_NUMBER = 10;
    public static final int GID_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int ORIGINAL_TITLE_FIELD_NUMBER = 18;
    private static volatile qzr0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 7;
    public static final int PRERELEASE_END_DATE_FIELD_NUMBER = 42;
    public static final int RELATED_FIELD_NUMBER = 15;
    public static final int RESTRICTION_FIELD_NUMBER = 14;
    public static final int REVIEW_FIELD_NUMBER = 12;
    public static final int SALE_PERIOD_FIELD_NUMBER = 16;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int TYPE_STR_FIELD_NUMBER = 20;
    public static final int VERSION_TITLE_FIELD_NUMBER = 19;
    private int bitField0_;
    private Metadata$ContentAccessStatus contentAccessStatus_;
    private Metadata$ImageGroup coverGroup_;
    private Metadata$Date date_;
    private int popularity_;
    private long prereleaseEndDate_;
    private phc gid_ = phc.b;
    private String name_ = "";
    private h290 artist_ = h.emptyProtobufList();
    private int type_ = 1;
    private String label_ = "";
    private h290 cover_ = h.emptyProtobufList();
    private h290 externalId_ = h.emptyProtobufList();
    private h290 disc_ = h.emptyProtobufList();
    private h290 review_ = h.emptyProtobufList();
    private h290 copyright_ = h.emptyProtobufList();
    private h290 restriction_ = h.emptyProtobufList();
    private h290 related_ = h.emptyProtobufList();
    private h290 salePeriod_ = h.emptyProtobufList();
    private String originalTitle_ = "";
    private String versionTitle_ = "";
    private String typeStr_ = "";
    private h290 availability_ = h.emptyProtobufList();

    static {
        Metadata$Album metadata$Album = new Metadata$Album();
        DEFAULT_INSTANCE = metadata$Album;
        h.registerDefaultInstance(Metadata$Album.class, metadata$Album);
    }

    private Metadata$Album() {
    }

    public static Metadata$Album p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001,\u0016\u0000\n\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003\u001b\u0004᠌\u0002\u0005ဈ\u0003\u0006ဉ\u0004\u0007ဏ\u0005\t\u001b\n\u001b\u000b\u001b\f\u001a\r\u001b\u000e\u001b\u000f\u001b\u0010\u001b\u0011ဉ\u0006\u0012ဈ\u0007\u0013ဈ\b\u0014ဈ\t\u0017\u001b*ဂ\n,ဉ\u000b", new Object[]{"bitField0_", "gid_", "name_", "artist_", Metadata$Artist.class, "type_", a01.l, "label_", "date_", "popularity_", "cover_", Metadata$Image.class, "externalId_", Metadata$ExternalId.class, "disc_", Metadata$Disc.class, "review_", "copyright_", Metadata$Copyright.class, "restriction_", Metadata$Restriction.class, "related_", Metadata$Album.class, "salePeriod_", Metadata$SalePeriod.class, "coverGroup_", "originalTitle_", "versionTitle_", "typeStr_", "availability_", Metadata$Availability.class, "prereleaseEndDate_", "contentAccessStatus_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Album();
        }
        if (iOrdinal == 4) {
            return new eij0(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (Metadata$Album.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final boolean hasDate() {
        return (this.bitField0_ & 16) != 0;
    }

    public final Metadata$ImageGroup n() {
        Metadata$ImageGroup metadata$ImageGroup = this.coverGroup_;
        return metadata$ImageGroup == null ? Metadata$ImageGroup.n() : metadata$ImageGroup;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Metadata$Date o() {
        Metadata$Date metadata$Date = this.date_;
        return metadata$Date == null ? Metadata$Date.n() : metadata$Date;
    }

    public final phc q() {
        return this.gid_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
