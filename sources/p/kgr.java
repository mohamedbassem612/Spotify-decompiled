package p;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kgr extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mgr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kgr(mgr mgrVar, byte b) {
        super(0);
        this.a = b;
        this.b = mgrVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mgr mgrVar = this.b;
        switch (b) {
            case 0:
                cp31 cp31Var = mgrVar.c;
                mgrVar.d.c = 1;
                gh7 gh7Var = mgrVar.g;
                if (gh7Var != null) {
                    int currentItem = ((ViewPager2) cp31Var.d).getCurrentItem() < p7h.L(gh7Var.a) ? ((ViewPager2) cp31Var.d).getCurrentItem() + 1 : 0;
                    ((ViewPager2) cp31Var.d).setCurrentItem(currentItem);
                    mgrVar.b(currentItem, gh7Var.b);
                }
                break;
            default:
                gh7 gh7Var2 = mgrVar.g;
                if (gh7Var2 != null) {
                    mgrVar.a(gh7Var2);
                }
                break;
        }
        return rih1Var;
    }
}
