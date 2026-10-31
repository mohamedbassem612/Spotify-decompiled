package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Timestamp;
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
import p.sve1;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class NodeRequest extends h implements NodeRequestOrBuilder {
    public static final int BULK_MESSAGE_REQUEST_FIELD_NUMBER = 3;
    private static final NodeRequest DEFAULT_INSTANCE;
    public static final int DIGEST_FIELD_NUMBER = 6;
    public static final int HIERARCHY_REQUEST_FIELD_NUMBER = 1;
    public static final int MESSAGE_REQUEST_FIELD_NUMBER = 2;
    public static final int OCCURRED_AT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int REPLAY_FIELD_NUMBER = 5;
    private int bitField0_;
    private Object cnr_;
    private Timestamp occurredAt_;
    private boolean replay_;
    private int cnrCase_ = 0;
    private String digest_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.NodeRequest$1, reason: invalid class name */
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
        NodeRequest nodeRequest = new NodeRequest();
        DEFAULT_INSTANCE = nodeRequest;
        h.registerDefaultInstance(NodeRequest.class, nodeRequest);
    }

    private NodeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBulkMessageRequest() {
        if (this.cnrCase_ == 3) {
            this.cnrCase_ = 0;
            this.cnr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCnr() {
        this.cnrCase_ = 0;
        this.cnr_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDigest() {
        this.bitField0_ &= -5;
        this.digest_ = getDefaultInstance().getDigest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyRequest() {
        if (this.cnrCase_ == 1) {
            this.cnrCase_ = 0;
            this.cnr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageRequest() {
        if (this.cnrCase_ == 2) {
            this.cnrCase_ = 0;
            this.cnr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOccurredAt() {
        this.occurredAt_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplay() {
        this.bitField0_ &= -3;
        this.replay_ = false;
    }

    public static NodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBulkMessageRequest(BulkMessageRequest bulkMessageRequest) {
        bulkMessageRequest.getClass();
        if (this.cnrCase_ != 3 || this.cnr_ == BulkMessageRequest.getDefaultInstance()) {
            this.cnr_ = bulkMessageRequest;
        } else {
            this.cnr_ = ((BulkMessageRequest.Builder) BulkMessageRequest.newBuilder((BulkMessageRequest) this.cnr_).mergeFrom(bulkMessageRequest)).buildPartial();
        }
        this.cnrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyRequest(HierarchyRequest hierarchyRequest) {
        hierarchyRequest.getClass();
        if (this.cnrCase_ != 1 || this.cnr_ == HierarchyRequest.getDefaultInstance()) {
            this.cnr_ = hierarchyRequest;
        } else {
            this.cnr_ = ((HierarchyRequest.Builder) HierarchyRequest.newBuilder((HierarchyRequest) this.cnr_).mergeFrom(hierarchyRequest)).buildPartial();
        }
        this.cnrCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessageRequest(MessageRequest messageRequest) {
        messageRequest.getClass();
        if (this.cnrCase_ != 2 || this.cnr_ == MessageRequest.getDefaultInstance()) {
            this.cnr_ = messageRequest;
        } else {
            this.cnr_ = ((MessageRequest.Builder) MessageRequest.newBuilder((MessageRequest) this.cnr_).mergeFrom(messageRequest)).buildPartial();
        }
        this.cnrCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOccurredAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.occurredAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.o()) {
            this.occurredAt_ = timestamp;
        } else {
            this.occurredAt_ = Timestamp.s(this.occurredAt_).mergeFrom(timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NodeRequest parseDelimitedFrom(InputStream inputStream) {
        return (NodeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeRequest parseFrom(ByteBuffer byteBuffer) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBulkMessageRequest(BulkMessageRequest bulkMessageRequest) {
        bulkMessageRequest.getClass();
        this.cnr_ = bulkMessageRequest;
        this.cnrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDigest(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.digest_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDigestBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.digest_ = phcVar.v();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyRequest(HierarchyRequest hierarchyRequest) {
        hierarchyRequest.getClass();
        this.cnr_ = hierarchyRequest;
        this.cnrCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageRequest(MessageRequest messageRequest) {
        messageRequest.getClass();
        this.cnr_ = messageRequest;
        this.cnrCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccurredAt(Timestamp timestamp) {
        timestamp.getClass();
        this.occurredAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplay(boolean z) {
        this.bitField0_ |= 2;
        this.replay_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0000\u0005ဇ\u0001\u0006ለ\u0002", new Object[]{"cnr_", "cnrCase_", "bitField0_", HierarchyRequest.class, MessageRequest.class, BulkMessageRequest.class, "occurredAt_", "replay_", "digest_"});
        }
        if (iOrdinal == 3) {
            return new NodeRequest();
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
        synchronized (NodeRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public BulkMessageRequest getBulkMessageRequest() {
        return this.cnrCase_ == 3 ? (BulkMessageRequest) this.cnr_ : BulkMessageRequest.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public CnrCase getCnrCase() {
        return CnrCase.forNumber(this.cnrCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public String getDigest() {
        return this.digest_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public phc getDigestBytes() {
        return phc.i(this.digest_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public HierarchyRequest getHierarchyRequest() {
        return this.cnrCase_ == 1 ? (HierarchyRequest) this.cnr_ : HierarchyRequest.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public MessageRequest getMessageRequest() {
        return this.cnrCase_ == 2 ? (MessageRequest) this.cnr_ : MessageRequest.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public Timestamp getOccurredAt() {
        Timestamp timestamp = this.occurredAt_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean getReplay() {
        return this.replay_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasBulkMessageRequest() {
        return this.cnrCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasDigest() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasHierarchyRequest() {
        return this.cnrCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasMessageRequest() {
        return this.cnrCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasOccurredAt() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
    public boolean hasReplay() {
        return (this.bitField0_ & 2) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements NodeRequestOrBuilder {
        private Builder() {
            super(NodeRequest.DEFAULT_INSTANCE);
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

        public Builder clearBulkMessageRequest() {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).clearBulkMessageRequest();
            return this;
        }

        public Builder clearCnr() {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).clearCnr();
            return this;
        }

        public Builder clearDigest() {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).clearDigest();
            return this;
        }

        public Builder clearHierarchyRequest() {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).clearHierarchyRequest();
            return this;
        }

        public Builder clearMessageRequest() {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).clearMessageRequest();
            return this;
        }

        public Builder clearOccurredAt() {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).clearOccurredAt();
            return this;
        }

        public Builder clearReplay() {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).clearReplay();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public BulkMessageRequest getBulkMessageRequest() {
            return ((NodeRequest) ((g) this).instance).getBulkMessageRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public CnrCase getCnrCase() {
            return ((NodeRequest) ((g) this).instance).getCnrCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public String getDigest() {
            return ((NodeRequest) ((g) this).instance).getDigest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public phc getDigestBytes() {
            return ((NodeRequest) ((g) this).instance).getDigestBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public HierarchyRequest getHierarchyRequest() {
            return ((NodeRequest) ((g) this).instance).getHierarchyRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public MessageRequest getMessageRequest() {
            return ((NodeRequest) ((g) this).instance).getMessageRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public Timestamp getOccurredAt() {
            return ((NodeRequest) ((g) this).instance).getOccurredAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean getReplay() {
            return ((NodeRequest) ((g) this).instance).getReplay();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasBulkMessageRequest() {
            return ((NodeRequest) ((g) this).instance).hasBulkMessageRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasDigest() {
            return ((NodeRequest) ((g) this).instance).hasDigest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasHierarchyRequest() {
            return ((NodeRequest) ((g) this).instance).hasHierarchyRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasMessageRequest() {
            return ((NodeRequest) ((g) this).instance).hasMessageRequest();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasOccurredAt() {
            return ((NodeRequest) ((g) this).instance).hasOccurredAt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeRequestOrBuilder
        public boolean hasReplay() {
            return ((NodeRequest) ((g) this).instance).hasReplay();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeBulkMessageRequest(BulkMessageRequest bulkMessageRequest) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).mergeBulkMessageRequest(bulkMessageRequest);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m544mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeHierarchyRequest(HierarchyRequest hierarchyRequest) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).mergeHierarchyRequest(hierarchyRequest);
            return this;
        }

        public Builder mergeMessageRequest(MessageRequest messageRequest) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).mergeMessageRequest(messageRequest);
            return this;
        }

        public Builder mergeOccurredAt(Timestamp timestamp) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).mergeOccurredAt(timestamp);
            return this;
        }

        public Builder setBulkMessageRequest(BulkMessageRequest.Builder builder) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setBulkMessageRequest((BulkMessageRequest) builder.build());
            return this;
        }

        public Builder setDigest(String str) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setDigest(str);
            return this;
        }

        public Builder setDigestBytes(phc phcVar) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setDigestBytes(phcVar);
            return this;
        }

        public Builder setHierarchyRequest(HierarchyRequest.Builder builder) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setHierarchyRequest((HierarchyRequest) builder.build());
            return this;
        }

        public Builder setMessageRequest(MessageRequest.Builder builder) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setMessageRequest((MessageRequest) builder.build());
            return this;
        }

        public Builder setOccurredAt(sve1 sve1Var) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setOccurredAt(sve1Var.build());
            return this;
        }

        public Builder setReplay(boolean z) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setReplay(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m543clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m545mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m542clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m546mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setBulkMessageRequest(BulkMessageRequest bulkMessageRequest) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setBulkMessageRequest(bulkMessageRequest);
            return this;
        }

        public Builder setHierarchyRequest(HierarchyRequest hierarchyRequest) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setHierarchyRequest(hierarchyRequest);
            return this;
        }

        public Builder setMessageRequest(MessageRequest messageRequest) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setMessageRequest(messageRequest);
            return this;
        }

        public Builder setOccurredAt(Timestamp timestamp) {
            copyOnWrite();
            ((NodeRequest) ((g) this).instance).setOccurredAt(timestamp);
            return this;
        }
    }

    public enum CnrCase {
        HIERARCHY_REQUEST(1),
        MESSAGE_REQUEST(2),
        BULK_MESSAGE_REQUEST(3),
        CNR_NOT_SET(0);

        private final int value;

        CnrCase(int i) {
            this.value = i;
        }

        public static CnrCase forNumber(int i) {
            if (i == 0) {
                return CNR_NOT_SET;
            }
            if (i == 1) {
                return HIERARCHY_REQUEST;
            }
            if (i == 2) {
                return MESSAGE_REQUEST;
            }
            if (i != 3) {
                return null;
            }
            return BULK_MESSAGE_REQUEST;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CnrCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(NodeRequest nodeRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nodeRequest);
    }

    public static NodeRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (NodeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static NodeRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static NodeRequest parseFrom(phc phcVar) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static NodeRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static NodeRequest parseFrom(byte[] bArr) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NodeRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static NodeRequest parseFrom(InputStream inputStream) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static NodeRequest parseFrom(lwg lwgVar) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static NodeRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (NodeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
