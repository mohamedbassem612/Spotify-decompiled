package p;

import com.spotify.app.music.scaffolds.events.proto.SavedStateSizeTelemetry;
import java.io.InputStream;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class se41 extends com.google.protobuf.g implements v2j0 {
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
        return super.internalMergeFrom((com.google.protobuf.h) s8Var);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m376mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(LinkedHashMap linkedHashMap) {
        copyOnWrite();
        SavedStateSizeTelemetry savedStateSizeTelemetry = (SavedStateSizeTelemetry) ((com.google.protobuf.g) this).instance;
        int i = SavedStateSizeTelemetry.TOTAL_SIZE_BYTES_FIELD_NUMBER;
        savedStateSizeTelemetry.n().putAll(linkedHashMap);
    }

    public final void q(LinkedHashMap linkedHashMap) {
        copyOnWrite();
        SavedStateSizeTelemetry savedStateSizeTelemetry = (SavedStateSizeTelemetry) ((com.google.protobuf.g) this).instance;
        int i = SavedStateSizeTelemetry.TOTAL_SIZE_BYTES_FIELD_NUMBER;
        savedStateSizeTelemetry.o().putAll(linkedHashMap);
    }

    public final void r(String str) {
        copyOnWrite();
        SavedStateSizeTelemetry savedStateSizeTelemetry = (SavedStateSizeTelemetry) ((com.google.protobuf.g) this).instance;
        int i = SavedStateSizeTelemetry.TOTAL_SIZE_BYTES_FIELD_NUMBER;
        savedStateSizeTelemetry.q(str);
    }

    public final void s(String str) {
        copyOnWrite();
        SavedStateSizeTelemetry savedStateSizeTelemetry = (SavedStateSizeTelemetry) ((com.google.protobuf.g) this).instance;
        int i = SavedStateSizeTelemetry.TOTAL_SIZE_BYTES_FIELD_NUMBER;
        savedStateSizeTelemetry.r(str);
    }

    public final void t(long j) {
        copyOnWrite();
        SavedStateSizeTelemetry savedStateSizeTelemetry = (SavedStateSizeTelemetry) ((com.google.protobuf.g) this).instance;
        int i = SavedStateSizeTelemetry.TOTAL_SIZE_BYTES_FIELD_NUMBER;
        savedStateSizeTelemetry.s(j);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m375clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m377mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m374clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m378mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
