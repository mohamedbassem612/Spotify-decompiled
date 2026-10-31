package com.spotify.extendedmetadata.extensions.listmetadataimpl;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Attributes extends h implements v2j0 {
    public static final int ABUSE_REPORTING_ENABLED_FIELD_NUMBER = 12;
    public static final int ADDED_AT_FIELD_NUMBER = 18;
    public static final int ADDED_BY_USERNAME_FIELD_NUMBER = 6;
    public static final int AI_CURATION_FIELD_NUMBER = 17;
    public static final int APPROXIMATE_LENGTH_FIELD_NUMBER = 13;
    public static final int AVAILABLE_SIGNALS_FIELD_NUMBER = 14;
    public static final int CAPABILITIES_FIELD_NUMBER = 9;
    public static final int CLIENT_ID_FIELD_NUMBER = 22;
    public static final int CREATED_AT_FIELD_NUMBER = 8;
    private static final Attributes DEFAULT_INSTANCE;
    public static final int DELETED_BY_OWNER_FIELD_NUMBER = 19;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int FORMAT_FIELD_NUMBER = 23;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 24;
    public static final int GEOBLOCK_FIELD_NUMBER = 10;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int OWNER_USERNAME_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PICTURE_FILE_ID_FIELD_NUMBER = 20;
    public static final int PICTURE_SIZES_FIELD_NUMBER = 21;
    public static final int PUBLISHED_TO_PROFILE_FIELD_NUMBER = 15;
    public static final int RECOMMENDATION_INFO_FIELD_NUMBER = 16;
    public static final int REVISION_FIELD_NUMBER = 2;
    public static final int SEQUENCE_CHILD_TEMPLATE_FIELD_NUMBER = 26;
    public static final int SEQUENCE_CONTEXT_TEMPLATE_FIELD_NUMBER = 25;
    public static final int SOURCE_LENS_FIELD_NUMBER = 27;
    public static final int STATUS_CODE_FIELD_NUMBER = 11;
    public static final int UPDATED_AT_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private boolean abuseReportingEnabled_;
    private Timestamp addedAt_;
    private String addedByUsername_;
    private AiCuration aiCuration_;
    private long approximateLength_;
    private SignalsList availableSignals_;
    private int bitField0_;
    private Capabilities capabilities_;
    private String clientId_;
    private Timestamp createdAt_;
    private boolean deletedByOwner_;
    private String description_;
    private FormatListAttributes formatListAttributes_;
    private String format_;
    private Geoblock geoblock_;
    private String name_;
    private String ownerUsername_;
    private phc pictureFileId_;
    private PictureSizes pictureSizes_;
    private boolean publishedToProfile_;
    private RecommendationInfo recommendationInfo_;
    private phc revision_;
    private phc sequenceChildTemplate_;
    private phc sequenceContextTemplate_;
    private Lens sourceLens_;
    private int statusCode_;
    private Timestamp updatedAt_;
    private String uri_ = "";

    static {
        Attributes attributes = new Attributes();
        DEFAULT_INSTANCE = attributes;
        h.registerDefaultInstance(Attributes.class, attributes);
    }

    private Attributes() {
        hhc hhcVar = phc.b;
        this.revision_ = hhcVar;
        this.name_ = "";
        this.description_ = "";
        this.addedByUsername_ = "";
        this.ownerUsername_ = "";
        this.pictureFileId_ = hhcVar;
        this.clientId_ = "";
        this.format_ = "";
        this.sequenceContextTemplate_ = hhcVar;
        this.sequenceChildTemplate_ = hhcVar;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Attributes v(byte[] bArr) {
        return (Attributes) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0000\u0000\u0001ለ\u0000\u0002ည\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဉ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bင\n\fဇ\u000b\rဂ\f\u000eဉ\r\u000fဇ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဇ\u0012\u0014ည\u0013\u0015ဉ\u0014\u0016ለ\u0015\u0017ለ\u0016\u0018ဉ\u0017\u0019ည\u0018\u001aည\u0019\u001bဉ\u001a", new Object[]{"bitField0_", "uri_", "revision_", "name_", "description_", "updatedAt_", "addedByUsername_", "ownerUsername_", "createdAt_", "capabilities_", "geoblock_", "statusCode_", "abuseReportingEnabled_", "approximateLength_", "availableSignals_", "publishedToProfile_", "recommendationInfo_", "aiCuration_", "addedAt_", "deletedByOwner_", "pictureFileId_", "pictureSizes_", "clientId_", "format_", "formatListAttributes_", "sequenceContextTemplate_", "sequenceChildTemplate_", "sourceLens_"});
        }
        if (iOrdinal == 3) {
            return new Attributes();
        }
        if (iOrdinal == 4) {
            return new zg7((byte) 11);
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
        synchronized (Attributes.class) {
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

    public final Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final String getFormat() {
        return this.format_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getOwnerUsername() {
        return this.ownerUsername_;
    }

    public final Timestamp getUpdatedAt() {
        Timestamp timestamp = this.updatedAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AiCuration o() {
        AiCuration aiCuration = this.aiCuration_;
        return aiCuration == null ? AiCuration.o() : aiCuration;
    }

    public final long p() {
        return this.approximateLength_;
    }

    public final Capabilities q() {
        Capabilities capabilities = this.capabilities_;
        return capabilities == null ? Capabilities.u() : capabilities;
    }

    public final FormatListAttributes r() {
        FormatListAttributes formatListAttributes = this.formatListAttributes_;
        return formatListAttributes == null ? FormatListAttributes.p() : formatListAttributes;
    }

    public final phc s() {
        return this.pictureFileId_;
    }

    public final PictureSizes t() {
        PictureSizes pictureSizes = this.pictureSizes_;
        return pictureSizes == null ? PictureSizes.n() : pictureSizes;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4096) != 0;
    }
}
