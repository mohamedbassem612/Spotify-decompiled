package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Timestamp;
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
import p.sve1;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class DeletedForUser extends h implements DeletedForUserOrBuilder {
    private static final DeletedForUser DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int UPDATED_AT_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp updatedAt_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.DeletedForUser$1, reason: invalid class name */
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
        DeletedForUser deletedForUser = new DeletedForUser();
        DEFAULT_INSTANCE = deletedForUser;
        h.registerDefaultInstance(DeletedForUser.class, deletedForUser);
    }

    private DeletedForUser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedAt() {
        this.updatedAt_ = null;
        this.bitField0_ &= -2;
    }

    public static DeletedForUser getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.updatedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.o()) {
            this.updatedAt_ = timestamp;
        } else {
            this.updatedAt_ = Timestamp.s(this.updatedAt_).mergeFrom(timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DeletedForUser parseDelimitedFrom(InputStream inputStream) {
        return (DeletedForUser) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeletedForUser parseFrom(ByteBuffer byteBuffer) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.updatedAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "updatedAt_"});
        }
        if (iOrdinal == 3) {
            return new DeletedForUser();
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
        synchronized (DeletedForUser.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.DeletedForUserOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.DeletedForUserOrBuilder
    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.updatedAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.DeletedForUserOrBuilder
    public boolean hasUpdatedAt() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements DeletedForUserOrBuilder {
        private Builder() {
            super(DeletedForUser.DEFAULT_INSTANCE);
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

        public Builder clearUpdatedAt() {
            copyOnWrite();
            ((DeletedForUser) ((g) this).instance).clearUpdatedAt();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeletedForUserOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeletedForUserOrBuilder
        public Timestamp getUpdatedAt() {
            return ((DeletedForUser) ((g) this).instance).getUpdatedAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeletedForUserOrBuilder
        public boolean hasUpdatedAt() {
            return ((DeletedForUser) ((g) this).instance).hasUpdatedAt();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m221mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeUpdatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((DeletedForUser) ((g) this).instance).mergeUpdatedAt(timestamp);
            return this;
        }

        public Builder setUpdatedAt(sve1 sve1Var) {
            copyOnWrite();
            ((DeletedForUser) ((g) this).instance).setUpdatedAt(sve1Var.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m220clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m222mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m219clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m223mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setUpdatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((DeletedForUser) ((g) this).instance).setUpdatedAt(timestamp);
            return this;
        }
    }

    public static Builder newBuilder(DeletedForUser deletedForUser) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(deletedForUser);
    }

    public static DeletedForUser parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeletedForUser) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeletedForUser parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static DeletedForUser parseFrom(phc phcVar) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static DeletedForUser parseFrom(phc phcVar, uz00 uz00Var) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static DeletedForUser parseFrom(byte[] bArr) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeletedForUser parseFrom(byte[] bArr, uz00 uz00Var) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static DeletedForUser parseFrom(InputStream inputStream) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeletedForUser parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeletedForUser parseFrom(lwg lwgVar) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static DeletedForUser parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (DeletedForUser) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
