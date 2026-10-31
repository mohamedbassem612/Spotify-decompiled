package p;

import android.view.KeyEvent;
import android.view.View;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q0t implements View.OnKeyListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q0t(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wyr wyrVar = (wyr) obj;
                inl1 inl1Var = (inl1) wyrVar.f;
                if (keyEvent.getAction() != 1) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    i2 = -1;
                } else {
                    if (keyCode != 22) {
                        return false;
                    }
                    i2 = 1;
                }
                int i3 = inl1Var.i + i2;
                if (i3 < 0 && i3 >= inl1Var.e()) {
                    return false;
                }
                wyrVar.b((inl1Var.f * i3) + inl1Var.d, true);
                return true;
            case 1:
                keyEvent.getClass();
                if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                ((iu30) obj).invoke(tg20.b);
                return true;
            default:
                g931 g931Var = (g931) obj;
                if (keyEvent.getAction() == 0 && i == 20) {
                    GridRecyclerView gridRecyclerView = (GridRecyclerView) g931Var.b;
                    View viewD = gridRecyclerView.m0getLayoutManager().D(gridRecyclerView.m0getLayoutManager().f1());
                    if (viewD != null) {
                        return viewD.requestFocus();
                    }
                    return false;
                }
                if (keyEvent.getAction() != 1) {
                    return false;
                }
                if (i != 66 && i != 23) {
                    return false;
                }
                ((b0m) g931Var.d).invoke();
                return true;
        }
    }
}
