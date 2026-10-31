package p;

import android.content.res.Resources;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d570 extends l570 {
    public final /* synthetic */ byte b;
    public final LinearLayoutManager c;
    public final s470 d;
    public y570 e;
    public yfu f;

    public d570(ViewGroup viewGroup, l670 l670Var, boolean z, byte b) {
        this.b = b;
        switch (b) {
            case 1:
                g570 g570Var = new g570(viewGroup.getContext());
                super(g570Var);
                g570Var.setNestedScrollingEnabled(viewGroup instanceof t6o0);
                viewGroup.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                this.c = linearLayoutManager;
                ((a) linearLayoutManager).i = false;
                linearLayoutManager.x1(0);
                Resources resources = viewGroup.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(2131166165);
                if (z) {
                    int iMax = Math.max(resources.getDimensionPixelOffset(2131165541) - dimensionPixelSize, 0);
                    g570Var.setPadding(iMax, 0, iMax, 0);
                    g570Var.setClipToPadding(false);
                }
                g570Var.setLayoutManager(linearLayoutManager);
                g570Var.setItemAnimator((e611) null);
                g570Var.j(new c570(this, bno1.t(viewGroup), dimensionPixelSize));
                l670Var.getClass();
                k670 k670VarA = l670.a();
                v570 v570Var = l670Var.a;
                v570Var.getClass();
                k670VarA.a = v570Var;
                vd70 vd70Var = l670Var.b;
                vd70Var.getClass();
                k670VarA.b = vd70Var;
                k670VarA.e = w361.p(new c670[]{l670Var.d});
                e670 e670Var = l670Var.e;
                e670Var.getClass();
                k670VarA.d = e670Var;
                e670 e670Var2 = l670Var.f;
                e670Var2.getClass();
                k670VarA.f = e670Var2;
                de70 de70Var = l670Var.g;
                de70Var.getClass();
                k670VarA.c = de70Var;
                n570 n570Var = l670Var.i;
                n570Var.getClass();
                k670VarA.g = n570Var;
                aj20 aj20Var = l670Var.j;
                aj20Var.getClass();
                k670VarA.h = aj20Var;
                s470 s470Var = new s470(k670VarA.a(), null);
                this.d = s470Var;
                g570Var.setLayoutFrozen(false);
                g570Var.v0(s470Var, true, false);
                g570Var.j0(true);
                g570Var.requestLayout();
                g570Var.m(new zl7(this, (byte) 8));
                g570Var.setHasFixedSize(false);
                break;
            default:
                g570 g570Var2 = new g570(viewGroup.getContext());
                super(g570Var2);
                g570Var2.setNestedScrollingEnabled(viewGroup instanceof t6o0);
                viewGroup.getContext();
                LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(1);
                this.c = linearLayoutManager2;
                ((a) linearLayoutManager2).i = false;
                linearLayoutManager2.x1(0);
                Resources resources2 = viewGroup.getResources();
                int dimensionPixelSize2 = resources2.getDimensionPixelSize(2131166165);
                if (z) {
                    int iMax2 = Math.max(resources2.getDimensionPixelOffset(2131165541) - dimensionPixelSize2, 0);
                    g570Var2.setPadding(iMax2, 0, iMax2, 0);
                    g570Var2.setClipToPadding(false);
                }
                g570Var2.setLayoutManager(linearLayoutManager2);
                g570Var2.setItemAnimator((e611) null);
                g570Var2.j(new c570(this, dimensionPixelSize2, bno1.t(viewGroup)));
                l670Var.getClass();
                s470 s470Var2 = new s470(l670Var, null);
                this.d = s470Var2;
                g570Var2.setLayoutFrozen(false);
                g570Var2.v0(s470Var2, true, false);
                g570Var2.j0(true);
                g570Var2.requestLayout();
                g570Var2.m(new zl7(this, (byte) 7));
                g570Var2.setHasFixedSize(false);
                break;
        }
    }

    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        byte b = this.b;
        LinearLayoutManager linearLayoutManager = this.c;
        s470 s470Var = this.d;
        RecyclerView recyclerView = ((l570) this).a;
        switch (b) {
            case 0:
                recyclerView.B0();
                this.e = y570Var;
                this.f = yfuVar;
                s470Var.B(y570Var.s());
                Parcelable parcelableE = yfuVar.e(y570Var);
                if (parcelableE != null) {
                    linearLayoutManager.w0(parcelableE);
                } else {
                    linearLayoutManager.w1(0, 0);
                }
                s470Var.h();
                break;
            default:
                recyclerView.B0();
                this.e = y570Var;
                this.f = yfuVar;
                s470Var.B(y570Var.s());
                Parcelable parcelableE2 = yfuVar.e(y570Var);
                if (parcelableE2 != null) {
                    linearLayoutManager.w0(parcelableE2);
                } else {
                    linearLayoutManager.w1(0, 0);
                }
                s470Var.h();
                break;
        }
    }

    public final void b(int... iArr) {
        byte b = this.b;
        RecyclerView recyclerView = ((l570) this).a;
        switch (b) {
            case 0:
                bs51.t(recyclerView, iArr);
                break;
            default:
                bs51.t(recyclerView, iArr);
                break;
        }
    }
}
