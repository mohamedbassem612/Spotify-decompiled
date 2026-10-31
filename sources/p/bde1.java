package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bde1 implements PointerInputEventHandler {
    public final /* synthetic */ y9e1 a;
    public final /* synthetic */ cde1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ iu30 g;

    public bde1(y9e1 y9e1Var, cde1 cde1Var, String str, Function0 function0, Function0 function1, Function0 function2, iu30 iu30Var) {
        this.a = y9e1Var;
        this.b = cde1Var;
        this.c = str;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = iu30Var;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        Function0 function0 = this.e;
        y9e1 y9e1Var = this.a;
        cde1 cde1Var = this.b;
        String str = this.c;
        tjf0 tjf0Var = new tjf0(y9e1Var, cde1Var, str, this.d, function0, (byte) 25);
        uzp0 uzp0Var = new uzp0(this.f, cde1Var, this.g, str, (byte) 1);
        fjc1 fjc1Var = new fjc1(cde1Var, (byte) 19);
        juc1 juc1Var = new juc1(y9e1Var, cde1Var, str, (byte) 10);
        float f = g5v.a;
        Object objD = s9p1.D(nav0Var, new z4v(tjf0Var, uzp0Var, fjc1Var, juc1Var, null), lnmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }
}
