package com.spotify.cosmos.util.libs.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
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
public final class ShowDecorationPolicy extends h implements ShowDecorationPolicyOrBuilder {
    public static final int CONSUMPTION_ORDER_FIELD_NUMBER = 10;
    public static final int COPYRIGHTS_FIELD_NUMBER = 12;
    public static final int COVERS_FIELD_NUMBER = 8;
    private static final ShowDecorationPolicy DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 19;
    public static final int IS_BOOK_FIELD_NUMBER = 17;
    public static final int IS_CREATOR_CHANNEL_FIELD_NUMBER = 18;
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
    private boolean consumptionOrder_;
    private boolean copyrights_;
    private boolean covers_;
    private boolean description_;
    private boolean formatListAttributes_;
    private boolean isBook_;
    private boolean isCreatorChannel_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private boolean language_;
    private boolean link_;
    private boolean mediaTypeEnum_;
    private boolean name_;
    private boolean numEpisodes_;
    private boolean popularity_;
    private boolean publisher_;
    private boolean trailerUri_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.ShowDecorationPolicy$1, reason: invalid class name */
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
        ShowDecorationPolicy showDecorationPolicy = new ShowDecorationPolicy();
        DEFAULT_INSTANCE = showDecorationPolicy;
        h.registerDefaultInstance(ShowDecorationPolicy.class, showDecorationPolicy);
    }

    private ShowDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumptionOrder() {
        this.consumptionOrder_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyrights() {
        this.copyrights_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFormatListAttributes() {
        this.formatListAttributes_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBook() {
        this.isBook_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCreatorChannel() {
        this.isCreatorChannel_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMusicAndTalk() {
        this.isMusicAndTalk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaTypeEnum() {
        this.mediaTypeEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumEpisodes() {
        this.numEpisodes_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularity() {
        this.popularity_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisher() {
        this.publisher_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrailerUri() {
        this.trailerUri_ = false;
    }

    public static ShowDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ShowDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumptionOrder(boolean z) {
        this.consumptionOrder_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrights(boolean z) {
        this.copyrights_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(boolean z) {
        this.covers_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(boolean z) {
        this.description_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormatListAttributes(boolean z) {
        this.formatListAttributes_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBook(boolean z) {
        this.isBook_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCreatorChannel(boolean z) {
        this.isCreatorChannel_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMusicAndTalk(boolean z) {
        this.isMusicAndTalk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(boolean z) {
        this.language_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(boolean z) {
        this.link_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaTypeEnum(boolean z) {
        this.mediaTypeEnum_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(boolean z) {
        this.name_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumEpisodes(boolean z) {
        this.numEpisodes_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularity(boolean z) {
        this.popularity_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisher(boolean z) {
        this.publisher_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrailerUri(boolean z) {
        this.trailerUri_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0013\u0011\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u0011\u0007\u0012\u0007\u0013\u0007", new Object[]{"link_", "name_", "description_", "popularity_", "publisher_", "language_", "isExplicit_", "covers_", "numEpisodes_", "consumptionOrder_", "mediaTypeEnum_", "copyrights_", "trailerUri_", "isMusicAndTalk_", "isBook_", "isCreatorChannel_", "formatListAttributes_"});
        }
        if (iOrdinal == 3) {
            return new ShowDecorationPolicy();
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
        synchronized (ShowDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getConsumptionOrder() {
        return this.consumptionOrder_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getCopyrights() {
        return this.copyrights_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getFormatListAttributes() {
        return this.formatListAttributes_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getIsBook() {
        return this.isBook_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getIsCreatorChannel() {
        return this.isCreatorChannel_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getNumEpisodes() {
        return this.numEpisodes_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getPublisher() {
        return this.publisher_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
    public boolean getTrailerUri() {
        return this.trailerUri_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ShowDecorationPolicyOrBuilder {
        private Builder() {
            super(ShowDecorationPolicy.DEFAULT_INSTANCE);
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
            ((ShowDecorationPolicy) ((g) this).instance).clearConsumptionOrder();
            return this;
        }

        public Builder clearCopyrights() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearCopyrights();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearCovers();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearDescription();
            return this;
        }

        public Builder clearFormatListAttributes() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearFormatListAttributes();
            return this;
        }

        public Builder clearIsBook() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearIsBook();
            return this;
        }

        public Builder clearIsCreatorChannel() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearIsCreatorChannel();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsMusicAndTalk() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearIsMusicAndTalk();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearLanguage();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearLink();
            return this;
        }

        public Builder clearMediaTypeEnum() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearMediaTypeEnum();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearNumEpisodes() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearNumEpisodes();
            return this;
        }

        public Builder clearPopularity() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearPopularity();
            return this;
        }

        public Builder clearPublisher() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearPublisher();
            return this;
        }

        public Builder clearTrailerUri() {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).clearTrailerUri();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getConsumptionOrder() {
            return ((ShowDecorationPolicy) ((g) this).instance).getConsumptionOrder();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getCopyrights() {
            return ((ShowDecorationPolicy) ((g) this).instance).getCopyrights();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((ShowDecorationPolicy) ((g) this).instance).getCovers();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getDescription() {
            return ((ShowDecorationPolicy) ((g) this).instance).getDescription();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getFormatListAttributes() {
            return ((ShowDecorationPolicy) ((g) this).instance).getFormatListAttributes();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getIsBook() {
            return ((ShowDecorationPolicy) ((g) this).instance).getIsBook();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getIsCreatorChannel() {
            return ((ShowDecorationPolicy) ((g) this).instance).getIsCreatorChannel();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((ShowDecorationPolicy) ((g) this).instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getIsMusicAndTalk() {
            return ((ShowDecorationPolicy) ((g) this).instance).getIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getLanguage() {
            return ((ShowDecorationPolicy) ((g) this).instance).getLanguage();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((ShowDecorationPolicy) ((g) this).instance).getLink();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getMediaTypeEnum() {
            return ((ShowDecorationPolicy) ((g) this).instance).getMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getName() {
            return ((ShowDecorationPolicy) ((g) this).instance).getName();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getNumEpisodes() {
            return ((ShowDecorationPolicy) ((g) this).instance).getNumEpisodes();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getPopularity() {
            return ((ShowDecorationPolicy) ((g) this).instance).getPopularity();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getPublisher() {
            return ((ShowDecorationPolicy) ((g) this).instance).getPublisher();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowDecorationPolicyOrBuilder
        public boolean getTrailerUri() {
            return ((ShowDecorationPolicy) ((g) this).instance).getTrailerUri();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1325mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setConsumptionOrder(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setConsumptionOrder(z);
            return this;
        }

        public Builder setCopyrights(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setCopyrights(z);
            return this;
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setCovers(z);
            return this;
        }

        public Builder setDescription(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setDescription(z);
            return this;
        }

        public Builder setFormatListAttributes(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setFormatListAttributes(z);
            return this;
        }

        public Builder setIsBook(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setIsBook(z);
            return this;
        }

        public Builder setIsCreatorChannel(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setIsCreatorChannel(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsMusicAndTalk(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setIsMusicAndTalk(z);
            return this;
        }

        public Builder setLanguage(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setLanguage(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setLink(z);
            return this;
        }

        public Builder setMediaTypeEnum(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setMediaTypeEnum(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setName(z);
            return this;
        }

        public Builder setNumEpisodes(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setNumEpisodes(z);
            return this;
        }

        public Builder setPopularity(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setPopularity(z);
            return this;
        }

        public Builder setPublisher(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setPublisher(z);
            return this;
        }

        public Builder setTrailerUri(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) ((g) this).instance).setTrailerUri(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1324clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1326mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1323clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1327mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }
    }

    public static Builder newBuilder(ShowDecorationPolicy showDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showDecorationPolicy);
    }

    public static ShowDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ShowDecorationPolicy parseFrom(phc phcVar) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ShowDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ShowDecorationPolicy parseFrom(byte[] bArr) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ShowDecorationPolicy parseFrom(InputStream inputStream) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowDecorationPolicy parseFrom(lwg lwgVar) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ShowDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ShowDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
