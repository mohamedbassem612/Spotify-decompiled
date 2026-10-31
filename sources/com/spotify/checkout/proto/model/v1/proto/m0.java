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
public final class m0 extends com.google.protobuf.g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m965mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        LineItem.SimpleLineItem simpleLineItem = (LineItem.SimpleLineItem) ((com.google.protobuf.g) this).instance;
        int i = LineItem.SimpleLineItem.IMAGE_FIELD_NUMBER;
        simpleLineItem.n(iterable);
    }

    public final void q(n0 n0Var) {
        copyOnWrite();
        LineItem.SimpleLineItem simpleLineItem = (LineItem.SimpleLineItem) ((com.google.protobuf.g) this).instance;
        LineItem.SimpleLineItem.Header header = (LineItem.SimpleLineItem.Header) n0Var.build();
        int i = LineItem.SimpleLineItem.IMAGE_FIELD_NUMBER;
        simpleLineItem.x(header);
    }

    public final void r(LineItem.SimpleLineItem.Header header) {
        copyOnWrite();
        LineItem.SimpleLineItem simpleLineItem = (LineItem.SimpleLineItem) ((com.google.protobuf.g) this).instance;
        int i = LineItem.SimpleLineItem.IMAGE_FIELD_NUMBER;
        simpleLineItem.x(header);
    }

    public final void s() {
        copyOnWrite();
        LineItem.SimpleLineItem simpleLineItem = (LineItem.SimpleLineItem) ((com.google.protobuf.g) this).instance;
        int i = LineItem.SimpleLineItem.IMAGE_FIELD_NUMBER;
        simpleLineItem.y();
    }

    public final void t(ProductBreakdown productBreakdown) {
        copyOnWrite();
        LineItem.SimpleLineItem simpleLineItem = (LineItem.SimpleLineItem) ((com.google.protobuf.g) this).instance;
        int i = LineItem.SimpleLineItem.IMAGE_FIELD_NUMBER;
        simpleLineItem.z(productBreakdown);
    }

    public final void u(Timeline timeline) {
        copyOnWrite();
        LineItem.SimpleLineItem simpleLineItem = (LineItem.SimpleLineItem) ((com.google.protobuf.g) this).instance;
        int i = LineItem.SimpleLineItem.IMAGE_FIELD_NUMBER;
        simpleLineItem.A(timeline);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m964clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m966mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m963clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m967mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
