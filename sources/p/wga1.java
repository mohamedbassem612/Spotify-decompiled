package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wga1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ug3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wga1(ug3 ug3Var, byte b) {
        super(4);
        this.a = b;
        this.b = ug3Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        ug3 ug3Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new zga1((String) ug3Var.e, (String) ug3Var.d);
            default:
                return new b14((Context) obj2, (iu30) obj4, ug3Var);
        }
    }
}
