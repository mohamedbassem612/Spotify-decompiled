package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ClientNodeRequest$Builder extends g implements ClientNodeRequestOrBuilder {
    private ClientNodeRequest$Builder() {
        super(ClientNodeRequest.z());
    }

    public ClientNodeRequest$Builder addAllNodeRequest(Iterable<? extends NodeRequest> iterable) {
        copyOnWrite();
        ClientNodeRequest.n(((g) this).instance, iterable);
        return this;
    }

    public ClientNodeRequest$Builder addNodeRequest(NodeRequest.Builder builder) {
        copyOnWrite();
        ClientNodeRequest.p(((g) this).instance, (NodeRequest) builder.build());
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

    public ClientNodeRequest$Builder clearNodeRequest() {
        copyOnWrite();
        ClientNodeRequest.q(((g) this).instance);
        return this;
    }

    public ClientNodeRequest$Builder clearOmitLatestNodeUpdates() {
        copyOnWrite();
        ClientNodeRequest.r(((g) this).instance);
        return this;
    }

    public ClientNodeRequest$Builder clearOmitPubsubEvents() {
        copyOnWrite();
        ClientNodeRequest.s(((g) this).instance);
        return this;
    }

    public ClientNodeRequest$Builder clearOmitPusherEvents() {
        copyOnWrite();
        ClientNodeRequest.t(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public NodeRequest getNodeRequest(int i) {
        return ((g) this).instance.getNodeRequest(i);
    }

    public int getNodeRequestCount() {
        return ((g) this).instance.getNodeRequestCount();
    }

    public List<NodeRequest> getNodeRequestList() {
        return Collections.unmodifiableList(((g) this).instance.getNodeRequestList());
    }

    public boolean getOmitLatestNodeUpdates() {
        return ((g) this).instance.getOmitLatestNodeUpdates();
    }

    public boolean getOmitPubsubEvents() {
        return ((g) this).instance.getOmitPubsubEvents();
    }

    public boolean getOmitPusherEvents() {
        return ((g) this).instance.getOmitPusherEvents();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m119mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public ClientNodeRequest$Builder removeNodeRequest(int i) {
        copyOnWrite();
        ClientNodeRequest.u(((g) this).instance, i);
        return this;
    }

    public ClientNodeRequest$Builder setNodeRequest(int i, NodeRequest.Builder builder) {
        copyOnWrite();
        ClientNodeRequest.v(((g) this).instance, i, (NodeRequest) builder.build());
        return this;
    }

    public ClientNodeRequest$Builder setOmitLatestNodeUpdates(boolean z) {
        copyOnWrite();
        ClientNodeRequest.w(((g) this).instance, z);
        return this;
    }

    public ClientNodeRequest$Builder setOmitPubsubEvents(boolean z) {
        copyOnWrite();
        ClientNodeRequest.x(((g) this).instance, z);
        return this;
    }

    public ClientNodeRequest$Builder setOmitPusherEvents(boolean z) {
        copyOnWrite();
        ClientNodeRequest.y(((g) this).instance, z);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m118clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m120mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m117clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m121mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ ClientNodeRequest$Builder(int i) {
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

    public ClientNodeRequest$Builder addNodeRequest(int i, NodeRequest nodeRequest) {
        copyOnWrite();
        ClientNodeRequest.o(((g) this).instance, i, nodeRequest);
        return this;
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }

    public ClientNodeRequest$Builder setNodeRequest(int i, NodeRequest nodeRequest) {
        copyOnWrite();
        ClientNodeRequest.v(((g) this).instance, i, nodeRequest);
        return this;
    }

    public ClientNodeRequest$Builder addNodeRequest(NodeRequest nodeRequest) {
        copyOnWrite();
        ClientNodeRequest.p(((g) this).instance, nodeRequest);
        return this;
    }

    public ClientNodeRequest$Builder addNodeRequest(int i, NodeRequest.Builder builder) {
        copyOnWrite();
        ClientNodeRequest.o(((g) this).instance, i, (NodeRequest) builder.build());
        return this;
    }
}
