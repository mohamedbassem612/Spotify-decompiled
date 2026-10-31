package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yh30 implements o5s {
    public final /* synthetic */ zh30 a;
    public final /* synthetic */ ots b;

    public yh30(zh30 zh30Var, ots otsVar) {
        this.a = zh30Var;
        this.b = otsVar;
    }

    @Override // p.o5s
    public final void onCreate(iac0 iac0Var) {
        zh30 zh30Var = this.a;
        dn81 dn81Var = zh30Var.d;
        lmw lmwVar = zh30Var.i;
        zh30Var.h = w8c0.c;
        nt21 nt21Var = zh30Var.X;
        nt21Var.j().c("android:support:spotify:fragments", new uk(zh30Var, (byte) 5));
        nt21Var.n(zh30Var.b.p().a("FragmentManagerController.state"));
        Bundle bundleA = nt21Var.j().a("android:support:spotify:fragments");
        if (bundleA != null) {
            lmwVar.y(bundleA.getParcelable("android:support:spotify:fragments"));
            ai30 ai30VarT = lmwVar.t();
            List listU = ai30VarT.c.u();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listU) {
                Bundle bundle = ((zf30) obj).f;
                if (bundle != null && bundle.getBoolean("NO_STATE_SAVE", false)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                nu9 nu9Var = new nu9(ai30VarT);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    nu9Var.m((zf30) it.next());
                }
                nu9Var.h();
            }
        }
        zh30Var.t.g(k8c0.ON_CREATE);
        this.b.invoke();
        if (dn81Var.i(new y0u(zh30Var, (byte) 26))) {
            return;
        }
        zh30Var.Q0 = dn81Var.g(new f710(zh30Var, (byte) 16));
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        zh30 zh30Var = this.a;
        vr51 vr51Var = zh30Var.Q0;
        if (vr51Var != null) {
            vr51Var.c();
        }
        zh30Var.Q0 = null;
        zh30Var.h = w8c0.a;
        zh30Var.a();
    }

    @Override // p.o5s
    public final void onPause(iac0 iac0Var) {
        this.a.b(k8c0.ON_PAUSE);
    }

    @Override // p.o5s
    public final void onResume(iac0 iac0Var) {
        this.a.b(k8c0.ON_RESUME);
    }

    @Override // p.o5s
    public final void onStart(iac0 iac0Var) {
        this.a.b(k8c0.ON_START);
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        this.a.b(k8c0.ON_STOP);
    }
}
