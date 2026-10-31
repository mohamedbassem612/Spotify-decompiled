package p;

import android.view.ViewGroup;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g0h extends emc0 implements Connectable {
    public final pp e;
    public final yfx f;
    public final zfx g;
    public final mka h;
    public final cce i;
    public final PublishSubject t;

    public g0h(pp ppVar, yfx yfxVar, zfx zfxVar, mka mkaVar, cce cceVar) {
        super(kn5.f);
        this.e = ppVar;
        this.f = yfxVar;
        this.g = zfxVar;
        this.h = mkaVar;
        this.i = cceVar;
        this.t = new PublishSubject();
    }

    public final Connection L(Consumer consumer) {
        return new cn(this, this.t.subscribe(new dn(consumer, (byte) 11)), (byte) 8);
    }

    public final int g(int i) {
        return ((f1h) A(i)).a.ordinal();
    }

    public final void n(int i, w611 w611Var) {
        ozy ozyVar = (ozy) w611Var;
        f1h f1hVar = (f1h) A(i);
        qka qkaVar = new qka(1, this.t, Subject.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, (byte) 25);
        cwl1.l(ozyVar.V0, f1hVar);
        ozyVar.U0.f(ozyVar.F(f1hVar));
        ozyVar.E(f1hVar, qkaVar);
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        int iOrdinal = c1h.a[i].ordinal();
        cce cceVar = this.i;
        if (iOrdinal == 0) {
            return new o2g1(this.g.a((l0i) null), cceVar);
        }
        if (iOrdinal == 1) {
            return new ecc0(this.f.a((l0i) null), rc11.a.b(d1h.class));
        }
        if (iOrdinal == 2) {
            return new lh3(this.e.a((l0i) null), cceVar);
        }
        eg.o();
        return null;
    }
}
