package com.spotify.playlist.ai.creation.v2;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaylistImageResponse extends h implements PlaylistImageResponseOrBuilder {
    private static final PlaylistImageResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PICTUREID_FIELD_NUMBER = 1;
    private phc pictureId_ = phc.b;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.PlaylistImageResponse$1, reason: invalid class name */
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
        PlaylistImageResponse playlistImageResponse = new PlaylistImageResponse();
        DEFAULT_INSTANCE = playlistImageResponse;
        h.registerDefaultInstance(PlaylistImageResponse.class, playlistImageResponse);
    }

    private PlaylistImageResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPictureId() {
        this.pictureId_ = DEFAULT_INSTANCE.pictureId_;
    }

    public static PlaylistImageResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlaylistImageResponse parseDelimitedFrom(InputStream inputStream) {
        return (PlaylistImageResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistImageResponse parseFrom(ByteBuffer byteBuffer) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictureId(phc phcVar) {
        phcVar.getClass();
        this.pictureId_ = phcVar;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"pictureId_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistImageResponse();
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
        synchronized (PlaylistImageResponse.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistImageResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistImageResponseOrBuilder
    public final phc getPictureId() {
        return this.pictureId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements PlaylistImageResponseOrBuilder {
        private Builder() {
            super(PlaylistImageResponse.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public final /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public final Builder clearPictureId() {
            copyOnWrite();
            ((PlaylistImageResponse) ((g) this).instance).clearPictureId();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistImageResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistImageResponseOrBuilder
        public final phc getPictureId() {
            return ((PlaylistImageResponse) ((g) this).instance).getPictureId();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m535mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setPictureId(phc phcVar) {
            copyOnWrite();
            ((PlaylistImageResponse) ((g) this).instance).setPictureId(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m534clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m536mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m533clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m537mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }
    }

    public static Builder newBuilder(PlaylistImageResponse playlistImageResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(playlistImageResponse);
    }

    public static PlaylistImageResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (PlaylistImageResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PlaylistImageResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static PlaylistImageResponse parseFrom(phc phcVar) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static PlaylistImageResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static PlaylistImageResponse parseFrom(byte[] bArr) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaylistImageResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static PlaylistImageResponse parseFrom(InputStream inputStream) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistImageResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PlaylistImageResponse parseFrom(lwg lwgVar) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static PlaylistImageResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (PlaylistImageResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
