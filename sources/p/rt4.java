package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rt4 implements pdy0 {
    public final boolean a;
    public final qt4 b;
    public final luk c;
    public final idd1 d = new idd1(new rq4(this, (byte) 29));

    public rt4(boolean z, qt4 qt4Var, luk lukVar) {
        this.a = z;
        this.b = qt4Var;
        this.c = lukVar;
    }

    public final boolean a() {
        rt4 rt4Var = (rt4) this.d.getValue();
        return rt4Var != null ? rt4Var.a() : this.a;
    }

    public final qt4 b() {
        qt4 qt4VarB;
        rt4 rt4Var = (rt4) this.d.getValue();
        return (rt4Var == null || (qt4VarB = rt4Var.b()) == null) ? this.b : qt4VarB;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("player_reuse_enabled", "android-multiplayer", a());
        String str = b().a;
        qt4[] qt4VarArrValues = qt4.values();
        ArrayList arrayList = new ArrayList(qt4VarArrValues.length);
        for (qt4 qt4Var : qt4VarArrValues) {
            arrayList.add(qt4Var.a);
        }
        return p7h.M(fpbVar, new fpb("stream_reporting_mode", "android-multiplayer", str, arrayList));
    }
}
