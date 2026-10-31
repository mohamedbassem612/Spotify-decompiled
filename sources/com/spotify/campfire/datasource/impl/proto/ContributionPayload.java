package com.spotify.campfire.datasource.impl.proto;

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
public final class ContributionPayload extends h implements ContributionPayloadOrBuilder {
    public static final int CHAT_EVENT_FIELD_NUMBER = 5;
    public static final int CHAT_INVITE_FIELD_NUMBER = 4;
    private static final ContributionPayload DEFAULT_INSTANCE;
    public static final int FREE_TEXT_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 7;
    public static final int OP_TRACKED_SHARE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RICH_MEDIA_FIELD_NUMBER = 6;
    public static final int TASTE_MATCH_CARD_FIELD_NUMBER = 8;
    public static final int TRACKED_SHARE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int ccpCase_ = 0;
    private Object ccp_;
    private ContributionMetadata metadata_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ContributionPayload$1, reason: invalid class name */
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
        ContributionPayload contributionPayload = new ContributionPayload();
        DEFAULT_INSTANCE = contributionPayload;
        h.registerDefaultInstance(ContributionPayload.class, contributionPayload);
    }

    private ContributionPayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcp() {
        this.ccpCase_ = 0;
        this.ccp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatEvent() {
        if (this.ccpCase_ == 5) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatInvite() {
        if (this.ccpCase_ == 4) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeText() {
        if (this.ccpCase_ == 1) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpTrackedShare() {
        if (this.ccpCase_ == 3) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRichMedia() {
        if (this.ccpCase_ == 6) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTasteMatchCard() {
        if (this.ccpCase_ == 8) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackedShare() {
        if (this.ccpCase_ == 2) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    public static ContributionPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatEvent(ChatEvent chatEvent) {
        chatEvent.getClass();
        if (this.ccpCase_ != 5 || this.ccp_ == ChatEvent.getDefaultInstance()) {
            this.ccp_ = chatEvent;
        } else {
            this.ccp_ = ((ChatEvent.Builder) ChatEvent.newBuilder((ChatEvent) this.ccp_).mergeFrom(chatEvent)).buildPartial();
        }
        this.ccpCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatInvite(ChatInvite chatInvite) {
        chatInvite.getClass();
        if (this.ccpCase_ != 4 || this.ccp_ == ChatInvite.getDefaultInstance()) {
            this.ccp_ = chatInvite;
        } else {
            this.ccp_ = ((ChatInvite.Builder) ChatInvite.newBuilder((ChatInvite) this.ccp_).mergeFrom(chatInvite)).buildPartial();
        }
        this.ccpCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFreeText(FreeText freeText) {
        freeText.getClass();
        if (this.ccpCase_ != 1 || this.ccp_ == FreeText.getDefaultInstance()) {
            this.ccp_ = freeText;
        } else {
            this.ccp_ = ((FreeText.Builder) FreeText.newBuilder((FreeText) this.ccp_).mergeFrom(freeText)).buildPartial();
        }
        this.ccpCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ContributionMetadata contributionMetadata) {
        contributionMetadata.getClass();
        ContributionMetadata contributionMetadata2 = this.metadata_;
        if (contributionMetadata2 == null || contributionMetadata2 == ContributionMetadata.getDefaultInstance()) {
            this.metadata_ = contributionMetadata;
        } else {
            this.metadata_ = (ContributionMetadata) ((ContributionMetadata.Builder) ContributionMetadata.newBuilder(this.metadata_).mergeFrom(contributionMetadata)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOpTrackedShare(OffplatformTrackedShare offplatformTrackedShare) {
        offplatformTrackedShare.getClass();
        if (this.ccpCase_ != 3 || this.ccp_ == OffplatformTrackedShare.getDefaultInstance()) {
            this.ccp_ = offplatformTrackedShare;
        } else {
            this.ccp_ = ((OffplatformTrackedShare.Builder) OffplatformTrackedShare.newBuilder((OffplatformTrackedShare) this.ccp_).mergeFrom(offplatformTrackedShare)).buildPartial();
        }
        this.ccpCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRichMedia(RichMedia richMedia) {
        richMedia.getClass();
        if (this.ccpCase_ != 6 || this.ccp_ == RichMedia.getDefaultInstance()) {
            this.ccp_ = richMedia;
        } else {
            this.ccp_ = ((RichMedia.Builder) RichMedia.newBuilder((RichMedia) this.ccp_).mergeFrom(richMedia)).buildPartial();
        }
        this.ccpCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTasteMatchCard(TasteMatchCard tasteMatchCard) {
        tasteMatchCard.getClass();
        if (this.ccpCase_ != 8 || this.ccp_ == TasteMatchCard.getDefaultInstance()) {
            this.ccp_ = tasteMatchCard;
        } else {
            this.ccp_ = ((TasteMatchCard.Builder) TasteMatchCard.newBuilder((TasteMatchCard) this.ccp_).mergeFrom(tasteMatchCard)).buildPartial();
        }
        this.ccpCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackedShare(TrackedShare trackedShare) {
        trackedShare.getClass();
        if (this.ccpCase_ != 2 || this.ccp_ == TrackedShare.getDefaultInstance()) {
            this.ccp_ = trackedShare;
        } else {
            this.ccp_ = ((TrackedShare.Builder) TrackedShare.newBuilder((TrackedShare) this.ccp_).mergeFrom(trackedShare)).buildPartial();
        }
        this.ccpCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ContributionPayload parseDelimitedFrom(InputStream inputStream) {
        return (ContributionPayload) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContributionPayload parseFrom(ByteBuffer byteBuffer) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatEvent(ChatEvent chatEvent) {
        chatEvent.getClass();
        this.ccp_ = chatEvent;
        this.ccpCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatInvite(ChatInvite chatInvite) {
        chatInvite.getClass();
        this.ccp_ = chatInvite;
        this.ccpCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeText(FreeText freeText) {
        freeText.getClass();
        this.ccp_ = freeText;
        this.ccpCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ContributionMetadata contributionMetadata) {
        contributionMetadata.getClass();
        this.metadata_ = contributionMetadata;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpTrackedShare(OffplatformTrackedShare offplatformTrackedShare) {
        offplatformTrackedShare.getClass();
        this.ccp_ = offplatformTrackedShare;
        this.ccpCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRichMedia(RichMedia richMedia) {
        richMedia.getClass();
        this.ccp_ = richMedia;
        this.ccpCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTasteMatchCard(TasteMatchCard tasteMatchCard) {
        tasteMatchCard.getClass();
        this.ccp_ = tasteMatchCard;
        this.ccpCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackedShare(TrackedShare trackedShare) {
        trackedShare.getClass();
        this.ccp_ = trackedShare;
        this.ccpCase_ = 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ဉ\u0000\b<\u0000", new Object[]{"ccp_", "ccpCase_", "bitField0_", FreeText.class, TrackedShare.class, OffplatformTrackedShare.class, ChatInvite.class, ChatEvent.class, RichMedia.class, "metadata_", TasteMatchCard.class});
        }
        if (iOrdinal == 3) {
            return new ContributionPayload();
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
        synchronized (ContributionPayload.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public CcpCase getCcpCase() {
        return CcpCase.forNumber(this.ccpCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public ChatEvent getChatEvent() {
        return this.ccpCase_ == 5 ? (ChatEvent) this.ccp_ : ChatEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public ChatInvite getChatInvite() {
        return this.ccpCase_ == 4 ? (ChatInvite) this.ccp_ : ChatInvite.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public FreeText getFreeText() {
        return this.ccpCase_ == 1 ? (FreeText) this.ccp_ : FreeText.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public ContributionMetadata getMetadata() {
        ContributionMetadata contributionMetadata = this.metadata_;
        return contributionMetadata == null ? ContributionMetadata.getDefaultInstance() : contributionMetadata;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public OffplatformTrackedShare getOpTrackedShare() {
        return this.ccpCase_ == 3 ? (OffplatformTrackedShare) this.ccp_ : OffplatformTrackedShare.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public RichMedia getRichMedia() {
        return this.ccpCase_ == 6 ? (RichMedia) this.ccp_ : RichMedia.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public TasteMatchCard getTasteMatchCard() {
        return this.ccpCase_ == 8 ? (TasteMatchCard) this.ccp_ : TasteMatchCard.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public TrackedShare getTrackedShare() {
        return this.ccpCase_ == 2 ? (TrackedShare) this.ccp_ : TrackedShare.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasChatEvent() {
        return this.ccpCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasChatInvite() {
        return this.ccpCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasFreeText() {
        return this.ccpCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasOpTrackedShare() {
        return this.ccpCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasRichMedia() {
        return this.ccpCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasTasteMatchCard() {
        return this.ccpCase_ == 8;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasTrackedShare() {
        return this.ccpCase_ == 2;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ContributionPayloadOrBuilder {
        private Builder() {
            super(ContributionPayload.DEFAULT_INSTANCE);
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

        public Builder clearCcp() {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).clearCcp();
            return this;
        }

        public Builder clearChatEvent() {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).clearChatEvent();
            return this;
        }

        public Builder clearChatInvite() {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).clearChatInvite();
            return this;
        }

        public Builder clearFreeText() {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).clearFreeText();
            return this;
        }

        public Builder clearMetadata() {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).clearMetadata();
            return this;
        }

        public Builder clearOpTrackedShare() {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).clearOpTrackedShare();
            return this;
        }

        public Builder clearRichMedia() {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).clearRichMedia();
            return this;
        }

        public Builder clearTasteMatchCard() {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).clearTasteMatchCard();
            return this;
        }

        public Builder clearTrackedShare() {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).clearTrackedShare();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public CcpCase getCcpCase() {
            return ((ContributionPayload) ((g) this).instance).getCcpCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public ChatEvent getChatEvent() {
            return ((ContributionPayload) ((g) this).instance).getChatEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public ChatInvite getChatInvite() {
            return ((ContributionPayload) ((g) this).instance).getChatInvite();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public FreeText getFreeText() {
            return ((ContributionPayload) ((g) this).instance).getFreeText();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public ContributionMetadata getMetadata() {
            return ((ContributionPayload) ((g) this).instance).getMetadata();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public OffplatformTrackedShare getOpTrackedShare() {
            return ((ContributionPayload) ((g) this).instance).getOpTrackedShare();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public RichMedia getRichMedia() {
            return ((ContributionPayload) ((g) this).instance).getRichMedia();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public TasteMatchCard getTasteMatchCard() {
            return ((ContributionPayload) ((g) this).instance).getTasteMatchCard();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public TrackedShare getTrackedShare() {
            return ((ContributionPayload) ((g) this).instance).getTrackedShare();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasChatEvent() {
            return ((ContributionPayload) ((g) this).instance).hasChatEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasChatInvite() {
            return ((ContributionPayload) ((g) this).instance).hasChatInvite();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasFreeText() {
            return ((ContributionPayload) ((g) this).instance).hasFreeText();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasMetadata() {
            return ((ContributionPayload) ((g) this).instance).hasMetadata();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasOpTrackedShare() {
            return ((ContributionPayload) ((g) this).instance).hasOpTrackedShare();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasRichMedia() {
            return ((ContributionPayload) ((g) this).instance).hasRichMedia();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasTasteMatchCard() {
            return ((ContributionPayload) ((g) this).instance).hasTasteMatchCard();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasTrackedShare() {
            return ((ContributionPayload) ((g) this).instance).hasTrackedShare();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeChatEvent(ChatEvent chatEvent) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).mergeChatEvent(chatEvent);
            return this;
        }

        public Builder mergeChatInvite(ChatInvite chatInvite) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).mergeChatInvite(chatInvite);
            return this;
        }

        public Builder mergeFreeText(FreeText freeText) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).mergeFreeText(freeText);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m135mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeMetadata(ContributionMetadata contributionMetadata) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).mergeMetadata(contributionMetadata);
            return this;
        }

        public Builder mergeOpTrackedShare(OffplatformTrackedShare offplatformTrackedShare) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).mergeOpTrackedShare(offplatformTrackedShare);
            return this;
        }

        public Builder mergeRichMedia(RichMedia richMedia) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).mergeRichMedia(richMedia);
            return this;
        }

        public Builder mergeTasteMatchCard(TasteMatchCard tasteMatchCard) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).mergeTasteMatchCard(tasteMatchCard);
            return this;
        }

        public Builder mergeTrackedShare(TrackedShare trackedShare) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).mergeTrackedShare(trackedShare);
            return this;
        }

        public Builder setChatEvent(ChatEvent.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setChatEvent((ChatEvent) builder.build());
            return this;
        }

        public Builder setChatInvite(ChatInvite.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setChatInvite((ChatInvite) builder.build());
            return this;
        }

        public Builder setFreeText(FreeText.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setFreeText((FreeText) builder.build());
            return this;
        }

        public Builder setMetadata(ContributionMetadata.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setMetadata((ContributionMetadata) builder.build());
            return this;
        }

        public Builder setOpTrackedShare(OffplatformTrackedShare.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setOpTrackedShare((OffplatformTrackedShare) builder.build());
            return this;
        }

        public Builder setRichMedia(RichMedia.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setRichMedia((RichMedia) builder.build());
            return this;
        }

        public Builder setTasteMatchCard(TasteMatchCard.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setTasteMatchCard((TasteMatchCard) builder.build());
            return this;
        }

        public Builder setTrackedShare(TrackedShare.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setTrackedShare((TrackedShare) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m134clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m136mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m133clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m137mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setChatEvent(ChatEvent chatEvent) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setChatEvent(chatEvent);
            return this;
        }

        public Builder setChatInvite(ChatInvite chatInvite) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setChatInvite(chatInvite);
            return this;
        }

        public Builder setFreeText(FreeText freeText) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setFreeText(freeText);
            return this;
        }

        public Builder setMetadata(ContributionMetadata contributionMetadata) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setMetadata(contributionMetadata);
            return this;
        }

        public Builder setOpTrackedShare(OffplatformTrackedShare offplatformTrackedShare) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setOpTrackedShare(offplatformTrackedShare);
            return this;
        }

        public Builder setRichMedia(RichMedia richMedia) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setRichMedia(richMedia);
            return this;
        }

        public Builder setTasteMatchCard(TasteMatchCard tasteMatchCard) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setTasteMatchCard(tasteMatchCard);
            return this;
        }

        public Builder setTrackedShare(TrackedShare trackedShare) {
            copyOnWrite();
            ((ContributionPayload) ((g) this).instance).setTrackedShare(trackedShare);
            return this;
        }
    }

    public enum CcpCase {
        FREE_TEXT(1),
        TRACKED_SHARE(2),
        OP_TRACKED_SHARE(3),
        CHAT_INVITE(4),
        CHAT_EVENT(5),
        RICH_MEDIA(6),
        TASTE_MATCH_CARD(8),
        CCP_NOT_SET(0);

        private final int value;

        CcpCase(int i) {
            this.value = i;
        }

        public static CcpCase forNumber(int i) {
            switch (i) {
                case 0:
                    return CCP_NOT_SET;
                case 1:
                    return FREE_TEXT;
                case 2:
                    return TRACKED_SHARE;
                case 3:
                    return OP_TRACKED_SHARE;
                case 4:
                    return CHAT_INVITE;
                case 5:
                    return CHAT_EVENT;
                case 6:
                    return RICH_MEDIA;
                case 7:
                default:
                    return null;
                case 8:
                    return TASTE_MATCH_CARD;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CcpCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(ContributionPayload contributionPayload) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(contributionPayload);
    }

    public static ContributionPayload parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ContributionPayload) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ContributionPayload parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ContributionPayload parseFrom(phc phcVar) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ContributionPayload parseFrom(phc phcVar, uz00 uz00Var) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ContributionPayload parseFrom(byte[] bArr) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContributionPayload parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ContributionPayload parseFrom(InputStream inputStream) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContributionPayload parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ContributionPayload parseFrom(lwg lwgVar) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ContributionPayload parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ContributionPayload) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
