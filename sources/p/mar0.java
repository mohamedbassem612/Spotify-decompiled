package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mar0 implements ihr0 {
    public final cir0 a;
    public u4a0 b;

    public mar0(cir0 cir0Var) {
        this.a = cir0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(xj61 xj61Var, onm onmVar) {
        kar0 kar0Var;
        if (onmVar instanceof kar0) {
            kar0Var = (kar0) onmVar;
            int i = kar0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kar0Var.d = i - Integer.MIN_VALUE;
            } else {
                kar0Var = new kar0(this, onmVar);
            }
        } else {
            kar0Var = new kar0(this, onmVar);
        }
        Object objR = kar0Var.b;
        int i2 = kar0Var.d;
        if (i2 == 0) {
            hm5.M(objR);
            ArrayList arrayList = new ArrayList(q7h.U(xj61Var, 10));
            Iterator it = xj61Var.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((mmr0) it.next()).a);
            }
            kar0Var.a = xj61Var;
            kar0Var.d = 1;
            ohd ohdVar = new ohd(1, aym.t(kar0Var));
            ohdVar.t();
            try {
                this.b = new u4a0(ohdVar, (byte) 3);
                ohdVar.n(new lar0(this, (byte) 0));
                zhq0 zhq0VarK = this.a.k();
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                zhq0VarK.s((String[]) Arrays.copyOf(strArr, strArr.length));
            } catch (Throwable th) {
                this.b = null;
                ohdVar.resumeWith(new m231(th));
            }
            objR = ohdVar.r();
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xj61Var = kar0Var.a;
            hm5.M(objR);
        }
        Map map = (Map) objR;
        int iS = zno1.s(q7h.U(xj61Var, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : xj61Var) {
            linkedHashMap.put(obj, u890.j(map.get(((mmr0) obj).a), Boolean.TRUE) ? ams0.a : ams0.b);
        }
        return linkedHashMap;
    }

    public final boolean b(ehr0 ehr0Var) {
        if (!(ehr0Var instanceof bos0)) {
            return false;
        }
        u4a0 u4a0Var = this.b;
        if (u4a0Var != null) {
            u4a0Var.invoke(((bos0) ehr0Var).a);
        }
        this.b = null;
        return true;
    }
}
