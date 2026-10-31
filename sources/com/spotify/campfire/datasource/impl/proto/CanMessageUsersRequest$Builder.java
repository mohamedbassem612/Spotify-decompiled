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
public final class CanMessageUsersRequest$Builder extends g implements CanMessageUsersRequestOrBuilder {
    private CanMessageUsersRequest$Builder() {
        super(CanMessageUsersRequest.v());
    }

    public CanMessageUsersRequest$Builder addAllTargetUsernames(Iterable<String> iterable) {
        copyOnWrite();
        CanMessageUsersRequest.n(((g) this).instance, iterable);
        return this;
    }

    public CanMessageUsersRequest$Builder addTargetUsernames(String str) {
        copyOnWrite();
        CanMessageUsersRequest.o(((g) this).instance, str);
        return this;
    }

    public CanMessageUsersRequest$Builder addTargetUsernamesBytes(phc phcVar) {
        copyOnWrite();
        CanMessageUsersRequest.p(((g) this).instance, phcVar);
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

    public CanMessageUsersRequest$Builder clearSharedHierarchyTypeFilter() {
        copyOnWrite();
        CanMessageUsersRequest.q(((g) this).instance);
        return this;
    }

    public CanMessageUsersRequest$Builder clearTargetUsernames() {
        copyOnWrite();
        CanMessageUsersRequest.r(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public HierarchyType getSharedHierarchyTypeFilter() {
        return ((g) this).instance.getSharedHierarchyTypeFilter();
    }

    public int getSharedHierarchyTypeFilterValue() {
        return ((g) this).instance.getSharedHierarchyTypeFilterValue();
    }

    public String getTargetUsernames(int i) {
        return ((g) this).instance.getTargetUsernames(i);
    }

    public phc getTargetUsernamesBytes(int i) {
        return ((g) this).instance.getTargetUsernamesBytes(i);
    }

    public int getTargetUsernamesCount() {
        return ((g) this).instance.getTargetUsernamesCount();
    }

    public List<String> getTargetUsernamesList() {
        return Collections.unmodifiableList(((g) this).instance.getTargetUsernamesList());
    }

    public boolean hasSharedHierarchyTypeFilter() {
        return ((g) this).instance.hasSharedHierarchyTypeFilter();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m74mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public CanMessageUsersRequest$Builder setSharedHierarchyTypeFilter(HierarchyType hierarchyType) {
        copyOnWrite();
        CanMessageUsersRequest.s(((g) this).instance, hierarchyType);
        return this;
    }

    public CanMessageUsersRequest$Builder setSharedHierarchyTypeFilterValue(int i) {
        copyOnWrite();
        CanMessageUsersRequest.t(((g) this).instance, i);
        return this;
    }

    public CanMessageUsersRequest$Builder setTargetUsernames(int i, String str) {
        copyOnWrite();
        CanMessageUsersRequest.u(((g) this).instance, i, str);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m73clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m75mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m72clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m76mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ CanMessageUsersRequest$Builder(int i) {
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
}
