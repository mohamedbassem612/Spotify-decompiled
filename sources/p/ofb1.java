package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ofb1 implements ml90 {
    public final boolean a;
    public final boolean b;
    public final abm c;
    public final jq4 d;
    public final vbs e;

    public ofb1(boolean z, boolean z2, abm abmVar, jq4 jq4Var, vbs vbsVar) {
        this.a = z;
        this.b = z2;
        this.c = abmVar;
        this.d = jq4Var;
        this.e = vbsVar;
    }

    public final Set create() {
        xj61 xj61Var = new xj61();
        jd11 jd11Var = rc11.a;
        xj61Var.add(new ll90(4, jd11Var.b(xkk1.class)));
        xj61Var.add(new ll90(4, jd11Var.b(hll.class)));
        if (this.d.o()) {
            xj61Var.add(new ll90(4, jd11Var.b(jo70.class)));
        }
        boolean z = this.e.g;
        boolean z2 = this.b;
        if (z2 || z) {
            xj61Var.add(new ll90(4, jd11Var.b(mtl.class)));
        }
        if ((this.a && z2) || z) {
            xj61Var.add(new ll90(4, jd11Var.b(dxc0.class)));
        }
        if (this.c.a()) {
            xj61Var.add(new ll90(4, jd11Var.b(bql.class)));
        }
        return cwl1.j(xj61Var);
    }
}
