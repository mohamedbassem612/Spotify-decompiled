package p;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class txs implements x2e {
    public final jks a;
    public final p7s b;
    public final qtz c;
    public final zor d;
    public final g3e e;
    public final q8n f;
    public final ilr g;
    public final f89 h;
    public final elr i;
    public final glr j;
    public final flr k;
    public c9n l;
    public final dt71 m = mgo1.e(0, 1, 0, 5);
    public final AtomicReference n = new AtomicReference();

    public txs(jks jksVar, p7s p7sVar, qtz qtzVar, ekb ekbVar, zor zorVar, g3e g3eVar, q8n q8nVar, ilr ilrVar, f89 f89Var, elr elrVar, glr glrVar, flr flrVar) {
        this.a = jksVar;
        this.b = p7sVar;
        this.c = qtzVar;
        this.d = zorVar;
        this.e = g3eVar;
        this.f = q8nVar;
        this.g = ilrVar;
        this.h = f89Var;
        this.i = elrVar;
        this.j = glrVar;
        this.k = flrVar;
        this.l = cy30.t(q8nVar);
    }

    @Override // p.x2e
    public final void a() {
        smo1.q(this.l);
        this.n.set(null);
    }

    @Override // p.x2e
    public final void b() {
        c9n c9nVarV = qmo1.v(this.l, new ots(this, (byte) 9));
        this.l = c9nVarV;
        c921.y(c9nVarV, (o8n) null, 0, new mx(this, null, (byte) 17), 3);
        c921.y(this.l, (o8n) null, 0, new qxs(this, (lnm) null, (byte) 0), 3);
        c921.y(this.l, (o8n) null, 0, new qxs(this, (lnm) null, (byte) 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0170  */
    /* JADX WARN: Code duplicated, block: B:70:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Serializable c(s5l s5lVar, onm onmVar) {
        fxs fxsVar;
        long jA;
        s5l s5lVar2;
        long j;
        mmr0 mmr0Var;
        s5l s5lVar3 = s5lVar;
        if (onmVar instanceof fxs) {
            fxsVar = (fxs) onmVar;
            int i = fxsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fxsVar.e = i - Integer.MIN_VALUE;
            } else {
                fxsVar = new fxs(this, onmVar);
            }
        } else {
            fxsVar = new fxs(this, onmVar);
        }
        Object objO = fxsVar.c;
        int i2 = fxsVar.e;
        p7s p7sVar = this.b;
        int i3 = 0;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objO);
            ArrayList arrayListD = p7sVar.d();
            pr31 pr31VarF = f(s5lVar3, arrayListD);
            if (pr31VarF != null) {
                return oqn1.n(pr31VarF, arrayListD);
            }
            jA = this.h.a();
            if (jA <= 0) {
                return oqn1.n(g(s5lVar3, arrayListD), arrayListD);
            }
            arrayListD.size();
            if (!arrayListD.isEmpty()) {
                Iterator it = arrayListD.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    if (((pr31) it.next()).m && (i4 = i4 + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
            jxs jxsVar = new jxs(this, s5lVar3, (lnm) null, (byte) 1);
            fxsVar.a = s5lVar3;
            fxsVar.b = jA;
            fxsVar.e = 1;
            objO = rc2.O(jA, jxsVar, fxsVar);
            if (objO != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            jA = fxsVar.b;
            s5lVar3 = fxsVar.a;
            hm5.M(objO);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = fxsVar.b;
            s5lVar2 = fxsVar.a;
            hm5.M(objO);
        }
        mmr0Var = (mmr0) objO;
        if (mmr0Var != null) {
            pr31 pr31Var = (pr31) mmr0Var.a;
            String str = pr31Var.a;
            boolean z = pr31Var.m;
            return mmr0Var;
        }
        ArrayList arrayListD2 = p7sVar.d();
        String strA = s5lVar2.a();
        long j2 = 2 * j;
        int size = arrayListD2.size();
        StringBuilder sb = new StringBuilder("No matching route for ");
        sb.append(strA);
        sb.append(" after ");
        sb.append(j2);
        Logger.d("CastBasic->%s", fd21.h(sb, "ms (", size, " routes)"));
        return oqn1.n((Object) null, arrayListD2);
        mmr0 mmr0Var2 = (mmr0) objO;
        if (mmr0Var2 != null) {
            Object obj = mmr0Var2.b;
            ((List) obj).size();
            Iterable iterable = (Iterable) obj;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (((pr31) it2.next()).m && (i3 = i3 + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
            return mmr0Var2;
        }
        ArrayList arrayListD3 = p7sVar.d();
        pr31 pr31VarG = g(s5lVar3, arrayListD3);
        if (pr31VarG != null) {
            Logger.k("CastBasic->%s", "Preferred not found within " + jA + "ms, using fallback " + pr31VarG.a + " (isProvidedBySpotify=" + pr31VarG.m + ", " + arrayListD3.size() + " routes)");
            return oqn1.n(pr31VarG, arrayListD3);
        }
        Logger.k("CastBasic->%s", "No matching route after " + jA + "ms (" + arrayListD3.size() + " routes); extending await for discovery...");
        jxs jxsVar2 = new jxs(this, s5lVar3, (lnm) null, (byte) 0);
        fxsVar.a = s5lVar3;
        fxsVar.b = jA;
        fxsVar.e = 2;
        objO = rc2.O(jA, jxsVar2, fxsVar);
        if (objO != d9nVar) {
            s5lVar2 = s5lVar3;
            j = jA;
            mmr0Var = (mmr0) objO;
            if (mmr0Var != null) {
                pr31 pr31Var2 = (pr31) mmr0Var.a;
                String str2 = pr31Var2.a;
                boolean z2 = pr31Var2.m;
                return mmr0Var;
            }
            ArrayList arrayListD4 = p7sVar.d();
            String strA2 = s5lVar2.a();
            long j3 = 2 * j;
            int size2 = arrayListD4.size();
            StringBuilder sb2 = new StringBuilder("No matching route for ");
            sb2.append(strA2);
            sb2.append(" after ");
            sb2.append(j3);
            Logger.d("CastBasic->%s", fd21.h(sb2, "ms (", size2, " routes)"));
            return oqn1.n((Object) null, arrayListD4);
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        lxs lxsVar;
        if (onmVar instanceof lxs) {
            lxsVar = (lxs) onmVar;
            int i = lxsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lxsVar.c = i - Integer.MIN_VALUE;
            } else {
                lxsVar = new lxs(this, onmVar);
            }
        } else {
            lxsVar = new lxs(this, onmVar);
        }
        Object objB = lxsVar.a;
        int i2 = lxsVar.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            lxsVar.c = 1;
            objB = this.i.b(lxsVar);
            if (objB != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objB);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        gg61 gg61Var = (gg61) objB;
        if (gg61Var != null) {
            j4e j4eVarA = gg61Var.a();
            if (!oho1.y(j4eVarA)) {
                swn swnVar = new swn(gg61Var, this, j4eVarA, (lnm) null, (byte) 17);
                lxsVar.c = 2;
                if (smo1.s(swnVar, lxsVar) == d9nVar) {
                    return d9nVar;
                }
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, lnm lnmVar) {
        oxs oxsVar;
        if (lnmVar instanceof oxs) {
            oxsVar = (oxs) lnmVar;
            int i = oxsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oxsVar.d = i - Integer.MIN_VALUE;
            } else {
                oxsVar = new oxs(this, lnmVar);
            }
        } else {
            oxsVar = new oxs(this, lnmVar);
        }
        Object objB = oxsVar.b;
        int i2 = oxsVar.d;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                elr elrVar = this.i;
                oxsVar.a = str;
                oxsVar.d = 1;
                objB = elrVar.b(oxsVar);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = oxsVar.a;
                hm5.M(objB);
            }
            gg61 gg61Var = (gg61) objB;
            if (gg61Var != null) {
                j4e j4eVarA = gg61Var.a();
                if (!oho1.y(j4eVarA)) {
                    CastDevice castDeviceB = j4eVarA.b();
                    String strJ = castDeviceB != null ? castDeviceB.j() : null;
                    if (strJ != null && !strJ.equals(str)) {
                        return rih1Var;
                    }
                    gg61Var.b.b(true);
                    return rih1Var;
                }
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            v8i0.j("Failed to end Cast session after logout: ", e2.getMessage());
            return rih1Var;
        }
    }

    public final pr31 f(s5l s5lVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!h((pr31) next, s5lVar.a()));
        pr31 pr31Var = (pr31) next;
        if (!((iuq0) this.e).c()) {
            return pr31Var;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (((pr31) obj2).m) {
                arrayList.add(obj2);
            }
        }
        for (Object obj3 : arrayList) {
            if (u890.j(((pr31) obj3).b, pr31Var != null ? pr31Var.b : null)) {
                obj = obj3;
                break;
            }
        }
        return (pr31) obj;
    }

    public final pr31 g(s5l s5lVar, List list) {
        Object obj;
        Object next;
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!h((pr31) next, s5lVar.a()));
        pr31 pr31Var = (pr31) next;
        if (((iuq0) this.e).c()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((pr31) obj2).m) {
                    arrayList.add(obj2);
                }
            }
            for (Object obj3 : arrayList) {
                if (u890.j(((pr31) obj3).b, pr31Var != null ? pr31Var.b : null)) {
                    obj = obj3;
                    break;
                }
            }
            pr31 pr31Var2 = (pr31) obj;
            if (pr31Var2 != null) {
                return pr31Var2;
            }
        }
        return pr31Var;
    }

    public final boolean h(pr31 pr31Var, String str) {
        c3e c3eVarH = ekb.H(pr31Var.k);
        String str2 = c3eVarH != null ? c3eVarH.a : null;
        return str2 != null ? str2.equals(str) : jto1.y(pr31Var.a).equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:62:0x0172  */
    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    /* JADX WARN: Code duplicated, block: B:66:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(s5l s5lVar, l7l l7lVar, lnm lnmVar) {
        rxs rxsVar;
        s5l s5lVar2;
        List list;
        pr31 pr31Var;
        Iterator it;
        Object next;
        pr31 pr31Var2;
        pr31 pr31Var3;
        if (lnmVar instanceof rxs) {
            rxsVar = (rxs) lnmVar;
            int i = rxsVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxsVar.g = i - Integer.MIN_VALUE;
            } else {
                rxsVar = new rxs(this, lnmVar);
            }
        } else {
            rxsVar = new rxs(this, lnmVar);
        }
        Object objC = rxsVar.e;
        d9n d9nVar = d9n.a;
        int i2 = rxsVar.g;
        Object obj = null;
        if (i2 == 0) {
            hm5.M(objC);
            ilr ilrVar = this.g;
            String strB = s5lVar.b();
            synchronized (ilrVar) {
                try {
                    ilrVar.c = strB;
                    ilrVar.d = true;
                    Iterator it2 = ilrVar.e.iterator();
                    while (it2.hasNext()) {
                        ilrVar.c((m4e) it2.next());
                    }
                    ilrVar.e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.g.b(m4e.b);
            rxsVar.a = s5lVar;
            rxsVar.b = l7lVar;
            rxsVar.g = 1;
            objC = c(s5lVar, rxsVar);
            if (objC != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            l7lVar = rxsVar.b;
            s5lVar = rxsVar.a;
            hm5.M(objC);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = rxsVar.d;
            pr31Var = rxsVar.c;
            s5lVar2 = rxsVar.a;
            hm5.M(objC);
        }
        if (pr31Var.m) {
            it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                pr31Var3 = (pr31) next;
                if (pr31Var3.m && h(pr31Var3, s5lVar2.a())) {
                    break;
                }
            }
            pr31Var2 = (pr31) next;
            if (pr31Var2 == null) {
                this.g.b(m4e.T0);
                this.m.a(new ffg1(s5lVar2.a()));
                return rih1.a;
            }
            Bundle bundle = pr31Var.k;
            this.k.a(pr31Var2, bundle != null ? bundle.getString("com.spotify.connect.EXTRA_CONNECT_STATE_IDENTIFIER") : null);
        }
        return rih1.a;
        mmr0 mmr0Var = (mmr0) objC;
        pr31 pr31Var4 = (pr31) mmr0Var.a;
        List list2 = (List) mmr0Var.b;
        list2.size();
        List<pr31> list3 = list2;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        for (pr31 pr31Var5 : list3) {
            arrayList.add(pr31Var5.a + "(spotify=" + pr31Var5.m + ")");
        }
        arrayList.toString();
        s5lVar.getClass();
        ((iuq0) this.e).c();
        Objects.toString(l7lVar);
        if (pr31Var4 != null) {
            String strB2 = s5lVar.b();
            rxsVar.a = s5lVar;
            rxsVar.b = null;
            rxsVar.c = pr31Var4;
            rxsVar.d = list2;
            rxsVar.g = 2;
            if (j(pr31Var4, strB2, rxsVar) != d9nVar) {
                s5lVar2 = s5lVar;
                list = list2;
                pr31Var = pr31Var4;
                if (pr31Var.m) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        pr31Var3 = (pr31) next;
                        if (pr31Var3.m) {
                        }
                    }
                    pr31Var2 = (pr31) next;
                    if (pr31Var2 == null) {
                        this.g.b(m4e.T0);
                        this.m.a(new ffg1(s5lVar2.a()));
                        return rih1.a;
                    }
                    Bundle bundle2 = pr31Var.k;
                    this.k.a(pr31Var2, bundle2 != null ? bundle2.getString("com.spotify.connect.EXTRA_CONNECT_STATE_IDENTIFIER") : null);
                }
            }
            return d9nVar;
        }
        for (Object obj2 : list3) {
            if (h((pr31) obj2, s5lVar.a())) {
                obj = obj2;
                break;
            }
        }
        if (!list2.isEmpty()) {
            n57.s("No route found for ".concat(s5lVar.a()));
        }
        this.g.b(m4e.T0);
        this.m.a(new ffg1(s5lVar.a()));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(pr31 pr31Var, String str, onm onmVar) {
        sxs sxsVar;
        if (onmVar instanceof sxs) {
            sxsVar = (sxs) onmVar;
            int i = sxsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sxsVar.e = i - Integer.MIN_VALUE;
            } else {
                sxsVar = new sxs(this, onmVar);
            }
        } else {
            sxsVar = new sxs(this, onmVar);
        }
        Object obj = sxsVar.c;
        int i2 = sxsVar.e;
        if (i2 == 0) {
            hm5.M(obj);
            lwh0 lwh0Var = pr31Var.l;
            if (lwh0Var != null) {
                lwh0Var.f();
            }
            sxsVar.a = pr31Var;
            sxsVar.b = str;
            sxsVar.e = 1;
            Object objD = d(sxsVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = sxsVar.b;
            pr31Var = sxsVar.a;
            hm5.M(obj);
        }
        this.m.a(new gfg1(pr31Var.a, str));
        e130.u(pr31Var);
        this.g.b(m4e.c);
        return rih1.a;
    }
}
