package p;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pgf1 extends z511 {
    public final htr d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f;

    public pgf1(htr htrVar, lzn0 lzn0Var, vnd1 vnd1Var) {
        this.d = htrVar;
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        sparseArray.put(0, new omc0((byte) 1));
        sparseArray.put(1, new jay(new hcf1(1, this, pgf1.class, "formattedDate", "formattedDate(Ljava/util/Date;)Ljava/lang/String;", 0, (byte) 2), (byte) 1));
        sparseArray.put(2, new jay(new hcf1(1, this, pgf1.class, "formattedDate", "formattedDate(Ljava/util/Date;)Ljava/lang/String;", 0, (byte) 3), (byte) 0));
        sparseArray.put(3, new omc0((byte) 0));
        sparseArray.put(4, new xo21(lzn0Var, vnd1Var));
    }

    public final int e() {
        return this.e.size();
    }

    public final int g(int i) {
        return ((aik1) this.e.get(i)).a();
    }

    public final void n(int i, w611 w611Var) {
        bik1 bik1Var = (bik1) this.f.get(g(i));
        if (bik1Var != null) {
            bik1Var.b(w611Var, (aik1) this.e.get(i));
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        return ((bik1) this.f.get(i)).a(viewGroup);
    }
}
