package com.spotify.cosmos.util.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TrackMetadata$Builder extends g implements TrackMetadataOrBuilder {
    private TrackMetadata$Builder() {
        super(TrackMetadata.w0());
    }

    public TrackMetadata$Builder addAllArtist(Iterable<? extends TrackArtistMetadata> iterable) {
        copyOnWrite();
        TrackMetadata.n(((g) this).instance, iterable);
        return this;
    }

    public TrackMetadata$Builder addAllExtension(Iterable<? extends Extension> iterable) {
        copyOnWrite();
        TrackMetadata.o(((g) this).instance, iterable);
        return this;
    }

    public TrackMetadata$Builder addAllTrackDescriptors(Iterable<? extends TrackDescriptor> iterable) {
        copyOnWrite();
        TrackMetadata.p(((g) this).instance, iterable);
        return this;
    }

    public TrackMetadata$Builder addArtist(TrackArtistMetadata$Builder trackArtistMetadata$Builder) {
        copyOnWrite();
        TrackMetadata.r(((g) this).instance, trackArtistMetadata$Builder.build());
        return this;
    }

    public TrackMetadata$Builder addExtension(Extension$Builder extension$Builder) {
        copyOnWrite();
        TrackMetadata.t(((g) this).instance, extension$Builder.build());
        return this;
    }

    public TrackMetadata$Builder addTrackDescriptors(TrackDescriptor$Builder trackDescriptor$Builder) {
        copyOnWrite();
        TrackMetadata.v(((g) this).instance, trackDescriptor$Builder.build());
        return this;
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

    public TrackMetadata$Builder clearAlbum() {
        copyOnWrite();
        TrackMetadata.w(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearArtist() {
        copyOnWrite();
        TrackMetadata.x(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearDiscNumber() {
        copyOnWrite();
        TrackMetadata.y(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearExtension() {
        copyOnWrite();
        TrackMetadata.z(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearHasLyrics() {
        copyOnWrite();
        TrackMetadata.A(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearIs19PlusOnly() {
        copyOnWrite();
        TrackMetadata.B(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearIsCurated() {
        copyOnWrite();
        TrackMetadata.C(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearIsExplicit() {
        copyOnWrite();
        TrackMetadata.D(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearIsLocal() {
        copyOnWrite();
        TrackMetadata.E(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearIsPremiumOnly() {
        copyOnWrite();
        TrackMetadata.F(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearLength() {
        copyOnWrite();
        TrackMetadata.G(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearLink() {
        copyOnWrite();
        TrackMetadata.H(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearLocallyPlayable() {
        copyOnWrite();
        TrackMetadata.I(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearName() {
        copyOnWrite();
        TrackMetadata.J(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearPlayable() {
        copyOnWrite();
        TrackMetadata.K(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearPlayableLocalTrack() {
        copyOnWrite();
        TrackMetadata.L(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearPlayableTrackLink() {
        copyOnWrite();
        TrackMetadata.M(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearPopularity() {
        copyOnWrite();
        TrackMetadata.N(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearPreviewId() {
        copyOnWrite();
        TrackMetadata.O(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearToBeObfuscated() {
        copyOnWrite();
        TrackMetadata.P(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearTrackDescriptors() {
        copyOnWrite();
        TrackMetadata.Q(((g) this).instance);
        return this;
    }

    public TrackMetadata$Builder clearTrackNumber() {
        copyOnWrite();
        TrackMetadata.R(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public TrackAlbumMetadata getAlbum() {
        return ((g) this).instance.getAlbum();
    }

    public TrackArtistMetadata getArtist(int i) {
        return ((g) this).instance.getArtist(i);
    }

    public int getArtistCount() {
        return ((g) this).instance.getArtistCount();
    }

    public List<TrackArtistMetadata> getArtistList() {
        return Collections.unmodifiableList(((g) this).instance.getArtistList());
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public int getDiscNumber() {
        return ((g) this).instance.getDiscNumber();
    }

    public Extension getExtension(int i) {
        return ((g) this).instance.getExtension(i);
    }

    public int getExtensionCount() {
        return ((g) this).instance.getExtensionCount();
    }

    public List<Extension> getExtensionList() {
        return Collections.unmodifiableList(((g) this).instance.getExtensionList());
    }

    public boolean getHasLyrics() {
        return ((g) this).instance.getHasLyrics();
    }

    public boolean getIs19PlusOnly() {
        return ((g) this).instance.getIs19PlusOnly();
    }

    public boolean getIsCurated() {
        return ((g) this).instance.getIsCurated();
    }

    public boolean getIsExplicit() {
        return ((g) this).instance.getIsExplicit();
    }

    public boolean getIsLocal() {
        return ((g) this).instance.getIsLocal();
    }

    public boolean getIsPremiumOnly() {
        return ((g) this).instance.getIsPremiumOnly();
    }

    public int getLength() {
        return ((g) this).instance.getLength();
    }

    public String getLink() {
        return ((g) this).instance.getLink();
    }

    public phc getLinkBytes() {
        return ((g) this).instance.getLinkBytes();
    }

    public boolean getLocallyPlayable() {
        return ((g) this).instance.getLocallyPlayable();
    }

    public String getName() {
        return ((g) this).instance.getName();
    }

    public phc getNameBytes() {
        return ((g) this).instance.getNameBytes();
    }

    public boolean getPlayable() {
        return ((g) this).instance.getPlayable();
    }

    public boolean getPlayableLocalTrack() {
        return ((g) this).instance.getPlayableLocalTrack();
    }

    public String getPlayableTrackLink() {
        return ((g) this).instance.getPlayableTrackLink();
    }

    public phc getPlayableTrackLinkBytes() {
        return ((g) this).instance.getPlayableTrackLinkBytes();
    }

    public int getPopularity() {
        return ((g) this).instance.getPopularity();
    }

    public String getPreviewId() {
        return ((g) this).instance.getPreviewId();
    }

    public phc getPreviewIdBytes() {
        return ((g) this).instance.getPreviewIdBytes();
    }

    public boolean getToBeObfuscated() {
        return ((g) this).instance.getToBeObfuscated();
    }

    public TrackDescriptor getTrackDescriptors(int i) {
        return ((g) this).instance.getTrackDescriptors(i);
    }

    public int getTrackDescriptorsCount() {
        return ((g) this).instance.getTrackDescriptorsCount();
    }

    public List<TrackDescriptor> getTrackDescriptorsList() {
        return Collections.unmodifiableList(((g) this).instance.getTrackDescriptorsList());
    }

    public int getTrackNumber() {
        return ((g) this).instance.getTrackNumber();
    }

    public boolean hasAlbum() {
        return ((g) this).instance.hasAlbum();
    }

    public boolean hasDiscNumber() {
        return ((g) this).instance.hasDiscNumber();
    }

    public boolean hasHasLyrics() {
        return ((g) this).instance.hasHasLyrics();
    }

    public boolean hasIs19PlusOnly() {
        return ((g) this).instance.hasIs19PlusOnly();
    }

    public boolean hasIsCurated() {
        return ((g) this).instance.hasIsCurated();
    }

    public boolean hasIsExplicit() {
        return ((g) this).instance.hasIsExplicit();
    }

    public boolean hasIsLocal() {
        return ((g) this).instance.hasIsLocal();
    }

    public boolean hasIsPremiumOnly() {
        return ((g) this).instance.hasIsPremiumOnly();
    }

    public boolean hasLength() {
        return ((g) this).instance.hasLength();
    }

    public boolean hasLink() {
        return ((g) this).instance.hasLink();
    }

    public boolean hasLocallyPlayable() {
        return ((g) this).instance.hasLocallyPlayable();
    }

    public boolean hasName() {
        return ((g) this).instance.hasName();
    }

    public boolean hasPlayable() {
        return ((g) this).instance.hasPlayable();
    }

    public boolean hasPlayableLocalTrack() {
        return ((g) this).instance.hasPlayableLocalTrack();
    }

    public boolean hasPlayableTrackLink() {
        return ((g) this).instance.hasPlayableTrackLink();
    }

    public boolean hasPopularity() {
        return ((g) this).instance.hasPopularity();
    }

    public boolean hasPreviewId() {
        return ((g) this).instance.hasPreviewId();
    }

    public boolean hasToBeObfuscated() {
        return ((g) this).instance.hasToBeObfuscated();
    }

    public boolean hasTrackNumber() {
        return ((g) this).instance.hasTrackNumber();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    public TrackMetadata$Builder mergeAlbum(TrackAlbumMetadata trackAlbumMetadata) {
        copyOnWrite();
        TrackMetadata.S(((g) this).instance, trackAlbumMetadata);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1497mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public TrackMetadata$Builder removeArtist(int i) {
        copyOnWrite();
        TrackMetadata.T(((g) this).instance, i);
        return this;
    }

    public TrackMetadata$Builder removeExtension(int i) {
        copyOnWrite();
        TrackMetadata.U(((g) this).instance, i);
        return this;
    }

    public TrackMetadata$Builder removeTrackDescriptors(int i) {
        copyOnWrite();
        TrackMetadata.V(((g) this).instance, i);
        return this;
    }

    public TrackMetadata$Builder setAlbum(TrackAlbumMetadata$Builder trackAlbumMetadata$Builder) {
        copyOnWrite();
        TrackMetadata.W(((g) this).instance, trackAlbumMetadata$Builder.build());
        return this;
    }

    public TrackMetadata$Builder setArtist(int i, TrackArtistMetadata$Builder trackArtistMetadata$Builder) {
        copyOnWrite();
        TrackMetadata.X(((g) this).instance, i, trackArtistMetadata$Builder.build());
        return this;
    }

    public TrackMetadata$Builder setDiscNumber(int i) {
        copyOnWrite();
        TrackMetadata.Y(((g) this).instance, i);
        return this;
    }

    public TrackMetadata$Builder setExtension(int i, Extension$Builder extension$Builder) {
        copyOnWrite();
        TrackMetadata.Z(((g) this).instance, i, extension$Builder.build());
        return this;
    }

    public TrackMetadata$Builder setHasLyrics(boolean z) {
        copyOnWrite();
        TrackMetadata.a0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setIs19PlusOnly(boolean z) {
        copyOnWrite();
        TrackMetadata.b0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setIsCurated(boolean z) {
        copyOnWrite();
        TrackMetadata.c0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setIsExplicit(boolean z) {
        copyOnWrite();
        TrackMetadata.d0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setIsLocal(boolean z) {
        copyOnWrite();
        TrackMetadata.e0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setIsPremiumOnly(boolean z) {
        copyOnWrite();
        TrackMetadata.f0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setLength(int i) {
        copyOnWrite();
        TrackMetadata.g0(((g) this).instance, i);
        return this;
    }

    public TrackMetadata$Builder setLink(String str) {
        copyOnWrite();
        TrackMetadata.h0(((g) this).instance, str);
        return this;
    }

    public TrackMetadata$Builder setLinkBytes(phc phcVar) {
        copyOnWrite();
        TrackMetadata.i0(((g) this).instance, phcVar);
        return this;
    }

    public TrackMetadata$Builder setLocallyPlayable(boolean z) {
        copyOnWrite();
        TrackMetadata.j0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setName(String str) {
        copyOnWrite();
        TrackMetadata.k0(((g) this).instance, str);
        return this;
    }

    public TrackMetadata$Builder setNameBytes(phc phcVar) {
        copyOnWrite();
        TrackMetadata.l0(((g) this).instance, phcVar);
        return this;
    }

    public TrackMetadata$Builder setPlayable(boolean z) {
        copyOnWrite();
        TrackMetadata.m0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setPlayableLocalTrack(boolean z) {
        copyOnWrite();
        TrackMetadata.n0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setPlayableTrackLink(String str) {
        copyOnWrite();
        TrackMetadata.o0(((g) this).instance, str);
        return this;
    }

    public TrackMetadata$Builder setPlayableTrackLinkBytes(phc phcVar) {
        copyOnWrite();
        TrackMetadata.p0(((g) this).instance, phcVar);
        return this;
    }

    public TrackMetadata$Builder setPopularity(int i) {
        copyOnWrite();
        TrackMetadata.q0(((g) this).instance, i);
        return this;
    }

    public TrackMetadata$Builder setPreviewId(String str) {
        copyOnWrite();
        TrackMetadata.r0(((g) this).instance, str);
        return this;
    }

    public TrackMetadata$Builder setPreviewIdBytes(phc phcVar) {
        copyOnWrite();
        TrackMetadata.s0(((g) this).instance, phcVar);
        return this;
    }

    public TrackMetadata$Builder setToBeObfuscated(boolean z) {
        copyOnWrite();
        TrackMetadata.t0(((g) this).instance, z);
        return this;
    }

    public TrackMetadata$Builder setTrackDescriptors(int i, TrackDescriptor$Builder trackDescriptor$Builder) {
        copyOnWrite();
        TrackMetadata.u0(((g) this).instance, i, trackDescriptor$Builder.build());
        return this;
    }

    public TrackMetadata$Builder setTrackNumber(int i) {
        copyOnWrite();
        TrackMetadata.v0(((g) this).instance, i);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1496clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1498mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m1495clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1499mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ TrackMetadata$Builder(int i) {
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

    public TrackMetadata$Builder addArtist(int i, TrackArtistMetadata trackArtistMetadata) {
        copyOnWrite();
        TrackMetadata.q(((g) this).instance, i, trackArtistMetadata);
        return this;
    }

    public TrackMetadata$Builder addExtension(int i, Extension extension) {
        copyOnWrite();
        TrackMetadata.s(((g) this).instance, i, extension);
        return this;
    }

    public TrackMetadata$Builder addTrackDescriptors(int i, TrackDescriptor trackDescriptor) {
        copyOnWrite();
        TrackMetadata.u(((g) this).instance, i, trackDescriptor);
        return this;
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }

    public TrackMetadata$Builder setAlbum(TrackAlbumMetadata trackAlbumMetadata) {
        copyOnWrite();
        TrackMetadata.W(((g) this).instance, trackAlbumMetadata);
        return this;
    }

    public TrackMetadata$Builder setArtist(int i, TrackArtistMetadata trackArtistMetadata) {
        copyOnWrite();
        TrackMetadata.X(((g) this).instance, i, trackArtistMetadata);
        return this;
    }

    public TrackMetadata$Builder setExtension(int i, Extension extension) {
        copyOnWrite();
        TrackMetadata.Z(((g) this).instance, i, extension);
        return this;
    }

    public TrackMetadata$Builder setTrackDescriptors(int i, TrackDescriptor trackDescriptor) {
        copyOnWrite();
        TrackMetadata.u0(((g) this).instance, i, trackDescriptor);
        return this;
    }

    public TrackMetadata$Builder addArtist(TrackArtistMetadata trackArtistMetadata) {
        copyOnWrite();
        TrackMetadata.r(((g) this).instance, trackArtistMetadata);
        return this;
    }

    public TrackMetadata$Builder addExtension(Extension extension) {
        copyOnWrite();
        TrackMetadata.t(((g) this).instance, extension);
        return this;
    }

    public TrackMetadata$Builder addTrackDescriptors(TrackDescriptor trackDescriptor) {
        copyOnWrite();
        TrackMetadata.v(((g) this).instance, trackDescriptor);
        return this;
    }

    public TrackMetadata$Builder addArtist(int i, TrackArtistMetadata$Builder trackArtistMetadata$Builder) {
        copyOnWrite();
        TrackMetadata.q(((g) this).instance, i, trackArtistMetadata$Builder.build());
        return this;
    }

    public TrackMetadata$Builder addExtension(int i, Extension$Builder extension$Builder) {
        copyOnWrite();
        TrackMetadata.s(((g) this).instance, i, extension$Builder.build());
        return this;
    }

    public TrackMetadata$Builder addTrackDescriptors(int i, TrackDescriptor$Builder trackDescriptor$Builder) {
        copyOnWrite();
        TrackMetadata.u(((g) this).instance, i, trackDescriptor$Builder.build());
        return this;
    }
}
