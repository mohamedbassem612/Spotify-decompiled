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
public final class TrackSyncState$Builder extends g implements TrackSyncStateOrBuilder {
    private TrackSyncState$Builder() {
        super(TrackSyncState.s());
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

    public TrackSyncState$Builder clearOffline() {
        copyOnWrite();
        TrackSyncState.n(((g) this).instance);
        return this;
    }

    public TrackSyncState$Builder clearSyncProgress() {
        copyOnWrite();
        TrackSyncState.o(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public String getOffline() {
        return ((g) this).instance.getOffline();
    }

    public phc getOfflineBytes() {
        return ((g) this).instance.getOfflineBytes();
    }

    public int getSyncProgress() {
        return ((g) this).instance.getSyncProgress();
    }

    public boolean hasOffline() {
        return ((g) this).instance.hasOffline();
    }

    public boolean hasSyncProgress() {
        return ((g) this).instance.hasSyncProgress();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1507mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public TrackSyncState$Builder setOffline(String str) {
        copyOnWrite();
        TrackSyncState.p(((g) this).instance, str);
        return this;
    }

    public TrackSyncState$Builder setOfflineBytes(phc phcVar) {
        copyOnWrite();
        TrackSyncState.q(((g) this).instance, phcVar);
        return this;
    }

    public TrackSyncState$Builder setSyncProgress(int i) {
        copyOnWrite();
        TrackSyncState.r(((g) this).instance, i);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1506clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1508mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m1505clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m1509mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ TrackSyncState$Builder(int i) {
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
