package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vvg1 implements wpl, cba {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final cr20 d;
    public final cr20 e;
    public final cr20 f;

    public vvg1(hba hbaVar, hx61 hx61Var) {
        this.a = hx61Var.f();
        this.c = hx61Var.e();
        fba fbaVarC0 = hx61Var.d().c0();
        this.d = (cr20) fbaVarC0;
        fba fbaVarC1 = hx61Var.b().c0();
        this.e = (cr20) fbaVarC1;
        fba fbaVarC2 = hx61Var.c().c0();
        this.f = (cr20) fbaVarC2;
        hbaVar.d(fbaVarC0);
        hbaVar.d(fbaVarC1);
        hbaVar.d(fbaVarC2);
        fbaVarC0.a(this);
        fbaVarC1.a(this);
        fbaVarC2.a(this);
    }

    @Override // p.cba
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((cba) arrayList.get(i)).a();
            i++;
        }
    }

    public final void d(cba cbaVar) {
        this.b.add(cbaVar);
    }

    @Override // p.wpl
    public final void b(List list, List list2) {
    }
}
