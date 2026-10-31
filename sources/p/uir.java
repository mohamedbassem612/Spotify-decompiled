package p;

import android.os.Build;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uir implements hi9 {
    public final ynb0 a;
    public final ni9 b;
    public final gjb c;
    public final xir d;
    public final idd1 e = new idd1(new z5o(this, (byte) 22));
    public final rku f = new rku();

    public uir(ynb0 ynb0Var, ni9 ni9Var, gjb gjbVar, xir xirVar) {
        this.a = ynb0Var;
        this.b = ni9Var;
        this.c = gjbVar;
        this.d = xirVar;
        Set set = gjbVar.g;
        if (set.contains("social_radar")) {
            n57.e("Identifier social_radar was already enabled!");
        } else {
            set.add("social_radar");
        }
    }

    public final void start() {
        int i = Build.VERSION.SDK_INT;
        ni9 ni9Var = this.b;
        if (i < 31) {
            ni9Var.getClass();
            return;
        }
        if (ni9Var.c.isEnabled()) {
            wir wirVar = (wir) ((bk9) this.e.getValue());
            Observable observableNever = Observable.never();
            vir virVar = new vir(wirVar);
            gjb gjbVar = wirVar.c;
            this.f.b(observableNever.compose(RxMobius.b(Mobius.d(virVar, RxConnectables.a(gj9.a(gjbVar, wirVar.g, wirVar.f, wirVar.i, wirVar.j))).h(v1p1.o(wirVar.a.a(), wirVar.b, gjbVar, wirVar.d, wirVar.e)).f(wirVar.h), new dk9(false, false, false, w7x.a, b7x.a, wirVar.l.isEnabled()))).subscribe());
        }
    }

    public final void stop() {
        this.f.a();
        this.c.a();
        w7x w7xVar = w7x.a;
        xir xirVar = this.d;
        xirVar.b.onNext(w7xVar);
        xirVar.c.onNext(Boolean.FALSE);
    }
}
