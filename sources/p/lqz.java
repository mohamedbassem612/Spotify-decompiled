package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lqz extends g implements v2j0 {
    public final void A(String str) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.B(str);
    }

    public final void B(String str) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.C(str);
    }

    public final void C(EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.D(esSkipToTrack$SkipToTrack);
    }

    public final void D(wrz wrzVar) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        EsSkipToTrack$SkipToTrack esSkipToTrack$SkipToTrack = (EsSkipToTrack$SkipToTrack) wrzVar.build();
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.D(esSkipToTrack$SkipToTrack);
    }

    public final void E(boolean z) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.E(z);
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
    public final /* bridge */ /* synthetic */ r8 m1370mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Iterable iterable) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.n(iterable);
    }

    public final void q() {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.o();
    }

    public final void r(j380 j380Var) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.r().putAll(j380Var);
    }

    public final void s(boolean z) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.t(z);
    }

    public final void t(kqz kqzVar) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.u(kqzVar);
    }

    public final void u(boolean z) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.v(z);
    }

    public final void v(String str) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.w(str);
    }

    public final void w(hhc hhcVar) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.x(hhcVar);
    }

    public final void x(EsContextPlayerOptions$ContextPlayerOptionOverrides esContextPlayerOptions$ContextPlayerOptionOverrides) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.y(esContextPlayerOptions$ContextPlayerOptionOverrides);
    }

    public final void y(nqz nqzVar) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.z(nqzVar);
    }

    public final void z(EsOptional.OptionalInt64 optionalInt64) {
        copyOnWrite();
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions = (EsPreparePlayOptions$PreparePlayOptions) ((g) this).instance;
        int i = EsPreparePlayOptions$PreparePlayOptions.PLAYBACK_ID_FIELD_NUMBER;
        esPreparePlayOptions$PreparePlayOptions.A(optionalInt64);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1369clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1371mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1368clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1372mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
