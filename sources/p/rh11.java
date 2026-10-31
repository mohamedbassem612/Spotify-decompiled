package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rh11 {
    public final kly0 a;
    public final o241 b;

    public rh11(caq caqVar, o241 o241Var) {
        this.a = caqVar;
        this.b = o241Var;
    }

    public static boolean c(Map map) {
        return !y7y0.L(map) && yto.j((String) map.get("pick-and-shuffle"));
    }

    public final boolean a() {
        return ((e05) this.a.get()).a();
    }

    public final ezc b() {
        return yoi1.g(this.b.a.map(new khc(this, (byte) 22)).onErrorReturnItem(Boolean.FALSE));
    }

    public final Observable d() {
        return this.b.a.map(new lhc(this, (byte) 22)).onErrorReturnItem(Boolean.FALSE);
    }

    public final boolean e() {
        return ((e05) this.a.get()).c();
    }
}
