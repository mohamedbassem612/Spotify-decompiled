package p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dcr0 implements iac0, sck1 {
    public boolean X;
    public boolean Y;
    public final rck1 a;
    public final nxq0 b;
    public final jhl c;
    public final rck1 d;
    public final iac0 e;
    public final iac0 f;
    public final idd1 g;
    public final String h;
    public final o2r0 i;
    public boolean t;

    public dcr0(ecr0 ecr0Var, ebr0 ebr0Var, Parcelable parcelable, Function0 function0, Bundle bundle, x8c0 x8c0Var, Object obj, rck1 rck1Var) {
        String string;
        this.a = rck1Var;
        nxq0 nxq0Var = new nxq0();
        this.b = nxq0Var;
        tac0 tac0Var = nxq0Var.a;
        jhl jhlVarP = x8c0Var != null ? ha71.p(tac0Var, x8c0Var) : null;
        this.c = jhlVarP;
        iac0 iac0Var = jhlVarP != null ? jhlVarP : nxq0Var;
        this.d = rck1Var == null ? new rck1() : rck1Var;
        kya1 kya1VarX = t4n1.x(iac0Var);
        iac0 iac0VarB = kya1VarX.b();
        this.e = iac0VarB;
        this.f = kya1VarX.a();
        ((nxq0) iac0VarB).a.a(new bcr0(this));
        this.g = new idd1(new ccr0(ebr0Var, function0, this, ecr0Var, parcelable, obj));
        this.h = (bundle == null || (string = bundle.getString("page-id")) == null) ? UUID.randomUUID().toString() : string;
        b().b(bundle != null ? bundle.getBundle("instrumentation-state") : null);
        tac0Var.i(w8c0.b);
        b().a(g7r0.c);
        this.i = c().b().h(d().h, bundle != null ? bundle.getBundle("datasource-state") : null);
        b().a(f7r0.c);
        tac0Var.i(w8c0.c);
        this.t = true;
    }

    public final void a() {
        this.Y = true;
        g();
        s7r0 s7r0VarD = d();
        s7r0VarD.e.dispose();
        s7r0VarD.a().dispose();
        this.b.a.i(w8c0.a);
        jhl jhlVar = this.c;
        if (jhlVar != null) {
            x8c0 x8c0Var = jhlVar.a;
            ek2 ek2Var = jhlVar.d;
            x8c0Var.d(ek2Var);
            jhlVar.b.d(ek2Var);
        }
    }

    public final c7r0 b() {
        return d().a();
    }

    public final h0r0 c() {
        return d().b();
    }

    public final s7r0 d() {
        return (s7r0) this.g.getValue();
    }

    public final Bundle e() {
        return mno1.h(new mmr0[]{oqn1.n("page-id", this.h), oqn1.n("datasource-state", this.i.k().serialize()), oqn1.n("instrumentation-state", b().d())});
    }

    public final void f() {
        if (this.Y) {
            eg.m("Can't restart a page runtime after it has been destroyed");
            return;
        }
        if (this.t) {
            this.t = false;
            b().a(i7r0.c);
        }
        if (this.X) {
            return;
        }
        this.b.a.i(w8c0.e);
        this.i.k().getState().f(this, new qpj0(this, (byte) 5));
        this.X = true;
    }

    public final void g() {
        if (this.X) {
            this.b.a.i(w8c0.c);
            this.X = false;
        }
    }

    public final x8c0 getLifecycle() {
        return this.f.getLifecycle();
    }

    public final rck1 o() {
        return this.d;
    }

    public /* synthetic */ dcr0(ecr0 ecr0Var, ebr0 ebr0Var, Parcelable parcelable, Function0 function0, Bundle bundle, x8c0 x8c0Var, rck1 rck1Var, int i) {
        this(ecr0Var, ebr0Var, parcelable, function0, bundle, (i & 32) != 0 ? null : x8c0Var, rih1.a, (i & 128) != 0 ? null : rck1Var);
    }
}
