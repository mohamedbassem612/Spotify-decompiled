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
public final class PlanMembership extends h implements PlanMembershipOrBuilder {
    public static final int ADD_ACTION_FIELD_NUMBER = 3;
    private static final PlanMembership DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_LABEL_FIELD_NUMBER = 1;
    public static final int REMOVE_ACTION_FIELD_NUMBER = 2;
    private AddToPlanAction addAction_;
    private int bitField0_;
    private String planLabel_ = "";
    private RemoveFromPlanAction removeAction_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.PlanMembership$1, reason: invalid class name */
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
        PlanMembership planMembership = new PlanMembership();
        DEFAULT_INSTANCE = planMembership;
        h.registerDefaultInstance(PlanMembership.class, planMembership);
    }

    private PlanMembership() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddAction() {
        this.addAction_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanLabel() {
        this.planLabel_ = getDefaultInstance().getPlanLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveAction() {
        this.removeAction_ = null;
        this.bitField0_ &= -2;
    }

    public static PlanMembership getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddAction(AddToPlanAction addToPlanAction) {
        addToPlanAction.getClass();
        AddToPlanAction addToPlanAction2 = this.addAction_;
        if (addToPlanAction2 == null || addToPlanAction2 == AddToPlanAction.getDefaultInstance()) {
            this.addAction_ = addToPlanAction;
        } else {
            this.addAction_ = (AddToPlanAction) ((AddToPlanAction.Builder) AddToPlanAction.newBuilder(this.addAction_).mergeFrom(addToPlanAction)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveAction(RemoveFromPlanAction removeFromPlanAction) {
        removeFromPlanAction.getClass();
        RemoveFromPlanAction removeFromPlanAction2 = this.removeAction_;
        if (removeFromPlanAction2 == null || removeFromPlanAction2 == RemoveFromPlanAction.getDefaultInstance()) {
            this.removeAction_ = removeFromPlanAction;
        } else {
            this.removeAction_ = (RemoveFromPlanAction) ((RemoveFromPlanAction.Builder) RemoveFromPlanAction.newBuilder(this.removeAction_).mergeFrom(removeFromPlanAction)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlanMembership parseDelimitedFrom(InputStream inputStream) {
        return (PlanMembership) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlanMembership parseFrom(ByteBuffer byteBuffer) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddAction(AddToPlanAction addToPlanAction) {
        addToPlanAction.getClass();
        this.addAction_ = addToPlanAction;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanLabel(String str) {
        str.getClass();
        this.planLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanLabelBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.planLabel_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveAction(RemoveFromPlanAction removeFromPlanAction) {
        removeFromPlanAction.getClass();
        this.removeAction_ = removeFromPlanAction;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "planLabel_", "removeAction_", "addAction_"});
        }
        if (iOrdinal == 3) {
            return new PlanMembership();
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
        synchronized (PlanMembership.class) {
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

    @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
    public AddToPlanAction getAddAction() {
        AddToPlanAction addToPlanAction = this.addAction_;
        return addToPlanAction == null ? AddToPlanAction.getDefaultInstance() : addToPlanAction;
    }

    @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
    public String getPlanLabel() {
        return this.planLabel_;
    }

    @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
    public phc getPlanLabelBytes() {
        return phc.i(this.planLabel_);
    }

    @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
    public RemoveFromPlanAction getRemoveAction() {
        RemoveFromPlanAction removeFromPlanAction = this.removeAction_;
        return removeFromPlanAction == null ? RemoveFromPlanAction.getDefaultInstance() : removeFromPlanAction;
    }

    @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
    public boolean hasAddAction() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
    public boolean hasRemoveAction() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements PlanMembershipOrBuilder {
        private Builder() {
            super(PlanMembership.DEFAULT_INSTANCE);
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

        public Builder clearAddAction() {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).clearAddAction();
            return this;
        }

        public Builder clearPlanLabel() {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).clearPlanLabel();
            return this;
        }

        public Builder clearRemoveAction() {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).clearRemoveAction();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
        public AddToPlanAction getAddAction() {
            return ((PlanMembership) ((g) this).instance).getAddAction();
        }

        @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
        public String getPlanLabel() {
            return ((PlanMembership) ((g) this).instance).getPlanLabel();
        }

        @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
        public phc getPlanLabelBytes() {
            return ((PlanMembership) ((g) this).instance).getPlanLabelBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
        public RemoveFromPlanAction getRemoveAction() {
            return ((PlanMembership) ((g) this).instance).getRemoveAction();
        }

        @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
        public boolean hasAddAction() {
            return ((PlanMembership) ((g) this).instance).hasAddAction();
        }

        @Override // com.spotify.kidsview.v1.proto.PlanMembershipOrBuilder
        public boolean hasRemoveAction() {
            return ((PlanMembership) ((g) this).instance).hasRemoveAction();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeAddAction(AddToPlanAction addToPlanAction) {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).mergeAddAction(addToPlanAction);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m133mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeRemoveAction(RemoveFromPlanAction removeFromPlanAction) {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).mergeRemoveAction(removeFromPlanAction);
            return this;
        }

        public Builder setAddAction(AddToPlanAction.Builder builder) {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).setAddAction((AddToPlanAction) builder.build());
            return this;
        }

        public Builder setPlanLabel(String str) {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).setPlanLabel(str);
            return this;
        }

        public Builder setPlanLabelBytes(phc phcVar) {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).setPlanLabelBytes(phcVar);
            return this;
        }

        public Builder setRemoveAction(RemoveFromPlanAction.Builder builder) {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).setRemoveAction((RemoveFromPlanAction) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m132clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m134mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m131clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m135mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setAddAction(AddToPlanAction addToPlanAction) {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).setAddAction(addToPlanAction);
            return this;
        }

        public Builder setRemoveAction(RemoveFromPlanAction removeFromPlanAction) {
            copyOnWrite();
            ((PlanMembership) ((g) this).instance).setRemoveAction(removeFromPlanAction);
            return this;
        }
    }

    public static Builder newBuilder(PlanMembership planMembership) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(planMembership);
    }

    public static PlanMembership parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (PlanMembership) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PlanMembership parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static PlanMembership parseFrom(phc phcVar) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static PlanMembership parseFrom(phc phcVar, uz00 uz00Var) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static PlanMembership parseFrom(byte[] bArr) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlanMembership parseFrom(byte[] bArr, uz00 uz00Var) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static PlanMembership parseFrom(InputStream inputStream) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlanMembership parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static PlanMembership parseFrom(lwg lwgVar) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static PlanMembership parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (PlanMembership) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
