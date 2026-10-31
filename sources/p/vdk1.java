package p;

import android.R;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager2.widget.ViewPager2;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vdk1 {
    public final ltf1 a = new ltf1(this, (byte) 14);
    public final f2g1 b = new f2g1(this, (byte) 11);
    public rdk1 c;
    public final /* synthetic */ ViewPager2 d;

    public vdk1(ViewPager2 viewPager2) {
        this.d = viewPager2;
    }

    public boolean a() {
        return this instanceof vdk1;
    }

    public final boolean b(int i) {
        return i == 8192 || i == 4096;
    }

    public final void c(z511 z511Var) {
        m();
        if (z511Var != null) {
            z511Var.w(this.c);
        }
    }

    public final void d(z511 z511Var) {
        if (z511Var != null) {
            z511Var.z(this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(g570 g570Var) {
        g570Var.setImportantForAccessibility(2);
        this.c = new rdk1(this, (byte) 1);
        ViewPager2 viewPager2 = this.d;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    public final void f(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iE;
        int iE2;
        int iE3;
        ViewPager2 viewPager2 = this.d;
        if (viewPager2.getAdapter() == null) {
            iE = 0;
            iE2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iE = viewPager2.getAdapter().e();
            iE2 = 1;
        } else {
            iE2 = viewPager2.getAdapter().e();
            iE = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x5j1.h(iE, iE2, 0, false).b);
        z511 adapter = viewPager2.getAdapter();
        if (adapter == null || (iE3 = adapter.e()) == 0 || !viewPager2.U0) {
            return;
        }
        if (viewPager2.d > 0) {
            accessibilityNodeInfo.addAction(SemanticState.Multiline);
        }
        if (viewPager2.d < iE3 - 1) {
            accessibilityNodeInfo.addAction(SemanticState.Obscured);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    public final void g(int i, Bundle bundle) {
        if (!b(i)) {
            bhn0.w();
            return;
        }
        ViewPager2 viewPager2 = this.d;
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.U0) {
            viewPager2.e(currentItem, true);
        }
    }

    public final void h() {
        m();
    }

    public final void i() {
        m();
    }

    public final void j() {
        m();
    }

    public final void k() {
        m();
    }

    public final void l() {
        m();
    }

    public final void m() {
        int iE;
        ViewPager2 viewPager2 = this.d;
        int i = R.id.accessibilityActionPageLeft;
        b8k1.l(viewPager2, R.id.accessibilityActionPageLeft);
        b8k1.h(viewPager2, 0);
        b8k1.l(viewPager2, R.id.accessibilityActionPageRight);
        b8k1.h(viewPager2, 0);
        b8k1.l(viewPager2, R.id.accessibilityActionPageUp);
        b8k1.h(viewPager2, 0);
        b8k1.l(viewPager2, R.id.accessibilityActionPageDown);
        b8k1.h(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iE = viewPager2.getAdapter().e()) == 0 || !viewPager2.U0) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        f2g1 f2g1Var = this.b;
        ltf1 ltf1Var = this.a;
        if (orientation != 0) {
            if (viewPager2.d < iE - 1) {
                b8k1.m(viewPager2, new fg(R.id.accessibilityActionPageDown, (CharSequence) null), (CharSequence) null, ltf1Var);
            }
            if (viewPager2.d > 0) {
                b8k1.m(viewPager2, new fg(R.id.accessibilityActionPageUp, (CharSequence) null), (CharSequence) null, f2g1Var);
                return;
            }
            return;
        }
        boolean z = viewPager2.g.S() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.d < iE - 1) {
            b8k1.m(viewPager2, new fg(i2, (CharSequence) null), (CharSequence) null, ltf1Var);
        }
        if (viewPager2.d > 0) {
            b8k1.m(viewPager2, new fg(i, (CharSequence) null), (CharSequence) null, f2g1Var);
        }
    }
}
