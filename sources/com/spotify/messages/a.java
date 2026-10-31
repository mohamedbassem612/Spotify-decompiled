package com.spotify.messages;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.util.Map;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a extends g implements v2j0 {
    public final void A(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.y(str);
    }

    public final void B(b bVar) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        UbiProd1Impression.SourcePaths sourcePaths = (UbiProd1Impression.SourcePaths) bVar.build();
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.z(sourcePaths);
    }

    public final void C(Map map) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.B().putAll(map);
    }

    public final void D(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.B().put("source_paths_unavailable_reason", str);
    }

    public final void E(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.D(str);
    }

    public final void F(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.E(str);
    }

    public final void G(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.setApp(str);
    }

    public final void H(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.F(str);
    }

    public final void I(int i) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i2 = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.G(i);
    }

    public final void J(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.H(str);
    }

    public final void K(long j) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.I(j);
    }

    public final void L(long j) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.J(j);
    }

    public final void M(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.K(str);
    }

    public final void N(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.L(str);
    }

    public final void O() {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.M();
    }

    public final void P(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.N(str);
    }

    public final void Q(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.O(str);
    }

    public final void R(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.P(str);
    }

    public final void S(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.Q(str);
    }

    public final void T(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.R(str);
    }

    public final void U(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.S(str);
    }

    public final void V() {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.T();
    }

    public final void W(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.U(str);
    }

    public final void X(long j) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.V(j);
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
    public final /* bridge */ /* synthetic */ r8 m29mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.n(str);
    }

    public final void q(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.o(str);
    }

    public final void r(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.p(str);
    }

    public final void s(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.q(str);
    }

    public final void t(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.r(str);
    }

    public final void u(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.s(str);
    }

    public final void v(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.t(str);
    }

    public final void w(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.u(str);
    }

    public final void x(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.v(str);
    }

    public final void y(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.w(str);
    }

    public final void z(String str) {
        copyOnWrite();
        UbiProd1Impression ubiProd1Impression = (UbiProd1Impression) ((g) this).instance;
        int i = UbiProd1Impression.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1Impression.x(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m28clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m30mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m27clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m31mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
