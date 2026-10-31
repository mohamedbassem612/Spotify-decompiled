package p;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.spotify.messages.ConfigurationFetched;
import java.io.InputStream;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ktk extends g implements v2j0 {
    public final void A() {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.z();
    }

    public final void B() {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.A();
    }

    public final void C() {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.B();
    }

    public final void D(String str) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.C(str);
    }

    public final void E(int i) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i2 = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.D(i);
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
    public final /* bridge */ /* synthetic */ r8 m251mergeFrom(lwg lwgVar, uz00 uz00Var) {
        return super.mergeFrom(lwgVar, uz00Var);
    }

    public final void n(TreeMap treeMap) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.n().putAll(treeMap);
    }

    public final void q(String str) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.p(str);
    }

    public final void r(String str) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.q(str);
    }

    public final void s(String str) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.r(str);
    }

    public final void t(String str) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.s(str);
    }

    public final void u(String str) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.t(str);
    }

    public final void v(String str) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.u(str);
    }

    public final void w(long j) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.v(j);
    }

    public final void x(long j) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.w(j);
    }

    public final void y(long j) {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.x(j);
    }

    public final void z() {
        copyOnWrite();
        ConfigurationFetched configurationFetched = (ConfigurationFetched) ((g) this).instance;
        int i = ConfigurationFetched.LAST_RCS_FETCH_TIME_FIELD_NUMBER;
        configurationFetched.y();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m250clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m252mergeFrom(byte[] bArr, int i, int i2) {
        return super.mergeFrom(bArr, i, i2);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r2j0 m249clone() {
        return super.clone();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ r8 m253mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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
