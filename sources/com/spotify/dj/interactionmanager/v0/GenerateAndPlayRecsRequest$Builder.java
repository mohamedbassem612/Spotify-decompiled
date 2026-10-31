package com.spotify.dj.interactionmanager.v0;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GenerateAndPlayRecsRequest$Builder extends g implements GenerateAndPlayRecsRequestOrBuilder {
    private GenerateAndPlayRecsRequest$Builder() {
        super(GenerateAndPlayRecsRequest.F());
    }

    public final /* bridge */ /* synthetic */ s2j0 build() {
        return build();
    }

    public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
        return super.buildPartial();
    }

    public final /* bridge */ /* synthetic */ r2j0 clear() {
        return clear();
    }

    public final GenerateAndPlayRecsRequest$Builder clearAckCommentaryText() {
        copyOnWrite();
        GenerateAndPlayRecsRequest.n(((g) this).instance);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder clearCurrentSegmentId() {
        copyOnWrite();
        GenerateAndPlayRecsRequest.o(((g) this).instance);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder clearCurrentTrackUri() {
        copyOnWrite();
        GenerateAndPlayRecsRequest.p(((g) this).instance);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder clearDeviceId() {
        copyOnWrite();
        GenerateAndPlayRecsRequest.q(((g) this).instance);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder clearPrompt() {
        copyOnWrite();
        GenerateAndPlayRecsRequest.r(((g) this).instance);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder clearSessionId() {
        copyOnWrite();
        GenerateAndPlayRecsRequest.s(((g) this).instance);
        return this;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public final String getAckCommentaryText() {
        return ((g) this).instance.getAckCommentaryText();
    }

    public final phc getAckCommentaryTextBytes() {
        return ((g) this).instance.getAckCommentaryTextBytes();
    }

    public final String getCurrentSegmentId() {
        return ((g) this).instance.getCurrentSegmentId();
    }

    public final phc getCurrentSegmentIdBytes() {
        return ((g) this).instance.getCurrentSegmentIdBytes();
    }

    public final String getCurrentTrackUri() {
        return ((g) this).instance.getCurrentTrackUri();
    }

    public final phc getCurrentTrackUriBytes() {
        return ((g) this).instance.getCurrentTrackUriBytes();
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public final String getDeviceId() {
        return ((g) this).instance.getDeviceId();
    }

    public final phc getDeviceIdBytes() {
        return ((g) this).instance.getDeviceIdBytes();
    }

    public final String getPrompt() {
        return ((g) this).instance.getPrompt();
    }

    public final phc getPromptBytes() {
        return ((g) this).instance.getPromptBytes();
    }

    public final String getSessionId() {
        return ((g) this).instance.getSessionId();
    }

    public final phc getSessionIdBytes() {
        return ((g) this).instance.getSessionIdBytes();
    }

    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m32mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final GenerateAndPlayRecsRequest$Builder setAckCommentaryText(String str) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.t(((g) this).instance, str);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setAckCommentaryTextBytes(phc phcVar) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.u(((g) this).instance, phcVar);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setCurrentSegmentId(String str) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.v(((g) this).instance, str);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setCurrentSegmentIdBytes(phc phcVar) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.w(((g) this).instance, phcVar);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setCurrentTrackUri(String str) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.x(((g) this).instance, str);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setCurrentTrackUriBytes(phc phcVar) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.y(((g) this).instance, phcVar);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setDeviceId(String str) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.z(((g) this).instance, str);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setDeviceIdBytes(phc phcVar) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.A(((g) this).instance, phcVar);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setPrompt(String str) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.B(((g) this).instance, str);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setPromptBytes(phc phcVar) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.C(((g) this).instance, phcVar);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setSessionId(String str) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.D(((g) this).instance, str);
        return this;
    }

    public final GenerateAndPlayRecsRequest$Builder setSessionIdBytes(phc phcVar) {
        copyOnWrite();
        GenerateAndPlayRecsRequest.E(((g) this).instance, phcVar);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m31clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m33mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m30clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m34mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ GenerateAndPlayRecsRequest$Builder(int i) {
        this();
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
        return super/*p.r8*/.mergeFrom(phcVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
        return super/*p.r8*/.mergeFrom(lwgVar);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
        return super/*p.r8*/.mergeFrom(s2j0Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
        return super/*p.r8*/.mergeFrom(bArr);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super/*p.r8*/.mergeFrom(bArr, uz00Var);
    }
}
