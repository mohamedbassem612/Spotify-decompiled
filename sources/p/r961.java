package p;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r961 implements Function, pms, xi7, ya, o2r0, p2r0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;

    public r961(rfs rfsVar, String str, g7h g7hVar, f210 f210Var) {
        this.a = (byte) 14;
        this.b = rfsVar;
        this.c = str;
        this.d = Single.zip(rqt0.F(o6x.a, new lm61(f210Var, this, (lnm) null, (byte) 23)), g7hVar.a(str, Collections.singletonList(str), false).map(new tz01(this, (byte) 21)).onErrorReturnItem(Boolean.FALSE), new vr51(this, (byte) 9)).doOnSubscribe(new i881(this, (byte) 0)).doOnSuccess(new i881(this, (byte) 1)).onErrorReturn(hcx0.Y).toObservable();
    }

    public static r961 e(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        r961 r961Var = new r961(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) r961Var.c)) {
            try {
                ((ArrayDeque) r961Var.c).clear();
                String string = ((SharedPreferences) r961Var.b).getString("topic_operation_queue", "");
                if (!TextUtils.isEmpty(string) && string.contains(",")) {
                    String[] strArrSplit = string.split(",", -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) r961Var.c).add(str);
                        }
                    }
                    return r961Var;
                }
                return r961Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static r961 j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626133, viewGroup, false);
        int i = 2131428647;
        if (m5n1.t(constraintLayoutInflate, 2131428647) != null) {
            i = 2131429349;
            if (((FrameLayout) m5n1.t(constraintLayoutInflate, 2131429349)) != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                int i2 = 2131430968;
                View viewT = m5n1.t(constraintLayoutInflate, 2131430968);
                if (viewT != null) {
                    i2 = 2131430969;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430969);
                    if (textView != null) {
                        i2 = 2131431070;
                        if (m5n1.t(constraintLayoutInflate, 2131431070) != null) {
                            i2 = 2131431448;
                            if (m5n1.t(constraintLayoutInflate, 2131431448) != null) {
                                return new r961((Object) constraintLayout, (Object) viewT, (Object) textView, (byte) 16);
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public void A(k8c0 k8c0Var) {
        n1d n1dVar = (n1d) this.d;
        if (n1dVar != null) {
            n1dVar.run();
        }
        Runnable n1dVar2 = new n1d((tac0) this.b, k8c0Var);
        this.d = n1dVar2;
        ((Handler) this.c).postAtFrontOfQueue(n1dVar2);
    }

    public boolean B(String str) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.c)) {
            zRemove = ((ArrayDeque) this.c).remove(str);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.d).execute(new v241(this, (byte) 5));
            }
        }
        return zRemove;
    }

    public void C(zi91 zi91Var) {
        if (((Subject) this.b).a()) {
            ((Subject) this.b).onNext(zi91Var);
            return;
        }
        synchronized (this.c) {
            ((ArrayList) this.d).add(zi91Var);
        }
    }

    public void a(ak3 ak3Var, tv80 tv80Var) {
        if (!((z0t) ((kly0) this.d).get()).a.o()) {
            vu1 vu1Var = (vu1) this.c;
            String str = nik1.k1.a;
            vu1Var.a(z6x.a, str, str, tv80Var, new by1(ak3Var), true);
            return;
        }
        sdv sdvVar = (sdv) ((kly0) this.b).get();
        String str2 = nik1.k1.a;
        sdvVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("dsl_selection_category", ak3Var.name());
        bundle.putString("dsl_selection_source_view_uri", str2);
        bundle.putString("dsl_selection_source_context_uri", str2);
        sdvVar.a.i(new dwn0(nik1.G1.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null), bundle);
    }

    public boolean accept(Object obj) {
        ksk kskVar = (ksk) obj;
        String str = kskVar.a;
        if (((Set) this.d).contains(kskVar.c)) {
            return false;
        }
        ((wqg) this.b).getClass();
        if (str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")) {
            return false;
        }
        ((xrm1) this.c).getClass();
        return !xrm1.a(str);
    }

    public Object apply(Object obj) {
        String strA0;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                mmr0 mmr0Var = (mmr0) obj;
                da61 da61Var = (da61) mmr0Var.a;
                return new zsx0(da61Var.a, (String) obj3, (List) mmr0Var.b, (String) obj2, da61Var.b, da61Var.c, da61Var.d, (Boolean) this.d);
            case 13:
                f781 f781Var = (f781) obj;
                return rqt0.F(igu.b, new h781((k781) obj3, f781Var.a, (lik1) obj2, f781Var.c, (l781) this.d, f781Var.b, f781Var.d, f781Var.e, f781Var.f, f781Var.g, f781Var.h, f781Var.i, (lnm) null));
            case 17:
                String str = (String) obj3;
                return (spq0) ((py21) obj).b(new pg61(str, (byte) 19), new ec21(str, (String) obj2, (ci10) this.d));
            case 23:
                return new CompletableFromAction(new lig((bs0) obj3, (String) obj, (d991) obj2, (tqw) this.d, (byte) 7));
            default:
                ContextTrack contextTrack = (ContextTrack) obj3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zW = o4p1.w((PlayerState) obj2);
                String strUri = contextTrack.uri();
                if (strUri == null) {
                    strUri = "";
                }
                String strA1 = l4o1.a0(contextTrack, "artist_uri");
                String str2 = strA1 != null ? strA1 : "";
                if (zBooleanValue && zW && str2.length() > 0 && ihc1.h0(strUri, "track", false) && (strA0 = l4o1.a0(contextTrack, "context_uri")) != null && strA0.length() != 0) {
                    Set setS0 = f46.S0(new blc0[]{blc0.Pg, blc0.ld});
                    Set set = s4b1.f;
                    if (!setS0.contains(uic.x(strUri).c)) {
                        return ((yf0) ((idd1) ((dxy) this.d).g).getValue()).a(contextTrack).f(n9x0.N0);
                    }
                }
                return MaybeEmpty.a;
        }
    }

    public void b(c380 c380Var, c380 c380Var2, ib60 ib60Var, qim0 qim0Var, vzq0 vzq0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2060284716);
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.i(c380Var2) ? 32 : 16) | (x340Var.g(ib60Var) ? 256 : 128) | 3072 | (x340Var.g(vzq0Var) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(this) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            if (c380Var == null && c380Var2 != null && !c380Var2.isEmpty()) {
                x340Var.i0(46323258);
                int i3 = i2 >> 3;
                d(c380Var2, null, vzq0Var, function0, true, x340Var, (57344 & i3) | (i3 & 14) | 197048 | (i3 & 7168) | (i2 & 3670016), 0);
                x340Var.r(false);
            } else if (c380Var == null) {
                x340Var.i0(46331768);
                c(cwl1.o0(x340Var, 2131962106), cwl1.o0(x340Var, 2131962105), "no_query", null, vzq0Var, x340Var, (i2 & 57344) | 384 | ((i2 >> 3) & 458752));
                x340Var.r(false);
            } else if (c380Var.isEmpty()) {
                x340Var.i0(46342270);
                c(cwl1.o0(x340Var, 2131962108), cwl1.o0(x340Var, 2131962107), "no_results", null, vzq0Var, x340Var, (i2 & 57344) | 384 | ((i2 >> 3) & 458752));
                x340Var.r(false);
            } else {
                x340Var.i0(46352458);
                int i4 = i2 >> 3;
                d(c380Var, ib60Var, vzq0Var, function0, false, x340Var, (i2 & 14) | 8 | (i4 & 112) | 384 | (i4 & 7168) | (i4 & 57344) | (i2 & 3670016), 32);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0(this, c380Var, c380Var2, ib60Var, qim0Var2, vzq0Var, function0, i);
        }
    }

    public void c(String str, String str2, String str3, qim0 qim0Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        vzq0 vzq0Var2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        boolean z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1928677490);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str3) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            vzq0Var2 = vzq0Var;
            i3 |= x340Var.g(vzq0Var2) ? 16384 : 8192;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var.i(this) ? 131072 : 65536;
        }
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean zI = ((i3 & 896) == 256) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new wp41(this, str3, null, (byte) 5);
                x340Var.s0(objT);
            }
            qxd0.t(str3, x340Var, (vu30) objT);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            float fD = vzq0Var2.d();
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarF, cbx.b(x340Var).e.c, fD + cbx.b(x340Var).b.e, cbx.b(x340Var).e.c, 0.0f, 8);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = rq61.g;
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, true, (iu30) objT2);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (str == null) {
                x340Var.i0(-1497129491);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
                z = false;
                z2 = true;
            } else {
                x340Var.i0(-1497129490);
                qim0Var3 = qim0Var4;
                z = false;
                z2 = true;
                uwo1.e(str, (qim0) null, cbx.d(x340Var).h, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
                x340Var.r(false);
            }
            if (str2 == null) {
                x340Var.i0(-1496910383);
                x340Var.r(z);
            } else {
                x340Var.i0(-1496910382);
                uwo1.e(str2, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
                x340Var.r(z);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(this, str, str2, str3, qim0Var2, vzq0Var, i, (byte) 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0169  */
    /* JADX WARN: Code duplicated, block: B:88:0x016c  */
    /* JADX WARN: Code duplicated, block: B:97:0x017f  */
    public void d(List list, ib60 ib60Var, vzq0 vzq0Var, Function0 function0, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        b0k b0kVar2;
        boolean z5;
        h311 h311VarV;
        List list2;
        xtb0 xtb0VarA;
        boolean z6;
        boolean z7;
        Object objT;
        cir0 cir0Var;
        Object objT2;
        ga51 ga51Var;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objT3;
        boolean z11;
        int i5;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1588523598);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(list) : b0kVar3.i(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? b0kVar3.g(ib60Var) : b0kVar3.i(ib60Var) ? 32 : 16;
        }
        int i6 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i6 == 0) {
            i3 |= b0kVar3.g(nim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.g(vzq0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(function0) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                i3 |= b0kVar3.h(z2) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                if (b0kVar3.i(this)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i4 = i3;
            z3 = true;
            if ((i4 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i4 & 1, z4)) {
                if (i7 != 0) {
                    z2 = false;
                }
                if (z2) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                b0kVar3.f0(-1857773167, list2);
                xtb0VarA = aub0.a(0, b0kVar3, 3);
                b0kVar3.r(false);
                Boolean boolValueOf = Boolean.valueOf(xtb0VarA.j.b());
                boolean zG = b0kVar3.g(xtb0VarA);
                if ((i4 & 57344) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zG | z6;
                objT = b0kVar3.T();
                if (z7 || objT == m4cVar) {
                    objT = new wp41(xtb0VarA, function0, null, (byte) 6);
                    b0kVar3.s0(objT);
                }
                qxd0.t(boolValueOf, b0kVar3, (vu30) objT);
                cir0Var = (cir0) b0kVar3.k(k2r0.a);
                objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    vpq vpqVar = (vpq) this.c;
                    tbr0 tbr0VarC = cir0Var.c();
                    kp5 kp5Var = (kp5) vpqVar.a.c;
                    lzn0 lzn0Var = (lzn0) ((lt61) kp5Var.a).a.get();
                    c8o.l(lzn0Var);
                    objT2 = new ga51(lzn0Var, (mt61) kp5Var.c, (ipq) kp5Var.e, (ipq) kp5Var.f, tbr0VarC);
                    b0kVar3.s0(objT2);
                }
                ga51Var = (ga51) objT2;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                if ((i4 & 458752) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i4 & 14) != 4 || ((i4 & 8) != 0 && b0kVar3.i(list))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z12 = z8 | z9;
                if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !b0kVar3.i(ib60Var))) {
                    z3 = false;
                }
                z10 = z12 | z3;
                objT3 = b0kVar3.T();
                if (!z10 || objT3 == m4cVar) {
                    z11 = z2;
                    gh1 gh1Var = new gh1(z11, list, ib60Var, ga51Var, (byte) 28);
                    b0kVar3.s0(gh1Var);
                    objT3 = gh1Var;
                } else {
                    z11 = z2;
                }
                b0kVar2 = b0kVar3;
                ujo1.d(qim0VarD, xtb0VarA, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT3, b0kVar2, (i4 >> 3) & 896, 504);
                z5 = z11;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z5 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(this, list, ib60Var, vzq0Var, function0, z5, i, i2);
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((i & 1572864) == 0) {
            if (b0kVar3.i(this)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        i4 = i3;
        z3 = true;
        if ((i4 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i4 & 1, z4)) {
            if (i7 != 0) {
                z2 = false;
            }
            if (z2) {
                list2 = list;
            } else {
                list2 = null;
            }
            b0kVar3.f0(-1857773167, list2);
            xtb0VarA = aub0.a(0, b0kVar3, 3);
            b0kVar3.r(false);
            Boolean boolValueOf2 = Boolean.valueOf(xtb0VarA.j.b());
            boolean zG2 = b0kVar3.g(xtb0VarA);
            if ((i4 & 57344) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zG2 | z6;
            objT = b0kVar3.T();
            if (z7) {
                objT = new wp41(xtb0VarA, function0, null, (byte) 6);
                b0kVar3.s0(objT);
            } else {
                objT = new wp41(xtb0VarA, function0, null, (byte) 6);
                b0kVar3.s0(objT);
            }
            qxd0.t(boolValueOf2, b0kVar3, (vu30) objT);
            cir0Var = (cir0) b0kVar3.k(k2r0.a);
            objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                vpq vpqVar2 = (vpq) this.c;
                tbr0 tbr0VarC2 = cir0Var.c();
                kp5 kp5Var2 = (kp5) vpqVar2.a.c;
                lzn0 lzn0Var2 = (lzn0) ((lt61) kp5Var2.a).a.get();
                c8o.l(lzn0Var2);
                objT2 = new ga51(lzn0Var2, (mt61) kp5Var2.c, (ipq) kp5Var2.e, (ipq) kp5Var2.f, tbr0VarC2);
                b0kVar3.s0(objT2);
            }
            ga51Var = (ga51) objT2;
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            if ((i4 & 458752) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i4 & 14) != 4) {
                z9 = true;
            } else {
                z9 = true;
            }
            boolean z13 = z8 | z9;
            if ((i4 & 112) != 32) {
                z3 = false;
            }
            z10 = z13 | z3;
            objT3 = b0kVar3.T();
            if (z10) {
                z11 = z2;
                gh1 gh1Var2 = new gh1(z11, list, ib60Var, ga51Var, (byte) 28);
                b0kVar3.s0(gh1Var2);
                objT3 = gh1Var2;
            } else {
                z11 = z2;
                gh1 gh1Var3 = new gh1(z11, list, ib60Var, ga51Var, (byte) 28);
                b0kVar3.s0(gh1Var3);
                objT3 = gh1Var3;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarD2, xtb0VarA, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT3, b0kVar2, (i4 >> 3) & 896, 504);
            z5 = z11;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z5 = z2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(this, list, ib60Var, vzq0Var, function0, z5, i, i2);
        }
    }

    public tac0 f() {
        return (tac0) this.b;
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        switch (this.a) {
            case 18:
                return new fx81(nhr0Var, (iu30) this.c, (dx81) this.d, bundle);
            default:
                return new jw81(nhr0Var, (k241) this.b, (ef8) this.d, bundle);
        }
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        return new r961((tz01) this.b, (x7e0) this.c, bundle, (ef8) this.d);
    }

    public mir0 i() {
        uba ubaVar = (wnh1) this.b;
        ubaVar.getClass();
        return new mir0(ubaVar.a());
    }

    public n2r k() {
        switch (this.a) {
            case 18:
                return (bb01) this.b;
            default:
                return (w6e0) this.c;
        }
    }

    public Single l(Intent intent, th61 th61Var) {
        return rqt0.F(igu.b, new sew0((byte) 23, (iu30) this.b, intent, (rs61) this.c, (b72) this.d, th61Var, (lnm) null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(iq71 iq71Var, onm onmVar) throws Exception {
        dq71 dq71Var;
        if (onmVar instanceof dq71) {
            dq71Var = (dq71) onmVar;
            int i = dq71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dq71Var.c = i - Integer.MIN_VALUE;
            } else {
                dq71Var = new dq71(this, onmVar);
            }
        } else {
            dq71Var = new dq71(this, onmVar);
        }
        Object objD = dq71Var.a;
        int i2 = dq71Var.c;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            i2i1 i2i1Var = (i2i1) this.b;
            String str = iq71Var.a;
            String str2 = iq71Var.c;
            dq71Var.c = 1;
            objD = ((kq71) i2i1Var.b).d(str, str2, dq71Var);
            if (objD != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objD);
                return objD;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objD);
        dq71Var.c = 2;
        Object objQ = q((sy21) objD, dq71Var);
        return objQ == obj ? obj : objQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(iq71 iq71Var, onm onmVar) throws Exception {
        eq71 eq71Var;
        if (onmVar instanceof eq71) {
            eq71Var = (eq71) onmVar;
            int i = eq71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eq71Var.c = i - Integer.MIN_VALUE;
            } else {
                eq71Var = new eq71(this, onmVar);
            }
        } else {
            eq71Var = new eq71(this, onmVar);
        }
        Object objC = eq71Var.a;
        int i2 = eq71Var.c;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objC);
            i2i1 i2i1Var = (i2i1) this.b;
            String str = iq71Var.a;
            eq71Var.c = 1;
            objC = ((kq71) i2i1Var.b).c(str, eq71Var);
            if (objC != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objC);
                return objC;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objC);
        eq71Var.c = 2;
        Object objQ = q((sy21) objC, eq71Var);
        return objQ == obj ? obj : objQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(iq71 iq71Var, onm onmVar) throws Exception {
        fq71 fq71Var;
        if (onmVar instanceof fq71) {
            fq71Var = (fq71) onmVar;
            int i = fq71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fq71Var.c = i - Integer.MIN_VALUE;
            } else {
                fq71Var = new fq71(this, onmVar);
            }
        } else {
            fq71Var = new fq71(this, onmVar);
        }
        Object objB = fq71Var.a;
        int i2 = fq71Var.c;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            i2i1 i2i1Var = (i2i1) this.b;
            String str = iq71Var.a;
            String str2 = iq71Var.c;
            String str3 = iq71Var.d;
            fq71Var.c = 1;
            objB = ((kq71) i2i1Var.b).b(str, str2, str3, fq71Var);
            if (objB != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objB);
                return objB;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        fq71Var.c = 2;
        Object objQ = q((sy21) objB, fq71Var);
        return objQ == obj ? obj : objQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(iq71 iq71Var, onm onmVar) throws Exception {
        gq71 gq71Var;
        if (onmVar instanceof gq71) {
            gq71Var = (gq71) onmVar;
            int i = gq71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gq71Var.c = i - Integer.MIN_VALUE;
            } else {
                gq71Var = new gq71(this, onmVar);
            }
        } else {
            gq71Var = new gq71(this, onmVar);
        }
        Object objE = gq71Var.a;
        int i2 = gq71Var.c;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objE);
            i2i1 i2i1Var = (i2i1) this.b;
            String str = iq71Var.a;
            gq71Var.c = 1;
            objE = ((kq71) i2i1Var.b).e(str, gq71Var);
            if (objE != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objE);
                return objE;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objE);
        gq71Var.c = 2;
        Object objQ = q((sy21) objE, gq71Var);
        return objQ == obj ? obj : objQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        if (r9 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(p.sy21 r8, p.onm r9) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r961.q(p.sy21, p.onm):java.lang.Object");
    }

    public void r(Bundle bundle, dg30 dg30Var) {
        Bundle bundleI;
        if (dg30Var == null || !dg30Var.isChangingConfigurations() || (bundleI = ((wnh1) this.b).I()) == null) {
            return;
        }
        bundle.putAll(bundleI);
    }

    public void s() {
        A(k8c0.ON_START);
    }

    public void t() {
        A(k8c0.ON_CREATE);
    }

    public void u() {
        A(k8c0.ON_STOP);
        A(k8c0.ON_DESTROY);
    }

    public void v() {
        A(k8c0.ON_START);
    }

    public void w(k481 k481Var) {
        ((wnh1) this.b).G();
        ((rku) this.d).b(((sg30) this.c).l(k481Var).map(xi20.c).distinctUntilChanged().subscribe(new tr41(this, (byte) 12)));
    }

    public void x() {
        ((rku) this.d).a();
        wnh1.H((wnh1) this.b);
    }

    public void y(k481 k481Var, View view, Bundle bundle) {
        wnh1 wnh1Var = (wnh1) this.b;
        if (bundle != null) {
            wnh1Var.y(bundle);
        }
        xhk1.c(view, j6p1.k(j6p1.k(new jp80(view), new g6r0(((sg30) this.c).l(k481Var).map(xi20.c).distinctUntilChanged().distinctUntilChanged().toFlowable(BackpressureStrategy.d))), new eq80(new e3h1(wnh1Var, (n7h1) null, wnh1Var))));
    }

    public String z() {
        String str;
        synchronized (((ArrayDeque) this.c)) {
            str = (String) ((ArrayDeque) this.c).peek();
        }
        return str;
    }

    public r961() {
        this.a = (byte) 26;
        this.b = new PublishSubject().c();
        this.c = new Object();
        this.d = new ArrayList();
    }

    public r961(x8c0 x8c0Var) {
        this.a = (byte) 3;
        this.b = x8c0Var;
        this.c = new kdn0();
        this.d = new e72(this, (byte) 8);
    }

    public r961(wqg wqgVar, xrm1 xrm1Var) {
        this.a = (byte) 7;
        this.b = wqgVar;
        this.c = xrm1Var;
        this.d = f46.S0(new le30[]{le30.Z, le30.Y, le30.t, le30.S0, le30.T0, le30.e, le30.e1});
    }

    public r961(r791 r791Var, i44 i44Var, Flowable flowable) {
        this.a = (byte) 22;
        this.b = r791Var;
        this.c = i44Var;
        vbm[] vbmVarArr = q601.a;
        this.d = new tu41(rqt0.u(new h801(new kge(flowable), (byte) 11)), (byte) 25);
    }

    public /* synthetic */ r961(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public r961(iu30 iu30Var, dx81 dx81Var) {
        this.a = (byte) 18;
        this.c = iu30Var;
        this.d = dx81Var;
        this.b = new bb01((byte) 29);
    }

    public r961(yac0 yac0Var) {
        this.a = (byte) 0;
        this.b = new tac0(yac0Var, true);
        this.c = new Handler(Looper.getMainLooper());
    }

    public r961(wnh1 wnh1Var, sg30 sg30Var) {
        this.a = (byte) 11;
        this.b = wnh1Var;
        this.c = sg30Var;
        this.d = new rku();
    }

    public r961(i8h1 i8h1Var, vpq vpqVar) {
        this.a = (byte) 6;
        this.b = i8h1Var;
        this.c = vpqVar;
        this.d = new ksk0((byte) 20);
    }

    public r961(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = (byte) 9;
        this.c = new ArrayDeque();
        this.b = sharedPreferences;
        this.d = scheduledThreadPoolExecutor;
    }

    public r961(tz01 tz01Var, x7e0 x7e0Var, Bundle bundle, ef8 ef8Var) {
        this.a = (byte) 19;
        this.d = ef8Var;
        this.b = ((q1n0) tz01Var.b).a(f4p1.g(x7e0Var));
        this.c = new w6e0(new fe81(this, (byte) 8), new fe81(bundle, (byte) 9));
    }
}
