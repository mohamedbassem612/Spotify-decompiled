package p;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wft implements Function0 {
    public final /* synthetic */ byte a;
    public final xft b;

    public /* synthetic */ wft(xft xftVar, byte b) {
        this.a = b;
        this.b = xftVar;
    }

    public final Object invoke() {
        byte b = this.a;
        xft xftVar = this.b;
        switch (b) {
            case 0:
                return bpi1.d(xftVar.y());
            default:
                lpr0 lpr0VarY = xftVar.y();
                lft lftVar = xftVar.a;
                if (lpr0VarY instanceof rob0) {
                    rob0 rob0VarG = bpi1.g(lftVar);
                    rka0 rka0Var = lftVar.b;
                    if (u890.j(rob0VarG, lpr0VarY) && (rka0Var.d || lftVar.t().getKind() == 2)) {
                        n9r n9rVarT = rka0Var.a;
                        if (n9rVarT == null) {
                            n9rVarT = lftVar.t();
                        }
                        Class clsP = bpi1.p((beg) n9rVarT.k());
                        if (clsP != null) {
                            return clsP;
                        }
                        mna0.d(lpr0VarY, "Cannot determine receiver Java type of inherited declaration: ");
                        return null;
                    }
                }
                return (Type) lftVar.getCaller().a().get(xftVar.b);
        }
    }
}
