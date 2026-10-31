package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wb3 implements akj0 {
    public final abm a;

    public wb3(abm abmVar) {
        this.a = abmVar;
    }

    public final Set create() {
        xj61 xj61Var = new xj61();
        jd11 jd11Var = rc11.a;
        xj61Var.add(new umy(jd11Var.b(gh3.class)));
        xj61Var.add(new umy(jd11Var.b(xti0.class)));
        xj61Var.add(new umy(jd11Var.b(mm11.class)));
        xj61Var.add(new umy(jd11Var.b(s211.class)));
        if (this.a.a()) {
            xj61Var.add(new umy(jd11Var.b(bql.class)));
        }
        return cwl1.j(xj61Var);
    }
}
