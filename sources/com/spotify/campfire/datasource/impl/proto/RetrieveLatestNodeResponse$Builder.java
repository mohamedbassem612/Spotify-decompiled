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
public final class RetrieveLatestNodeResponse$Builder extends g implements RetrieveLatestNodeResponseOrBuilder {
    private RetrieveLatestNodeResponse$Builder() {
        super(RetrieveLatestNodeResponse.t());
    }

    public RetrieveLatestNodeResponse$Builder addAllLatestNodeResponse(Iterable<? extends LatestNodeResponse> iterable) {
        copyOnWrite();
        RetrieveLatestNodeResponse.n(((g) this).instance, iterable);
        return this;
    }

    public RetrieveLatestNodeResponse$Builder addLatestNodeResponse(LatestNodeResponse$Builder latestNodeResponse$Builder) {
        copyOnWrite();
        RetrieveLatestNodeResponse.p(((g) this).instance, latestNodeResponse$Builder.build());
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

    public RetrieveLatestNodeResponse$Builder clearLatestNodeResponse() {
        copyOnWrite();
        RetrieveLatestNodeResponse.q(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public LatestNodeResponse getLatestNodeResponse(int i) {
        return ((g) this).instance.getLatestNodeResponse(i);
    }

    public int getLatestNodeResponseCount() {
        return ((g) this).instance.getLatestNodeResponseCount();
    }

    public List<LatestNodeResponse> getLatestNodeResponseList() {
        return Collections.unmodifiableList(((g) this).instance.getLatestNodeResponseList());
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m664mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public RetrieveLatestNodeResponse$Builder removeLatestNodeResponse(int i) {
        copyOnWrite();
        RetrieveLatestNodeResponse.r(((g) this).instance, i);
        return this;
    }

    public RetrieveLatestNodeResponse$Builder setLatestNodeResponse(int i, LatestNodeResponse$Builder latestNodeResponse$Builder) {
        copyOnWrite();
        RetrieveLatestNodeResponse.s(((g) this).instance, i, latestNodeResponse$Builder.build());
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m663clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m665mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m662clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m666mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ RetrieveLatestNodeResponse$Builder(int i) {
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

    public RetrieveLatestNodeResponse$Builder addLatestNodeResponse(int i, LatestNodeResponse latestNodeResponse) {
        copyOnWrite();
        RetrieveLatestNodeResponse.o(((g) this).instance, i, latestNodeResponse);
        return this;
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }

    public RetrieveLatestNodeResponse$Builder setLatestNodeResponse(int i, LatestNodeResponse latestNodeResponse) {
        copyOnWrite();
        RetrieveLatestNodeResponse.s(((g) this).instance, i, latestNodeResponse);
        return this;
    }

    public RetrieveLatestNodeResponse$Builder addLatestNodeResponse(LatestNodeResponse latestNodeResponse) {
        copyOnWrite();
        RetrieveLatestNodeResponse.p(((g) this).instance, latestNodeResponse);
        return this;
    }

    public RetrieveLatestNodeResponse$Builder addLatestNodeResponse(int i, LatestNodeResponse$Builder latestNodeResponse$Builder) {
        copyOnWrite();
        RetrieveLatestNodeResponse.o(((g) this).instance, i, latestNodeResponse$Builder.build());
        return this;
    }
}
