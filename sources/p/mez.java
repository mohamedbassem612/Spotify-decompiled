package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mez extends z511 implements b711 {
    public final xfx d;
    public List e = z6x.a;
    public final PublishSubject f = new PublishSubject();

    public mez(xfx xfxVar) {
        this.d = xfxVar;
    }

    public final int a(int i) {
        return g(i) == 3 ? 1 : 0;
    }

    @Override // p.z511
    public final int e() {
        return this.e.size();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.z511
    public final int g(int i) throws NoWhenBranchMatchedException {
        ni90 ni90Var = (ni90) this.e.get(i);
        if (ni90Var instanceof sh90) {
            return 1;
        }
        if (ni90Var instanceof wh90) {
            return 2;
        }
        if (ni90Var instanceof nh90) {
            return 3;
        }
        eg.o();
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.z511
    public final void n(int i, w611 w611Var) throws NoWhenBranchMatchedException {
        gm60 gm60Var = (im60) w611Var;
        if (gm60Var instanceof gm60) {
            gm60 gm60Var2 = gm60Var;
            sh90 sh90Var = (sh90) this.e.get(i);
            gm60Var2.E().n(new f0z(this, sh90Var, (byte) 7));
            gm60Var2.E().f(new u8w0(sh90Var.a.a(), sh90Var.b));
            return;
        }
        if (gm60Var instanceof hm60) {
            hm60 hm60Var = (hm60) gm60Var;
            wh90 wh90Var = (wh90) this.e.get(i);
            hm60Var.E().f(new jze1(wh90Var.b(), wh90Var.a()));
            hm60Var.E().n(new nty(this, (byte) 17));
            return;
        }
        if (!(gm60Var instanceof fm60)) {
            eg.o();
        } else {
            ((fm60) gm60Var).E().f(new nh51(((nh90) this.e.get(i)).a()));
        }
    }

    @Override // p.z511
    public final w611 p(int i, ViewGroup viewGroup) {
        xfx xfxVar = this.d;
        wfx wfxVar = xfxVar.c;
        if (i == 1) {
            return new gm60(rpo1.u(wfxVar).a((l0i) null));
        }
        if (i == 2) {
            return new hm60(fqo1.L(wfxVar).a((l0i) null));
        }
        if (i == 3) {
            return new fm60(ppo1.r(xfxVar.e).a((l0i) null));
        }
        bhn0.q();
        return null;
    }
}
