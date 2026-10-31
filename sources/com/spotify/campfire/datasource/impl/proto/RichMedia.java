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
public final class RichMedia extends h implements RichMediaOrBuilder {
    private static final RichMedia DEFAULT_INSTANCE;
    public static final int GIPHY_GIF_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int STICKER_FIELD_NUMBER = 2;
    public static final int UGC_FIELD_NUMBER = 3;
    private int mediaTypeCase_ = 0;
    private Object mediaType_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.RichMedia$1, reason: invalid class name */
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
        RichMedia richMedia = new RichMedia();
        DEFAULT_INSTANCE = richMedia;
        h.registerDefaultInstance(RichMedia.class, richMedia);
    }

    private RichMedia() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGiphyGif() {
        if (this.mediaTypeCase_ == 1) {
            this.mediaTypeCase_ = 0;
            this.mediaType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaType() {
        this.mediaTypeCase_ = 0;
        this.mediaType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSticker() {
        if (this.mediaTypeCase_ == 2) {
            this.mediaTypeCase_ = 0;
            this.mediaType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgc() {
        if (this.mediaTypeCase_ == 3) {
            this.mediaTypeCase_ = 0;
            this.mediaType_ = null;
        }
    }

    public static RichMedia getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGiphyGif(GiphyGif giphyGif) {
        giphyGif.getClass();
        if (this.mediaTypeCase_ != 1 || this.mediaType_ == GiphyGif.getDefaultInstance()) {
            this.mediaType_ = giphyGif;
        } else {
            this.mediaType_ = ((GiphyGif.Builder) GiphyGif.newBuilder((GiphyGif) this.mediaType_).mergeFrom(giphyGif)).buildPartial();
        }
        this.mediaTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSticker(Sticker sticker) {
        sticker.getClass();
        if (this.mediaTypeCase_ != 2 || this.mediaType_ == Sticker.getDefaultInstance()) {
            this.mediaType_ = sticker;
        } else {
            this.mediaType_ = ((Sticker.Builder) Sticker.newBuilder((Sticker) this.mediaType_).mergeFrom(sticker)).buildPartial();
        }
        this.mediaTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgc(UGC ugc) {
        ugc.getClass();
        if (this.mediaTypeCase_ != 3 || this.mediaType_ == UGC.getDefaultInstance()) {
            this.mediaType_ = ugc;
        } else {
            this.mediaType_ = ((UGC.Builder) UGC.newBuilder((UGC) this.mediaType_).mergeFrom(ugc)).buildPartial();
        }
        this.mediaTypeCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RichMedia parseDelimitedFrom(InputStream inputStream) {
        return (RichMedia) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RichMedia parseFrom(ByteBuffer byteBuffer) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGiphyGif(GiphyGif giphyGif) {
        giphyGif.getClass();
        this.mediaType_ = giphyGif;
        this.mediaTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSticker(Sticker sticker) {
        sticker.getClass();
        this.mediaType_ = sticker;
        this.mediaTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgc(UGC ugc) {
        ugc.getClass();
        this.mediaType_ = ugc;
        this.mediaTypeCase_ = 3;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"mediaType_", "mediaTypeCase_", GiphyGif.class, Sticker.class, UGC.class});
        }
        if (iOrdinal == 3) {
            return new RichMedia();
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
        synchronized (RichMedia.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public GiphyGif getGiphyGif() {
        return this.mediaTypeCase_ == 1 ? (GiphyGif) this.mediaType_ : GiphyGif.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public MediaTypeCase getMediaTypeCase() {
        return MediaTypeCase.forNumber(this.mediaTypeCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public Sticker getSticker() {
        return this.mediaTypeCase_ == 2 ? (Sticker) this.mediaType_ : Sticker.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public UGC getUgc() {
        return this.mediaTypeCase_ == 3 ? (UGC) this.mediaType_ : UGC.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public boolean hasGiphyGif() {
        return this.mediaTypeCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public boolean hasSticker() {
        return this.mediaTypeCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
    public boolean hasUgc() {
        return this.mediaTypeCase_ == 3;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements RichMediaOrBuilder {
        private Builder() {
            super(RichMedia.DEFAULT_INSTANCE);
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

        public Builder clearGiphyGif() {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).clearGiphyGif();
            return this;
        }

        public Builder clearMediaType() {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).clearMediaType();
            return this;
        }

        public Builder clearSticker() {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).clearSticker();
            return this;
        }

        public Builder clearUgc() {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).clearUgc();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public GiphyGif getGiphyGif() {
            return ((RichMedia) ((g) this).instance).getGiphyGif();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public MediaTypeCase getMediaTypeCase() {
            return ((RichMedia) ((g) this).instance).getMediaTypeCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public Sticker getSticker() {
            return ((RichMedia) ((g) this).instance).getSticker();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public UGC getUgc() {
            return ((RichMedia) ((g) this).instance).getUgc();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public boolean hasGiphyGif() {
            return ((RichMedia) ((g) this).instance).hasGiphyGif();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public boolean hasSticker() {
            return ((RichMedia) ((g) this).instance).hasSticker();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RichMediaOrBuilder
        public boolean hasUgc() {
            return ((RichMedia) ((g) this).instance).hasUgc();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m689mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeGiphyGif(GiphyGif giphyGif) {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).mergeGiphyGif(giphyGif);
            return this;
        }

        public Builder mergeSticker(Sticker sticker) {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).mergeSticker(sticker);
            return this;
        }

        public Builder mergeUgc(UGC ugc) {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).mergeUgc(ugc);
            return this;
        }

        public Builder setGiphyGif(GiphyGif.Builder builder) {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).setGiphyGif((GiphyGif) builder.build());
            return this;
        }

        public Builder setSticker(Sticker.Builder builder) {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).setSticker((Sticker) builder.build());
            return this;
        }

        public Builder setUgc(UGC.Builder builder) {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).setUgc((UGC) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m688clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m690mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m687clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m691mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setGiphyGif(GiphyGif giphyGif) {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).setGiphyGif(giphyGif);
            return this;
        }

        public Builder setSticker(Sticker sticker) {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).setSticker(sticker);
            return this;
        }

        public Builder setUgc(UGC ugc) {
            copyOnWrite();
            ((RichMedia) ((g) this).instance).setUgc(ugc);
            return this;
        }
    }

    public enum MediaTypeCase {
        GIPHY_GIF(1),
        STICKER(2),
        UGC(3),
        MEDIATYPE_NOT_SET(0);

        private final int value;

        MediaTypeCase(int i) {
            this.value = i;
        }

        public static MediaTypeCase forNumber(int i) {
            if (i == 0) {
                return MEDIATYPE_NOT_SET;
            }
            if (i == 1) {
                return GIPHY_GIF;
            }
            if (i == 2) {
                return STICKER;
            }
            if (i != 3) {
                return null;
            }
            return UGC;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MediaTypeCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(RichMedia richMedia) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(richMedia);
    }

    public static RichMedia parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (RichMedia) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RichMedia parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static RichMedia parseFrom(phc phcVar) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static RichMedia parseFrom(phc phcVar, uz00 uz00Var) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static RichMedia parseFrom(byte[] bArr) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RichMedia parseFrom(byte[] bArr, uz00 uz00Var) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static RichMedia parseFrom(InputStream inputStream) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RichMedia parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static RichMedia parseFrom(lwg lwgVar) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static RichMedia parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (RichMedia) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
