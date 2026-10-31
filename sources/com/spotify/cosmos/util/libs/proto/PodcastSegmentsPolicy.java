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
public final class PodcastSegmentsPolicy extends h implements PodcastSegmentsPolicyOrBuilder {
    public static final int ALBUM_MOSAIC_URI_FIELD_NUMBER = 4;
    public static final int ARTISTS_FIELD_NUMBER = 5;
    public static final int CAN_UPSELL_FIELD_NUMBER = 3;
    private static final PodcastSegmentsPolicy DEFAULT_INSTANCE;
    public static final int EMBEDDED_SEGMENTS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_SEGMENTS_FIELD_NUMBER = 1;
    private boolean albumMosaicUri_;
    private boolean artists_;
    private boolean canUpsell_;
    private boolean embeddedSegments_;
    private boolean playbackSegments_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicy$1, reason: invalid class name */
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
        PodcastSegmentsPolicy podcastSegmentsPolicy = new PodcastSegmentsPolicy();
        DEFAULT_INSTANCE = podcastSegmentsPolicy;
        h.registerDefaultInstance(PodcastSegmentsPolicy.class, podcastSegmentsPolicy);
    }

    private PodcastSegmentsPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlbumMosaicUri() {
        this.albumMosaicUri_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArtists() {
        this.artists_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanUpsell() {
        this.canUpsell_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmbeddedSegments() {
        this.embeddedSegments_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaybackSegments() {
        this.playbackSegments_ = false;
    }

    public static PodcastSegmentsPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PodcastSegmentsPolicy parseDelimitedFrom(InputStream inputStream) {
        return (PodcastSegmentsPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PodcastSegmentsPolicy parseFrom(ByteBuffer byteBuffer) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlbumMosaicUri(boolean z) {
        this.albumMosaicUri_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArtists(boolean z) {
        this.artists_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanUpsell(boolean z) {
        this.canUpsell_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedSegments(boolean z) {
        this.embeddedSegments_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSegments(boolean z) {
        this.playbackSegments_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"playbackSegments_", "embeddedSegments_", "canUpsell_", "albumMosaicUri_", "artists_"});
        }
        if (iOrdinal == 3) {
            return new PodcastSegmentsPolicy();
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
        synchronized (PodcastSegmentsPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getAlbumMosaicUri() {
        return this.albumMosaicUri_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getArtists() {
        return this.artists_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getCanUpsell() {
        return this.canUpsell_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getEmbeddedSegments() {
        return this.embeddedSegments_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
    public boolean getPlaybackSegments() {
        return this.playbackSegments_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements PodcastSegmentsPolicyOrBuilder {
        private Builder() {
            super(PodcastSegmentsPolicy.DEFAULT_INSTANCE);
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

        public Builder clearAlbumMosaicUri() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).clearAlbumMosaicUri();
            return this;
        }

        public Builder clearArtists() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).clearArtists();
            return this;
        }

        public Builder clearCanUpsell() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).clearCanUpsell();
            return this;
        }

        public Builder clearEmbeddedSegments() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).clearEmbeddedSegments();
            return this;
        }

        public Builder clearPlaybackSegments() {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).clearPlaybackSegments();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getAlbumMosaicUri() {
            return ((PodcastSegmentsPolicy) ((g) this).instance).getAlbumMosaicUri();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getArtists() {
            return ((PodcastSegmentsPolicy) ((g) this).instance).getArtists();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getCanUpsell() {
            return ((PodcastSegmentsPolicy) ((g) this).instance).getCanUpsell();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getEmbeddedSegments() {
            return ((PodcastSegmentsPolicy) ((g) this).instance).getEmbeddedSegments();
        }

        @Override // com.spotify.cosmos.util.libs.proto.PodcastSegmentsPolicyOrBuilder
        public boolean getPlaybackSegments() {
            return ((PodcastSegmentsPolicy) ((g) this).instance).getPlaybackSegments();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1315mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAlbumMosaicUri(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).setAlbumMosaicUri(z);
            return this;
        }

        public Builder setArtists(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).setArtists(z);
            return this;
        }

        public Builder setCanUpsell(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).setCanUpsell(z);
            return this;
        }

        public Builder setEmbeddedSegments(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).setEmbeddedSegments(z);
            return this;
        }

        public Builder setPlaybackSegments(boolean z) {
            copyOnWrite();
            ((PodcastSegmentsPolicy) ((g) this).instance).setPlaybackSegments(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1314clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1316mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1313clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1317mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(PodcastSegmentsPolicy podcastSegmentsPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(podcastSegmentsPolicy);
    }

    public static PodcastSegmentsPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (PodcastSegmentsPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PodcastSegmentsPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static PodcastSegmentsPolicy parseFrom(phc phcVar) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static PodcastSegmentsPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static PodcastSegmentsPolicy parseFrom(byte[] bArr) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PodcastSegmentsPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static PodcastSegmentsPolicy parseFrom(InputStream inputStream) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PodcastSegmentsPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PodcastSegmentsPolicy parseFrom(lwg lwgVar) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static PodcastSegmentsPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (PodcastSegmentsPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
