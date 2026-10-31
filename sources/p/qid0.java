package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class qid0 implements jly0 {
    public static c8d0 A(l0q l0qVar) {
        return new c8d0(l0qVar, (byte) 8);
    }

    public static c8d0 B(d1q d1qVar) {
        return new c8d0(d1qVar, (byte) 7);
    }

    public static gqp a(ugb ugbVar) {
        return new gqp(ugbVar);
    }

    public static t700 b(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 12);
    }

    public static gzc0 c(ynb0 ynb0Var) {
        gzc0 gzc0Var = new gzc0((byte) 7);
        gzc0Var.b = ynb0Var;
        return gzc0Var;
    }

    public static lvd0 d(jo80 jo80Var, jly0 jly0Var, kly0 kly0Var, jly0 jly0Var2, jly0 jly0Var3, caq caqVar, jly0 jly0Var4, caq caqVar2) {
        lvd0 lvd0Var = new lvd0();
        lvd0Var.a = jo80Var;
        lvd0Var.b = jly0Var;
        lvd0Var.c = kly0Var;
        lvd0Var.d = jly0Var2;
        lvd0Var.e = jly0Var3;
        lvd0Var.f = caqVar;
        lvd0Var.g = jly0Var4;
        lvd0Var.h = caqVar2;
        return lvd0Var;
    }

    public static awd0 e(jo80 jo80Var, jly0 jly0Var, kly0 kly0Var, jly0 jly0Var2, kly0 kly0Var2, jly0 jly0Var3, caq caqVar, caq caqVar2, jly0 jly0Var4, jly0 jly0Var5) {
        awd0 awd0Var = new awd0();
        awd0Var.a = jo80Var;
        awd0Var.b = jly0Var;
        awd0Var.c = kly0Var;
        awd0Var.d = jly0Var2;
        awd0Var.e = kly0Var2;
        awd0Var.f = jly0Var3;
        awd0Var.g = caqVar;
        awd0Var.h = caqVar2;
        awd0Var.i = jly0Var4;
        awd0Var.j = jly0Var5;
        return awd0Var;
    }

    public static twd0 f(jo80 jo80Var, r7q r7qVar, caq caqVar, caq caqVar2, jo80 jo80Var2, kly0 kly0Var, kly0 kly0Var2, caq caqVar3, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, caq caqVar4, kly0 kly0Var3, caq caqVar5, thq thqVar, g5t g5tVar, r7q r7qVar5, caq caqVar6, r7q r7qVar6, kly0 kly0Var4, kly0 kly0Var5, thq thqVar2, caq caqVar7, caq caqVar8, caq caqVar9, caq caqVar10, gbp gbpVar, caq caqVar11, kly0 kly0Var6, r7q r7qVar7, caq caqVar12) {
        twd0 twd0Var = new twd0();
        twd0Var.a = jo80Var;
        twd0Var.b = r7qVar;
        twd0Var.c = caqVar;
        twd0Var.d = caqVar2;
        twd0Var.e = jo80Var2;
        twd0Var.f = kly0Var;
        twd0Var.g = kly0Var2;
        twd0Var.h = caqVar3;
        twd0Var.i = r7qVar2;
        twd0Var.j = r7qVar3;
        twd0Var.k = r7qVar4;
        twd0Var.l = caqVar4;
        twd0Var.m = kly0Var3;
        twd0Var.n = caqVar5;
        twd0Var.o = thqVar;
        twd0Var.f43p = g5tVar;
        twd0Var.q = r7qVar5;
        twd0Var.r = caqVar6;
        twd0Var.s = r7qVar6;
        twd0Var.t = kly0Var4;
        twd0Var.u = kly0Var5;
        twd0Var.v = thqVar2;
        twd0Var.w = caqVar7;
        twd0Var.x = caqVar8;
        twd0Var.y = caqVar9;
        twd0Var.z = caqVar10;
        twd0Var.A = gbpVar;
        twd0Var.B = caqVar11;
        twd0Var.C = kly0Var6;
        twd0Var.D = r7qVar7;
        twd0Var.E = caqVar12;
        return twd0Var;
    }

    public static py9 g() {
        return new py9((byte) 1);
    }

    public static py9 h() {
        return new py9((byte) 2);
    }

    public static py9 i() {
        return new py9((byte) 3);
    }

    public static v6a0 j(fad0 fad0Var, sjq0 sjq0Var) {
        return new v6a0(fad0Var, sjq0Var, (byte) 29);
    }

    public static Flowable k(o860 o860Var) {
        return Flowable.K(((Observable) o860Var.b).compose(new bk1(o860Var, (byte) 28)).toFlowable(BackpressureStrategy.d), ((FlowableMap) o860Var.c).j(new cax(o860Var, (byte) 1)));
    }

    public static FlowableMap l(Flowable flowable, ruc0 ruc0Var, hod0 hod0Var) {
        return flowable.x(new ouz(hod0Var, (byte) 29)).J(new zc80(ruc0Var, (byte) 13));
    }

    public static ufe0 m(gqp gqpVar) {
        return new ufe0((o4o0) gqpVar.a.a.get());
    }

    public static zip0 n(RetrofitMaker retrofitMaker) {
        return new zip0((xjd0) retrofitMaker.createWebgateService(xjd0.class, "android-liveroom-listening-party"));
    }

    public static Observable o(zeu0 zeu0Var) {
        return zeu0Var.a();
    }

    public static hpd0 p(byp bypVar) {
        i3b i3bVar = new i3b(bypVar, (byte) 27);
        xrk xrkVar = (xrk) bypVar.a;
        c8o.l(xrkVar);
        br21 br21VarJ = i3bVar.j();
        RetrofitMaker retrofitMaker = (RetrofitMaker) bypVar.g;
        c8o.l(retrofitMaker);
        r961 r961Var = new r961(new i2i1((kq71) retrofitMaker.createWebgateService(kq71.class, "android-share-shareables-impl"), (byte) 10), new mhc((byte) 9), new wb00((xmu0) bypVar.f, (byte) 17), (byte) 8);
        Context context = (Context) bypVar.b;
        c8o.l(context);
        q8n q8nVar = (q8n) bypVar.i;
        c8o.l(q8nVar);
        return new hpd0(xrkVar, new fs21(xrkVar, br21VarJ, new wq21(r961Var, new m021(context, q8nVar, (byte) 5))), i3bVar.j());
    }

    public static mna0 q(mka mkaVar) {
        return new mna0(mkaVar, (byte) 18);
    }

    public static mna0 r(yla ylaVar) {
        return new mna0(ylaVar, (byte) 19);
    }

    public static mna0 s(jma jmaVar) {
        return new mna0(jmaVar, (byte) 20);
    }

    public static mna0 t(ulc ulcVar) {
        return new mna0(ulcVar, (byte) 13);
    }

    public static mna0 u(eoc eocVar) {
        return new mna0(eocVar, (byte) 14);
    }

    public static mna0 v(lqc lqcVar) {
        return new mna0(lqcVar, (byte) 16);
    }

    public static mna0 w(pvc pvcVar) {
        return new mna0(pvcVar, (byte) 17);
    }

    public static c8d0 x(kzp kzpVar) {
        return new c8d0(kzpVar, (byte) 3);
    }

    public static c8d0 y(lzp lzpVar) {
        return new c8d0(lzpVar, (byte) 6);
    }

    public static c8d0 z(ozp ozpVar) {
        return new c8d0(ozpVar, (byte) 5);
    }
}
