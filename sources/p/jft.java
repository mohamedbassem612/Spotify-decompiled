package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jft implements Function0 {
    public final /* synthetic */ byte a;
    public final lft b;

    public /* synthetic */ jft(lft lftVar, byte b) {
        this.a = b;
        this.b = lftVar;
    }

    public final Object invoke() {
        byte b = this.a;
        lft lftVar = this.b;
        switch (b) {
            case 0:
                return lftVar.n(true);
            case 1:
                return fc11.N(lftVar) ? lftVar.n(false) : lftVar.f();
            case 2:
                oma0 oma0Var = lftVar.b.b.a(1, lftVar.s()).b;
                if (oma0Var != null) {
                    return oma0Var;
                }
                sh10.e(lftVar.getName());
                throw null;
            default:
                List<y0h1> typeParameters = lftVar.t().getTypeParameters();
                ArrayList arrayList = new ArrayList(q7h.U(typeParameters, 10));
                for (y0h1 y0h1Var : typeParameters) {
                    y0h1Var.getClass();
                    arrayList.add(new qma0(lftVar, y0h1Var, lftVar.b.b));
                }
                return arrayList;
        }
    }
}
