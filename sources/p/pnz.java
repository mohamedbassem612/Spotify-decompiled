package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pnz extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m357mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        copyOnWrite();
        EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest = (EsGetStateRequest$GetStateRequest) ((g) this).instance;
        int i = EsGetStateRequest$GetStateRequest.PREV_TRACKS_CAP_FIELD_NUMBER;
        esGetStateRequest$GetStateRequest.p(esOptional$OptionalInt64);
    }

    public final void q(qpz qpzVar) {
        copyOnWrite();
        EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest = (EsGetStateRequest$GetStateRequest) ((g) this).instance;
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = (EsOptional$OptionalInt64) qpzVar.build();
        int i = EsGetStateRequest$GetStateRequest.PREV_TRACKS_CAP_FIELD_NUMBER;
        esGetStateRequest$GetStateRequest.p(esOptional$OptionalInt64);
    }

    public final void r(EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        copyOnWrite();
        EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest = (EsGetStateRequest$GetStateRequest) ((g) this).instance;
        int i = EsGetStateRequest$GetStateRequest.PREV_TRACKS_CAP_FIELD_NUMBER;
        esGetStateRequest$GetStateRequest.q(esOptional$OptionalInt64);
    }

    public final void s(qpz qpzVar) {
        copyOnWrite();
        EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest = (EsGetStateRequest$GetStateRequest) ((g) this).instance;
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = (EsOptional$OptionalInt64) qpzVar.build();
        int i = EsGetStateRequest$GetStateRequest.PREV_TRACKS_CAP_FIELD_NUMBER;
        esGetStateRequest$GetStateRequest.q(esOptional$OptionalInt64);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m356clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m358mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m355clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m359mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
