package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l690 extends hab0 implements iu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l690(ymd0 ymd0Var, eci0 eci0Var, yy4 yy4Var, Context context, fza fzaVar, hvp0 hvp0Var, yqg yqgVar, ytp0 ytp0Var, fiv0 fiv0Var, rwj rwjVar) {
        super(1);
        this.a = (byte) 3;
        this.b = ymd0Var;
        this.c = eci0Var;
        this.e = yy4Var;
        this.f = context;
        this.g = fzaVar;
        this.h = hvp0Var;
        this.d = yqgVar;
        this.i = ytp0Var;
        this.t = fiv0Var;
        this.X = rwjVar;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        Object obj2 = this.X;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.b;
        Object obj9 = this.t;
        Object obj10 = this.f;
        Object obj11 = this.c;
        switch (b) {
            case 0:
                rj41 rj41Var = (rj41) obj;
                return new n6h1(new k690((i5w0) obj2, (byte) 0), (i8h1) ((b6h1) obj8).a(rj41Var), (yqg) obj7, (p6h1) obj6, (v6h1) ((b6h1) obj11).a(rj41Var), (s7h1) obj10, (m8h1) obj5, (Scheduler) obj4, (Scheduler) obj3, (CompositeDisposable) obj9);
            case 1:
                kil kilVar = (kil) obj;
                View view = (View) obj8;
                ConstraintLayout constraintLayout = (ConstraintLayout) obj11;
                kilVar.g(view.getId(), 3, constraintLayout.getId(), 3);
                kilVar.g(view.getId(), 6, constraintLayout.getId(), 6);
                View view2 = (View) obj7;
                kilVar.g(view.getId(), 7, view2.getId(), 6);
                View view3 = (View) obj6;
                kilVar.g(view3.getId(), 3, view.getId(), 4);
                kilVar.g(view3.getId(), 6, constraintLayout.getId(), 6);
                kilVar.g(view3.getId(), 7, constraintLayout.getId(), 7);
                View view4 = (View) obj10;
                ViewGroup viewGroup = (ViewGroup) view4.getParent();
                kilVar.g(view4.getId(), 6, viewGroup.getId(), 6);
                kilVar.g(view4.getId(), 7, viewGroup.getId(), 7);
                kilVar.g(view4.getId(), 3, view3.getId(), 4);
                View view5 = (View) obj5;
                kilVar.g(view2.getId(), 7, view5.getId(), 6);
                kilVar.g(view2.getId(), 3, view.getId(), 3);
                View view6 = (View) obj4;
                kilVar.g(view5.getId(), 7, view6.getId(), 6);
                kilVar.g(view5.getId(), 3, view.getId(), 3);
                kilVar.g(view6.getId(), 7, constraintLayout.getId(), 7);
                kilVar.g(view6.getId(), 3, view.getId(), 3);
                View view7 = (View) obj3;
                kilVar.g(view7.getId(), 7, constraintLayout.getId(), 7);
                kilVar.g(view7.getId(), 3, view.getId(), 3);
                View view8 = (View) obj9;
                kilVar.g(view8.getId(), 3, view4.getId(), 4);
                kilVar.g(view8.getId(), 4, constraintLayout.getId(), 4);
                kilVar.g(view8.getId(), 6, constraintLayout.getId(), 6);
                View view9 = (View) obj2;
                if (view9 != null) {
                    i = 7;
                    kilVar.g(view8.getId(), 7, view9.getId(), 6);
                } else {
                    i = 7;
                    kilVar.g(view8.getId(), 7, constraintLayout.getId(), 7);
                }
                if (view9 != null) {
                    kilVar.g(view9.getId(), i, constraintLayout.getId(), i);
                    kilVar.g(view9.getId(), 3, view4.getId(), 4);
                    kilVar.g(view9.getId(), 4, constraintLayout.getId(), 4);
                }
                return rih1Var;
            case 2:
                rtb0 rtb0Var = (rtb0) obj;
                q0e0 q0e0Var = (q0e0) obj11;
                rtb0.c(rtb0Var, (Object) null, new j2i(-1871902554, new cy00(q0e0Var, (tob1) obj6, (tob1) obj10, (byte) 26), true), 3);
                rtb0.c(rtb0Var, (Object) null, new j2i(-337849187, new mse((q0e0) obj11, (lb50) obj5, (yqg) obj7, (iu30) obj4, (j2i) obj3, (j2i) obj9, (byte) 3), true), 3);
                List list = ((rwd0) obj8).b;
                if (list != null) {
                    if (q0e0Var.b.b.a != 3) {
                        list = null;
                    }
                    if (list != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            rtb0.c(rtb0Var, (Object) null, new j2i(1859127827, new h6a0(list, (j2i) obj2, (byte) 13), true), 3);
                        }
                    }
                }
                return rih1Var;
            case 3:
                mey0 mey0Var = (mey0) obj;
                Object objE = ((ymd0) obj8).e();
                objE.getClass();
                eci0 eci0Var = (eci0) obj11;
                return epo1.H(mey0Var, new t810((ioj0) objE, (zkm) null, (hwt) null, (ijo) null, eci0Var.a, ((yy4) obj6).g(), true, eci0Var.c, false, eci0Var.d, eci0Var.f, eci0Var.g, (y2u0) null, (sq51) null, false, eci0Var.k, eci0Var.l, 346894), (fza) obj5, (hvp0) obj4, (yqg) obj7, (ytp0) obj3, (fiv0) obj9, new jci0((rwj) obj2, mey0Var, (byte) 0), eci0Var.j, (iix0) null, ((Context) obj10).getResources());
            case 4:
                c9n c9nVar = (c9n) obj7;
                int iIntValue = ((Number) obj).intValue();
                drr0 drr0Var = (drr0) obj3;
                res resVar = (res) obj11;
                ven0 ven0Var = (ven0) obj4;
                ven0 ven0Var2 = (ven0) obj5;
                if (!hmk0.d((ven0) obj10)) {
                    Integer num = (Integer) ven0Var2.getValue();
                    boolean z = num != null && num.intValue() == iIntValue;
                    ((iu30) obj8).invoke(z ? new omk0(iIntValue) : new nmk0(iIntValue));
                    faa0 faa0Var = (faa0) ven0Var.getValue();
                    if (faa0Var != null) {
                        faa0Var.d((CancellationException) null);
                    }
                    ((cdk0) resVar.d).c();
                    if (z) {
                        ven0Var2.setValue((Object) null);
                        drr0Var.t(0.0f);
                        ven0Var.setValue(fn31.T(c9nVar, (o8n) null, 0, new vmk0(resVar, null, (byte) 0), 3));
                    } else {
                        sr10 sr10Var = (sr10) o7h.t0(iIntValue, ((smk0) obj6).a);
                        if (sr10Var != null) {
                            lhg1 lhg1Var = sr10Var.c;
                            ven0Var2.setValue((Object) null);
                            drr0Var.t(0.0f);
                            ven0Var.setValue(fn31.T(c9nVar, (o8n) null, 0, new nx(resVar, iIntValue, lhg1Var, (ven0) obj10, ven0Var2, (frr0) obj9, (frr0) obj2, (lnm) null), 3));
                        }
                    }
                }
                return rih1Var;
            case 5:
                oud oudVar = (oud) obj;
                wh71 wh71Var = (wh71) obj6;
                q8n q8nVar = (q8n) obj3;
                lb lbVar = (lb) obj2;
                return new chb1(new lz9((g2z) obj9, (byte) 3), new uq7(oudVar, wh71Var, q8nVar, new l0r(szq.a(), new l5b1(lbVar, (byte) 16), seb1.X0, q8nVar, new lag0((Object) new r2a1((Context) obj8, (bjd) obj11, (byte) 28), lnmVar, (byte) 11), seb1.Y0, seb1.Z0), new mgb1(new h3x(oudVar), new tzr0((bhf) obj7, wh71Var, (gqg) obj10, (k3i0) obj5, (aru0) obj4), q8nVar)), lbVar);
            default:
                iyf1 iyf1Var = (iyf1) obj;
                waz0 waz0Var = (waz0) obj9;
                bv40 bv40Var = (bv40) obj8;
                String str = iyf1Var.a;
                mr20 mr20VarK = iyf1Var.s || iyf1Var.t ? bv40Var.k(str) : new huz(md2.c, (byte) 10);
                o6x o6xVar = o6x.a;
                Flowable flowableH = yoi1.h(mr20VarK, o6xVar);
                int i2 = iyf1Var.f;
                px3 px3Var = px3.a;
                Flowable flowableU = i2 == 2 ? yoi1.h(((t7y) obj11).g(str), o6xVar).U(px3Var) : Flowable.I(px3Var);
                flowableU.getClass();
                Flowable flowableH2 = yoi1.h(((zr00) obj6).a, o6xVar);
                Observable observableA = ((yh2) obj10).a();
                BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
                Flowable flowableH3 = Flowable.h(Flowable.d((Flowable) obj7, flowableH2, observableA.toFlowable(backpressureStrategy), ((o241) obj5).a.toFlowable(backpressureStrategy), ((f8b) obj4).a(iyf1Var.m.b).toFlowable(backpressureStrategy), g7h.d((g7h) ((ne) obj3).c, "", new String[]{str}).toFlowable(backpressureStrategy).J(new vdn1(str, (byte) 14)).J(b4x0.h), flowableH, flowableU, new ypa((rh11) obj2, (byte) 28)), waz0Var.d().U(waz0Var.a()), new ffe1(waz0Var, iyf1Var, (byte) 10));
                flowableH3.getClass();
                return flowableH3.t(Functions.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l690(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = obj10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l690(rwd0 rwd0Var, q0e0 q0e0Var, tob1 tob1Var, tob1 tob1Var2, lb50 lb50Var, yqg yqgVar, iu30 iu30Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3) {
        super(1);
        this.a = (byte) 2;
        this.b = rwd0Var;
        this.c = q0e0Var;
        this.e = tob1Var;
        this.f = tob1Var2;
        this.g = lb50Var;
        this.d = yqgVar;
        this.h = iu30Var;
        this.i = j2iVar;
        this.t = j2iVar2;
        this.X = j2iVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l690(b6h1 b6h1Var, yqg yqgVar, p6h1 p6h1Var, b6h1 b6h1Var2, s7h1 s7h1Var, m8h1 m8h1Var, Scheduler scheduler, Scheduler scheduler2, CompositeDisposable compositeDisposable, i5w0 i5w0Var) {
        super(1);
        this.a = (byte) 0;
        this.b = b6h1Var;
        this.d = yqgVar;
        this.e = p6h1Var;
        this.c = b6h1Var2;
        this.f = s7h1Var;
        this.g = m8h1Var;
        this.h = scheduler;
        this.i = scheduler2;
        this.t = compositeDisposable;
        this.X = i5w0Var;
    }
}
