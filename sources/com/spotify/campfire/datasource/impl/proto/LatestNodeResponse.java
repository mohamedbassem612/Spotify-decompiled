package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class LatestNodeResponse extends h implements LatestNodeResponseOrBuilder {
    public static final int CLIENT_NODE_FIELD_NUMBER = 2;
    private static final LatestNodeResponse DEFAULT_INSTANCE;
    public static final int HIERARCHY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ClientNode clientNode_;
    private Hierarchy hierarchy_;

    static {
        LatestNodeResponse latestNodeResponse = new LatestNodeResponse();
        DEFAULT_INSTANCE = latestNodeResponse;
        h.registerDefaultInstance(LatestNodeResponse.class, latestNodeResponse);
    }

    private LatestNodeResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientNode() {
        this.clientNode_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchy() {
        this.hierarchy_ = null;
        this.bitField0_ &= -2;
    }

    public static LatestNodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientNode(ClientNode clientNode) {
        clientNode.getClass();
        ClientNode clientNode2 = this.clientNode_;
        if (clientNode2 == null || clientNode2 == ClientNode.getDefaultInstance()) {
            this.clientNode_ = clientNode;
        } else {
            this.clientNode_ = ClientNode.newBuilder(this.clientNode_).mergeFrom(clientNode).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchy(Hierarchy hierarchy) {
        hierarchy.getClass();
        Hierarchy hierarchy2 = this.hierarchy_;
        if (hierarchy2 == null || hierarchy2 == Hierarchy.getDefaultInstance()) {
            this.hierarchy_ = hierarchy;
        } else {
            this.hierarchy_ = Hierarchy.newBuilder(this.hierarchy_).mergeFrom(hierarchy).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LatestNodeResponse parseDelimitedFrom(InputStream inputStream) {
        return (LatestNodeResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LatestNodeResponse parseFrom(ByteBuffer byteBuffer) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientNode(ClientNode clientNode) {
        clientNode.getClass();
        this.clientNode_ = clientNode;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchy(Hierarchy hierarchy) {
        hierarchy.getClass();
        this.hierarchy_ = hierarchy;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "hierarchy_", "clientNode_"});
        }
        if (iOrdinal == 3) {
            return new LatestNodeResponse();
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
        synchronized (LatestNodeResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
    public ClientNode getClientNode() {
        ClientNode clientNode = this.clientNode_;
        return clientNode == null ? ClientNode.getDefaultInstance() : clientNode;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
    public Hierarchy getHierarchy() {
        Hierarchy hierarchy = this.hierarchy_;
        return hierarchy == null ? Hierarchy.getDefaultInstance() : hierarchy;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
    public boolean hasClientNode() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.LatestNodeResponseOrBuilder
    public boolean hasHierarchy() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(LatestNodeResponse latestNodeResponse) {
        return DEFAULT_INSTANCE.createBuilder(latestNodeResponse);
    }

    public static LatestNodeResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (LatestNodeResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static LatestNodeResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static LatestNodeResponse parseFrom(phc phcVar) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static LatestNodeResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static LatestNodeResponse parseFrom(byte[] bArr) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LatestNodeResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static LatestNodeResponse parseFrom(InputStream inputStream) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LatestNodeResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static LatestNodeResponse parseFrom(lwg lwgVar) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static LatestNodeResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (LatestNodeResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
