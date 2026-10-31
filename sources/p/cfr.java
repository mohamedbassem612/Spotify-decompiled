package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Completable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cfr {
    public final Activity a;
    public final kp5 b;
    public final kt91 c;
    public final p981 d;
    public final dto0 e;

    public cfr(Activity activity, kp5 kp5Var, kt91 kt91Var, p981 p981Var, dto0 dto0Var) {
        this.a = activity;
        this.b = kp5Var;
        this.c = kt91Var;
        this.d = p981Var;
        this.e = dto0Var;
    }

    public static Completable b(cfr cfrVar, List list, String str, List list2, List list3, String str2) {
        cfrVar.getClass();
        if (!list.isEmpty()) {
            Set set = s4b1.f;
            if (uic.x((String) o7h.q0(list)).c == blc0.fh) {
                return cfrVar.d.b((String) o7h.q0(list)).onErrorReturnItem(pa81.a).flatMapCompletable(new p2o0(cfrVar, list2, list, str, list3, str2, (byte) 25));
            }
        }
        return cfrVar.a(list, str, list2, list3, str2);
    }

    public final Completable a(List list, String str, List list2, List list3, String str2) {
        e2x0 e2x0Var = e2x0.P0;
        Set set = s4b1.f;
        boolean zIsEmpty = list.isEmpty();
        kp5 kp5Var = this.b;
        if (zIsEmpty) {
            n57.e("No item URIs passed, nothing added or removed?");
            return kp5.A(kp5Var, e2x0Var);
        }
        List list4 = list2;
        ArrayList arrayListN0 = o7h.N0(list3, list4);
        if (arrayListN0.isEmpty()) {
            n57.e("No added-to or removed-from URIs passed");
            return kp5.A(kp5Var, e2x0Var);
        }
        boolean zH = uic.h((String) o7h.q0(list), new blc0[]{blc0.ti, blc0.Pg, blc0.ed, blc0.M3, blc0.C8});
        boolean z = uic.x((String) o7h.q0(list)).c == blc0.de;
        boolean z2 = uic.x((String) o7h.q0(list)).c == blc0.U4;
        boolean z3 = uic.x((String) o7h.q0(list)).c == blc0.ij;
        if (arrayListN0.size() != 1) {
            return kp5.A(kp5Var, e2x0Var);
        }
        if (!list4.isEmpty() && zH) {
            return kp5.A(kp5Var, new is91((String) o7h.q0(list2), new gs91(str, list, str2)));
        }
        if (list4.isEmpty() || zH) {
            if (!list3.isEmpty()) {
                return kp5.A(kp5Var, new os91((String) (z ? o7h.q0(list) : o7h.q0(list3))));
            }
            n57.e("Fallback, how did you get here?");
            return kp5.A(kp5Var, e2x0Var);
        }
        if (z) {
            return kp5.A(kp5Var, new ns91((String) o7h.q0(list)));
        }
        if (z2) {
            return kp5.A(kp5Var, new ls91((String) o7h.q0(list2)));
        }
        return z3 ? kp5.A(kp5Var, new ps91((String) o7h.q0(list2))) : kp5.A(kp5Var, new hs91((String) o7h.q0(list2)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        bfr bfrVar;
        if (onmVar instanceof bfr) {
            bfrVar = (bfr) onmVar;
            int i = bfrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bfrVar.c = i - Integer.MIN_VALUE;
            } else {
                bfrVar = new bfr(this, onmVar);
            }
        } else {
            bfrVar = new bfr(this, onmVar);
        }
        Object objO = bfrVar.a;
        int i2 = bfrVar.c;
        if (i2 == 0) {
            hm5.M(objO);
            n1o n1oVar = new n1o(this, (lnm) null, (byte) 5);
            bfrVar.c = 1;
            objO = rc2.O(2000L, n1oVar, bfrVar);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        Boolean bool = (Boolean) objO;
        return yah0.m(bool != null ? bool.booleanValue() : false);
    }
}
