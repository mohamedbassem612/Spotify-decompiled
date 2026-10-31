package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.sharedpreferencessizesampler.events.proto.SharedPreferencesFileSizeSnapshotEvent;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zt71 extends g implements v2j0 {
    public final void A(long j) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.z(j);
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
    public final /* bridge */ /* synthetic */ r8 m1041mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(int i) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i2 = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.o(i);
    }

    public final void q(long j) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.p(j);
    }

    public final void r(int i) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i2 = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.q(i);
    }

    public final void s(int i) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i2 = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.r(i);
    }

    public final void t(long j) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.s(j);
    }

    public final void u(int i) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i2 = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.t(i);
    }

    public final void v(long j) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.u(j);
    }

    public final void w(long j) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.v(j);
    }

    public final void x(long j) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.w(j);
    }

    public final void y(int i) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i2 = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.x(i);
    }

    public final void z(long j) {
        copyOnWrite();
        SharedPreferencesFileSizeSnapshotEvent sharedPreferencesFileSizeSnapshotEvent = (SharedPreferencesFileSizeSnapshotEvent) ((g) this).instance;
        int i = SharedPreferencesFileSizeSnapshotEvent.FILE_COUNT_FIELD_NUMBER;
        sharedPreferencesFileSizeSnapshotEvent.y(j);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1040clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1042mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1039clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1043mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
