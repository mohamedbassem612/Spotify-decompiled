package com.spotify.checkout.proto.model.v1.proto;

import java.io.InputStream;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v0 extends com.google.protobuf.g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m1075mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(u0 u0Var) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        SpotifyCheckoutNative.AddressSection addressSection = (SpotifyCheckoutNative.AddressSection) u0Var.build();
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.H(addressSection);
    }

    public final void q(ChangeCountry changeCountry) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.I(changeCountry);
    }

    public final void r(FollowLinkCta followLinkCta) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.J(followLinkCta);
    }

    public final void s(LineItem lineItem) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.K(lineItem);
    }

    public final void t(String str) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.L(str);
    }

    public final void u(w0 w0Var) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        SpotifyCheckoutNative.PaymentSection paymentSection = (SpotifyCheckoutNative.PaymentSection) w0Var.build();
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.M(paymentSection);
    }

    public final void v(SpotifyCheckoutNative.PaymentSection paymentSection) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.M(paymentSection);
    }

    public final void w() {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.N();
    }

    public final void x(f1 f1Var) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        SpotifyCheckoutNative.SummarySection summarySection = (SpotifyCheckoutNative.SummarySection) f1Var.build();
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.O(summarySection);
    }

    public final void y(SpotifyCheckoutNative.SummarySection summarySection) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.O(summarySection);
    }

    public final void z(SpotifyCheckoutNative.UpdateSubscriptionCta updateSubscriptionCta) {
        copyOnWrite();
        SpotifyCheckoutNative spotifyCheckoutNative = (SpotifyCheckoutNative) ((com.google.protobuf.g) this).instance;
        int i = SpotifyCheckoutNative.PAGE_TITLE_FIELD_NUMBER;
        spotifyCheckoutNative.P(updateSubscriptionCta);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1074clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1076mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1073clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1077mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
