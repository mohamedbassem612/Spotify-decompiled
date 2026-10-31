package com.spotify.home.evopage.events.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.util.ArrayList;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m7mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(ArrayList arrayList) {
        copyOnWrite();
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = (HomeMetadataLoadingErrorEvent) ((g) this).instance;
        int i = HomeMetadataLoadingErrorEvent.FEED_ID_FIELD_NUMBER;
        homeMetadataLoadingErrorEvent.n(arrayList);
    }

    public final void q(int i) {
        copyOnWrite();
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = (HomeMetadataLoadingErrorEvent) ((g) this).instance;
        int i2 = HomeMetadataLoadingErrorEvent.FEED_ID_FIELD_NUMBER;
        homeMetadataLoadingErrorEvent.p(i);
    }

    public final void r(String str) {
        copyOnWrite();
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = (HomeMetadataLoadingErrorEvent) ((g) this).instance;
        int i = HomeMetadataLoadingErrorEvent.FEED_ID_FIELD_NUMBER;
        homeMetadataLoadingErrorEvent.q(str);
    }

    public final void s(boolean z) {
        copyOnWrite();
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = (HomeMetadataLoadingErrorEvent) ((g) this).instance;
        int i = HomeMetadataLoadingErrorEvent.FEED_ID_FIELD_NUMBER;
        homeMetadataLoadingErrorEvent.r(z);
    }

    public final void t(int i) {
        copyOnWrite();
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = (HomeMetadataLoadingErrorEvent) ((g) this).instance;
        int i2 = HomeMetadataLoadingErrorEvent.FEED_ID_FIELD_NUMBER;
        homeMetadataLoadingErrorEvent.s(i);
    }

    public final void u(int i) {
        copyOnWrite();
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = (HomeMetadataLoadingErrorEvent) ((g) this).instance;
        int i2 = HomeMetadataLoadingErrorEvent.FEED_ID_FIELD_NUMBER;
        homeMetadataLoadingErrorEvent.t(i);
    }

    public final void v(int i) {
        copyOnWrite();
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = (HomeMetadataLoadingErrorEvent) ((g) this).instance;
        int i2 = HomeMetadataLoadingErrorEvent.FEED_ID_FIELD_NUMBER;
        homeMetadataLoadingErrorEvent.u(i);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m6clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m8mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m5clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m9mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
