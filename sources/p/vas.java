package p;

import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vas extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vas(r2t r2tVar, z3t z3tVar) {
        super(1);
        this.a = (byte) 27;
        this.b = r2tVar;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0408  */
    public final Object invoke(Object obj) throws Exception {
        Object value;
        byte b = this.a;
        ctc ctcVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                was wasVar = (was) obj2;
                return new khl0(wasVar.A.path(), wasVar.B.a, (r6h1) obj);
            case 1:
                ((qtr) obj).b(new abs((z72) obj2, null));
                return rih1Var;
            case 2:
                if (((glp0) obj) == glp0.a) {
                    ((ocp0) obj2).invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                ((Boolean) obj).getClass();
                ods odsVar = (ods) obj2;
                if (!odsVar.Y) {
                    odsVar.e.a(ixb.b);
                    hfq0 hfq0VarG = odsVar.g();
                    List listSingletonList = Collections.singletonList(yeq0.a);
                    gfq0 gfq0Var = (gfq0) o7h.C0(hfq0VarG.b);
                    String str = gfq0Var != null ? gfq0Var.a : null;
                    if (hfq0VarG.c.a != null || str == null) {
                        listSingletonList = Collections.singletonList(new cfq0(listSingletonList));
                    } else {
                        jss0 jss0Var = jss0.a;
                        qss0 qss0VarC = jss0Var.c(str);
                        if ((qss0VarC instanceof qss0 ? qss0VarC : null) == null) {
                            rss0 rss0VarC = jss0Var.c(str);
                            if ((rss0VarC instanceof rss0 ? rss0VarC : null) == null) {
                                listSingletonList = Collections.singletonList(new cfq0(listSingletonList));
                            }
                        }
                    }
                    odsVar.d(listSingletonList, new yrn0((ou80) null), 1, new nds(odsVar, (byte) 1));
                }
                return rih1Var;
            case 4:
                return Integer.valueOf((int) (((Number) obj).intValue() * ((Button) obj2).getResources().getDisplayMetrics().density));
            case 5:
                ((qtr) obj).b(new ep0((ft30) ((res) obj2).f, (lnm) null, (byte) 26));
                return rih1Var;
            case 6:
                b07 b07Var = (f07) obj;
                ngr ngrVar = (ngr) obj2;
                em0 em0Var = (em0) ngrVar.c;
                if (b07Var instanceof b07) {
                    int dimensionPixelSize = ((ConstraintLayout) em0Var.b).getContext().getResources().getDimensionPixelSize(2131167022);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    Integer num = b07Var.a;
                    gradientDrawable.setColor(num != null ? num.intValue() : ngrVar.b);
                    gradientDrawable.setShape(0);
                    float f = dimensionPixelSize;
                    gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                    ((CardView) em0Var.e).setBackground(gradientDrawable);
                }
                return rih1Var;
            case 7:
                b07 b07Var2 = (f07) obj;
                uhs uhsVar = (uhs) obj2;
                if (b07Var2 instanceof b07) {
                    h72 h72Var = uhsVar.d;
                    Integer num2 = b07Var2.a;
                    h360.j(h72Var, num2 != null ? num2.intValue() : uhsVar.i);
                } else if (!(b07Var2 instanceof c07) && !(b07Var2 instanceof e07)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 8:
                String str2 = (String) obj;
                m42 m42Var = ((iis) obj2).h;
                if (m42Var != null) {
                    m42Var.invoke(new zww0(str2));
                }
                return rih1Var;
            case 9:
                ((qtr) obj).b(new w3a((qj0) obj2, (lnm) null, (byte) 1));
                return rih1Var;
            case 10:
                cks cksVar = (cks) obj2;
                if (!cksVar.S0) {
                    tif1.d(cksVar.Z, "LoggedInUi");
                    Parcelable parcelable = cksVar.R0;
                    cksVar.R0 = null;
                    teq teqVar = cksVar.d.a.c;
                    jo80 jo80Var = teqVar.f;
                    yiq yiqVar = teqVar.b;
                    v6s v6sVar = new v6s(parcelable, (gj5) jo80Var.a, (hzm0) yiqVar.S9.get(), tq21.r((aue0) yiqVar.Z9.get()), tq21.p((pte0) yiqVar.fa.get()), tq21.q((bue0) yiqVar.ja.get()));
                    cksVar.O0 = v6sVar;
                    nxr nxrVar = new nxr(cksVar, v6sVar, (byte) 21);
                    if (cksVar.P0) {
                        nxrVar.invoke();
                    } else {
                        cksVar.Q0 = nxrVar;
                    }
                }
                return rih1Var;
            case 11:
                ((x061) obj).c((zw51) obj2);
                return rih1Var;
            case 12:
                ((qtr) obj).b(new w3a((ams) obj2, (lnm) null, (byte) 2));
                return rih1Var;
            case 13:
                return Boolean.valueOf(u890.j(((pt1) obj).getUri(), ((cwo) obj2).a));
            case 14:
                return d3p1.F((d0r) ((qns) obj2).a.b, ujo1.u(), rih1Var);
            case 15:
                SingleEmitter singleEmitter = (SingleEmitter) obj2;
                if (!singleEmitter.isDisposed()) {
                    singleEmitter.onSuccess(obj);
                }
                return rih1Var;
            case 16:
                ((qv00) obj).a(((qw91) obj2).a, xkk1.class, false);
                return rih1Var;
            case 17:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 3);
                b261.y(e261Var, ((gia1) obj2).a);
                return rih1Var;
            case 18:
                cnl1 cnl1Var = (cnl1) obj;
                mxr mxrVar = (mxr) obj2;
                int i = cnl1Var.a;
                if (cnl1Var.b) {
                    my71 my71Var = (my71) mxrVar.d;
                    if (my71Var != null) {
                        my71Var.invoke(new jwa1(i));
                    }
                    mxr mxrVar2 = (mxr) mxrVar.a;
                    ((UnicastProcessor) mxrVar2.d).onNext(new vss(mxrVar2, i, (byte) 1));
                }
                return rih1Var;
            case 19:
                sw9 sw9Var = (sw9) obj2;
                return sw9Var.b <= 1 ? new zx6((r6h1) obj, (byte) 1) : new v3l0((w3l0) sw9Var.c);
            case 20:
                o4f1 o4f1Var = (o4f1) obj;
                iu30 iu30Var = ((uus) obj2).f;
                if (iu30Var != null) {
                    iu30Var.invoke(o4f1Var);
                }
                return rih1Var;
            case 21:
                b07 b07Var3 = (f07) obj;
                if (b07Var3 instanceof b07) {
                    lvs lvsVar = (lvs) obj2;
                    h72 h72Var2 = lvsVar.b;
                    Integer num3 = b07Var3.a;
                    h360.j(h72Var2, num3 != null ? num3.intValue() : lvsVar.h);
                } else if (!(b07Var3 instanceof c07) && !(b07Var3 instanceof e07)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 22:
                double dDoubleValue = ((Number) obj).doubleValue();
                zzs zzsVar = (zzs) obj2;
                l0l l0lVarB = zzsVar.b();
                if (l0lVarB != null) {
                    bpb1 bpb1Var = zzsVar.e;
                    do {
                        value = bpb1Var.getValue();
                    } while (!bpb1Var.k(value, zzsVar.a(l0lVarB, Double.valueOf(dDoubleValue))));
                    zzsVar.f.onNext(rih1Var);
                }
                return rih1Var;
            case 23:
                ((y0t) obj2).c.invoke((hr3) obj);
                return rih1Var;
            case 24:
                mhy mhyVar = (mhy) obj;
                hlu hluVar = (hlu) obj2;
                dlu dluVar = (dlu) hluVar.b.getValue();
                boolean z = dluVar.a;
                boolean z2 = dluVar.b;
                return Float.valueOf(((mhyVar instanceof bhy) || (mhyVar instanceof ihy) || (mhyVar instanceof ghy) || ((mhyVar instanceof ahy) && z2) || (((mhyVar instanceof lhy) && ((z && (dluVar.c instanceof lml)) || z2)) || ((mhyVar instanceof khy) && (z || z2)))) ? ((Number) hluVar.a.e()).floatValue() : 1.0f);
            case 25:
                pe20 pe20Var = (pe20) obj;
                if (pe20Var instanceof ne20) {
                    ((k1t) obj2).Q0.invoke(new mp3(((ne20) pe20Var).a));
                } else if (!pe20Var.equals(oe20.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 26:
                ((qtr) obj).b(new kr((x1t) obj2, (lnm) null, (byte) 11));
                return rih1Var;
            case 27:
                ((r2t) obj2).getSessionContext();
                return new a4t();
            case 28:
                idd1 idd1Var = ((bbt) obj2).c;
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM cachedDenylist");
                try {
                    int iW = y7y0.w(d441VarG1, "package_names");
                    int iW2 = y7y0.w(d441VarG1, "app_signatures");
                    int iW3 = y7y0.w(d441VarG1, "timestamp");
                    if (d441VarG1.f1()) {
                        String strP0 = d441VarG1.P0(iW);
                        dhc1 dhc1Var = (dhc1) idd1Var.getValue();
                        dhc1Var.getClass();
                        Set set = w7x.a;
                        Set set2 = (strP0 == null || strP0.length() == 0) ? set : (Set) dhc1Var.a.a(strP0, dhc1Var.b);
                        String strP1 = d441VarG1.P0(iW2);
                        dhc1 dhc1Var2 = (dhc1) idd1Var.getValue();
                        dhc1Var2.getClass();
                        if (strP1 != null && strP1.length() != 0) {
                            set = (Set) dhc1Var2.a.a(strP1, dhc1Var2.b);
                        }
                        ctcVar = new ctc(set2, set, d441VarG1.getLong(iW3));
                        break;
                    }
                    return ctcVar;
                } finally {
                    d441VarG1.close();
                }
            default:
                het hetVar = (het) obj;
                let letVar = (let) obj2;
                d0r d0rVar = letVar.a;
                o3r o3rVar = letVar.g;
                String str3 = hetVar.a;
                ay8 ay8VarF = d3p1.F(d0rVar, o3rVar, str3);
                Set set3 = s4b1.f;
                return h5p1.r(ay8VarF, uic.h(str3, new blc0[]{blc0.Pg, blc0.ld, blc0.Qg, blc0.Rg, blc0.Vg, blc0.z6}) ? d3p1.F(d0rVar, letVar.h, str3) : new huz((Object) null, (byte) 10), d3p1.F(d0rVar, letVar.i, str3), hetVar.e ? d3p1.F(d0rVar, letVar.t, str3) : new huz((Object) null, (byte) 10), new k1(letVar, (lnm) null, (byte) 10));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vas(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
