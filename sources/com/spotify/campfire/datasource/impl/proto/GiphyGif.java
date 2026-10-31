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
public final class GiphyGif extends h implements GiphyGifOrBuilder {
    public static final int AGE_RATING_FIELD_NUMBER = 2;
    private static final GiphyGif DEFAULT_INSTANCE;
    public static final int GIF_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int ageRating_;
    private String gifId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.GiphyGif$1, reason: invalid class name */
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
        GiphyGif giphyGif = new GiphyGif();
        DEFAULT_INSTANCE = giphyGif;
        h.registerDefaultInstance(GiphyGif.class, giphyGif);
    }

    private GiphyGif() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeRating() {
        this.ageRating_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGifId() {
        this.gifId_ = getDefaultInstance().getGifId();
    }

    public static GiphyGif getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GiphyGif parseDelimitedFrom(InputStream inputStream) {
        return (GiphyGif) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GiphyGif parseFrom(ByteBuffer byteBuffer) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeRating(GiphyAgeRating giphyAgeRating) {
        this.ageRating_ = giphyAgeRating.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeRatingValue(int i) {
        this.ageRating_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGifId(String str) {
        str.getClass();
        this.gifId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGifIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.gifId_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"gifId_", "ageRating_"});
        }
        if (iOrdinal == 3) {
            return new GiphyGif();
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
        synchronized (GiphyGif.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
    public GiphyAgeRating getAgeRating() {
        GiphyAgeRating giphyAgeRatingForNumber = GiphyAgeRating.forNumber(this.ageRating_);
        return giphyAgeRatingForNumber == null ? GiphyAgeRating.UNRECOGNIZED : giphyAgeRatingForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
    public int getAgeRatingValue() {
        return this.ageRating_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
    public String getGifId() {
        return this.gifId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
    public phc getGifIdBytes() {
        return phc.i(this.gifId_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GiphyGifOrBuilder {
        private Builder() {
            super(GiphyGif.DEFAULT_INSTANCE);
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

        public Builder clearAgeRating() {
            copyOnWrite();
            ((GiphyGif) ((g) this).instance).clearAgeRating();
            return this;
        }

        public Builder clearGifId() {
            copyOnWrite();
            ((GiphyGif) ((g) this).instance).clearGifId();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
        public GiphyAgeRating getAgeRating() {
            return ((GiphyGif) ((g) this).instance).getAgeRating();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
        public int getAgeRatingValue() {
            return ((GiphyGif) ((g) this).instance).getAgeRatingValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
        public String getGifId() {
            return ((GiphyGif) ((g) this).instance).getGifId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GiphyGifOrBuilder
        public phc getGifIdBytes() {
            return ((GiphyGif) ((g) this).instance).getGifIdBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m340mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAgeRating(GiphyAgeRating giphyAgeRating) {
            copyOnWrite();
            ((GiphyGif) ((g) this).instance).setAgeRating(giphyAgeRating);
            return this;
        }

        public Builder setAgeRatingValue(int i) {
            copyOnWrite();
            ((GiphyGif) ((g) this).instance).setAgeRatingValue(i);
            return this;
        }

        public Builder setGifId(String str) {
            copyOnWrite();
            ((GiphyGif) ((g) this).instance).setGifId(str);
            return this;
        }

        public Builder setGifIdBytes(phc phcVar) {
            copyOnWrite();
            ((GiphyGif) ((g) this).instance).setGifIdBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m339clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m341mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m338clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m342mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(GiphyGif giphyGif) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(giphyGif);
    }

    public static GiphyGif parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GiphyGif) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GiphyGif parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GiphyGif parseFrom(phc phcVar) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GiphyGif parseFrom(phc phcVar, uz00 uz00Var) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GiphyGif parseFrom(byte[] bArr) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GiphyGif parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GiphyGif parseFrom(InputStream inputStream) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GiphyGif parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GiphyGif parseFrom(lwg lwgVar) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GiphyGif parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GiphyGif) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
