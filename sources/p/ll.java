package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.signup.signup.v2.proto.AccountDetails;
import com.spotify.signup.signup.v2.proto.ConsentFlags;
import com.spotify.signup.signup.v2.proto.EmailAndPasswordIdentifier;
import com.spotify.signup.signup.v2.proto.GraduationIdentifier;
import com.spotify.signup.signup.v2.proto.IdentityProviderIdentifier;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ll extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m541mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str) {
        copyOnWrite();
        AccountDetails accountDetails = (AccountDetails) ((g) this).instance;
        int i = AccountDetails.DISPLAY_NAME_FIELD_NUMBER;
        accountDetails.q(str);
    }

    public final void q(ConsentFlags consentFlags) {
        copyOnWrite();
        AccountDetails accountDetails = (AccountDetails) ((g) this).instance;
        int i = AccountDetails.DISPLAY_NAME_FIELD_NUMBER;
        accountDetails.r(consentFlags);
    }

    public final void r(String str) {
        copyOnWrite();
        AccountDetails accountDetails = (AccountDetails) ((g) this).instance;
        int i = AccountDetails.DISPLAY_NAME_FIELD_NUMBER;
        accountDetails.s(str);
    }

    public final void s(avw avwVar) {
        copyOnWrite();
        AccountDetails accountDetails = (AccountDetails) ((g) this).instance;
        EmailAndPasswordIdentifier emailAndPasswordIdentifier = (EmailAndPasswordIdentifier) avwVar.build();
        int i = AccountDetails.DISPLAY_NAME_FIELD_NUMBER;
        accountDetails.t(emailAndPasswordIdentifier);
    }

    public final void t(ml mlVar) {
        copyOnWrite();
        AccountDetails accountDetails = (AccountDetails) ((g) this).instance;
        int i = AccountDetails.DISPLAY_NAME_FIELD_NUMBER;
        accountDetails.u(mlVar);
    }

    public final void u(w850 w850Var) {
        copyOnWrite();
        AccountDetails accountDetails = (AccountDetails) ((g) this).instance;
        GraduationIdentifier graduationIdentifier = (GraduationIdentifier) w850Var.build();
        int i = AccountDetails.DISPLAY_NAME_FIELD_NUMBER;
        accountDetails.v(graduationIdentifier);
    }

    public final void v(eo70 eo70Var) {
        copyOnWrite();
        AccountDetails accountDetails = (AccountDetails) ((g) this).instance;
        IdentityProviderIdentifier identityProviderIdentifier = (IdentityProviderIdentifier) eo70Var.build();
        int i = AccountDetails.DISPLAY_NAME_FIELD_NUMBER;
        accountDetails.w(identityProviderIdentifier);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m540clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m542mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m539clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m543mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
