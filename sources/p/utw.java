package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class utw extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ utw(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        super(4);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj3;
                iu30 iu30Var = (iu30) obj4;
                jsw jswVar = (jsw) obj6;
                Object obj7 = this.e;
                return new ttw(viewGroup, this.b, jswVar, iu30Var, (d75) obj, (Context) obj2, (ViewGroup.LayoutParams) obj5, obj7);
            default:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                x340 x340Var = (b0k) obj3;
                ((Number) obj4).intValue();
                cd5 cd5Var = ((wa5) obj).a;
                if (zBooleanValue == this.b && cd5Var.a().a.P0() == cd5Var.a().d.getValue()) {
                    ((iu30) obj6).invoke(bool);
                }
                if (zBooleanValue) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1319282111);
                    ((j2i) obj5).invoke(x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1319249220);
                    ((j2i) this.e).invoke(x340Var3, 0);
                    x340Var3.r(false);
                }
                return rih1.a;
        }
    }
}
