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
public final class GetSuggestedPromptsRequest$Builder extends g implements GetSuggestedPromptsRequestOrBuilder {
    private GetSuggestedPromptsRequest$Builder() {
        super(GetSuggestedPromptsRequest.v());
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

    public final GetSuggestedPromptsRequest$Builder clearCurrentTrackUri() {
        copyOnWrite();
        GetSuggestedPromptsRequest.n(((g) this).instance);
        return this;
    }

    public final GetSuggestedPromptsRequest$Builder clearLlmModel() {
        copyOnWrite();
        GetSuggestedPromptsRequest.o(((g) this).instance);
        return this;
    }

    public final GetSuggestedPromptsRequest$Builder clearUnused() {
        copyOnWrite();
        GetSuggestedPromptsRequest.p(((g) this).instance);
        return this;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
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

    public final Model getLlmModel() {
        return ((g) this).instance.getLlmModel();
    }

    public final int getLlmModelValue() {
        return ((g) this).instance.getLlmModelValue();
    }

    public final boolean getUnused() {
        return ((g) this).instance.getUnused();
    }

    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m52mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final GetSuggestedPromptsRequest$Builder setCurrentTrackUri(String str) {
        copyOnWrite();
        GetSuggestedPromptsRequest.q(((g) this).instance, str);
        return this;
    }

    public final GetSuggestedPromptsRequest$Builder setCurrentTrackUriBytes(phc phcVar) {
        copyOnWrite();
        GetSuggestedPromptsRequest.r(((g) this).instance, phcVar);
        return this;
    }

    public final GetSuggestedPromptsRequest$Builder setLlmModel(Model model) {
        copyOnWrite();
        GetSuggestedPromptsRequest.s(((g) this).instance, model);
        return this;
    }

    public final GetSuggestedPromptsRequest$Builder setLlmModelValue(int i) {
        copyOnWrite();
        GetSuggestedPromptsRequest.t(((g) this).instance, i);
        return this;
    }

    public final GetSuggestedPromptsRequest$Builder setUnused(boolean z) {
        copyOnWrite();
        GetSuggestedPromptsRequest.u(((g) this).instance, z);
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m51clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m53mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m50clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m54mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ GetSuggestedPromptsRequest$Builder(int i) {
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
