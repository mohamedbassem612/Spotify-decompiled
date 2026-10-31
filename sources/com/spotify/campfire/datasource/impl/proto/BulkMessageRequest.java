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
public final class BulkMessageRequest extends h implements BulkMessageRequestOrBuilder {
    public static final int ADD_HIERARCHY_ACTIVITY_FIELD_NUMBER = 2;
    public static final int ADD_NODE_ACTIVITY_FIELD_NUMBER = 1;
    private static final BulkMessageRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int bmrCase_ = 0;
    private Object bmr_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.BulkMessageRequest$1, reason: invalid class name */
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
        BulkMessageRequest bulkMessageRequest = new BulkMessageRequest();
        DEFAULT_INSTANCE = bulkMessageRequest;
        h.registerDefaultInstance(BulkMessageRequest.class, bulkMessageRequest);
    }

    private BulkMessageRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddHierarchyActivity() {
        if (this.bmrCase_ == 2) {
            this.bmrCase_ = 0;
            this.bmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddNodeActivity() {
        if (this.bmrCase_ == 1) {
            this.bmrCase_ = 0;
            this.bmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBmr() {
        this.bmrCase_ = 0;
        this.bmr_ = null;
    }

    public static BulkMessageRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddHierarchyActivity(AddHierarchyActivity addHierarchyActivity) {
        addHierarchyActivity.getClass();
        if (this.bmrCase_ != 2 || this.bmr_ == AddHierarchyActivity.getDefaultInstance()) {
            this.bmr_ = addHierarchyActivity;
        } else {
            this.bmr_ = ((AddHierarchyActivity.Builder) AddHierarchyActivity.newBuilder((AddHierarchyActivity) this.bmr_).mergeFrom(addHierarchyActivity)).buildPartial();
        }
        this.bmrCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddNodeActivity(AddNodeActivity addNodeActivity) {
        addNodeActivity.getClass();
        if (this.bmrCase_ != 1 || this.bmr_ == AddNodeActivity.getDefaultInstance()) {
            this.bmr_ = addNodeActivity;
        } else {
            this.bmr_ = ((AddNodeActivity.Builder) AddNodeActivity.newBuilder((AddNodeActivity) this.bmr_).mergeFrom(addNodeActivity)).buildPartial();
        }
        this.bmrCase_ = 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static BulkMessageRequest parseDelimitedFrom(InputStream inputStream) {
        return (BulkMessageRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BulkMessageRequest parseFrom(ByteBuffer byteBuffer) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddHierarchyActivity(AddHierarchyActivity addHierarchyActivity) {
        addHierarchyActivity.getClass();
        this.bmr_ = addHierarchyActivity;
        this.bmrCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddNodeActivity(AddNodeActivity addNodeActivity) {
        addNodeActivity.getClass();
        this.bmr_ = addNodeActivity;
        this.bmrCase_ = 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"bmr_", "bmrCase_", AddNodeActivity.class, AddHierarchyActivity.class});
        }
        if (iOrdinal == 3) {
            return new BulkMessageRequest();
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
        synchronized (BulkMessageRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public AddHierarchyActivity getAddHierarchyActivity() {
        return this.bmrCase_ == 2 ? (AddHierarchyActivity) this.bmr_ : AddHierarchyActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public AddNodeActivity getAddNodeActivity() {
        return this.bmrCase_ == 1 ? (AddNodeActivity) this.bmr_ : AddNodeActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public BmrCase getBmrCase() {
        return BmrCase.forNumber(this.bmrCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public boolean hasAddHierarchyActivity() {
        return this.bmrCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
    public boolean hasAddNodeActivity() {
        return this.bmrCase_ == 1;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements BulkMessageRequestOrBuilder {
        private Builder() {
            super(BulkMessageRequest.DEFAULT_INSTANCE);
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

        public Builder clearAddHierarchyActivity() {
            copyOnWrite();
            ((BulkMessageRequest) ((g) this).instance).clearAddHierarchyActivity();
            return this;
        }

        public Builder clearAddNodeActivity() {
            copyOnWrite();
            ((BulkMessageRequest) ((g) this).instance).clearAddNodeActivity();
            return this;
        }

        public Builder clearBmr() {
            copyOnWrite();
            ((BulkMessageRequest) ((g) this).instance).clearBmr();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public AddHierarchyActivity getAddHierarchyActivity() {
            return ((BulkMessageRequest) ((g) this).instance).getAddHierarchyActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public AddNodeActivity getAddNodeActivity() {
            return ((BulkMessageRequest) ((g) this).instance).getAddNodeActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public BmrCase getBmrCase() {
            return ((BulkMessageRequest) ((g) this).instance).getBmrCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public boolean hasAddHierarchyActivity() {
            return ((BulkMessageRequest) ((g) this).instance).hasAddHierarchyActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.BulkMessageRequestOrBuilder
        public boolean hasAddNodeActivity() {
            return ((BulkMessageRequest) ((g) this).instance).hasAddNodeActivity();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeAddHierarchyActivity(AddHierarchyActivity addHierarchyActivity) {
            copyOnWrite();
            ((BulkMessageRequest) ((g) this).instance).mergeAddHierarchyActivity(addHierarchyActivity);
            return this;
        }

        public Builder mergeAddNodeActivity(AddNodeActivity addNodeActivity) {
            copyOnWrite();
            ((BulkMessageRequest) ((g) this).instance).mergeAddNodeActivity(addNodeActivity);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m69mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAddHierarchyActivity(AddHierarchyActivity.Builder builder) {
            copyOnWrite();
            ((BulkMessageRequest) ((g) this).instance).setAddHierarchyActivity((AddHierarchyActivity) builder.build());
            return this;
        }

        public Builder setAddNodeActivity(AddNodeActivity.Builder builder) {
            copyOnWrite();
            ((BulkMessageRequest) ((g) this).instance).setAddNodeActivity((AddNodeActivity) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m68clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m70mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m67clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m71mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setAddHierarchyActivity(AddHierarchyActivity addHierarchyActivity) {
            copyOnWrite();
            ((BulkMessageRequest) ((g) this).instance).setAddHierarchyActivity(addHierarchyActivity);
            return this;
        }

        public Builder setAddNodeActivity(AddNodeActivity addNodeActivity) {
            copyOnWrite();
            ((BulkMessageRequest) ((g) this).instance).setAddNodeActivity(addNodeActivity);
            return this;
        }
    }

    public enum BmrCase {
        ADD_NODE_ACTIVITY(1),
        ADD_HIERARCHY_ACTIVITY(2),
        BMR_NOT_SET(0);

        private final int value;

        BmrCase(int i) {
            this.value = i;
        }

        public static BmrCase forNumber(int i) {
            if (i == 0) {
                return BMR_NOT_SET;
            }
            if (i == 1) {
                return ADD_NODE_ACTIVITY;
            }
            if (i != 2) {
                return null;
            }
            return ADD_HIERARCHY_ACTIVITY;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static BmrCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(BulkMessageRequest bulkMessageRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(bulkMessageRequest);
    }

    public static BulkMessageRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (BulkMessageRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static BulkMessageRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static BulkMessageRequest parseFrom(phc phcVar) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static BulkMessageRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static BulkMessageRequest parseFrom(byte[] bArr) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BulkMessageRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static BulkMessageRequest parseFrom(InputStream inputStream) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BulkMessageRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static BulkMessageRequest parseFrom(lwg lwgVar) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static BulkMessageRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (BulkMessageRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
