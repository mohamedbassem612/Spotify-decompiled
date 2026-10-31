package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.messages.BetamaxTranscoderSession;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qpa extends g implements v2j0 {
    public final void A(String str) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.z(str);
    }

    public final void B(int i) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i2 = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.A(i);
    }

    public final void C(int i) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i2 = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.B(i);
    }

    public final void D(long j) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.C(j);
    }

    public final void E(String str) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.D(str);
    }

    public final void F(String str) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.E(str);
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
    public final /* bridge */ /* synthetic */ r8 m893mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(long j) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.o(j);
    }

    public final void q(long j) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.p(j);
    }

    public final void r(long j) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.q(j);
    }

    public final void s(long j) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.r(j);
    }

    public final void t(String str) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.s(str);
    }

    public final void u(String str) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.t(str);
    }

    public final void v(int i) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i2 = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.u(i);
    }

    public final void w(String str) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.v(str);
    }

    public final void x(long j) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.w(j);
    }

    public final void y(long j) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.x(j);
    }

    public final void z(long j) {
        copyOnWrite();
        BetamaxTranscoderSession betamaxTranscoderSession = (BetamaxTranscoderSession) ((g) this).instance;
        int i = BetamaxTranscoderSession.TRANSCODING_ID_FIELD_NUMBER;
        betamaxTranscoderSession.y(j);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m892clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m894mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m891clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m895mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
