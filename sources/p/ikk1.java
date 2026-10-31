package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ikk1 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ jkk1 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ikk1(jkk1 jkk1Var, byte b) {
        this.b = b;
        nk80 nk80Var = nk80.e;
        this.c = jkk1Var;
        switch (b) {
            case 1:
                super(nk80Var);
                break;
            case 2:
            default:
                super(nk80Var);
                break;
            case 3:
                super((Object) null);
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        View view;
        View view2;
        byte b = this.b;
        jkk1 jkk1Var = this.c;
        switch (b) {
            case 0:
                if (!u890.j((nk80) obj, (nk80) obj2)) {
                    jkk1Var.f();
                }
                break;
            case 1:
                if (!u890.j((nk80) obj, (nk80) obj2)) {
                    jkk1Var.f();
                }
                break;
            case 2:
                if (!u890.j((Function0) obj, (Function0) obj2)) {
                    jkk1Var.f();
                }
                break;
            default:
                View.OnLayoutChangeListener onLayoutChangeListener = jkk1Var.s;
                wzf0 wzf0Var = (wzf0) obj2;
                wzf0 wzf0Var2 = (wzf0) obj;
                if (wzf0Var2 != null && (view2 = wzf0Var2.a) != null) {
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                if (jkk1Var.c.b().a(w8c0.d) && wzf0Var != null && (view = wzf0Var.a) != null) {
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikk1(bkk1 bkk1Var, jkk1 jkk1Var) {
        super(bkk1Var);
        this.b = (byte) 2;
        this.c = jkk1Var;
    }
}
