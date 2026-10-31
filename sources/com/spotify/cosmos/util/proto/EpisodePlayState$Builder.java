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
public final class EpisodePlayState$Builder extends g implements EpisodePlayStateOrBuilder {
    private EpisodePlayState$Builder() {
        super(EpisodePlayState.x());
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

    public EpisodePlayState$Builder clearIsPlayable() {
        copyOnWrite();
        EpisodePlayState.n(((g) this).instance);
        return this;
    }

    public EpisodePlayState$Builder clearIsPlayed() {
        copyOnWrite();
        EpisodePlayState.o(((g) this).instance);
        return this;
    }

    public EpisodePlayState$Builder clearLastPlayedAt() {
        copyOnWrite();
        EpisodePlayState.p(((g) this).instance);
        return this;
    }

    public EpisodePlayState$Builder clearPlayabilityRestriction() {
        copyOnWrite();
        EpisodePlayState.q(((g) this).instance);
        return this;
    }

    public EpisodePlayState$Builder clearTimeLeft() {
        copyOnWrite();
        EpisodePlayState.r(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public boolean getIsPlayable() {
        return ((g) this).instance.getIsPlayable();
    }

    public boolean getIsPlayed() {
        return ((g) this).instance.getIsPlayed();
    }

    public int getLastPlayedAt() {
        return ((g) this).instance.getLastPlayedAt();
    }

    public PlayabilityRestriction getPlayabilityRestriction() {
        return ((g) this).instance.getPlayabilityRestriction();
    }

    public int getTimeLeft() {
        return ((g) this).instance.getTimeLeft();
    }

    public boolean hasIsPlayable() {
        return ((g) this).instance.hasIsPlayable();
    }

    public boolean hasIsPlayed() {
        return ((g) this).instance.hasIsPlayed();
    }

    public boolean hasLastPlayedAt() {
        return ((g) this).instance.hasLastPlayedAt();
    }

    public boolean hasPlayabilityRestriction() {
        return ((g) this).instance.hasPlayabilityRestriction();
    }

    public boolean hasTimeLeft() {
        return ((g) this).instance.hasTimeLeft();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1431mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public EpisodePlayState$Builder setIsPlayable(boolean z) {
        copyOnWrite();
        EpisodePlayState.s(((g) this).instance, z);
        return this;
    }

    public EpisodePlayState$Builder setIsPlayed(boolean z) {
        copyOnWrite();
        EpisodePlayState.t(((g) this).instance, z);
        return this;
    }

    public EpisodePlayState$Builder setLastPlayedAt(int i) {
        copyOnWrite();
        EpisodePlayState.u(((g) this).instance, i);
        return this;
    }

    public EpisodePlayState$Builder setPlayabilityRestriction(PlayabilityRestriction playabilityRestriction) {
        copyOnWrite();
        EpisodePlayState.v(((g) this).instance, playabilityRestriction);
        return this;
    }

    public EpisodePlayState$Builder setTimeLeft(int i) {
        copyOnWrite();
        EpisodePlayState.w(((g) this).instance, i);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1430clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1432mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m1429clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1433mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ EpisodePlayState$Builder(int i) {
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
