package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.messages.TimeMeasurementErrorNonAuth;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vne1 extends g implements v2j0 {
    public final void A(String str) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.z(str);
    }

    public final void B(String str) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.A(str);
    }

    public final void C(String str) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.B(str);
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
    public final /* bridge */ /* synthetic */ r8 m1088mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(Map map) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.n().putAll(map);
    }

    public final void q(Map map) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.o().putAll(map);
    }

    public final void r(Map map) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.p().putAll(map);
    }

    public final void s(HashMap map) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.q().putAll(map);
    }

    public final void t(HashMap map) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.r().putAll(map);
    }

    public final void u(HashMap map) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.s().putAll(map);
    }

    public final void v(HashMap map) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.t().putAll(map);
    }

    public final void w(HashMap map) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.u().putAll(map);
    }

    public final void x(String str) {
        str.getClass();
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.o().put("event_sender_error", str);
    }

    public final void y(String str) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.x(str);
    }

    public final void z(int i) {
        copyOnWrite();
        TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuth = (TimeMeasurementErrorNonAuth) ((g) this).instance;
        int i2 = TimeMeasurementErrorNonAuth.ERROR_CODE_FIELD_NUMBER;
        timeMeasurementErrorNonAuth.y(i);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1087clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1089mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m1086clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m1090mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
