package p;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bg61 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final /* synthetic */ cg61 b;

    public bg61(cg61 cg61Var) {
        this.b = cg61Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, String str, onm onmVar) {
        zf61 zf61Var;
        boolean z;
        if (onmVar instanceof zf61) {
            zf61Var = (zf61) onmVar;
            int i = zf61Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                zf61Var.e = i - Integer.MIN_VALUE;
            } else {
                zf61Var = new zf61(this, onmVar);
            }
        } else {
            zf61Var = new zf61(this, onmVar);
        }
        Object objN = zf61Var.c;
        int i2 = zf61Var.e;
        if (i2 == 0) {
            hm5.M(objN);
            awl1 awl1VarY = nb51.y(context);
            pzc pzcVarB = l4o1.B(awl1VarY.c, awl1VarY.d, str);
            zf61Var.a = this;
            zf61Var.b = str;
            zf61Var.e = 1;
            objN = w0h1.n(pzcVarB, zf61Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = zf61Var.b;
            this = zf61Var.a;
            hm5.M(objN);
        }
        Iterable iterable = (Iterable) objN;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (p7h.M(new wvl1[]{wvl1.b, wvl1.a}).contains(((xvl1) it.next()).a())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        cy5 cy5Var = (cy5) this.a.get(str);
        return yah0.m((cy5Var != null ? cy5Var.b.get() : false) && z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Context context, cy5 cy5Var, onm onmVar) {
        ag61 ag61Var;
        if (onmVar instanceof ag61) {
            ag61Var = (ag61) onmVar;
            int i = ag61Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag61Var.e = i - Integer.MIN_VALUE;
            } else {
                ag61Var = new ag61(this, onmVar);
            }
        } else {
            ag61Var = new ag61(this, onmVar);
        }
        Object obj = ag61Var.c;
        int i2 = ag61Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            cy5 cy5Var2 = (cy5) this.a.put(cy5Var.b(), cy5Var);
            if (cy5Var2 != null) {
                cy5Var2.a();
            }
            ciq0 ciq0Var = new ciq0(SessionWorker.class);
            mmr0[] mmr0VarArr = {oqn1.n("KEY", cy5Var.b())};
            cwq cwqVar = new cwq();
            mmr0 mmr0Var = mmr0VarArr[0];
            cwqVar.c(mmr0Var.b, (String) mmr0Var.a);
            n8d0 n8d0VarD = nb51.y(context).c(cy5Var.b(), 1, (diq0) ((ciq0) ciq0Var.i(cwqVar.a())).b()).d();
            ag61Var.a = this;
            ag61Var.b = context;
            ag61Var.e = 1;
            Object objN = w0h1.n(n8d0VarD, ag61Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = ag61Var.b;
            this = ag61Var.a;
            hm5.M(obj);
        }
        cg61.a(this.b, context);
        return rih1.a;
    }
}
