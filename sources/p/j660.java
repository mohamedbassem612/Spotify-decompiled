package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class j660 extends dil implements od10 {
    public final ynb1 k0;
    public final int l0;
    public final ArrayList m0;

    public j660(ynb1 ynb1Var, int i) {
        super(ynb1Var);
        this.m0 = new ArrayList();
        this.k0 = ynb1Var;
        this.l0 = i;
    }

    public final void X(Object... objArr) {
        Collections.addAll(this.m0, objArr);
    }

    public final void Y() {
        super.apply();
    }

    public l660 Z() {
        return null;
    }

    @Override // p.dil, p.u811
    public final cjl b() {
        return Z();
    }

    @Override // p.dil, p.u811, p.od10
    public void apply() {
    }
}
