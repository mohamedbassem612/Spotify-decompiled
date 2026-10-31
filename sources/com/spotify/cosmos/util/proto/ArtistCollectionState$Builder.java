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
public final class ArtistCollectionState$Builder extends g implements ArtistCollectionStateOrBuilder {
    private ArtistCollectionState$Builder() {
        super(ArtistCollectionState.C());
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

    public ArtistCollectionState$Builder clearCanBan() {
        copyOnWrite();
        ArtistCollectionState.n(((g) this).instance);
        return this;
    }

    public ArtistCollectionState$Builder clearCollectionLink() {
        copyOnWrite();
        ArtistCollectionState.o(((g) this).instance);
        return this;
    }

    public ArtistCollectionState$Builder clearFollowed() {
        copyOnWrite();
        ArtistCollectionState.p(((g) this).instance);
        return this;
    }

    public ArtistCollectionState$Builder clearIsBanned() {
        copyOnWrite();
        ArtistCollectionState.q(((g) this).instance);
        return this;
    }

    public ArtistCollectionState$Builder clearNumAlbumsInCollection() {
        copyOnWrite();
        ArtistCollectionState.r(((g) this).instance);
        return this;
    }

    public ArtistCollectionState$Builder clearNumExplicitlyLikedTracks() {
        copyOnWrite();
        ArtistCollectionState.s(((g) this).instance);
        return this;
    }

    public ArtistCollectionState$Builder clearNumTracksInCollection() {
        copyOnWrite();
        ArtistCollectionState.t(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public boolean getCanBan() {
        return ((g) this).instance.getCanBan();
    }

    public String getCollectionLink() {
        return ((g) this).instance.getCollectionLink();
    }

    public phc getCollectionLinkBytes() {
        return ((g) this).instance.getCollectionLinkBytes();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public boolean getFollowed() {
        return ((g) this).instance.getFollowed();
    }

    public boolean getIsBanned() {
        return ((g) this).instance.getIsBanned();
    }

    public int getNumAlbumsInCollection() {
        return ((g) this).instance.getNumAlbumsInCollection();
    }

    public int getNumExplicitlyLikedTracks() {
        return ((g) this).instance.getNumExplicitlyLikedTracks();
    }

    public int getNumTracksInCollection() {
        return ((g) this).instance.getNumTracksInCollection();
    }

    public boolean hasCanBan() {
        return ((g) this).instance.hasCanBan();
    }

    public boolean hasCollectionLink() {
        return ((g) this).instance.hasCollectionLink();
    }

    public boolean hasFollowed() {
        return ((g) this).instance.hasFollowed();
    }

    public boolean hasIsBanned() {
        return ((g) this).instance.hasIsBanned();
    }

    public boolean hasNumAlbumsInCollection() {
        return ((g) this).instance.hasNumAlbumsInCollection();
    }

    public boolean hasNumExplicitlyLikedTracks() {
        return ((g) this).instance.hasNumExplicitlyLikedTracks();
    }

    public boolean hasNumTracksInCollection() {
        return ((g) this).instance.hasNumTracksInCollection();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1400mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public ArtistCollectionState$Builder setCanBan(boolean z) {
        copyOnWrite();
        ArtistCollectionState.u(((g) this).instance, z);
        return this;
    }

    public ArtistCollectionState$Builder setCollectionLink(String str) {
        copyOnWrite();
        ArtistCollectionState.v(((g) this).instance, str);
        return this;
    }

    public ArtistCollectionState$Builder setCollectionLinkBytes(phc phcVar) {
        copyOnWrite();
        ArtistCollectionState.w(((g) this).instance, phcVar);
        return this;
    }

    public ArtistCollectionState$Builder setFollowed(boolean z) {
        copyOnWrite();
        ArtistCollectionState.x(((g) this).instance, z);
        return this;
    }

    public ArtistCollectionState$Builder setIsBanned(boolean z) {
        copyOnWrite();
        ArtistCollectionState.y(((g) this).instance, z);
        return this;
    }

    public ArtistCollectionState$Builder setNumAlbumsInCollection(int i) {
        copyOnWrite();
        ArtistCollectionState.z(((g) this).instance, i);
        return this;
    }

    public ArtistCollectionState$Builder setNumExplicitlyLikedTracks(int i) {
        copyOnWrite();
        ArtistCollectionState.A(((g) this).instance, i);
        return this;
    }

    public ArtistCollectionState$Builder setNumTracksInCollection(int i) {
        copyOnWrite();
        ArtistCollectionState.B(((g) this).instance, i);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1399clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1401mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m1398clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1402mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ ArtistCollectionState$Builder(int i) {
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
