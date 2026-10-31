package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uhv extends qiv {
    public final pdc1 f;
    public final j3e g;
    public final g0l h;
    public final l7s i;
    public final y7l j;
    public final ilr k;
    public final q8n l;
    public final c9n m;
    public gvh0 n;
    public kvh0 o;

    public uhv(pdc1 pdc1Var, j3e j3eVar, g0l g0lVar, l7s l7sVar, y7l y7lVar, ilr ilrVar, q8n q8nVar) {
        this.f = pdc1Var;
        this.g = j3eVar;
        this.h = g0lVar;
        this.i = l7sVar;
        this.j = y7lVar;
        this.k = ilrVar;
        this.l = q8nVar;
        llm llmVarK = i3a.k(q8nVar);
        this.m = llmVarK;
        c9n c9nVarV = qmo1.v(llmVarK, new v7v(this, (byte) 3));
        this.m = c9nVarV;
        lnm lnmVar = null;
        fn31.T(c9nVarV, (o8n) null, 0, new rhv(this, lnmVar, (byte) 0), 3);
        fn31.T(c9nVarV, (o8n) null, 0, new rhv(this, lnmVar, (byte) 1), 3);
    }

    public final boolean d(Intent intent, hwh0 hwh0Var) {
        this.g.getClass();
        intent.toString();
        return false;
    }

    public final void e() {
        this.g.getClass();
    }

    public final void f() {
        this.k.b(m4e.CAST_DYNAMIC_INDIVIDUAL_ROUTE_ON_SELECT);
        this.g.f();
        p();
    }

    public final void g(int i) {
        this.g.g(i);
        q(i);
    }

    public final void i(int i) {
        this.g.getClass();
        smo1.p(this.m, (CancellationException) null);
    }

    public final void j(int i) {
        this.g.j(i);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        int iS;
        int i;
        List list;
        jqd0 jqd0VarA = this.i.a();
        Object obj = null;
        pdc1 pdc1Var = this.f;
        if (jqd0VarA != null && (list = (List) jqd0VarA.d) != null) {
            for (Object obj2 : list) {
                if (u890.j(((gvh0) obj2).g(), pdc1Var.a)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (gvh0) obj;
        }
        gvh0 gvh0Var = obj;
        int iA = 0;
        if (gvh0Var != 0) {
            inr inrVar = this.h;
            l0l l0lVarC = inrVar.c();
            if (l0lVarC != null) {
                double dC = ((double) l0lVarC.c()) / 65535.0d;
                int iA2 = l0lVarC.A();
                if (iA2 >= 24) {
                    iA2 = 24;
                }
                iS = jch0.S(dC * ((double) iA2));
            } else {
                iS = 0;
            }
            l0l l0lVarC2 = inrVar.c();
            if (l0lVarC2 != null) {
                i = !l0lVarC2.F() ? 0 : 1;
            }
            l0l l0lVarC3 = inrVar.c();
            if (l0lVarC3 != null && (iA = l0lVarC3.A()) >= 24) {
                iA = 24;
            }
            wmy wmyVar = new wmy(pdc1Var.b, gvh0Var.j());
            wmyVar.F(iS);
            wmyVar.G(i);
            wmyVar.H(iA);
            wmyVar.v(2);
            wmyVar.e(Collections.singletonList(pdc1Var.a));
            wmyVar.d(gvh0Var.b());
            this.n = wmyVar.h();
            this.o = new kvh0(gvh0Var, 3, false, false, true);
        } else {
            Logger.d(l1d.m("GOS->No media route descriptor found for routeId ", pdc1Var.a), new Object[0]);
        }
        gvh0 gvh0Var2 = this.n;
        if (gvh0Var2 != null) {
            k(gvh0Var2, p7h.N(this.o));
        }
    }

    public final void q(int i) {
        gvh0 gvh0Var = this.n;
        if (gvh0Var != null) {
            new ArrayList();
            new ArrayList();
            new HashSet();
            new ArrayList();
            Bundle bundle = new Bundle(gvh0Var.a);
            ArrayList arrayListE = gvh0Var.e();
            ArrayList arrayListB = gvh0Var.b();
            HashSet hashSetA = gvh0Var.a();
            List list = gvh0Var.c;
            String str = gvh0Var.b;
            bundle.putInt("volume", i);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListE));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
            gvh0 gvh0Var2 = new gvh0(str, bundle, list);
            this.n = gvh0Var2;
            k(gvh0Var2, p7h.N(this.o));
        }
    }
}
