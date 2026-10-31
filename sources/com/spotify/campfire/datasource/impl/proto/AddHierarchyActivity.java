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
public final class AddHierarchyActivity extends h implements AddHierarchyActivityOrBuilder {
    private static final AddHierarchyActivity DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    private int bitField0_;
    private String hierarchyId_ = "";
    private ActivityRequest request_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.AddHierarchyActivity$1, reason: invalid class name */
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
        AddHierarchyActivity addHierarchyActivity = new AddHierarchyActivity();
        DEFAULT_INSTANCE = addHierarchyActivity;
        h.registerDefaultInstance(AddHierarchyActivity.class, addHierarchyActivity);
    }

    private AddHierarchyActivity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
        this.bitField0_ &= -2;
    }

    public static AddHierarchyActivity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequest(ActivityRequest activityRequest) {
        activityRequest.getClass();
        ActivityRequest activityRequest2 = this.request_;
        if (activityRequest2 == null || activityRequest2 == ActivityRequest.getDefaultInstance()) {
            this.request_ = activityRequest;
        } else {
            this.request_ = (ActivityRequest) ((ActivityRequest.Builder) ActivityRequest.newBuilder(this.request_).mergeFrom(activityRequest)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AddHierarchyActivity parseDelimitedFrom(InputStream inputStream) {
        return (AddHierarchyActivity) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddHierarchyActivity parseFrom(ByteBuffer byteBuffer) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.hierarchyId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequest(ActivityRequest activityRequest) {
        activityRequest.getClass();
        this.request_ = activityRequest;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "hierarchyId_", "request_"});
        }
        if (iOrdinal == 3) {
            return new AddHierarchyActivity();
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
        synchronized (AddHierarchyActivity.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
    public phc getHierarchyIdBytes() {
        return phc.i(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
    public ActivityRequest getRequest() {
        ActivityRequest activityRequest = this.request_;
        return activityRequest == null ? ActivityRequest.getDefaultInstance() : activityRequest;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
    public boolean hasRequest() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AddHierarchyActivityOrBuilder {
        private Builder() {
            super(AddHierarchyActivity.DEFAULT_INSTANCE);
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

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((AddHierarchyActivity) ((g) this).instance).clearHierarchyId();
            return this;
        }

        public Builder clearRequest() {
            copyOnWrite();
            ((AddHierarchyActivity) ((g) this).instance).clearRequest();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
        public String getHierarchyId() {
            return ((AddHierarchyActivity) ((g) this).instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
        public phc getHierarchyIdBytes() {
            return ((AddHierarchyActivity) ((g) this).instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
        public ActivityRequest getRequest() {
            return ((AddHierarchyActivity) ((g) this).instance).getRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddHierarchyActivityOrBuilder
        public boolean hasRequest() {
            return ((AddHierarchyActivity) ((g) this).instance).hasRequest();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m34mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeRequest(ActivityRequest activityRequest) {
            copyOnWrite();
            ((AddHierarchyActivity) ((g) this).instance).mergeRequest(activityRequest);
            return this;
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((AddHierarchyActivity) ((g) this).instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(phc phcVar) {
            copyOnWrite();
            ((AddHierarchyActivity) ((g) this).instance).setHierarchyIdBytes(phcVar);
            return this;
        }

        public Builder setRequest(ActivityRequest.Builder builder) {
            copyOnWrite();
            ((AddHierarchyActivity) ((g) this).instance).setRequest((ActivityRequest) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m33clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m35mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m32clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m36mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setRequest(ActivityRequest activityRequest) {
            copyOnWrite();
            ((AddHierarchyActivity) ((g) this).instance).setRequest(activityRequest);
            return this;
        }
    }

    public static Builder newBuilder(AddHierarchyActivity addHierarchyActivity) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(addHierarchyActivity);
    }

    public static AddHierarchyActivity parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (AddHierarchyActivity) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AddHierarchyActivity parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static AddHierarchyActivity parseFrom(phc phcVar) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static AddHierarchyActivity parseFrom(phc phcVar, uz00 uz00Var) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static AddHierarchyActivity parseFrom(byte[] bArr) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddHierarchyActivity parseFrom(byte[] bArr, uz00 uz00Var) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static AddHierarchyActivity parseFrom(InputStream inputStream) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddHierarchyActivity parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AddHierarchyActivity parseFrom(lwg lwgVar) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static AddHierarchyActivity parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (AddHierarchyActivity) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
