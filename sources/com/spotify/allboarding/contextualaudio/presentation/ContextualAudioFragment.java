package com.spotify.allboarding.contextualaudio.presentation;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.bck1;
import p.bhn0;
import p.e3h1;
import p.edr0;
import p.eg;
import p.en3;
import p.eq80;
import p.fe41;
import p.grk0;
import p.gw70;
import p.i8h1;
import p.imm;
import p.j2i;
import p.jmm;
import p.jp80;
import p.k4p1;
import p.kmm;
import p.l1d;
import p.l6h1;
import p.m5n1;
import p.mzj;
import p.n7h1;
import p.o7h;
import p.odh0;
import p.of61;
import p.op80;
import p.p6m;
import p.ptf1;
import p.q6x;
import p.q7h;
import p.qpl;
import p.rc11;
import p.rmm;
import p.smm;
import p.so41;
import p.u890;
import p.wch;
import p.wet0;
import p.wp20;
import p.x11;
import p.xhk1;
import p.yg30;
import p.z11;
import p.z6x;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/spotify/allboarding/contextualaudio/presentation/ContextualAudioFragment;", "Lp/zf30;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "Lp/np41;", "screenState", "src_main_java_com_spotify_allboarding_contextualaudio-contextualaudio"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContextualAudioFragment extends zf30 {
    public final yg30 F1;
    public smm G1;
    public Scheduler H1;
    public gw70 I1;
    public ptf1 J1;
    public i8h1 K1;
    public l6h1 L1;
    public edr0 M1;
    public en3 N1;
    public boolean O1;
    public final bck1 P1 = new bck1(rc11.a.b(rmm.class), new kmm(this, (byte) 0), new imm(this, 4), new kmm(this, (byte) 1));
    public wp20 Q1;
    public boolean R1;

    public ContextualAudioFragment(yg30 yg30Var) {
        this.F1 = yg30Var;
    }

    public final void F0(Bundle bundle) {
        bundle.putBoolean("BUTTON_ANIMATION_COMPLETE", this.R1);
    }

    public final void I0(View view, Bundle bundle) {
        Z0().e.f(n0(), new z11(this, (byte) 10));
    }

    public final ptf1 Y0() {
        ptf1 ptf1Var = this.J1;
        if (ptf1Var != null) {
            return ptf1Var;
        }
        u890.C("logger");
        throw null;
    }

    public final rmm Z0() {
        return (rmm) this.P1.getValue();
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p6m p6mVar;
        byte b = 0;
        byte b2 = 1;
        if (bundle == null) {
            en3 en3Var = this.N1;
            if (en3Var == null) {
                u890.C("screenProvider");
                throw null;
            }
            so41 so41Var = (so41) en3Var.a;
            rmm rmmVarZ0 = Z0();
            fe41 fe41Var = rmmVarZ0.b;
            List list = so41Var.b;
            ArrayList<qpl> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((qpl) obj).h.length() > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (qpl qplVar : arrayList) {
                int i = qplVar.X;
                String str = qplVar.h;
                int iC = l1d.C(i);
                if (iC == 0) {
                    p6mVar = new p6m(str, 2);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    p6mVar = new p6m(str, 1);
                }
                arrayList2.add(p6mVar);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((p6m) obj2).b == 2) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (((p6m) obj3).b == 1) {
                    arrayList4.add(obj3);
                }
            }
            int iMin = Math.min(arrayList4.size(), 5 - Math.min(arrayList3.size(), 2));
            fe41Var.b(k4p1.C(o7h.N0(o7h.d1(arrayList3, 5 - iMin), o7h.d1(arrayList4, iMin))), "CONTENT");
            String str2 = (String) fe41Var.b.s("MIX_ID");
            if (str2 == null) {
                str2 = so41Var.a;
            }
            fe41Var.b(str2, "MIX_ID");
            z6x z6xVar = (List) fe41Var.b.s("CONTENT");
            if (z6xVar == null) {
                z6xVar = z6x.a;
            }
            rmmVarZ0.V(z6xVar);
        } else {
            this.R1 = bundle.getBoolean("BUTTON_ANIMATION_COMPLETE", false);
        }
        N0().J().a(n0(), new x11((byte) 1, true));
        if (this.O1) {
            edr0 edr0Var = this.M1;
            if (edr0Var == null) {
                u890.C("sessionIdProvider");
                throw null;
            }
            grk0 grk0Var = new grk0("SEND", edr0Var.b(of61.a));
            wet0 wet0Var = new wet0(grk0Var, new imm(this, b2));
            odh0 odh0Var = new odh0(grk0Var, new imm(this, b));
            ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            op80 jp80Var = new jp80(composeView);
            i8h1 i8h1Var = this.K1;
            if (i8h1Var == null) {
                u890.C("ubiLogger");
                throw null;
            }
            l6h1 l6h1Var = this.L1;
            if (l6h1Var == null) {
                u890.C("ubiDwellTimeLogger");
                throw null;
            }
            op80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
            op80 wchVar = q6x.b;
            if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                jp80Var = wchVar;
            } else if (jp80Var.equals(wchVar)) {
                jp80Var = eq80Var;
            } else if (!eq80Var.equals(wchVar)) {
                wchVar = new wch(jp80Var, eq80Var);
                jp80Var = wchVar;
            }
            xhk1.c(composeView, jp80Var);
            composeView.setContent(new j2i(-1152827558, new mzj(this, wet0Var, odh0Var, (byte) 22), true));
            return composeView;
        }
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624662, viewGroup, false);
        int i2 = 2131428225;
        ContentStackView contentStackViewT = m5n1.t(constraintLayoutInflate, 2131428225);
        if (contentStackViewT != null) {
            i2 = 2131428226;
            if (((FrameLayout) m5n1.t(constraintLayoutInflate, 2131428226)) != null) {
                i2 = 2131428589;
                ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131428589);
                if (composeViewT != null) {
                    i2 = 2131430499;
                    EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131430499);
                    if (encoreButtonT != null) {
                        i2 = 2131430865;
                        EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131430865);
                        if (encoreButtonT2 != null) {
                            this.Q1 = new wp20(constraintLayoutInflate, contentStackViewT, composeViewT, encoreButtonT, encoreButtonT2);
                            encoreButtonT.setVisibility(this.R1 ? 0 : 4);
                            wp20 wp20Var = this.Q1;
                            wp20Var.getClass();
                            ((EncoreButton) wp20Var.e).setVisibility(this.R1 ? 0 : 4);
                            wp20 wp20Var2 = this.Q1;
                            wp20Var2.getClass();
                            ((ComposeView) wp20Var2.c).setVisibility(8);
                            wp20 wp20Var3 = this.Q1;
                            wp20Var3.getClass();
                            ((EncoreButton) wp20Var3.d).setOnClickListener(new jmm(this, (byte) 0));
                            wp20 wp20Var4 = this.Q1;
                            wp20Var4.getClass();
                            ((EncoreButton) wp20Var4.e).setOnClickListener(new jmm(this, (byte) 1));
                            wp20 wp20Var5 = this.Q1;
                            wp20Var5.getClass();
                            return (ConstraintLayout) wp20Var5.a;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
        return null;
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        if (this.O1) {
            return;
        }
        wp20 wp20Var = this.Q1;
        wp20Var.getClass();
        ((ContentStackView) wp20Var.b).a();
        this.Q1 = null;
    }
}
