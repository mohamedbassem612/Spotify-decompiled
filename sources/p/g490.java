package p;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g490 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h490 b;

    public /* synthetic */ g490(h490 h490Var, byte b) {
        this.a = b;
        this.b = h490Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h490 h490Var = this.b;
                iac0 iac0Var = h490Var.f;
                if (iac0Var != null && !iac0Var.isFinishing() && !iac0Var.isDestroyed() && h490Var.d) {
                    if (!h490.b(iac0Var)) {
                        h490Var.c.removeCallbacks(h490Var.h);
                        String str = h490Var.b.a;
                        f490 f490Var = new f490(iac0Var, h490Var, (byte) 0);
                        f490 f490Var2 = new f490(iac0Var, h490Var, (byte) 1);
                        p350 p350Var = new p350(0, h490Var, h490.class, "cancel", "cancel()V", 0, (byte) 7);
                        ViewGroup viewGroup = (ViewGroup) iac0Var.getWindow().getDecorView();
                        View composeView = new ComposeView(iac0Var, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        iac0 z3uVar = new z3u((byte) 1);
                        iac0 iac0VarH = x9p1.h(viewGroup);
                        if (iac0VarH == null) {
                            iac0VarH = iac0Var instanceof iac0 ? iac0Var : null;
                            if (iac0VarH == null) {
                                iac0VarH = z3uVar;
                            }
                        }
                        iac0 iac0VarK = lap1.k(viewGroup);
                        if (iac0VarK == null) {
                            iac0VarK = iac0Var instanceof sck1 ? (sck1) iac0Var : null;
                            if (iac0VarK == null) {
                                iac0VarK = z3uVar;
                            }
                        }
                        iac0 iac0VarW = hm5.w(viewGroup);
                        if (iac0VarW == null) {
                            iac0 iac0Var2 = iac0Var instanceof qe41 ? (qe41) iac0Var : null;
                            iac0VarW = iac0Var2 == null ? z3uVar : iac0Var2;
                        }
                        x9p1.p(viewGroup, iac0VarH);
                        lap1.o(viewGroup, iac0VarK);
                        hm5.J(viewGroup, iac0VarW);
                        rl1 rl1Var = new rl1(composeView, viewGroup, z3uVar, (byte) 18);
                        composeView.setViewCompositionStrategy(f4x0.V0);
                        composeView.setTag(rl1Var);
                        composeView.setContent(new j2i(-362530737, new i490(str, f490Var, f490Var2, p350Var, (byte) 1), true));
                        viewGroup.addView(composeView, new FrameLayout.LayoutParams(0, 0));
                        h490Var.g = rl1Var;
                    } else {
                        h490Var.f = null;
                    }
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
