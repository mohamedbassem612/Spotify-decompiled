package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ko71 {
    public final uu00 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(List list, onm onmVar) {
        jo71 jo71Var;
        if (onmVar instanceof jo71) {
            jo71Var = (jo71) onmVar;
            int i = jo71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jo71Var.c = i - Integer.MIN_VALUE;
            } else {
                jo71Var = new jo71(this, onmVar);
            }
        } else {
            jo71Var = new jo71(this, onmVar);
        }
        Object objI = jo71Var.a;
        int i2 = jo71Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            if (list.isEmpty()) {
                return b7x.a;
            }
            Flowable flowable = this.a.b(new oi("recents", false, new nec0(list, (byte) 22))).toFlowable(BackpressureStrategy.d);
            vbm[] vbmVarArr = q601.a;
            h801 h801Var = new h801(new kge(flowable), (byte) 6);
            jo71Var.c = 1;
            objI = b5p1.i(h801Var, jo71Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        List<tv00> listB = ((uv00) objI).b(zei1.class);
        ArrayList arrayList = new ArrayList();
        for (tv00 tv00Var : listB) {
            zei1 zei1Var = tv00Var.b;
            mmr0 mmr0Var = zei1Var != null ? new mmr0(tv00Var.a, zei1Var) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        mdj1 mdj1Var;
        kh7 kh7Var;
        if (onmVar instanceof mdj1) {
            mdj1Var = (mdj1) onmVar;
            int i = mdj1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mdj1Var.c = i - Integer.MIN_VALUE;
            } else {
                mdj1Var = new mdj1(this, onmVar);
            }
        } else {
            mdj1Var = new mdj1(this, onmVar);
        }
        Object objL = mdj1Var.a;
        int i2 = mdj1Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = this.a.b(new oi("share-video-associations", false, new ysf1(str, (byte) 23))).filter(f4x0.U0).map(new njp1(str, (byte) 17));
            mdj1Var.c = 1;
            objL = fc11.l(map, 1, (Object) null, mdj1Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        ldj1 ldj1Var = ((tv00) objL).b;
        if (ldj1Var == null || (kh7Var = (kh7) o7h.s0(ldj1Var.a)) == null) {
            return null;
        }
        return kh7Var.a;
    }
}
