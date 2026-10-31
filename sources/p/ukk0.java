package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ukk0 implements PointerInputEventHandler {
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ o95 b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    public ukk0(int i, Function0 function0, o95 o95Var, c9n c9nVar, ven0 ven0Var) {
        this.a = ven0Var;
        this.b = o95Var;
        this.c = c9nVar;
        this.d = function0;
        this.e = i;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        ven0 ven0Var = this.a;
        if (((Boolean) ven0Var.getValue()).booleanValue()) {
            qkk0 qkk0Var = qkk0.f;
            Function0 function0 = this.d;
            int i = this.e;
            o95 o95Var = this.b;
            c9n c9nVar = this.c;
            Object objL = g5v.l(nav0Var, qkk0Var, new lzm(i, function0, o95Var, c9nVar, ven0Var), new kpo(o95Var, c9nVar, (byte) 1), lnmVar);
            if (objL == d9n.a) {
                return objL;
            }
        }
        return rih1.a;
    }
}
