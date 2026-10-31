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
public final class TrackCollectionDecorationPolicy$Builder extends g implements TrackCollectionDecorationPolicyOrBuilder {
    private TrackCollectionDecorationPolicy$Builder() {
        super(TrackCollectionDecorationPolicy.v());
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

    public TrackCollectionDecorationPolicy$Builder clearCanAddToCollection() {
        copyOnWrite();
        TrackCollectionDecorationPolicy.n(((g) this).instance);
        return this;
    }

    public TrackCollectionDecorationPolicy$Builder clearCanBan() {
        copyOnWrite();
        TrackCollectionDecorationPolicy.o(((g) this).instance);
        return this;
    }

    public TrackCollectionDecorationPolicy$Builder clearIsBanned() {
        copyOnWrite();
        TrackCollectionDecorationPolicy.p(((g) this).instance);
        return this;
    }

    public TrackCollectionDecorationPolicy$Builder clearIsInCollection() {
        copyOnWrite();
        TrackCollectionDecorationPolicy.q(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public boolean getCanAddToCollection() {
        return ((g) this).instance.getCanAddToCollection();
    }

    public boolean getCanBan() {
        return ((g) this).instance.getCanBan();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public boolean getIsBanned() {
        return ((g) this).instance.getIsBanned();
    }

    public boolean getIsInCollection() {
        return ((g) this).instance.getIsInCollection();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1370mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public TrackCollectionDecorationPolicy$Builder setCanAddToCollection(boolean z) {
        copyOnWrite();
        TrackCollectionDecorationPolicy.r(((g) this).instance, z);
        return this;
    }

    public TrackCollectionDecorationPolicy$Builder setCanBan(boolean z) {
        copyOnWrite();
        TrackCollectionDecorationPolicy.s(((g) this).instance, z);
        return this;
    }

    public TrackCollectionDecorationPolicy$Builder setIsBanned(boolean z) {
        copyOnWrite();
        TrackCollectionDecorationPolicy.t(((g) this).instance, z);
        return this;
    }

    public TrackCollectionDecorationPolicy$Builder setIsInCollection(boolean z) {
        copyOnWrite();
        TrackCollectionDecorationPolicy.u(((g) this).instance, z);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1369clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1371mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m1368clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1372mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ TrackCollectionDecorationPolicy$Builder(int i) {
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
