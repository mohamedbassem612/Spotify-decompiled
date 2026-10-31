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
public final class MessageRequest extends h implements MessageRequestOrBuilder {
    public static final int ADD_ACTIVITY_FIELD_NUMBER = 4;
    public static final int ADD_CONTRIBUTION_FIELD_NUMBER = 1;
    public static final int ADD_CONTRIBUTION_FOR_GROUP_FIELD_NUMBER = 6;
    private static final MessageRequest DEFAULT_INSTANCE;
    public static final int DELETE_ACTIVITY_FIELD_NUMBER = 5;
    public static final int DELETE_CONTRIBUTION_FIELD_NUMBER = 3;
    public static final int MODIFY_CONTRIBUTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int cmrCase_ = 0;
    private Object cmr_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.MessageRequest$1, reason: invalid class name */
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
        MessageRequest messageRequest = new MessageRequest();
        DEFAULT_INSTANCE = messageRequest;
        h.registerDefaultInstance(MessageRequest.class, messageRequest);
    }

    private MessageRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddActivity() {
        if (this.cmrCase_ == 4) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddContribution() {
        if (this.cmrCase_ == 1) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddContributionForGroup() {
        if (this.cmrCase_ == 6) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmr() {
        this.cmrCase_ = 0;
        this.cmr_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteActivity() {
        if (this.cmrCase_ == 5) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteContribution() {
        if (this.cmrCase_ == 3) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifyContribution() {
        if (this.cmrCase_ == 2) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    public static MessageRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddActivity(AddActivity addActivity) {
        addActivity.getClass();
        if (this.cmrCase_ != 4 || this.cmr_ == AddActivity.getDefaultInstance()) {
            this.cmr_ = addActivity;
        } else {
            this.cmr_ = ((AddActivity.Builder) AddActivity.newBuilder((AddActivity) this.cmr_).mergeFrom(addActivity)).buildPartial();
        }
        this.cmrCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddContribution(AddContribution addContribution) {
        addContribution.getClass();
        if (this.cmrCase_ != 1 || this.cmr_ == AddContribution.getDefaultInstance()) {
            this.cmr_ = addContribution;
        } else {
            this.cmr_ = ((AddContribution.Builder) AddContribution.newBuilder((AddContribution) this.cmr_).mergeFrom(addContribution)).buildPartial();
        }
        this.cmrCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddContributionForGroup(AddContributionForGroup addContributionForGroup) {
        addContributionForGroup.getClass();
        if (this.cmrCase_ != 6 || this.cmr_ == AddContributionForGroup.getDefaultInstance()) {
            this.cmr_ = addContributionForGroup;
        } else {
            this.cmr_ = ((AddContributionForGroup.Builder) AddContributionForGroup.newBuilder((AddContributionForGroup) this.cmr_).mergeFrom(addContributionForGroup)).buildPartial();
        }
        this.cmrCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteActivity(DeleteActivity deleteActivity) {
        deleteActivity.getClass();
        if (this.cmrCase_ != 5 || this.cmr_ == DeleteActivity.getDefaultInstance()) {
            this.cmr_ = deleteActivity;
        } else {
            this.cmr_ = ((DeleteActivity.Builder) DeleteActivity.newBuilder((DeleteActivity) this.cmr_).mergeFrom(deleteActivity)).buildPartial();
        }
        this.cmrCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteContribution(DeleteContribution deleteContribution) {
        deleteContribution.getClass();
        if (this.cmrCase_ != 3 || this.cmr_ == DeleteContribution.getDefaultInstance()) {
            this.cmr_ = deleteContribution;
        } else {
            this.cmr_ = ((DeleteContribution.Builder) DeleteContribution.newBuilder((DeleteContribution) this.cmr_).mergeFrom(deleteContribution)).buildPartial();
        }
        this.cmrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeModifyContribution(ModifyContribution modifyContribution) {
        modifyContribution.getClass();
        if (this.cmrCase_ != 2 || this.cmr_ == ModifyContribution.getDefaultInstance()) {
            this.cmr_ = modifyContribution;
        } else {
            this.cmr_ = ((ModifyContribution.Builder) ModifyContribution.newBuilder((ModifyContribution) this.cmr_).mergeFrom(modifyContribution)).buildPartial();
        }
        this.cmrCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessageRequest parseDelimitedFrom(InputStream inputStream) {
        return (MessageRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageRequest parseFrom(ByteBuffer byteBuffer) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddActivity(AddActivity addActivity) {
        addActivity.getClass();
        this.cmr_ = addActivity;
        this.cmrCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddContribution(AddContribution addContribution) {
        addContribution.getClass();
        this.cmr_ = addContribution;
        this.cmrCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddContributionForGroup(AddContributionForGroup addContributionForGroup) {
        addContributionForGroup.getClass();
        this.cmr_ = addContributionForGroup;
        this.cmrCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteActivity(DeleteActivity deleteActivity) {
        deleteActivity.getClass();
        this.cmr_ = deleteActivity;
        this.cmrCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteContribution(DeleteContribution deleteContribution) {
        deleteContribution.getClass();
        this.cmr_ = deleteContribution;
        this.cmrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifyContribution(ModifyContribution modifyContribution) {
        modifyContribution.getClass();
        this.cmr_ = modifyContribution;
        this.cmrCase_ = 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"cmr_", "cmrCase_", AddContribution.class, ModifyContribution.class, DeleteContribution.class, AddActivity.class, DeleteActivity.class, AddContributionForGroup.class});
        }
        if (iOrdinal == 3) {
            return new MessageRequest();
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
        synchronized (MessageRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public AddActivity getAddActivity() {
        return this.cmrCase_ == 4 ? (AddActivity) this.cmr_ : AddActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public AddContribution getAddContribution() {
        return this.cmrCase_ == 1 ? (AddContribution) this.cmr_ : AddContribution.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public AddContributionForGroup getAddContributionForGroup() {
        return this.cmrCase_ == 6 ? (AddContributionForGroup) this.cmr_ : AddContributionForGroup.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public CmrCase getCmrCase() {
        return CmrCase.forNumber(this.cmrCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public DeleteActivity getDeleteActivity() {
        return this.cmrCase_ == 5 ? (DeleteActivity) this.cmr_ : DeleteActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public DeleteContribution getDeleteContribution() {
        return this.cmrCase_ == 3 ? (DeleteContribution) this.cmr_ : DeleteContribution.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public ModifyContribution getModifyContribution() {
        return this.cmrCase_ == 2 ? (ModifyContribution) this.cmr_ : ModifyContribution.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasAddActivity() {
        return this.cmrCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasAddContribution() {
        return this.cmrCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasAddContributionForGroup() {
        return this.cmrCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasDeleteActivity() {
        return this.cmrCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasDeleteContribution() {
        return this.cmrCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasModifyContribution() {
        return this.cmrCase_ == 2;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements MessageRequestOrBuilder {
        private Builder() {
            super(MessageRequest.DEFAULT_INSTANCE);
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

        public Builder clearAddActivity() {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).clearAddActivity();
            return this;
        }

        public Builder clearAddContribution() {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).clearAddContribution();
            return this;
        }

        public Builder clearAddContributionForGroup() {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).clearAddContributionForGroup();
            return this;
        }

        public Builder clearCmr() {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).clearCmr();
            return this;
        }

        public Builder clearDeleteActivity() {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).clearDeleteActivity();
            return this;
        }

        public Builder clearDeleteContribution() {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).clearDeleteContribution();
            return this;
        }

        public Builder clearModifyContribution() {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).clearModifyContribution();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public AddActivity getAddActivity() {
            return ((MessageRequest) ((g) this).instance).getAddActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public AddContribution getAddContribution() {
            return ((MessageRequest) ((g) this).instance).getAddContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public AddContributionForGroup getAddContributionForGroup() {
            return ((MessageRequest) ((g) this).instance).getAddContributionForGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public CmrCase getCmrCase() {
            return ((MessageRequest) ((g) this).instance).getCmrCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public DeleteActivity getDeleteActivity() {
            return ((MessageRequest) ((g) this).instance).getDeleteActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public DeleteContribution getDeleteContribution() {
            return ((MessageRequest) ((g) this).instance).getDeleteContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public ModifyContribution getModifyContribution() {
            return ((MessageRequest) ((g) this).instance).getModifyContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasAddActivity() {
            return ((MessageRequest) ((g) this).instance).hasAddActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasAddContribution() {
            return ((MessageRequest) ((g) this).instance).hasAddContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasAddContributionForGroup() {
            return ((MessageRequest) ((g) this).instance).hasAddContributionForGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasDeleteActivity() {
            return ((MessageRequest) ((g) this).instance).hasDeleteActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasDeleteContribution() {
            return ((MessageRequest) ((g) this).instance).hasDeleteContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasModifyContribution() {
            return ((MessageRequest) ((g) this).instance).hasModifyContribution();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeAddActivity(AddActivity addActivity) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).mergeAddActivity(addActivity);
            return this;
        }

        public Builder mergeAddContribution(AddContribution addContribution) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).mergeAddContribution(addContribution);
            return this;
        }

        public Builder mergeAddContributionForGroup(AddContributionForGroup addContributionForGroup) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).mergeAddContributionForGroup(addContributionForGroup);
            return this;
        }

        public Builder mergeDeleteActivity(DeleteActivity deleteActivity) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).mergeDeleteActivity(deleteActivity);
            return this;
        }

        public Builder mergeDeleteContribution(DeleteContribution deleteContribution) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).mergeDeleteContribution(deleteContribution);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m509mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeModifyContribution(ModifyContribution modifyContribution) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).mergeModifyContribution(modifyContribution);
            return this;
        }

        public Builder setAddActivity(AddActivity.Builder builder) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setAddActivity((AddActivity) builder.build());
            return this;
        }

        public Builder setAddContribution(AddContribution.Builder builder) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setAddContribution((AddContribution) builder.build());
            return this;
        }

        public Builder setAddContributionForGroup(AddContributionForGroup.Builder builder) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setAddContributionForGroup((AddContributionForGroup) builder.build());
            return this;
        }

        public Builder setDeleteActivity(DeleteActivity.Builder builder) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setDeleteActivity((DeleteActivity) builder.build());
            return this;
        }

        public Builder setDeleteContribution(DeleteContribution.Builder builder) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setDeleteContribution((DeleteContribution) builder.build());
            return this;
        }

        public Builder setModifyContribution(ModifyContribution.Builder builder) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setModifyContribution((ModifyContribution) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m508clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m510mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m507clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m511mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setAddActivity(AddActivity addActivity) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setAddActivity(addActivity);
            return this;
        }

        public Builder setAddContribution(AddContribution addContribution) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setAddContribution(addContribution);
            return this;
        }

        public Builder setAddContributionForGroup(AddContributionForGroup addContributionForGroup) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setAddContributionForGroup(addContributionForGroup);
            return this;
        }

        public Builder setDeleteActivity(DeleteActivity deleteActivity) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setDeleteActivity(deleteActivity);
            return this;
        }

        public Builder setDeleteContribution(DeleteContribution deleteContribution) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setDeleteContribution(deleteContribution);
            return this;
        }

        public Builder setModifyContribution(ModifyContribution modifyContribution) {
            copyOnWrite();
            ((MessageRequest) ((g) this).instance).setModifyContribution(modifyContribution);
            return this;
        }
    }

    public enum CmrCase {
        ADD_CONTRIBUTION(1),
        MODIFY_CONTRIBUTION(2),
        DELETE_CONTRIBUTION(3),
        ADD_ACTIVITY(4),
        DELETE_ACTIVITY(5),
        ADD_CONTRIBUTION_FOR_GROUP(6),
        CMR_NOT_SET(0);

        private final int value;

        CmrCase(int i) {
            this.value = i;
        }

        public static CmrCase forNumber(int i) {
            switch (i) {
                case 0:
                    return CMR_NOT_SET;
                case 1:
                    return ADD_CONTRIBUTION;
                case 2:
                    return MODIFY_CONTRIBUTION;
                case 3:
                    return DELETE_CONTRIBUTION;
                case 4:
                    return ADD_ACTIVITY;
                case 5:
                    return DELETE_ACTIVITY;
                case 6:
                    return ADD_CONTRIBUTION_FOR_GROUP;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CmrCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(MessageRequest messageRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(messageRequest);
    }

    public static MessageRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (MessageRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static MessageRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static MessageRequest parseFrom(phc phcVar) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static MessageRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static MessageRequest parseFrom(byte[] bArr) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessageRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static MessageRequest parseFrom(InputStream inputStream) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static MessageRequest parseFrom(lwg lwgVar) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static MessageRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (MessageRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
