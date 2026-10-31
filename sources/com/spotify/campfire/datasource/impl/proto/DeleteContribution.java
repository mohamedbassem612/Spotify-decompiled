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
public final class DeleteContribution extends h implements DeleteContributionOrBuilder {
    private static final DeleteContribution DEFAULT_INSTANCE;
    public static final int DELETE_FOR_ALL_FIELD_NUMBER = 2;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean deleteForAll_;
    private String nodePathId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.DeleteContribution$1, reason: invalid class name */
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
        DeleteContribution deleteContribution = new DeleteContribution();
        DEFAULT_INSTANCE = deleteContribution;
        h.registerDefaultInstance(DeleteContribution.class, deleteContribution);
    }

    private DeleteContribution() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteForAll() {
        this.deleteForAll_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = getDefaultInstance().getNodePathId();
    }

    public static DeleteContribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DeleteContribution parseDelimitedFrom(InputStream inputStream) {
        return (DeleteContribution) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteContribution parseFrom(ByteBuffer byteBuffer) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteForAll(boolean z) {
        this.deleteForAll_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathId(String str) {
        str.getClass();
        this.nodePathId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.nodePathId_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"nodePathId_", "deleteForAll_"});
        }
        if (iOrdinal == 3) {
            return new DeleteContribution();
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
        synchronized (DeleteContribution.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteContributionOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteContributionOrBuilder
    public boolean getDeleteForAll() {
        return this.deleteForAll_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteContributionOrBuilder
    public String getNodePathId() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.DeleteContributionOrBuilder
    public phc getNodePathIdBytes() {
        return phc.i(this.nodePathId_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements DeleteContributionOrBuilder {
        private Builder() {
            super(DeleteContribution.DEFAULT_INSTANCE);
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

        public Builder clearDeleteForAll() {
            copyOnWrite();
            ((DeleteContribution) ((g) this).instance).clearDeleteForAll();
            return this;
        }

        public Builder clearNodePathId() {
            copyOnWrite();
            ((DeleteContribution) ((g) this).instance).clearNodePathId();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeleteContributionOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeleteContributionOrBuilder
        public boolean getDeleteForAll() {
            return ((DeleteContribution) ((g) this).instance).getDeleteForAll();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeleteContributionOrBuilder
        public String getNodePathId() {
            return ((DeleteContribution) ((g) this).instance).getNodePathId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.DeleteContributionOrBuilder
        public phc getNodePathIdBytes() {
            return ((DeleteContribution) ((g) this).instance).getNodePathIdBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m201mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setDeleteForAll(boolean z) {
            copyOnWrite();
            ((DeleteContribution) ((g) this).instance).setDeleteForAll(z);
            return this;
        }

        public Builder setNodePathId(String str) {
            copyOnWrite();
            ((DeleteContribution) ((g) this).instance).setNodePathId(str);
            return this;
        }

        public Builder setNodePathIdBytes(phc phcVar) {
            copyOnWrite();
            ((DeleteContribution) ((g) this).instance).setNodePathIdBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m200clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m202mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m199clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m203mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(DeleteContribution deleteContribution) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(deleteContribution);
    }

    public static DeleteContribution parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeleteContribution) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeleteContribution parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static DeleteContribution parseFrom(phc phcVar) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static DeleteContribution parseFrom(phc phcVar, uz00 uz00Var) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static DeleteContribution parseFrom(byte[] bArr) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeleteContribution parseFrom(byte[] bArr, uz00 uz00Var) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static DeleteContribution parseFrom(InputStream inputStream) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeleteContribution parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeleteContribution parseFrom(lwg lwgVar) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static DeleteContribution parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (DeleteContribution) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
