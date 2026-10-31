package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.offline_esperanto.proto.EsOffline;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class epz extends g implements v2j0 {
    public epz() {
        super(EsOffline.Progress.n());
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
    public final /* bridge */ /* synthetic */ r8 m595mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(long j) {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.D(j);
    }

    public final void q(long j) {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.E(j);
    }

    public final void r(long j) {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.F(j);
    }

    public final void s() {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.G();
    }

    public final void t(float f) {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.H(f);
    }

    public final void u(long j) {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.I(j);
    }

    public final void v(long j) {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.J(j);
    }

    public final void w(long j) {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.K(j);
    }

    public final void x(long j) {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.L(j);
    }

    public final void y(long j) {
        copyOnWrite();
        EsOffline.Progress progress = ((g) this).instance;
        int i = EsOffline.Progress.QUEUED_TRACKS_FIELD_NUMBER;
        progress.M(j);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m594clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m596mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m593clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m597mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
