package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class f3o1 {
    public static final hix0 a = new hix0(false, 0);
    public static b180 b;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        b0k b0kVar2;
        int i3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1694708998);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, b0kVar3, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (z) {
                b0kVar3.i0(-603075144);
                cnx cnxVar = cnx.c;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                i3 = 1;
                b0kVar2 = b0kVar3;
                w0h1.a(cnxVar, isl.a, u291.r(nim0.a, 12.0f), 0L, cbx.a(b0kVar3).b.e, true, b0kVar2, cnx.d | 196656, 8);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                i3 = 1;
                b0kVar2.i0(-602792424);
                b0kVar2.r(false);
            }
            String strO0 = cwl1.o0(b0kVar2, 2131961487);
            lee1 lee1Var = cbx.d(b0kVar2).j;
            long j = cbx.a(b0kVar2).b.e;
            cjc0 cjc0Var = new cjc0(i3);
            boolean z2 = i3;
            b0kVar3 = b0kVar2;
            uwo1.e(strO0, null, lee1Var, j, null, null, 0, false, cjc0Var, 0, null, b0kVar3, 0, 0, 1778);
            b0kVar3.r(z2);
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new kx9(z, qim0Var, i, (byte) 5);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1536765960);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mod.b(pyx.a.a((Object) null), apo.r(1597342904, new j2r0(j2iVar, (byte) 4), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j2r0(j2iVar, i, (byte) 5);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(qa51 qa51Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1381726046);
        int i2 = (x340Var.g(qa51Var) ? 4 : 2) | i | 48;
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else {
            if (!(qa51Var instanceof qa51)) {
                throw p3d1.k(x340Var, 693839022, false);
            }
            x340Var.i0(693840819);
            boolean z = qa51Var.a;
            qim0 qim0Var2 = nim0.a;
            a(48, x340Var, qim0Var2, z);
            x340Var.r(false);
            qim0Var = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(qa51Var, qim0Var, i, (byte) 4);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(947891603);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gbx gbxVar = new gbx(z50.c, function0);
            ldx ldxVar = ldx.c;
            gdx gdxVarA = yla.s(x340Var).a();
            j2i j2iVar = clj.b;
            qim0Var2 = nim0.a;
            wro1.h(gbxVar, ldxVar, qim0Var2, null, gdxVarA, null, false, null, null, j2iVar, x340Var, 384, 6, 984);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var2, i, (byte) 8);
        }
    }

    public static final void e(String str, f371 f371Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(234379990);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(f371Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            j2i j2iVarR = apo.r(1017361, new nl41(str, (byte) 25), x340Var);
            j2i j2iVarR2 = apo.r(1187994703, new h621(function0, (byte) 15), x340Var);
            j2i j2iVarR3 = apo.r(338802886, new xw91(f371Var, function1, (byte) 7), x340Var);
            qim0 qim0Var3 = nim0.a;
            ti5.a(j2iVarR, qim0Var3, j2iVarR2, j2iVarR3, 0.0f, (erl1) null, (x7f1) null, x340Var, 3510, 240);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(str, f371Var, function0, function1, qim0Var2, i, (byte) 23);
        }
    }

    public static final ki0 f(ContextTrack contextTrack, ji0 ji0Var) {
        if (u890.j(contextTrack.metadata().get("ad.companion.type"), "survey")) {
            return null;
        }
        if (ji0Var != null || Boolean.parseBoolean((String) contextTrack.metadata().get("is_connect_cta_enabled"))) {
            return ji0Var != null ? ji0Var : new qlm(contextTrack);
        }
        return null;
    }

    public static final void g(g4r g4rVar, maa maaVar) {
        f4r data;
        wul1 wul1Var = maaVar instanceof wul1 ? (wul1) maaVar : null;
        if (wul1Var == null || (data = wul1Var.getData()) == null) {
            return;
        }
        g4rVar.a.add(new i4r(aw50.O0, data));
    }

    public static final void h(Class cls, StringBuilder sb) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
        } else {
            if (cls.equals(Double.TYPE)) {
                sb.append("D");
                return;
            }
            sb.append("L");
            sb.append((CharSequence) cls.getName().replace('.', '/'));
            sb.append(";");
        }
    }

    public static final String i(String str) {
        return nhc1.Y(str, "voice-transcript:", false) ? "" : str;
    }

    public static o3b1 j() {
        o3b1 o3b1Var = new o3b1();
        o3b1Var.d = new HashMap();
        o3b1Var.e = new ArrayList();
        return o3b1Var;
    }

    public static final Method k(kla0 kla0Var, String str) {
        if (!(kla0Var instanceof wdg)) {
            return null;
        }
        String strY0 = ihc1.Y0(str, '(');
        if (strY0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + kla0Var + '/' + str);
        }
        for (Method method : ((wdg) kla0Var).n().getDeclaredMethods()) {
            if (u890.j(method.getName(), strY0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                for (Class<?> cls : method.getParameterTypes()) {
                    cls.getClass();
                    h(cls, sb);
                }
                sb.append(")");
                h(method.getReturnType(), sb);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    public static final Rect l(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        x74.T(textPaint2, charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            x74.T(textPaint, charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final Intent m(q10 q10Var, cng1 cng1Var, int i, iu30 iu30Var) {
        int i2 = cng1Var.b;
        if (q10Var instanceof whb1) {
            whb1 whb1Var = (whb1) q10Var;
            Intent intentO = o(whb1Var, (scn0) iu30Var.invoke(whb1Var.b));
            if (intentO.getData() == null) {
                intentO.setData(j0p1.k(cng1Var, i, 5, ""));
            }
            return intentO;
        }
        if (q10Var instanceof cz31) {
            int i3 = ActionCallbackBroadcastReceiver.a;
            return j0p1.i(tyo1.f(cng1Var.a, i2, (scn0) iu30Var.invoke(((cz31) q10Var).a)), cng1Var, i);
        }
        if (!(q10Var instanceof iab0)) {
            hhg1.o(q10Var, "Cannot create fill-in Intent for action type: ");
            return null;
        }
        ComponentName componentName = cng1Var.n;
        if (componentName != null) {
            return j0p1.i(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i2), cng1Var, i);
        }
        hhg1.n("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        return null;
    }

    public static final PendingIntent n(q10 q10Var, cng1 cng1Var, int i, iu30 iu30Var) {
        int i2 = cng1Var.b;
        Context context = cng1Var.a;
        if (q10Var instanceof whb1) {
            whb1 whb1Var = (whb1) q10Var;
            Intent intentO = o(whb1Var, (scn0) iu30Var.invoke(whb1Var.b));
            if (intentO.getData() == null) {
                intentO.setData(j0p1.k(cng1Var, i, 5, ""));
            }
            return PendingIntent.getActivity(context, 0, intentO, 201326592, whb1Var.c);
        }
        if (q10Var instanceof cz31) {
            int i3 = ActionCallbackBroadcastReceiver.a;
            Intent intentF = tyo1.f(context, i2, (scn0) iu30Var.invoke(((cz31) q10Var).a));
            intentF.setData(j0p1.k(cng1Var, i, 5, ""));
            return PendingIntent.getBroadcast(context, 0, intentF, 201326592);
        }
        if (!(q10Var instanceof iab0)) {
            hhg1.o(q10Var, "Cannot create PendingIntent for action type: ");
            return null;
        }
        ComponentName componentName = cng1Var.n;
        if (componentName == null) {
            hhg1.n("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i2);
        intentPutExtra.setData(j0p1.k(cng1Var, i, 5, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    public static final Intent o(whb1 whb1Var, scn0 scn0Var) {
        if (!(whb1Var instanceof whb1)) {
            hhg1.o(whb1Var, "Action type not defined in app widget package: ");
            return null;
        }
        Intent intent = whb1Var.a;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(scn0Var.a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            x60 x60Var = (x60) entry.getKey();
            arrayList.add(new mmr0(x60Var.a, entry.getValue()));
        }
        mmr0[] mmr0VarArr = (mmr0[]) arrayList.toArray(new mmr0[0]);
        intent.putExtras(mno1.h((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length)));
        return intent;
    }

    public static final First p(zqd zqdVar) {
        return First.b(zqdVar);
    }

    public static final z9o0 q(Resources resources, aj70 aj70Var) {
        List list = aj70Var.c;
        int size = list.size();
        int i = aj70Var.d;
        int i2 = size + i;
        if (!list.isEmpty()) {
            return new z9o0(resources.getQuantityString(2131820705, i2, list.get(0), Integer.valueOf(i2)), 2131956810);
        }
        if (i > 0) {
            return new z9o0(resources.getString(2131956811, aj70Var.e), 2131956809);
        }
        return null;
    }

    public static final void r(t2j0 t2j0Var, z480 z480Var) {
        t2j0Var.a(z480Var.build());
    }

    public static final ux01 s(String str, String str2, boolean z) {
        goy goyVar;
        String strZ0 = ihc1.Z0(str, "?");
        Set set = s4b1.f;
        if (uic.x(str).c == blc0.x4) {
            return new qx01(strZ0, 1, 28, true);
        }
        Set set2 = s4b1.f;
        if (uic.j(str, jxu0.f)) {
            return new qx01(strZ0, 2, 60, false);
        }
        v5b1 v5b1Var = uic.x(str).d;
        if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
            return new qx01(strZ0, 1, 28, z);
        }
        if (uic.h(str, new blc0[]{blc0.g1, blc0.R3})) {
            return new qx01(strZ0, 3, 28, z);
        }
        if (uic.x(str).c == blc0.u1) {
            return new rx01(strZ0, 1);
        }
        if (uic.x(str).c == blc0.ti) {
            if (str2 != null) {
                goyVar = new goy(str2);
            } else {
                goyVar = z ? foy.f : eoy.f;
            }
            return new rx01(strZ0, 2, goyVar);
        }
        if (uic.x(str).c == blc0.U4) {
            return new rx01(strZ0, 3);
        }
        if (uic.x(str).c == blc0.Pg) {
            return new sx01(strZ0, 1);
        }
        if (uic.x(str).c == blc0.fh) {
            return new sx01(strZ0, 2);
        }
        return null;
    }

    public static final xy0 t(Flowable flowable, Scheduler scheduler, yqg yqgVar) {
        Flowable flowableJ = flowable.j(new xeu0(32L, scheduler, yqgVar));
        vbm[] vbmVarArr = q601.a;
        return new xy0(new kge(flowableJ), (byte) 14);
    }

    public static final eih1 u() {
        return new eih1();
    }

    public static final Next v(zqd zqdVar, pqd pqdVar) {
        Set set = zqdVar.a;
        if (pqdVar instanceof nqd) {
            String str = ((nqd) pqdVar).a;
            Set setO1 = o7h.o1(set);
            if (setO1.add(str)) {
                return set.isEmpty() ? Next.i(new zqd(setO1), Effects.a(new kqd[]{new kqd(true, str)})) : Next.h(new zqd(setO1));
            }
            return Next.j();
        }
        if (!(pqdVar instanceof oqd)) {
            eg.o();
            return null;
        }
        String str2 = ((oqd) pqdVar).a;
        Set setO2 = o7h.o1(set);
        boolean zRemove = setO2.remove(str2);
        zqd zqdVar2 = new zqd(setO2);
        if (setO2.isEmpty()) {
            return Next.i(zqdVar2, Effects.a(new kqd[]{new kqd(false, str2)}));
        }
        return zRemove ? Next.h(zqdVar2) : Next.j();
    }

    public static final void w(ain1 ain1Var, ArrayDeque arrayDeque) {
        if (!ain1Var.u()) {
            if (!(ain1Var instanceof pjn1)) {
                hhg1.n("Has a new type of ByteString been created? Found ".concat(String.valueOf(ain1Var.getClass())));
                return;
            }
            pjn1 pjn1Var = (pjn1) ain1Var;
            w(pjn1Var.d, arrayDeque);
            w(pjn1Var.e, arrayDeque);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(pjn1.h, ain1Var.f());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iB = pjn1.B(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((ain1) arrayDeque.peek()).f() >= iB) {
            arrayDeque.push(ain1Var);
            return;
        }
        int iB2 = pjn1.B(iBinarySearch);
        ain1 pjn1Var2 = (ain1) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((ain1) arrayDeque.peek()).f() < iB2) {
            pjn1Var2 = new pjn1((ain1) arrayDeque.pop(), pjn1Var2);
        }
        pjn1 pjn1Var3 = new pjn1(pjn1Var2, ain1Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(pjn1.h, pjn1Var3.c);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((ain1) arrayDeque.peek()).f() >= pjn1.B(iBinarySearch2 + 1)) {
                break;
            } else {
                pjn1Var3 = new pjn1((ain1) arrayDeque.pop(), pjn1Var3);
            }
        }
        arrayDeque.push(pjn1Var3);
    }
}
