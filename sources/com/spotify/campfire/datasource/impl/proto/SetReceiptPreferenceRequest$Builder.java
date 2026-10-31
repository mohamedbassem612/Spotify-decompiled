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
public final class SetReceiptPreferenceRequest$Builder extends g implements SetReceiptPreferenceRequestOrBuilder {
    private SetReceiptPreferenceRequest$Builder() {
        super(SetReceiptPreferenceRequest.v());
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

    public SetReceiptPreferenceRequest$Builder clearDisabled() {
        copyOnWrite();
        SetReceiptPreferenceRequest.n(((g) this).instance);
        return this;
    }

    public SetReceiptPreferenceRequest$Builder clearHierarchyId() {
        copyOnWrite();
        SetReceiptPreferenceRequest.o(((g) this).instance);
        return this;
    }

    public SetReceiptPreferenceRequest$Builder clearReceiptType() {
        copyOnWrite();
        SetReceiptPreferenceRequest.p(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public boolean getDisabled() {
        return ((g) this).instance.getDisabled();
    }

    public String getHierarchyId() {
        return ((g) this).instance.getHierarchyId();
    }

    public phc getHierarchyIdBytes() {
        return ((g) this).instance.getHierarchyIdBytes();
    }

    public ReceiptType getReceiptType() {
        return ((g) this).instance.getReceiptType();
    }

    public int getReceiptTypeValue() {
        return ((g) this).instance.getReceiptTypeValue();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m699mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public SetReceiptPreferenceRequest$Builder setDisabled(boolean z) {
        copyOnWrite();
        SetReceiptPreferenceRequest.q(((g) this).instance, z);
        return this;
    }

    public SetReceiptPreferenceRequest$Builder setHierarchyId(String str) {
        copyOnWrite();
        SetReceiptPreferenceRequest.r(((g) this).instance, str);
        return this;
    }

    public SetReceiptPreferenceRequest$Builder setHierarchyIdBytes(phc phcVar) {
        copyOnWrite();
        SetReceiptPreferenceRequest.s(((g) this).instance, phcVar);
        return this;
    }

    public SetReceiptPreferenceRequest$Builder setReceiptType(ReceiptType receiptType) {
        copyOnWrite();
        SetReceiptPreferenceRequest.t(((g) this).instance, receiptType);
        return this;
    }

    public SetReceiptPreferenceRequest$Builder setReceiptTypeValue(int i) {
        copyOnWrite();
        SetReceiptPreferenceRequest.u(((g) this).instance, i);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m698clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m700mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m697clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m701mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ SetReceiptPreferenceRequest$Builder(int i) {
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
