package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.signup.signup.v2.proto.AccountDetails;
import com.spotify.signup.signup.v2.proto.ClientInfo;
import com.spotify.signup.signup.v2.proto.CreateAccountRequest;
import com.spotify.signup.signup.v2.proto.Tracking;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ijn extends g implements v2j0 {
    public ijn() {
        super(CreateAccountRequest.n());
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
    public final /* bridge */ /* synthetic */ r8 m764mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(AccountDetails accountDetails) {
        copyOnWrite();
        CreateAccountRequest createAccountRequest = ((g) this).instance;
        int i = CreateAccountRequest.CALLBACK_URI_FIELD_NUMBER;
        createAccountRequest.p(accountDetails);
    }

    public final void q() {
        copyOnWrite();
        CreateAccountRequest createAccountRequest = ((g) this).instance;
        int i = CreateAccountRequest.CALLBACK_URI_FIELD_NUMBER;
        createAccountRequest.q();
    }

    public final void r(ClientInfo clientInfo) {
        copyOnWrite();
        CreateAccountRequest createAccountRequest = ((g) this).instance;
        int i = CreateAccountRequest.CALLBACK_URI_FIELD_NUMBER;
        createAccountRequest.r(clientInfo);
    }

    public final void s(String str) {
        copyOnWrite();
        CreateAccountRequest createAccountRequest = ((g) this).instance;
        int i = CreateAccountRequest.CALLBACK_URI_FIELD_NUMBER;
        createAccountRequest.s(str);
    }

    public final void t(String str) {
        copyOnWrite();
        CreateAccountRequest createAccountRequest = ((g) this).instance;
        int i = CreateAccountRequest.CALLBACK_URI_FIELD_NUMBER;
        createAccountRequest.t(str);
    }

    public final void u(Tracking tracking) {
        copyOnWrite();
        CreateAccountRequest createAccountRequest = ((g) this).instance;
        int i = CreateAccountRequest.CALLBACK_URI_FIELD_NUMBER;
        createAccountRequest.u(tracking);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m763clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m765mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m762clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m766mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
