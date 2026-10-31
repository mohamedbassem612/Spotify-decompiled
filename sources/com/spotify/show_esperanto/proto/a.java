package com.spotify.show_esperanto.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import p.lwg;
import p.oia1;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.t160;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a extends g implements v2j0 {
    public final void A(int i) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i2 = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.x(i);
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
    public final /* bridge */ /* synthetic */ r8 m115mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(HeaderPolicy headerPolicy) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.o(headerPolicy);
    }

    public final void q(t160 t160Var) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        HeaderPolicy headerPolicy = (HeaderPolicy) t160Var.build();
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.o(headerPolicy);
    }

    public final void r() {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.p();
    }

    public final void s(ListPolicy listPolicy) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.q(listPolicy);
    }

    public final void t(boolean z) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.r(z);
    }

    public final void u(QueryFilter queryFilter) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.s(queryFilter);
    }

    public final void v(b bVar) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        GetShowRequest.Range range = (GetShowRequest.Range) bVar.build();
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.t(range);
    }

    public final void w(GetShowRequest.Range range) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.t(range);
    }

    public final void x(SectionsPolicy sectionsPolicy) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.u(sectionsPolicy);
    }

    public final void y(String str) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.v(str);
    }

    public final void z(oia1 oia1Var) {
        copyOnWrite();
        GetShowRequest getShowRequest = (GetShowRequest) ((g) this).instance;
        int i = GetShowRequest.SHOW_ID_FIELD_NUMBER;
        getShowRequest.w(oia1Var);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m114clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m116mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m113clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m117mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
