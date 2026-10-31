package p;

import android.view.ViewGroup;
import com.spotify.mainlayout.ui.view.MainLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d1g0 {
    public final MainLayout a;
    public final idd1 b = new idd1(new tzf0(this, 3));
    public final b1g0 c = new b1g0(new a1g0(false, false, false), this);
    public final b1g0 d = new b1g0(this, (byte) 1);
    public final b1g0 e = new b1g0(this, (byte) 2);
    public final b1g0 f = new b1g0(this);
    public boolean g;
    public static final /* synthetic */ mma0[] i = {new een0(d1g0.class, "overlayMode", "getOverlayMode()Lcom/spotify/mainlayout/ui/view/overlay/MainLayoutOverlayManager$OverlayMode;", 0), new een0(d1g0.class, "presentationMode", "getPresentationMode()Lcom/spotify/navigation/presentation/PresentationMode;", 0), new een0(d1g0.class, "pageSurroundingsProperty", "getPageSurroundingsProperty()Lcom/spotify/mainlayout/pageproperties/PageSurroundings;", 0), new een0(d1g0.class, "isOverlayTouchPassthroughActive", "isOverlayTouchPassthroughActive()Z", 0)};
    public static final q3c h = new q3c();

    public d1g0(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    public static final void c(ViewGroup viewGroup, boolean z) {
        viewGroup.setImportantForAccessibility(z ? 4 : 1);
        viewGroup.setDescendantFocusability(z ? 393216 : 262144);
    }

    public final a1g0 a() {
        mma0 mma0Var = i[0];
        return (a1g0) ((sgp0) this.c).a;
    }

    public final e6w0 b() {
        mma0 mma0Var = i[1];
        return (e6w0) ((sgp0) this.d).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void d() {
        boolean z;
        ViewGroup fragmentOverlayContainer = this.a.getFragmentOverlayContainer();
        if (a().a) {
            mma0 mma0Var = i[3];
            if (((Boolean) ((sgp0) this.f).a).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        fragmentOverlayContainer.setClickable(z);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    public final void e() {
        boolean z;
        boolean z2;
        int iOrdinal = this.a.getMode().ordinal();
        if (iOrdinal == 0) {
            z = true;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                eg.o();
                return;
            }
            z = true;
        } else {
            z = false;
        }
        mma0[] mma0VarArr = i;
        if (z) {
            mma0 mma0Var = mma0VarArr[2];
            hgr0 hgr0Var = (hgr0) ((sgp0) this.e).a;
            if (u890.j(hgr0Var != null ? hgr0Var.a : null, fgr0.a)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z3 = b() instanceof d6w0;
        boolean z4 = z3 && !z2;
        this.c.c(mma0VarArr[0], this, new a1g0(z3, z4, z ? z4 : z3));
    }
}
