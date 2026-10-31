package com.spotify.kidsview.v1.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
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
public final class GetManagedAccountsViewResponse extends h implements GetManagedAccountsViewResponseOrBuilder {
    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_FIELD_NUMBER = 5;
    private static final GetManagedAccountsViewResponse DEFAULT_INSTANCE;
    public static final int MANAGED_ACCOUNTS_FIELD_NUMBER = 1;
    public static final int MAX_MANAGED_ACCOUNT_AGE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private CreateNewManagedAccountAction createNewManagedAccountAction_;
    private h290 managedAccounts_ = h.emptyProtobufList();
    private int maxManagedAccountAge_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponse$1, reason: invalid class name */
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
        GetManagedAccountsViewResponse getManagedAccountsViewResponse = new GetManagedAccountsViewResponse();
        DEFAULT_INSTANCE = getManagedAccountsViewResponse;
        h.registerDefaultInstance(GetManagedAccountsViewResponse.class, getManagedAccountsViewResponse);
    }

    private GetManagedAccountsViewResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllManagedAccounts(Iterable<? extends ManagedAccount> iterable) {
        ensureManagedAccountsIsMutable();
        s8.addAll(iterable, this.managedAccounts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addManagedAccounts(ManagedAccount managedAccount) {
        managedAccount.getClass();
        ensureManagedAccountsIsMutable();
        this.managedAccounts_.add(managedAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateNewManagedAccountAction() {
        this.createNewManagedAccountAction_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManagedAccounts() {
        this.managedAccounts_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxManagedAccountAge() {
        this.maxManagedAccountAge_ = 0;
    }

    private void ensureManagedAccountsIsMutable() {
        i9 i9Var = this.managedAccounts_;
        if (i9Var.a) {
            return;
        }
        this.managedAccounts_ = h.mutableCopy(i9Var);
    }

    public static GetManagedAccountsViewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateNewManagedAccountAction(CreateNewManagedAccountAction createNewManagedAccountAction) {
        createNewManagedAccountAction.getClass();
        CreateNewManagedAccountAction createNewManagedAccountAction2 = this.createNewManagedAccountAction_;
        if (createNewManagedAccountAction2 == null || createNewManagedAccountAction2 == CreateNewManagedAccountAction.getDefaultInstance()) {
            this.createNewManagedAccountAction_ = createNewManagedAccountAction;
        } else {
            this.createNewManagedAccountAction_ = (CreateNewManagedAccountAction) ((CreateNewManagedAccountAction.Builder) CreateNewManagedAccountAction.newBuilder(this.createNewManagedAccountAction_).mergeFrom(createNewManagedAccountAction)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetManagedAccountsViewResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetManagedAccountsViewResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetManagedAccountsViewResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeManagedAccounts(int i) {
        ensureManagedAccountsIsMutable();
        this.managedAccounts_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateNewManagedAccountAction(CreateNewManagedAccountAction createNewManagedAccountAction) {
        createNewManagedAccountAction.getClass();
        this.createNewManagedAccountAction_ = createNewManagedAccountAction;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManagedAccounts(int i, ManagedAccount managedAccount) {
        managedAccount.getClass();
        ensureManagedAccountsIsMutable();
        this.managedAccounts_.set(i, managedAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxManagedAccountAge(int i) {
        this.maxManagedAccountAge_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001\u001b\u0005ဉ\u0000\u0006\u000b", new Object[]{"bitField0_", "managedAccounts_", ManagedAccount.class, "createNewManagedAccountAction_", "maxManagedAccountAge_"});
        }
        if (iOrdinal == 3) {
            return new GetManagedAccountsViewResponse();
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
        synchronized (GetManagedAccountsViewResponse.class) {
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

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
    public CreateNewManagedAccountAction getCreateNewManagedAccountAction() {
        CreateNewManagedAccountAction createNewManagedAccountAction = this.createNewManagedAccountAction_;
        return createNewManagedAccountAction == null ? CreateNewManagedAccountAction.getDefaultInstance() : createNewManagedAccountAction;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
    public ManagedAccount getManagedAccounts(int i) {
        return (ManagedAccount) this.managedAccounts_.get(i);
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
    public int getManagedAccountsCount() {
        return this.managedAccounts_.size();
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
    public List<ManagedAccount> getManagedAccountsList() {
        return this.managedAccounts_;
    }

    public ManagedAccountOrBuilder getManagedAccountsOrBuilder(int i) {
        return (ManagedAccountOrBuilder) this.managedAccounts_.get(i);
    }

    public List<? extends ManagedAccountOrBuilder> getManagedAccountsOrBuilderList() {
        return this.managedAccounts_;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
    public int getMaxManagedAccountAge() {
        return this.maxManagedAccountAge_;
    }

    @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
    public boolean hasCreateNewManagedAccountAction() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetManagedAccountsViewResponseOrBuilder {
        private Builder() {
            super(GetManagedAccountsViewResponse.DEFAULT_INSTANCE);
        }

        public Builder addAllManagedAccounts(Iterable<? extends ManagedAccount> iterable) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).addAllManagedAccounts(iterable);
            return this;
        }

        public Builder addManagedAccounts(ManagedAccount.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).addManagedAccounts((ManagedAccount) builder.build());
            return this;
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

        public Builder clearCreateNewManagedAccountAction() {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).clearCreateNewManagedAccountAction();
            return this;
        }

        public Builder clearManagedAccounts() {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).clearManagedAccounts();
            return this;
        }

        public Builder clearMaxManagedAccountAge() {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).clearMaxManagedAccountAge();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
        public CreateNewManagedAccountAction getCreateNewManagedAccountAction() {
            return ((GetManagedAccountsViewResponse) ((g) this).instance).getCreateNewManagedAccountAction();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
        public ManagedAccount getManagedAccounts(int i) {
            return ((GetManagedAccountsViewResponse) ((g) this).instance).getManagedAccounts(i);
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
        public int getManagedAccountsCount() {
            return ((GetManagedAccountsViewResponse) ((g) this).instance).getManagedAccountsCount();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
        public List<ManagedAccount> getManagedAccountsList() {
            return Collections.unmodifiableList(((GetManagedAccountsViewResponse) ((g) this).instance).getManagedAccountsList());
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
        public int getMaxManagedAccountAge() {
            return ((GetManagedAccountsViewResponse) ((g) this).instance).getMaxManagedAccountAge();
        }

        @Override // com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponseOrBuilder
        public boolean hasCreateNewManagedAccountAction() {
            return ((GetManagedAccountsViewResponse) ((g) this).instance).hasCreateNewManagedAccountAction();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeCreateNewManagedAccountAction(CreateNewManagedAccountAction createNewManagedAccountAction) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).mergeCreateNewManagedAccountAction(createNewManagedAccountAction);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m108mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeManagedAccounts(int i) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).removeManagedAccounts(i);
            return this;
        }

        public Builder setCreateNewManagedAccountAction(CreateNewManagedAccountAction.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).setCreateNewManagedAccountAction((CreateNewManagedAccountAction) builder.build());
            return this;
        }

        public Builder setManagedAccounts(int i, ManagedAccount.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).setManagedAccounts(i, (ManagedAccount) builder.build());
            return this;
        }

        public Builder setMaxManagedAccountAge(int i) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).setMaxManagedAccountAge(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m107clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m109mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m106clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m110mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addManagedAccounts(int i, ManagedAccount managedAccount) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).addManagedAccounts(i, managedAccount);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setCreateNewManagedAccountAction(CreateNewManagedAccountAction createNewManagedAccountAction) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).setCreateNewManagedAccountAction(createNewManagedAccountAction);
            return this;
        }

        public Builder setManagedAccounts(int i, ManagedAccount managedAccount) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).setManagedAccounts(i, managedAccount);
            return this;
        }

        public Builder addManagedAccounts(ManagedAccount managedAccount) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).addManagedAccounts(managedAccount);
            return this;
        }

        public Builder addManagedAccounts(int i, ManagedAccount.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) ((g) this).instance).addManagedAccounts(i, (ManagedAccount) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(GetManagedAccountsViewResponse getManagedAccountsViewResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getManagedAccountsViewResponse);
    }

    public static GetManagedAccountsViewResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetManagedAccountsViewResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetManagedAccountsViewResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetManagedAccountsViewResponse parseFrom(phc phcVar) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetManagedAccountsViewResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addManagedAccounts(int i, ManagedAccount managedAccount) {
        managedAccount.getClass();
        ensureManagedAccountsIsMutable();
        this.managedAccounts_.add(i, managedAccount);
    }

    public static GetManagedAccountsViewResponse parseFrom(byte[] bArr) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetManagedAccountsViewResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetManagedAccountsViewResponse parseFrom(InputStream inputStream) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetManagedAccountsViewResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetManagedAccountsViewResponse parseFrom(lwg lwgVar) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetManagedAccountsViewResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetManagedAccountsViewResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
