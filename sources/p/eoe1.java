package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.messages.TimeMeasurementNonAuth;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eoe1 extends g implements v2j0 {
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
    public final /* bridge */ /* synthetic */ r8 m585mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Map map) {
        copyOnWrite();
        TimeMeasurementNonAuth timeMeasurementNonAuth = (TimeMeasurementNonAuth) ((g) this).instance;
        int i = TimeMeasurementNonAuth.CATEGORY_FIELD_NUMBER;
        timeMeasurementNonAuth.n().putAll(map);
    }

    public final void q(Map map) {
        copyOnWrite();
        TimeMeasurementNonAuth timeMeasurementNonAuth = (TimeMeasurementNonAuth) ((g) this).instance;
        int i = TimeMeasurementNonAuth.CATEGORY_FIELD_NUMBER;
        timeMeasurementNonAuth.o().putAll(map);
    }

    public final void r(HashMap map) {
        copyOnWrite();
        TimeMeasurementNonAuth timeMeasurementNonAuth = (TimeMeasurementNonAuth) ((g) this).instance;
        int i = TimeMeasurementNonAuth.CATEGORY_FIELD_NUMBER;
        timeMeasurementNonAuth.p().putAll(map);
    }

    public final void s(HashMap map) {
        copyOnWrite();
        TimeMeasurementNonAuth timeMeasurementNonAuth = (TimeMeasurementNonAuth) ((g) this).instance;
        int i = TimeMeasurementNonAuth.CATEGORY_FIELD_NUMBER;
        timeMeasurementNonAuth.q().putAll(map);
    }

    public final void t(HashMap map) {
        copyOnWrite();
        TimeMeasurementNonAuth timeMeasurementNonAuth = (TimeMeasurementNonAuth) ((g) this).instance;
        int i = TimeMeasurementNonAuth.CATEGORY_FIELD_NUMBER;
        timeMeasurementNonAuth.r().putAll(map);
    }

    public final void u(String str) {
        copyOnWrite();
        TimeMeasurementNonAuth timeMeasurementNonAuth = (TimeMeasurementNonAuth) ((g) this).instance;
        int i = TimeMeasurementNonAuth.CATEGORY_FIELD_NUMBER;
        timeMeasurementNonAuth.t(str);
    }

    public final void v(String str) {
        copyOnWrite();
        TimeMeasurementNonAuth timeMeasurementNonAuth = (TimeMeasurementNonAuth) ((g) this).instance;
        int i = TimeMeasurementNonAuth.CATEGORY_FIELD_NUMBER;
        timeMeasurementNonAuth.u(str);
    }

    public final void w(String str) {
        copyOnWrite();
        TimeMeasurementNonAuth timeMeasurementNonAuth = (TimeMeasurementNonAuth) ((g) this).instance;
        int i = TimeMeasurementNonAuth.CATEGORY_FIELD_NUMBER;
        timeMeasurementNonAuth.v(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m584clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m586mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m583clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m587mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
