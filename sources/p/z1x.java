package p;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z1x {
    public final mr20 a;
    public final mr20 b;
    public final m441 c;
    public final ay0 d;
    public final sen0 e;
    public final d1x f;
    public final nu0 g;
    public final j44 h;
    public final q8n i;
    public final wen0 j;
    public final crd k;
    public final lr0 l;
    public final ti0 m;
    public final llm n;
    public xab1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q1x f181p;

    public z1x(mr20 mr20Var, mr20 mr20Var2, m441 m441Var, ay0 ay0Var, sen0 sen0Var, d1x d1xVar, nu0 nu0Var, j44 j44Var, q8n q8nVar, q8n q8nVar2, wen0 wen0Var, crd crdVar, lr0 lr0Var, ti0 ti0Var) {
        this.a = mr20Var;
        this.b = mr20Var2;
        this.c = m441Var;
        this.d = ay0Var;
        this.e = sen0Var;
        this.f = d1xVar;
        this.g = nu0Var;
        this.h = j44Var;
        this.i = q8nVar;
        this.j = wen0Var;
        this.k = crdVar;
        this.l = lr0Var;
        this.m = ti0Var;
        this.n = us71.h(q8nVar2);
    }

    public static Object c(z1x z1xVar, uuw uuwVar, int i, ju0 ju0Var, Set set, String str, onm onmVar, int i2) {
        Set set2 = (i2 & 8) != 0 ? w7x.a : set;
        String str2 = (i2 & 16) != 0 ? null : str;
        z1xVar.getClass();
        int status = !set2.isEmpty() ? 2 : uuwVar.getStatus();
        nu0 nu0Var = z1xVar.g;
        jx0 jx0Var = jx0.b;
        String strA = uuwVar.a();
        List listL1 = o7h.l1(set2);
        nu0Var.getClass();
        int i3 = gr0.a;
        Object objY = fn31.Y(nu0Var.b, new mu0("embedded-npv", i, status, ju0Var, listL1, strA, str2, nu0Var, null), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(ruw ruwVar, ju0 ju0Var, onm onmVar) {
        r1x r1xVar;
        ruw ruwVar2;
        ju0 ju0Var2;
        List list;
        String str;
        List list2;
        ruw ruwVar3;
        ju0 ju0Var3;
        String str2;
        xab1 xab1Var;
        boolean z;
        j44 j44Var;
        int iH;
        if (onmVar instanceof r1x) {
            r1xVar = (r1x) onmVar;
            int i = r1xVar.g;
            if ((i & os00.INVALID_ID) != 0) {
                r1xVar.g = i - os00.INVALID_ID;
            } else {
                r1xVar = new r1x(this, onmVar);
            }
        } else {
            r1xVar = new r1x(this, onmVar);
        }
        r1x r1xVar2 = r1xVar;
        Object objB = r1xVar2.e;
        int i2 = r1xVar2.g;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            Map mapSingletonMap = Collections.singletonMap("trigger_origin", ju0Var.a);
            r1xVar2.a = ruwVar;
            r1xVar2.b = ju0Var;
            r1xVar2.g = 1;
            objB = ay0.b(this.d, mapSingletonMap, r1xVar2, 2);
            if (objB != d9nVar) {
                ruwVar2 = ruwVar;
                ju0Var2 = ju0Var;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            ju0 ju0Var4 = r1xVar2.b;
            ruw ruwVar4 = r1xVar2.a;
            hm5.M(objB);
            ju0Var2 = ju0Var4;
            ruwVar2 = ruwVar4;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = r1xVar2.d;
            str2 = r1xVar2.c;
            ju0Var3 = r1xVar2.b;
            ruw ruwVar5 = r1xVar2.a;
            hm5.M(objB);
            list2 = list3;
            ruwVar3 = ruwVar5;
        }
        xab1Var = this.o;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        if (ju0Var3 != ju0.NPV_PAUSE) {
            z = ruwVar3.b;
            j44Var = this.h;
            if (z) {
                iH = j44Var.a();
            } else {
                iH = j44Var.h();
            }
            this.o = fn31.T(this.n, null, 0, new zi3(iH, this, str2, (lnm) null, (byte) 6), 3);
        }
        ruwVar2 = ruwVar3;
        return new anf1((ji0) o7h.s0(list2), ruwVar2);
        pc91 pc91Var = (pc91) objB;
        if (pc91Var instanceof oc91) {
            oc91 oc91Var = (oc91) pc91Var;
            str = oc91Var.a;
            list = oc91Var.b;
        } else {
            if (!(pc91Var instanceof nc91)) {
                eg.o();
                return null;
            }
            list = z6x.a;
            str = null;
        }
        list2 = list;
        if (list2.isEmpty()) {
            r1xVar2.a = ruwVar2;
            r1xVar2.b = ju0Var2;
            r1xVar2.c = str;
            r1xVar2.d = list2;
            r1xVar2.g = 2;
            String str3 = str;
            if (c(this, ruwVar2, 2, ju0Var2, null, str3, r1xVar2, 8) != d9nVar) {
                ruwVar3 = ruwVar2;
                ju0Var3 = ju0Var2;
                str2 = str3;
                xab1Var = this.o;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                if (ju0Var3 != ju0.NPV_PAUSE) {
                    z = ruwVar3.b;
                    j44Var = this.h;
                    if (z) {
                        iH = j44Var.a();
                    } else {
                        iH = j44Var.h();
                    }
                    this.o = fn31.T(this.n, null, 0, new zi3(iH, this, str2, (lnm) null, (byte) 6), 3);
                }
                ruwVar2 = ruwVar3;
            }
            return d9nVar;
        }
        return new anf1((ji0) o7h.s0(list2), ruwVar2);
    }

    public final Set b(Set set) {
        Set setO1 = o7h.o1(set);
        if (this.k.a()) {
            setO1.add(iu0.h);
        }
        if (!((Boolean) this.j.getValue()).booleanValue() && !((Boolean) this.m.b.getValue()).booleanValue()) {
            return setO1;
        }
        setO1.add(iu0.g);
        return setO1;
    }
}
