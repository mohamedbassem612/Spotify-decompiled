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
public final class GetAckCommentaryAndPrepareRecsRequest$Builder extends g implements GetAckCommentaryAndPrepareRecsRequestOrBuilder {
    private GetAckCommentaryAndPrepareRecsRequest$Builder() {
        super(GetAckCommentaryAndPrepareRecsRequest.C());
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

    public final GetAckCommentaryAndPrepareRecsRequest$Builder clearCurrentSegmentId() {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.n(((g) this).instance);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder clearCurrentTrackUri() {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.o(((g) this).instance);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder clearDeviceId() {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.p(((g) this).instance);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder clearPrompt() {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.q(((g) this).instance);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder clearSessionId() {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.r(((g) this).instance);
        return this;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
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
    public final /* bridge */ /* synthetic */ r8 m42mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setCurrentSegmentId(String str) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.s(((g) this).instance, str);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setCurrentSegmentIdBytes(phc phcVar) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.t(((g) this).instance, phcVar);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setCurrentTrackUri(String str) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.u(((g) this).instance, str);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setCurrentTrackUriBytes(phc phcVar) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.v(((g) this).instance, phcVar);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setDeviceId(String str) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.w(((g) this).instance, str);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setDeviceIdBytes(phc phcVar) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.x(((g) this).instance, phcVar);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setPrompt(String str) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.y(((g) this).instance, str);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setPromptBytes(phc phcVar) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.z(((g) this).instance, phcVar);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setSessionId(String str) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.A(((g) this).instance, str);
        return this;
    }

    public final GetAckCommentaryAndPrepareRecsRequest$Builder setSessionIdBytes(phc phcVar) {
        copyOnWrite();
        GetAckCommentaryAndPrepareRecsRequest.B(((g) this).instance, phcVar);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m41clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m43mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m40clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m44mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ GetAckCommentaryAndPrepareRecsRequest$Builder(int i) {
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
