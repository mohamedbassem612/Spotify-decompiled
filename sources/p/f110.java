package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f110 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ f110(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                m811 m811Var = new m811();
                Object objI = g5v.i(nav0Var, new c110(m811Var, (byte) 0), new d110(m811Var, function0, (byte) 0), new e110(m811Var, (byte) 0), lnmVar, 4);
                return objI == d9nVar ? objI : rih1Var;
            case 1:
                Object objD = rqd1.d(nav0Var, null, null, null, new ki5(function0, (byte) 4), lnmVar, 7);
                return objD == d9nVar ? objD : rih1Var;
            case 2:
                Object objD2 = rqd1.d(nav0Var, null, null, null, new hii0(function0, (byte) 26), lnmVar, 7);
                return objD2 == d9nVar ? objD2 : rih1Var;
            default:
                Object objD3 = rqd1.d(nav0Var, null, new izg1(function0, (byte) 2), null, null, lnmVar, 13);
                return objD3 == d9nVar ? objD3 : rih1Var;
        }
    }
}
