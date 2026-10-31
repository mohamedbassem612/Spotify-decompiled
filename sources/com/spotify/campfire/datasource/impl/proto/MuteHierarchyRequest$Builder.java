package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import p.ifv;
import p.lwg;
import p.phc;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class MuteHierarchyRequest$Builder extends g implements MuteHierarchyRequestOrBuilder {
    private MuteHierarchyRequest$Builder() {
        super(MuteHierarchyRequest.t());
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

    public MuteHierarchyRequest$Builder clearDuration() {
        copyOnWrite();
        MuteHierarchyRequest.n(((g) this).instance);
        return this;
    }

    public MuteHierarchyRequest$Builder clearHierarchyId() {
        copyOnWrite();
        MuteHierarchyRequest.o(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public Duration getDuration() {
        return ((g) this).instance.getDuration();
    }

    public String getHierarchyId() {
        return ((g) this).instance.getHierarchyId();
    }

    public phc getHierarchyIdBytes() {
        return ((g) this).instance.getHierarchyIdBytes();
    }

    public boolean hasDuration() {
        return ((g) this).instance.hasDuration();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    public MuteHierarchyRequest$Builder mergeDuration(Duration duration) {
        copyOnWrite();
        MuteHierarchyRequest.p(((g) this).instance, duration);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m596mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public MuteHierarchyRequest$Builder setDuration(ifv ifvVar) {
        copyOnWrite();
        MuteHierarchyRequest.q(((g) this).instance, ifvVar.build());
        return this;
    }

    public MuteHierarchyRequest$Builder setHierarchyId(String str) {
        copyOnWrite();
        MuteHierarchyRequest.r(((g) this).instance, str);
        return this;
    }

    public MuteHierarchyRequest$Builder setHierarchyIdBytes(phc phcVar) {
        copyOnWrite();
        MuteHierarchyRequest.s(((g) this).instance, phcVar);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m595clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m597mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m594clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m598mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ MuteHierarchyRequest$Builder(int i) {
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

    public MuteHierarchyRequest$Builder setDuration(Duration duration) {
        copyOnWrite();
        MuteHierarchyRequest.q(((g) this).instance, duration);
        return this;
    }
}
