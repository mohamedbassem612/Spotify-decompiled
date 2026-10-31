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
public final class TrackAlbumMetadata$Builder extends g implements TrackAlbumMetadataOrBuilder {
    private TrackAlbumMetadata$Builder() {
        super(TrackAlbumMetadata.z());
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

    public TrackAlbumMetadata$Builder clearArtist() {
        copyOnWrite();
        TrackAlbumMetadata.n(((g) this).instance);
        return this;
    }

    public TrackAlbumMetadata$Builder clearCovers() {
        copyOnWrite();
        TrackAlbumMetadata.o(((g) this).instance);
        return this;
    }

    public TrackAlbumMetadata$Builder clearLink() {
        copyOnWrite();
        TrackAlbumMetadata.p(((g) this).instance);
        return this;
    }

    public TrackAlbumMetadata$Builder clearName() {
        copyOnWrite();
        TrackAlbumMetadata.q(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public TrackAlbumArtistMetadata getArtist() {
        return ((g) this).instance.getArtist();
    }

    public ImageGroup getCovers() {
        return ((g) this).instance.getCovers();
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

    public boolean hasArtist() {
        return ((g) this).instance.hasArtist();
    }

    public boolean hasCovers() {
        return ((g) this).instance.hasCovers();
    }

    public boolean hasLink() {
        return ((g) this).instance.hasLink();
    }

    public boolean hasName() {
        return ((g) this).instance.hasName();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    public TrackAlbumMetadata$Builder mergeArtist(TrackAlbumArtistMetadata trackAlbumArtistMetadata) {
        copyOnWrite();
        TrackAlbumMetadata.r(((g) this).instance, trackAlbumArtistMetadata);
        return this;
    }

    public TrackAlbumMetadata$Builder mergeCovers(ImageGroup imageGroup) {
        copyOnWrite();
        TrackAlbumMetadata.s(((g) this).instance, imageGroup);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1477mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public TrackAlbumMetadata$Builder setArtist(TrackAlbumArtistMetadata.Builder builder) {
        copyOnWrite();
        TrackAlbumMetadata.t(((g) this).instance, (TrackAlbumArtistMetadata) builder.build());
        return this;
    }

    public TrackAlbumMetadata$Builder setCovers(ImageGroup.Builder builder) {
        copyOnWrite();
        TrackAlbumMetadata.u(((g) this).instance, builder.build());
        return this;
    }

    public TrackAlbumMetadata$Builder setLink(String str) {
        copyOnWrite();
        TrackAlbumMetadata.v(((g) this).instance, str);
        return this;
    }

    public TrackAlbumMetadata$Builder setLinkBytes(phc phcVar) {
        copyOnWrite();
        TrackAlbumMetadata.w(((g) this).instance, phcVar);
        return this;
    }

    public TrackAlbumMetadata$Builder setName(String str) {
        copyOnWrite();
        TrackAlbumMetadata.x(((g) this).instance, str);
        return this;
    }

    public TrackAlbumMetadata$Builder setNameBytes(phc phcVar) {
        copyOnWrite();
        TrackAlbumMetadata.y(((g) this).instance, phcVar);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1476clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1478mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m1475clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1479mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ TrackAlbumMetadata$Builder(int i) {
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

    public TrackAlbumMetadata$Builder setArtist(TrackAlbumArtistMetadata trackAlbumArtistMetadata) {
        copyOnWrite();
        TrackAlbumMetadata.t(((g) this).instance, trackAlbumArtistMetadata);
        return this;
    }

    public TrackAlbumMetadata$Builder setCovers(ImageGroup imageGroup) {
        copyOnWrite();
        TrackAlbumMetadata.u(((g) this).instance, imageGroup);
        return this;
    }
}
