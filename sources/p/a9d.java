package p;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a9d {
    public final cfd a;
    public final zwa b;
    public final i6b c;
    public final fta d;
    public final q59 e;
    public final it8 f;
    public final xcd g;
    public final rl1 h;
    public final q59 i;
    public final jc9 j;
    public final fta k;

    public a9d(cfd cfdVar, zwa zwaVar, i6b i6bVar, fta ftaVar, q59 q59Var, it8 it8Var, xcd xcdVar, rl1 rl1Var, q59 q59Var2, jc9 jc9Var, fta ftaVar2) {
        this.a = cfdVar;
        this.b = zwaVar;
        this.c = i6bVar;
        this.d = ftaVar;
        this.e = q59Var;
        this.f = it8Var;
        this.g = xcdVar;
        this.h = rl1Var;
        this.i = q59Var2;
        this.j = jc9Var;
        this.k = ftaVar2;
    }

    public final void a(String str, String str2, tv80 tv80Var) {
        if (tv80Var == null) {
            n57.s("Failed to open context menu for chat details share, null interaction result");
            return;
        }
        if (nzy.g(str)) {
            this.b.n(str, str2, tv80Var, (nk51) null);
            return;
        }
        if (nzy.a(str)) {
            this.c.q(str, str2, tv80Var, (nk51) null);
            return;
        }
        if (nzy.d(str)) {
            this.h.I(str, str2, tv80Var, (nk51) null);
            return;
        }
        if (nzy.f(str)) {
            this.a.x(str, str2, tv80Var, (nk51) null);
            return;
        }
        if (nzy.c(str)) {
            this.f.A(str, str2, tv80Var, (nk51) null);
            return;
        }
        Set set = s4b1.f;
        blc0[] blc0VarArr = nzy.e;
        if (uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length))) {
            this.d.B(str, str2, tv80Var, (nk51) null);
            return;
        }
        if (nzy.h(str)) {
            this.g.b(str, str2, tv80Var, (nk51) null);
            return;
        }
        if (nzy.e(str)) {
            this.i.u(str, str2, tv80Var, null);
            return;
        }
        if (!nzy.b(str)) {
            blc0[] blc0VarArr2 = nzy.o;
            if (!uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr2, blc0VarArr2.length))) {
                lik1 lik1Var = new lik1(str2);
                q59 q59Var = this.e;
                mfm mfmVarA = ((i4q) q59Var.b).a(lik1Var);
                kjm kjmVar = new kjm(new igm("open.spotify.com", (rzn1) null, (String) null, 6), Collections.singletonList(((f971) q59Var.c).a(str, z6x.a, str2)), 4);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.c(mfmVarA, kjmVar, yon1.d1(), new bjm(4, str, str2), tv80Var, 16);
                return;
            }
        }
        this.j.r(str, str2, tv80Var, (nk51) null);
    }

    public final void b(String str, String str2, String str3, String str4, tv80 tv80Var) {
        nk51 nk51Var = new nk51(str2, str4);
        if (nzy.g(str)) {
            this.b.n(str, str3, tv80Var, nk51Var);
            return;
        }
        if (nzy.a(str)) {
            this.c.q(str, str3, tv80Var, nk51Var);
            return;
        }
        if (nzy.d(str)) {
            this.h.I(str, str3, tv80Var, nk51Var);
            return;
        }
        if (nzy.f(str)) {
            this.a.x(str, str3, tv80Var, nk51Var);
            return;
        }
        if (nzy.c(str)) {
            this.f.A(str, str3, tv80Var, nk51Var);
            return;
        }
        Set set = s4b1.f;
        blc0[] blc0VarArr = nzy.e;
        if (uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length))) {
            this.d.B(str, str3, tv80Var, nk51Var);
            return;
        }
        if (nzy.h(str)) {
            this.g.b(str, str3, tv80Var, nk51Var);
            return;
        }
        if (nzy.e(str)) {
            this.i.u(str, str3, tv80Var, nk51Var);
            return;
        }
        if (!nzy.b(str)) {
            blc0[] blc0VarArr2 = nzy.o;
            if (!uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr2, blc0VarArr2.length))) {
                lik1 lik1Var = new lik1(str3);
                fta ftaVar = this.k;
                mfm mfmVarA = ((i4q) ftaVar.e).a(lik1Var);
                igm igmVar = new igm(((Context) ftaVar.b).getString(2131958561), (rzn1) null, (String) null, 6);
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(((dc31) ftaVar.d).d(nk51Var));
                smc0VarN.add(((f971) ftaVar.c).a(str, z6x.a, str3));
                kjm kjmVar = new kjm(igmVar, k4p1.k(smc0VarN), 4);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.c(mfmVarA, kjmVar, yon1.d1(), new bjm(4, str, str3), tv80Var, 16);
                return;
            }
        }
        this.j.r(str, str3, tv80Var, nk51Var);
    }
}
