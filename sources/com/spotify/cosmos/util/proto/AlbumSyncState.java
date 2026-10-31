package com.spotify.cosmos.util.proto;

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
public final class AlbumSyncState extends h implements AlbumSyncStateOrBuilder {
    private static final AlbumSyncState DEFAULT_INSTANCE;
    public static final int INFERRED_OFFLINE_FIELD_NUMBER = 2;
    public static final int OFFLINE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int syncProgress_;
    private String offline_ = "";
    private String inferredOffline_ = "";

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.AlbumSyncState$1, reason: invalid class name */
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
        AlbumSyncState albumSyncState = new AlbumSyncState();
        DEFAULT_INSTANCE = albumSyncState;
        h.registerDefaultInstance(AlbumSyncState.class, albumSyncState);
    }

    private AlbumSyncState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInferredOffline() {
        this.bitField0_ &= -3;
        this.inferredOffline_ = getDefaultInstance().getInferredOffline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffline() {
        this.bitField0_ &= -2;
        this.offline_ = getDefaultInstance().getOffline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncProgress() {
        this.bitField0_ &= -5;
        this.syncProgress_ = 0;
    }

    public static AlbumSyncState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlbumSyncState parseDelimitedFrom(InputStream inputStream) {
        return (AlbumSyncState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumSyncState parseFrom(ByteBuffer byteBuffer) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInferredOffline(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.inferredOffline_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInferredOfflineBytes(phc phcVar) {
        this.inferredOffline_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffline(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.offline_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfflineBytes(phc phcVar) {
        this.offline_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncProgress(int i) {
        this.bitField0_ |= 4;
        this.syncProgress_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "offline_", "inferredOffline_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new AlbumSyncState();
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
        synchronized (AlbumSyncState.class) {
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

    @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
    public String getInferredOffline() {
        return this.inferredOffline_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
    public phc getInferredOfflineBytes() {
        return phc.i(this.inferredOffline_);
    }

    @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
    public String getOffline() {
        return this.offline_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
    public phc getOfflineBytes() {
        return phc.i(this.offline_);
    }

    @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
    public int getSyncProgress() {
        return this.syncProgress_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
    public boolean hasInferredOffline() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
    public boolean hasOffline() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
    public boolean hasSyncProgress() {
        return (this.bitField0_ & 4) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AlbumSyncStateOrBuilder {
        private Builder() {
            super(AlbumSyncState.DEFAULT_INSTANCE);
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

        public Builder clearInferredOffline() {
            copyOnWrite();
            ((AlbumSyncState) ((g) this).instance).clearInferredOffline();
            return this;
        }

        public Builder clearOffline() {
            copyOnWrite();
            ((AlbumSyncState) ((g) this).instance).clearOffline();
            return this;
        }

        public Builder clearSyncProgress() {
            copyOnWrite();
            ((AlbumSyncState) ((g) this).instance).clearSyncProgress();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
        public String getInferredOffline() {
            return ((AlbumSyncState) ((g) this).instance).getInferredOffline();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
        public phc getInferredOfflineBytes() {
            return ((AlbumSyncState) ((g) this).instance).getInferredOfflineBytes();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
        public String getOffline() {
            return ((AlbumSyncState) ((g) this).instance).getOffline();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
        public phc getOfflineBytes() {
            return ((AlbumSyncState) ((g) this).instance).getOfflineBytes();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
        public int getSyncProgress() {
            return ((AlbumSyncState) ((g) this).instance).getSyncProgress();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
        public boolean hasInferredOffline() {
            return ((AlbumSyncState) ((g) this).instance).hasInferredOffline();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
        public boolean hasOffline() {
            return ((AlbumSyncState) ((g) this).instance).hasOffline();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumSyncStateOrBuilder
        public boolean hasSyncProgress() {
            return ((AlbumSyncState) ((g) this).instance).hasSyncProgress();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1395mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setInferredOffline(String str) {
            copyOnWrite();
            ((AlbumSyncState) ((g) this).instance).setInferredOffline(str);
            return this;
        }

        public Builder setInferredOfflineBytes(phc phcVar) {
            copyOnWrite();
            ((AlbumSyncState) ((g) this).instance).setInferredOfflineBytes(phcVar);
            return this;
        }

        public Builder setOffline(String str) {
            copyOnWrite();
            ((AlbumSyncState) ((g) this).instance).setOffline(str);
            return this;
        }

        public Builder setOfflineBytes(phc phcVar) {
            copyOnWrite();
            ((AlbumSyncState) ((g) this).instance).setOfflineBytes(phcVar);
            return this;
        }

        public Builder setSyncProgress(int i) {
            copyOnWrite();
            ((AlbumSyncState) ((g) this).instance).setSyncProgress(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1394clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1396mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1393clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1397mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(AlbumSyncState albumSyncState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(albumSyncState);
    }

    public static AlbumSyncState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (AlbumSyncState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AlbumSyncState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static AlbumSyncState parseFrom(phc phcVar) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static AlbumSyncState parseFrom(phc phcVar, uz00 uz00Var) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static AlbumSyncState parseFrom(byte[] bArr) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlbumSyncState parseFrom(byte[] bArr, uz00 uz00Var) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static AlbumSyncState parseFrom(InputStream inputStream) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumSyncState parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AlbumSyncState parseFrom(lwg lwgVar) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static AlbumSyncState parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (AlbumSyncState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
