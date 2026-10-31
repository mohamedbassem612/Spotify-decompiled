package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b9e0 implements f4h1 {
    public final tck X;
    public xab1 Y;
    public final View Z;
    public final l5d0 a;
    public final tf90 b;
    public final q8n c;
    public final ViewGroup d;
    public final dzp0 e;
    public final LayoutInflater f;
    public final ArrayList g;
    public final cir0 h;
    public final y131 i;
    public final Function0 t;

    public b9e0(l5d0 l5d0Var, v9c v9cVar, tf90 tf90Var, lpp lppVar, q8n q8nVar, ViewGroup viewGroup, dzp0 dzp0Var, rzq rzqVar, Bundle bundle, LayoutInflater layoutInflater, ArrayList arrayList, cir0 cir0Var, y131 y131Var, jzu0 jzu0Var) {
        this.a = l5d0Var;
        this.b = tf90Var;
        this.c = q8nVar;
        this.d = viewGroup;
        this.e = dzp0Var;
        this.f = layoutInflater;
        this.g = arrayList;
        this.h = cir0Var;
        this.i = y131Var;
        this.t = jzu0Var;
        uap uapVar = (uap) lppVar.a.c;
        lzn0 lzn0VarD = ((zyc0) uapVar.I).d();
        c8o.l(lzn0VarD);
        fp8 fp8VarB = uapVar.b();
        d8c0 d8c0Var = (d8c0) uapVar.f.get();
        zyc0 zyc0Var = (zyc0) uapVar.I;
        q8n q8nVarB = zyc0Var.b();
        c8o.l(q8nVarB);
        q8n q8nVarC = zyc0Var.c();
        c8o.l(q8nVarC);
        tck tckVar = new tck(lzn0VarD, fp8VarB, d8c0Var, q8nVarB, q8nVarC, uapVar.i(), rzqVar);
        this.X = tckVar;
        this.Z = (View) l5d0Var.c(h5d0.g, new a9e0(this, (byte) 2));
        l5d0Var.c(h5d0.b, new a9e0(this, (byte) 0));
        if (bundle != null) {
            tckVar.j = (ksk) bundle.getParcelable("license_layout_observer_conditions");
        }
    }

    public final Object getView() {
        return this.Z;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        ksk kskVar = (ksk) this.X.j;
        if (kskVar != null) {
            bundle.putParcelable("license_layout_observer_conditions", kskVar);
        }
        return bundle;
    }

    public final void start() {
        a9e0 a9e0Var = new a9e0(this, (byte) 1);
        l5d0 l5d0Var = this.a;
        l5d0Var.c(h5d0.Z, a9e0Var);
        mr20 mr20VarI = this.h.i();
        y131 y131Var = this.i;
        String str = y131Var.b;
        Map map = y131Var.i;
        tck tckVar = this.X;
        tckVar.getClass();
        CharSequence charSequence = (CharSequence) map.get("image_url");
        tckVar.b = !(charSequence == null || charSequence.length() == 0);
        xab1 xab1Var = (xab1) tckVar.a;
        lnm lnmVar = null;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        tckVar.a = fn31.T(smo1.e((q8n) tckVar.f), (o8n) null, 0, new hff(mr20VarI, tckVar, str, (lnm) null, (byte) 17), 3);
        t45 t45Var = l5d0Var.b;
        if (t45Var != null) {
            t45Var.g("UntilLoadedState");
        }
        xab1 xab1Var2 = this.Y;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.Y = fn31.T(smo1.e(this.c), (o8n) null, 0, new q4d0(mr20VarI, this, lnmVar, (byte) 26), 3);
    }

    public final void stop() {
        xab1 xab1Var = this.Y;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.g) {
            if (obj instanceof anc0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((anc0) it.next()).q();
        }
        xab1 xab1Var2 = (xab1) this.X.a;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
    }
}
