package p;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import com.spotify.tome.pageactivity.PageActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gf6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf6(int i, Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public final Object invoke() {
        w7h1 w7h1Var;
        Object value;
        o4z0 o4z0VarA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return Boolean.valueOf(i == ((err0) ((jkr0) ((kes) obj)).d.c).s());
            case 1:
                return Boolean.valueOf(!u890.j(((dw91) obj).get(Integer.valueOf(i)), Boolean.FALSE));
            case 2:
                zdb zdbVar = (zdb) obj;
                teb tebVar = zdbVar.U1;
                if (tebVar == null) {
                    u890.C("blueprintActionsTracker");
                    throw null;
                }
                int iC = l1d.C(i);
                b7x b7xVar = b7x.a;
                if (iC == 0) {
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-passkey-not-found-dialog";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1 x6h1VarR = kk0.r(x6h1VarI, "login/dialog/passkey-not-found");
                    x6h1VarR.i.add(new a7h1("got_it_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarR.a(), r6h1.c, System.currentTimeMillis());
                } else if (iC == 1) {
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-login-offline-error-dialog";
                    x6h1VarI2.f = "1.0.0";
                    x6h1VarI2.g = "22.0.0";
                    x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "login/dialog/offline-error");
                    x6h1VarR2.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarR2.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    y6h1 y6h1Var3 = y6h1.i;
                    x6h1 x6h1VarI3 = i3o1.i();
                    x6h1VarI3.h = "music";
                    x6h1VarI3.a = "mobile-passkey-login-failed-dialog";
                    x6h1VarI3.f = "1.0.0";
                    x6h1VarI3.g = "22.0.0";
                    x6h1 x6h1VarR3 = kk0.r(x6h1VarI3, "login/dialog/passkey-login-failed");
                    x6h1VarR3.i.add(new a7h1("got_it_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarR3.a(), r6h1.c, System.currentTimeMillis());
                }
                ((i8h1) tebVar.f).j(w7h1Var);
                t8h1 t8h1Var = zdbVar.S1;
                if (t8h1Var == null) {
                    u890.C("ubiPageLocationChangeListener");
                    throw null;
                }
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.n(t8h1Var, yon1.u5());
                return rih1Var;
            case 3:
                ((av7) obj).l(i);
                return rih1Var;
            case 4:
                return bqn1.A((Context) ((yjq) obj).c, i);
            case 5:
                yxb0 yxb0Var = (yxb0) obj;
                r5q r5qVar = (r5q) yxb0Var.d;
                int i2 = ((uxb0) yxb0Var.c).b;
                byte b2 = r5qVar.a;
                int i3 = this.b;
                switch (b2) {
                    case 0:
                        thq thqVar = r5qVar.b;
                        daq daqVar = thqVar.b;
                        gw70 gw70Var = (gw70) daqVar.d8.get();
                        v5q v5qVar = thqVar.c;
                        daq daqVar2 = v5qVar.b;
                        return new kxb0(i2, i3, gw70Var, l1b0.D((i01) daqVar2.a.V1.get(), (i01) daqVar2.a.W1.get(), (i44) v5qVar.h5.get()), (i44) v5qVar.h5.get(), (jjh1) daqVar.nb.get(), v5qVar.Z());
                    default:
                        r7q r7qVar = r5qVar.b;
                        daq daqVar3 = r7qVar.b;
                        gw70 gw70Var2 = (gw70) daqVar3.d8.get();
                        teq teqVar = r7qVar.d;
                        daq daqVar4 = teqVar.d;
                        return new kxb0(i2, i3, gw70Var2, l1b0.D((i01) daqVar4.a.V1.get(), (i01) daqVar4.a.W1.get(), (i44) teqVar.v7.get()), (i44) teqVar.v7.get(), (jjh1) daqVar3.nb.get(), teqVar.H1());
                }
            case 6:
                return ((MainLayout) obj).findViewById(i);
            case 7:
                return (xfh0) ((c380) obj).get(i);
            case 8:
                return Float.valueOf((((int) (((nav0) obj).Y0 >> 32)) / 12.0f) * i);
            case 9:
                a1r0 a1r0Var = ((PageActivity) obj).g1;
                if (i > 0) {
                    if (a1r0Var == null) {
                        u890.C("pageActivityNavigator");
                        throw null;
                    }
                    a1r0Var.l();
                } else {
                    if (a1r0Var == null) {
                        u890.C("pageActivityNavigator");
                        throw null;
                    }
                    a1r0Var.g();
                }
                return rih1Var;
            case 10:
                i4z0 i4z0Var = (i4z0) obj;
                bpb1 bpb1Var = i4z0Var.t;
                do {
                    value = bpb1Var.getValue();
                    o4z0VarA = (o4z0) value;
                    List list = o4z0VarA.b;
                    h4z0 h4z0Var = (h4z0) o7h.t0(i, list);
                    if (h4z0Var != null) {
                        if (h4z0Var.f()) {
                            o4z0VarA = o4z0.a(o4z0VarA, i4z0.m(i, list, false), null, false, 13);
                        } else {
                            Integer num = i4z0Var.d.d;
                            if (num != null && num.intValue() == 1) {
                                List list2 = list;
                                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                                int i4 = 0;
                                for (Object obj2 : list2) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        p7h.T();
                                        throw null;
                                    }
                                    arrayList.add(i4z0.n((h4z0) obj2, i4 == i));
                                    i4 = i5;
                                }
                                o4z0VarA = o4z0.a(o4z0VarA, arrayList, null, false, 13);
                            } else if (i4z0Var.l(o4z0VarA)) {
                                o4z0VarA = o4z0.a(o4z0VarA, i4z0.m(i, list, true), null, false, 13);
                            }
                        }
                    }
                } while (!bpb1Var.k(value, o4z0VarA));
                return rih1Var;
            case 11:
                if (i == 1) {
                    ((Function0) obj).invoke();
                }
                return rih1Var;
            case 12:
                FrameLayout frameLayout = (FrameLayout) b8k1.n((LinearLayout) ((u3) obj).e, 2131429104);
                frameLayout.setPaddingRelative(i, 0, i, 0);
                return frameLayout;
            case 13:
                return StickyHeaderLinearLayoutManager.C1((StickyHeaderLinearLayoutManager) obj, i);
            case 14:
                return Float.valueOf(i == 0 ? ((Number) ((tob1) obj).getValue()).floatValue() : 0.0f);
            default:
                fnl1 fnl1Var = (fnl1) obj;
                inl1 inl1VarA = fnl1Var.a();
                if (inl1VarA.i != i) {
                    inl1VarA.i = i;
                    inl1VarA.h();
                }
                fnl1Var.b.u0(i);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf6(Object obj, int i, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
