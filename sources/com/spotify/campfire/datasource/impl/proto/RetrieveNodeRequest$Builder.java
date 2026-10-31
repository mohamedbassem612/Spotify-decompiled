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
public final class RetrieveNodeRequest$Builder extends g implements RetrieveNodeRequestOrBuilder {
    private RetrieveNodeRequest$Builder() {
        super(RetrieveNodeRequest.O());
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

    public RetrieveNodeRequest$Builder clearFilter() {
        copyOnWrite();
        RetrieveNodeRequest.n(((g) this).instance);
        return this;
    }

    public RetrieveNodeRequest$Builder clearHierarchyId() {
        copyOnWrite();
        RetrieveNodeRequest.o(((g) this).instance);
        return this;
    }

    public RetrieveNodeRequest$Builder clearNextLimit() {
        copyOnWrite();
        RetrieveNodeRequest.p(((g) this).instance);
        return this;
    }

    public RetrieveNodeRequest$Builder clearNodePathId() {
        copyOnWrite();
        RetrieveNodeRequest.q(((g) this).instance);
        return this;
    }

    public RetrieveNodeRequest$Builder clearPageSize() {
        copyOnWrite();
        RetrieveNodeRequest.r(((g) this).instance);
        return this;
    }

    public RetrieveNodeRequest$Builder clearPageToken() {
        copyOnWrite();
        RetrieveNodeRequest.s(((g) this).instance);
        return this;
    }

    public RetrieveNodeRequest$Builder clearPrecondition() {
        copyOnWrite();
        RetrieveNodeRequest.t(((g) this).instance);
        return this;
    }

    public RetrieveNodeRequest$Builder clearPrevLimit() {
        copyOnWrite();
        RetrieveNodeRequest.u(((g) this).instance);
        return this;
    }

    public RetrieveNodeRequest$Builder clearShareMessageUri() {
        copyOnWrite();
        RetrieveNodeRequest.v(((g) this).instance);
        return this;
    }

    public RetrieveNodeRequest$Builder clearSortOrder() {
        copyOnWrite();
        RetrieveNodeRequest.w(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public RetrieveNodeRequest$Filter getFilter() {
        return ((g) this).instance.getFilter();
    }

    public String getHierarchyId() {
        return ((g) this).instance.getHierarchyId();
    }

    public phc getHierarchyIdBytes() {
        return ((g) this).instance.getHierarchyIdBytes();
    }

    public int getNextLimit() {
        return ((g) this).instance.getNextLimit();
    }

    public String getNodePathId() {
        return ((g) this).instance.getNodePathId();
    }

    public phc getNodePathIdBytes() {
        return ((g) this).instance.getNodePathIdBytes();
    }

    public int getPageSize() {
        return ((g) this).instance.getPageSize();
    }

    public String getPageToken() {
        return ((g) this).instance.getPageToken();
    }

    public phc getPageTokenBytes() {
        return ((g) this).instance.getPageTokenBytes();
    }

    public Precondition getPrecondition() {
        return ((g) this).instance.getPrecondition();
    }

    public int getPrevLimit() {
        return ((g) this).instance.getPrevLimit();
    }

    public String getShareMessageUri() {
        return ((g) this).instance.getShareMessageUri();
    }

    public phc getShareMessageUriBytes() {
        return ((g) this).instance.getShareMessageUriBytes();
    }

    public SortOrder getSortOrder() {
        return ((g) this).instance.getSortOrder();
    }

    public int getSortOrderValue() {
        return ((g) this).instance.getSortOrderValue();
    }

    public boolean hasFilter() {
        return ((g) this).instance.hasFilter();
    }

    public boolean hasPrecondition() {
        return ((g) this).instance.hasPrecondition();
    }

    public boolean hasShareMessageUri() {
        return ((g) this).instance.hasShareMessageUri();
    }

    public boolean hasSortOrder() {
        return ((g) this).instance.hasSortOrder();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    public RetrieveNodeRequest$Builder mergeFilter(RetrieveNodeRequest$Filter retrieveNodeRequest$Filter) {
        copyOnWrite();
        RetrieveNodeRequest.x(((g) this).instance, retrieveNodeRequest$Filter);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m669mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public RetrieveNodeRequest$Builder mergePrecondition(Precondition precondition) {
        copyOnWrite();
        RetrieveNodeRequest.y(((g) this).instance, precondition);
        return this;
    }

    public RetrieveNodeRequest$Builder setFilter(RetrieveNodeRequest$Filter.Builder builder) {
        copyOnWrite();
        RetrieveNodeRequest.z(((g) this).instance, (RetrieveNodeRequest$Filter) builder.build());
        return this;
    }

    public RetrieveNodeRequest$Builder setHierarchyId(String str) {
        copyOnWrite();
        RetrieveNodeRequest.A(((g) this).instance, str);
        return this;
    }

    public RetrieveNodeRequest$Builder setHierarchyIdBytes(phc phcVar) {
        copyOnWrite();
        RetrieveNodeRequest.B(((g) this).instance, phcVar);
        return this;
    }

    public RetrieveNodeRequest$Builder setNextLimit(int i) {
        copyOnWrite();
        RetrieveNodeRequest.C(((g) this).instance, i);
        return this;
    }

    public RetrieveNodeRequest$Builder setNodePathId(String str) {
        copyOnWrite();
        RetrieveNodeRequest.D(((g) this).instance, str);
        return this;
    }

    public RetrieveNodeRequest$Builder setNodePathIdBytes(phc phcVar) {
        copyOnWrite();
        RetrieveNodeRequest.E(((g) this).instance, phcVar);
        return this;
    }

    public RetrieveNodeRequest$Builder setPageSize(int i) {
        copyOnWrite();
        RetrieveNodeRequest.F(((g) this).instance, i);
        return this;
    }

    public RetrieveNodeRequest$Builder setPageToken(String str) {
        copyOnWrite();
        RetrieveNodeRequest.G(((g) this).instance, str);
        return this;
    }

    public RetrieveNodeRequest$Builder setPageTokenBytes(phc phcVar) {
        copyOnWrite();
        RetrieveNodeRequest.H(((g) this).instance, phcVar);
        return this;
    }

    public RetrieveNodeRequest$Builder setPrecondition(Precondition$Builder precondition$Builder) {
        copyOnWrite();
        RetrieveNodeRequest.I(((g) this).instance, precondition$Builder.build());
        return this;
    }

    public RetrieveNodeRequest$Builder setPrevLimit(int i) {
        copyOnWrite();
        RetrieveNodeRequest.J(((g) this).instance, i);
        return this;
    }

    public RetrieveNodeRequest$Builder setShareMessageUri(String str) {
        copyOnWrite();
        RetrieveNodeRequest.K(((g) this).instance, str);
        return this;
    }

    public RetrieveNodeRequest$Builder setShareMessageUriBytes(phc phcVar) {
        copyOnWrite();
        RetrieveNodeRequest.L(((g) this).instance, phcVar);
        return this;
    }

    public RetrieveNodeRequest$Builder setSortOrder(SortOrder sortOrder) {
        copyOnWrite();
        RetrieveNodeRequest.M(((g) this).instance, sortOrder);
        return this;
    }

    public RetrieveNodeRequest$Builder setSortOrderValue(int i) {
        copyOnWrite();
        RetrieveNodeRequest.N(((g) this).instance, i);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m668clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m670mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m667clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m671mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ RetrieveNodeRequest$Builder(int i) {
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

    public RetrieveNodeRequest$Builder setFilter(RetrieveNodeRequest$Filter retrieveNodeRequest$Filter) {
        copyOnWrite();
        RetrieveNodeRequest.z(((g) this).instance, retrieveNodeRequest$Filter);
        return this;
    }

    public RetrieveNodeRequest$Builder setPrecondition(Precondition precondition) {
        copyOnWrite();
        RetrieveNodeRequest.I(((g) this).instance, precondition);
        return this;
    }
}
