package com.spotify.playlist.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.list_collection.save_source.proto.SaveSource;
import java.io.InputStream;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b extends g implements v2j0 {
    public final void A(String str) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.y(str);
    }

    public final void B(String str) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.z(str);
    }

    public final void C(boolean z) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.A(z);
    }

    public final void D(SaveSource saveSource) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.B(saveSource);
    }

    public final /* bridge */ /* synthetic */ s2j0 build() {
        return build();
    }

    public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
        return super.buildPartial();
    }

    public final /* bridge */ /* synthetic */ r2j0 clear() {
        return clear();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m592mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.n(iterable);
    }

    public final void q(Iterable iterable) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.o(iterable);
    }

    public final void r(String str) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.p(str);
    }

    public final void s(String str) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.q(str);
    }

    public final void t(String str) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.s(str);
    }

    public final void u(a aVar) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        ModificationRequest.Attributes attributes = (ModificationRequest.Attributes) aVar.build();
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.t(attributes);
    }

    public final void v(ModificationRequest.Attributes attributes) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.t(attributes);
    }

    public final void w(String str) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.u(str);
    }

    public final void x(boolean z) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.v(z);
    }

    public final void y(CreationInfo creationInfo) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.w(creationInfo);
    }

    public final void z(String str) {
        copyOnWrite();
        ModificationRequest modificationRequest = (ModificationRequest) ((g) this).instance;
        int i = ModificationRequest.OPERATION_FIELD_NUMBER;
        modificationRequest.x(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m591clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m593mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m590clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m594mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
        return super/*p.r8*/.mergeFrom(phcVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
        return super/*p.r8*/.mergeFrom(lwgVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
        return super/*p.r8*/.mergeFrom(s2j0Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
        return super/*p.r8*/.mergeFrom(bArr);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }
}
