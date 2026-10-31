package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.download.esperanto.proto.EsDownload$RequestSegmentDataParams;
import com.spotify.download.esperanto.proto.EsDownload$SegmentFileStreamerId;
import com.spotify.download.esperanto.proto.EsDownload$SegmentRequestMetadata;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jnz extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m829mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(ArrayList arrayList) {
        copyOnWrite();
        EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams = (EsDownload$RequestSegmentDataParams) ((g) this).instance;
        int i = EsDownload$RequestSegmentDataParams.SEGMENT_FILE_STREAMER_FIELD_NUMBER;
        esDownload$RequestSegmentDataParams.n(arrayList);
    }

    public final void q(long j) {
        copyOnWrite();
        EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams = (EsDownload$RequestSegmentDataParams) ((g) this).instance;
        int i = EsDownload$RequestSegmentDataParams.SEGMENT_FILE_STREAMER_FIELD_NUMBER;
        esDownload$RequestSegmentDataParams.p(j);
    }

    public final void r(EsDownload$SegmentRequestMetadata esDownload$SegmentRequestMetadata) {
        copyOnWrite();
        EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams = (EsDownload$RequestSegmentDataParams) ((g) this).instance;
        int i = EsDownload$RequestSegmentDataParams.SEGMENT_FILE_STREAMER_FIELD_NUMBER;
        esDownload$RequestSegmentDataParams.q(esDownload$SegmentRequestMetadata);
    }

    public final void s(EsDownload$SegmentFileStreamerId esDownload$SegmentFileStreamerId) {
        copyOnWrite();
        EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams = (EsDownload$RequestSegmentDataParams) ((g) this).instance;
        int i = EsDownload$RequestSegmentDataParams.SEGMENT_FILE_STREAMER_FIELD_NUMBER;
        esDownload$RequestSegmentDataParams.r(esDownload$SegmentFileStreamerId);
    }

    public final void t(long j) {
        copyOnWrite();
        EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams = (EsDownload$RequestSegmentDataParams) ((g) this).instance;
        int i = EsDownload$RequestSegmentDataParams.SEGMENT_FILE_STREAMER_FIELD_NUMBER;
        esDownload$RequestSegmentDataParams.s(j);
    }

    public final void u(String str) {
        copyOnWrite();
        EsDownload$RequestSegmentDataParams esDownload$RequestSegmentDataParams = (EsDownload$RequestSegmentDataParams) ((g) this).instance;
        int i = EsDownload$RequestSegmentDataParams.SEGMENT_FILE_STREAMER_FIELD_NUMBER;
        esDownload$RequestSegmentDataParams.t(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m828clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m830mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m827clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m831mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
