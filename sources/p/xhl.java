package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xhl extends uhl {
    public fp8 d;
    public int e;
    public final ArrayList f;

    public xhl() {
        super(null);
        this.e = 0;
        this.f = new ArrayList();
    }

    public static qim0 j(qim0 qim0Var, ihl ihlVar, iu30 iu30Var) {
        return qim0Var.then(new whl(ihlVar, iu30Var));
    }

    public final ihl k() {
        int i = this.e;
        this.e = i + 1;
        ArrayList arrayList = this.f;
        ihl ihlVar = (ihl) o7h.t0(i, arrayList);
        if (ihlVar != null) {
            return ihlVar;
        }
        ihl ihlVar2 = new ihl(Integer.valueOf(this.e));
        arrayList.add(ihlVar2);
        return ihlVar2;
    }

    public final fp8 l() {
        fp8 fp8Var = this.d;
        if (fp8Var != null) {
            return fp8Var;
        }
        fp8 fp8Var2 = new fp8(this, (byte) 27);
        this.d = fp8Var2;
        return fp8Var2;
    }

    public final void m() {
        this.a.e.clear();
        this.c = 1000;
        this.b = 0;
        this.e = 0;
    }
}
