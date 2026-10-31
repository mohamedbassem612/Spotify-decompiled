package com.spotify.playlist.ai.creation.v2;

import com.google.protobuf.Empty;
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
import p.y5x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PlaylistSavedResponse extends h implements PlaylistSavedResponseOrBuilder {
    private static final PlaylistSavedResponse DEFAULT_INSTANCE;
    public static final int EMPTY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Empty empty_;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.PlaylistSavedResponse$1, reason: invalid class name */
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
        PlaylistSavedResponse playlistSavedResponse = new PlaylistSavedResponse();
        DEFAULT_INSTANCE = playlistSavedResponse;
        h.registerDefaultInstance(PlaylistSavedResponse.class, playlistSavedResponse);
    }

    private PlaylistSavedResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmpty() {
        this.empty_ = null;
        this.bitField0_ &= -2;
    }

    public static PlaylistSavedResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmpty(Empty empty) {
        empty.getClass();
        Empty empty2 = this.empty_;
        if (empty2 == null || empty2 == Empty.n()) {
            this.empty_ = empty;
        } else {
            this.empty_ = Empty.p(this.empty_).mergeFrom(empty).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlaylistSavedResponse parseDelimitedFrom(InputStream inputStream) {
        return (PlaylistSavedResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistSavedResponse parseFrom(ByteBuffer byteBuffer) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmpty(Empty empty) {
        empty.getClass();
        this.empty_ = empty;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "empty_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistSavedResponse();
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
        synchronized (PlaylistSavedResponse.class) {
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

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedResponseOrBuilder
    public final Empty getEmpty() {
        Empty empty = this.empty_;
        return empty == null ? Empty.n() : empty;
    }

    @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedResponseOrBuilder
    public final boolean hasEmpty() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements PlaylistSavedResponseOrBuilder {
        private Builder() {
            super(PlaylistSavedResponse.DEFAULT_INSTANCE);
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

        public final Builder clearEmpty() {
            copyOnWrite();
            ((PlaylistSavedResponse) ((g) this).instance).clearEmpty();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedResponseOrBuilder
        public final Empty getEmpty() {
            return ((PlaylistSavedResponse) ((g) this).instance).getEmpty();
        }

        @Override // com.spotify.playlist.ai.creation.v2.PlaylistSavedResponseOrBuilder
        public final boolean hasEmpty() {
            return ((PlaylistSavedResponse) ((g) this).instance).hasEmpty();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public final Builder mergeEmpty(Empty empty) {
            copyOnWrite();
            ((PlaylistSavedResponse) ((g) this).instance).mergeEmpty(empty);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m545mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setEmpty(y5x y5xVar) {
            copyOnWrite();
            ((PlaylistSavedResponse) ((g) this).instance).setEmpty(y5xVar.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m544clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m546mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m543clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m547mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public final Builder setEmpty(Empty empty) {
            copyOnWrite();
            ((PlaylistSavedResponse) ((g) this).instance).setEmpty(empty);
            return this;
        }
    }

    public static Builder newBuilder(PlaylistSavedResponse playlistSavedResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(playlistSavedResponse);
    }

    public static PlaylistSavedResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (PlaylistSavedResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PlaylistSavedResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static PlaylistSavedResponse parseFrom(phc phcVar) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static PlaylistSavedResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static PlaylistSavedResponse parseFrom(byte[] bArr) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaylistSavedResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static PlaylistSavedResponse parseFrom(InputStream inputStream) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistSavedResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PlaylistSavedResponse parseFrom(lwg lwgVar) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static PlaylistSavedResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (PlaylistSavedResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
