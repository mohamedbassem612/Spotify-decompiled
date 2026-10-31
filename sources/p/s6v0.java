package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s6v0 {
    public final jqd0 a;
    public final l7c b;

    public s6v0(jqd0 jqd0Var, l7c l7cVar) {
        this.a = jqd0Var;
        this.b = l7cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(LinkedHashMap linkedHashMap, String str, long j, onm onmVar) {
        r6v0 r6v0Var;
        Long l;
        if (onmVar instanceof r6v0) {
            r6v0Var = (r6v0) onmVar;
            int i = r6v0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6v0Var.e = i - Integer.MIN_VALUE;
            } else {
                r6v0Var = new r6v0(this, onmVar);
            }
        } else {
            r6v0Var = new r6v0(this, onmVar);
        }
        Object objN = r6v0Var.c;
        int i2 = r6v0Var.e;
        Long l2 = null;
        if (i2 == 0) {
            hm5.M(objN);
            r6v0Var.a = linkedHashMap;
            r6v0Var.b = j;
            r6v0Var.e = 1;
            objN = this.a.n(j, str, r6v0Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = r6v0Var.b;
            linkedHashMap = r6v0Var.a;
            hm5.M(objN);
        }
        uve1 uve1Var = (xve1) objN;
        tve1 tve1Var = uve1Var instanceof tve1 ? (tve1) uve1Var : null;
        ngv ngvVar = ngv.e;
        ngv ngvVar2 = ngv.d;
        if (tve1Var != null) {
            long j2 = tve1Var.a;
            ytw0 ytw0Var = jfv.b;
            l = new Long(jfv.u(fdg1.l0(j2, ngvVar2), ngvVar));
        } else {
            l = null;
        }
        uve1 uve1Var2 = uve1Var instanceof uve1 ? uve1Var : null;
        if (uve1Var2 != null) {
            long j3 = uve1Var2.a;
            ytw0 ytw0Var2 = jfv.b;
            l2 = new Long(jfv.u(fdg1.l0(j3, ngvVar2), ngvVar));
        }
        linkedHashMap.put("t", String.valueOf(j));
        if (l != null) {
            linkedHashMap.put("ct", String.valueOf(l.longValue()));
        }
        if (l2 != null) {
            linkedHashMap.put("imt", String.valueOf(l2.longValue()));
        }
        return rih1.a;
    }
}
