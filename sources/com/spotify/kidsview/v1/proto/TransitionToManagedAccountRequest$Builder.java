package com.spotify.kidsview.v1.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class TransitionToManagedAccountRequest$Builder extends g implements TransitionToManagedAccountRequestOrBuilder {
    private TransitionToManagedAccountRequest$Builder() {
        super(TransitionToManagedAccountRequest.A());
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

    public TransitionToManagedAccountRequest$Builder clearMemberId() {
        copyOnWrite();
        TransitionToManagedAccountRequest.n(((g) this).instance);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder clearParentPinHash() {
        copyOnWrite();
        TransitionToManagedAccountRequest.o(((g) this).instance);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder clearParentalConsentSessionId() {
        copyOnWrite();
        TransitionToManagedAccountRequest.p(((g) this).instance);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder clearSettings() {
        copyOnWrite();
        TransitionToManagedAccountRequest.q(((g) this).instance);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder clearTransitioningUserIdentifier() {
        copyOnWrite();
        TransitionToManagedAccountRequest.r(((g) this).instance);
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public String getMemberId() {
        return ((g) this).instance.getMemberId();
    }

    public phc getMemberIdBytes() {
        return ((g) this).instance.getMemberIdBytes();
    }

    public String getParentPinHash() {
        return ((g) this).instance.getParentPinHash();
    }

    public phc getParentPinHashBytes() {
        return ((g) this).instance.getParentPinHashBytes();
    }

    public String getParentalConsentSessionId() {
        return ((g) this).instance.getParentalConsentSessionId();
    }

    public phc getParentalConsentSessionIdBytes() {
        return ((g) this).instance.getParentalConsentSessionIdBytes();
    }

    public GenAlphaManagedSettings getSettings() {
        return ((g) this).instance.getSettings();
    }

    public TransitionToManagedAccountRequest$TransitioningUserIdentifierCase getTransitioningUserIdentifierCase() {
        return ((g) this).instance.getTransitioningUserIdentifierCase();
    }

    public boolean hasMemberId() {
        return ((g) this).instance.hasMemberId();
    }

    public boolean hasParentPinHash() {
        return ((g) this).instance.hasParentPinHash();
    }

    public boolean hasParentalConsentSessionId() {
        return ((g) this).instance.hasParentalConsentSessionId();
    }

    public boolean hasSettings() {
        return ((g) this).instance.hasSettings();
    }

    public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m148mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public TransitionToManagedAccountRequest$Builder mergeSettings(GenAlphaManagedSettings genAlphaManagedSettings) {
        copyOnWrite();
        TransitionToManagedAccountRequest.s(((g) this).instance, genAlphaManagedSettings);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder setMemberId(String str) {
        copyOnWrite();
        TransitionToManagedAccountRequest.t(((g) this).instance, str);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder setMemberIdBytes(phc phcVar) {
        copyOnWrite();
        TransitionToManagedAccountRequest.u(((g) this).instance, phcVar);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder setParentPinHash(String str) {
        copyOnWrite();
        TransitionToManagedAccountRequest.v(((g) this).instance, str);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder setParentPinHashBytes(phc phcVar) {
        copyOnWrite();
        TransitionToManagedAccountRequest.w(((g) this).instance, phcVar);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder setParentalConsentSessionId(String str) {
        copyOnWrite();
        TransitionToManagedAccountRequest.x(((g) this).instance, str);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder setParentalConsentSessionIdBytes(phc phcVar) {
        copyOnWrite();
        TransitionToManagedAccountRequest.y(((g) this).instance, phcVar);
        return this;
    }

    public TransitionToManagedAccountRequest$Builder setSettings(GenAlphaManagedSettings.Builder builder) {
        copyOnWrite();
        TransitionToManagedAccountRequest.z(((g) this).instance, (GenAlphaManagedSettings) builder.build());
        return this;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m147clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m149mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r2j0 m146clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ r8 m150mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
    }

    public /* synthetic */ TransitionToManagedAccountRequest$Builder(int i) {
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

    public TransitionToManagedAccountRequest$Builder setSettings(GenAlphaManagedSettings genAlphaManagedSettings) {
        copyOnWrite();
        TransitionToManagedAccountRequest.z(((g) this).instance, genAlphaManagedSettings);
        return this;
    }
}
