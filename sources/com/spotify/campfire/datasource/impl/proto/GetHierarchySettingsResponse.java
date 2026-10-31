package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class GetHierarchySettingsResponse extends h implements GetHierarchySettingsResponseOrBuilder {
    private static final GetHierarchySettingsResponse DEFAULT_INSTANCE;
    public static final int DISABLED_RECEIPT_TYPES_FIELD_NUMBER = 2;
    public static final int MUTED_FOR_CURRENT_USER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private static final c290 disabledReceiptTypes_converter_ = new c290() { // from class: com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponse.1
        /* JADX INFO: renamed from: convert, reason: merged with bridge method [inline-methods] */
        public ReceiptType m331convert(int i) {
            ReceiptType receiptTypeForNumber = ReceiptType.forNumber(i);
            return receiptTypeForNumber == null ? ReceiptType.UNRECOGNIZED : receiptTypeForNumber;
        }
    };
    private int disabledReceiptTypesMemoizedSerializedSize;
    private b290 disabledReceiptTypes_ = h.emptyIntList();
    private boolean mutedForCurrentUser_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponse$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
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
        GetHierarchySettingsResponse getHierarchySettingsResponse = new GetHierarchySettingsResponse();
        DEFAULT_INSTANCE = getHierarchySettingsResponse;
        h.registerDefaultInstance(GetHierarchySettingsResponse.class, getHierarchySettingsResponse);
    }

    private GetHierarchySettingsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisabledReceiptTypes(Iterable<? extends ReceiptType> iterable) {
        ensureDisabledReceiptTypesIsMutable();
        for (ReceiptType receiptType : iterable) {
            this.disabledReceiptTypes_.c(receiptType.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisabledReceiptTypesValue(Iterable<Integer> iterable) {
        ensureDisabledReceiptTypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.disabledReceiptTypes_.c(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisabledReceiptTypes(ReceiptType receiptType) {
        receiptType.getClass();
        ensureDisabledReceiptTypesIsMutable();
        this.disabledReceiptTypes_.c(receiptType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisabledReceiptTypesValue(int i) {
        ensureDisabledReceiptTypesIsMutable();
        this.disabledReceiptTypes_.c(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabledReceiptTypes() {
        this.disabledReceiptTypes_ = h.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMutedForCurrentUser() {
        this.mutedForCurrentUser_ = false;
    }

    private void ensureDisabledReceiptTypesIsMutable() {
        i9 i9Var = this.disabledReceiptTypes_;
        if (i9Var.a) {
            return;
        }
        this.disabledReceiptTypes_ = h.mutableCopy(i9Var);
    }

    public static GetHierarchySettingsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetHierarchySettingsResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetHierarchySettingsResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetHierarchySettingsResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledReceiptTypes(int i, ReceiptType receiptType) {
        receiptType.getClass();
        ensureDisabledReceiptTypesIsMutable();
        this.disabledReceiptTypes_.i(i, receiptType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledReceiptTypesValue(int i, int i2) {
        ensureDisabledReceiptTypesIsMutable();
        this.disabledReceiptTypes_.i(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMutedForCurrentUser(boolean z) {
        this.mutedForCurrentUser_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002,", new Object[]{"mutedForCurrentUser_", "disabledReceiptTypes_"});
        }
        if (iOrdinal == 3) {
            return new GetHierarchySettingsResponse();
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
        synchronized (GetHierarchySettingsResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public ReceiptType getDisabledReceiptTypes(int i) {
        ReceiptType receiptTypeForNumber = ReceiptType.forNumber(this.disabledReceiptTypes_.e(i));
        return receiptTypeForNumber == null ? ReceiptType.UNRECOGNIZED : receiptTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public int getDisabledReceiptTypesCount() {
        return this.disabledReceiptTypes_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public List<ReceiptType> getDisabledReceiptTypesList() {
        return new d290(this.disabledReceiptTypes_, disabledReceiptTypes_converter_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public int getDisabledReceiptTypesValue(int i) {
        return this.disabledReceiptTypes_.e(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public List<Integer> getDisabledReceiptTypesValueList() {
        return this.disabledReceiptTypes_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public boolean getMutedForCurrentUser() {
        return this.mutedForCurrentUser_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements GetHierarchySettingsResponseOrBuilder {
        private Builder() {
            super(GetHierarchySettingsResponse.DEFAULT_INSTANCE);
        }

        public Builder addAllDisabledReceiptTypes(Iterable<? extends ReceiptType> iterable) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) ((g) this).instance).addAllDisabledReceiptTypes(iterable);
            return this;
        }

        public Builder addAllDisabledReceiptTypesValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) ((g) this).instance).addAllDisabledReceiptTypesValue(iterable);
            return this;
        }

        public Builder addDisabledReceiptTypes(ReceiptType receiptType) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) ((g) this).instance).addDisabledReceiptTypes(receiptType);
            return this;
        }

        public Builder addDisabledReceiptTypesValue(int i) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) ((g) this).instance).addDisabledReceiptTypesValue(i);
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

        public Builder clearDisabledReceiptTypes() {
            copyOnWrite();
            ((GetHierarchySettingsResponse) ((g) this).instance).clearDisabledReceiptTypes();
            return this;
        }

        public Builder clearMutedForCurrentUser() {
            copyOnWrite();
            ((GetHierarchySettingsResponse) ((g) this).instance).clearMutedForCurrentUser();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public ReceiptType getDisabledReceiptTypes(int i) {
            return ((GetHierarchySettingsResponse) ((g) this).instance).getDisabledReceiptTypes(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public int getDisabledReceiptTypesCount() {
            return ((GetHierarchySettingsResponse) ((g) this).instance).getDisabledReceiptTypesCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public List<ReceiptType> getDisabledReceiptTypesList() {
            return ((GetHierarchySettingsResponse) ((g) this).instance).getDisabledReceiptTypesList();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public int getDisabledReceiptTypesValue(int i) {
            return ((GetHierarchySettingsResponse) ((g) this).instance).getDisabledReceiptTypesValue(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public List<Integer> getDisabledReceiptTypesValueList() {
            return Collections.unmodifiableList(((GetHierarchySettingsResponse) ((g) this).instance).getDisabledReceiptTypesValueList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public boolean getMutedForCurrentUser() {
            return ((GetHierarchySettingsResponse) ((g) this).instance).getMutedForCurrentUser();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m334mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setDisabledReceiptTypes(int i, ReceiptType receiptType) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) ((g) this).instance).setDisabledReceiptTypes(i, receiptType);
            return this;
        }

        public Builder setDisabledReceiptTypesValue(int i, int i2) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) ((g) this).instance).setDisabledReceiptTypesValue(i, i2);
            return this;
        }

        public Builder setMutedForCurrentUser(boolean z) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) ((g) this).instance).setMutedForCurrentUser(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m333clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m335mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m332clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m336mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(GetHierarchySettingsResponse getHierarchySettingsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getHierarchySettingsResponse);
    }

    public static GetHierarchySettingsResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetHierarchySettingsResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetHierarchySettingsResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static GetHierarchySettingsResponse parseFrom(phc phcVar) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static GetHierarchySettingsResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static GetHierarchySettingsResponse parseFrom(byte[] bArr) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetHierarchySettingsResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static GetHierarchySettingsResponse parseFrom(InputStream inputStream) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetHierarchySettingsResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static GetHierarchySettingsResponse parseFrom(lwg lwgVar) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static GetHierarchySettingsResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (GetHierarchySettingsResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
