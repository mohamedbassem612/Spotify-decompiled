package com.spotify.kidsview.v1.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class DeletePlanDetails extends h implements DeletePlanDetailsOrBuilder {
    private static final DeletePlanDetails DEFAULT_INSTANCE;
    public static final int IS_EXPIRING_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_NAME_FIELD_NUMBER = 1;
    private boolean isExpiring_;
    private String planName_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.DeletePlanDetails$1, reason: invalid class name */
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
        DeletePlanDetails deletePlanDetails = new DeletePlanDetails();
        DEFAULT_INSTANCE = deletePlanDetails;
        h.registerDefaultInstance(DeletePlanDetails.class, deletePlanDetails);
    }

    private DeletePlanDetails() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExpiring() {
        this.isExpiring_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanName() {
        this.planName_ = getDefaultInstance().getPlanName();
    }

    public static DeletePlanDetails getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DeletePlanDetails parseDelimitedFrom(InputStream inputStream) {
        return (DeletePlanDetails) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeletePlanDetails parseFrom(ByteBuffer byteBuffer) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExpiring(boolean z) {
        this.isExpiring_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanName(String str) {
        str.getClass();
        this.planName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanNameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.planName_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"planName_", "isExpiring_"});
        }
        if (iOrdinal == 3) {
            return new DeletePlanDetails();
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
        synchronized (DeletePlanDetails.class) {
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

    @Override // com.spotify.kidsview.v1.proto.DeletePlanDetailsOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.DeletePlanDetailsOrBuilder
    public boolean getIsExpiring() {
        return this.isExpiring_;
    }

    @Override // com.spotify.kidsview.v1.proto.DeletePlanDetailsOrBuilder
    public String getPlanName() {
        return this.planName_;
    }

    @Override // com.spotify.kidsview.v1.proto.DeletePlanDetailsOrBuilder
    public phc getPlanNameBytes() {
        return phc.i(this.planName_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements DeletePlanDetailsOrBuilder {
        private Builder() {
            super(DeletePlanDetails.DEFAULT_INSTANCE);
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

        public Builder clearIsExpiring() {
            copyOnWrite();
            ((DeletePlanDetails) ((g) this).instance).clearIsExpiring();
            return this;
        }

        public Builder clearPlanName() {
            copyOnWrite();
            ((DeletePlanDetails) ((g) this).instance).clearPlanName();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.DeletePlanDetailsOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.DeletePlanDetailsOrBuilder
        public boolean getIsExpiring() {
            return ((DeletePlanDetails) ((g) this).instance).getIsExpiring();
        }

        @Override // com.spotify.kidsview.v1.proto.DeletePlanDetailsOrBuilder
        public String getPlanName() {
            return ((DeletePlanDetails) ((g) this).instance).getPlanName();
        }

        @Override // com.spotify.kidsview.v1.proto.DeletePlanDetailsOrBuilder
        public phc getPlanNameBytes() {
            return ((DeletePlanDetails) ((g) this).instance).getPlanNameBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m78mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setIsExpiring(boolean z) {
            copyOnWrite();
            ((DeletePlanDetails) ((g) this).instance).setIsExpiring(z);
            return this;
        }

        public Builder setPlanName(String str) {
            copyOnWrite();
            ((DeletePlanDetails) ((g) this).instance).setPlanName(str);
            return this;
        }

        public Builder setPlanNameBytes(phc phcVar) {
            copyOnWrite();
            ((DeletePlanDetails) ((g) this).instance).setPlanNameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m77clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m79mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m76clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m80mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(DeletePlanDetails deletePlanDetails) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(deletePlanDetails);
    }

    public static DeletePlanDetails parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeletePlanDetails) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeletePlanDetails parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static DeletePlanDetails parseFrom(phc phcVar) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static DeletePlanDetails parseFrom(phc phcVar, uz00 uz00Var) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static DeletePlanDetails parseFrom(byte[] bArr) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeletePlanDetails parseFrom(byte[] bArr, uz00 uz00Var) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static DeletePlanDetails parseFrom(InputStream inputStream) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeletePlanDetails parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static DeletePlanDetails parseFrom(lwg lwgVar) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static DeletePlanDetails parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (DeletePlanDetails) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
