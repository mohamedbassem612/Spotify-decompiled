package p;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.icons.IconX;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tux0 {
    public final bjx a;
    public final y11 b;
    public final kvc1 c;
    public final r4u d;

    public tux0(bjx bjxVar, y11 y11Var, mtx0 mtx0Var) {
        this.a = bjxVar;
        this.b = y11Var;
        kvc1 kvc1Var = new kvc1(new hov0(mtx0Var, this, (byte) 4));
        this.c = kvc1Var;
        RecyclerView recyclerView = (RecyclerView) bjxVar.d;
        recyclerView.getRootView().getContext();
        int iQ = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        recyclerView.setAdapter(kvc1Var);
        new xic0((byte) 1).b(recyclerView);
        ConstraintLayout constraintLayout = (ConstraintLayout) bjxVar.b;
        rwq0.s(constraintLayout, new dvt0(this, (byte) 25));
        View[] viewArr = {(EncoreTextView) bjxVar.g, (EncoreTextView) bjxVar.c, (EncoreTextView) bjxVar.f};
        if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
            constraintLayout.addOnLayoutChangeListener(new x37(this, viewArr, (byte) 15));
        } else {
            mf20 mf20Var = new mf20(z561.U(xox0.t, z561.U(new v3v0(viewArr, (byte) 10), new i46(constraintLayout, (byte) 8))));
            while (mf20Var.hasNext()) {
                iQ += crn1.q((View) mf20Var.next());
            }
            mf20 mf20Var2 = new mf20(z561.f0(xox0.i, z561.T(xox0.h, new i46(new z4v(new mmr0(Integer.valueOf(constraintLayout.getHeight() - iQ), (Object) null), f46.I(viewArr), (lnm) null), (byte) 3))));
            while (mf20Var2.hasNext()) {
                ((View) mf20Var2.next()).setVisibility(8);
            }
        }
        ((IconX) this.a.e).setOnClickListener(new t230(mtx0Var, this, (byte) 29));
        this.d = r4u.c(new r4u[]{r4u.d(new ba40(rux0.b, (byte) 2), r4u.a(new mlw0(this.c, (byte) 5))), r4u.d(new ba40(sux0.b, (byte) 2), r4u.a(new vqv0(this.c, (byte) 5)))});
    }

    public final void a(xvx0 xvx0Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.a.b;
            constraintLayout.setAccessibilityPaneTitle(constraintLayout.getContext().getString(2131962999));
        }
        this.d.e(xvx0Var);
    }
}
