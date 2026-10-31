package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fqb0 implements Function0 {
    public final /* synthetic */ byte a;
    public final hqb0 b;

    public /* synthetic */ fqb0(hqb0 hqb0Var, byte b) {
        this.a = b;
        this.b = hqb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        hqb0 hqb0Var = this.b;
        switch (b) {
            case 0:
                if (kht.f(hqb0Var) == null) {
                    return null;
                }
                Object obj = hqb0Var.g.b;
                return null;
            case 1:
                mb11 mb11Var = hqb0Var.h;
                ArrayList<ac11> typeParameters = mb11Var.getTypeParameters();
                ArrayList arrayList = new ArrayList(q7h.U(typeParameters, 10));
                for (ac11 ac11Var : typeParameters) {
                    y0h1 y0h1VarB = ((b1h1) hqb0Var.t.c).b(ac11Var);
                    if (y0h1VarB == null) {
                        throw new AssertionError("Parameter " + ac11Var + " surely belongs to class " + mb11Var + ", so it must be resolved");
                    }
                    arrayList.add(y0h1VarB);
                }
                return arrayList;
            default:
                return bzn1.m(hqb0Var);
        }
    }
}
