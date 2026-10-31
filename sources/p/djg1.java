package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class djg1 extends cjg1 {
    public final /* synthetic */ y36 a;
    public final /* synthetic */ ejg1 b;

    public djg1(ejg1 ejg1Var, y36 y36Var) {
        this.b = ejg1Var;
        this.a = y36Var;
    }

    @Override // p.cjg1, p.ghg1
    public final void f(jhg1 jhg1Var) {
        ((ArrayList) this.a.get(this.b.b)).remove(jhg1Var);
        jhg1Var.G(this);
    }
}
