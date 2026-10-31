package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.widget.NestedScrollView;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.CastDevice;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cab implements n6j0, l3v, Function, gwg {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public cab(Context context) {
        this.a = (byte) 14;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(xfo1.q(2130969714, context, zbh0.class.getCanonicalName()), omz0.w);
        t01.i(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.d = t01.i(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        t01.i(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        t01.i(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListI = dgo1.i(context, typedArrayObtainStyledAttributes, 6);
        this.b = t01.i(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        t01.i(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.c = t01.i(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        new Paint().setColor(colorStateListI.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A(wat watVar) {
        ((vid) this.d).a.a = watVar;
    }

    public void B(be50 be50Var) {
        this.c = be50Var;
    }

    public void C(flb0 flb0Var) {
        ((vid) this.d).a.b = flb0Var;
    }

    public void D(long j) {
        ((vid) this.d).a.d = j;
    }

    public void E(Bundle bundle) {
        this.d = bundle;
    }

    public boolean a() {
        return ((gwg) this.b).a();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba A[SYNTHETIC] */
    public Object apply(Object obj) {
        hpc1 hpc1Var;
        Iterator it;
        Object next;
        hpc1 hpc1Var2;
        Observable observableC;
        byte b = this.a;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (b) {
            case 5:
                u7c u7cVar = (u7c) obj3;
                return u7cVar.g.a.withLatestFrom(u7cVar.h.a(true), zhm0.Y).firstOrError().flatMap(new fta(u7cVar, (r9c) this.c, (m210) this.d, (r310) obj, (byte) 12));
            case 6:
                v7c v7cVar = (v7c) obj3;
                return v7cVar.e.a(true).firstOrError().flatMap(new fta((m210) this.c, (r9c) this.d, v7cVar, (r310) obj, (byte) 14));
            case 7:
                return ((r310) obj3).a((Map) obj, d7r.a(((v7c) this.c).d.d()), h510.a((k510) this.d)).map(qbo1.Y);
            case 20:
                String str = (String) obj;
                String language = Locale.forLanguageTag(str).getLanguage();
                List list = (List) obj3;
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        hpc1Var2 = (hpc1) next;
                        if (hpc1Var2 != null) {
                            str = ((hpc1) o7h.q0(list)).f;
                        } else {
                            str = ((hpc1) o7h.q0(list)).f;
                        }
                    } while (!u890.j(Locale.forLanguageTag(((hpc1) next).f).getLanguage(), language));
                    hpc1Var2 = (hpc1) next;
                    if (hpc1Var2 != null) {
                        str = ((hpc1) o7h.q0(list)).f;
                    } else {
                        str = ((hpc1) o7h.q0(list)).f;
                    }
                } else {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            it = list2.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                hpc1Var2 = (hpc1) next;
                                if (hpc1Var2 != null || (str = hpc1Var2.f) == null) {
                                    str = ((hpc1) o7h.q0(list)).f;
                                }
                            } while (!u890.j(Locale.forLanguageTag(((hpc1) next).f).getLanguage(), language));
                            hpc1Var2 = (hpc1) next;
                            if (hpc1Var2 != null) {
                                str = ((hpc1) o7h.q0(list)).f;
                            } else {
                                str = ((hpc1) o7h.q0(list)).f;
                            }
                        } else if (u890.j(((hpc1) it2.next()).f, str)) {
                        }
                    }
                }
                str.getClass();
                ((pnd) this.c).i.put((String) this.d, str);
                for (Object obj4 : list2) {
                    if (u890.j(((hpc1) obj4).f, str)) {
                        obj2 = obj4;
                        hpc1Var = (hpc1) obj2;
                        if (hpc1Var == null) {
                            hpc1Var = (hpc1) o7h.q0(list);
                        }
                        return new cnd(list, hpc1Var);
                    }
                }
                hpc1Var = (hpc1) obj2;
                if (hpc1Var == null) {
                    hpc1Var = (hpc1) o7h.q0(list);
                }
                return new cnd(list, hpc1Var);
            case 23:
                hsd hsdVar = (hsd) obj;
                kvd kvdVar = (kvd) obj3;
                List list3 = (List) this.c;
                String str2 = (String) this.d;
                hsdVar.getClass();
                jvd jvdVar = kvdVar.a;
                Map map = kvdVar.d;
                if (hsdVar instanceof fsd) {
                    observableC = Observable.just(map);
                } else if (hsdVar instanceof esd) {
                    observableC = jvdVar.n(str2, list3).map(new mp8((Object) kvdVar, (byte) 13));
                } else {
                    boolean z = hsdVar instanceof csd;
                    b7x b7xVar = b7x.a;
                    if (z) {
                        csd csdVar = (csd) hsdVar;
                        mvd mvdVar = (mvd) map.get(csdVar.a);
                        if (mvdVar == null || (observableC = jvdVar.g(csdVar.c, csdVar.b, mvdVar).map(new fp8(csdVar, (byte) 14))) == null) {
                            observableC = Observable.just(b7xVar);
                        }
                    } else if (hsdVar instanceof dsd) {
                        dsd dsdVar = (dsd) hsdVar;
                        String str3 = dsdVar.a;
                        i iVar = dsdVar.b;
                        mvd mvdVar2 = (mvd) map.get(str3);
                        if (mvdVar2 != null) {
                            observableC = jvdVar.f(iVar, dsdVar.c, (mvd) mvdVar2.b(iVar)).map(new i6b((Object) dsdVar, (byte) 7));
                            if (observableC == null) {
                                observableC = Observable.just(b7xVar);
                            }
                        } else {
                            observableC = Observable.just(b7xVar);
                        }
                    } else if (hsdVar instanceof gsd) {
                        gsd gsdVar = (gsd) hsdVar;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(entry.getKey(), (mvd) ((mvd) entry.getValue()).a(gsdVar.a));
                        }
                        observableC = Observable.just(linkedHashMap);
                    } else {
                        if (!(hsdVar instanceof bsd)) {
                            eg.o();
                            return null;
                        }
                        bsd bsdVar = (bsd) hsdVar;
                        observableC = jvdVar.c(bsdVar.a, bsdVar.b);
                    }
                }
                return observableC.map(new jc9((Object) kvdVar, (byte) 12));
            default:
                q7e q7eVar = (q7e) obj;
                rh90 rh90Var = q7eVar.d;
                String str4 = rh90Var.b;
                kfe kfeVar = q7eVar.e;
                gfe gfeVarI = wm5.I(kfeVar.name());
                mmq0 mmq0VarJ = wm5.J(str4);
                if (mmq0VarJ != null) {
                    Observable observable = ((qnv0) obj3).d(new smq0[]{new smq0(gfeVarI, mmq0VarJ, true)}, 1, nik1.I2.a, kfeVar == kfe.a, (dg30) this.c).x(new v7e(kfeVar, true)).subscribeOn((Scheduler) this.d).onErrorReturnItem(new u7e(kfeVar, true, rh90Var)).toObservable();
                    observable.getClass();
                    return observable;
                }
                Observable observableJust = Observable.just(new u7e(kfeVar, true, rh90Var));
                observableJust.getClass();
                return observableJust;
        }
    }

    public fmr b(ie30 ie30Var, LogSessionId logSessionId) {
        fmr fmrVarB = ((gwg) this.b).b(ie30Var, logSessionId);
        this.c = fmrVarB.c();
        return fmrVarB;
    }

    public fmr c(ie30 ie30Var, LogSessionId logSessionId) {
        fmr fmrVarC = ((gwg) this.b).c(ie30Var, logSessionId);
        this.d = fmrVarC.c();
        return fmrVarC;
    }

    public void cancel() {
        ((h7b1) this.b).cancel();
    }

    public void d(vxu vxuVar) throws IOException {
        Uri uri = (Uri) this.c;
        wpc wpcVar = (wpc) this.d;
        zv81 zv81Var = wpcVar.a;
        if (zv81Var != null) {
            String strA = wpcVar.c.a(new n3r(uri));
            long jE = zv81Var.e(0L, -1L, strA);
            if (jE > 0) {
                long jA = hyl.a(zv81Var.g(strA));
                if (jA == -1 || jE < jA) {
                    zv81Var.k(strA);
                }
            }
        }
        try {
            ((h7b1) this.b).d(vxuVar);
        } catch (IOException e) {
            Iterator it = z561.c0(iub.h, e).iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof SerializationException) {
                    zv81 zv81Var2 = wpcVar.a;
                    if (zv81Var2 == null) {
                        throw e;
                    }
                    zv81Var2.k(wpcVar.c.a(new n3r(uri)));
                    throw e;
                }
            }
            throw e;
        }
    }

    public boolean e() {
        return ((gwg) this.b).e();
    }

    public View f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        hux huxVar;
        String string;
        oxb oxbVar = (oxb) this.b;
        axt axtVar = (bxt) this.c;
        Context context = viewGroup.getContext();
        if (!oxbVar.f.a()) {
            huxVar = null;
        } else if (axtVar instanceof xwt) {
            huxVar = nnx.c;
        } else {
            if (!(axtVar instanceof axt)) {
                eg.o();
                return null;
            }
            huxVar = wsx.c;
        }
        if (axtVar instanceof axt) {
            int iC = l1d.C(axtVar.h);
            if (iC == 0) {
                string = context.getString(2131953005);
            } else {
                if (iC != 1 && iC != 2) {
                    eg.o();
                    return null;
                }
                string = context.getString(2131953006);
            }
            string.getClass();
        } else {
            if (!(axtVar instanceof xwt)) {
                eg.o();
                return null;
            }
            string = context.getString(2131953006);
        }
        kvt kvtVar = new kvt(huxVar, string, context.getString(2131952992, axtVar.getName()), context.getString(2131952993), context.getString(2131952995), axtVar.getType(), axtVar.c());
        h98 h98Var = new h98(viewGroup);
        w4l0 w4l0Var = (w4l0) this.d;
        viewGroup.setBackgroundColor(0);
        ((bpb1) h98Var.c).m((Object) null, kvtVar);
        h98Var.n(new oo6((Object) oxbVar, (Object) axtVar, (Object) w4l0Var, (byte) 20));
        return h98Var.getView();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    public void g(emt emtVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        u7h u7hVar;
        long jA;
        hdn0 hdn0Var;
        Object objA;
        float f;
        Integer num;
        emt emtVar2 = emtVar;
        Object obj = fkj0.X;
        String str = emtVar2.c;
        boolean z = emtVar2.g;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-488722995);
        int i2 = i | (x340Var.i(emtVar2) ? 4 : 2) | 48 | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xtb0 xtb0VarA = vpb1.A(x340Var);
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean zG = x340Var.g(watVar);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = bb00.h(watVar.i0(88.0f), x340Var);
            }
            hdn0 hdn0Var2 = (hdn0) objT;
            boolean zG2 = x340Var.g(str);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = bb00.h(500, x340Var);
            }
            err0 err0Var = (hdn0) objT2;
            boolean zG3 = x340Var.g(str);
            Object objT3 = x340Var.T();
            if (zG3 || objT3 == obj) {
                objT3 = new plt(z);
                x340Var.s0(objT3);
            }
            plt pltVar = (plt) objT3;
            ven0 ven0VarH = rwq.h(pltVar.b, x340Var, 0);
            int iS = (!z || (num = ((olt) ven0VarH.getValue()).d) == null) ? err0Var.s() : num.intValue();
            String str2 = emtVar2.b;
            if (str2 == null) {
                u7hVar = null;
            } else {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    u7hVar = new u7h(z4p1.e(Color.parseColor(str2)));
                } else {
                    u7hVar = null;
                }
            }
            if (u7hVar == null) {
                x340Var.i0(-1511332143);
                uwr uwrVar = cbx.a;
                jA = cbx.a(x340Var).a.a.a();
                x340Var.r(false);
            } else {
                x340Var.i0(-1511336142);
                x340Var.r(false);
                jA = u7hVar.a;
            }
            long j = jA;
            boolean zI = x340Var.i(xtb0VarA) | x340Var.i(err0Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == obj) {
                objT4 = new w7a(xtb0VarA, err0Var, (lnm) null, (byte) 27);
                x340Var.s0(objT4);
            }
            qxd0.t(xtb0VarA, x340Var, (vu30) objT4);
            err0 err0Var2 = (err0) hdn0Var2;
            boolean zE = x340Var.e(err0Var2.s()) | x340Var.e(iS);
            Object objT5 = x340Var.T();
            if (zE || objT5 == obj) {
                hdn0Var = hdn0Var2;
                objA = yv91.a(new o8c(xtb0VarA, iS, hdn0Var, (byte) 0));
                x340Var.s0(objA);
            } else {
                objA = objT5;
                hdn0Var = hdn0Var2;
            }
            tob1 tob1Var = (tob1) objA;
            boolean zE2 = x340Var.e(err0Var2.s()) | x340Var.e(iS);
            Object objT6 = x340Var.T();
            if (zE2 || objT6 == obj) {
                objT6 = yv91.a(new o8c(xtb0VarA, iS, hdn0Var, (byte) 1));
                x340Var.s0(objT6);
            }
            tob1 tob1Var2 = (tob1) objT6;
            boolean z2 = ((olt) ven0VarH.getValue()).b;
            boolean z3 = ((olt) ven0VarH.getValue()).c;
            float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
            if (z2 && z3) {
                f = fFloatValue;
            } else {
                f = z2 ? 0.0f : 1.0f;
            }
            u7h u7hVar2 = new u7h(u7h.b(j, f, 0.0f, 0.0f, 0.0f, 14));
            uwr uwrVar2 = cbx.a;
            mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{u7hVar2, new u7h(u7h.b(cbx.a(x340Var).a.c, f, 0.0f, 0.0f, 0.0f, 14))}), z ? ((Number) tob1Var2.getValue()).intValue() - iS : 0.0f, ((Number) tob1Var2.getValue()).intValue(), 8);
            Object objT7 = x340Var.T();
            if (objT7 == obj) {
                objT7 = gio1.b(Float.valueOf(1.0f - ((Number) tob1Var.getValue()).floatValue()));
                x340Var.s0(objT7);
            }
            wen0 wen0Var = (wen0) objT7;
            Float fValueOf = Float.valueOf(((Number) tob1Var.getValue()).floatValue());
            boolean zI2 = x340Var.i(wen0Var) | x340Var.i(tob1Var);
            Object objT8 = x340Var.T();
            if (zI2 || objT8 == obj) {
                objT8 = new w7a(wen0Var, tob1Var, (lnm) null, (byte) 28);
                x340Var.s0(objT8);
            }
            qxd0.t(fValueOf, x340Var, (vu30) objT8);
            qim0Var2 = nim0.a;
            qim0 qim0VarF = dug.f(u291.d(qim0Var2, 1.0f), cbx.a(x340Var).a.c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarH = u291.h(u291.f(qim0Var2, 1.0f), watVar.M0(((Number) tob1Var2.getValue()).intValue()));
            byte b = 6;
            t1c.a(dug.e(qim0VarH, mic0VarS, (hw61) null, 0.0f, 6), x340Var, 0);
            int i3 = (i2 << 12) & 3670016;
            emtVar2 = emtVar;
            j(emtVar.d, xtb0VarA, wen0Var, pltVar, new h3h1(new tla(emtVar, (byte) 25)), d9y0.k(qim0Var2, (z && ((olt) ven0VarH.getValue()).d == null) ? 0.0f : 1.0f), x340Var, i3);
            qim0 qim0VarX = lrn1.x(qim0Var2, 2.0f);
            String str3 = ((olt) ven0VarH.getValue()).a;
            if (ihc1.y0(str3)) {
                str3 = emtVar2.a;
            }
            String str4 = str3;
            String str5 = emtVar2.c;
            float fFloatValue2 = emtVar2.f ? 1.0f : ((Number) tob1Var.getValue()).floatValue();
            boolean zI3 = x340Var.i(hdn0Var) | x340Var.i(pltVar);
            Object objT9 = x340Var.T();
            if (zI3 || objT9 == obj) {
                objT9 = new ztb(pltVar, hdn0Var, b);
                x340Var.s0(objT9);
            }
            h(str4, str5, fFloatValue2, mic0VarS, (iu30) objT9, qim0VarX, x340Var, i3);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6((Object) this, (Object) emtVar2, (Object) qim0Var2, i, (byte) 29);
        }
    }

    public void h(String str, String str2, float f, mic0 mic0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1820225966);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(mic0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(this) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            lzn0 lzn0Var = (lzn0) this.c;
            boolean zI = b0kVar3.i(lzn0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new q01(0, lzn0Var, lzn0.class, "closeCurrentPage", "closeCurrentPage()V", 0, (byte) 24);
                b0kVar3.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            boolean zI2 = b0kVar3.i(c9nVar) | b0kVar3.i(this) | b0kVar3.i(context) | ((i3 & 112) == 32);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                f80 f80Var = new f80((byte) 16, c9nVar, this, context, str2);
                b0kVar3.s0(f80Var);
                objT3 = f80Var;
            }
            int i4 = i3 >> 3;
            int i5 = (i3 & 14) | 3072 | (i4 & 112) | (i4 & 896);
            int i6 = i3 << 6;
            b0kVar2 = b0kVar3;
            rqt0.c(str, f, mic0Var, function0, (Function0) objT3, iu30Var, qim0Var, b0kVar2, i5 | (3670016 & i6) | (i6 & 29360128));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oe8(this, str, str2, f, mic0Var, iu30Var, qim0Var, i);
        }
    }

    public void i(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(784925271);
        int i2 = i | 6 | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            irn1.u((qim0) null, (vu30) null, (vu30) null, (erl1) null, apo.r(756437840, new gaa(this), x340Var), x340Var, 24576, 15);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8((Object) this, (Object) qim0Var, i, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public void j(c380 c380Var, xtb0 xtb0Var, zob1 zob1Var, plt pltVar, h3h1 h3h1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ?? r8;
        Object obj = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1936220474);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(xtb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(zob1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(pltVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(h3h1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar2.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar2.i(this) ? 1048576 : 524288;
        }
        if (b0kVar2.Y(i2 & 1, (599187 & i2) != 599186)) {
            Configuration configuration = (Configuration) b0kVar2.k(AndroidCompositionLocals_androidKt.a);
            Object objT = b0kVar2.T();
            if (objT == obj) {
                objT = Integer.valueOf(configuration.screenWidthDp);
                b0kVar2.s0(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            Object objT2 = b0kVar2.T();
            if (objT2 == obj) {
                if (iIntValue >= 720) {
                    i3 = 3;
                } else if (iIntValue < 600) {
                    if (iIntValue >= 480) {
                        i3 = 3;
                    } else if (iIntValue < 360) {
                        i3 = 1;
                    }
                }
                objT2 = Integer.valueOf(i3);
                b0kVar2.s0(objT2);
            }
            int iIntValue2 = ((Number) objT2).intValue();
            Object objT3 = b0kVar2.T();
            if (objT3 == obj) {
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    knt kntVar = (knt) it.next();
                    arrayList.add(new h8k1(kntVar, kntVar));
                }
                objT3 = gio1.b(arrayList);
                b0kVar2.s0(objT3);
            }
            wen0 wen0Var = (wen0) objT3;
            int i4 = i2 & 112;
            vgo1.f((tl7) b0kVar2.k(rce0.a), xtb0Var, false, b0kVar2, i4, 4);
            boolean zI = b0kVar2.i(wen0Var) | b0kVar2.i(c380Var);
            Object objT4 = b0kVar2.T();
            if (zI || objT4 == obj) {
                r8 = 0;
                objT4 = new p8c(wen0Var, c380Var, null, (byte) 0);
                b0kVar2.s0(objT4);
            } else {
                r8 = 0;
            }
            qxd0.t(c380Var, b0kVar2, (vu30) objT4);
            nnt nntVar = (nnt) this.b;
            d0r d0rVar = (d0r) nntVar.a.get();
            tkt tktVar = new tkt(d0rVar, zob1Var, iIntValue2, iIntValue, nntVar.c.b, pltVar);
            dnc0 dnc0Var = new dnc0(d0rVar, u6t.f, u6t.g, (cc9) null, (guh0) null, 102);
            two1.v(dnc0Var, wen0Var, (boolean) r8, new wrs(nntVar, tktVar, (byte) 10));
            q1d0 q1d0VarN = jyo1.n(xtb0Var, dnc0Var.a(), h3h1Var, b0kVar2, (int) r8);
            qim0 qim0VarE = x2g0.E(b0kVar2, u291.d(qim0Var, 1.0f));
            u85 u85Var = (erl1) b0kVar2.k(szf0.b);
            if (u85Var == null) {
                b0kVar2.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(b0kVar2).g;
            } else {
                b0kVar2.i0(-241885792);
            }
            b0kVar2.r((boolean) r8);
            vk80 vk80VarC = hqq0.C(u85Var, b0kVar2);
            boolean zI2 = b0kVar2.i(this) | b0kVar2.i(q1d0VarN);
            Object objT5 = b0kVar2.T();
            if (zI2 || objT5 == obj) {
                objT5 = new xo8(this, q1d0VarN);
                b0kVar2.s0(objT5);
            }
            iu30 iu30Var = (iu30) objT5;
            b0kVar2 = b0kVar2;
            ujo1.d(qim0VarE, xtb0Var, vk80VarC, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, iu30Var, b0kVar2, i4, 504);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(this, c380Var, xtb0Var, zob1Var, pltVar, h3h1Var, qim0Var, i, (byte) 3);
        }
    }

    public void k(int i, int i2, int i3, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1925483534);
        int i4 = (x340Var.e(i) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            otw.c((xv81) this.b, new wv81(i, mqo1.s(new Integer[]{Integer.valueOf(i2)})), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl9(this, i, i2, i3);
        }
    }

    public void l(c380 c380Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-833441059);
        int i2 = (x340Var.e(2131953030) ? 4 : 2) | i | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            otw.c((xv81) this.b, new wv81(2131953030, c380Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8((Object) this, (Object) c380Var, i, (byte) 21);
        }
    }

    public n2e m() {
        return new n2e(this);
    }

    public jhm n() {
        return new jhm("queue_browse", qrx.c, (fhm) null, 2131954379, (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(iub.R0, iub.S0), new tla(this, (byte) 26)), 244);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(String str, onm onmVar) {
        ekd ekdVar;
        String str2;
        if (onmVar instanceof ekd) {
            ekdVar = (ekd) onmVar;
            int i = ekdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ekdVar.c = i - Integer.MIN_VALUE;
            } else {
                ekdVar = new ekd(this, onmVar);
            }
        } else {
            ekdVar = new ekd(this, onmVar);
        }
        Object objM = ekdVar.a;
        int i2 = ekdVar.c;
        if (i2 == 0) {
            hm5.M(objM);
            ekdVar.c = 1;
            objM = rc2.M(15000L, new wt(this, str, (lnm) null, (byte) 21), ekdVar);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        eid eidVar = (eid) objM;
        if (eidVar != null) {
            Context context = (Context) this.d;
            switch (eidVar.d) {
                case 1:
                    str2 = "IMAGE";
                    break;
                case 2:
                    str2 = "VIDEO";
                    break;
                case 3:
                    str2 = "VIDEO_LOOPING";
                    break;
                case 4:
                    str2 = "VIDEO_LOOPING_RANDOM";
                    break;
                case 5:
                    str2 = "GIF";
                    break;
                case 6:
                    str2 = "UNRECOGNISED";
                    break;
                default:
                    throw null;
            }
            sid sidVarValueOf = sid.valueOf(str2);
            String str3 = eidVar.b;
            sidVarValueOf.getClass();
            if ((sidVarValueOf == sid.b || sidVarValueOf == sid.c || sidVarValueOf == sid.d) && str3.length() > 0) {
                return new klw0(Uri.parse(str3), context.getString(2131953445));
            }
            if (sidVarValueOf == sid.a && str3.length() > 0) {
                return new jlw0(str3, context.getString(2131953445));
            }
        }
        return null;
    }

    public fid p() {
        return ((vid) this.d).a.c;
    }

    public long q() {
        uyr uyrVar = (uyr) this.d;
        if (uyrVar != null) {
            return uyrVar.d;
        }
        return -1L;
    }

    public wat r() {
        return ((vid) this.d).a.a;
    }

    public void remove() {
        ((h7b1) this.b).remove();
    }

    public be50 s() {
        return (be50) this.c;
    }

    public flb0 t() {
        return ((vid) this.d).a.b;
    }

    public long u() {
        return ((vid) this.d).a.d;
    }

    public dg8 v() {
        return (dg8) this.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    public void w(o2r o2rVar, Uri uri, Map map, long j, long j2, xjx0 xjx0Var) throws ParserException {
        ec10 ec10Var;
        uyr uyrVar = new uyr(o2rVar, j, j2);
        this.d = uyrVar;
        if (((ec10) this.c) != null) {
            return;
        }
        ec10[] ec10VarArrC = ((hc10) this.b).c(uri, map);
        v280 v280VarN = b380.n(ec10VarArrC.length);
        boolean z = true;
        if (ec10VarArrC.length == 1) {
            ec10Var = ec10VarArrC[0];
            this.c = ec10Var;
        } else {
            for (ec10 ec10Var2 : ec10VarArrC) {
                try {
                    if (ec10Var2.d(uyrVar)) {
                        this.c = ec10Var2;
                        uyrVar.f = 0;
                        break;
                    }
                    v280VarN.e(ec10Var2.e());
                    boolean z2 = ((ec10) this.c) != null || uyrVar.d == j;
                    dm5.y(z2);
                    uyrVar.f = 0;
                } catch (EOFException unused) {
                    if (((ec10) this.c) != null || uyrVar.d == j) {
                    }
                } catch (Throwable th) {
                    if (((ec10) this.c) == null && uyrVar.d != j) {
                        z = false;
                    }
                    dm5.y(z);
                    uyrVar.f = 0;
                    throw th;
                }
                dm5.y(z2);
                uyrVar.f = 0;
            }
            ec10 ec10Var3 = (ec10) this.c;
            if (ec10Var3 == null) {
                String str = "None of the available extractors (" + new cfa0(", ").c(z1p1.D(b380.q(ec10VarArrC), new cwa((byte) 1))) + ") could read the stream.";
                uri.getClass();
                throw new UnrecognizedInputFormatException(str, v280VarN.g());
            }
            ec10Var = ec10Var3;
        }
        ec10Var.b(xjx0Var);
    }

    public Object x(String str, r6h1 r6h1Var, a8d1 a8d1Var) {
        return fn31.Y((q8n) this.d, new sxa(this, str, r6h1Var, (lnm) null, (byte) 18), a8d1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(String str, onm onmVar, boolean z) {
        zsb zsbVar;
        if (onmVar instanceof zsb) {
            zsbVar = (zsb) onmVar;
            int i = zsbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zsbVar.c = i - Integer.MIN_VALUE;
            } else {
                zsbVar = new zsb(this, onmVar);
            }
        } else {
            zsbVar = new zsb(this, onmVar);
        }
        Object obj = zsbVar.a;
        int i2 = zsbVar.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            zsbVar.c = 1;
            Object objA = ((r4r) this.d).a(new sxa(this, str, z, (lnm) null), zsbVar);
            d9n d9nVar = d9n.a;
            if (objA != d9nVar) {
                objA = rih1Var;
            }
            return objA == d9nVar ? d9nVar : rih1Var;
        } catch (IOException unused) {
        }
    }

    public void z(fid fidVar) {
        ((vid) this.d).a.c = fidVar;
    }

    public /* synthetic */ cab(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public cab(CastDevice castDevice, zdp1 zdp1Var) {
        this.a = (byte) 24;
        zod.t(castDevice, "CastDevice parameter cannot be null");
        this.b = castDevice;
        this.c = zdp1Var;
    }

    public cab(wcr wcrVar, qc4 qc4Var) {
        this.a = (byte) 3;
        this.b = wcrVar;
        this.c = qc4Var;
    }

    public cab() {
        this.a = (byte) 12;
        this.b = new sw9((byte) 26);
        this.c = new sw9((byte) 26);
        this.d = new p6a1[32];
    }

    public cab(lzn0 lzn0Var, twb twbVar, xae xaeVar, q8n q8nVar) {
        this.a = (byte) 29;
        this.b = lzn0Var;
        this.c = xaeVar;
        this.d = q8nVar;
    }

    public cab(Context context, String str, String str2) {
        this.a = (byte) 1;
        this.b = str;
        this.c = str2;
        this.d = (r4r) atb.b.a(context, atb.a[0]);
    }

    public cab(NestedScrollView nestedScrollView, TextView textView, haa0 haa0Var, View view, RecyclerView recyclerView) {
        this.a = (byte) 25;
        this.b = nestedScrollView;
        this.c = haa0Var;
        this.d = view;
    }

    public cab(NestedScrollView nestedScrollView, TextView textView, RecyclerView recyclerView, View view) {
        this.a = (byte) 27;
        this.b = nestedScrollView;
        this.c = textView;
        this.d = view;
    }

    public cab(vid vidVar) {
        this.a = (byte) 17;
        this.d = vidVar;
        this.b = new dg8((Object) this, (byte) 14);
    }

    public /* synthetic */ cab(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public cab(byte[] bArr, n8d0 n8d0Var) {
        this.a = (byte) 13;
        this.b = bArr;
        this.c = null;
        this.d = n8d0Var;
    }

    public cab(Uri uri, n8d0 n8d0Var) {
        this.a = (byte) 13;
        this.b = null;
        this.c = uri;
        this.d = n8d0Var;
    }

    public cab(tqh0 tqh0Var, n8d0 n8d0Var) {
        this.a = (byte) 13;
        this.b = tqh0Var.k;
        this.c = tqh0Var.n;
        this.d = n8d0Var;
    }

    public cab(it8 it8Var) {
        this.a = (byte) 15;
        this.d = it8Var;
        this.c = new AtomicBoolean(false);
        this.b = ((p1d) it8Var.c).d.schedule(new k1d(this, (byte) 0), 2000L, TimeUnit.MILLISECONDS);
    }
}
