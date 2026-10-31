package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class LatestNodeResponse$Builder extends g implements LatestNodeResponseOrBuilder {
    private LatestNodeResponse$Builder() {
        super(LatestNodeResponse.t());
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

    public LatestNodeResponse$Builder clearClientNode() {
        copyOnWrite();
        LatestNodeResponse.n(((g) this).instance);
        return this;
    }

    public LatestNodeResponse$Builder clearHierarchy() {
        copyOnWrite();
        LatestNodeResponse.o(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public ClientNode getClientNode() {
        return ((g) this).instance.getClientNode();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public Hierarchy getHierarchy() {
        return ((g) this).instance.getHierarchy();
    }

    public boolean hasClientNode() {
        return ((g) this).instance.hasClientNode();
    }

    public boolean hasHierarchy() {
        return ((g) this).instance.hasHierarchy();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    public LatestNodeResponse$Builder mergeClientNode(ClientNode clientNode) {
        copyOnWrite();
        LatestNodeResponse.p(((g) this).instance, clientNode);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m463mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public LatestNodeResponse$Builder mergeHierarchy(Hierarchy hierarchy) {
        copyOnWrite();
        LatestNodeResponse.q(((g) this).instance, hierarchy);
        return this;
    }

    public LatestNodeResponse$Builder setClientNode(ClientNode.Builder builder) {
        copyOnWrite();
        LatestNodeResponse.r(((g) this).instance, (ClientNode) builder.build());
        return this;
    }

    public LatestNodeResponse$Builder setHierarchy(Hierarchy.Builder builder) {
        copyOnWrite();
        LatestNodeResponse.s(((g) this).instance, (Hierarchy) builder.build());
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m462clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m464mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m461clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m465mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ LatestNodeResponse$Builder(int i) {
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

    public LatestNodeResponse$Builder setClientNode(ClientNode clientNode) {
        copyOnWrite();
        LatestNodeResponse.r(((g) this).instance, clientNode);
        return this;
    }

    public LatestNodeResponse$Builder setHierarchy(Hierarchy hierarchy) {
        copyOnWrite();
        LatestNodeResponse.s(((g) this).instance, hierarchy);
        return this;
    }
}
