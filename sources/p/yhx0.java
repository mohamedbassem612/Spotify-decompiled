package p;

import com.google.protobuf.Duration;
import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import spotify.progress_playback_esperanto.proto.ProgressPlaybackEsperanto$OnUpdateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yhx0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m1485mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Duration duration) {
        copyOnWrite();
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = (ProgressPlaybackEsperanto$OnUpdateRequest) ((g) this).instance;
        int i = ProgressPlaybackEsperanto$OnUpdateRequest.ITEM_URI_FIELD_NUMBER;
        progressPlaybackEsperanto$OnUpdateRequest.o(duration);
    }

    public final void q(String str) {
        copyOnWrite();
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = (ProgressPlaybackEsperanto$OnUpdateRequest) ((g) this).instance;
        int i = ProgressPlaybackEsperanto$OnUpdateRequest.ITEM_URI_FIELD_NUMBER;
        progressPlaybackEsperanto$OnUpdateRequest.p(str);
    }

    public final void r(String str) {
        copyOnWrite();
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = (ProgressPlaybackEsperanto$OnUpdateRequest) ((g) this).instance;
        int i = ProgressPlaybackEsperanto$OnUpdateRequest.ITEM_URI_FIELD_NUMBER;
        progressPlaybackEsperanto$OnUpdateRequest.q(str);
    }

    public final void s(boolean z) {
        copyOnWrite();
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = (ProgressPlaybackEsperanto$OnUpdateRequest) ((g) this).instance;
        int i = ProgressPlaybackEsperanto$OnUpdateRequest.ITEM_URI_FIELD_NUMBER;
        progressPlaybackEsperanto$OnUpdateRequest.r(z);
    }

    public final void t(Duration duration) {
        copyOnWrite();
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = (ProgressPlaybackEsperanto$OnUpdateRequest) ((g) this).instance;
        int i = ProgressPlaybackEsperanto$OnUpdateRequest.ITEM_URI_FIELD_NUMBER;
        progressPlaybackEsperanto$OnUpdateRequest.s(duration);
    }

    public final void u(ifv ifvVar) {
        copyOnWrite();
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = (ProgressPlaybackEsperanto$OnUpdateRequest) ((g) this).instance;
        Duration duration = (Duration) ifvVar.build();
        int i = ProgressPlaybackEsperanto$OnUpdateRequest.ITEM_URI_FIELD_NUMBER;
        progressPlaybackEsperanto$OnUpdateRequest.s(duration);
    }

    public final void v(zhx0 zhx0Var) {
        copyOnWrite();
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = (ProgressPlaybackEsperanto$OnUpdateRequest) ((g) this).instance;
        int i = ProgressPlaybackEsperanto$OnUpdateRequest.ITEM_URI_FIELD_NUMBER;
        progressPlaybackEsperanto$OnUpdateRequest.t(zhx0Var);
    }

    public final void w(String str) {
        copyOnWrite();
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = (ProgressPlaybackEsperanto$OnUpdateRequest) ((g) this).instance;
        int i = ProgressPlaybackEsperanto$OnUpdateRequest.ITEM_URI_FIELD_NUMBER;
        progressPlaybackEsperanto$OnUpdateRequest.u(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1484clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1486mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1483clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1487mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
