package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tt11 implements isw {
    public final uh N0;
    public final uh O0;
    public final uh P0;
    public final uh Q0;
    public final uh R0;
    public final fqg0 S0;
    public final dtw T0;
    public final dtw U0;
    public final uu11 V0;
    public final bpb1 W0;
    public final boolean X;
    public final ComposeView X0;
    public final ye Y = new ye();
    public final t10 Y0;
    public final uh Z;
    public final int Z0;
    public final iu30 a;
    public final int a1;
    public final bu11 b;
    public final int b1;
    public final yqg c;
    public final boolean d;
    public final n5r e;
    public final egx0 f;
    public final ppc1 g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public tt11(Context context, ViewGroup viewGroup, iu30 iu30Var, gw70 gw70Var, bu11 bu11Var, yqg yqgVar, int i, boolean z, boolean z2, int i2, int i3, boolean z3, n5r n5rVar, wpw wpwVar, vtw vtwVar, vtw vtwVar2, vtw vtwVar3, vtw vtwVar4, vtw vtwVar5, vtw vtwVar6, yt11 yt11Var, egx0 egx0Var, ppc1 ppc1Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i4) {
        uh uhVar;
        uh uhVar2;
        uh uhVar3;
        uh uhVar4;
        uh uhVar5;
        uh uhVar6;
        laa qfvVar;
        dtw dtwVarD;
        this.a = iu30Var;
        this.b = bu11Var;
        this.c = yqgVar;
        this.Z0 = i;
        this.a1 = i2;
        this.d = z3;
        this.e = n5rVar;
        this.f = egx0Var;
        this.g = ppc1Var;
        this.h = z5;
        this.i = z6;
        this.t = z7;
        this.X = z8;
        this.b1 = i4;
        if (vtwVar != null) {
            uhVar = new uh(context, viewGroup, vtwVar);
            uhVar.a = new pt11(this, (byte) 4);
        } else {
            uhVar = null;
        }
        this.Z = uhVar;
        if (vtwVar2 != null) {
            uhVar2 = new uh(context, viewGroup, vtwVar2);
            uhVar2.a = new pt11(this, (byte) 5);
        } else {
            uhVar2 = null;
        }
        this.N0 = uhVar2;
        if (vtwVar3 != null) {
            uhVar3 = new uh(context, viewGroup, vtwVar3);
            uhVar3.a = new pt11(this, (byte) 0);
        } else {
            uhVar3 = null;
        }
        this.O0 = uhVar3;
        if (vtwVar4 != null) {
            uhVar4 = new uh(context, viewGroup, vtwVar4);
            uhVar4.a = new pt11(this, (byte) 1);
        } else {
            uhVar4 = null;
        }
        this.P0 = uhVar4;
        if (vtwVar5 != null) {
            uhVar5 = new uh(context, viewGroup, vtwVar5);
            uhVar5.a = new pt11(this, (byte) 2);
        } else {
            uhVar5 = null;
        }
        this.Q0 = uhVar5;
        if (vtwVar6 != null) {
            uhVar6 = new uh(context, viewGroup, vtwVar6);
            uhVar6.a = new pt11(this, (byte) 3);
        } else {
            uhVar6 = null;
        }
        this.R0 = uhVar6;
        int i5 = z4 ? 2 : 1;
        if (egx0Var instanceof dgx0) {
            qfvVar = null;
        } else if (egx0Var instanceof cgx0) {
            qfvVar = new u63(((cgx0) egx0Var).a, i5);
        } else if (egx0Var instanceof agx0) {
            qfvVar = new u63(((agx0) egx0Var).a, i5);
        } else {
            if (!(egx0Var instanceof bgx0)) {
                eg.o();
                throw null;
            }
            qfvVar = new qfv(((bgx0) egx0Var).a, i5);
        }
        this.S0 = qfvVar != null ? q1o1.u(qfvVar, (qim0) null, (FrameLayout.LayoutParams) null, 7) : null;
        if (wpwVar != null) {
            tka0 tka0Var = dtw.C;
            dtwVarD = mhc.d(context, viewGroup, wpwVar, (drw) null, 24);
        } else {
            dtwVarD = null;
        }
        this.T0 = dtwVarD;
        this.U0 = null;
        this.V0 = new uu11(z2, z);
        this.W0 = gio1.b((Object) null);
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setPadding(i3, 0, i3, 0);
        composeView.setContent(new j2i(2075975579, new pby0(gw70Var, composeView, this, yt11Var, (byte) 12), true));
        composeView.setTag("ReleaseRowElement");
        this.X0 = composeView;
        this.Y0 = new t10(composeView);
    }

    public static void b(View view, h3h1 h3h1Var) {
        if (view == null || h3h1Var == null) {
            return;
        }
        xhk1.c(view, h3h1Var);
    }

    public final void a(Object obj, ysw yswVar) {
        jmb1 jmb1Var = (unb1) obj;
        boolean z = jmb1Var instanceof jmb1;
        bpb1 bpb1Var = this.W0;
        if (!z) {
            if (jmb1Var instanceof inb1) {
                bpb1Var.l((Object) null);
                return;
            } else if (jmb1Var instanceof tlb1) {
                bpb1Var.l((Object) null);
                return;
            } else {
                eg.o();
                return;
            }
        }
        jmb1 jmb1Var2 = jmb1Var;
        uv11 uv11Var = jmb1Var2.a;
        uh uhVar = this.Z;
        if (uhVar != null) {
            uhVar.a(uv11Var);
        }
        uh uhVar2 = this.N0;
        if (uhVar2 != null) {
            uhVar2.a(uv11Var);
        }
        uh uhVar3 = this.O0;
        if (uhVar3 != null) {
            uhVar3.a(uv11Var);
        }
        uh uhVar4 = this.P0;
        if (uhVar4 != null) {
            uhVar4.a(uv11Var);
        }
        uh uhVar5 = this.Q0;
        if (uhVar5 != null) {
            uhVar5.a(uv11Var);
        }
        uh uhVar6 = this.R0;
        if (uhVar6 != null) {
            uhVar6.a(uv11Var);
        }
        dtw dtwVar = this.T0;
        if (dtwVar != null) {
            tka0 tka0Var = dtw.C;
            dtwVar.k(uv11Var, ioa0.a, (vu30) null);
        }
        bpb1Var.getClass();
        bpb1Var.m((Object) null, jmb1Var2);
        c();
    }

    public final void c() {
        ye yeVar = this.Y;
        ArrayList arrayListO0 = o7h.o0(p7h.M(new xe[]{yeVar.a, yeVar.b, yeVar.c, yeVar.d, yeVar.e, yeVar.f}));
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListO0) {
            if (!ihc1.y0(((xe) obj).a)) {
                arrayList.add(obj);
            }
        }
        this.Y0.b(arrayList);
    }

    public final View getView() {
        return this.X0;
    }
}
