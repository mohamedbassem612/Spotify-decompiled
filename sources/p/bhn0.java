package p;

import io.reactivex.rxjava3.functions.BiFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class bhn0 implements k2t, BiFunction, zqu, ihg1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ bhn0(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void A(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void B(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void d() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(Object obj, StringBuilder sb) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void j(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void o(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void p(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void q() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void r(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void t(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void w() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void x(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void z(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    @Override // p.ihg1
    public void a(ghg1 ghg1Var, jhg1 jhg1Var, boolean z) {
        ghg1Var.e(jhg1Var);
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 12:
                Map map = (Map) obj;
                spq0 spq0Var = (spq0) obj2;
                if (!spq0Var.c()) {
                    return gg11.g;
                }
                HashMap map2 = new HashMap(mno1.k(((Map) spq0Var.b()).size() + map.size()));
                map2.putAll(map);
                map2.putAll((Map) spq0Var.b());
                return j380.c(map2);
            default:
                return new nmr0((th61) obj, (Boolean) obj2);
        }
    }

    @Override // p.k2t
    public void b(lly0 lly0Var) {
    }

    @Override // p.zqu
    public double c(double d) {
        return d;
    }
}
