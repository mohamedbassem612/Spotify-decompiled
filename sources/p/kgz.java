package p;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kgz extends eeg {
    /* JADX WARN: Illegal instructions before constructor call */
    public kgz(ajn0 ajn0Var) {
        bkz bkzVar = bkz.a;
        yhz yhzVar = bkz.b;
        noe0 noe0Var = voe0.e;
        List list = z6x.a;
        super(yhzVar, ajn0Var, 3, 1, list, noe0Var);
        xdg xdgVar = new xdg(this, null, rzs0.g, true, 1, mka1.m0);
        xdgVar.K1(list, mht.e);
        wiz wizVarA = bkz.a(9, false, (String[]) Arrays.copyOf(new String[]{xdgVar.getName().a, ""}, 2));
        zjz zjzVar = zjz.V0;
        xdgVar.h = new wjz(bkz.c(zjzVar, new String[0]), wizVarA, zjzVar, list, false, new String[0]);
        r0(wizVarA, Collections.singleton(xdgVar), xdgVar);
    }

    @Override // p.wim0
    public final zpi0 f(j1h1 j1h1Var, g8b0 g8b0Var) {
        String[] strArr = {getName().a, j1h1Var.toString()};
        bkz bkzVar = bkz.a;
        return bkz.a(9, false, (String[]) Arrays.copyOf(strArr, 2));
    }

    @Override // p.eeg
    public final String toString() {
        return getName().b();
    }

    @Override // p.y5, p.apc1
    public final p9r d(l1h1 l1h1Var) {
        return this;
    }

    @Override // p.y5
    /* JADX INFO: renamed from: o0 */
    public final beg d(l1h1 l1h1Var) {
        return this;
    }
}
