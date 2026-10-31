package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class of90 implements htf {
    public static final of90 b = new of90(0);
    public static final of90 c = new of90(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ of90(byte b2) {
        this.a = b2;
    }

    @Override // p.htf
    public final boolean a(c8a0 c8a0Var) {
        qx81 qx81VarH0;
        switch (this.a) {
            case 0:
                tsi1 tsi1Var = (tsi1) c8a0Var.F().get(1);
                c9c c9cVar = wd11.c;
                tsi1Var.getClass();
                int i = kht.a;
                zim0 zim0VarC = iht.c(tsi1Var);
                c9cVar.getClass();
                beg begVarH = x1p1.h(zim0VarC, rfb1.R);
                if (begVarH == null) {
                    qx81VarH0 = null;
                } else {
                    e0h1.b.getClass();
                    qx81VarH0 = y3o1.h0(e0h1.c, begVarH, Collections.singletonList(new phb1((y0h1) o7h.V0(begVarH.g().getParameters()))));
                }
                if (qx81VarH0 == null) {
                    return false;
                }
                return c8b0.a.b(qx81VarH0, o1h1.g(tsi1Var.getType(), false));
            default:
                List<tsi1> listF = c8a0Var.F();
                if (!(listF instanceof Collection) || !listF.isEmpty()) {
                    for (tsi1 tsi1Var2 : listF) {
                        tsi1Var2.getClass();
                        if (kht.a(tsi1Var2) || tsi1Var2.X != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // p.htf
    public final /* bridge */ String b(c8a0 c8a0Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return gxo1.k(this, c8a0Var);
    }

    @Override // p.htf
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
