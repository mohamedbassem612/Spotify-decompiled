package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class onc0 implements shh0 {
    public final ynb0 a;
    public final ynb0 b;
    public final ue4 c;

    public onc0(ynb0 ynb0Var, ynb0 ynb0Var2, agc0 agc0Var, ue4 ue4Var) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ue4Var;
    }

    @Override // p.shh0
    public final boolean a(r9c r9cVar) {
        blc0 blc0Var;
        String strE = r9cVar.e();
        if (nhc1.Y(strE, "spotify:list:", false) || sto1.m(strE)) {
            return true;
        }
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(strE);
        v5b1 v5b1Var = s4b1VarX.d;
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e) || (blc0Var = s4b1VarX.c) == blc0.ALBUM || blc0Var == blc0.LOCAL_FILES_ROOT || blc0Var == blc0.SHOW_SHOW;
    }

    @Override // p.shh0
    public final rhh0 b() {
        return (rhh0) (this.c.c() ? this.b : this.a).get();
    }
}
