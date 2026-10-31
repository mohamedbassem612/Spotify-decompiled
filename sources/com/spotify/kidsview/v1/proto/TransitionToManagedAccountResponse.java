package com.spotify.kidsview.v1.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.ifv;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class TransitionToManagedAccountResponse extends h implements TransitionToManagedAccountResponseOrBuilder {
    private static final TransitionToManagedAccountResponse DEFAULT_INSTANCE;
    public static final int MIGRATION_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String migrationId_ = "";
    private Duration timeout_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponse$1, reason: invalid class name */
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
        TransitionToManagedAccountResponse transitionToManagedAccountResponse = new TransitionToManagedAccountResponse();
        DEFAULT_INSTANCE = transitionToManagedAccountResponse;
        h.registerDefaultInstance(TransitionToManagedAccountResponse.class, transitionToManagedAccountResponse);
    }

    private TransitionToManagedAccountResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMigrationId() {
        this.migrationId_ = getDefaultInstance().getMigrationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeout() {
        this.timeout_ = null;
        this.bitField0_ &= -2;
    }

    public static TransitionToManagedAccountResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeout(Duration duration) {
        duration.getClass();
        Duration duration2 = this.timeout_;
        if (duration2 == null || duration2 == Duration.n()) {
            this.timeout_ = duration;
        } else {
            this.timeout_ = Duration.r(this.timeout_).mergeFrom(duration).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransitionToManagedAccountResponse parseDelimitedFrom(InputStream inputStream) {
        return (TransitionToManagedAccountResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransitionToManagedAccountResponse parseFrom(ByteBuffer byteBuffer) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMigrationId(String str) {
        str.getClass();
        this.migrationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMigrationIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.migrationId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeout(Duration duration) {
        duration.getClass();
        this.timeout_ = duration;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "timeout_", "migrationId_"});
        }
        if (iOrdinal == 3) {
            return new TransitionToManagedAccountResponse();
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
        synchronized (TransitionToManagedAccountResponse.class) {
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

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
    public String getMigrationId() {
        return this.migrationId_;
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
    public phc getMigrationIdBytes() {
        return phc.i(this.migrationId_);
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
    public Duration getTimeout() {
        Duration duration = this.timeout_;
        return duration == null ? Duration.n() : duration;
    }

    @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
    public boolean hasTimeout() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements TransitionToManagedAccountResponseOrBuilder {
        private Builder() {
            super(TransitionToManagedAccountResponse.DEFAULT_INSTANCE);
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

        public Builder clearMigrationId() {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) ((g) this).instance).clearMigrationId();
            return this;
        }

        public Builder clearTimeout() {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) ((g) this).instance).clearTimeout();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
        public String getMigrationId() {
            return ((TransitionToManagedAccountResponse) ((g) this).instance).getMigrationId();
        }

        @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
        public phc getMigrationIdBytes() {
            return ((TransitionToManagedAccountResponse) ((g) this).instance).getMigrationIdBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
        public Duration getTimeout() {
            return ((TransitionToManagedAccountResponse) ((g) this).instance).getTimeout();
        }

        @Override // com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponseOrBuilder
        public boolean hasTimeout() {
            return ((TransitionToManagedAccountResponse) ((g) this).instance).hasTimeout();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m153mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeTimeout(Duration duration) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) ((g) this).instance).mergeTimeout(duration);
            return this;
        }

        public Builder setMigrationId(String str) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) ((g) this).instance).setMigrationId(str);
            return this;
        }

        public Builder setMigrationIdBytes(phc phcVar) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) ((g) this).instance).setMigrationIdBytes(phcVar);
            return this;
        }

        public Builder setTimeout(ifv ifvVar) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) ((g) this).instance).setTimeout(ifvVar.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m152clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m154mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m151clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m155mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setTimeout(Duration duration) {
            copyOnWrite();
            ((TransitionToManagedAccountResponse) ((g) this).instance).setTimeout(duration);
            return this;
        }
    }

    public static Builder newBuilder(TransitionToManagedAccountResponse transitionToManagedAccountResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(transitionToManagedAccountResponse);
    }

    public static TransitionToManagedAccountResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TransitionToManagedAccountResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TransitionToManagedAccountResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TransitionToManagedAccountResponse parseFrom(phc phcVar) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TransitionToManagedAccountResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TransitionToManagedAccountResponse parseFrom(byte[] bArr) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransitionToManagedAccountResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TransitionToManagedAccountResponse parseFrom(InputStream inputStream) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransitionToManagedAccountResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TransitionToManagedAccountResponse parseFrom(lwg lwgVar) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TransitionToManagedAccountResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TransitionToManagedAccountResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
