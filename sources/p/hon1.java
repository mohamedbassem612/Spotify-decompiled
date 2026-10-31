package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.base.java.logging.Logger;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hon1 {
    public static final che0 a = new che0(new nma1(8.0f, 16.0f, 8.0f, 0.66f, 32.0f, 12.0f, 48.0f, 16.0f, 16.0f), new xd50(16.0f));
    public static final che0 b = new che0(new nma1(16.0f, 24.0f, 10.0f, 0.62f, 32.0f, 12.0f, 64.0f, 32.0f, 24.0f), new xd50(24.0f));
    public static final che0 c = new che0(new nma1(16.0f, 24.0f, 10.0f, 0.62f, 40.0f, 18.0f, 88.0f, 48.0f, 24.0f), new xd50(24.0f));
    public static b180 d;

    public static final Object A(nfa0 nfa0Var, String str, uga0 uga0Var, nma0 nma0Var) {
        return new gha0(nfa0Var, uga0Var, str, nma0Var.getDescriptor()).Y(nma0Var);
    }

    public static final CharSequence B(nwc nwcVar) {
        yrg0 yrg0Var = sjo0.e;
        if (yrg0Var != null) {
            return ((pwc) sqg0.G(nwcVar.getClass(), (gg11) yrg0Var.b)).a(nwcVar);
        }
        u890.C("_calTextDecorator");
        throw null;
    }

    public static final String C(nwc nwcVar) {
        if (nwcVar instanceof mwc) {
            Logger.d("[CAL] Using a TextWithSignifiers in a text only context. This is not supported.", new Object[0]);
            return ((mwc) nwcVar).b;
        }
        if ((nwcVar instanceof lwc) || (nwcVar instanceof kwc)) {
            return B(nwcVar).toString();
        }
        eg.o();
        return null;
    }

    public static final ObjectAnimator D(View view, float f, float f2, long j, PathInterpolator pathInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setStartDelay(j);
        objectAnimatorOfFloat.setDuration(667L);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    public static final void a(idm idmVar, wcm wcmVar, iu30 iu30Var, b0k b0kVar, int i) {
        idm idmVar2;
        wcm wcmVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1270691126);
        int i2 = (x340Var.i(idmVar) ? 4 : 2) | i | (x340Var.g(wcmVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new h7w0(iu30Var, (byte) 12);
                x340Var.s0(objT);
            }
            wcmVar2 = wcmVar;
            idmVar2 = idmVar;
            otw.c(idmVar2, wcm.a(wcmVar, (Function0) objT, (nx2) null, false, (String) null, 1007), (qim0) null, (ipb1) null, x340Var, i2 & 14, 12);
        } else {
            idmVar2 = idmVar;
            wcmVar2 = wcmVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lnx0(idmVar2, wcmVar2, iu30Var, i, (byte) 0);
        }
    }

    public static final void b(xho xhoVar, uho uhoVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1421786612);
        int i2 = (x340Var.i(xhoVar) ? 4 : 2) | i | (x340Var.g(uhoVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new h7w0(iu30Var, (byte) 13);
                x340Var.s0(objT);
            }
            otw.c(xhoVar, uho.a(uhoVar, (Function0) objT), (qim0) null, (ipb1) null, x340Var, 8 | (i2 & 14), 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mnx0(xhoVar, uhoVar, iu30Var, i, (byte) 0);
        }
    }

    public static final void c(hnn0 hnn0Var, kd41 kd41Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1579360880);
        if ((((x340Var.i(hnn0Var) ? 4 : 2) | i | (x340Var.i(kd41Var) ? 32 : 16)) & 147) == 146 && x340Var.H()) {
            x340Var.b0();
        } else {
            mod.c(new ely0[]{ahe0.a.a(hnn0Var), jfe0.a.a(hnn0Var), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().a(hnn0Var)}, apo.r(-52928304, new inn0(kd41Var, j2iVar), x340Var), x340Var, 56);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(hnn0Var, kd41Var, j2iVar, i, (byte) 1);
        }
    }

    public static final void d(hft0 hft0Var, set0 set0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(656320434);
        int i2 = (x340Var.i(hft0Var) ? 4 : 2) | i | (x340Var.g(set0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new h7w0(iu30Var, (byte) 14);
                x340Var.s0(objT);
            }
            otw.c(hft0Var, set0.a(set0Var, (Function0) objT, (Function0) null, 2031), (qim0) null, (ipb1) null, x340Var, i2 & 14, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nnx0(hft0Var, set0Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void e(hjv0 hjv0Var, wiv0 wiv0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-274024712);
        int i2 = (x340Var.i(hjv0Var) ? 4 : 2) | i | (x340Var.g(wiv0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new ppv0(iu30Var, (byte) 11);
                x340Var.s0(objT);
            }
            otw.c(hjv0Var, wiv0.a(wiv0Var, (iu30) objT), (qim0) null, (ipb1) null, x340Var, 8 | (i2 & 14), 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(hjv0Var, wiv0Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void f(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2064964257);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            g(((i2 << 3) & 896) | (i2 & 14) | 48, j2iVar, x340Var, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f45((byte) 1, i, j2iVar, qim0Var);
        }
    }

    public static final void g(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(771959668);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i((Object) null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                hrr0 hrr0Var = new hrr0((Object) null, f331.X0);
                x340Var.s0(hrr0Var);
                objT = hrr0Var;
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new e45(ven0Var, (byte) 0);
                x340Var.s0(objT2);
            }
            mod.b(p3e1.b.a(y((Function0) objT2, x340Var, 0)), apo.r(-291176396, new qg(qim0Var, ven0Var, j2iVar, (byte) 1), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f45((byte) 0, i, j2iVar, qim0Var);
        }
    }

    public static final void h(kd41 kd41Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1211832233);
        int i2 = (x340Var.i(kd41Var) ? 4 : 2) | i | (x340Var.i(j2iVar) ? 32 : 16);
        if ((i2 & 19) == 18 && x340Var.H()) {
            x340Var.b0();
        } else {
            x340Var.j0(1729797275);
            ot50 ot50VarA = ahe0.a(x340Var);
            if (ot50VarA == null) {
                eg.m("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            xbk1 xbk1VarS = d9p1.s(rc11.a.b(ku9.class), ot50VarA, null, ot50VarA instanceof ot50 ? ot50VarA.O() : csn.b, x340Var);
            x340Var.r(false);
            ku9 ku9Var = (ku9) xbk1VarS;
            ku9Var.c = new WeakReference(kd41Var);
            kd41Var.c(ku9Var.b, j2iVar, x340Var, ((i2 << 6) & 896) | (i2 & 112));
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new inn0(kd41Var, j2iVar, i);
        }
    }

    public static final int i(v850 v850Var) {
        int iOrdinal = v850Var.ordinal();
        if (iOrdinal == 0) {
            return 2131956432;
        }
        if (iOrdinal == 1) {
            return 2131956445;
        }
        eg.o();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    public static final String j(ecy ecyVar, Context context) {
        List listM = p7h.M(new zby[]{(zby) ecyVar.d.getValue(), (zby) ecyVar.e.getValue(), (zby) ecyVar.f.getValue(), (zby) ecyVar.g.getValue()});
        ArrayList arrayList = new ArrayList();
        Iterator it = listM.iterator();
        while (true) {
            String string = null;
            if (!it.hasNext()) {
                String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
                if (ihc1.y0(strY0)) {
                    return null;
                }
                return strY0;
            }
            zby zbyVar = (zby) it.next();
            if (zbyVar != null) {
                qby qbyVar = zbyVar.a;
                if (qbyVar instanceof qby) {
                    k1v k1vVar = qbyVar.a;
                    if (k1vVar.equals(f1v.a)) {
                        string = context.getString(2131955542);
                    } else if (k1vVar.equals(h1v.a)) {
                        string = context.getString(2131955545);
                    } else if (k1vVar.equals(i1v.a)) {
                        string = context.getString(2131955546);
                    } else if (k1vVar instanceof k1v) {
                        Float f = k1vVar.a;
                        if (f != null) {
                            string = context.getResources().getQuantityString(2131820677, (int) (f.floatValue() * 100.0f));
                            if (string == null) {
                                string = context.getString(2131955547);
                            }
                        } else {
                            string = context.getString(2131955547);
                        }
                    } else if (k1vVar.equals(l1v.a)) {
                        string = context.getString(2131955543);
                    } else if (k1vVar.equals(n1v.a)) {
                        string = context.getString(2131955544);
                    } else if (!k1vVar.equals(m1v.a)) {
                        eg.o();
                        return null;
                    }
                } else if (qbyVar instanceof tby) {
                    string = context.getString(((tby) qbyVar).a ? 2131955548 : 2131955549);
                } else if (qbyVar.equals(uby.a)) {
                    string = context.getString(2131955550);
                }
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
    }

    public static final ValueAnimator k(long j, PathInterpolator pathInterpolator, List list) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(667L);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        valueAnimatorOfFloat.addListener(new lk41(list, (byte) 2));
        valueAnimatorOfFloat.addUpdateListener(new kk41(list, (byte) 2));
        return valueAnimatorOfFloat;
    }

    public static final void l(Animator animator) {
        if (animator instanceof AnimatorSet) {
            for (Animator animator2 : ((AnimatorSet) animator).getChildAnimations()) {
                animator2.getClass();
                l(animator2);
            }
        }
        animator.removeAllListeners();
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animator.cancel();
    }

    public static final float m(Integer num, View view) {
        return TypedValue.applyDimension(1, num.floatValue(), view.getContext().getResources().getDisplayMetrics());
    }

    public static pxw n(qq81 qq81Var) {
        return new pxw(!qq81Var.Y, qq81Var.h == null);
    }

    public static ObjectAnimator o(ParagraphView paragraphView, long j, long j2, PathInterpolator pathInterpolator, int i) {
        if ((i & 8) != 0) {
            j2 = 0;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(paragraphView, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    public static ObjectAnimator p(View view, PathInterpolator pathInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setStartDelay(333L);
        objectAnimatorOfFloat.setDuration(333L);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    public static final String q(String str) {
        if (x(str)) {
            return nhc1.W(str, "spotify-audio://", "");
        }
        return null;
    }

    public static final o3r r(String str) {
        if (ihc1.h0(str, ":collection", false)) {
            jd11 jd11Var = rc11.a;
            return w3p1.m(new l4r(new xv00(jd11Var.b(jo70.class)), 1, gkv.t, new j4r(ikv.d), gkv.U0), new l4r(new xv00(jd11Var.b(xkk1.class)), 1, hkv.b, new j4r(ikv.N0), hkv.Z), new l4r(new xv00(jd11Var.b(hzy.class)), 1, hkv.U0, new j4r(ikv.X0), hkv.V0), gft.h);
        }
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x(str).d;
        boolean zJ = u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e);
        b2v b2vVar = b2v.a;
        if (zJ) {
            jd11 jd11Var2 = rc11.a;
            return w3p1.l(new l4r(new xv00(jd11Var2.b(jo70.class)), 1, hkv.W0, new j4r(jkv.c), hkv.X0), new l4r(new xv00(jd11Var2.b(xkk1.class)), 1, hkv.Y0, new j4r(jkv.d), dkv.d1), new l4r(new xv00(jd11Var2.b(hzy.class)), 1, dkv.e1, new j4r(jkv.e), gkv.b), new l4r(b2vVar, 1, gkv.c, new j4r(jkv.f), gkv.d), riu.e1);
        }
        int iOrdinal = uic.x(str).c.ordinal();
        hjx0 hjx0Var = hjx0.a;
        if (iOrdinal != 30) {
            if (iOrdinal == 44) {
                jd11 jd11Var3 = rc11.a;
                return w3p1.m(new l4r(new xv00(jd11Var3.b(jo70.class)), 1, gkv.i, new j4r(hkv.e1), gkv.X), new l4r(new xv00(jd11Var3.b(xkk1.class)), 1, gkv.Y, new j4r(ikv.b), gkv.Z), new l4r(new xv00(jd11Var3.b(hzy.class)), 1, gkv.N0, new j4r(ikv.c), gkv.O0), gft.g);
            }
            if (iOrdinal == 166 || iOrdinal == 652) {
                jd11 jd11Var4 = rc11.a;
                return w3p1.i(new l4r(new xv00(jd11Var4.b(jo70.class)), 1, gkv.a1, new j4r(ikv.t), gkv.b1), new l4r(new xv00(jd11Var4.b(xkk1.class)), 1, gkv.c1, new j4r(ikv.X), gkv.d1), new l4r(new xv00(jd11Var4.b(hll.class)), 2, dkv.a1, new j4r(ikv.Y), dkv.b1), new l4r(new xv00(jd11Var4.b(hzy.class)), 2, dkv.c1, new j4r(ikv.Z), dkv.d), new l4r(hjx0Var, 2, dkv.e, new j4r(ikv.O0), dkv.f), new l4r(b2vVar, 2, dkv.g, new j4r(ikv.P0), dkv.h), new l4r(new xv00(jd11Var4.b(zoy0.class)), 2, dkv.i, new j4r(ikv.Q0), dkv.t), a4r.c);
            }
            if (iOrdinal != 844) {
                if (iOrdinal == 860) {
                    jd11 jd11Var5 = rc11.a;
                    return w3p1.k(new l4r(new xv00(jd11Var5.b(jo70.class)), 1, gkv.e, new j4r(hkv.Z0), gkv.f), new l4r(new xv00(jd11Var5.b(xkk1.class)), 1, gkv.g, new j4r(hkv.a1), gkv.h), new l4r(new xv00(jd11Var5.b(hll.class)), 2, dkv.N0, new j4r(hkv.b1), dkv.V0), new l4r(new xv00(jd11Var5.b(hzy.class)), 2, dkv.W0, new j4r(hkv.c1), dkv.X0), new l4r(new xv00(jd11Var5.b(w281.class)), 2, dkv.Y0, new j4r(hkv.d1), dkv.Z0), qsj.X);
                }
                if (iOrdinal != 926) {
                    jd11 jd11Var6 = rc11.a;
                    return w3p1.k(new l4r(new xv00(jd11Var6.b(jo70.class)), 1, hkv.Q0, new j4r(ikv.b1), hkv.R0), new l4r(new xv00(jd11Var6.b(xkk1.class)), 1, hkv.S0, new j4r(ikv.c1), hkv.T0), new l4r(new xv00(jd11Var6.b(hll.class)), 2, dkv.P0, new j4r(ikv.d1), dkv.Q0), new l4r(hjx0Var, 2, dkv.R0, new j4r(ikv.e1), dkv.S0), new l4r(b2vVar, 2, dkv.T0, new j4r(jkv.b), dkv.U0), qsj.Z);
                }
                jd11 jd11Var7 = rc11.a;
                return w3p1.k(new l4r(new xv00(jd11Var7.b(jo70.class)), 1, gkv.P0, new j4r(ikv.e), gkv.Q0), new l4r(new xv00(jd11Var7.b(xkk1.class)), 1, gkv.R0, new j4r(ikv.f), gkv.S0), new l4r(new xv00(jd11Var7.b(hll.class)), 1, gkv.T0, new j4r(ikv.g), gkv.V0), new l4r(new xv00(jd11Var7.b(hzy.class)), 1, gkv.W0, new j4r(ikv.h), gkv.X0), new l4r(b2vVar, 1, gkv.Y0, new j4r(ikv.i), gkv.Z0), qsj.Y);
            }
        }
        jd11 jd11Var8 = rc11.a;
        return w3p1.g(new l4r(new xv00(jd11Var8.b(jo70.class)), 1, gkv.e1, new j4r(ikv.R0), hkv.c), new l4r(new xv00(jd11Var8.b(xkk1.class)), 1, hkv.d, new j4r(ikv.S0), hkv.e), new l4r(new xv00(jd11Var8.b(hll.class)), 1, hkv.f, new j4r(ikv.T0), hkv.g), new l4r(new xv00(jd11Var8.b(hzy.class)), 1, hkv.h, new j4r(ikv.U0), hkv.i), new l4r(hjx0Var, 1, hkv.t, new j4r(ikv.V0), hkv.X), new l4r(b2vVar, 1, hkv.Y, new j4r(ikv.W0), hkv.N0), new l4r(new xv00(jd11Var8.b(zoy0.class)), 1, hkv.O0, new j4r(ikv.Y0), hkv.P0), new l4r(new xv00(jd11Var8.b(w281.class)), 2, dkv.X, new j4r(ikv.Z0), dkv.Y), new l4r(new xv00(jd11Var8.b(mdz.class)), 2, dkv.Z, new j4r(ikv.a1), dkv.O0), n0k.c);
    }

    public static final ArrayList s(l3b0 l3b0Var) {
        return don1.u(l3b0Var).a;
    }

    public static final ija0 t(p3b0 p3b0Var) {
        return ulo1.q(p3b0Var.e, uia0.b).a;
    }

    public static final ija0 u(u3b0 u3b0Var) {
        return ulo1.q(u3b0Var.k, yia0.b).a;
    }

    public static final che0 v(b0k b0kVar) {
        int iC = l1d.C(dhe0.a(b0kVar));
        if (iC != 0) {
            if (iC == 1) {
                return b;
            }
            if (iC == 2) {
                return c;
            }
            if (iC != 3) {
                eg.o();
                return null;
            }
        }
        return a;
    }

    public static final boolean w(iix0 iix0Var) {
        boolean z = false;
        if (iix0Var != null && iix0Var.g()) {
            z = true;
        }
        return !z;
    }

    public static final boolean x(String str) {
        return nhc1.Y(str, "spotify-audio://", false);
    }

    public static final d45 y(Function0 function0, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
        boolean zG = x340Var.g(view);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = new d45(view, (iu30) null, function0);
            x340Var.s0(objT);
        }
        d45 d45Var = (d45) objT;
        boolean zI = x340Var.i(d45Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new x35(d45Var, (byte) 3);
            x340Var.s0(objT2);
        }
        qxd0.i(d45Var, (iu30) objT2, x340Var);
        return d45Var;
    }

    public static final Object z(nfa0 nfa0Var, ega0 ega0Var, nma0 nma0Var) {
        gha0 bha0Var;
        if (ega0Var instanceof uga0) {
            bha0Var = new gha0(nfa0Var, (uga0) ega0Var, (String) null, 12);
        } else if (ega0Var instanceof pfa0) {
            bha0Var = new hha0(nfa0Var, (pfa0) ega0Var);
        } else {
            if (!(ega0Var instanceof nga0) && !ega0Var.equals(rga0.INSTANCE)) {
                eg.o();
                return null;
            }
            bha0Var = new bha0(nfa0Var, (aha0) ega0Var, (String) null);
        }
        return bha0Var.Y(nma0Var);
    }
}
