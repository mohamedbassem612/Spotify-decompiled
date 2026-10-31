package p;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b60 extends af30 {
    public final /* synthetic */ View X;
    public final /* synthetic */ byte t = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b60(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.X = actionMenuItemView;
    }

    @Override // p.af30
    public final gc81 b() {
        d60 d60Var;
        byte b = this.t;
        Object obj = this.X;
        switch (b) {
            case 0:
                c60 c60Var = ((ActionMenuItemView) obj).Q0;
                if (c60Var == null || (d60Var = ((e60) c60Var).a.R0) == null) {
                    return null;
                }
                return d60Var.a();
            default:
                d60 d60Var2 = ((f60) obj).d.Q0;
                if (d60Var2 == null) {
                    return null;
                }
                return d60Var2.a();
        }
    }

    @Override // p.af30
    public final boolean c() {
        gc81 gc81VarB;
        byte b = this.t;
        Object obj = this.X;
        switch (b) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) obj;
                lsi0 lsi0Var = actionMenuItemView.O0;
                return lsi0Var != null && lsi0Var.a(actionMenuItemView.i) && (gc81VarB = b()) != null && gc81VarB.a();
            default:
                ((f60) obj).d.l();
                return true;
        }
    }

    @Override // p.af30
    public boolean d() {
        switch (this.t) {
            case 1:
                g60 g60Var = ((f60) this.X).d;
                if (g60Var.S0 != null) {
                    return false;
                }
                g60Var.j();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b60(f60 f60Var, f60 f60Var2) {
        super(f60Var2);
        this.X = f60Var;
    }
}
