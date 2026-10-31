package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$AuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$EmailAddress;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$FacebookAccessToken;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$GoogleSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$LegacyV3Password;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$NativePassword;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$NaverSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$OneTimeToken;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$ParentChildCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$Password;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$PhoneNumber;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$SamsungSignInCredentials;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nkz extends g implements v2j0 {
    public final void A(EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.z(esAuthenticateCredentials$SamsungSignInCredentials);
    }

    public final void B(vsz vszVar) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials = (EsUnencryptedStoredCredentials$UnencryptedStoredCredentials) vszVar.build();
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.A(esUnencryptedStoredCredentials$UnencryptedStoredCredentials);
    }

    @Override // com.google.protobuf.g, p.r2j0
    public final /* bridge */ /* synthetic */ s2j0 build() {
        return build();
    }

    @Override // com.google.protobuf.g, p.r2j0
    public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
        return super.buildPartial();
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ r2j0 mo0clear() {
        return mo0clear();
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo3clone() {
        return super.mo1clone();
    }

    @Override // com.google.protobuf.g, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return super.getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.g, p.r8
    public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
        return super.internalMergeFrom((h) s8Var);
    }

    @Override // com.google.protobuf.g, p.r8, p.r2j0
    public final /* bridge */ /* synthetic */ r8 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(EsAuthenticateCredentials.AuthnPlatformCredential authnPlatformCredential) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.o(authnPlatformCredential);
    }

    public final void q(EsAuthenticateCredentials$EmailAddress esAuthenticateCredentials$EmailAddress) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.p(esAuthenticateCredentials$EmailAddress);
    }

    public final void r(EsAuthenticateCredentials$FacebookAccessToken esAuthenticateCredentials$FacebookAccessToken) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.q(esAuthenticateCredentials$FacebookAccessToken);
    }

    public final void s(EsAuthenticateCredentials$GoogleSignInCredentials esAuthenticateCredentials$GoogleSignInCredentials) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.r(esAuthenticateCredentials$GoogleSignInCredentials);
    }

    public final void t(EsAuthenticateCredentials$LegacyV3Password esAuthenticateCredentials$LegacyV3Password) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.s(esAuthenticateCredentials$LegacyV3Password);
    }

    public final void u(EsAuthenticateCredentials$NativePassword esAuthenticateCredentials$NativePassword) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.t(esAuthenticateCredentials$NativePassword);
    }

    public final void v(EsAuthenticateCredentials$NaverSignInCredentials esAuthenticateCredentials$NaverSignInCredentials) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.u(esAuthenticateCredentials$NaverSignInCredentials);
    }

    public final void w(EsAuthenticateCredentials$OneTimeToken esAuthenticateCredentials$OneTimeToken) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.v(esAuthenticateCredentials$OneTimeToken);
    }

    public final void x(EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.w(esAuthenticateCredentials$ParentChildCredentials);
    }

    public final void y(EsAuthenticateCredentials$Password esAuthenticateCredentials$Password) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.x(esAuthenticateCredentials$Password);
    }

    public final void z(EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber) {
        copyOnWrite();
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) this.instance;
        int i = EsAuthenticateCredentials$AuthenticateCredentials.PASSWORD_FIELD_NUMBER;
        esAuthenticateCredentials$AuthenticateCredentials.y(esAuthenticateCredentials$PhoneNumber);
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ r8 mo2clone() {
        return super.mo1clone();
    }

    @Override // com.google.protobuf.g, p.r8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ r8 mo4mergeFrom(byte[] bArr, int i, int i2) {
        return super.mo4mergeFrom(bArr, i, i2);
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: clone */
    public final /* bridge */ /* synthetic */ r2j0 mo2clone() {
        return super.mo1clone();
    }

    @Override // com.google.protobuf.g, p.r8
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ r8 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mo5mergeFrom(bArr, i, i2, uz00Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
        return super.mergeFrom(inputStream);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
        return super.mergeFrom(inputStream, uz00Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
        return super.mergeFrom(phcVar);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
        return super.mergeFrom(phcVar, uz00Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
        return super.mergeFrom(lwgVar);
    }

    @Override // com.google.protobuf.g, p.r2j0
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    @Override // p.r8, p.r2j0
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
        return super.mergeFrom(s2j0Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
        return super.mergeFrom(bArr);
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ r2j0 mo4mergeFrom(byte[] bArr, int i, int i2) {
        return super.mo4mergeFrom(bArr, i, i2);
    }

    @Override // com.google.protobuf.g
    /* JADX INFO: renamed from: mergeFrom */
    public final /* bridge */ /* synthetic */ r2j0 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
        return super.mo5mergeFrom(bArr, i, i2, uz00Var);
    }

    @Override // p.r8
    public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
        return super.mergeFrom(bArr, uz00Var);
    }
}
