package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yol1 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                yol1 yol1Var = (yol1) arrayList.get(i);
                if (this.e == yol1Var.b) {
                    c(this.c, yol1Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(yic0 yic0Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        djl djlVar = (djl) ((cjl) arrayList.get(0)).V;
        yic0Var.t();
        djlVar.c(yic0Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((cjl) arrayList.get(i2)).c(yic0Var, false);
        }
        if (i == 0 && djlVar.D0 > 0) {
            jhc1.m(djlVar, yic0Var, arrayList, 0);
        }
        if (i == 1 && djlVar.E0 > 0) {
            jhc1.m(djlVar, yic0Var, arrayList, 1);
        }
        try {
            yic0Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.d.add(new xgc((cjl) arrayList.get(i3), yic0Var));
        }
        if (i == 0) {
            iN = yic0.n(djlVar.J);
            iN2 = yic0.n(djlVar.L);
            yic0Var.t();
        } else {
            iN = yic0.n(djlVar.K);
            iN2 = yic0.n(djlVar.M);
            yic0Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, yol1 yol1Var) {
        int i2 = yol1Var.b;
        for (cjl cjlVar : this.a) {
            ArrayList arrayList = yol1Var.a;
            if (!arrayList.contains(cjlVar)) {
                arrayList.add(cjlVar);
            }
            if (i == 0) {
                cjlVar.s0 = i2;
            } else {
                cjlVar.t0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(" [");
        String strJ = gvg.j(sb, this.b, "] <");
        for (cjl cjlVar : this.a) {
            StringBuilder sbG = dv20.g(strJ, " ");
            sbG.append(cjlVar.k0);
            strJ = sbG.toString();
        }
        return strJ.concat(" >");
    }
}
