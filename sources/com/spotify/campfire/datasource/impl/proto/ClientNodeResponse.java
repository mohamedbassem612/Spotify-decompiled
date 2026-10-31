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
public final class ClientNodeResponse extends h implements ClientNodeResponseOrBuilder {
    public static final int CLIENT_NODE_FIELD_NUMBER = 2;
    private static final ClientNodeResponse DEFAULT_INSTANCE;
    public static final int HIERARCHY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private h290 clientNode_ = h.emptyProtobufList();
    private Hierarchy hierarchy_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ClientNodeResponse$1, reason: invalid class name */
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
        ClientNodeResponse clientNodeResponse = new ClientNodeResponse();
        DEFAULT_INSTANCE = clientNodeResponse;
        h.registerDefaultInstance(ClientNodeResponse.class, clientNodeResponse);
    }

    private ClientNodeResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClientNode(Iterable<? extends ClientNode> iterable) {
        ensureClientNodeIsMutable();
        s8.addAll(iterable, this.clientNode_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientNode(ClientNode clientNode) {
        clientNode.getClass();
        ensureClientNodeIsMutable();
        this.clientNode_.add(clientNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientNode() {
        this.clientNode_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchy() {
        this.hierarchy_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureClientNodeIsMutable() {
        i9 i9Var = this.clientNode_;
        if (i9Var.a) {
            return;
        }
        this.clientNode_ = h.mutableCopy(i9Var);
    }

    public static ClientNodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchy(Hierarchy hierarchy) {
        hierarchy.getClass();
        Hierarchy hierarchy2 = this.hierarchy_;
        if (hierarchy2 == null || hierarchy2 == Hierarchy.getDefaultInstance()) {
            this.hierarchy_ = hierarchy;
        } else {
            this.hierarchy_ = (Hierarchy) ((Hierarchy.Builder) Hierarchy.newBuilder(this.hierarchy_).mergeFrom(hierarchy)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientNodeResponse parseDelimitedFrom(InputStream inputStream) {
        return (ClientNodeResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNodeResponse parseFrom(ByteBuffer byteBuffer) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeClientNode(int i) {
        ensureClientNodeIsMutable();
        this.clientNode_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientNode(int i, ClientNode clientNode) {
        clientNode.getClass();
        ensureClientNodeIsMutable();
        this.clientNode_.set(i, clientNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchy(Hierarchy hierarchy) {
        hierarchy.getClass();
        this.hierarchy_ = hierarchy;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "hierarchy_", "clientNode_", ClientNode.class});
        }
        if (iOrdinal == 3) {
            return new ClientNodeResponse();
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
        synchronized (ClientNodeResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public ClientNode getClientNode(int i) {
        return (ClientNode) this.clientNode_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public int getClientNodeCount() {
        return this.clientNode_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public List<ClientNode> getClientNodeList() {
        return this.clientNode_;
    }

    public ClientNodeOrBuilder getClientNodeOrBuilder(int i) {
        return (ClientNodeOrBuilder) this.clientNode_.get(i);
    }

    public List<? extends ClientNodeOrBuilder> getClientNodeOrBuilderList() {
        return this.clientNode_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public Hierarchy getHierarchy() {
        Hierarchy hierarchy = this.hierarchy_;
        return hierarchy == null ? Hierarchy.getDefaultInstance() : hierarchy;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
    public boolean hasHierarchy() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ClientNodeResponseOrBuilder {
        private Builder() {
            super(ClientNodeResponse.DEFAULT_INSTANCE);
        }

        public Builder addAllClientNode(Iterable<? extends ClientNode> iterable) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).addAllClientNode(iterable);
            return this;
        }

        public Builder addClientNode(ClientNode.Builder builder) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).addClientNode((ClientNode) builder.build());
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

        public Builder clearClientNode() {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).clearClientNode();
            return this;
        }

        public Builder clearHierarchy() {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).clearHierarchy();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public ClientNode getClientNode(int i) {
            return ((ClientNodeResponse) ((g) this).instance).getClientNode(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public int getClientNodeCount() {
            return ((ClientNodeResponse) ((g) this).instance).getClientNodeCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public List<ClientNode> getClientNodeList() {
            return Collections.unmodifiableList(((ClientNodeResponse) ((g) this).instance).getClientNodeList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public Hierarchy getHierarchy() {
            return ((ClientNodeResponse) ((g) this).instance).getHierarchy();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeResponseOrBuilder
        public boolean hasHierarchy() {
            return ((ClientNodeResponse) ((g) this).instance).hasHierarchy();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m124mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeHierarchy(Hierarchy hierarchy) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).mergeHierarchy(hierarchy);
            return this;
        }

        public Builder removeClientNode(int i) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).removeClientNode(i);
            return this;
        }

        public Builder setClientNode(int i, ClientNode.Builder builder) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).setClientNode(i, (ClientNode) builder.build());
            return this;
        }

        public Builder setHierarchy(Hierarchy.Builder builder) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).setHierarchy((Hierarchy) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m123clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m125mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m122clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m126mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addClientNode(int i, ClientNode clientNode) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).addClientNode(i, clientNode);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setClientNode(int i, ClientNode clientNode) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).setClientNode(i, clientNode);
            return this;
        }

        public Builder setHierarchy(Hierarchy hierarchy) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).setHierarchy(hierarchy);
            return this;
        }

        public Builder addClientNode(ClientNode clientNode) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).addClientNode(clientNode);
            return this;
        }

        public Builder addClientNode(int i, ClientNode.Builder builder) {
            copyOnWrite();
            ((ClientNodeResponse) ((g) this).instance).addClientNode(i, (ClientNode) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ClientNodeResponse clientNodeResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(clientNodeResponse);
    }

    public static ClientNodeResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClientNodeResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClientNodeResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ClientNodeResponse parseFrom(phc phcVar) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ClientNodeResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientNode(int i, ClientNode clientNode) {
        clientNode.getClass();
        ensureClientNodeIsMutable();
        this.clientNode_.add(i, clientNode);
    }

    public static ClientNodeResponse parseFrom(byte[] bArr) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientNodeResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ClientNodeResponse parseFrom(InputStream inputStream) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNodeResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClientNodeResponse parseFrom(lwg lwgVar) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ClientNodeResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ClientNodeResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
