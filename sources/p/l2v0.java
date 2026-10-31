package p;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l2v0 implements slq0 {
    public final /* synthetic */ byte a = 0;
    public final Context b;
    public final efr c;
    public final lo9 d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final zob1 h;

    public l2v0(Context context, efr efrVar, lo9 lo9Var, lzn0 lzn0Var, z5h1 z5h1Var, c9n c9nVar, b2v0 b2v0Var, ymd0 ymd0Var) {
        LinkedHashMap linkedHashMap;
        this.b = context;
        this.c = efrVar;
        this.d = lo9Var;
        this.e = lzn0Var;
        this.f = z5h1Var;
        this.g = b2v0Var;
        x010 x010Var = new x010(b2v0Var.a(), t5p1.i(ymd0Var), new dwf0(this, (lnm) null, (byte) 10), (byte) 1);
        ioj0 ioj0Var = (ioj0) ymd0Var.e();
        if (ioj0Var != null) {
            Set setB = ioj0Var.a.b();
            int iS = zno1.s(q7h.U(setB, 10));
            linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
            for (Object obj : setB) {
                linkedHashMap.put(obj, e((String) obj, (g2v0) ((b2v0) this.g).a().getValue(), ioj0Var));
            }
        } else {
            linkedHashMap = b7x.a;
        }
        this.h = d5p1.t(x010Var, c9nVar, ey71.a, new rlq0(linkedHashMap));
    }

    public static void c(Function0 function0) {
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new is3(function0, (byte) 7));
        }
    }

    public static void d(Function0 function0) {
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new is3(function0, (byte) 9));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public static qlq0 e(String str, g2v0 g2v0Var, ioj0 ioj0Var) {
        boolean zBooleanValue;
        if (g2v0Var.a) {
            hoj0 hoj0VarC = ioj0Var.c(mdz.class, str);
            if (hoj0VarC == null) {
                zBooleanValue = false;
            } else {
                goj0 goj0VarA = hoj0VarC.a();
                Boolean boolValueOf = goj0VarA != null ? Boolean.valueOf(!((mdz) goj0VarA.a).g.isEmpty()) : null;
                if (boolValueOf != null) {
                    zBooleanValue = boolValueOf.booleanValue();
                } else {
                    zBooleanValue = false;
                }
            }
            if (zBooleanValue) {
                return new nlq0(Collections.singleton(mlq0.a));
            }
        }
        return olq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r2 == r11) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r17, p.mlq0 r18, p.r6h1 r19, p.lnm r20) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l2v0.a(java.lang.String, p.mlq0, p.r6h1, p.lnm):java.lang.Object");
    }

    public xe01 b(zob1 zob1Var) {
        Set setKeySet = ((b521) zob1Var.getValue()).a.keySet();
        int iS = zno1.s(q7h.U(setKeySet, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : setKeySet) {
            linkedHashMap.put(obj, new nlq0(Collections.singleton(mlq0.b)));
        }
        return d5p1.t(new p90(zob1Var, (byte) 10), (c9n) this.f, ey71.a, new rlq0(linkedHashMap));
    }

    public Function0 f(String str, String str2, String str3, String str4, Function0 function0, Function0 function1, Function0 function2) {
        if (((zb4) this.d.b).a()) {
            efr efrVar = this.c;
            if (!efrVar.c()) {
                function2.invoke();
                return n521.b;
            }
            z50 z50Var = z50.c;
            return new i2v0(this, oqo1.t((Activity) efrVar.b, new fhx(str, str2, new ygx(str3, new gbx(z50Var, function0)), new ygx(str4, new gbx(z50Var, function1)), function2, null, 80)), (byte) 7);
        }
        mw40 mw40VarT = yoi1.T(this.b, str, str2);
        mw40VarT.e = true;
        mw40VarT.f = new vae((Object) function2, (byte) 10);
        wzk wzkVar = new wzk(function0, (byte) 3);
        mw40VarT.a = str3;
        mw40VarT.c = wzkVar;
        wzk wzkVar2 = new wzk(function1, (byte) 4);
        mw40VarT.b = str4;
        mw40VarT.d = wzkVar2;
        pw40 pw40VarB = mw40VarT.b();
        pw40VarB.b();
        return new j2v0(this, pw40VarB, (byte) 7);
    }

    public final zob1 getStatus() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.h;
    }

    public l2v0(Context context, efr efrVar, lo9 lo9Var, pvc pvcVar, q8n q8nVar, c9n c9nVar, p421 p421Var, zob1 zob1Var) {
        xe01 xe01VarB;
        this.b = context;
        this.c = efrVar;
        this.d = lo9Var;
        this.e = q8nVar;
        this.f = c9nVar;
        this.g = p421Var;
        if (p421Var != null) {
            xe01VarB = b(p421Var.a());
        } else if (zob1Var != null) {
            xe01VarB = b(zob1Var);
        } else {
            xe01VarB = gio1.b(new rlq0(b7x.a));
        }
        this.h = xe01VarB;
    }
}
