package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h23 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public h23(AtomicReference atomicReference, vi11 vi11Var, String str, u2l1 u2l1Var) {
        this.a = (byte) 2;
        this.b = atomicReference;
        this.d = vi11Var;
        this.c = str;
        this.e = u2l1Var;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                return ((j23) obj3).g(((e23) obj).j, (String) obj2, (String) obj4);
            case 1:
                g510 g510Var = (g510) obj2;
                ou80 ou80Var = (ou80) obj3;
                if (ou80Var == null) {
                    ou80Var = g510Var.d.m((w7h1) obj4, (xj61) null).a;
                }
                ou80 ou80Var2 = ou80Var;
                m210 m210Var = (m210) obj;
                w7h1 w7h1Var = (w7h1) obj4;
                String str = ou80Var2.a;
                String strP = g510Var.p();
                a48 a48Var = g510Var.e.j;
                g510Var.a.a(g510Var.a(m210Var, w7h1Var, str, strP, a48Var != null ? a48Var.b() : null));
                return Single.just(ou80Var2);
            default:
                AtomicReference atomicReference = (AtomicReference) obj3;
                flb1 flb1Var = (flb1) atomicReference.get();
                if (flb1Var != null) {
                    return Observable.just(new f5e0(flb1Var));
                }
                vi11 vi11Var = (vi11) obj4;
                String str2 = (String) obj2;
                u2l1 u2l1Var = (u2l1) obj;
                return ((Single) ((hcf1) vi11Var.b).invoke(str2)).doOnSubscribe(new rdj1(str2, vi11Var)).doOnError(new f93(str2, vi11Var)).doOnSuccess(new jkt0(str2, vi11Var)).flatMap(new zrj1(u2l1Var.c, u2l1Var.d, vi11Var, (byte) 10)).doOnSuccess(new jkt0(vi11Var, (byte) 17)).toObservable().doOnNext(new vlk1(atomicReference, (byte) 3)).map(r3x0.Y0).startWithItem(h5e0.a).onErrorReturn(u3x0.Y0);
        }
    }

    public /* synthetic */ h23(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
