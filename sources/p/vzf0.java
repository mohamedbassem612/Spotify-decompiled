package p;

import android.os.Build;
import android.view.ViewGroup;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutFragmentContainerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vzf0 {
    public static final boolean k;
    public final MainLayout a;
    public final idd1 b = new idd1(new tzf0(this, 0));
    public final odn0 c;
    public final odn0 d;
    public final ce0 e;
    public final ce0 f;
    public final ce0 g;
    public final ce0 h;
    public static final /* synthetic */ mma0[] j = {new een0(vzf0.class, "originalSystemBarsInsets", "getOriginalSystemBarsInsets()Landroidx/core/graphics/Insets;", 0), new een0(vzf0.class, "lastCalculatedMainLayoutBottomInset", "getLastCalculatedMainLayoutBottomInset()I", 0), new een0(vzf0.class, "lastCalculatedMainLayoutBottomTouchOverlap", "getLastCalculatedMainLayoutBottomTouchOverlap()I", 0), new een0(vzf0.class, "lastCalculatedOverlayBottomInset", "getLastCalculatedOverlayBottomInset()I", 0)};
    public static final hwb i = new hwb((byte) 15);

    static {
        k = Build.VERSION.SDK_INT >= 30;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vzf0(MainLayout mainLayout) {
        this.a = mainLayout;
        odn0 odn0Var = new odn0((byte) 0);
        gfn0 gfn0Var = new gfn0();
        odn0Var.b = gfn0Var;
        odn0Var.c = new gfn0();
        odn0Var.d = new gfn0();
        odn0Var.e = new gfn0();
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(mainLayout);
        if (hsl1VarA != null) {
            nk80 nk80VarI = hsl1VarA.a.i(519);
            mn20 mn20Var = new mn20(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
            if (!u890.j(gfn0Var.e(), mn20Var)) {
                gfn0Var.f(mn20Var);
            }
        }
        this.c = odn0Var;
        this.d = odn0Var;
        uzf0 uzf0Var = new uzf0(this, (byte) 3);
        i.getClass();
        this.e = new ce0(nk80.e, uzf0Var, (byte) 15);
        this.f = new ce0(0, new uzf0(this, (byte) 0), (byte) 15);
        this.g = new ce0(0, new uzf0(this, (byte) 1), (byte) 15);
        this.h = new ce0(0, new uzf0(this, (byte) 2), (byte) 15);
    }

    public final nk80 a() {
        mma0 mma0Var = j[0];
        return (nk80) ((sgp0) this.e).a;
    }

    public final void b() {
        int iMax;
        MainLayout mainLayout = this.a;
        boolean zBooleanValue = ((Boolean) mainLayout.N1.getValue()).booleanValue();
        mma0[] mma0VarArr = j;
        if (zBooleanValue) {
            iMax = 0;
        } else {
            int i2 = a().d;
            mma0 mma0Var = mma0VarArr[2];
            iMax = Math.max(i2, ((Number) ((sgp0) this.g).a).intValue());
        }
        MainLayoutFragmentContainerView fragmentContainer = mainLayout.getFragmentContainer();
        fragmentContainer.setPadding(fragmentContainer.getPaddingLeft(), fragmentContainer.getPaddingTop(), fragmentContainer.getPaddingRight(), iMax);
        int i3 = mainLayout.getMode() == qyf0.b ? 0 : a().b;
        mma0 mma0Var2 = mma0VarArr[1];
        int iIntValue = ((Number) ((sgp0) this.f).a).intValue() - iMax;
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        gfn0 gfn0Var = (gfn0) this.c.c;
        nk80 nk80VarC = nk80.c(0, i3, 0, iIntValue);
        mn20 mn20Var = new mn20(nk80VarC.a, nk80VarC.b, nk80VarC.c, nk80VarC.d);
        if (!u890.j(gfn0Var.e(), mn20Var)) {
            gfn0Var.f(mn20Var);
        }
        MainLayoutFragmentContainerView fragmentContainer2 = mainLayout.getFragmentContainer();
        WeakHashMap weakHashMap = b8k1.a;
        fragmentContainer2.requestApplyInsets();
    }

    public final void c() {
        gfn0 gfn0Var = (gfn0) this.c.d;
        int i2 = a().b;
        mma0 mma0Var = j[3];
        nk80 nk80VarC = nk80.c(0, i2, 0, ((Number) ((sgp0) this.h).a).intValue());
        mn20 mn20Var = new mn20(nk80VarC.a, nk80VarC.b, nk80VarC.c, nk80VarC.d);
        if (!u890.j(gfn0Var.e(), mn20Var)) {
            gfn0Var.f(mn20Var);
        }
        ViewGroup fragmentOverlayContainer = this.a.getFragmentOverlayContainer();
        WeakHashMap weakHashMap = b8k1.a;
        fragmentOverlayContainer.requestApplyInsets();
    }
}
