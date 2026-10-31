package com.spotify.messages;

import java.io.InputStream;
import java.util.LinkedHashMap;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e extends com.google.protobuf.g implements v2j0 {
    public final void A(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.y(str);
    }

    public final void B(f fVar) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        UbiProd1ImpressionNonAuth.SourcePaths sourcePaths = (UbiProd1ImpressionNonAuth.SourcePaths) fVar.build();
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.z(sourcePaths);
    }

    public final void C(LinkedHashMap linkedHashMap) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.A().putAll(linkedHashMap);
    }

    public final void D(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.A().put("source_paths_unavailable_reason", str);
    }

    public final void E(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.C(str);
    }

    public final void F(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.D(str);
    }

    public final void G(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.E(str);
    }

    public final void H(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.F(str);
    }

    public final void I(int i) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i2 = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.G(i);
    }

    public final void J(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.H(str);
    }

    public final void K(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.I(str);
    }

    public final void L(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.J(str);
    }

    public final void M(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.K(str);
    }

    public final void N(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.L(str);
    }

    public final void O(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.M(str);
    }

    public final void P(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.N(str);
    }

    public final void Q(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.O(str);
    }

    public final void R(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.P(str);
    }

    public final void S() {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.Q();
    }

    public final void T(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.R(str);
    }

    public final void U(long j) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.S(j);
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
        return super.internalMergeFrom((com.google.protobuf.h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m111mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.n(str);
    }

    public final void q(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.o(str);
    }

    public final void r(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.p(str);
    }

    public final void s(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.q(str);
    }

    public final void t(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.r(str);
    }

    public final void u(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.s(str);
    }

    public final void v(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.t(str);
    }

    public final void w(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.u(str);
    }

    public final void x(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.v(str);
    }

    public final void y(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.w(str);
    }

    public final void z(String str) {
        copyOnWrite();
        UbiProd1ImpressionNonAuth ubiProd1ImpressionNonAuth = (UbiProd1ImpressionNonAuth) ((com.google.protobuf.g) this).instance;
        int i = UbiProd1ImpressionNonAuth.GENERATOR_VERSION_FIELD_NUMBER;
        ubiProd1ImpressionNonAuth.x(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m110clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m112mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m109clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m113mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
