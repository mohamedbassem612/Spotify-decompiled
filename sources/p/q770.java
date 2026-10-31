package p;

import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q770 implements c670 {
    public final /* synthetic */ byte a = 0;
    public final SparseArray b;

    public q770(mc70 mc70Var, e570 e570Var, z970 z970Var, ea70 ea70Var, ea70 ea70Var2, ea70 ea70Var3, fc70 fc70Var) {
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        sparseArray.append(u970.f, mc70Var);
        sparseArray.append(u970.g, e570Var);
        sparseArray.append(u970.h, z970Var);
        sparseArray.append(u970.i, ea70Var);
        sparseArray.append(u970.t, ea70Var2);
        sparseArray.append(u970.X, ea70Var3);
        sparseArray.append(u970.Y, fc70Var);
    }

    @Override // p.c670
    public final n570 a(int i) {
        byte b = this.a;
        SparseArray sparseArray = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (n570) sparseArray.get(i);
    }

    public q770(e570 e570Var, h770 h770Var, h770 h770Var2, k770 k770Var, i870 i870Var) {
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        sparseArray.append(r770.c, e570Var);
        sparseArray.append(r770.d, h770Var);
        sparseArray.append(r770.e, h770Var2);
        sparseArray.append(r770.f, k770Var);
        sparseArray.append(r770.g, i870Var);
    }

    public q770(s770 s770Var, p670 p670Var, l770 l770Var, p670 p670Var2, l770 l770Var2, w870 w870Var) {
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        sparseArray.append(x770.b, s770Var);
        sparseArray.append(x770.c, p670Var);
        sparseArray.append(x770.d, l770Var);
        sparseArray.append(x770.e, p670Var2);
        sparseArray.append(x770.f, l770Var2);
        sparseArray.append(x770.g, w870Var);
    }
}
