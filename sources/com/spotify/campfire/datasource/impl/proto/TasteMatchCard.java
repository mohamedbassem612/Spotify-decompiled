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
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TasteMatchCard extends h implements TasteMatchCardOrBuilder {
    private static final TasteMatchCard DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 1;
    public static final int RESULT_FIELD_NUMBER = 2;
    private int stateCase_ = 0;
    private Object state_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.TasteMatchCard$1, reason: invalid class name */
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

    public interface PlaceholderOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface TasteMatchOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        String getSharedArtistUris();

        phc getSharedArtistUrisBytes();

        String getSharedTrackUris();

        phc getSharedTrackUrisBytes();

        boolean hasSharedArtistUris();

        boolean hasSharedTrackUris();

        /* synthetic */ boolean isInitialized();
    }

    public interface TasteMatchResultOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        int getMatchPercentage();

        TasteMatch getTasteMatch();

        @Deprecated
        float getTasteMatchScore();

        boolean hasMatchPercentage();

        boolean hasTasteMatch();

        @Deprecated
        boolean hasTasteMatchScore();

        /* synthetic */ boolean isInitialized();
    }

    static {
        TasteMatchCard tasteMatchCard = new TasteMatchCard();
        DEFAULT_INSTANCE = tasteMatchCard;
        h.registerDefaultInstance(TasteMatchCard.class, tasteMatchCard);
    }

    private TasteMatchCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceholder() {
        if (this.stateCase_ == 1) {
            this.stateCase_ = 0;
            this.state_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        if (this.stateCase_ == 2) {
            this.stateCase_ = 0;
            this.state_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.stateCase_ = 0;
        this.state_ = null;
    }

    public static TasteMatchCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaceholder(Placeholder placeholder) {
        placeholder.getClass();
        if (this.stateCase_ != 1 || this.state_ == Placeholder.getDefaultInstance()) {
            this.state_ = placeholder;
        } else {
            this.state_ = ((Placeholder.Builder) Placeholder.newBuilder((Placeholder) this.state_).mergeFrom(placeholder)).buildPartial();
        }
        this.stateCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResult(TasteMatchResult tasteMatchResult) {
        tasteMatchResult.getClass();
        if (this.stateCase_ != 2 || this.state_ == TasteMatchResult.getDefaultInstance()) {
            this.state_ = tasteMatchResult;
        } else {
            this.state_ = ((TasteMatchResult.Builder) TasteMatchResult.newBuilder((TasteMatchResult) this.state_).mergeFrom(tasteMatchResult)).buildPartial();
        }
        this.stateCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TasteMatchCard parseDelimitedFrom(InputStream inputStream) {
        return (TasteMatchCard) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TasteMatchCard parseFrom(ByteBuffer byteBuffer) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceholder(Placeholder placeholder) {
        placeholder.getClass();
        this.state_ = placeholder;
        this.stateCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(TasteMatchResult tasteMatchResult) {
        tasteMatchResult.getClass();
        this.state_ = tasteMatchResult;
        this.stateCase_ = 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"state_", "stateCase_", Placeholder.class, TasteMatchResult.class});
        }
        if (iOrdinal == 3) {
            return new TasteMatchCard();
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
        synchronized (TasteMatchCard.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
    public Placeholder getPlaceholder() {
        return this.stateCase_ == 1 ? (Placeholder) this.state_ : Placeholder.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
    public TasteMatchResult getResult() {
        return this.stateCase_ == 2 ? (TasteMatchResult) this.state_ : TasteMatchResult.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
    public StateCase getStateCase() {
        return StateCase.forNumber(this.stateCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
    public boolean hasPlaceholder() {
        return this.stateCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
    public boolean hasResult() {
        return this.stateCase_ == 2;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Placeholder extends h implements PlaceholderOrBuilder {
        private static final Placeholder DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Placeholder placeholder = new Placeholder();
            DEFAULT_INSTANCE = placeholder;
            h.registerDefaultInstance(Placeholder.class, placeholder);
        }

        private Placeholder() {
        }

        public static Placeholder getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Placeholder parseDelimitedFrom(InputStream inputStream) {
            return (Placeholder) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Placeholder parseFrom(ByteBuffer byteBuffer) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Placeholder();
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
            synchronized (Placeholder.class) {
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

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.PlaceholderOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements PlaceholderOrBuilder {
            private Builder() {
                super(Placeholder.DEFAULT_INSTANCE);
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

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.PlaceholderOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m730mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m729clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m731mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m728clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m732mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public static Builder newBuilder(Placeholder placeholder) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(placeholder);
        }

        public static Placeholder parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Placeholder) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Placeholder parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Placeholder parseFrom(phc phcVar) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Placeholder parseFrom(phc phcVar, uz00 uz00Var) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static Placeholder parseFrom(byte[] bArr) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Placeholder parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Placeholder parseFrom(InputStream inputStream) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Placeholder parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Placeholder parseFrom(lwg lwgVar) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Placeholder parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Placeholder) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class TasteMatch extends h implements TasteMatchOrBuilder {
        private static final TasteMatch DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SHARED_ARTIST_URIS_FIELD_NUMBER = 1;
        public static final int SHARED_TRACK_URIS_FIELD_NUMBER = 2;
        private int bitField0_;
        private String sharedArtistUris_ = "";
        private String sharedTrackUris_ = "";

        static {
            TasteMatch tasteMatch = new TasteMatch();
            DEFAULT_INSTANCE = tasteMatch;
            h.registerDefaultInstance(TasteMatch.class, tasteMatch);
        }

        private TasteMatch() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSharedArtistUris() {
            this.bitField0_ &= -2;
            this.sharedArtistUris_ = getDefaultInstance().getSharedArtistUris();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSharedTrackUris() {
            this.bitField0_ &= -3;
            this.sharedTrackUris_ = getDefaultInstance().getSharedTrackUris();
        }

        public static TasteMatch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TasteMatch parseDelimitedFrom(InputStream inputStream) {
            return (TasteMatch) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TasteMatch parseFrom(ByteBuffer byteBuffer) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedArtistUris(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.sharedArtistUris_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedArtistUrisBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.sharedArtistUris_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedTrackUris(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.sharedTrackUris_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedTrackUrisBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.sharedTrackUris_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "sharedArtistUris_", "sharedTrackUris_"});
            }
            if (iOrdinal == 3) {
                return new TasteMatch();
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
            synchronized (TasteMatch.class) {
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

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
        public String getSharedArtistUris() {
            return this.sharedArtistUris_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
        public phc getSharedArtistUrisBytes() {
            return phc.i(this.sharedArtistUris_);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
        public String getSharedTrackUris() {
            return this.sharedTrackUris_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
        public phc getSharedTrackUrisBytes() {
            return phc.i(this.sharedTrackUris_);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
        public boolean hasSharedArtistUris() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
        public boolean hasSharedTrackUris() {
            return (this.bitField0_ & 2) != 0;
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements TasteMatchOrBuilder {
            private Builder() {
                super(TasteMatch.DEFAULT_INSTANCE);
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

            public Builder clearSharedArtistUris() {
                copyOnWrite();
                ((TasteMatch) ((g) this).instance).clearSharedArtistUris();
                return this;
            }

            public Builder clearSharedTrackUris() {
                copyOnWrite();
                ((TasteMatch) ((g) this).instance).clearSharedTrackUris();
                return this;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
            public String getSharedArtistUris() {
                return ((TasteMatch) ((g) this).instance).getSharedArtistUris();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
            public phc getSharedArtistUrisBytes() {
                return ((TasteMatch) ((g) this).instance).getSharedArtistUrisBytes();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
            public String getSharedTrackUris() {
                return ((TasteMatch) ((g) this).instance).getSharedTrackUris();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
            public phc getSharedTrackUrisBytes() {
                return ((TasteMatch) ((g) this).instance).getSharedTrackUrisBytes();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
            public boolean hasSharedArtistUris() {
                return ((TasteMatch) ((g) this).instance).hasSharedArtistUris();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchOrBuilder
            public boolean hasSharedTrackUris() {
                return ((TasteMatch) ((g) this).instance).hasSharedTrackUris();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m735mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public Builder setSharedArtistUris(String str) {
                copyOnWrite();
                ((TasteMatch) ((g) this).instance).setSharedArtistUris(str);
                return this;
            }

            public Builder setSharedArtistUrisBytes(phc phcVar) {
                copyOnWrite();
                ((TasteMatch) ((g) this).instance).setSharedArtistUrisBytes(phcVar);
                return this;
            }

            public Builder setSharedTrackUris(String str) {
                copyOnWrite();
                ((TasteMatch) ((g) this).instance).setSharedTrackUris(str);
                return this;
            }

            public Builder setSharedTrackUrisBytes(phc phcVar) {
                copyOnWrite();
                ((TasteMatch) ((g) this).instance).setSharedTrackUrisBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m734clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m736mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m733clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m737mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public static Builder newBuilder(TasteMatch tasteMatch) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tasteMatch);
        }

        public static TasteMatch parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (TasteMatch) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static TasteMatch parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static TasteMatch parseFrom(phc phcVar) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static TasteMatch parseFrom(phc phcVar, uz00 uz00Var) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static TasteMatch parseFrom(byte[] bArr) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TasteMatch parseFrom(byte[] bArr, uz00 uz00Var) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static TasteMatch parseFrom(InputStream inputStream) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TasteMatch parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static TasteMatch parseFrom(lwg lwgVar) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static TasteMatch parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (TasteMatch) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class TasteMatchResult extends h implements TasteMatchResultOrBuilder {
        private static final TasteMatchResult DEFAULT_INSTANCE;
        public static final int MATCH_PERCENTAGE_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int TASTE_MATCH_FIELD_NUMBER = 2;
        public static final int TASTE_MATCH_SCORE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int matchPercentage_;
        private float tasteMatchScore_;
        private TasteMatch tasteMatch_;

        static {
            TasteMatchResult tasteMatchResult = new TasteMatchResult();
            DEFAULT_INSTANCE = tasteMatchResult;
            h.registerDefaultInstance(TasteMatchResult.class, tasteMatchResult);
        }

        private TasteMatchResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMatchPercentage() {
            this.bitField0_ &= -5;
            this.matchPercentage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTasteMatch() {
            this.tasteMatch_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTasteMatchScore() {
            this.bitField0_ &= -2;
            this.tasteMatchScore_ = 0.0f;
        }

        public static TasteMatchResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTasteMatch(TasteMatch tasteMatch) {
            tasteMatch.getClass();
            TasteMatch tasteMatch2 = this.tasteMatch_;
            if (tasteMatch2 == null || tasteMatch2 == TasteMatch.getDefaultInstance()) {
                this.tasteMatch_ = tasteMatch;
            } else {
                this.tasteMatch_ = (TasteMatch) ((TasteMatch.Builder) TasteMatch.newBuilder(this.tasteMatch_).mergeFrom(tasteMatch)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TasteMatchResult parseDelimitedFrom(InputStream inputStream) {
            return (TasteMatchResult) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TasteMatchResult parseFrom(ByteBuffer byteBuffer) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMatchPercentage(int i) {
            this.bitField0_ |= 4;
            this.matchPercentage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTasteMatch(TasteMatch tasteMatch) {
            tasteMatch.getClass();
            this.tasteMatch_ = tasteMatch;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTasteMatchScore(float f) {
            this.bitField0_ |= 1;
            this.tasteMatchScore_ = f;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "tasteMatchScore_", "tasteMatch_", "matchPercentage_"});
            }
            if (iOrdinal == 3) {
                return new TasteMatchResult();
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
            synchronized (TasteMatchResult.class) {
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

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
        public int getMatchPercentage() {
            return this.matchPercentage_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
        public TasteMatch getTasteMatch() {
            TasteMatch tasteMatch = this.tasteMatch_;
            return tasteMatch == null ? TasteMatch.getDefaultInstance() : tasteMatch;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
        @Deprecated
        public float getTasteMatchScore() {
            return this.tasteMatchScore_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
        public boolean hasMatchPercentage() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
        public boolean hasTasteMatch() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
        @Deprecated
        public boolean hasTasteMatchScore() {
            return (this.bitField0_ & 1) != 0;
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements TasteMatchResultOrBuilder {
            private Builder() {
                super(TasteMatchResult.DEFAULT_INSTANCE);
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

            public Builder clearMatchPercentage() {
                copyOnWrite();
                ((TasteMatchResult) ((g) this).instance).clearMatchPercentage();
                return this;
            }

            public Builder clearTasteMatch() {
                copyOnWrite();
                ((TasteMatchResult) ((g) this).instance).clearTasteMatch();
                return this;
            }

            @Deprecated
            public Builder clearTasteMatchScore() {
                copyOnWrite();
                ((TasteMatchResult) ((g) this).instance).clearTasteMatchScore();
                return this;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
            public int getMatchPercentage() {
                return ((TasteMatchResult) ((g) this).instance).getMatchPercentage();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
            public TasteMatch getTasteMatch() {
                return ((TasteMatchResult) ((g) this).instance).getTasteMatch();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
            @Deprecated
            public float getTasteMatchScore() {
                return ((TasteMatchResult) ((g) this).instance).getTasteMatchScore();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
            public boolean hasMatchPercentage() {
                return ((TasteMatchResult) ((g) this).instance).hasMatchPercentage();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
            public boolean hasTasteMatch() {
                return ((TasteMatchResult) ((g) this).instance).hasTasteMatch();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCard.TasteMatchResultOrBuilder
            @Deprecated
            public boolean hasTasteMatchScore() {
                return ((TasteMatchResult) ((g) this).instance).hasTasteMatchScore();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m740mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public Builder mergeTasteMatch(TasteMatch tasteMatch) {
                copyOnWrite();
                ((TasteMatchResult) ((g) this).instance).mergeTasteMatch(tasteMatch);
                return this;
            }

            public Builder setMatchPercentage(int i) {
                copyOnWrite();
                ((TasteMatchResult) ((g) this).instance).setMatchPercentage(i);
                return this;
            }

            public Builder setTasteMatch(TasteMatch.Builder builder) {
                copyOnWrite();
                ((TasteMatchResult) ((g) this).instance).setTasteMatch((TasteMatch) builder.build());
                return this;
            }

            @Deprecated
            public Builder setTasteMatchScore(float f) {
                copyOnWrite();
                ((TasteMatchResult) ((g) this).instance).setTasteMatchScore(f);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m739clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m741mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m738clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m742mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

            public Builder setTasteMatch(TasteMatch tasteMatch) {
                copyOnWrite();
                ((TasteMatchResult) ((g) this).instance).setTasteMatch(tasteMatch);
                return this;
            }
        }

        public static Builder newBuilder(TasteMatchResult tasteMatchResult) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tasteMatchResult);
        }

        public static TasteMatchResult parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (TasteMatchResult) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static TasteMatchResult parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static TasteMatchResult parseFrom(phc phcVar) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static TasteMatchResult parseFrom(phc phcVar, uz00 uz00Var) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static TasteMatchResult parseFrom(byte[] bArr) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TasteMatchResult parseFrom(byte[] bArr, uz00 uz00Var) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static TasteMatchResult parseFrom(InputStream inputStream) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TasteMatchResult parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static TasteMatchResult parseFrom(lwg lwgVar) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static TasteMatchResult parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (TasteMatchResult) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Builder extends g implements TasteMatchCardOrBuilder {
        private Builder() {
            super(TasteMatchCard.DEFAULT_INSTANCE);
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

        public Builder clearPlaceholder() {
            copyOnWrite();
            ((TasteMatchCard) ((g) this).instance).clearPlaceholder();
            return this;
        }

        public Builder clearResult() {
            copyOnWrite();
            ((TasteMatchCard) ((g) this).instance).clearResult();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((TasteMatchCard) ((g) this).instance).clearState();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
        public Placeholder getPlaceholder() {
            return ((TasteMatchCard) ((g) this).instance).getPlaceholder();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
        public TasteMatchResult getResult() {
            return ((TasteMatchCard) ((g) this).instance).getResult();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
        public StateCase getStateCase() {
            return ((TasteMatchCard) ((g) this).instance).getStateCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
        public boolean hasPlaceholder() {
            return ((TasteMatchCard) ((g) this).instance).hasPlaceholder();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TasteMatchCardOrBuilder
        public boolean hasResult() {
            return ((TasteMatchCard) ((g) this).instance).hasResult();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m725mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergePlaceholder(Placeholder placeholder) {
            copyOnWrite();
            ((TasteMatchCard) ((g) this).instance).mergePlaceholder(placeholder);
            return this;
        }

        public Builder mergeResult(TasteMatchResult tasteMatchResult) {
            copyOnWrite();
            ((TasteMatchCard) ((g) this).instance).mergeResult(tasteMatchResult);
            return this;
        }

        public Builder setPlaceholder(Placeholder.Builder builder) {
            copyOnWrite();
            ((TasteMatchCard) ((g) this).instance).setPlaceholder((Placeholder) builder.build());
            return this;
        }

        public Builder setResult(TasteMatchResult.Builder builder) {
            copyOnWrite();
            ((TasteMatchCard) ((g) this).instance).setResult((TasteMatchResult) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m724clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m726mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m723clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m727mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setPlaceholder(Placeholder placeholder) {
            copyOnWrite();
            ((TasteMatchCard) ((g) this).instance).setPlaceholder(placeholder);
            return this;
        }

        public Builder setResult(TasteMatchResult tasteMatchResult) {
            copyOnWrite();
            ((TasteMatchCard) ((g) this).instance).setResult(tasteMatchResult);
            return this;
        }
    }

    public enum StateCase {
        PLACEHOLDER(1),
        RESULT(2),
        STATE_NOT_SET(0);

        private final int value;

        StateCase(int i) {
            this.value = i;
        }

        public static StateCase forNumber(int i) {
            if (i == 0) {
                return STATE_NOT_SET;
            }
            if (i == 1) {
                return PLACEHOLDER;
            }
            if (i != 2) {
                return null;
            }
            return RESULT;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static StateCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(TasteMatchCard tasteMatchCard) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tasteMatchCard);
    }

    public static TasteMatchCard parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TasteMatchCard) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TasteMatchCard parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TasteMatchCard parseFrom(phc phcVar) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TasteMatchCard parseFrom(phc phcVar, uz00 uz00Var) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TasteMatchCard parseFrom(byte[] bArr) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TasteMatchCard parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TasteMatchCard parseFrom(InputStream inputStream) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TasteMatchCard parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TasteMatchCard parseFrom(lwg lwgVar) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TasteMatchCard parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
