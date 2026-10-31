package p;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u7o0 implements l120 {
    public final String a;
    public final dqq0 b;
    public final idd1 c;
    public final idd1 d;
    public final idd1 e;
    public final qbl f;

    public u7o0(String str, dqq0 dqq0Var, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, qbl qblVar) {
        this.a = str;
        this.b = dqq0Var;
        this.c = idd1Var;
        this.d = idd1Var2;
        this.e = idd1Var3;
        this.f = qblVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public static String d(String str, String str2) {
        String strL;
        if (str2 == null || nhc1.Y(str2, "text/plain", false)) {
            if (ihc1.y0(str)) {
                strL = null;
            } else {
                String strA1 = ihc1.a1(ihc1.a1(str, '#'), '?');
                String strV0 = ihc1.V0(ihc1.V0(strA1, '/', strA1), '.', "");
                if (ihc1.y0(strV0)) {
                    strL = null;
                } else {
                    String lowerCase = strV0.toLowerCase(Locale.ROOT);
                    strL = (String) bsj0.a.get(lowerCase);
                    if (strL == null) {
                        strL = h1p1.l(lowerCase);
                    }
                }
            }
            if (strL != null) {
                return strL;
            }
        }
        if (str2 != null) {
            return ihc1.Y0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d A[Catch: Exception -> 0x003f, PHI: r0 r1
      0x018d: PHI (r0v26 java.lang.Object) = (r0v19 java.lang.Object), (r0v2 java.lang.Object) binds: [B:70:0x018a, B:22:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x018d: PHI (r1v10 p.p811) = (r1v8 p.p811), (r1v16 p.p811) binds: [B:70:0x018a, B:22:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x003f, blocks: (B:15:0x003a, B:77:0x01a9, B:22:0x004e, B:72:0x018d, B:74:0x0191, B:61:0x0149, B:63:0x014f, B:69:0x0174, B:44:0x00cf, B:46:0x00d6, B:48:0x00e4, B:55:0x0118, B:57:0x0124, B:51:0x00fc, B:53:0x0106, B:66:0x016b, B:67:0x0172), top: B:87:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0191 A[Catch: Exception -> 0x003f, TryCatch #1 {Exception -> 0x003f, blocks: (B:15:0x003a, B:77:0x01a9, B:22:0x004e, B:72:0x018d, B:74:0x0191, B:61:0x0149, B:63:0x014f, B:69:0x0174, B:44:0x00cf, B:46:0x00d6, B:48:0x00e4, B:55:0x0118, B:57:0x0124, B:51:0x00fc, B:53:0x0106, B:66:0x016b, B:67:0x0172), top: B:87:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a6, code lost:
    
        if (r0 == r11) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.lnm r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u7o0.a(p.lnm):java.lang.Object");
    }

    public final Object b(d8o0 d8o0Var, vu30 vu30Var, q7o0 q7o0Var) {
        if (this.b.i.a && u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        lxc lxcVar = (lxc) this.c.getValue();
        return lxc.a(lxcVar.a, d8o0Var, new p7o0(vu30Var, (lnm) null, (byte) 0), q7o0Var);
    }

    public final i520 c() {
        i520 i520Var;
        mf01 mf01Var = (mf01) this.d.getValue();
        return (mf01Var == null || (i520Var = mf01Var.a) == null) ? this.b.f : i520Var;
    }

    public final d8o0 e() {
        jc10 jc10Var = bz70.b;
        dqq0 dqq0Var = this.b;
        Object objV = kto1.v(dqq0Var, jc10Var);
        jsc jscVar = dqq0Var.h;
        w7o0 w7o0Var = (w7o0) objV;
        w7o0Var.getClass();
        Map map = w7o0Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        boolean z = jscVar.a;
        boolean z2 = dqq0Var.i.a && this.f.a();
        if (!z2 && z) {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), p7h.O(new String[]{"only-if-cached, max-stale=2147483647"}));
        } else if (!z2 || z) {
            if (!z2 && !z) {
                linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), p7h.O(new String[]{"no-cache, only-if-cached"}));
            }
        } else if (jscVar.b) {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), p7h.O(new String[]{"no-cache"}));
        } else {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), p7h.O(new String[]{"no-cache, no-store"}));
        }
        String str = (String) kto1.v(dqq0Var, bz70.a);
        w7o0 w7o0Var2 = new w7o0(sqg0.U(linkedHashMap));
        if (kto1.v(dqq0Var, bz70.c) == null) {
            return new d8o0(this.a, str, w7o0Var2, dqq0Var.j);
        }
        bhn0.d();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ola1 ola1Var, onm onmVar) {
        r7o0 r7o0Var;
        nac nacVar;
        if (onmVar instanceof r7o0) {
            r7o0Var = (r7o0) onmVar;
            int i = r7o0Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                r7o0Var.d = i - os00.INVALID_ID;
            } else {
                r7o0Var = new r7o0(this, onmVar);
            }
        } else {
            r7o0Var = new r7o0(this, onmVar);
        }
        Object obj = r7o0Var.b;
        int i2 = r7o0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            nac nacVar2 = new nac();
            r7o0Var.a = nacVar2;
            r7o0Var.d = 1;
            ola1Var.a(nacVar2);
            d9n d9nVar = rih1.a;
            d9n d9nVar2 = d9n.a;
            if (d9nVar == d9nVar2) {
                return d9nVar2;
            }
            nacVar = nacVar2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nacVar = r7o0Var.a;
            hm5.M(obj);
        }
        return jhc1.g(nacVar, c());
    }

    public final j420 g(lf01 lf01Var) {
        xdu xduVar = lf01Var.a;
        if (xduVar.b) {
            eg.m("snapshot is closed");
            return null;
        }
        s8s0 s8s0Var = (s8s0) xduVar.a.c.get(1);
        i520 i520VarC = c();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return jhc1.f(s8s0Var, i520VarC, str, lf01Var, 16);
    }

    public final i8o0 h(lf01 lf01Var) throws Throwable {
        Throwable th;
        i8o0 i8o0VarM;
        try {
            i520 i520VarC = c();
            xdu xduVar = lf01Var.a;
            if (xduVar.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            ff01 ff01Var = new ff01(i520VarC.j((s8s0) xduVar.a.c.get(0)));
            try {
                i8o0VarM = eqr0.M(ff01Var);
                try {
                    ff01Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    ff01Var.close();
                } catch (Throwable th4) {
                    j2h1.h(th3, th4);
                }
                th = th3;
                i8o0VarM = null;
            }
            if (th == null) {
                return i8o0VarM;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.rut0 */
    /* JADX WARN: Code duplicated, block: B:114:0x0243 A[Catch: Exception -> 0x003d, TryCatch #11 {Exception -> 0x003d, blocks: (B:13:0x0038, B:109:0x0228, B:110:0x0232, B:112:0x0240, B:114:0x0243, B:117:0x024a, B:118:0x024b, B:111:0x0233), top: B:154:0x0038, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0268  */
    /* JADX WARN: Code duplicated, block: B:140:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x021d, code lost:
    
        if (p.rih1.a == r6) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(p.lf01 r24, p.i8o0 r25, p.i8o0 r26, p.onm r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u7o0.i(p.lf01, p.i8o0, p.i8o0, p.onm):java.lang.Object");
    }
}
