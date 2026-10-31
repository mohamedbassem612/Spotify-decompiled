package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.messages.MetricMeasurement;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class upj0 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m1048mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(ConcurrentHashMap concurrentHashMap) {
        copyOnWrite();
        MetricMeasurement metricMeasurement = (MetricMeasurement) ((g) this).instance;
        int i = MetricMeasurement.MEASUREMENT_ID_FIELD_NUMBER;
        metricMeasurement.n().putAll(concurrentHashMap);
    }

    public final void q(ConcurrentHashMap concurrentHashMap) {
        copyOnWrite();
        MetricMeasurement metricMeasurement = (MetricMeasurement) ((g) this).instance;
        int i = MetricMeasurement.MEASUREMENT_ID_FIELD_NUMBER;
        metricMeasurement.o().putAll(concurrentHashMap);
    }

    public final void r(Map map) {
        copyOnWrite();
        MetricMeasurement metricMeasurement = (MetricMeasurement) ((g) this).instance;
        int i = MetricMeasurement.MEASUREMENT_ID_FIELD_NUMBER;
        metricMeasurement.p().putAll(map);
    }

    public final void s() {
        copyOnWrite();
        MetricMeasurement metricMeasurement = (MetricMeasurement) ((g) this).instance;
        int i = MetricMeasurement.MEASUREMENT_ID_FIELD_NUMBER;
        metricMeasurement.r();
    }

    public final void t() {
        copyOnWrite();
        MetricMeasurement metricMeasurement = (MetricMeasurement) ((g) this).instance;
        int i = MetricMeasurement.MEASUREMENT_ID_FIELD_NUMBER;
        metricMeasurement.s();
    }

    public final void u(String str) {
        copyOnWrite();
        MetricMeasurement metricMeasurement = (MetricMeasurement) ((g) this).instance;
        int i = MetricMeasurement.MEASUREMENT_ID_FIELD_NUMBER;
        metricMeasurement.t(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1047clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1049mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1046clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1050mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
