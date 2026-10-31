package com.spotify.campfire.datasource.impl.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class AddNodeActivity extends h implements AddNodeActivityOrBuilder {
    private static final AddNodeActivity DEFAULT_INSTANCE;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    private int bitField0_;
    private h290 nodePathId_ = h.emptyProtobufList();
    private ActivityRequest request_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.AddNodeActivity$1, reason: invalid class name */
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
        AddNodeActivity addNodeActivity = new AddNodeActivity();
        DEFAULT_INSTANCE = addNodeActivity;
        h.registerDefaultInstance(AddNodeActivity.class, addNodeActivity);
    }

    private AddNodeActivity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNodePathId(Iterable<String> iterable) {
        ensureNodePathIdIsMutable();
        s8.addAll(iterable, this.nodePathId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodePathId(String str) {
        str.getClass();
        ensureNodePathIdIsMutable();
        this.nodePathId_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodePathIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        ensureNodePathIdIsMutable();
        this.nodePathId_.add(phcVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureNodePathIdIsMutable() {
        i9 i9Var = this.nodePathId_;
        if (i9Var.a) {
            return;
        }
        this.nodePathId_ = h.mutableCopy(i9Var);
    }

    public static AddNodeActivity getDefaultInstance() {
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

    public static AddNodeActivity parseDelimitedFrom(InputStream inputStream) {
        return (AddNodeActivity) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddNodeActivity parseFrom(ByteBuffer byteBuffer) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathId(int i, String str) {
        str.getClass();
        ensureNodePathIdIsMutable();
        this.nodePathId_.set(i, str);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ဉ\u0000", new Object[]{"bitField0_", "nodePathId_", "request_"});
        }
        if (iOrdinal == 3) {
            return new AddNodeActivity();
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
        synchronized (AddNodeActivity.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public String getNodePathId(int i) {
        return (String) this.nodePathId_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public phc getNodePathIdBytes(int i) {
        return phc.i((String) this.nodePathId_.get(i));
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public int getNodePathIdCount() {
        return this.nodePathId_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public List<String> getNodePathIdList() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public ActivityRequest getRequest() {
        ActivityRequest activityRequest = this.request_;
        return activityRequest == null ? ActivityRequest.getDefaultInstance() : activityRequest;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
    public boolean hasRequest() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AddNodeActivityOrBuilder {
        private Builder() {
            super(AddNodeActivity.DEFAULT_INSTANCE);
        }

        public Builder addAllNodePathId(Iterable<String> iterable) {
            copyOnWrite();
            ((AddNodeActivity) ((g) this).instance).addAllNodePathId(iterable);
            return this;
        }

        public Builder addNodePathId(String str) {
            copyOnWrite();
            ((AddNodeActivity) ((g) this).instance).addNodePathId(str);
            return this;
        }

        public Builder addNodePathIdBytes(phc phcVar) {
            copyOnWrite();
            ((AddNodeActivity) ((g) this).instance).addNodePathIdBytes(phcVar);
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

        public Builder clearNodePathId() {
            copyOnWrite();
            ((AddNodeActivity) ((g) this).instance).clearNodePathId();
            return this;
        }

        public Builder clearRequest() {
            copyOnWrite();
            ((AddNodeActivity) ((g) this).instance).clearRequest();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public String getNodePathId(int i) {
            return ((AddNodeActivity) ((g) this).instance).getNodePathId(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public phc getNodePathIdBytes(int i) {
            return ((AddNodeActivity) ((g) this).instance).getNodePathIdBytes(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public int getNodePathIdCount() {
            return ((AddNodeActivity) ((g) this).instance).getNodePathIdCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public List<String> getNodePathIdList() {
            return Collections.unmodifiableList(((AddNodeActivity) ((g) this).instance).getNodePathIdList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public ActivityRequest getRequest() {
            return ((AddNodeActivity) ((g) this).instance).getRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddNodeActivityOrBuilder
        public boolean hasRequest() {
            return ((AddNodeActivity) ((g) this).instance).hasRequest();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m54mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeRequest(ActivityRequest activityRequest) {
            copyOnWrite();
            ((AddNodeActivity) ((g) this).instance).mergeRequest(activityRequest);
            return this;
        }

        public Builder setNodePathId(int i, String str) {
            copyOnWrite();
            ((AddNodeActivity) ((g) this).instance).setNodePathId(i, str);
            return this;
        }

        public Builder setRequest(ActivityRequest.Builder builder) {
            copyOnWrite();
            ((AddNodeActivity) ((g) this).instance).setRequest((ActivityRequest) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m53clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m55mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m52clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m56mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
            ((AddNodeActivity) ((g) this).instance).setRequest(activityRequest);
            return this;
        }
    }

    public static Builder newBuilder(AddNodeActivity addNodeActivity) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(addNodeActivity);
    }

    public static AddNodeActivity parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (AddNodeActivity) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AddNodeActivity parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static AddNodeActivity parseFrom(phc phcVar) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static AddNodeActivity parseFrom(phc phcVar, uz00 uz00Var) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static AddNodeActivity parseFrom(byte[] bArr) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddNodeActivity parseFrom(byte[] bArr, uz00 uz00Var) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static AddNodeActivity parseFrom(InputStream inputStream) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddNodeActivity parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AddNodeActivity parseFrom(lwg lwgVar) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static AddNodeActivity parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (AddNodeActivity) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
