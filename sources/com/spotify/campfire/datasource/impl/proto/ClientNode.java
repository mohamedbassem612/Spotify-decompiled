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
public final class ClientNode extends h implements ClientNodeOrBuilder {
    public static final int CHILD_NODE_FIELD_NUMBER = 3;
    private static final ClientNode DEFAULT_INSTANCE;
    public static final int EVENT_CAPTURE_FIELD_NUMBER = 6;
    public static final int HIERARCHY_IDENTIFIER_FIELD_NUMBER = 2;
    public static final int MESSAGE_PAYLOAD_FIELD_NUMBER = 8;
    public static final int MODERATION_STATUS_FIELD_NUMBER = 5;
    public static final int NODE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int NODE_STATISTIC_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private h290 childNode_ = h.emptyProtobufList();
    private ClientEventCapture eventCapture_;
    private HierarchyIdentifier hierarchyIdentifier_;
    private MessagePayload messagePayload_;
    private ModerationStatus moderationStatus_;
    private NodeIdentifier nodeIdentifier_;
    private NodeStatistic nodeStatistic_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ClientNode$1, reason: invalid class name */
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
        ClientNode clientNode = new ClientNode();
        DEFAULT_INSTANCE = clientNode;
        h.registerDefaultInstance(ClientNode.class, clientNode);
    }

    private ClientNode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChildNode(Iterable<? extends ClientNode> iterable) {
        ensureChildNodeIsMutable();
        s8.addAll(iterable, this.childNode_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildNode(ClientNode clientNode) {
        clientNode.getClass();
        ensureChildNodeIsMutable();
        this.childNode_.add(clientNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildNode() {
        this.childNode_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventCapture() {
        this.eventCapture_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyIdentifier() {
        this.hierarchyIdentifier_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagePayload() {
        this.messagePayload_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModerationStatus() {
        this.moderationStatus_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeIdentifier() {
        this.nodeIdentifier_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeStatistic() {
        this.nodeStatistic_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureChildNodeIsMutable() {
        i9 i9Var = this.childNode_;
        if (i9Var.a) {
            return;
        }
        this.childNode_ = h.mutableCopy(i9Var);
    }

    public static ClientNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventCapture(ClientEventCapture clientEventCapture) {
        clientEventCapture.getClass();
        ClientEventCapture clientEventCapture2 = this.eventCapture_;
        if (clientEventCapture2 == null || clientEventCapture2 == ClientEventCapture.getDefaultInstance()) {
            this.eventCapture_ = clientEventCapture;
        } else {
            this.eventCapture_ = (ClientEventCapture) ((ClientEventCapture.Builder) ClientEventCapture.newBuilder(this.eventCapture_).mergeFrom(clientEventCapture)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        HierarchyIdentifier hierarchyIdentifier2 = this.hierarchyIdentifier_;
        if (hierarchyIdentifier2 == null || hierarchyIdentifier2 == HierarchyIdentifier.getDefaultInstance()) {
            this.hierarchyIdentifier_ = hierarchyIdentifier;
        } else {
            this.hierarchyIdentifier_ = (HierarchyIdentifier) ((HierarchyIdentifier.Builder) HierarchyIdentifier.newBuilder(this.hierarchyIdentifier_).mergeFrom(hierarchyIdentifier)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessagePayload(MessagePayload messagePayload) {
        messagePayload.getClass();
        MessagePayload messagePayload2 = this.messagePayload_;
        if (messagePayload2 == null || messagePayload2 == MessagePayload.getDefaultInstance()) {
            this.messagePayload_ = messagePayload;
        } else {
            this.messagePayload_ = (MessagePayload) ((MessagePayload.Builder) MessagePayload.newBuilder(this.messagePayload_).mergeFrom(messagePayload)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeModerationStatus(ModerationStatus moderationStatus) {
        moderationStatus.getClass();
        ModerationStatus moderationStatus2 = this.moderationStatus_;
        if (moderationStatus2 == null || moderationStatus2 == ModerationStatus.getDefaultInstance()) {
            this.moderationStatus_ = moderationStatus;
        } else {
            this.moderationStatus_ = (ModerationStatus) ((ModerationStatus.Builder) ModerationStatus.newBuilder(this.moderationStatus_).mergeFrom(moderationStatus)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNodeIdentifier(NodeIdentifier nodeIdentifier) {
        nodeIdentifier.getClass();
        NodeIdentifier nodeIdentifier2 = this.nodeIdentifier_;
        if (nodeIdentifier2 == null || nodeIdentifier2 == NodeIdentifier.getDefaultInstance()) {
            this.nodeIdentifier_ = nodeIdentifier;
        } else {
            this.nodeIdentifier_ = (NodeIdentifier) ((NodeIdentifier.Builder) NodeIdentifier.newBuilder(this.nodeIdentifier_).mergeFrom(nodeIdentifier)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNodeStatistic(NodeStatistic nodeStatistic) {
        nodeStatistic.getClass();
        NodeStatistic nodeStatistic2 = this.nodeStatistic_;
        if (nodeStatistic2 == null || nodeStatistic2 == NodeStatistic.getDefaultInstance()) {
            this.nodeStatistic_ = nodeStatistic;
        } else {
            this.nodeStatistic_ = (NodeStatistic) ((NodeStatistic.Builder) NodeStatistic.newBuilder(this.nodeStatistic_).mergeFrom(nodeStatistic)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientNode parseDelimitedFrom(InputStream inputStream) {
        return (ClientNode) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNode parseFrom(ByteBuffer byteBuffer) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChildNode(int i) {
        ensureChildNodeIsMutable();
        this.childNode_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildNode(int i, ClientNode clientNode) {
        clientNode.getClass();
        ensureChildNodeIsMutable();
        this.childNode_.set(i, clientNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventCapture(ClientEventCapture clientEventCapture) {
        clientEventCapture.getClass();
        this.eventCapture_ = clientEventCapture;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        this.hierarchyIdentifier_ = hierarchyIdentifier;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePayload(MessagePayload messagePayload) {
        messagePayload.getClass();
        this.messagePayload_ = messagePayload;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModerationStatus(ModerationStatus moderationStatus) {
        moderationStatus.getClass();
        this.moderationStatus_ = moderationStatus;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeIdentifier(NodeIdentifier nodeIdentifier) {
        nodeIdentifier.getClass();
        this.nodeIdentifier_ = nodeIdentifier;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeStatistic(NodeStatistic nodeStatistic) {
        nodeStatistic.getClass();
        this.nodeStatistic_ = nodeStatistic;
        this.bitField0_ |= 4;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\bဉ\u0005", new Object[]{"bitField0_", "nodeIdentifier_", "hierarchyIdentifier_", "childNode_", ClientNode.class, "nodeStatistic_", "moderationStatus_", "eventCapture_", "messagePayload_"});
        }
        if (iOrdinal == 3) {
            return new ClientNode();
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
        synchronized (ClientNode.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public ClientNode getChildNode(int i) {
        return (ClientNode) this.childNode_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public int getChildNodeCount() {
        return this.childNode_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public List<ClientNode> getChildNodeList() {
        return this.childNode_;
    }

    public ClientNodeOrBuilder getChildNodeOrBuilder(int i) {
        return (ClientNodeOrBuilder) this.childNode_.get(i);
    }

    public List<? extends ClientNodeOrBuilder> getChildNodeOrBuilderList() {
        return this.childNode_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public ClientEventCapture getEventCapture() {
        ClientEventCapture clientEventCapture = this.eventCapture_;
        return clientEventCapture == null ? ClientEventCapture.getDefaultInstance() : clientEventCapture;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public HierarchyIdentifier getHierarchyIdentifier() {
        HierarchyIdentifier hierarchyIdentifier = this.hierarchyIdentifier_;
        return hierarchyIdentifier == null ? HierarchyIdentifier.getDefaultInstance() : hierarchyIdentifier;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public MessagePayload getMessagePayload() {
        MessagePayload messagePayload = this.messagePayload_;
        return messagePayload == null ? MessagePayload.getDefaultInstance() : messagePayload;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public ModerationStatus getModerationStatus() {
        ModerationStatus moderationStatus = this.moderationStatus_;
        return moderationStatus == null ? ModerationStatus.getDefaultInstance() : moderationStatus;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public NodeIdentifier getNodeIdentifier() {
        NodeIdentifier nodeIdentifier = this.nodeIdentifier_;
        return nodeIdentifier == null ? NodeIdentifier.getDefaultInstance() : nodeIdentifier;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public NodeStatistic getNodeStatistic() {
        NodeStatistic nodeStatistic = this.nodeStatistic_;
        return nodeStatistic == null ? NodeStatistic.getDefaultInstance() : nodeStatistic;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasEventCapture() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasHierarchyIdentifier() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasMessagePayload() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasModerationStatus() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasNodeIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
    public boolean hasNodeStatistic() {
        return (this.bitField0_ & 4) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ClientNodeOrBuilder {
        private Builder() {
            super(ClientNode.DEFAULT_INSTANCE);
        }

        public Builder addAllChildNode(Iterable<? extends ClientNode> iterable) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).addAllChildNode(iterable);
            return this;
        }

        public Builder addChildNode(Builder builder) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).addChildNode((ClientNode) builder.build());
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

        public Builder clearChildNode() {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).clearChildNode();
            return this;
        }

        public Builder clearEventCapture() {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).clearEventCapture();
            return this;
        }

        public Builder clearHierarchyIdentifier() {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).clearHierarchyIdentifier();
            return this;
        }

        public Builder clearMessagePayload() {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).clearMessagePayload();
            return this;
        }

        public Builder clearModerationStatus() {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).clearModerationStatus();
            return this;
        }

        public Builder clearNodeIdentifier() {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).clearNodeIdentifier();
            return this;
        }

        public Builder clearNodeStatistic() {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).clearNodeStatistic();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public ClientNode getChildNode(int i) {
            return ((ClientNode) ((g) this).instance).getChildNode(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public int getChildNodeCount() {
            return ((ClientNode) ((g) this).instance).getChildNodeCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public List<ClientNode> getChildNodeList() {
            return Collections.unmodifiableList(((ClientNode) ((g) this).instance).getChildNodeList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public ClientEventCapture getEventCapture() {
            return ((ClientNode) ((g) this).instance).getEventCapture();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public HierarchyIdentifier getHierarchyIdentifier() {
            return ((ClientNode) ((g) this).instance).getHierarchyIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public MessagePayload getMessagePayload() {
            return ((ClientNode) ((g) this).instance).getMessagePayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public ModerationStatus getModerationStatus() {
            return ((ClientNode) ((g) this).instance).getModerationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public NodeIdentifier getNodeIdentifier() {
            return ((ClientNode) ((g) this).instance).getNodeIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public NodeStatistic getNodeStatistic() {
            return ((ClientNode) ((g) this).instance).getNodeStatistic();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasEventCapture() {
            return ((ClientNode) ((g) this).instance).hasEventCapture();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasHierarchyIdentifier() {
            return ((ClientNode) ((g) this).instance).hasHierarchyIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasMessagePayload() {
            return ((ClientNode) ((g) this).instance).hasMessagePayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasModerationStatus() {
            return ((ClientNode) ((g) this).instance).hasModerationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasNodeIdentifier() {
            return ((ClientNode) ((g) this).instance).hasNodeIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeOrBuilder
        public boolean hasNodeStatistic() {
            return ((ClientNode) ((g) this).instance).hasNodeStatistic();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeEventCapture(ClientEventCapture clientEventCapture) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).mergeEventCapture(clientEventCapture);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m114mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).mergeHierarchyIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder mergeMessagePayload(MessagePayload messagePayload) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).mergeMessagePayload(messagePayload);
            return this;
        }

        public Builder mergeModerationStatus(ModerationStatus moderationStatus) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).mergeModerationStatus(moderationStatus);
            return this;
        }

        public Builder mergeNodeIdentifier(NodeIdentifier nodeIdentifier) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).mergeNodeIdentifier(nodeIdentifier);
            return this;
        }

        public Builder mergeNodeStatistic(NodeStatistic nodeStatistic) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).mergeNodeStatistic(nodeStatistic);
            return this;
        }

        public Builder removeChildNode(int i) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).removeChildNode(i);
            return this;
        }

        public Builder setChildNode(int i, Builder builder) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setChildNode(i, (ClientNode) builder.build());
            return this;
        }

        public Builder setEventCapture(ClientEventCapture.Builder builder) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setEventCapture((ClientEventCapture) builder.build());
            return this;
        }

        public Builder setHierarchyIdentifier(HierarchyIdentifier.Builder builder) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setHierarchyIdentifier((HierarchyIdentifier) builder.build());
            return this;
        }

        public Builder setMessagePayload(MessagePayload.Builder builder) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setMessagePayload((MessagePayload) builder.build());
            return this;
        }

        public Builder setModerationStatus(ModerationStatus.Builder builder) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setModerationStatus((ModerationStatus) builder.build());
            return this;
        }

        public Builder setNodeIdentifier(NodeIdentifier.Builder builder) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setNodeIdentifier((NodeIdentifier) builder.build());
            return this;
        }

        public Builder setNodeStatistic(NodeStatistic.Builder builder) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setNodeStatistic((NodeStatistic) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m113clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m115mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m112clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m116mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addChildNode(int i, ClientNode clientNode) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).addChildNode(i, clientNode);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setChildNode(int i, ClientNode clientNode) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setChildNode(i, clientNode);
            return this;
        }

        public Builder setEventCapture(ClientEventCapture clientEventCapture) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setEventCapture(clientEventCapture);
            return this;
        }

        public Builder setHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setHierarchyIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder setMessagePayload(MessagePayload messagePayload) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setMessagePayload(messagePayload);
            return this;
        }

        public Builder setModerationStatus(ModerationStatus moderationStatus) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setModerationStatus(moderationStatus);
            return this;
        }

        public Builder setNodeIdentifier(NodeIdentifier nodeIdentifier) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setNodeIdentifier(nodeIdentifier);
            return this;
        }

        public Builder setNodeStatistic(NodeStatistic nodeStatistic) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).setNodeStatistic(nodeStatistic);
            return this;
        }

        public Builder addChildNode(ClientNode clientNode) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).addChildNode(clientNode);
            return this;
        }

        public Builder addChildNode(int i, Builder builder) {
            copyOnWrite();
            ((ClientNode) ((g) this).instance).addChildNode(i, (ClientNode) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ClientNode clientNode) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(clientNode);
    }

    public static ClientNode parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClientNode) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClientNode parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ClientNode parseFrom(phc phcVar) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ClientNode parseFrom(phc phcVar, uz00 uz00Var) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildNode(int i, ClientNode clientNode) {
        clientNode.getClass();
        ensureChildNodeIsMutable();
        this.childNode_.add(i, clientNode);
    }

    public static ClientNode parseFrom(byte[] bArr) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientNode parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ClientNode parseFrom(InputStream inputStream) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNode parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClientNode parseFrom(lwg lwgVar) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ClientNode parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ClientNode) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
