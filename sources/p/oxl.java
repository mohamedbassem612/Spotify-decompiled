package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oxl implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oxl(Object obj, float f, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        float f = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Object objH1 = ((j8d1) nav0Var).H1(new nxl((iu30) obj2, f, (Function0) obj, null), lnmVar);
                return objH1 == d9nVar ? objH1 : rih1Var;
            default:
                ven0 ven0Var = (ven0) obj2;
                Object objI = g5v.i(nav0Var, new bzm(ven0Var, (byte) 2), (Function0) null, new gf(f, ven0Var, (ven0) obj, (byte) 3), lnmVar, 6);
                return objI == d9nVar ? objI : rih1Var;
        }
    }
}
