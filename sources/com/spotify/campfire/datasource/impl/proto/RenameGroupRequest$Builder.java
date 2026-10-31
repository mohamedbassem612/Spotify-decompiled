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
public final class RenameGroupRequest$Builder extends g implements RenameGroupRequestOrBuilder {
    private RenameGroupRequest$Builder() {
        super(RenameGroupRequest.q());
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

    public RenameGroupRequest$Builder clearRenameGroup() {
        copyOnWrite();
        RenameGroupRequest.n(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public RenameGroup getRenameGroup() {
        return ((g) this).instance.getRenameGroup();
    }

    public boolean hasRenameGroup() {
        return ((g) this).instance.hasRenameGroup();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m643mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public RenameGroupRequest$Builder mergeRenameGroup(RenameGroup renameGroup) {
        copyOnWrite();
        RenameGroupRequest.o(((g) this).instance, renameGroup);
        return this;
    }

    public RenameGroupRequest$Builder setRenameGroup(RenameGroup.Builder builder) {
        copyOnWrite();
        RenameGroupRequest.p(((g) this).instance, (RenameGroup) builder.build());
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m642clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m644mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m641clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m645mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ RenameGroupRequest$Builder(int i) {
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

    public RenameGroupRequest$Builder setRenameGroup(RenameGroup renameGroup) {
        copyOnWrite();
        RenameGroupRequest.p(((g) this).instance, renameGroup);
        return this;
    }
}
