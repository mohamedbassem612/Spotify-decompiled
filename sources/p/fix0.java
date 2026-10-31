package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fix0 {
    public static final long e;
    public final jr2 a;
    public final wen0 b;
    public final long c = e;
    public final mp2 d;

    static {
        ytw0 ytw0Var = jfv.b;
        e = fdg1.k0(3, ngv.e);
    }

    public fix0(jr2 jr2Var, bpb1 bpb1Var, mp2 mp2Var) {
        this.a = jr2Var;
        this.b = bpb1Var;
        this.d = mp2Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(tt2 tt2Var, String str, String str2, onm onmVar) throws KotlinNothingValueException {
        eix0 eix0Var;
        List list;
        int i;
        Iterator it;
        int i2;
        Object next;
        int i3;
        String str3;
        bpb1 bpb1Var;
        if (onmVar instanceof eix0) {
            eix0Var = (eix0) onmVar;
            int i4 = eix0Var.g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eix0Var.g = i4 - Integer.MIN_VALUE;
            } else {
                eix0Var = new eix0(this, onmVar);
            }
        } else {
            eix0Var = new eix0(this, onmVar);
        }
        Object objI = eix0Var.e;
        int i5 = eix0Var.g;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i5 == 0) {
                hm5.M(objI);
                wr2 wr2Var = this.a;
                eix0Var.g = 1;
                objI = wr2Var.i(tt2Var, str, str2, eix0Var);
                if (objI == d9nVar) {
                }
                return d9nVar;
            }
            if (i5 == 1) {
                hm5.M(objI);
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = eix0Var.a;
                    throw l1d.v(objI);
                }
                i2 = eix0Var.d;
                i = eix0Var.c;
                it = eix0Var.b;
                list = eix0Var.a;
                hm5.M(objI);
            }
            while (it.hasNext()) {
                next = it.next();
                i3 = i2 + 1;
                if (i2 >= 0) {
                    p7h.T();
                    throw null;
                }
                str3 = (String) next;
                this.d.invoke(str3);
                bpb1Var = this.b;
                if (((jre) bpb1Var.getValue()) instanceof ire) {
                    bpb1Var.m((Object) null, new ire(str3));
                }
                if (i2 < p7h.L(list)) {
                    eix0Var.a = list;
                    eix0Var.b = it;
                    eix0Var.c = i;
                    eix0Var.d = i3;
                    eix0Var.g = 2;
                    if (hap1.j(this.c, eix0Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                i2 = i3;
            }
            eix0Var.a = null;
            eix0Var.b = null;
            eix0Var.g = 3;
            hap1.f(eix0Var);
            return d9nVar;
            ArrayList arrayList = ((ss2) objI).b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((bt2) it2.next()).a;
                if (ihc1.y0(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    arrayList2.add(str4);
                }
            }
            if (arrayList2.isEmpty()) {
                return rih1Var;
            }
            Iterator it3 = arrayList2.iterator();
            list = arrayList2;
            i = 0;
            it = it3;
            i2 = 0;
            while (it.hasNext()) {
                next = it.next();
                i3 = i2 + 1;
                if (i2 >= 0) {
                    p7h.T();
                    throw null;
                }
                str3 = (String) next;
                this.d.invoke(str3);
                bpb1Var = this.b;
                if (((jre) bpb1Var.getValue()) instanceof ire) {
                    bpb1Var.m((Object) null, new ire(str3));
                }
                if (i2 < p7h.L(list)) {
                    eix0Var.a = list;
                    eix0Var.b = it;
                    eix0Var.c = i;
                    eix0Var.d = i3;
                    eix0Var.g = 2;
                    if (hap1.j(this.c, eix0Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                i2 = i3;
            }
            eix0Var.a = null;
            eix0Var.b = null;
            eix0Var.g = 3;
            hap1.f(eix0Var);
            return d9nVar;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            n57.t("Failed to fetch agent-gateway progress stages", th);
            return rih1Var;
        }
    }
}
