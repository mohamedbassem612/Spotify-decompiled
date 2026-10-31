package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.messages.OopsMetricEvent;
import java.io.InputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class viq0 extends g implements v2j0 {
    public final void A(long j) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.z(j);
    }

    public final void B(long j) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.A(j);
    }

    public final void C(phc phcVar) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.B(phcVar);
    }

    public final void D(String str) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.C(str);
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
    public final /* bridge */ /* synthetic */ r8 m1073mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(double d) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.o(d);
    }

    public final void q(String str) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.p(str);
    }

    public final void r(String str) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.q(str);
    }

    public final void s(long j) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.r(j);
    }

    public final void t(String str) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.s(str);
    }

    public final void u(phc phcVar) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.t(phcVar);
    }

    public final void v(String str) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.u(str);
    }

    public final void w(String str) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.v(str);
    }

    public final void x(String str) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.w(str);
    }

    public final void y(String str) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.x(str);
    }

    public final void z(long j) {
        copyOnWrite();
        OopsMetricEvent oopsMetricEvent = (OopsMetricEvent) ((g) this).instance;
        int i = OopsMetricEvent.METRIC_ID_FIELD_NUMBER;
        oopsMetricEvent.y(j);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1072clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1074mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1071clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1075mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
