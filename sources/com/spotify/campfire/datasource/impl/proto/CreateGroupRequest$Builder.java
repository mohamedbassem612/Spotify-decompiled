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
public final class CreateGroupRequest$Builder extends g implements CreateGroupRequestOrBuilder {
    private CreateGroupRequest$Builder() {
        super(CreateGroupRequest.y());
    }

    public CreateGroupRequest$Builder addAllMemberUsername(Iterable<String> iterable) {
        copyOnWrite();
        CreateGroupRequest.n(((g) this).instance, iterable);
        return this;
    }

    public CreateGroupRequest$Builder addMemberUsername(String str) {
        copyOnWrite();
        CreateGroupRequest.o(((g) this).instance, str);
        return this;
    }

    public CreateGroupRequest$Builder addMemberUsernameBytes(phc phcVar) {
        copyOnWrite();
        CreateGroupRequest.p(((g) this).instance, phcVar);
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

    public CreateGroupRequest$Builder clearCreateGroupOptions() {
        copyOnWrite();
        CreateGroupRequest.q(((g) this).instance);
        return this;
    }

    public CreateGroupRequest$Builder clearMemberUsername() {
        copyOnWrite();
        CreateGroupRequest.r(((g) this).instance);
        return this;
    }

    public CreateGroupRequest$Builder clearName() {
        copyOnWrite();
        CreateGroupRequest.s(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public CreateGroupOptions getCreateGroupOptions() {
        return ((g) this).instance.getCreateGroupOptions();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public String getMemberUsername(int i) {
        return ((g) this).instance.getMemberUsername(i);
    }

    public phc getMemberUsernameBytes(int i) {
        return ((g) this).instance.getMemberUsernameBytes(i);
    }

    public int getMemberUsernameCount() {
        return ((g) this).instance.getMemberUsernameCount();
    }

    public List<String> getMemberUsernameList() {
        return Collections.unmodifiableList(((g) this).instance.getMemberUsernameList());
    }

    public String getName() {
        return ((g) this).instance.getName();
    }

    public phc getNameBytes() {
        return ((g) this).instance.getNameBytes();
    }

    public boolean hasCreateGroupOptions() {
        return ((g) this).instance.hasCreateGroupOptions();
    }

    public boolean hasName() {
        return ((g) this).instance.hasName();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    public CreateGroupRequest$Builder mergeCreateGroupOptions(CreateGroupOptions createGroupOptions) {
        copyOnWrite();
        CreateGroupRequest.t(((g) this).instance, createGroupOptions);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m150mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public CreateGroupRequest$Builder setCreateGroupOptions(CreateGroupOptions.Builder builder) {
        copyOnWrite();
        CreateGroupRequest.u(((g) this).instance, (CreateGroupOptions) builder.build());
        return this;
    }

    public CreateGroupRequest$Builder setMemberUsername(int i, String str) {
        copyOnWrite();
        CreateGroupRequest.v(((g) this).instance, i, str);
        return this;
    }

    public CreateGroupRequest$Builder setName(String str) {
        copyOnWrite();
        CreateGroupRequest.w(((g) this).instance, str);
        return this;
    }

    public CreateGroupRequest$Builder setNameBytes(phc phcVar) {
        copyOnWrite();
        CreateGroupRequest.x(((g) this).instance, phcVar);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m149clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m151mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m148clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m152mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ CreateGroupRequest$Builder(int i) {
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

    public CreateGroupRequest$Builder setCreateGroupOptions(CreateGroupOptions createGroupOptions) {
        copyOnWrite();
        CreateGroupRequest.u(((g) this).instance, createGroupOptions);
        return this;
    }
}
