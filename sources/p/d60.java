package p;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d60 extends jti0 {
    public final /* synthetic */ byte Y = 0;
    public final /* synthetic */ g60 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(g60 g60Var, Context context, alc1 alc1Var, View view) {
        super(context, alc1Var, view, false, 2130968612, 0);
        this.Z = g60Var;
        if ((alc1Var.A.x & 32) != 32) {
            Object obj = g60Var.g;
            this.g = obj == null ? (View) g60Var.f : obj;
        }
        bv40 bv40Var = g60Var.U0;
        this.h = bv40Var;
        iti0 iti0Var = (iti0) this.i;
        if (iti0Var != null) {
            iti0Var.d(bv40Var);
        }
    }

    @Override // p.jti0
    public final void c() {
        byte b = this.Y;
        g60 g60Var = this.Z;
        switch (b) {
            case 0:
                g60Var.R0 = null;
                super.c();
                break;
            default:
                msi0 msi0Var = g60Var.c;
                if (msi0Var != null) {
                    msi0Var.d(true);
                }
                g60Var.Q0 = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(g60 g60Var, Context context, msi0 msi0Var, View view) {
        super(context, msi0Var, view, true, 2130968612, 0);
        this.Z = g60Var;
        this.d = 8388613;
        bv40 bv40Var = g60Var.U0;
        this.h = bv40Var;
        iti0 iti0Var = (iti0) this.i;
        if (iti0Var != null) {
            iti0Var.d(bv40Var);
        }
    }
}
