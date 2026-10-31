package p;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class az6 extends r570 {
    public final /* synthetic */ byte a = 1;
    public final iac0 b;
    public final vx40 c;
    public final Object d;
    public final Object e;
    public final Object f;

    public az6(Scheduler scheduler, hjc hjcVar, da daVar, iac0 iac0Var, vx40 vx40Var) {
        this.d = scheduler;
        this.e = hjcVar;
        this.f = daVar;
        this.b = iac0Var;
        this.c = vx40Var;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131427610;
            default:
                return 2131428305;
        }
    }

    public final EnumSet c() {
        switch (this.a) {
            case 0:
                return EnumSet.of(ix40.h);
            default:
                return EnumSet.of(ix40.b);
        }
    }

    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
                d6l1 d6l1Var = new d6l1(linearLayout, this.b, (agx) obj3, (yfx) obj, this.c, (g23) obj2);
                if (!(linearLayout.getChildAt(0) instanceof RecyclerView)) {
                    linearLayout.removeViewAt(0);
                }
                return d6l1Var;
            default:
                return new obx((Scheduler) obj3, ((hjc) obj2).a((l0i) null), (da) obj, this.b, this.c);
        }
    }

    public az6(agx agxVar, g23 g23Var, iac0 iac0Var, vx40 vx40Var, yfx yfxVar) {
        this.d = agxVar;
        this.e = g23Var;
        this.b = iac0Var;
        this.c = vx40Var;
        this.f = yfxVar;
    }
}
