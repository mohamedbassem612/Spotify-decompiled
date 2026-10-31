package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hw30 implements ihr0 {
    public final dtw N0;
    public final View X;
    public final idd1 Y;
    public boolean Z;
    public final u830 a;
    public final ur41 b;
    public final kdn0 c;
    public final cgr0 d;
    public final Bundle e;
    public final l3h1 f;
    public final mbm1 g;
    public final Object h = new Object();
    public boolean i;
    public boolean t;

    public hw30(String str, Context context, u830 u830Var, xfx xfxVar, acq acqVar, ur41 ur41Var, kdn0 kdn0Var, cgr0 cgr0Var, Bundle bundle, zob1 zob1Var, pe peVar, aod aodVar, ce60 ce60Var, boolean z, b35 b35Var, boolean z2, l3h1 l3h1Var, mbm1 mbm1Var) {
        int dimensionPixelSize;
        this.a = u830Var;
        this.b = ur41Var;
        this.c = kdn0Var;
        this.d = cgr0Var;
        this.e = bundle;
        this.f = l3h1Var;
        this.g = mbm1Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131624707, (ViewGroup) null);
        this.X = viewInflate;
        idd1 idd1Var = new idd1(new cc00(this, (byte) 12));
        this.Y = new idd1(new f710(this, (byte) 22));
        this.Z = true;
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, (ViewGroup) idd1Var.getValue(), new sbk(str, acqVar, new c4z(this), zob1Var, aodVar, ce60Var, z, b35Var.d(), b35Var.j(), peVar, new u830(this, (byte) 12)), (drw) null, 24);
        ((ViewGroup) idd1Var.getValue()).removeAllViews();
        ((ViewGroup) idd1Var.getValue()).addView(dtwVarD.w);
        this.N0 = dtwVarD;
        if (z2) {
            ViewGroup viewGroup = (ViewGroup) idd1Var.getValue();
            viewGroup.setPadding(0, viewGroup.getPaddingTop(), 0, viewGroup.getPaddingBottom());
        }
        View viewFindViewById = viewInflate.findViewById(2131428119);
        View viewFindViewById2 = viewInflate.findViewById(2131427589);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(viewFindViewById, (k1q0) null);
        int paddingTop = viewFindViewById2.getPaddingTop();
        up20 up20Var = new up20();
        up20Var.b = viewFindViewById2;
        up20Var.a = paddingTop;
        r7k1.c(viewFindViewById2, up20Var);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(2131431400);
        int iOrdinal = b35Var.i().ordinal();
        if (iOrdinal == 0) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166070);
        } else if (iOrdinal == 1) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166072);
        } else {
            if (iOrdinal != 2) {
                eg.o();
                throw null;
            }
            dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166071);
        }
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        viewGroup2.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    @Override // p.ihr0
    public final boolean b(ehr0 ehr0Var) {
        if (!(ehr0Var instanceof qy3)) {
            return false;
        }
        ur41 ur41Var = this.b;
        ds41 ds41Var = (ds41) ur41Var.a.invoke();
        if (ds41Var != null) {
            int iA = ds41Var.a();
            int iB = ds41Var.b();
            if (iA == 0 || iB > 95) {
                this.a.invoke(new c000(""));
            }
        } else {
            this.a.invoke(new c000(""));
        }
        ur41Var.b.invoke();
        return true;
    }
}
