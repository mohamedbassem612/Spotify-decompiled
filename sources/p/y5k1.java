package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.share.formats.common.clippingdialog.events.proto.VideoTranscodingResult;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y5k1 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m924mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(String str) {
        copyOnWrite();
        VideoTranscodingResult videoTranscodingResult = (VideoTranscodingResult) ((g) this).instance;
        int i = VideoTranscodingResult.ENTITY_URI_FIELD_NUMBER;
        videoTranscodingResult.o(str);
    }

    public final void q(String str) {
        copyOnWrite();
        VideoTranscodingResult videoTranscodingResult = (VideoTranscodingResult) ((g) this).instance;
        int i = VideoTranscodingResult.ENTITY_URI_FIELD_NUMBER;
        videoTranscodingResult.p(str);
    }

    public final void r(boolean z) {
        copyOnWrite();
        VideoTranscodingResult videoTranscodingResult = (VideoTranscodingResult) ((g) this).instance;
        int i = VideoTranscodingResult.ENTITY_URI_FIELD_NUMBER;
        videoTranscodingResult.q(z);
    }

    public final void s(int i) {
        copyOnWrite();
        VideoTranscodingResult videoTranscodingResult = (VideoTranscodingResult) ((g) this).instance;
        int i2 = VideoTranscodingResult.ENTITY_URI_FIELD_NUMBER;
        videoTranscodingResult.r(i);
    }

    public final void t(int i) {
        copyOnWrite();
        VideoTranscodingResult videoTranscodingResult = (VideoTranscodingResult) ((g) this).instance;
        int i2 = VideoTranscodingResult.ENTITY_URI_FIELD_NUMBER;
        videoTranscodingResult.s(i);
    }

    public final void u(String str) {
        copyOnWrite();
        VideoTranscodingResult videoTranscodingResult = (VideoTranscodingResult) ((g) this).instance;
        int i = VideoTranscodingResult.ENTITY_URI_FIELD_NUMBER;
        videoTranscodingResult.t(str);
    }

    public final void v(int i) {
        copyOnWrite();
        VideoTranscodingResult videoTranscodingResult = (VideoTranscodingResult) ((g) this).instance;
        int i2 = VideoTranscodingResult.ENTITY_URI_FIELD_NUMBER;
        videoTranscodingResult.u(i);
    }

    public final void w(String str) {
        copyOnWrite();
        VideoTranscodingResult videoTranscodingResult = (VideoTranscodingResult) ((g) this).instance;
        int i = VideoTranscodingResult.ENTITY_URI_FIELD_NUMBER;
        videoTranscodingResult.v(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m923clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m925mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m922clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m926mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
