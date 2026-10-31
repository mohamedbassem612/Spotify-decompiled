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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TrackArtistMetadata$Builder extends g implements TrackArtistMetadataOrBuilder {
    private TrackArtistMetadata$Builder() {
        super(TrackArtistMetadata.w());
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

    public TrackArtistMetadata$Builder clearLink() {
        copyOnWrite();
        TrackArtistMetadata.n(((g) this).instance);
        return this;
    }

    public TrackArtistMetadata$Builder clearName() {
        copyOnWrite();
        TrackArtistMetadata.o(((g) this).instance);
        return this;
    }

    public TrackArtistMetadata$Builder clearPortraits() {
        copyOnWrite();
        TrackArtistMetadata.p(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public String getLink() {
        return ((g) this).instance.getLink();
    }

    public phc getLinkBytes() {
        return ((g) this).instance.getLinkBytes();
    }

    public String getName() {
        return ((g) this).instance.getName();
    }

    public phc getNameBytes() {
        return ((g) this).instance.getNameBytes();
    }

    public ImageGroup getPortraits() {
        return ((g) this).instance.getPortraits();
    }

    public boolean hasLink() {
        return ((g) this).instance.hasLink();
    }

    public boolean hasName() {
        return ((g) this).instance.hasName();
    }

    public boolean hasPortraits() {
        return ((g) this).instance.hasPortraits();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1482mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public TrackArtistMetadata$Builder mergePortraits(ImageGroup imageGroup) {
        copyOnWrite();
        TrackArtistMetadata.q(((g) this).instance, imageGroup);
        return this;
    }

    public TrackArtistMetadata$Builder setLink(String str) {
        copyOnWrite();
        TrackArtistMetadata.r(((g) this).instance, str);
        return this;
    }

    public TrackArtistMetadata$Builder setLinkBytes(phc phcVar) {
        copyOnWrite();
        TrackArtistMetadata.s(((g) this).instance, phcVar);
        return this;
    }

    public TrackArtistMetadata$Builder setName(String str) {
        copyOnWrite();
        TrackArtistMetadata.t(((g) this).instance, str);
        return this;
    }

    public TrackArtistMetadata$Builder setNameBytes(phc phcVar) {
        copyOnWrite();
        TrackArtistMetadata.u(((g) this).instance, phcVar);
        return this;
    }

    public TrackArtistMetadata$Builder setPortraits(ImageGroup.Builder builder) {
        copyOnWrite();
        TrackArtistMetadata.v(((g) this).instance, builder.build());
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1481clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1483mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m1480clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1484mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ TrackArtistMetadata$Builder(int i) {
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

    public TrackArtistMetadata$Builder setPortraits(ImageGroup imageGroup) {
        copyOnWrite();
        TrackArtistMetadata.v(((g) this).instance, imageGroup);
        return this;
    }
}
