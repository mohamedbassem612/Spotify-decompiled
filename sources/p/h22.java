package p;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h22 extends zf30 implements xuc1, qwb0 {
    public final g21 F1;
    public o12 J1;
    public b2r0 K1;
    public gik1 L1;
    public q22 N1;
    public b8p1 O1;
    public kt91 P1;
    public fg30 Q1;
    public final bck1 R1;
    public hik1 S1;
    public dsk0 T1;
    public final idd1 U1;
    public boolean V1;
    public final ArrayList W1;
    public final BehaviorSubject G1 = BehaviorSubject.f();
    public final PublishSubject H1 = new PublishSubject();
    public final PublishSubject I1 = new PublishSubject();
    public final idd1 M1 = new idd1(new y12(this, (byte) 1));

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public h22(g21 g21Var) throws NoWhenBranchMatchedException {
        this.F1 = g21Var;
        y12 y12Var = new y12(this, (byte) 16);
        znb0 znb0VarS = dm5.S(3, new ka(new ka(this, (byte) 2), (byte) 3));
        this.R1 = ebp1.j(this, rc11.a.b(MobiusLoopViewModel.class), new g22(znb0VarS, (byte) 0), new g22(znb0VarS, (byte) 1), y12Var);
        this.U1 = new idd1(new y12(this, (byte) 0));
        this.W1 = new ArrayList();
    }

    @Override // p.zf30
    public final void I0(View view, Bundle bundle) {
        o12 o12VarA;
        if (this.J1 == null) {
            try {
                View view2 = this.j1;
                if (view2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                l22 l22VarA = hap1.m(view2).b0(l22.class).a();
                if (l22VarA == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                o12VarA = l22VarA.a();
                if (o12VarA == null) {
                    zf30 zf30Var = this.X0;
                    o12VarA = zf30Var instanceof o12 ? (o12) zf30Var : null;
                    if (o12VarA == null) {
                        Context contextH0 = h0();
                        o12VarA = contextH0 instanceof o12 ? (o12) contextH0 : null;
                    }
                }
                if (o12VarA == null) {
                    hhg1.n("Required value was null.");
                    return;
                }
                this.J1 = o12VarA;
                b2r0 b2r0VarD = o12VarA.d();
                this.K1 = b2r0VarD;
                hik1 hik1Var = this.S1;
                if (hik1Var == null) {
                    u890.C("viewUbiImpressionLoggerFactory");
                    throw null;
                }
                this.L1 = hik1Var.a(this, b2r0VarD);
            } catch (Throwable unused) {
                o12VarA = null;
            }
        }
        this.x1.j().c("STATE_PROVIDER_VIEW_ID", new a22(this, (byte) 0));
        Bundle bundleA = this.x1.j().a("STATE_TRACKED_DROPDOWN_SEARCH");
        this.V1 = bundleA != null ? bundleA.getBoolean("STATE_TRACKED_DROPDOWN_SEARCH", false) : false;
        this.x1.j().c("STATE_TRACKED_DROPDOWN_SEARCH", new a22(this, (byte) 1));
        this.T1 = t5p1.o((UUID) this.U1.getValue());
        Z0().b.f(n0(), new b22(this, (byte) 0));
        Z0().c.a(this, new b22(this, (byte) 1), new b22(this, (byte) 2));
        fg30 fg30Var = this.Q1;
        if (fg30Var != null) {
            fg30Var.s.setMovementMethod(LinkMovementMethod.getInstance());
        }
        fg30 fg30Var2 = this.Q1;
        if (fg30Var2 != null) {
            fg30Var2.f.setOnClickListener(new z12(this, (byte) 1));
        }
        fg30 fg30Var3 = this.Q1;
        if (fg30Var3 != null) {
            fg30Var3.m.setOnClickListener(new z12(this, (byte) 2));
        }
        fg30 fg30Var4 = this.Q1;
        if (fg30Var4 != null) {
            fg30Var4.e.setOnClickListener(new z12(this, (byte) 3));
        }
        fg30 fg30Var5 = this.Q1;
        if (fg30Var5 != null) {
            fg30Var5.v.setOnClickListener(new z12(this, (byte) 4));
        }
        fg30 fg30Var6 = this.Q1;
        if (fg30Var6 != null) {
            fg30Var6.d.setOnClickListener(new z12(this, (byte) 0));
        }
        fg30 fg30Var7 = this.Q1;
        if (fg30Var7 == null) {
            return;
        }
        gik1 gik1Var = this.L1;
        if (gik1Var == null) {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
        dik1 dik1VarA = gik1Var.a(fg30Var7.a, new y12(this, (byte) 4));
        ArrayList arrayList = this.W1;
        arrayList.add(dik1VarA);
        gik1 gik1Var2 = this.L1;
        if (gik1Var2 == null) {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(gik1Var2.a(fg30Var7.u, new y12(this, (byte) 5)));
        gik1 gik1Var3 = this.L1;
        if (gik1Var3 == null) {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(gik1Var3.a(fg30Var7.o, new y12(this, (byte) 6)));
        gik1 gik1Var4 = this.L1;
        if (gik1Var4 == null) {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(gik1Var4.a(fg30Var7.v, new y12(this, (byte) 7)));
        gik1 gik1Var5 = this.L1;
        if (gik1Var5 == null) {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(gik1Var5.a(fg30Var7.d, new y12(this, (byte) 8)));
        gik1 gik1Var6 = this.L1;
        if (gik1Var6 == null) {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(gik1Var6.a(fg30Var7.w, new y12(this, (byte) 9)));
        gik1 gik1Var7 = this.L1;
        if (gik1Var7 == null) {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(gik1Var7.a(fg30Var7.l, new y12(this, (byte) 10)));
        gik1 gik1Var8 = this.L1;
        if (gik1Var8 == null) {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(gik1Var8.a(fg30Var7.i, new y12(this, (byte) 11)));
        gik1 gik1Var9 = this.L1;
        if (gik1Var9 == null) {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(gik1Var9.a(fg30Var7.e, new y12(this, (byte) 12)));
        gik1 gik1Var10 = this.L1;
        if (gik1Var10 != null) {
            arrayList.add(gik1Var10.a(fg30Var7.g, new y12(this, (byte) 3)));
        } else {
            u890.C("viewUbiImpressionLogger");
            throw null;
        }
    }

    public final b8p1 Y0() {
        b8p1 b8p1Var = this.O1;
        if (b8p1Var != null) {
            return b8p1Var;
        }
        u890.C("tracking");
        throw null;
    }

    public final MobiusLoopViewModel Z0() {
        return (MobiusLoopViewModel) this.R1.getValue();
    }

    public final void a1(String str) {
        uba ubaVar = this.K1;
        if (ubaVar == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        dsk0 dsk0Var = this.T1;
        if (dsk0Var == null) {
            u890.C("ubiEventFactory");
            throw null;
        }
        ubaVar.m(dsk0Var.i().l().j(str), (xj61) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b1(giw giwVar) throws NoWhenBranchMatchedException {
        if (giwVar instanceof jhw) {
            this.G1.onNext(((jhw) giwVar).a());
            return;
        }
        boolean z = giwVar instanceof ihw;
        rih1 rih1Var = rih1.a;
        if (z) {
            this.I1.onNext(rih1Var);
            return;
        }
        if (giwVar instanceof thw) {
            this.H1.onNext(rih1Var);
            return;
        }
        if (giwVar instanceof ahw) {
            fg30 fg30Var = this.Q1;
            if (fg30Var != null) {
                d7 it = new i46(fg30Var.k, (byte) 8).iterator();
                while (true) {
                    d7 d7Var = it;
                    if (!d7Var.hasNext()) {
                        break;
                    }
                    View view = (View) d7Var.next();
                    if (view.hasFocus()) {
                        view.clearFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) x74.S(P0(), InputMethodManager.class);
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        }
                    }
                }
            }
            Z0().U(yyz.a);
            return;
        }
        if (giwVar instanceof zhw) {
            zhw zhwVar = (zhw) giwVar;
            kt91 kt91Var = this.P1;
            if (kt91Var != null) {
                kt91Var.k(k4k.q(zhwVar.a()).c());
                return;
            } else {
                u890.C("snackbarManager");
                throw null;
            }
        }
        if (!(giwVar instanceof biw)) {
            eg.o();
            return;
        }
        int i = zuc1.d2;
        zuc1 zuc1VarL = iro1.l(new wuc1(((biw) giwVar).a()));
        zuc1VarL.h1(g0(), null);
        b2r0 b2r0Var = this.K1;
        if (b2r0Var == null) {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
        View view2 = zuc1VarL.j1;
        if (view2 == null) {
            return;
        }
        hik1 hik1Var = this.S1;
        if (hik1Var != null) {
            hik1Var.a(this, b2r0Var).a(view2, new y12(this, (byte) 2));
        } else {
            u890.C("viewUbiImpressionLoggerFactory");
            throw null;
        }
    }

    @Override // p.zf30
    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    @Override // p.zf30
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131624658, viewGroup, false);
        int i = 2131427528;
        TextView textView = (TextView) m5n1.t(viewInflate, 2131427528);
        if (textView != null) {
            i = 2131427535;
            TextView textView2 = (TextView) m5n1.t(viewInflate, 2131427535);
            if (textView2 != null) {
                i = 2131427886;
                EncoreButton encoreButton = (EncoreButton) m5n1.t(viewInflate, 2131427886);
                if (encoreButton != null) {
                    i = 2131428552;
                    EncoreButton encoreButton2 = (EncoreButton) m5n1.t(viewInflate, 2131428552);
                    if (encoreButton2 != null) {
                        i = 2131428553;
                        TextView textView3 = (TextView) m5n1.t(viewInflate, 2131428553);
                        if (textView3 != null) {
                            i = 2131428554;
                            LinearLayout linearLayout = (LinearLayout) m5n1.t(viewInflate, 2131428554);
                            if (linearLayout != null) {
                                i = 2131428555;
                                TextView textView4 = (TextView) m5n1.t(viewInflate, 2131428555);
                                if (textView4 != null) {
                                    i = 2131428556;
                                    LinearLayout linearLayout2 = (LinearLayout) m5n1.t(viewInflate, 2131428556);
                                    if (linearLayout2 != null) {
                                        i = 2131428557;
                                        TextView textView5 = (TextView) m5n1.t(viewInflate, 2131428557);
                                        if (textView5 != null) {
                                            i = 2131428558;
                                            LinearLayout linearLayout3 = (LinearLayout) m5n1.t(viewInflate, 2131428558);
                                            if (linearLayout3 != null) {
                                                i = 2131428562;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) m5n1.t(viewInflate, 2131428562);
                                                if (constraintLayout != null) {
                                                    i = 2131428584;
                                                    EncoreButton encoreButton3 = (EncoreButton) m5n1.t(viewInflate, 2131428584);
                                                    if (encoreButton3 != null) {
                                                        i = 2131428720;
                                                        TextView textView6 = (TextView) m5n1.t(viewInflate, 2131428720);
                                                        if (textView6 != null) {
                                                            i = 2131428723;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) m5n1.t(viewInflate, 2131428723);
                                                            if (constraintLayout2 != null) {
                                                                i = 2131428732;
                                                                TextView textView7 = (TextView) m5n1.t(viewInflate, 2131428732);
                                                                if (textView7 != null) {
                                                                    i = 2131428810;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) m5n1.t(viewInflate, 2131428810);
                                                                    if (constraintLayout3 != null) {
                                                                        i = 2131428812;
                                                                        TextView textView8 = (TextView) m5n1.t(viewInflate, 2131428812);
                                                                        if (textView8 != null) {
                                                                            i = 2131428813;
                                                                            TextView textView9 = (TextView) m5n1.t(viewInflate, 2131428813);
                                                                            if (textView9 != null) {
                                                                                i = 2131428814;
                                                                                TextView textView10 = (TextView) m5n1.t(viewInflate, 2131428814);
                                                                                if (textView10 != null) {
                                                                                    i = 2131429817;
                                                                                    ProgressBar progressBar = (ProgressBar) m5n1.t(viewInflate, 2131429817);
                                                                                    if (progressBar != null) {
                                                                                        i = 2131430684;
                                                                                        EncoreButton encoreButton4 = (EncoreButton) m5n1.t(viewInflate, 2131430684);
                                                                                        if (encoreButton4 != null) {
                                                                                            i = 2131431618;
                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) m5n1.t(viewInflate, 2131431618);
                                                                                            if (constraintLayout4 != null) {
                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) viewInflate;
                                                                                                this.Q1 = new fg30(constraintLayout5, textView, textView2, encoreButton, encoreButton2, textView3, linearLayout, textView4, linearLayout2, textView5, linearLayout3, constraintLayout, encoreButton3, textView6, constraintLayout2, textView7, constraintLayout3, textView8, textView9, textView10, progressBar, encoreButton4, constraintLayout4);
                                                                                                return constraintLayout5;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // p.zf30
    public final void z0() {
        this.h1 = true;
        this.Q1 = null;
        ArrayList arrayList = this.W1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xcg1.l((AutoCloseable) it.next());
        }
        arrayList.clear();
    }
}
