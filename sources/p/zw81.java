package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zw81 extends e611 {
    public boolean g;

    public zw81() {
        this.a = null;
        this.b = new ArrayList();
        this.c = (byte) 120;
        this.d = (byte) 120;
        this.e = (short) 250;
        this.f = (short) 250;
        this.g = true;
    }

    @Override // p.e611
    public boolean a(w611 w611Var, w611 w611Var2, f3a f3aVar, f3a f3aVar2) {
        int i;
        int i2 = f3aVar.a;
        int i3 = f3aVar.b;
        if (w611Var2.C()) {
            i = f3aVar.a;
        } else {
            i = f3aVar2.a;
            f3aVar = f3aVar2;
        }
        return l(w611Var, w611Var2, i2, i3, i, f3aVar.b);
    }

    public abstract void k(w611 w611Var);

    public boolean l(w611 w611Var, w611 w611Var2, int i, int i2, int i3, int i4) {
        d(w611Var);
        d(w611Var2);
        return false;
    }

    public boolean m(w611 w611Var, int i, int i2, int i3, int i4) {
        if (w611Var == null) {
            return false;
        }
        d(w611Var);
        return false;
    }

    public abstract void n(w611 w611Var);
}
