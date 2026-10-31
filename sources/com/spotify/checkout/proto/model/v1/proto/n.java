package com.spotify.checkout.proto.model.v1.proto;

import java.io.InputStream;
import p.k711;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n extends com.google.protobuf.g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m975mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(CheckoutItemUnavailable checkoutItemUnavailable) {
        copyOnWrite();
        GetCheckoutPageResponse getCheckoutPageResponse = (GetCheckoutPageResponse) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UCB_CHECKOUT_FIELD_NUMBER;
        getCheckoutPageResponse.x(checkoutItemUnavailable);
    }

    public final void q(CheckoutStatus checkoutStatus) {
        copyOnWrite();
        GetCheckoutPageResponse getCheckoutPageResponse = (GetCheckoutPageResponse) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UCB_CHECKOUT_FIELD_NUMBER;
        getCheckoutPageResponse.y(checkoutStatus);
    }

    public final void r(Error error) {
        copyOnWrite();
        GetCheckoutPageResponse getCheckoutPageResponse = (GetCheckoutPageResponse) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UCB_CHECKOUT_FIELD_NUMBER;
        getCheckoutPageResponse.z(error);
    }

    public final void s(GetCheckoutPageResponse.GpbCheckout gpbCheckout) {
        copyOnWrite();
        GetCheckoutPageResponse getCheckoutPageResponse = (GetCheckoutPageResponse) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UCB_CHECKOUT_FIELD_NUMBER;
        getCheckoutPageResponse.A(gpbCheckout);
    }

    public final void t(k711 k711Var) {
        copyOnWrite();
        GetCheckoutPageResponse getCheckoutPageResponse = (GetCheckoutPageResponse) ((com.google.protobuf.g) this).instance;
        Redirect redirect = (Redirect) k711Var.build();
        int i = GetCheckoutPageResponse.UCB_CHECKOUT_FIELD_NUMBER;
        getCheckoutPageResponse.B(redirect);
    }

    public final void u(GetCheckoutPageResponse.SpotifyCheckout spotifyCheckout) {
        copyOnWrite();
        GetCheckoutPageResponse getCheckoutPageResponse = (GetCheckoutPageResponse) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UCB_CHECKOUT_FIELD_NUMBER;
        getCheckoutPageResponse.C(spotifyCheckout);
    }

    public final void v(SpotifyCheckoutNative spotifyCheckoutNative) {
        copyOnWrite();
        GetCheckoutPageResponse getCheckoutPageResponse = (GetCheckoutPageResponse) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UCB_CHECKOUT_FIELD_NUMBER;
        getCheckoutPageResponse.D(spotifyCheckoutNative);
    }

    public final void w(GetCheckoutPageResponse.UcbCheckout ucbCheckout) {
        copyOnWrite();
        GetCheckoutPageResponse getCheckoutPageResponse = (GetCheckoutPageResponse) ((com.google.protobuf.g) this).instance;
        int i = GetCheckoutPageResponse.UCB_CHECKOUT_FIELD_NUMBER;
        getCheckoutPageResponse.E(ucbCheckout);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m974clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m976mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m973clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m977mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
