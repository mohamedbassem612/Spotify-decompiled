package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pkl {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final tv80 e;

    public pkl(int i, int i2, int i3, String str, tv80 tv80Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkl)) {
            return false;
        }
        pkl pklVar = (pkl) obj;
        return this.a == pklVar.a && this.b == pklVar.b && this.c == pklVar.c && u890.j(this.d, pklVar.d) && u890.j(this.e, pklVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
        tv80 tv80Var = this.e;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
