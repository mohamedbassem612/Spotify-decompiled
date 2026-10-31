package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class edh implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ edh(Function0 function0, Function0 function1, Function0 function2, byte b) {
        this.a = b;
        this.b = function0;
        this.c = function1;
        this.d = function2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        Function0 function0 = this.d;
        Function0 function1 = this.c;
        Function0 function2 = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                l811 l811Var = new l811();
                Object objD = rqd1.d(nav0Var, (iu30) null, new ddh(function2, l811Var), new b7c(l811Var, function1, null, (byte) 11), new vj0(function0, (byte) 19), lnmVar, 1);
                return objD == d9nVar ? objD : rih1Var;
            case 1:
                Object objS = smo1.s(new fj31(this.b, this.c, this.d, nav0Var, (lnm) null), lnmVar);
                return objS == d9nVar ? objS : rih1Var;
            case 2:
                Object objD2 = rqd1.d(nav0Var, new hii0(function2, (byte) 21), new hii0(function1, (byte) 22), (xu30) null, new hii0(function0, (byte) 23), lnmVar, 4);
                return objD2 == d9nVar ? objD2 : rih1Var;
            default:
                Object objS2 = smo1.s(new fj31(nav0Var, this.b, this.c, this.d, (lnm) null), lnmVar);
                return objS2 == d9nVar ? objS2 : rih1Var;
        }
    }
}
