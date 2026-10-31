package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sr9 implements PointerInputEventHandler {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public sr9(o95 o95Var, o95 o95Var2, float f, Function0 function0, c9n c9nVar) {
        this.d = o95Var;
        this.e = o95Var2;
        this.b = f;
        this.f = function0;
        this.c = c9nVar;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                tui1 tui1Var = (tui1) obj3;
                uv8 uv8Var = new uv8(tui1Var, (byte) 18);
                or9 or9Var = (or9) obj2;
                float f = this.b;
                c9n c9nVar = this.c;
                rr9 rr9Var = new rr9(tui1Var, or9Var, f, c9nVar, (ven0) obj);
                z77 z77Var = new z77(or9Var, c9nVar, (byte) 17);
                hj8 hj8Var = new hj8((Object) tui1Var, (Object) or9Var, (byte) 6);
                float f2 = g5v.a;
                Object objD = s9p1.D(nav0Var, new b5v(uv8Var, hj8Var, rr9Var, z77Var, (lnm) null, (byte) 1), lnmVar);
                if (objD != d9nVar) {
                    objD = rih1Var;
                }
                return objD == d9nVar ? objD : rih1Var;
            default:
                o95 o95Var = (o95) obj3;
                o95 o95Var2 = (o95) obj2;
                float f3 = this.b;
                c9n c9nVar2 = this.c;
                Object objI = g5v.i(nav0Var, (iu30) null, new rr9(o95Var, o95Var2, f3, (Function0) obj, c9nVar2), new wpg1(c9nVar2, o95Var, o95Var2, (byte) 29), lnmVar, 5);
                return objI == d9nVar ? objI : rih1Var;
        }
    }

    public sr9(tui1 tui1Var, or9 or9Var, float f, c9n c9nVar, ven0 ven0Var) {
        this.d = tui1Var;
        this.e = or9Var;
        this.b = f;
        this.c = c9nVar;
        this.f = ven0Var;
    }
}
