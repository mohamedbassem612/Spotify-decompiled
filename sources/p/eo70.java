package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.signup.signup.v2.proto.EmailOtpProvider;
import com.spotify.signup.signup.v2.proto.GoogleProvider;
import com.spotify.signup.signup.v2.proto.IdentityProviderIdentifier;
import com.spotify.signup.signup.v2.proto.NaverProvider;
import com.spotify.signup.signup.v2.proto.PhoneNumberProvider;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eo70 extends g implements v2j0 {
    public final /* bridge */ /* synthetic */ s2j0 build() {
        return build();
    }

    public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
        return super.buildPartial();
    }

    public final /* bridge */ /* synthetic */ r2j0 clear() {
        return clear();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m300mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(oxw oxwVar) {
        copyOnWrite();
        IdentityProviderIdentifier identityProviderIdentifier = (IdentityProviderIdentifier) ((g) this).instance;
        EmailOtpProvider emailOtpProvider = (EmailOtpProvider) oxwVar.build();
        int i = IdentityProviderIdentifier.TOKEN_FIELD_NUMBER;
        identityProviderIdentifier.o(emailOtpProvider);
    }

    public final void q(i450 i450Var) {
        copyOnWrite();
        IdentityProviderIdentifier identityProviderIdentifier = (IdentityProviderIdentifier) ((g) this).instance;
        GoogleProvider googleProvider = (GoogleProvider) i450Var.build();
        int i = IdentityProviderIdentifier.TOKEN_FIELD_NUMBER;
        identityProviderIdentifier.p(googleProvider);
    }

    public final void r(qpn0 qpn0Var) {
        copyOnWrite();
        IdentityProviderIdentifier identityProviderIdentifier = (IdentityProviderIdentifier) ((g) this).instance;
        NaverProvider naverProvider = (NaverProvider) qpn0Var.build();
        int i = IdentityProviderIdentifier.TOKEN_FIELD_NUMBER;
        identityProviderIdentifier.q(naverProvider);
    }

    public final void s(ius0 ius0Var) {
        copyOnWrite();
        IdentityProviderIdentifier identityProviderIdentifier = (IdentityProviderIdentifier) ((g) this).instance;
        PhoneNumberProvider phoneNumberProvider = (PhoneNumberProvider) ius0Var.build();
        int i = IdentityProviderIdentifier.TOKEN_FIELD_NUMBER;
        identityProviderIdentifier.r(phoneNumberProvider);
    }

    public final void t(String str) {
        copyOnWrite();
        IdentityProviderIdentifier identityProviderIdentifier = (IdentityProviderIdentifier) ((g) this).instance;
        int i = IdentityProviderIdentifier.TOKEN_FIELD_NUMBER;
        identityProviderIdentifier.s(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m299clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m301mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m298clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m302mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mergeFrom(bArr, i, i2, uz00Var);
    }

    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super/*p.r8*/.mergeFrom(inputStream);
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
