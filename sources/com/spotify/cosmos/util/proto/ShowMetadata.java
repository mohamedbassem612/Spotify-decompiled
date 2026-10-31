package com.spotify.cosmos.util.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ShowMetadata extends h implements ShowMetadataOrBuilder {
    public static final int CONSUMPTION_ORDER_FIELD_NUMBER = 10;
    public static final int COPYRIGHT_FIELD_NUMBER = 12;
    public static final int COVERS_FIELD_NUMBER = 8;
    private static final ShowMetadata DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXTENSION_FIELD_NUMBER = 15;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 18;
    public static final int IS_BOOK_FIELD_NUMBER = 16;
    public static final int IS_CREATOR_CHANNEL_FIELD_NUMBER = 17;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 7;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 14;
    public static final int LANGUAGE_FIELD_NUMBER = 6;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 11;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_EPISODES_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 4;
    public static final int PUBLISHER_FIELD_NUMBER = 5;
    public static final int TRAILER_URI_FIELD_NUMBER = 13;
    private int bitField0_;
    private ImageGroup covers_;
    private boolean isBook_;
    private boolean isCreatorChannel_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private int mediaTypeEnum_;
    private int numEpisodes_;
    private int popularity_;
    private String link_ = "";
    private String name_ = "";
    private String description_ = "";
    private String publisher_ = "";
    private String language_ = "";
    private String consumptionOrder_ = "";
    private h290 copyright_ = h.emptyProtobufList();
    private String trailerUri_ = "";
    private h290 extension_ = h.emptyProtobufList();
    private h290 formatListAttributes_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.ShowMetadata$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[jf40.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ShowMetadata showMetadata = new ShowMetadata();
        DEFAULT_INSTANCE = showMetadata;
        h.registerDefaultInstance(ShowMetadata.class, showMetadata);
    }

    private ShowMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCopyright(Iterable<String> iterable) {
        ensureCopyrightIsMutable();
        s8.addAll(iterable, this.copyright_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends Extension> iterable) {
        ensureExtensionIsMutable();
        s8.addAll(iterable, this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFormatListAttributes(Iterable<? extends ShowListAttribute> iterable) {
        ensureFormatListAttributesIsMutable();
        s8.addAll(iterable, this.formatListAttributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCopyright(String str) {
        str.getClass();
        ensureCopyrightIsMutable();
        this.copyright_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCopyrightBytes(phc phcVar) {
        ensureCopyrightIsMutable();
        this.copyright_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFormatListAttributes(ShowListAttribute showListAttribute) {
        showListAttribute.getClass();
        ensureFormatListAttributesIsMutable();
        this.formatListAttributes_.add(showListAttribute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumptionOrder() {
        this.bitField0_ &= -513;
        this.consumptionOrder_ = getDefaultInstance().getConsumptionOrder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyright() {
        this.copyright_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -5;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFormatListAttributes() {
        this.formatListAttributes_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBook() {
        this.bitField0_ &= -8193;
        this.isBook_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCreatorChannel() {
        this.bitField0_ &= -16385;
        this.isCreatorChannel_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.bitField0_ &= -65;
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMusicAndTalk() {
        this.bitField0_ &= -4097;
        this.isMusicAndTalk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -33;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.bitField0_ &= -2;
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaTypeEnum() {
        this.bitField0_ &= -1025;
        this.mediaTypeEnum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumEpisodes() {
        this.bitField0_ &= -257;
        this.numEpisodes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularity() {
        this.bitField0_ &= -9;
        this.popularity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisher() {
        this.bitField0_ &= -17;
        this.publisher_ = getDefaultInstance().getPublisher();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrailerUri() {
        this.bitField0_ &= -2049;
        this.trailerUri_ = getDefaultInstance().getTrailerUri();
    }

    private void ensureCopyrightIsMutable() {
        i9 i9Var = this.copyright_;
        if (i9Var.a) {
            return;
        }
        this.copyright_ = h.mutableCopy(i9Var);
    }

    private void ensureExtensionIsMutable() {
        i9 i9Var = this.extension_;
        if (i9Var.a) {
            return;
        }
        this.extension_ = h.mutableCopy(i9Var);
    }

    private void ensureFormatListAttributesIsMutable() {
        i9 i9Var = this.formatListAttributes_;
        if (i9Var.a) {
            return;
        }
        this.formatListAttributes_ = h.mutableCopy(i9Var);
    }

    public static ShowMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.covers_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.covers_ = imageGroup;
        } else {
            this.covers_ = ImageGroup.newBuilder(this.covers_).mergeFrom(imageGroup).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowMetadata parseDelimitedFrom(InputStream inputStream) {
        return (ShowMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowMetadata parseFrom(ByteBuffer byteBuffer) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i) {
        ensureExtensionIsMutable();
        this.extension_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFormatListAttributes(int i) {
        ensureFormatListAttributesIsMutable();
        this.formatListAttributes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumptionOrder(String str) {
        str.getClass();
        this.bitField0_ |= NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
        this.consumptionOrder_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumptionOrderBytes(phc phcVar) {
        this.consumptionOrder_ = phcVar.v();
        this.bitField0_ |= NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyright(int i, String str) {
        str.getClass();
        ensureCopyrightIsMutable();
        this.copyright_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.covers_ = imageGroup;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(phc phcVar) {
        this.description_ = phcVar.v();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i, extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormatListAttributes(int i, ShowListAttribute showListAttribute) {
        showListAttribute.getClass();
        ensureFormatListAttributesIsMutable();
        this.formatListAttributes_.set(i, showListAttribute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBook(boolean z) {
        this.bitField0_ |= 8192;
        this.isBook_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCreatorChannel(boolean z) {
        this.bitField0_ |= 16384;
        this.isCreatorChannel_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.bitField0_ |= 64;
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMusicAndTalk(boolean z) {
        this.bitField0_ |= 4096;
        this.isMusicAndTalk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(phc phcVar) {
        this.language_ = phcVar.v();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(phc phcVar) {
        this.link_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaTypeEnum(int i) {
        this.bitField0_ |= 1024;
        this.mediaTypeEnum_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(phc phcVar) {
        this.name_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumEpisodes(int i) {
        this.bitField0_ |= 256;
        this.numEpisodes_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularity(int i) {
        this.bitField0_ |= 8;
        this.popularity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisher(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.publisher_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherBytes(phc phcVar) {
        this.publisher_ = phcVar.v();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrailerUri(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.trailerUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrailerUriBytes(phc phcVar) {
        this.trailerUri_ = phcVar.v();
        this.bitField0_ |= 2048;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဉ\u0007\tဋ\b\nဈ\t\u000bင\n\f\u001a\rဈ\u000b\u000eဇ\f\u000f\u001b\u0010ဇ\r\u0011ဇ\u000e\u0012\u001b", new Object[]{"bitField0_", "link_", "name_", "description_", "popularity_", "publisher_", "language_", "isExplicit_", "covers_", "numEpisodes_", "consumptionOrder_", "mediaTypeEnum_", "copyright_", "trailerUri_", "isMusicAndTalk_", "extension_", Extension.class, "isBook_", "isCreatorChannel_", "formatListAttributes_", ShowListAttribute.class});
        }
        if (iOrdinal == 3) {
            return new ShowMetadata();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (ShowMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getConsumptionOrder() {
        return this.consumptionOrder_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public phc getConsumptionOrderBytes() {
        return phc.i(this.consumptionOrder_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getCopyright(int i) {
        return (String) this.copyright_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public phc getCopyrightBytes(int i) {
        return phc.i((String) this.copyright_.get(i));
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getCopyrightCount() {
        return this.copyright_.size();
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public List<String> getCopyrightList() {
        return this.copyright_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public phc getDescriptionBytes() {
        return phc.i(this.description_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public Extension getExtension(int i) {
        return (Extension) this.extension_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public List<Extension> getExtensionList() {
        return this.extension_;
    }

    public ExtensionOrBuilder getExtensionOrBuilder(int i) {
        return (ExtensionOrBuilder) this.extension_.get(i);
    }

    public List<? extends ExtensionOrBuilder> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public ShowListAttribute getFormatListAttributes(int i) {
        return (ShowListAttribute) this.formatListAttributes_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getFormatListAttributesCount() {
        return this.formatListAttributes_.size();
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public List<ShowListAttribute> getFormatListAttributesList() {
        return this.formatListAttributes_;
    }

    public ShowListAttributeOrBuilder getFormatListAttributesOrBuilder(int i) {
        return (ShowListAttributeOrBuilder) this.formatListAttributes_.get(i);
    }

    public List<? extends ShowListAttributeOrBuilder> getFormatListAttributesOrBuilderList() {
        return this.formatListAttributes_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean getIsBook() {
        return this.isBook_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean getIsCreatorChannel() {
        return this.isCreatorChannel_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public phc getLanguageBytes() {
        return phc.i(this.language_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public phc getLinkBytes() {
        return phc.i(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getNumEpisodes() {
        return this.numEpisodes_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getPublisher() {
        return this.publisher_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public phc getPublisherBytes() {
        return phc.i(this.publisher_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getTrailerUri() {
        return this.trailerUri_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public phc getTrailerUriBytes() {
        return phc.i(this.trailerUri_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasConsumptionOrder() {
        return (this.bitField0_ & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasIsBook() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasIsCreatorChannel() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasIsExplicit() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasIsMusicAndTalk() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasLanguage() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasMediaTypeEnum() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasNumEpisodes() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasPopularity() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasPublisher() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasTrailerUri() {
        return (this.bitField0_ & 2048) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ShowMetadataOrBuilder {
        private Builder() {
            super(ShowMetadata.DEFAULT_INSTANCE);
        }

        public Builder addAllCopyright(Iterable<String> iterable) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addAllCopyright(iterable);
            return this;
        }

        public Builder addAllExtension(Iterable<? extends Extension> iterable) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addAllExtension(iterable);
            return this;
        }

        public Builder addAllFormatListAttributes(Iterable<? extends ShowListAttribute> iterable) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addAllFormatListAttributes(iterable);
            return this;
        }

        public Builder addCopyright(String str) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addCopyright(str);
            return this;
        }

        public Builder addCopyrightBytes(phc phcVar) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addCopyrightBytes(phcVar);
            return this;
        }

        public Builder addExtension(Extension$Builder extension$Builder) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addExtension(extension$Builder.build());
            return this;
        }

        public Builder addFormatListAttributes(ShowListAttribute.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addFormatListAttributes((ShowListAttribute) builder.build());
            return this;
        }

        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public Builder clearConsumptionOrder() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearConsumptionOrder();
            return this;
        }

        public Builder clearCopyright() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearCopyright();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearCovers();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearDescription();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearExtension();
            return this;
        }

        public Builder clearFormatListAttributes() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearFormatListAttributes();
            return this;
        }

        public Builder clearIsBook() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearIsBook();
            return this;
        }

        public Builder clearIsCreatorChannel() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearIsCreatorChannel();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsMusicAndTalk() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearIsMusicAndTalk();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearLanguage();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearLink();
            return this;
        }

        public Builder clearMediaTypeEnum() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearMediaTypeEnum();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearNumEpisodes() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearNumEpisodes();
            return this;
        }

        public Builder clearPopularity() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearPopularity();
            return this;
        }

        public Builder clearPublisher() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearPublisher();
            return this;
        }

        public Builder clearTrailerUri() {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).clearTrailerUri();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getConsumptionOrder() {
            return ((ShowMetadata) ((g) this).instance).getConsumptionOrder();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public phc getConsumptionOrderBytes() {
            return ((ShowMetadata) ((g) this).instance).getConsumptionOrderBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getCopyright(int i) {
            return ((ShowMetadata) ((g) this).instance).getCopyright(i);
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public phc getCopyrightBytes(int i) {
            return ((ShowMetadata) ((g) this).instance).getCopyrightBytes(i);
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getCopyrightCount() {
            return ((ShowMetadata) ((g) this).instance).getCopyrightCount();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public List<String> getCopyrightList() {
            return Collections.unmodifiableList(((ShowMetadata) ((g) this).instance).getCopyrightList());
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public ImageGroup getCovers() {
            return ((ShowMetadata) ((g) this).instance).getCovers();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getDescription() {
            return ((ShowMetadata) ((g) this).instance).getDescription();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public phc getDescriptionBytes() {
            return ((ShowMetadata) ((g) this).instance).getDescriptionBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public Extension getExtension(int i) {
            return ((ShowMetadata) ((g) this).instance).getExtension(i);
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getExtensionCount() {
            return ((ShowMetadata) ((g) this).instance).getExtensionCount();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public List<Extension> getExtensionList() {
            return Collections.unmodifiableList(((ShowMetadata) ((g) this).instance).getExtensionList());
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public ShowListAttribute getFormatListAttributes(int i) {
            return ((ShowMetadata) ((g) this).instance).getFormatListAttributes(i);
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getFormatListAttributesCount() {
            return ((ShowMetadata) ((g) this).instance).getFormatListAttributesCount();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public List<ShowListAttribute> getFormatListAttributesList() {
            return Collections.unmodifiableList(((ShowMetadata) ((g) this).instance).getFormatListAttributesList());
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean getIsBook() {
            return ((ShowMetadata) ((g) this).instance).getIsBook();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean getIsCreatorChannel() {
            return ((ShowMetadata) ((g) this).instance).getIsCreatorChannel();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean getIsExplicit() {
            return ((ShowMetadata) ((g) this).instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean getIsMusicAndTalk() {
            return ((ShowMetadata) ((g) this).instance).getIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getLanguage() {
            return ((ShowMetadata) ((g) this).instance).getLanguage();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public phc getLanguageBytes() {
            return ((ShowMetadata) ((g) this).instance).getLanguageBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getLink() {
            return ((ShowMetadata) ((g) this).instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public phc getLinkBytes() {
            return ((ShowMetadata) ((g) this).instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getMediaTypeEnum() {
            return ((ShowMetadata) ((g) this).instance).getMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getName() {
            return ((ShowMetadata) ((g) this).instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public phc getNameBytes() {
            return ((ShowMetadata) ((g) this).instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getNumEpisodes() {
            return ((ShowMetadata) ((g) this).instance).getNumEpisodes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getPopularity() {
            return ((ShowMetadata) ((g) this).instance).getPopularity();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getPublisher() {
            return ((ShowMetadata) ((g) this).instance).getPublisher();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public phc getPublisherBytes() {
            return ((ShowMetadata) ((g) this).instance).getPublisherBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getTrailerUri() {
            return ((ShowMetadata) ((g) this).instance).getTrailerUri();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public phc getTrailerUriBytes() {
            return ((ShowMetadata) ((g) this).instance).getTrailerUriBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasConsumptionOrder() {
            return ((ShowMetadata) ((g) this).instance).hasConsumptionOrder();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasCovers() {
            return ((ShowMetadata) ((g) this).instance).hasCovers();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasDescription() {
            return ((ShowMetadata) ((g) this).instance).hasDescription();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasIsBook() {
            return ((ShowMetadata) ((g) this).instance).hasIsBook();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasIsCreatorChannel() {
            return ((ShowMetadata) ((g) this).instance).hasIsCreatorChannel();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasIsExplicit() {
            return ((ShowMetadata) ((g) this).instance).hasIsExplicit();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasIsMusicAndTalk() {
            return ((ShowMetadata) ((g) this).instance).hasIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasLanguage() {
            return ((ShowMetadata) ((g) this).instance).hasLanguage();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasLink() {
            return ((ShowMetadata) ((g) this).instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasMediaTypeEnum() {
            return ((ShowMetadata) ((g) this).instance).hasMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasName() {
            return ((ShowMetadata) ((g) this).instance).hasName();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasNumEpisodes() {
            return ((ShowMetadata) ((g) this).instance).hasNumEpisodes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasPopularity() {
            return ((ShowMetadata) ((g) this).instance).hasPopularity();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasPublisher() {
            return ((ShowMetadata) ((g) this).instance).hasPublisher();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasTrailerUri() {
            return ((ShowMetadata) ((g) this).instance).hasTrailerUri();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).mergeCovers(imageGroup);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1461mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeExtension(int i) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).removeExtension(i);
            return this;
        }

        public Builder removeFormatListAttributes(int i) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).removeFormatListAttributes(i);
            return this;
        }

        public Builder setConsumptionOrder(String str) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setConsumptionOrder(str);
            return this;
        }

        public Builder setConsumptionOrderBytes(phc phcVar) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setConsumptionOrderBytes(phcVar);
            return this;
        }

        public Builder setCopyright(int i, String str) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setCopyright(i, str);
            return this;
        }

        public Builder setCovers(ImageGroup.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setCovers(builder.build());
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(phc phcVar) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setDescriptionBytes(phcVar);
            return this;
        }

        public Builder setExtension(int i, Extension$Builder extension$Builder) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setExtension(i, extension$Builder.build());
            return this;
        }

        public Builder setFormatListAttributes(int i, ShowListAttribute.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setFormatListAttributes(i, (ShowListAttribute) builder.build());
            return this;
        }

        public Builder setIsBook(boolean z) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setIsBook(z);
            return this;
        }

        public Builder setIsCreatorChannel(boolean z) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setIsCreatorChannel(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsMusicAndTalk(boolean z) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setIsMusicAndTalk(z);
            return this;
        }

        public Builder setLanguage(String str) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setLanguage(str);
            return this;
        }

        public Builder setLanguageBytes(phc phcVar) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setLanguageBytes(phcVar);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(phc phcVar) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setLinkBytes(phcVar);
            return this;
        }

        public Builder setMediaTypeEnum(int i) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setMediaTypeEnum(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setName(str);
            return this;
        }

        public Builder setNameBytes(phc phcVar) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setNameBytes(phcVar);
            return this;
        }

        public Builder setNumEpisodes(int i) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setNumEpisodes(i);
            return this;
        }

        public Builder setPopularity(int i) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setPopularity(i);
            return this;
        }

        public Builder setPublisher(String str) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setPublisher(str);
            return this;
        }

        public Builder setPublisherBytes(phc phcVar) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setPublisherBytes(phcVar);
            return this;
        }

        public Builder setTrailerUri(String str) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setTrailerUri(str);
            return this;
        }

        public Builder setTrailerUriBytes(phc phcVar) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setTrailerUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1460clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1462mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1459clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1463mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public Builder addExtension(int i, Extension extension) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addExtension(i, extension);
            return this;
        }

        public Builder addFormatListAttributes(int i, ShowListAttribute showListAttribute) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addFormatListAttributes(i, showListAttribute);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setCovers(imageGroup);
            return this;
        }

        public Builder setExtension(int i, Extension extension) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setExtension(i, extension);
            return this;
        }

        public Builder setFormatListAttributes(int i, ShowListAttribute showListAttribute) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).setFormatListAttributes(i, showListAttribute);
            return this;
        }

        public Builder addExtension(Extension extension) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addExtension(extension);
            return this;
        }

        public Builder addFormatListAttributes(ShowListAttribute showListAttribute) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addFormatListAttributes(showListAttribute);
            return this;
        }

        public Builder addExtension(int i, Extension$Builder extension$Builder) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addExtension(i, extension$Builder.build());
            return this;
        }

        public Builder addFormatListAttributes(int i, ShowListAttribute.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) ((g) this).instance).addFormatListAttributes(i, (ShowListAttribute) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ShowMetadata showMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showMetadata);
    }

    public static ShowMetadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowMetadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ShowMetadata parseFrom(phc phcVar) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ShowMetadata parseFrom(phc phcVar, uz00 uz00Var) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i, extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFormatListAttributes(int i, ShowListAttribute showListAttribute) {
        showListAttribute.getClass();
        ensureFormatListAttributesIsMutable();
        this.formatListAttributes_.add(i, showListAttribute);
    }

    public static ShowMetadata parseFrom(byte[] bArr) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowMetadata parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ShowMetadata parseFrom(InputStream inputStream) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowMetadata parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowMetadata parseFrom(lwg lwgVar) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ShowMetadata parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ShowMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
