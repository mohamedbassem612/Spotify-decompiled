package com.spotify.cosmos.util.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ImageGroup$Builder extends g implements ImageGroupOrBuilder {
    private ImageGroup$Builder() {
        super(ImageGroup.z());
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

    public ImageGroup$Builder clearLargeLink() {
        copyOnWrite();
        ImageGroup.n(((g) this).instance);
        return this;
    }

    public ImageGroup$Builder clearSmallLink() {
        copyOnWrite();
        ImageGroup.o(((g) this).instance);
        return this;
    }

    public ImageGroup$Builder clearStandardLink() {
        copyOnWrite();
        ImageGroup.p(((g) this).instance);
        return this;
    }

    public ImageGroup$Builder clearXlargeLink() {
        copyOnWrite();
        ImageGroup.q(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public String getLargeLink() {
        return ((g) this).instance.getLargeLink();
    }

    public phc getLargeLinkBytes() {
        return ((g) this).instance.getLargeLinkBytes();
    }

    public String getSmallLink() {
        return ((g) this).instance.getSmallLink();
    }

    public phc getSmallLinkBytes() {
        return ((g) this).instance.getSmallLinkBytes();
    }

    public String getStandardLink() {
        return ((g) this).instance.getStandardLink();
    }

    public phc getStandardLinkBytes() {
        return ((g) this).instance.getStandardLinkBytes();
    }

    public String getXlargeLink() {
        return ((g) this).instance.getXlargeLink();
    }

    public phc getXlargeLinkBytes() {
        return ((g) this).instance.getXlargeLinkBytes();
    }

    public boolean hasLargeLink() {
        return ((g) this).instance.hasLargeLink();
    }

    public boolean hasSmallLink() {
        return ((g) this).instance.hasSmallLink();
    }

    public boolean hasStandardLink() {
        return ((g) this).instance.hasStandardLink();
    }

    public boolean hasXlargeLink() {
        return ((g) this).instance.hasXlargeLink();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m2mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public ImageGroup$Builder setLargeLink(String str) {
        copyOnWrite();
        ImageGroup.r(((g) this).instance, str);
        return this;
    }

    public ImageGroup$Builder setLargeLinkBytes(phc phcVar) {
        copyOnWrite();
        ImageGroup.s(((g) this).instance, phcVar);
        return this;
    }

    public ImageGroup$Builder setSmallLink(String str) {
        copyOnWrite();
        ImageGroup.t(((g) this).instance, str);
        return this;
    }

    public ImageGroup$Builder setSmallLinkBytes(phc phcVar) {
        copyOnWrite();
        ImageGroup.u(((g) this).instance, phcVar);
        return this;
    }

    public ImageGroup$Builder setStandardLink(String str) {
        copyOnWrite();
        ImageGroup.v(((g) this).instance, str);
        return this;
    }

    public ImageGroup$Builder setStandardLinkBytes(phc phcVar) {
        copyOnWrite();
        ImageGroup.w(((g) this).instance, phcVar);
        return this;
    }

    public ImageGroup$Builder setXlargeLink(String str) {
        copyOnWrite();
        ImageGroup.x(((g) this).instance, str);
        return this;
    }

    public ImageGroup$Builder setXlargeLinkBytes(phc phcVar) {
        copyOnWrite();
        ImageGroup.y(((g) this).instance, phcVar);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m3mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m0clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m4mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ ImageGroup$Builder(int i) {
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
