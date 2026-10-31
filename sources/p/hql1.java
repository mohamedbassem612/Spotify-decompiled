package p;

import android.os.Bundle;
import com.spotify.widgets.npvwidget.WidgetsProxyActivity;
import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hql1 implements kir0, lrm1, np5 {
    public Object a;

    public hql1(byte b) {
        switch (b) {
            case 6:
                System.currentTimeMillis();
                qxg1 qxg1Var = new qxg1((byte) 1);
                ulo1.v(!qxg1Var.b, "This stopwatch is already running.");
                qxg1Var.b = true;
                qxg1Var.d = System.nanoTime();
                this.a = qxg1Var;
                break;
            default:
                this.a = b380.m();
                break;
        }
    }

    @Override // p.kir0
    public Observable a() {
        return ((WidgetsProxyActivity) this.a).g1;
    }

    public void b(long j, String str, String str2, Bundle bundle) {
        if (str == null || dtn1.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        ((oql) ((owf1) this.a).b).l(bundle2);
    }

    public void c() {
        e321 e321Var = (e321) this.a;
        Iterator it = e321Var.g.iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
        for (oxo1 oxo1Var : e321Var.h) {
            switch (oxo1Var.a) {
                case 2:
                    ((a8p1) oxo1Var.b).c();
                    break;
            }
        }
    }

    public void d(int i, String str) {
        mxa1 mxa1Var = (mxa1) this.a;
        i8h1 i8h1Var = (i8h1) mxa1Var.b;
        y4m0 y4m0Var = (y4m0) mxa1Var.e;
        y4m0Var.getClass();
        x6h1 x6h1VarC = y4m0Var.a.c();
        x6h1VarC.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("option", str, numValueOf, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void e(int i, String str) {
        mxa1 mxa1Var = (mxa1) this.a;
        i8h1 i8h1Var = (i8h1) mxa1Var.b;
        y4m0 y4m0Var = (y4m0) mxa1Var.e;
        y4m0Var.getClass();
        x6h1 x6h1VarC = y4m0Var.a.c();
        x6h1VarC.i.add(new a7h1("list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("option", str, numValueOf, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        k7h1 k7h1Var = new k7h1();
        k7h1Var.a = y6h1VarA2;
        k7h1Var.b = r6h1.c;
        k7h1Var.c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }
}
