package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.passkeys.v1.FinishAuthenticationRequest;
import com.spotify.passkeys.v1.IdentityAssertionOptions;
import com.spotify.passkeys.v1.Signals;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hi20 extends g implements v2j0 {
    public hi20() {
        super(FinishAuthenticationRequest.n());
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
    public final /* bridge */ /* synthetic */ r8 m391mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(hhc hhcVar) {
        copyOnWrite();
        FinishAuthenticationRequest finishAuthenticationRequest = ((g) this).instance;
        int i = FinishAuthenticationRequest.SIGNALS_FIELD_NUMBER;
        finishAuthenticationRequest.p(hhcVar);
    }

    public final void q(hhc hhcVar) {
        copyOnWrite();
        FinishAuthenticationRequest finishAuthenticationRequest = ((g) this).instance;
        int i = FinishAuthenticationRequest.SIGNALS_FIELD_NUMBER;
        finishAuthenticationRequest.q(hhcVar);
    }

    public final void r(hhc hhcVar) {
        copyOnWrite();
        FinishAuthenticationRequest finishAuthenticationRequest = ((g) this).instance;
        int i = FinishAuthenticationRequest.SIGNALS_FIELD_NUMBER;
        finishAuthenticationRequest.r(hhcVar);
    }

    public final void s(zn70 zn70Var) {
        copyOnWrite();
        FinishAuthenticationRequest finishAuthenticationRequest = ((g) this).instance;
        IdentityAssertionOptions identityAssertionOptionsBuild = zn70Var.build();
        int i = FinishAuthenticationRequest.SIGNALS_FIELD_NUMBER;
        finishAuthenticationRequest.s(identityAssertionOptionsBuild);
    }

    public final void t(String str) {
        copyOnWrite();
        FinishAuthenticationRequest finishAuthenticationRequest = ((g) this).instance;
        int i = FinishAuthenticationRequest.SIGNALS_FIELD_NUMBER;
        finishAuthenticationRequest.t(str);
    }

    public final void u(Signals signals) {
        copyOnWrite();
        FinishAuthenticationRequest finishAuthenticationRequest = ((g) this).instance;
        int i = FinishAuthenticationRequest.SIGNALS_FIELD_NUMBER;
        finishAuthenticationRequest.u(signals);
    }

    public final void v(hhc hhcVar) {
        copyOnWrite();
        FinishAuthenticationRequest finishAuthenticationRequest = ((g) this).instance;
        int i = FinishAuthenticationRequest.SIGNALS_FIELD_NUMBER;
        finishAuthenticationRequest.v(hhcVar);
    }

    public final void w(hhc hhcVar) {
        copyOnWrite();
        FinishAuthenticationRequest finishAuthenticationRequest = ((g) this).instance;
        int i = FinishAuthenticationRequest.SIGNALS_FIELD_NUMBER;
        finishAuthenticationRequest.w(hhcVar);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m390clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m392mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m389clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m393mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
