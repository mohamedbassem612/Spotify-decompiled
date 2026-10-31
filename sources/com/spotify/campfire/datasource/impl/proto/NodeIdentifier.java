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
public final class NodeIdentifier extends h implements NodeIdentifierOrBuilder {
    private static final NodeIdentifier DEFAULT_INSTANCE;
    public static final int NODE_CLASS_FIELD_NUMBER = 2;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private NodeClass nodeClass_;
    private String nodePathId_ = "";
    private String uri_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.NodeIdentifier$1, reason: invalid class name */
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
        NodeIdentifier nodeIdentifier = new NodeIdentifier();
        DEFAULT_INSTANCE = nodeIdentifier;
        h.registerDefaultInstance(NodeIdentifier.class, nodeIdentifier);
    }

    private NodeIdentifier() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeClass() {
        this.nodeClass_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = getDefaultInstance().getNodePathId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static NodeIdentifier getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNodeClass(NodeClass nodeClass) {
        nodeClass.getClass();
        NodeClass nodeClass2 = this.nodeClass_;
        if (nodeClass2 == null || nodeClass2 == NodeClass.getDefaultInstance()) {
            this.nodeClass_ = nodeClass;
        } else {
            this.nodeClass_ = (NodeClass) ((NodeClass.Builder) NodeClass.newBuilder(this.nodeClass_).mergeFrom(nodeClass)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NodeIdentifier parseDelimitedFrom(InputStream inputStream) {
        return (NodeIdentifier) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeIdentifier parseFrom(ByteBuffer byteBuffer) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeClass(NodeClass nodeClass) {
        nodeClass.getClass();
        this.nodeClass_ = nodeClass;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathId(String str) {
        str.getClass();
        this.nodePathId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.nodePathId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.uri_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "nodePathId_", "nodeClass_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new NodeIdentifier();
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
        synchronized (NodeIdentifier.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public NodeClass getNodeClass() {
        NodeClass nodeClass = this.nodeClass_;
        return nodeClass == null ? NodeClass.getDefaultInstance() : nodeClass;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public String getNodePathId() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public phc getNodePathIdBytes() {
        return phc.i(this.nodePathId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public phc getUriBytes() {
        return phc.i(this.uri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
    public boolean hasNodeClass() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements NodeIdentifierOrBuilder {
        private Builder() {
            super(NodeIdentifier.DEFAULT_INSTANCE);
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

        public Builder clearNodeClass() {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).clearNodeClass();
            return this;
        }

        public Builder clearNodePathId() {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).clearNodePathId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).clearUri();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public NodeClass getNodeClass() {
            return ((NodeIdentifier) ((g) this).instance).getNodeClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public String getNodePathId() {
            return ((NodeIdentifier) ((g) this).instance).getNodePathId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public phc getNodePathIdBytes() {
            return ((NodeIdentifier) ((g) this).instance).getNodePathIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public String getUri() {
            return ((NodeIdentifier) ((g) this).instance).getUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public phc getUriBytes() {
            return ((NodeIdentifier) ((g) this).instance).getUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeIdentifierOrBuilder
        public boolean hasNodeClass() {
            return ((NodeIdentifier) ((g) this).instance).hasNodeClass();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m539mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeNodeClass(NodeClass nodeClass) {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).mergeNodeClass(nodeClass);
            return this;
        }

        public Builder setNodeClass(NodeClass.Builder builder) {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).setNodeClass((NodeClass) builder.build());
            return this;
        }

        public Builder setNodePathId(String str) {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).setNodePathId(str);
            return this;
        }

        public Builder setNodePathIdBytes(phc phcVar) {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).setNodePathIdBytes(phcVar);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(phc phcVar) {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).setUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m538clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m540mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m537clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m541mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setNodeClass(NodeClass nodeClass) {
            copyOnWrite();
            ((NodeIdentifier) ((g) this).instance).setNodeClass(nodeClass);
            return this;
        }
    }

    public static Builder newBuilder(NodeIdentifier nodeIdentifier) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nodeIdentifier);
    }

    public static NodeIdentifier parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (NodeIdentifier) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static NodeIdentifier parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static NodeIdentifier parseFrom(phc phcVar) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static NodeIdentifier parseFrom(phc phcVar, uz00 uz00Var) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static NodeIdentifier parseFrom(byte[] bArr) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NodeIdentifier parseFrom(byte[] bArr, uz00 uz00Var) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static NodeIdentifier parseFrom(InputStream inputStream) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeIdentifier parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static NodeIdentifier parseFrom(lwg lwgVar) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static NodeIdentifier parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (NodeIdentifier) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
