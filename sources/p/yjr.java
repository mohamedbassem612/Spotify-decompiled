package p;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yjr extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ akr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yjr(akr akrVar, byte b) {
        super(0);
        this.a = b;
        this.b = akrVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        akr akrVar = this.b;
        switch (b) {
            case 0:
                dg30 dg30Var = akrVar.a;
                return Integer.valueOf(Math.min(dg30Var.getResources().getDimensionPixelSize(2131165563), dg30Var.getResources().getDisplayMetrics().widthPixels));
            case 1:
                if (akrVar.c()) {
                    akrVar.x = new gxb(2);
                    akrVar.z.add(akrVar.e.b());
                    akrVar.l(5);
                }
                return rih1Var;
            case 2:
                if (akrVar.c()) {
                    akrVar.x = new gxb(2);
                    akrVar.z.add(akrVar.e.b());
                    akrVar.l(5);
                }
                return rih1Var;
            default:
                return (ViewGroup) akrVar.a.getWindow().getDecorView();
        }
    }
}
