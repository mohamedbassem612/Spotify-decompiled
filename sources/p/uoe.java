package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uoe {
    public static final bma1 e = bma1.b.u("blocked_users_acknowledged");
    public final Context a;
    public final ucd b;
    public final Observable c;
    public dma1 d;

    public uoe(Context context, ucd ucdVar, Observable observable) {
        this.a = context;
        this.b = ucdVar;
        this.c = observable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        qoe qoeVar;
        if (onmVar instanceof qoe) {
            qoeVar = (qoe) onmVar;
            int i = qoeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qoeVar.c = i - Integer.MIN_VALUE;
            } else {
                qoeVar = new qoe(this, onmVar);
            }
        } else {
            qoeVar = new qoe(this, onmVar);
        }
        Object objB = qoeVar.a;
        int i2 = qoeVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            qoeVar.c = 1;
            objB = b(qoeVar);
            Object obj = d9n.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        bma1 bma1Var = e;
        w7x w7xVar = w7x.a;
        Set setB = ((dma1) objB).b(bma1Var, w7xVar);
        return setB == null ? w7xVar : setB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        roe roeVar;
        if (onmVar instanceof roe) {
            roeVar = (roe) onmVar;
            int i = roeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                roeVar.d = i - Integer.MIN_VALUE;
            } else {
                roeVar = new roe(this, onmVar);
            }
        } else {
            roeVar = new roe(this, onmVar);
        }
        Object objI = roeVar.b;
        int i2 = roeVar.d;
        if (i2 == 0) {
            hm5.M(objI);
            dma1 dma1Var = this.d;
            if (dma1Var != null) {
                return dma1Var;
            }
            ezc ezcVarG = yoi1.g(this.c);
            roeVar.a = this;
            roeVar.d = 1;
            objI = b5p1.i(ezcVarG, roeVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = roeVar.a;
            hm5.M(objI);
        }
        ucd ucdVar = this.b;
        Context context = this.a;
        dma1 dma1VarB = ucdVar.b.b(context, (String) objI);
        this.d = dma1VarB;
        return dma1VarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, onm onmVar) {
        soe soeVar;
        if (onmVar instanceof soe) {
            soeVar = (soe) onmVar;
            int i = soeVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                soeVar.e = i - Integer.MIN_VALUE;
            } else {
                soeVar = new soe(this, onmVar);
            }
        } else {
            soeVar = new soe(this, onmVar);
        }
        Object objA = soeVar.c;
        int i2 = soeVar.e;
        if (i2 == 0) {
            hm5.M(objA);
            soeVar.a = str;
            soeVar.b = str2;
            soeVar.e = 1;
            objA = a(soeVar);
            Object obj = d9n.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = soeVar.b;
            str = soeVar.a;
            hm5.M(objA);
        }
        return Boolean.valueOf(((Set) objA).contains(str + ":" + str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, ArrayList arrayList, onm onmVar) {
        toe toeVar;
        Set set;
        if (onmVar instanceof toe) {
            toeVar = (toe) onmVar;
            int i = toeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                toeVar.f = i - Integer.MIN_VALUE;
            } else {
                toeVar = new toe(this, onmVar);
            }
        } else {
            toeVar = new toe(this, onmVar);
        }
        Object objA = toeVar.d;
        int i2 = toeVar.f;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            toeVar.a = str;
            toeVar.b = arrayList;
            toeVar.f = 1;
            objA = a(toeVar);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            arrayList = toeVar.b;
            str = toeVar.a;
            hm5.M(objA);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = toeVar.c;
            hm5.M(objA);
        }
        hma1 hma1VarEdit = ((dma1) objA).edit();
        hma1VarEdit.e(e, set);
        hma1VarEdit.g();
        return rih1.a;
        Set setO1 = o7h.o1((Iterable) objA);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            setO1.add(str + ":" + ((String) it.next()));
        }
        if (!setO1.isEmpty()) {
            toeVar.a = null;
            toeVar.b = null;
            toeVar.c = setO1;
            toeVar.f = 2;
            Object objB = b(toeVar);
            if (objB != obj) {
                objA = objB;
                set = setO1;
                hma1 hma1VarEdit2 = ((dma1) objA).edit();
                hma1VarEdit2.e(e, set);
                hma1VarEdit2.g();
            }
            return obj;
        }
        return rih1.a;
    }
}
