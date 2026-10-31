package p;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/haa;", "Lp/dwb;", "<init>", "()V", "src_main_java_com_spotify_bottomsheet_core-core"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public abstract class haa extends dwb {
    public final idd1 V1 = new idd1(new vv8(this, (byte) 9));
    public final boolean W1 = true;
    public final boolean X1 = true;

    @Override // p.zf30
    public void I0(View view, Bundle bundle) {
        CoordinatorLayout coordinatorLayout;
        cwb cwbVar;
        if (this.X1) {
            View view2 = this.j1;
            Iterator it = z561.c0(fr9.e1, view2 instanceof ViewGroup ? (ViewGroup) view2 : null).iterator();
            do {
                if (!it.hasNext()) {
                    coordinatorLayout = null;
                    break;
                } else {
                    ViewGroup viewGroup = (ViewGroup) it.next();
                    coordinatorLayout = viewGroup instanceof CoordinatorLayout ? (CoordinatorLayout) viewGroup : null;
                }
            } while (coordinatorLayout == null);
            if (coordinatorLayout != null && (cwbVar = (cwb) this.Q1) != null) {
                View view3 = this.j1;
                ViewGroup viewGroup2 = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                if (viewGroup2 != null) {
                    coordinatorLayout.addView(new s4n(cwbVar.g(), viewGroup2));
                }
            }
        }
        rwq0.s(view.getRootView(), new gaa(this, (byte) 0));
    }

    @Override // p.t2u
    public final Dialog a1() {
        return (cwb) this.Q1;
    }

    @Override // p.t2u
    public final int b1() {
        return 2132017486;
    }

    @Override // p.dwb, p.bk5, p.t2u
    public final Dialog c1(Bundle bundle) {
        t4n t4nVar = new t4n(P0(), new y52(0, this, haa.class, "allowDismissal", "allowDismissal()Z", 0, (byte) 1));
        k1(t4nVar);
        return t4nVar;
    }

    @Override // p.t2u
    public final void g1(th30 th30Var, String str) {
        c97.k(th30Var, this);
        super.g1(th30Var, str);
    }

    @Override // p.t2u
    public final void h1(th30 th30Var, String str) {
        c97.k(th30Var, this);
        super.h1(th30Var, str);
    }

    public boolean i1() {
        return true;
    }

    /* JADX INFO: renamed from: j1, reason: from getter */
    public boolean getW1() {
        return this.W1;
    }

    public abstract void m1(nk80 nk80Var);

    @Override // p.t2u, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        l1();
    }

    public void l1() {
    }

    public void k1(t4n t4nVar) {
    }
}
