package p;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bn31 {
    public final tka0 a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public n8b0 h;
    public boolean i;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14p;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final abg j = new abg((byte) 1);
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final ArrayList m = new ArrayList();
    public boolean n = true;

    public bn31(Context context, Class cls, String str) {
        this.a = rc11.a.b(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(trj0... trj0VarArr) {
        for (trj0 trj0Var : trj0VarArr) {
            Integer numValueOf = Integer.valueOf(trj0Var.a);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(trj0Var.b));
        }
        this.j.c((trj0[]) Arrays.copyOf(trj0VarArr, trj0VarArr.length));
    }

    public final void b(Object obj) {
        this.e.add(obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    public final en31 c() {
        dyb0 dyb0VarG;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            n5u n5uVar = q26.c;
            this.g = n5uVar;
            this.f = n5uVar;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.l;
        LinkedHashSet linkedHashSet2 = this.k;
        yto.x(linkedHashSet, linkedHashSet2);
        l7c l7cVar = this.h;
        if (l7cVar == null) {
            l7cVar = new l7c((byte) 11);
        }
        l7c l7cVar2 = l7cVar;
        boolean z = this.i;
        l1d.b(1);
        Context context = this.b;
        Object systemService = context.getSystemService("activity");
        h1d1 h1d1Var = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        int i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor2 = this.f;
        if (executor2 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        c5r c5rVar = new c5r(context, this.c, l7cVar2, this.j, this.d, z, i, executor2, executor3, null, this.n, this.o, linkedHashSet2, null, null, null, this.e, this.m, this.f14p, null, null);
        en31 en31Var = (en31) xpn1.s(this.a.n());
        en31Var.k = true;
        try {
            dyb0VarG = en31Var.g();
        } catch (jgo0 unused) {
            dyb0VarG = null;
        }
        if (dyb0VarG == null) {
            new vgr(c5rVar, new cix0(en31Var), new nsm0(en31Var, (byte) 20));
            throw null;
        }
        en31Var.e = new vgr(c5rVar, dyb0VarG, new nsm0(en31Var, (byte) 21));
        en31Var.f = en31Var.f();
        yto.w(en31Var, c5rVar);
        yto.y(en31Var, c5rVar);
        en31Var.c = c5rVar.h;
        en31Var.d = new q7g1(c5rVar.i);
        Executor executor4 = en31Var.c;
        if (executor4 == null) {
            u890.C("internalQueryExecutor");
            throw null;
        }
        llm llmVarT = cy30.t(qgo1.q(executor4));
        en31Var.a = llmVarT;
        o8n o8nVar = llmVarT.a;
        q7g1 q7g1Var = en31Var.d;
        if (q7g1Var == null) {
            u890.C("internalTransactionExecutor");
            throw null;
        }
        en31Var.b = o8nVar.y(qgo1.q(q7g1Var));
        en31Var.h = c5rVar.f;
        vgr vgrVar = en31Var.e;
        if (vgrVar == null) {
            u890.C("connectionManager");
            throw null;
        }
        h1d1 h1d1VarR = vgrVar.r();
        if (h1d1VarR != null) {
            while (!(h1d1VarR instanceof thv0)) {
                if (!(h1d1VarR instanceof n5t)) {
                    h1d1VarR = null;
                    break;
                }
                h1d1VarR = ((n5t) h1d1VarR).a();
            }
        } else {
            h1d1VarR = null;
            break;
        }
        vgr vgrVar2 = en31Var.e;
        if (vgrVar2 == null) {
            u890.C("connectionManager");
            throw null;
        }
        h1d1 h1d1VarR2 = vgrVar2.r();
        if (h1d1VarR2 != null) {
            while (!(h1d1VarR2 instanceof as8)) {
                if (h1d1VarR2 instanceof n5t) {
                    h1d1VarR2 = ((n5t) h1d1VarR2).a();
                }
            }
            h1d1Var = h1d1VarR2;
        }
        return en31Var;
    }

    public final void d() {
        this.n = false;
        this.o = true;
    }
}
