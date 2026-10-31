package p;

import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kfb0 {
    public static final bma1 c;
    public static final bma1 d;
    public final Single a;
    public final nfa0 b;

    static {
        nbc nbcVar = bma1.b;
        c = nbcVar.u("where_to_play_new_last_active_device_id");
        d = nbcVar.u("where_to_play_active_device_history");
    }

    public kfb0(Single single, nfa0 nfa0Var) {
        this.a = single;
        this.b = nfa0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(onm onmVar) {
        hfb0 hfb0Var;
        if (onmVar instanceof hfb0) {
            hfb0Var = (hfb0) onmVar;
            int i = hfb0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hfb0Var.d = i - Integer.MIN_VALUE;
            } else {
                hfb0Var = new hfb0(this, onmVar);
            }
        } else {
            hfb0Var = new hfb0(this, onmVar);
        }
        Object objJ = hfb0Var.b;
        int i2 = hfb0Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            hfb0Var.a = this;
            hfb0Var.d = 1;
            objJ = fc11.j(this.a, hfb0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = hfb0Var.a;
            hm5.M(objJ);
        }
        List<los0> listC = this.c((dma1) objJ);
        ArrayList arrayList = new ArrayList(q7h.U(listC, 10));
        for (los0 los0Var : listC) {
            arrayList.add(new fb0(los0Var.b(), los0Var.a()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        ifb0 ifb0Var;
        if (onmVar instanceof ifb0) {
            ifb0Var = (ifb0) onmVar;
            int i = ifb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifb0Var.c = i - Integer.MIN_VALUE;
            } else {
                ifb0Var = new ifb0(this, onmVar);
            }
        } else {
            ifb0Var = new ifb0(this, onmVar);
        }
        Object objJ = ifb0Var.a;
        int i2 = ifb0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ifb0Var.c = 1;
            objJ = fc11.j(this.a, ifb0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return ((dma1) objJ).e(c, null);
    }

    public final List c(dma1 dma1Var) {
        List m231Var;
        String strE = dma1Var.e(d, null);
        List list = z6x.a;
        if (strE == null) {
            return list;
        }
        try {
            m231Var = ((ios0) this.b.a(strE, ios0.Companion.serializer())).a();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (!(m231Var instanceof m231)) {
            list = m231Var;
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, String str, onm onmVar) {
        jfb0 jfb0Var;
        if (onmVar instanceof jfb0) {
            jfb0Var = (jfb0) onmVar;
            int i = jfb0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jfb0Var.e = i - Integer.MIN_VALUE;
            } else {
                jfb0Var = new jfb0(this, onmVar);
            }
        } else {
            jfb0Var = new jfb0(this, onmVar);
        }
        Object objJ = jfb0Var.c;
        int i2 = jfb0Var.e;
        if (i2 == 0) {
            hm5.M(objJ);
            jfb0Var.a = str;
            jfb0Var.b = j;
            jfb0Var.e = 1;
            objJ = fc11.j(this.a, jfb0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = jfb0Var.b;
            str = jfb0Var.a;
            hm5.M(objJ);
        }
        dma1 dma1Var = (dma1) objJ;
        List listC = c(dma1Var);
        los0 los0Var = (los0) o7h.s0(listC);
        boolean zJ = u890.j(los0Var != null ? los0Var.b() : null, str);
        rih1 rih1Var = rih1.a;
        if (zJ) {
            return rih1Var;
        }
        ArrayList arrayListN0 = o7h.N0(listC, k4p1.x(new los0(str, j)));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListN0) {
            if (hashSet.add(((los0) obj).b())) {
                arrayList.add(obj);
            }
        }
        List listD1 = o7h.d1(arrayList, 2);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.d(c, str);
        hma1VarEdit.d(d, this.b.b(ios0.Companion.serializer(), new ios0(listD1)));
        hma1VarEdit.g();
        o7h.y0(listD1, (CharSequence) null, (String) null, (String) null, rab0.R0, 31);
        return rih1Var;
    }
}
