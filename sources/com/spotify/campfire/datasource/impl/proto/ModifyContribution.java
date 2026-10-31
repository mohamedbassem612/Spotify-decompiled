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
public final class ModifyContribution extends h implements ModifyContributionOrBuilder {
    private static final ModifyContribution DEFAULT_INSTANCE;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private int bitField0_;
    private String nodePathId_ = "";
    private ContributionPayload payload_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ModifyContribution$1, reason: invalid class name */
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
        ModifyContribution modifyContribution = new ModifyContribution();
        DEFAULT_INSTANCE = modifyContribution;
        h.registerDefaultInstance(ModifyContribution.class, modifyContribution);
    }

    private ModifyContribution() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = getDefaultInstance().getNodePathId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = null;
        this.bitField0_ &= -2;
    }

    public static ModifyContribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        ContributionPayload contributionPayload2 = this.payload_;
        if (contributionPayload2 == null || contributionPayload2 == ContributionPayload.getDefaultInstance()) {
            this.payload_ = contributionPayload;
        } else {
            this.payload_ = (ContributionPayload) ((ContributionPayload.Builder) ContributionPayload.newBuilder(this.payload_).mergeFrom(contributionPayload)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ModifyContribution parseDelimitedFrom(InputStream inputStream) {
        return (ModifyContribution) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModifyContribution parseFrom(ByteBuffer byteBuffer) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        this.payload_ = contributionPayload;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "nodePathId_", "payload_"});
        }
        if (iOrdinal == 3) {
            return new ModifyContribution();
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
        synchronized (ModifyContribution.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
    public String getNodePathId() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
    public phc getNodePathIdBytes() {
        return phc.i(this.nodePathId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
    public ContributionPayload getPayload() {
        ContributionPayload contributionPayload = this.payload_;
        return contributionPayload == null ? ContributionPayload.getDefaultInstance() : contributionPayload;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
    public boolean hasPayload() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ModifyContributionOrBuilder {
        private Builder() {
            super(ModifyContribution.DEFAULT_INSTANCE);
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

        public Builder clearNodePathId() {
            copyOnWrite();
            ((ModifyContribution) ((g) this).instance).clearNodePathId();
            return this;
        }

        public Builder clearPayload() {
            copyOnWrite();
            ((ModifyContribution) ((g) this).instance).clearPayload();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
        public String getNodePathId() {
            return ((ModifyContribution) ((g) this).instance).getNodePathId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
        public phc getNodePathIdBytes() {
            return ((ModifyContribution) ((g) this).instance).getNodePathIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
        public ContributionPayload getPayload() {
            return ((ModifyContribution) ((g) this).instance).getPayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ModifyContributionOrBuilder
        public boolean hasPayload() {
            return ((ModifyContribution) ((g) this).instance).hasPayload();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m519mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergePayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((ModifyContribution) ((g) this).instance).mergePayload(contributionPayload);
            return this;
        }

        public Builder setNodePathId(String str) {
            copyOnWrite();
            ((ModifyContribution) ((g) this).instance).setNodePathId(str);
            return this;
        }

        public Builder setNodePathIdBytes(phc phcVar) {
            copyOnWrite();
            ((ModifyContribution) ((g) this).instance).setNodePathIdBytes(phcVar);
            return this;
        }

        public Builder setPayload(ContributionPayload.Builder builder) {
            copyOnWrite();
            ((ModifyContribution) ((g) this).instance).setPayload((ContributionPayload) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m518clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m520mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m517clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m521mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setPayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((ModifyContribution) ((g) this).instance).setPayload(contributionPayload);
            return this;
        }
    }

    public static Builder newBuilder(ModifyContribution modifyContribution) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(modifyContribution);
    }

    public static ModifyContribution parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ModifyContribution) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ModifyContribution parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ModifyContribution parseFrom(phc phcVar) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ModifyContribution parseFrom(phc phcVar, uz00 uz00Var) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ModifyContribution parseFrom(byte[] bArr) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ModifyContribution parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ModifyContribution parseFrom(InputStream inputStream) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModifyContribution parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ModifyContribution parseFrom(lwg lwgVar) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ModifyContribution parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ModifyContribution) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
