package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ny81 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ny81(Object obj, Object obj2, float f, float f2, Function0 function0, Object obj3, cv30 cv30Var, Object obj4, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = f;
        this.c = f2;
        this.d = function0;
        this.g = obj3;
        this.h = cv30Var;
        this.i = obj4;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.i;
        iu30 iu30Var = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                Object objD = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new my81((gb5) obj4, (pmg1) obj3, this.b, this.c, this.d, (c380) obj2, (vu30) iu30Var, (ss50) obj), lnmVar, 7);
                return objD == d9nVar ? objD : rih1Var;
            default:
                Object objD2 = s9p1.D(nav0Var, new ade1((y9e1) obj4, (cde1) obj3, this.b, this.c, this.d, (Function0) obj2, iu30Var, (String) obj, null), lnmVar);
                return objD2 == d9nVar ? objD2 : rih1Var;
        }
    }
}
