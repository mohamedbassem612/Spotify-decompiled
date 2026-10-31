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
public final class ShowOfflineStateDecorationPolicy extends h implements ShowOfflineStateDecorationPolicyOrBuilder {
    private static final ShowOfflineStateDecorationPolicy DEFAULT_INSTANCE;
    public static final int OFFLINE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 2;
    private boolean offline_;
    private boolean syncProgress_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.ShowOfflineStateDecorationPolicy$1, reason: invalid class name */
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
        ShowOfflineStateDecorationPolicy showOfflineStateDecorationPolicy = new ShowOfflineStateDecorationPolicy();
        DEFAULT_INSTANCE = showOfflineStateDecorationPolicy;
        h.registerDefaultInstance(ShowOfflineStateDecorationPolicy.class, showOfflineStateDecorationPolicy);
    }

    private ShowOfflineStateDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffline() {
        this.offline_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncProgress() {
        this.syncProgress_ = false;
    }

    public static ShowOfflineStateDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowOfflineStateDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ShowOfflineStateDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffline(boolean z) {
        this.offline_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncProgress(boolean z) {
        this.syncProgress_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"offline_", "syncProgress_"});
        }
        if (iOrdinal == 3) {
            return new ShowOfflineStateDecorationPolicy();
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
        synchronized (ShowOfflineStateDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.ShowOfflineStateDecorationPolicyOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowOfflineStateDecorationPolicyOrBuilder
    public boolean getOffline() {
        return this.offline_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowOfflineStateDecorationPolicyOrBuilder
    public boolean getSyncProgress() {
        return this.syncProgress_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ShowOfflineStateDecorationPolicyOrBuilder {
        private Builder() {
            super(ShowOfflineStateDecorationPolicy.DEFAULT_INSTANCE);
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

        public Builder clearOffline() {
            copyOnWrite();
            ((ShowOfflineStateDecorationPolicy) ((g) this).instance).clearOffline();
            return this;
        }

        public Builder clearSyncProgress() {
            copyOnWrite();
            ((ShowOfflineStateDecorationPolicy) ((g) this).instance).clearSyncProgress();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowOfflineStateDecorationPolicyOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowOfflineStateDecorationPolicyOrBuilder
        public boolean getOffline() {
            return ((ShowOfflineStateDecorationPolicy) ((g) this).instance).getOffline();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowOfflineStateDecorationPolicyOrBuilder
        public boolean getSyncProgress() {
            return ((ShowOfflineStateDecorationPolicy) ((g) this).instance).getSyncProgress();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1330mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setOffline(boolean z) {
            copyOnWrite();
            ((ShowOfflineStateDecorationPolicy) ((g) this).instance).setOffline(z);
            return this;
        }

        public Builder setSyncProgress(boolean z) {
            copyOnWrite();
            ((ShowOfflineStateDecorationPolicy) ((g) this).instance).setSyncProgress(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1329clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1331mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1328clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1332mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(ShowOfflineStateDecorationPolicy showOfflineStateDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showOfflineStateDecorationPolicy);
    }

    public static ShowOfflineStateDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowOfflineStateDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(phc phcVar) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(byte[] bArr) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(InputStream inputStream) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(lwg lwgVar) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ShowOfflineStateDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ShowOfflineStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
