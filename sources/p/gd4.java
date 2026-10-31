package p;

import android.os.Build;
import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.music.instrumentation.events.proto.AndroidDeviceReport;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gd4 extends g implements v2j0 {
    public final void A(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.z(j);
    }

    public final void B(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.A(j);
    }

    public final void C(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.B(j);
    }

    public final void D(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.C(j);
    }

    public final void E(float f) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.D(f);
    }

    public final void F(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.E(j);
    }

    public final void G(String str) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.F(str);
    }

    public final void H(String str) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.G(str);
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
    public final /* bridge */ /* synthetic */ r8 m171mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n() {
        String str = Build.BRAND;
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.o();
    }

    public final void q(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.p(j);
    }

    public final void r(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.q(j);
    }

    public final void s(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.r(j);
    }

    public final void t() {
        String str = Build.DISPLAY;
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.s();
    }

    public final void u(String str) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.t(str);
    }

    public final void v(String str) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.u(str);
    }

    public final void w() {
        String str = Build.MANUFACTURER;
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.v();
    }

    public final void x(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.w(j);
    }

    public final void y(long j) {
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.x(j);
    }

    public final void z() {
        String str = Build.MODEL;
        copyOnWrite();
        AndroidDeviceReport androidDeviceReport = (AndroidDeviceReport) ((g) this).instance;
        int i = AndroidDeviceReport.MANUFACTURER_FIELD_NUMBER;
        androidDeviceReport.y();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m170clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m172mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m169clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m173mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
