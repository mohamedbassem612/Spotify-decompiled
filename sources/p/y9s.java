package p;

import com.spotify.devicepredictability.devicesuggestionprovider.events.proto.DeviceSuggestionSourceResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y9s {
    public final g0l a;
    public final p250 b;
    public final fzt c;
    public final jd4 d;
    public final mt4 e;
    public final znl1 f;
    public final llm g;
    public xab1 h;

    public y9s(g0l g0lVar, p250 p250Var, fzt fztVar, jd4 jd4Var, mt4 mt4Var, znl1 znl1Var, q8n q8nVar) {
        this.a = g0lVar;
        this.b = p250Var;
        this.c = fztVar;
        this.d = jd4Var;
        this.e = mt4Var;
        this.f = znl1Var;
        this.g = us71.h(q8nVar);
    }

    public static boolean d(List list) {
        List<l0l> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (l0l l0lVar : list2) {
            if (!l0lVar.l() && l0lVar.n() && !l0lVar.o() && !ihc1.y0(l0lVar.d())) {
                return true;
            }
        }
        return false;
    }

    public static ywt h(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return ywt.a;
        }
        if (iC == 1) {
            return ywt.b;
        }
        if (iC == 2) {
            return ywt.c;
        }
        if (iC == 3) {
            return ywt.d;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        q9s q9sVar;
        if (onmVar instanceof q9s) {
            q9sVar = (q9s) onmVar;
            int i = q9sVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9sVar.c = i - Integer.MIN_VALUE;
            } else {
                q9sVar = new q9s(this, onmVar);
            }
        } else {
            q9sVar = new q9s(this, onmVar);
        }
        Object objO = q9sVar.a;
        int i2 = q9sVar.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objO);
            long jA = this.e.a();
            p9s p9sVar = new p9s(this, lnmVar, (byte) 2);
            q9sVar.c = 1;
            objO = rc2.O(jA, p9sVar, q9sVar);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        bla1 bla1Var = (bla1) objO;
        return bla1Var != null ? bla1Var : cla1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar, boolean z) {
        r9s r9sVar;
        if (onmVar instanceof r9s) {
            r9sVar = (r9s) onmVar;
            int i = r9sVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r9sVar.c = i - Integer.MIN_VALUE;
            } else {
                r9sVar = new r9s(this, onmVar);
            }
        } else {
            r9sVar = new r9s(this, onmVar);
        }
        Object objO = r9sVar.a;
        int i2 = r9sVar.c;
        if (i2 == 0) {
            hm5.M(objO);
            long jB = this.e.b();
            s9s s9sVar = new s9s(this, z, str, null, (byte) 0);
            r9sVar.c = 1;
            objO = rc2.O(jB, s9sVar, r9sVar);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        bla1 bla1Var = (bla1) objO;
        return bla1Var != null ? bla1Var : cla1.a;
    }

    public final l0l c(String str) {
        Object next;
        Iterator it = this.a.i().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (u890.j(((l0l) next).d(), str)) {
                return (l0l) next;
            }
        }
        next = null;
        return (l0l) next;
    }

    public final void e(String str, iwc1 iwc1Var, dla1 dla1Var, int i, boolean z) {
        mmr0 mmr0Var;
        String str2;
        if (dla1Var instanceof bla1) {
            bxt bxtVar = ((bla1) dla1Var).a;
            mmr0Var = new mmr0(bxtVar != null ? "COMPLETED" : "NO_SUGGESTION", bxtVar);
        } else {
            if (!u890.j(dla1Var, cla1.a)) {
                eg.o();
                return;
            }
            mmr0Var = new mmr0("TIMED_OUT", (Object) null);
        }
        String str3 = (String) mmr0Var.a;
        bxt bxtVar2 = (bxt) mmr0Var.b;
        fzt fztVar = this.c;
        fztVar.getClass();
        c0u c0uVarN = DeviceSuggestionSourceResult.n();
        c0uVarN.r(str);
        int iOrdinal = iwc1Var.ordinal();
        if (iOrdinal == 0) {
            str2 = "WHERE_TO_PLAY";
        } else if (iOrdinal == 1) {
            str2 = "GOOGLE_INTENT_ENGINE";
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return;
            }
            str2 = "BLE_PROXIMITY";
        }
        c0uVarN.v(str2);
        c0uVarN.w(str3);
        c0uVarN.n(i);
        c0uVarN.u(z);
        if (bxtVar2 != null) {
            c0uVarN.s(bxtVar2.d());
            c0uVarN.t(fzt.c(bxtVar2.getType()));
            c0uVarN.q(fzt.b(bxtVar2.a()));
            c0uVarN.x(bxtVar2.e());
        }
        fztVar.a.a(c0uVarN.build());
    }

    public final xwt f(m250 m250Var) {
        int i;
        if (!(m250Var instanceof l250)) {
            if (m250Var instanceof k250) {
                return null;
            }
            eg.o();
            return null;
        }
        l250 l250Var = (l250) m250Var;
        l0l l0lVarC = c(l250Var.a);
        if (l0lVarC == null) {
            return null;
        }
        String str = l250Var.c;
        String strD = l0lVarC.d();
        String str2 = l0lVarC.G().a;
        String name = l0lVarC.getName();
        f0u type = l0lVarC.getType();
        boolean z = l0lVarC.z();
        int iC = l1d.C(l250Var.b);
        int i2 = 1;
        if (iC == 0) {
            i = i2;
        } else if (iC != 1) {
            i2 = 3;
            if (iC != 2) {
                if (iC != 3) {
                    eg.o();
                    return null;
                }
                i2 = 4;
            }
            i = i2;
        } else {
            i = 2;
        }
        ywt ywtVar = ywt.d;
        return new xwt(str, strD, str2, name, type, z, i, new zwt(ywtVar, ywtVar));
    }

    public final axt g(xnl1 xnl1Var) {
        int i;
        if (!(xnl1Var instanceof wnl1)) {
            if (xnl1Var instanceof vnl1) {
                return null;
            }
            eg.o();
            return null;
        }
        wnl1 wnl1Var = (wnl1) xnl1Var;
        l0l l0lVarC = c(wnl1Var.a);
        if (l0lVarC == null) {
            return null;
        }
        String str = wnl1Var.c;
        String strD = l0lVarC.d();
        String str2 = l0lVarC.G().a;
        String name = l0lVarC.getName();
        f0u type = l0lVarC.getType();
        boolean z = l0lVarC.z();
        int iC = l1d.C(wnl1Var.b);
        int i2 = 1;
        if (iC == 0) {
            i = 1;
        } else if (iC == 1) {
            i = 2;
        } else if (iC == 2) {
            i = 3;
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            i = 4;
        }
        int iC2 = l1d.C(wnl1Var.d);
        if (iC2 != 0) {
            if (iC2 == 1) {
                i2 = 2;
            } else {
                if (iC2 != 2) {
                    eg.o();
                    return null;
                }
                i2 = 3;
            }
        }
        return new axt(str, strD, str2, name, type, z, i, i2, new zwt(h(wnl1Var.f), h(wnl1Var.g)));
    }
}
