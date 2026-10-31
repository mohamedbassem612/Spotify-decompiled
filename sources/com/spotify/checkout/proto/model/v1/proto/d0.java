package com.spotify.checkout.proto.model.v1.proto;

import java.io.InputStream;
import p.i630;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d0 extends com.google.protobuf.g implements v2j0 {
    public final void A(SpotifyCheckoutNative spotifyCheckoutNative) {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.P(spotifyCheckoutNative);
    }

    public final void B(GetCheckoutPageResponse.SpotifyCheckout spotifyCheckout) {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.Q(spotifyCheckout);
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
    public final /* bridge */ /* synthetic */ r8 m840mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final GetCheckoutPageResponse.UcbCheckout.BillingProvider n() {
        return ((GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance).z();
    }

    public final void q() {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.F();
    }

    public final void r() {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.G();
    }

    public final void s(ChangeCountry changeCountry) {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.H(changeCountry);
    }

    public final void t(i630 i630Var) {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        FollowLinkCta followLinkCta = (FollowLinkCta) i630Var.build();
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.I(followLinkCta);
    }

    public final void u(e0 e0Var) {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.J(e0Var);
    }

    public final void v(GetCheckoutPageResponse.UcbCheckout.BillingProvider billingProvider) {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.K(billingProvider);
    }

    public final void w(GetCheckoutPageResponse.GpbCheckout gpbCheckout) {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.L(gpbCheckout);
    }

    public final void x(GetCheckoutPageResponse.GpbUnavailable gpbUnavailable) {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.M(gpbUnavailable);
    }

    public final void y() {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.N();
    }

    public final void z(GetCheckoutPageResponse.UcbCheckout.BillingProvider billingProvider) {
        copyOnWrite();
        GetCheckoutPageResponse.UcbCheckout ucbCheckout = (GetCheckoutPageResponse.UcbCheckout) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UcbCheckout.PAGE_TITLE_FIELD_NUMBER;
        ucbCheckout.O(billingProvider);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m839clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m841mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m838clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m842mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
