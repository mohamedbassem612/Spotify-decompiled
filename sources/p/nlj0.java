package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nlj0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ug3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nlj0(ug3 ug3Var, byte b) {
        super(4);
        this.a = b;
        this.b = ug3Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        ug3 ug3Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(1933667100);
                xnj0 xnj0VarM = dzo1.m((w6e0) ug3Var.d, obj2, (tlj0) ug3Var.e, x340Var, iIntValue & 112);
                x340Var.r(false);
                return xnj0VarM;
            default:
                return new p9c((Context) obj2, (ViewGroup) obj3, ug3Var);
        }
    }
}
