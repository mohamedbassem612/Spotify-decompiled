package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oyd1 extends v4n {
    public static final ArrayList i2 = p7h.O(new fyd1(2131954102, 2131954094, true), new fyd1(2131954104, 2131954096), new fyd1(2131954103, 2131954095));
    public ifb1 b2;
    public dkh c2;
    public ck20 d2;
    public cyd1 e2;
    public vnd1 f2;
    public ua91 g2;
    public boolean h2;

    public final void k1(t4n t4nVar) {
        BottomSheetBehavior bottomSheetBehaviorG = t4nVar.g();
        bottomSheetBehaviorG.L(3);
        bottomSheetBehaviorG.J(0);
        bottomSheetBehaviorG.t(new jph(this, (byte) 9));
    }

    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ua91 ua91VarK = ua91.K(layoutInflater, viewGroup);
        this.g2 = ua91VarK;
        rwq0.s(ua91VarK.H(), xi81.Z0);
        ua91 ua91Var = this.g2;
        if (ua91Var == null) {
            u890.C("binding");
            throw null;
        }
        ((RecyclerView) ua91Var.e).setLayoutManager(new LinearLayoutManager(1));
        ua91 ua91Var2 = this.g2;
        if (ua91Var2 == null) {
            u890.C("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) ua91Var2.e;
        cyd1 cyd1Var = this.e2;
        if (cyd1Var == null) {
            u890.C("termsAdapter");
            throw null;
        }
        recyclerView.setAdapter(cyd1Var);
        ua91 ua91Var3 = this.g2;
        if (ua91Var3 == null) {
            u890.C("binding");
            throw null;
        }
        ((RecyclerView) ua91Var3.e).setItemAnimator((e611) null);
        cyd1 cyd1Var2 = this.e2;
        if (cyd1Var2 == null) {
            u890.C("termsAdapter");
            throw null;
        }
        cyd1Var2.C(i2);
        cyd1 cyd1Var3 = this.e2;
        if (cyd1Var3 == null) {
            u890.C("termsAdapter");
            throw null;
        }
        cyd1Var3.w(new pn(this, (byte) 7));
        ua91 ua91Var4 = this.g2;
        if (ua91Var4 == null) {
            u890.C("binding");
            throw null;
        }
        ((EncoreButton) ua91Var4.c).setOnClickListener(new gl61(this, (byte) 7));
        if (this.c2 == null) {
            u890.C("commentsLinkUtil");
            throw null;
        }
        ua91 ua91Var5 = this.g2;
        if (ua91Var5 == null) {
            u890.C("binding");
            throw null;
        }
        dkh.a((TextView) ua91Var5.d, ua91Var5.H().getContext().getString(2131954100), new qwc1(this, (byte) 14));
        vnd1 vnd1Var = this.f2;
        if (vnd1Var == null) {
            u890.C("termsSheetLogger");
            throw null;
        }
        vnd1Var.o();
        ua91 ua91Var6 = this.g2;
        if (ua91Var6 != null) {
            return ua91Var6.H();
        }
        u890.C("binding");
        throw null;
    }

    public final void v0(Context context) {
        ifb1 ifb1Var = this.b2;
        if (ifb1Var != null) {
            ifb1Var.f(this);
        }
        super/*p.t2u*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.t2u*/.w0(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    public final void y0() {
        ((zf30) this).h1 = true;
        boolean z = this.h2;
        vnd1 vnd1Var = this.f2;
        if (z) {
            if (vnd1Var != null) {
                vnd1Var.l();
                return;
            } else {
                u890.C("termsSheetLogger");
                throw null;
            }
        }
        if (vnd1Var != null) {
            vnd1Var.n();
        } else {
            u890.C("termsSheetLogger");
            throw null;
        }
    }
}
