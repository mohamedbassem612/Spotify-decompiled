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
public final class ResolveInteractiveContextRequest$Builder extends g implements ResolveInteractiveContextRequestOrBuilder {
    private ResolveInteractiveContextRequest$Builder() {
        super(ResolveInteractiveContextRequest.L());
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

    public final ResolveInteractiveContextRequest$Builder clearCurrentSegmentId() {
        copyOnWrite();
        ResolveInteractiveContextRequest.n(((g) this).instance);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder clearCurrentTrackUri() {
        copyOnWrite();
        ResolveInteractiveContextRequest.o(((g) this).instance);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder clearDeviceId() {
        copyOnWrite();
        ResolveInteractiveContextRequest.p(((g) this).instance);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder clearInputType() {
        copyOnWrite();
        ResolveInteractiveContextRequest.q(((g) this).instance);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder clearPrompt() {
        copyOnWrite();
        ResolveInteractiveContextRequest.r(((g) this).instance);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder clearReason() {
        copyOnWrite();
        ResolveInteractiveContextRequest.s(((g) this).instance);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder clearRetriesLeft() {
        copyOnWrite();
        ResolveInteractiveContextRequest.t(((g) this).instance);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder clearSessionId() {
        copyOnWrite();
        ResolveInteractiveContextRequest.u(((g) this).instance);
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

    public final ResolveInteractiveContextRequest$PromptInputType getInputType() {
        return ((g) this).instance.getInputType();
    }

    public final int getInputTypeValue() {
        return ((g) this).instance.getInputTypeValue();
    }

    public final String getPrompt() {
        return ((g) this).instance.getPrompt();
    }

    public final phc getPromptBytes() {
        return ((g) this).instance.getPromptBytes();
    }

    public final ResolveInteractiveContextRequest$RequestSubmissionReason getReason() {
        return ((g) this).instance.getReason();
    }

    public final int getReasonValue() {
        return ((g) this).instance.getReasonValue();
    }

    public final String getRetriesLeft() {
        return ((g) this).instance.getRetriesLeft();
    }

    public final phc getRetriesLeftBytes() {
        return ((g) this).instance.getRetriesLeftBytes();
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
    public final /* bridge */ /* synthetic */ r8 m64mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final ResolveInteractiveContextRequest$Builder setCurrentSegmentId(String str) {
        copyOnWrite();
        ResolveInteractiveContextRequest.v(((g) this).instance, str);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setCurrentSegmentIdBytes(phc phcVar) {
        copyOnWrite();
        ResolveInteractiveContextRequest.w(((g) this).instance, phcVar);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setCurrentTrackUri(String str) {
        copyOnWrite();
        ResolveInteractiveContextRequest.x(((g) this).instance, str);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setCurrentTrackUriBytes(phc phcVar) {
        copyOnWrite();
        ResolveInteractiveContextRequest.y(((g) this).instance, phcVar);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setDeviceId(String str) {
        copyOnWrite();
        ResolveInteractiveContextRequest.z(((g) this).instance, str);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setDeviceIdBytes(phc phcVar) {
        copyOnWrite();
        ResolveInteractiveContextRequest.A(((g) this).instance, phcVar);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setInputType(ResolveInteractiveContextRequest$PromptInputType resolveInteractiveContextRequest$PromptInputType) {
        copyOnWrite();
        ResolveInteractiveContextRequest.B(((g) this).instance, resolveInteractiveContextRequest$PromptInputType);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setInputTypeValue(int i) {
        copyOnWrite();
        ResolveInteractiveContextRequest.C(((g) this).instance, i);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setPrompt(String str) {
        copyOnWrite();
        ResolveInteractiveContextRequest.D(((g) this).instance, str);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setPromptBytes(phc phcVar) {
        copyOnWrite();
        ResolveInteractiveContextRequest.E(((g) this).instance, phcVar);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setReason(ResolveInteractiveContextRequest$RequestSubmissionReason resolveInteractiveContextRequest$RequestSubmissionReason) {
        copyOnWrite();
        ResolveInteractiveContextRequest.F(((g) this).instance, resolveInteractiveContextRequest$RequestSubmissionReason);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setReasonValue(int i) {
        copyOnWrite();
        ResolveInteractiveContextRequest.G(((g) this).instance, i);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setRetriesLeft(String str) {
        copyOnWrite();
        ResolveInteractiveContextRequest.H(((g) this).instance, str);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setRetriesLeftBytes(phc phcVar) {
        copyOnWrite();
        ResolveInteractiveContextRequest.I(((g) this).instance, phcVar);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setSessionId(String str) {
        copyOnWrite();
        ResolveInteractiveContextRequest.J(((g) this).instance, str);
        return this;
    }

    public final ResolveInteractiveContextRequest$Builder setSessionIdBytes(phc phcVar) {
        copyOnWrite();
        ResolveInteractiveContextRequest.K(((g) this).instance, phcVar);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m63clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m65mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m62clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m66mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ ResolveInteractiveContextRequest$Builder(int i) {
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
