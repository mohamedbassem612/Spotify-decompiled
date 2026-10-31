package p;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class arb0 extends ryo1 {
    public final /* synthetic */ beg c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ iu30 e;

    public arb0(beg begVar, Set set, iu30 iu30Var) {
        this.c = begVar;
        this.d = set;
        this.e = iu30Var;
    }

    public final boolean q(Object obj) {
        beg begVar = (beg) obj;
        if (begVar == this.c) {
            return true;
        }
        zpi0 zpi0VarA0 = begVar.a0();
        if (!(zpi0VarA0 instanceof crb0)) {
            return true;
        }
        this.d.addAll((Collection) this.e.invoke(zpi0VarA0));
        return false;
    }
}
