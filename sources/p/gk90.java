package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gk90 extends hab0 implements zu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ zu30 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk90(iu30 iu30Var, zu30 zu30Var) {
        super(4);
        this.c = iu30Var;
        this.b = zu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        zu30 zu30Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj3).intValue();
                return (n8h1) zu30Var.J(new yml0(Integer.valueOf(iIntValue), (String) iu30Var.invoke(obj), (r6h1) obj4), obj, obj2, Integer.valueOf(iIntValue));
            default:
                iu30 iu30Var2 = (iu30) obj4;
                return new h5t0((isw) zu30Var.J((d75) obj, (Context) obj2, (ViewGroup) obj3, iu30Var2), iu30Var, iu30Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk90(zu30 zu30Var, iu30 iu30Var) {
        super(4);
        this.b = zu30Var;
        this.c = iu30Var;
    }
}
