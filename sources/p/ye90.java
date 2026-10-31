package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.spotify.listentitymusic.page.lastvisited.LastVisitedProto$LastVisitedStore;
import com.spotify.listentitymusic.page.lastvisited.LastVisitedProto$UserVisits;
import com.spotify.listentitymusic.page.lastvisited.LastVisitedProto$Visits;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ye90 implements xe90, Function, qlc1, vlc1, Predicate, l381, yfp0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ye90(String str) {
        this.a = (byte) 11;
        this.b = str;
        this.c = new ArrayList(0);
        zjj0.a.getClass();
        List listA = yjj0.a();
        new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((zjj0) it.next()).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006c, TryCatch #0 {IOException -> 0x006c, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    public static ye90 m(String... strArr) {
        String str;
        try {
            rhc[] rhcVarArr = new rhc[strArr.length];
            nac nacVar = new nac();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = eha0.e;
                nacVar.R(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i2 < i3) {
                                nacVar.X(i2, i3, str2);
                            }
                            nacVar.Y(str);
                            i2 = i3 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            nacVar.X(i2, i3, str2);
                        }
                        nacVar.Y(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    nacVar.X(i2, length, str2);
                }
                nacVar.R(34);
                nacVar.u();
                rhcVarArr[i] = nacVar.w(nacVar.b);
            }
            return new ye90((String[]) strArr.clone(), ob51.n(rhcVarArr), (byte) 6);
        } catch (IOException e) {
            eg.f(e);
            return null;
        }
    }

    public void a(xfp0 xfp0Var) {
        synchronized (((HashMap) this.c)) {
            try {
                and0 and0Var = (and0) ((HashMap) this.c).remove(xfp0Var);
                if (and0Var != null) {
                    and0Var.a.set(false);
                    x2g0.A().execute(new ag20(this, and0Var, (byte) 13));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x013c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0141  */
    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code duplicated, block: B:48:0x0155  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0162  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    /* JADX WARN: Code duplicated, block: B:59:0x017d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0183  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:76:0x0203  */
    /* JADX WARN: Code duplicated, block: B:78:0x0207  */
    /* JADX WARN: Code duplicated, block: B:79:0x021a  */
    /* JADX WARN: Code duplicated, block: B:81:0x021e  */
    /* JADX WARN: Code duplicated, block: B:82:0x025d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0265  */
    /* JADX WARN: Code duplicated, block: B:85:0x0267  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v20 java.lang.Object, still in use, count: 2, list:
          (r4v20 java.lang.Object) from 0x01ff: PHI (r4 I:??) = (r4v15 java.lang.Object), (r4v20 java.lang.Object) binds: [B:73:0x01fe, B:141:0x01ff] A[DONT_GENERATE, DONT_INLINE]
          (r4v20 java.lang.Object) from 0x01ef: CHECK_CAST (p.zuc0) (r4v20 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ye90.apply(java.lang.Object):java.lang.Object");
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public void c(ulc1 ulc1Var) {
        sdn0 sdn0Var = (sdn0) this.c;
        sdn0Var.a();
        ydn0 ydn0Var = ulc1Var.a;
        Object[] objArr = ydn0Var.b;
        long[] jArr = ydn0Var.c;
        int i = ydn0Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((dsb0) this.b).b(obj);
            int iD = sdn0Var.d(objB);
            int i3 = iD >= 0 ? sdn0Var.c[iD] : 0;
            if (i3 == 7) {
                ulc1Var.remove(obj);
            } else {
                sdn0Var.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    public void cancel() {
        nmb0 nmb0VarK = k();
        if ((nmb0VarK != null ? nmb0VarK.f : null) != null) {
            ((vmb0) this.b).h(this.c);
        }
    }

    public boolean d(x8a0 x8a0Var) {
        nmb0 nmb0VarK = k();
        nas0 nas0Var = nmb0VarK != null ? nmb0VarK.f : null;
        if (nas0Var == null || nas0Var.f()) {
            return true;
        }
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            boolean zJ = nas0Var.j(x8a0Var);
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            return zJ;
        } catch (Throwable th) {
            try {
                nmb0VarK.getClass();
                throw th;
            } catch (Throwable th2) {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                throw th2;
            }
        }
    }

    public boolean e() {
        nas0 nas0Var;
        nmb0 nmb0VarK = k();
        if (nmb0VarK == null || (nas0Var = nmb0VarK.f) == null) {
            return true;
        }
        return nas0Var.f();
    }

    public void f(Executor executor, xfp0 xfp0Var) {
        synchronized (((HashMap) this.c)) {
            and0 and0Var = (and0) ((HashMap) this.c).get(xfp0Var);
            if (and0Var != null) {
                and0Var.a.set(false);
            }
            and0 and0Var2 = new and0(executor, (kl1) xfp0Var);
            ((HashMap) this.c).put(xfp0Var, and0Var2);
            x2g0.A().execute(new c45(this, and0Var, and0Var2, (byte) 25));
        }
    }

    public void g() {
        i8h1 i8h1Var = (i8h1) this.b;
        txk0 txk0Var = (txk0) ((ouz) this.c).b;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("joined_ipl_session_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = txk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public void h() {
        i8h1 i8h1Var = (i8h1) this.b;
        txk0 txk0Var = (txk0) ((ouz) this.c).b;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("joined_ipl_session_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void i(Canvas canvas, Rect rect) {
        Paint paint = (Paint) this.b;
        canvas.save();
        canvas.scale(rect.width(), rect.height());
        paint.setShader((LinearGradient) this.c);
        canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, paint);
        canvas.restore();
    }

    public boolean j(Object obj, Object obj2) {
        dsb0 dsb0Var = (dsb0) this.b;
        return u890.j(dsb0Var.b(obj), dsb0Var.b(obj2));
    }

    public nmb0 k() {
        vmb0 vmb0Var = (vmb0) this.b;
        hmb0 hmb0Var = (hmb0) vmb0Var.t.g(this.c);
        if (hmb0Var != null) {
            return (nmb0) vmb0Var.f.g(hmb0Var);
        }
        return null;
    }

    public sna0 l(lby lbyVar, yma0 yma0Var, d8r0 d8r0Var, String str) {
        String str2 = lbyVar.a;
        String str3 = lbyVar.b;
        tb51 tb51Var = (tb51) this.b;
        String strG = tb51.g(tb51Var, lbyVar);
        di4 di4Var = (di4) this.c;
        if (di4Var.N()) {
            List list = yma0Var.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
            String str4 = yma0Var.c;
            String string = null;
            if (str4 != null) {
                if (str4.length() <= 0) {
                    str4 = null;
                }
                if (str4 != null) {
                    string = tb51Var.a.getResources().getString(2131961553, str4);
                }
            }
            strG = bmq0.j0(bmq0.j0(strG, strY0), string);
        }
        String str5 = strG;
        boolean zN = di4Var.N();
        String str6 = lbyVar.c;
        return new sna0(yma0Var.b ? 1 : yma0Var.a ? 2 : 3, 2, -1, str2, str3, str5, str6, str, d8r0Var, zN);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, String str2, long j, onm onmVar) {
        qgb0 qgb0Var;
        Map mapP;
        if (onmVar instanceof qgb0) {
            qgb0Var = (qgb0) onmVar;
            int i = qgb0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qgb0Var.f = i - Integer.MIN_VALUE;
            } else {
                qgb0Var = new qgb0(this, onmVar);
            }
        } else {
            qgb0Var = new qgb0(this, onmVar);
        }
        Object objI = qgb0Var.d;
        int i2 = qgb0Var.f;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 data = ((r4r) this.c).getData();
            qgb0Var.a = str;
            qgb0Var.b = str2;
            qgb0Var.c = j;
            qgb0Var.f = 1;
            objI = b5p1.i(data, qgb0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = qgb0Var.c;
            str2 = qgb0Var.b;
            str = qgb0Var.a;
            hm5.M(objI);
        }
        LastVisitedProto$UserVisits lastVisitedProto$UserVisits = (LastVisitedProto$UserVisits) ((LastVisitedProto$LastVisitedStore) objI).o().get(str);
        LastVisitedProto$Visits lastVisitedProto$Visits = (lastVisitedProto$UserVisits == null || (mapP = lastVisitedProto$UserVisits.p()) == null) ? null : (LastVisitedProto$Visits) mapP.get(str2);
        mma0[] mma0VarArr = sgb0.a;
        if (lastVisitedProto$Visits == null) {
            return null;
        }
        Long lValueOf = Long.valueOf(lastVisitedProto$Visits.p());
        if (!lastVisitedProto$Visits.q()) {
            lValueOf = null;
        }
        if (lastVisitedProto$Visits.o() <= j) {
            return lastVisitedProto$Visits.o() == j ? lValueOf : Long.valueOf(lastVisitedProto$Visits.o());
        }
        if (lValueOf != null) {
            Long l = lValueOf.longValue() <= j ? lValueOf : null;
            if (l != null) {
                j = l.longValue();
            }
        }
        return Long.valueOf(j);
    }

    public void o() {
        i8h1 i8h1Var = (i8h1) this.b;
        txk0 txk0Var = (txk0) ((ouz) this.c).b;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("joined_ipl_session_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public String p() {
        i8h1 i8h1Var = (i8h1) this.b;
        txk0 txk0Var = (txk0) ((ouz) this.c).b;
        txk0Var.getClass();
        x6h1 x6h1VarC = txk0Var.b.c();
        x6h1VarC.i.add(new a7h1("joined_ipl_session_nudge", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("change_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:connect-device-picker")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public boolean t(Object obj) {
        boolean zE;
        pcc0 pcc0Var = (pcc0) obj;
        ncc0 ncc0Var = (ncc0) this.c;
        Set set = pcc0Var.a;
        d2f1 d2f1Var = ncc0Var.c;
        qxc0 qxc0Var = pcc0Var.b;
        String str = ncc0Var.b;
        le30 le30VarA = ncc0Var.d.a(qxc0Var.e);
        boolean z = qxc0Var.h;
        boolean z2 = qxc0Var.X0;
        wls0 wls0Var = qxc0Var.i;
        Map map = qxc0Var.X;
        if (gyo1.L(qxc0Var.O0) || z2 || ((wls0Var.a() && !z) || Boolean.parseBoolean((String) map.get("is_video_first")))) {
            zE = false;
        } else {
            boolean zA = d2f1.a(str, le30VarA);
            jq4 jq4Var = d2f1Var.c;
            zE = zA ? jq4Var.e() : jq4Var.f();
        }
        return ncc0.a(set, zE);
    }

    public boolean test(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return u890.j(playerState.contextUri(), ((i1k0) this.b).p()) || u890.j(playerState.contextUri(), (String) this.c);
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public ye90(i8h1 i8h1Var) {
        this.a = (byte) 10;
        this.b = i8h1Var;
        this.c = new xok0((byte) 28);
    }

    public ye90(int i, int i2) {
        this.a = (byte) 22;
        this.b = new Paint(1);
        new Matrix();
        new RectF();
        this.c = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i, i2, Shader.TileMode.CLAMP);
    }

    public ye90(Context context, yqg yqgVar) {
        this.a = (byte) 13;
        this.b = yqgVar;
        this.c = (r4r) sgb0.b.a(context, sgb0.a[0]);
    }

    public ye90() {
        this.a = (byte) 28;
        this.b = new kdn0();
        this.c = new HashMap();
    }

    public ye90(ncc0 ncc0Var) {
        this.a = (byte) 21;
        this.c = ncc0Var;
        this.b = ncc0Var.g;
    }

    public ye90(dsb0 dsb0Var) {
        this.a = (byte) 16;
        this.b = dsb0Var;
        sdn0 sdn0Var = kfp0.a;
        this.c = new sdn0();
    }

    public /* synthetic */ ye90(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public rlc1 apply() {
        vmb0 vmb0Var = (vmb0) this.b;
        nmb0 nmb0VarK = k();
        if (nmb0VarK != null) {
            vmb0Var.d(nmb0VarK, false);
        }
        return vmb0Var.f(this.c);
    }
}
