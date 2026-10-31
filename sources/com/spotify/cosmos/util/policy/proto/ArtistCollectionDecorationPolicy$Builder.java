package com.spotify.cosmos.util.policy.proto;

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
public final class ArtistCollectionDecorationPolicy$Builder extends g implements ArtistCollectionDecorationPolicyOrBuilder {
    private ArtistCollectionDecorationPolicy$Builder() {
        super(ArtistCollectionDecorationPolicy.B());
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

    public ArtistCollectionDecorationPolicy$Builder clearCanBan() {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.n(((g) this).instance);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder clearCollectionLink() {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.o(((g) this).instance);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder clearIsBanned() {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.p(((g) this).instance);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder clearIsFollowed() {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.q(((g) this).instance);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder clearNumAlbumsInCollection() {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.r(((g) this).instance);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder clearNumExplicitlyLikedTracks() {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.s(((g) this).instance);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder clearNumTracksInCollection() {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.t(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public boolean getCanBan() {
        return ((g) this).instance.getCanBan();
    }

    public boolean getCollectionLink() {
        return ((g) this).instance.getCollectionLink();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public boolean getIsBanned() {
        return ((g) this).instance.getIsBanned();
    }

    public boolean getIsFollowed() {
        return ((g) this).instance.getIsFollowed();
    }

    public boolean getNumAlbumsInCollection() {
        return ((g) this).instance.getNumAlbumsInCollection();
    }

    public boolean getNumExplicitlyLikedTracks() {
        return ((g) this).instance.getNumExplicitlyLikedTracks();
    }

    public boolean getNumTracksInCollection() {
        return ((g) this).instance.getNumTracksInCollection();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1355mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public ArtistCollectionDecorationPolicy$Builder setCanBan(boolean z) {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.u(((g) this).instance, z);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder setCollectionLink(boolean z) {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.v(((g) this).instance, z);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder setIsBanned(boolean z) {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.w(((g) this).instance, z);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder setIsFollowed(boolean z) {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.x(((g) this).instance, z);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder setNumAlbumsInCollection(boolean z) {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.y(((g) this).instance, z);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder setNumExplicitlyLikedTracks(boolean z) {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.z(((g) this).instance, z);
        return this;
    }

    public ArtistCollectionDecorationPolicy$Builder setNumTracksInCollection(boolean z) {
        copyOnWrite();
        ArtistCollectionDecorationPolicy.A(((g) this).instance, z);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1354clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1356mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m1353clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1357mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ ArtistCollectionDecorationPolicy$Builder(int i) {
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
