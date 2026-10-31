package p;

import com.google.protobuf.Timestamp;
import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.stream_reporting_esperanto.proto.StreamHandleOuterClass$StreamHandle;
import com.spotify.stream_reporting_esperanto.proto.StreamSeekRequestOuterClass$StreamSeekRequest;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class afc1 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m170mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Timestamp timestamp) {
        copyOnWrite();
        StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest = (StreamSeekRequestOuterClass$StreamSeekRequest) ((g) this).instance;
        int i = StreamSeekRequestOuterClass$StreamSeekRequest.STREAM_HANDLE_FIELD_NUMBER;
        streamSeekRequestOuterClass$StreamSeekRequest.o(timestamp);
    }

    public final void q(long j) {
        copyOnWrite();
        StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest = (StreamSeekRequestOuterClass$StreamSeekRequest) ((g) this).instance;
        int i = StreamSeekRequestOuterClass$StreamSeekRequest.STREAM_HANDLE_FIELD_NUMBER;
        streamSeekRequestOuterClass$StreamSeekRequest.p(j);
    }

    public final void r(boolean z) {
        copyOnWrite();
        StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest = (StreamSeekRequestOuterClass$StreamSeekRequest) ((g) this).instance;
        int i = StreamSeekRequestOuterClass$StreamSeekRequest.STREAM_HANDLE_FIELD_NUMBER;
        streamSeekRequestOuterClass$StreamSeekRequest.q(z);
    }

    public final void s(StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle) {
        copyOnWrite();
        StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest = (StreamSeekRequestOuterClass$StreamSeekRequest) ((g) this).instance;
        int i = StreamSeekRequestOuterClass$StreamSeekRequest.STREAM_HANDLE_FIELD_NUMBER;
        streamSeekRequestOuterClass$StreamSeekRequest.r(streamHandleOuterClass$StreamHandle);
    }

    public final void t(long j) {
        copyOnWrite();
        StreamSeekRequestOuterClass$StreamSeekRequest streamSeekRequestOuterClass$StreamSeekRequest = (StreamSeekRequestOuterClass$StreamSeekRequest) ((g) this).instance;
        int i = StreamSeekRequestOuterClass$StreamSeekRequest.STREAM_HANDLE_FIELD_NUMBER;
        streamSeekRequestOuterClass$StreamSeekRequest.s(j);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m169clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m171mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m168clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m172mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
