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
public final class EpisodeMetadata$Builder extends g implements EpisodeMetadataOrBuilder {
    private EpisodeMetadata$Builder() {
        super(EpisodeMetadata.x0());
    }

    public EpisodeMetadata$Builder addAllExtension(Iterable<? extends Extension> iterable) {
        copyOnWrite();
        EpisodeMetadata.n(((g) this).instance, iterable);
        return this;
    }

    public EpisodeMetadata$Builder addExtension(Extension$Builder extension$Builder) {
        copyOnWrite();
        EpisodeMetadata.p(((g) this).instance, extension$Builder.build());
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

    public EpisodeMetadata$Builder clearAvailable() {
        copyOnWrite();
        EpisodeMetadata.q(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearBackgroundable() {
        copyOnWrite();
        EpisodeMetadata.r(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearCovers() {
        copyOnWrite();
        EpisodeMetadata.s(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearDescription() {
        copyOnWrite();
        EpisodeMetadata.t(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearEpisodeType() {
        copyOnWrite();
        EpisodeMetadata.u(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearExtension() {
        copyOnWrite();
        EpisodeMetadata.v(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearFreezeFrames() {
        copyOnWrite();
        EpisodeMetadata.w(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearIs19PlusOnly() {
        copyOnWrite();
        EpisodeMetadata.x(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearIsBookChapter() {
        copyOnWrite();
        EpisodeMetadata.y(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearIsCurated() {
        copyOnWrite();
        EpisodeMetadata.z(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearIsExplicit() {
        copyOnWrite();
        EpisodeMetadata.A(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearIsMusicAndTalk() {
        copyOnWrite();
        EpisodeMetadata.B(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearIsPodcastShort() {
        copyOnWrite();
        EpisodeMetadata.C(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearLanguage() {
        copyOnWrite();
        EpisodeMetadata.D(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearLength() {
        copyOnWrite();
        EpisodeMetadata.E(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearLink() {
        copyOnWrite();
        EpisodeMetadata.F(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearManifestId() {
        copyOnWrite();
        EpisodeMetadata.G(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearMediaTypeEnum() {
        copyOnWrite();
        EpisodeMetadata.H(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearName() {
        copyOnWrite();
        EpisodeMetadata.I(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearNumber() {
        copyOnWrite();
        EpisodeMetadata.J(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearPreviewId() {
        copyOnWrite();
        EpisodeMetadata.K(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearPreviewManifestId() {
        copyOnWrite();
        EpisodeMetadata.L(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearPublishDate() {
        copyOnWrite();
        EpisodeMetadata.M(((g) this).instance);
        return this;
    }

    public EpisodeMetadata$Builder clearShow() {
        copyOnWrite();
        EpisodeMetadata.N(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public boolean getAvailable() {
        return ((g) this).instance.getAvailable();
    }

    public boolean getBackgroundable() {
        return ((g) this).instance.getBackgroundable();
    }

    public ImageGroup getCovers() {
        return ((g) this).instance.getCovers();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public String getDescription() {
        return ((g) this).instance.getDescription();
    }

    public phc getDescriptionBytes() {
        return ((g) this).instance.getDescriptionBytes();
    }

    public EpisodeMetadata.EpisodeType getEpisodeType() {
        return ((g) this).instance.getEpisodeType();
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

    public ImageGroup getFreezeFrames() {
        return ((g) this).instance.getFreezeFrames();
    }

    public boolean getIs19PlusOnly() {
        return ((g) this).instance.getIs19PlusOnly();
    }

    public boolean getIsBookChapter() {
        return ((g) this).instance.getIsBookChapter();
    }

    public boolean getIsCurated() {
        return ((g) this).instance.getIsCurated();
    }

    public boolean getIsExplicit() {
        return ((g) this).instance.getIsExplicit();
    }

    public boolean getIsMusicAndTalk() {
        return ((g) this).instance.getIsMusicAndTalk();
    }

    public boolean getIsPodcastShort() {
        return ((g) this).instance.getIsPodcastShort();
    }

    public String getLanguage() {
        return ((g) this).instance.getLanguage();
    }

    public phc getLanguageBytes() {
        return ((g) this).instance.getLanguageBytes();
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

    public String getManifestId() {
        return ((g) this).instance.getManifestId();
    }

    public phc getManifestIdBytes() {
        return ((g) this).instance.getManifestIdBytes();
    }

    public EpisodeMetadata.MediaType getMediaTypeEnum() {
        return ((g) this).instance.getMediaTypeEnum();
    }

    public String getName() {
        return ((g) this).instance.getName();
    }

    public phc getNameBytes() {
        return ((g) this).instance.getNameBytes();
    }

    public int getNumber() {
        return ((g) this).instance.getNumber();
    }

    public String getPreviewId() {
        return ((g) this).instance.getPreviewId();
    }

    public phc getPreviewIdBytes() {
        return ((g) this).instance.getPreviewIdBytes();
    }

    public String getPreviewManifestId() {
        return ((g) this).instance.getPreviewManifestId();
    }

    public phc getPreviewManifestIdBytes() {
        return ((g) this).instance.getPreviewManifestIdBytes();
    }

    public long getPublishDate() {
        return ((g) this).instance.getPublishDate();
    }

    public EpisodeShowMetadata getShow() {
        return ((g) this).instance.getShow();
    }

    public boolean hasAvailable() {
        return ((g) this).instance.hasAvailable();
    }

    public boolean hasBackgroundable() {
        return ((g) this).instance.hasBackgroundable();
    }

    public boolean hasCovers() {
        return ((g) this).instance.hasCovers();
    }

    public boolean hasDescription() {
        return ((g) this).instance.hasDescription();
    }

    public boolean hasEpisodeType() {
        return ((g) this).instance.hasEpisodeType();
    }

    public boolean hasFreezeFrames() {
        return ((g) this).instance.hasFreezeFrames();
    }

    public boolean hasIs19PlusOnly() {
        return ((g) this).instance.hasIs19PlusOnly();
    }

    public boolean hasIsBookChapter() {
        return ((g) this).instance.hasIsBookChapter();
    }

    public boolean hasIsCurated() {
        return ((g) this).instance.hasIsCurated();
    }

    public boolean hasIsExplicit() {
        return ((g) this).instance.hasIsExplicit();
    }

    public boolean hasIsMusicAndTalk() {
        return ((g) this).instance.hasIsMusicAndTalk();
    }

    public boolean hasIsPodcastShort() {
        return ((g) this).instance.hasIsPodcastShort();
    }

    public boolean hasLanguage() {
        return ((g) this).instance.hasLanguage();
    }

    public boolean hasLength() {
        return ((g) this).instance.hasLength();
    }

    public boolean hasLink() {
        return ((g) this).instance.hasLink();
    }

    public boolean hasManifestId() {
        return ((g) this).instance.hasManifestId();
    }

    public boolean hasMediaTypeEnum() {
        return ((g) this).instance.hasMediaTypeEnum();
    }

    public boolean hasName() {
        return ((g) this).instance.hasName();
    }

    public boolean hasNumber() {
        return ((g) this).instance.hasNumber();
    }

    public boolean hasPreviewId() {
        return ((g) this).instance.hasPreviewId();
    }

    public boolean hasPreviewManifestId() {
        return ((g) this).instance.hasPreviewManifestId();
    }

    public boolean hasPublishDate() {
        return ((g) this).instance.hasPublishDate();
    }

    public boolean hasShow() {
        return ((g) this).instance.hasShow();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    public EpisodeMetadata$Builder mergeCovers(ImageGroup imageGroup) {
        copyOnWrite();
        EpisodeMetadata.O(((g) this).instance, imageGroup);
        return this;
    }

    public EpisodeMetadata$Builder mergeFreezeFrames(ImageGroup imageGroup) {
        copyOnWrite();
        EpisodeMetadata.P(((g) this).instance, imageGroup);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1426mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public EpisodeMetadata$Builder mergeShow(EpisodeShowMetadata episodeShowMetadata) {
        copyOnWrite();
        EpisodeMetadata.Q(((g) this).instance, episodeShowMetadata);
        return this;
    }

    public EpisodeMetadata$Builder removeExtension(int i) {
        copyOnWrite();
        EpisodeMetadata.R(((g) this).instance, i);
        return this;
    }

    public EpisodeMetadata$Builder setAvailable(boolean z) {
        copyOnWrite();
        EpisodeMetadata.S(((g) this).instance, z);
        return this;
    }

    public EpisodeMetadata$Builder setBackgroundable(boolean z) {
        copyOnWrite();
        EpisodeMetadata.T(((g) this).instance, z);
        return this;
    }

    public EpisodeMetadata$Builder setCovers(ImageGroup.Builder builder) {
        copyOnWrite();
        EpisodeMetadata.U(((g) this).instance, builder.build());
        return this;
    }

    public EpisodeMetadata$Builder setDescription(String str) {
        copyOnWrite();
        EpisodeMetadata.V(((g) this).instance, str);
        return this;
    }

    public EpisodeMetadata$Builder setDescriptionBytes(phc phcVar) {
        copyOnWrite();
        EpisodeMetadata.W(((g) this).instance, phcVar);
        return this;
    }

    public EpisodeMetadata$Builder setEpisodeType(EpisodeMetadata.EpisodeType episodeType) {
        copyOnWrite();
        EpisodeMetadata.X(((g) this).instance, episodeType);
        return this;
    }

    public EpisodeMetadata$Builder setExtension(int i, Extension$Builder extension$Builder) {
        copyOnWrite();
        EpisodeMetadata.Y(((g) this).instance, i, extension$Builder.build());
        return this;
    }

    public EpisodeMetadata$Builder setFreezeFrames(ImageGroup.Builder builder) {
        copyOnWrite();
        EpisodeMetadata.Z(((g) this).instance, builder.build());
        return this;
    }

    public EpisodeMetadata$Builder setIs19PlusOnly(boolean z) {
        copyOnWrite();
        EpisodeMetadata.a0(((g) this).instance, z);
        return this;
    }

    public EpisodeMetadata$Builder setIsBookChapter(boolean z) {
        copyOnWrite();
        EpisodeMetadata.b0(((g) this).instance, z);
        return this;
    }

    public EpisodeMetadata$Builder setIsCurated(boolean z) {
        copyOnWrite();
        EpisodeMetadata.c0(((g) this).instance, z);
        return this;
    }

    public EpisodeMetadata$Builder setIsExplicit(boolean z) {
        copyOnWrite();
        EpisodeMetadata.d0(((g) this).instance, z);
        return this;
    }

    public EpisodeMetadata$Builder setIsMusicAndTalk(boolean z) {
        copyOnWrite();
        EpisodeMetadata.e0(((g) this).instance, z);
        return this;
    }

    public EpisodeMetadata$Builder setIsPodcastShort(boolean z) {
        copyOnWrite();
        EpisodeMetadata.f0(((g) this).instance, z);
        return this;
    }

    public EpisodeMetadata$Builder setLanguage(String str) {
        copyOnWrite();
        EpisodeMetadata.g0(((g) this).instance, str);
        return this;
    }

    public EpisodeMetadata$Builder setLanguageBytes(phc phcVar) {
        copyOnWrite();
        EpisodeMetadata.h0(((g) this).instance, phcVar);
        return this;
    }

    public EpisodeMetadata$Builder setLength(int i) {
        copyOnWrite();
        EpisodeMetadata.i0(((g) this).instance, i);
        return this;
    }

    public EpisodeMetadata$Builder setLink(String str) {
        copyOnWrite();
        EpisodeMetadata.j0(((g) this).instance, str);
        return this;
    }

    public EpisodeMetadata$Builder setLinkBytes(phc phcVar) {
        copyOnWrite();
        EpisodeMetadata.k0(((g) this).instance, phcVar);
        return this;
    }

    public EpisodeMetadata$Builder setManifestId(String str) {
        copyOnWrite();
        EpisodeMetadata.l0(((g) this).instance, str);
        return this;
    }

    public EpisodeMetadata$Builder setManifestIdBytes(phc phcVar) {
        copyOnWrite();
        EpisodeMetadata.m0(((g) this).instance, phcVar);
        return this;
    }

    public EpisodeMetadata$Builder setMediaTypeEnum(EpisodeMetadata.MediaType mediaType) {
        copyOnWrite();
        EpisodeMetadata.n0(((g) this).instance, mediaType);
        return this;
    }

    public EpisodeMetadata$Builder setName(String str) {
        copyOnWrite();
        EpisodeMetadata.o0(((g) this).instance, str);
        return this;
    }

    public EpisodeMetadata$Builder setNameBytes(phc phcVar) {
        copyOnWrite();
        EpisodeMetadata.p0(((g) this).instance, phcVar);
        return this;
    }

    public EpisodeMetadata$Builder setNumber(int i) {
        copyOnWrite();
        EpisodeMetadata.q0(((g) this).instance, i);
        return this;
    }

    public EpisodeMetadata$Builder setPreviewId(String str) {
        copyOnWrite();
        EpisodeMetadata.r0(((g) this).instance, str);
        return this;
    }

    public EpisodeMetadata$Builder setPreviewIdBytes(phc phcVar) {
        copyOnWrite();
        EpisodeMetadata.s0(((g) this).instance, phcVar);
        return this;
    }

    public EpisodeMetadata$Builder setPreviewManifestId(String str) {
        copyOnWrite();
        EpisodeMetadata.t0(((g) this).instance, str);
        return this;
    }

    public EpisodeMetadata$Builder setPreviewManifestIdBytes(phc phcVar) {
        copyOnWrite();
        EpisodeMetadata.u0(((g) this).instance, phcVar);
        return this;
    }

    public EpisodeMetadata$Builder setPublishDate(long j) {
        copyOnWrite();
        EpisodeMetadata.v0(((g) this).instance, j);
        return this;
    }

    public EpisodeMetadata$Builder setShow(EpisodeShowMetadata.Builder builder) {
        copyOnWrite();
        EpisodeMetadata.w0(((g) this).instance, (EpisodeShowMetadata) builder.build());
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1425clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1427mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m1424clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1428mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ EpisodeMetadata$Builder(int i) {
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

    public EpisodeMetadata$Builder addExtension(int i, Extension extension) {
        copyOnWrite();
        EpisodeMetadata.o(((g) this).instance, i, extension);
        return this;
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }

    public EpisodeMetadata$Builder setCovers(ImageGroup imageGroup) {
        copyOnWrite();
        EpisodeMetadata.U(((g) this).instance, imageGroup);
        return this;
    }

    public EpisodeMetadata$Builder setExtension(int i, Extension extension) {
        copyOnWrite();
        EpisodeMetadata.Y(((g) this).instance, i, extension);
        return this;
    }

    public EpisodeMetadata$Builder setFreezeFrames(ImageGroup imageGroup) {
        copyOnWrite();
        EpisodeMetadata.Z(((g) this).instance, imageGroup);
        return this;
    }

    public EpisodeMetadata$Builder setShow(EpisodeShowMetadata episodeShowMetadata) {
        copyOnWrite();
        EpisodeMetadata.w0(((g) this).instance, episodeShowMetadata);
        return this;
    }

    public EpisodeMetadata$Builder addExtension(Extension extension) {
        copyOnWrite();
        EpisodeMetadata.p(((g) this).instance, extension);
        return this;
    }

    public EpisodeMetadata$Builder addExtension(int i, Extension$Builder extension$Builder) {
        copyOnWrite();
        EpisodeMetadata.o(((g) this).instance, i, extension$Builder.build());
        return this;
    }
}
