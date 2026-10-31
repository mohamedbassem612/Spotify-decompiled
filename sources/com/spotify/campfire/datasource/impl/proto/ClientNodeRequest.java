package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ClientNodeRequest extends h implements ClientNodeRequestOrBuilder {
    private static final ClientNodeRequest DEFAULT_INSTANCE;
    public static final int NODE_REQUEST_FIELD_NUMBER = 1;
    public static final int OMIT_LATEST_NODE_UPDATES_FIELD_NUMBER = 4;
    public static final int OMIT_PUBSUB_EVENTS_FIELD_NUMBER = 3;
    public static final int OMIT_PUSHER_EVENTS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private h290 nodeRequest_ = h.emptyProtobufList();
    private boolean omitLatestNodeUpdates_;
    private boolean omitPubsubEvents_;
    private boolean omitPusherEvents_;

    static {
        ClientNodeRequest clientNodeRequest = new ClientNodeRequest();
        DEFAULT_INSTANCE = clientNodeRequest;
        h.registerDefaultInstance(ClientNodeRequest.class, clientNodeRequest);
    }

    private ClientNodeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNodeRequest(Iterable<? extends NodeRequest> iterable) {
        ensureNodeRequestIsMutable();
        s8.addAll(iterable, this.nodeRequest_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodeRequest(NodeRequest nodeRequest) {
        nodeRequest.getClass();
        ensureNodeRequestIsMutable();
        this.nodeRequest_.add(nodeRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeRequest() {
        this.nodeRequest_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOmitLatestNodeUpdates() {
        this.omitLatestNodeUpdates_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOmitPubsubEvents() {
        this.omitPubsubEvents_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOmitPusherEvents() {
        this.omitPusherEvents_ = false;
    }

    private void ensureNodeRequestIsMutable() {
        h290 h290Var = this.nodeRequest_;
        if (((i9) h290Var).a) {
            return;
        }
        this.nodeRequest_ = h.mutableCopy(h290Var);
    }

    public static ClientNodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientNodeRequest parseDelimitedFrom(InputStream inputStream) {
        return (ClientNodeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNodeRequest parseFrom(ByteBuffer byteBuffer) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNodeRequest(int i) {
        ensureNodeRequestIsMutable();
        this.nodeRequest_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeRequest(int i, NodeRequest nodeRequest) {
        nodeRequest.getClass();
        ensureNodeRequestIsMutable();
        this.nodeRequest_.set(i, nodeRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmitLatestNodeUpdates(boolean z) {
        this.omitLatestNodeUpdates_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmitPubsubEvents(boolean z) {
        this.omitPubsubEvents_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOmitPusherEvents(boolean z) {
        this.omitPusherEvents_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"nodeRequest_", NodeRequest.class, "omitPusherEvents_", "omitPubsubEvents_", "omitLatestNodeUpdates_"});
        }
        if (iOrdinal == 3) {
            return new ClientNodeRequest();
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
        synchronized (ClientNodeRequest.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public NodeRequest getNodeRequest(int i) {
        return (NodeRequest) this.nodeRequest_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public int getNodeRequestCount() {
        return this.nodeRequest_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public List<NodeRequest> getNodeRequestList() {
        return this.nodeRequest_;
    }

    public NodeRequestOrBuilder getNodeRequestOrBuilder(int i) {
        return (NodeRequestOrBuilder) this.nodeRequest_.get(i);
    }

    public List<? extends NodeRequestOrBuilder> getNodeRequestOrBuilderList() {
        return this.nodeRequest_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public boolean getOmitLatestNodeUpdates() {
        return this.omitLatestNodeUpdates_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public boolean getOmitPubsubEvents() {
        return this.omitPubsubEvents_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientNodeRequestOrBuilder
    public boolean getOmitPusherEvents() {
        return this.omitPusherEvents_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ClientNodeRequest clientNodeRequest) {
        return DEFAULT_INSTANCE.createBuilder(clientNodeRequest);
    }

    public static ClientNodeRequest parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClientNodeRequest) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClientNodeRequest parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ClientNodeRequest parseFrom(phc phcVar) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ClientNodeRequest parseFrom(phc phcVar, uz00 uz00Var) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodeRequest(int i, NodeRequest nodeRequest) {
        nodeRequest.getClass();
        ensureNodeRequestIsMutable();
        this.nodeRequest_.add(i, nodeRequest);
    }

    public static ClientNodeRequest parseFrom(byte[] bArr) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientNodeRequest parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ClientNodeRequest parseFrom(InputStream inputStream) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientNodeRequest parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClientNodeRequest parseFrom(lwg lwgVar) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ClientNodeRequest parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ClientNodeRequest) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
