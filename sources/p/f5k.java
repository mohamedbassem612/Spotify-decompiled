package p;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f5k {
    public final Context a;
    public final q8n b;
    public final q8n c;
    public final fkp d;
    public final hqc1 e;
    public final u8v f;
    public final boolean g;

    public f5k(Context context, q8n q8nVar, q8n q8nVar2, fkp fkpVar, hqc1 hqc1Var, u8v u8vVar, boolean z) {
        this.a = context;
        this.b = q8nVar;
        this.c = q8nVar2;
        this.d = fkpVar;
        this.e = hqc1Var;
        this.f = u8vVar;
        this.g = z;
    }

    public static boolean h(ArrayList arrayList, guq0 guq0Var) {
        if (arrayList.size() == 1) {
            x7g1 x7g1Var = (x7g1) arrayList.get(0);
            if ((x7g1Var instanceof x7g1) && guq0Var.e == null && guq0Var.d == null) {
                zax zaxVar = guq0Var.c;
                n5f0 n5f0Var = x7g1Var.b;
                if (n5f0Var.a == 0 && n5f0Var.b == Long.MAX_VALUE && u890.j(x7g1Var.c, Locale.ROOT) && xvj1.d(zaxVar.b) <= 720 && zaxVar.c == null && zaxVar.d == null && zaxVar.e == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(ArrayList arrayList) {
        if (this.g && arrayList.size() == 1) {
            x7g1 x7g1Var = (x7g1) arrayList.get(0);
            if (x7g1Var instanceof x7g1) {
                n5f0 n5f0Var = x7g1Var.b;
                if (n5f0Var.a != 0 || n5f0Var.b != Long.MAX_VALUE) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        x4k x4kVar;
        boolean zBooleanValue;
        if (onmVar instanceof x4k) {
            x4kVar = (x4k) onmVar;
            int i = x4kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x4kVar.c = i - Integer.MIN_VALUE;
            } else {
                x4kVar = new x4k(this, onmVar);
            }
        } else {
            x4kVar = new x4k(this, onmVar);
        }
        Object objA = x4kVar.a;
        int i2 = x4kVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                u8v u8vVar = this.f;
                x4kVar.c = 1;
                objA = u8vVar.a(str, x4kVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            zBooleanValue = ((Boolean) objA).booleanValue();
        } catch (Exception unused) {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[PHI: r2
      0x0074: PHI (r2v12 java.lang.Integer) = (r2v7 java.lang.Integer), (r2v9 java.lang.Integer) binds: [B:25:0x0072, B:35:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(x7g1 x7g1Var, guq0 guq0Var, long j, onm onmVar) {
        y4k y4kVar;
        guq0 guq0Var2;
        long j2;
        int iIntValue;
        int iIntValue2;
        x7g1 x7g1Var2 = x7g1Var;
        if (onmVar instanceof y4k) {
            y4kVar = (y4k) onmVar;
            int i = y4kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y4kVar.f = i - Integer.MIN_VALUE;
            } else {
                y4kVar = new y4k(this, onmVar);
            }
        } else {
            y4kVar = new y4k(this, onmVar);
        }
        Object objC = y4kVar.d;
        int i2 = y4kVar.f;
        if (i2 == 0) {
            hm5.M(objC);
            String strW = wqn1.w(x7g1Var2.a);
            if (strW != null) {
                Locale locale = x7g1Var2.c;
                y4kVar.a = x7g1Var2;
                guq0Var2 = guq0Var;
                y4kVar.b = guq0Var2;
                y4kVar.c = j;
                y4kVar.f = 1;
                objC = this.e.c(strW, locale, y4kVar);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
                j2 = j;
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = y4kVar.c;
        guq0 guq0Var3 = y4kVar.b;
        x7g1 x7g1Var3 = y4kVar.a;
        hm5.M(objC);
        j2 = j3;
        guq0Var2 = guq0Var3;
        x7g1Var2 = x7g1Var3;
        List list = (List) objC;
        if (!list.isEmpty()) {
            n5f0 n5f0Var = x7g1Var2.b;
            zax zaxVar = guq0Var2.c;
            Integer num = zaxVar.c;
            if (num == null) {
                int i3 = zaxVar.b;
                if (i3 == 1) {
                    i3 = 0;
                }
                num = i3 != 0 ? new Integer(xvj1.h(i3)) : null;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1920;
                }
            } else {
                iIntValue = num.intValue();
            }
            int i4 = iIntValue;
            zax zaxVar2 = guq0Var2.c;
            Integer num2 = zaxVar2.d;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                int i5 = zaxVar2.b;
                int i6 = i5 != 1 ? i5 : 0;
                Integer num3 = i6 != 0 ? new Integer(xvj1.d(i6)) : null;
                iIntValue2 = num3 != null ? num3.intValue() : 1080;
            }
            return new jpc1(this.a, list, n5f0Var, i4, iIntValue2, j2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public final Object d(ArrayList arrayList, guq0 guq0Var, String str, o0g1 o0g1Var, iu30 iu30Var, String str2, boolean z, Integer num, iu30 iu30Var2, boolean z2, onm onmVar) throws Throwable {
        a5k a5kVar;
        int i;
        Integer num2;
        x7g1 x7g1Var;
        d9n d9nVar;
        String str3;
        guq0 guq0Var2;
        Object obj;
        long j;
        iu30 iu30Var3;
        boolean z3;
        String str4;
        iu30 iu30Var4;
        ?? r2;
        String str5;
        boolean z4;
        LinkedHashMap linkedHashMap;
        long j2;
        int iM;
        String str6;
        String str7;
        Matrix matrix;
        Context context = this.a;
        if (onmVar instanceof a5k) {
            a5kVar = (a5k) onmVar;
            int i2 = a5kVar.P0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a5kVar.P0 = i2 - Integer.MIN_VALUE;
            } else {
                a5kVar = new a5k(this, onmVar);
            }
        } else {
            a5kVar = new a5k(this, onmVar);
        }
        a5k a5kVar2 = a5kVar;
        Object objS = a5kVar2.N0;
        int i3 = a5kVar2.P0;
        d9n d9nVar2 = d9n.a;
        if (i3 == 0) {
            hm5.M(objS);
            ?? r1 = 0;
            x7g1 x7g1Var2 = (x7g1) arrayList.get(0);
            n5f0 n5f0Var = x7g1Var2.b;
            long j3 = n5f0Var.b - n5f0Var.a;
            if (guq0Var.e == null && guq0Var.d == null) {
                zax zaxVar = guq0Var.c;
                if (str2 == null && !z && xvj1.d(zaxVar.b) <= 720 && zaxVar.c == null && zaxVar.d == null) {
                    i = 1;
                    if (zaxVar.e == 1) {
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    x7g1 x7g1Var3 = (x7g1) it.next();
                                    if (!(x7g1Var3 instanceof x7g1)) {
                                        eg.o();
                                        return null;
                                    }
                                    if (u890.j(x7g1Var3.c, Locale.ROOT)) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i = 1;
                }
                r1 = i;
            } else {
                i = 1;
                r1 = i;
            }
            String strConcat = r1 != 0 ? guq0Var.a.concat("_editlist_temp.mp4") : str;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int i4 = i;
            b5k b5kVar = new b5k((boolean) r1, x7g1Var2, this, strConcat, o0g1Var, guq0Var, iu30Var, iu30Var2, z2, linkedHashMap2, (lnm) null);
            a5kVar2.a = guq0Var;
            a5kVar2.b = str;
            a5kVar2.c = iu30Var;
            a5kVar2.d = str2;
            num2 = num;
            a5kVar2.e = num2;
            a5kVar2.f = iu30Var2;
            a5kVar2.g = x7g1Var2;
            a5kVar2.h = strConcat;
            a5kVar2.i = linkedHashMap2;
            a5kVar2.t = z;
            a5kVar2.X = z2;
            x7g1Var = x7g1Var2;
            a5kVar2.Y = j3;
            a5kVar2.Z = r1;
            a5kVar2.P0 = i4;
            Object objS2 = smo1.s(b5kVar, a5kVar2);
            d9nVar = d9nVar2;
            if (objS2 == d9nVar) {
                return d9nVar;
            }
            str3 = strConcat;
            guq0Var2 = guq0Var;
            obj = objS2;
            j = j3;
            iu30Var3 = iu30Var2;
            z3 = z2;
            str4 = str;
            iu30Var4 = iu30Var;
            r2 = r1;
            str5 = str2;
            z4 = z;
            linkedHashMap = linkedHashMap2;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str7 = a5kVar2.h;
                try {
                    hm5.M(objS);
                    u4k u4kVar = (u4k) objS;
                    new File(str7).delete();
                    return u4kVar;
                } catch (Throwable th) {
                    th = th;
                    new File(str7).delete();
                    throw th;
                }
            }
            int i5 = a5kVar2.Z;
            long j4 = a5kVar2.Y;
            boolean z5 = a5kVar2.X;
            z4 = a5kVar2.t;
            linkedHashMap = a5kVar2.i;
            String str8 = a5kVar2.h;
            x7g1 x7g1Var4 = a5kVar2.g;
            iu30Var3 = a5kVar2.f;
            Integer num3 = a5kVar2.e;
            String str9 = a5kVar2.d;
            obj = objS;
            iu30 iu30Var5 = a5kVar2.c;
            String str10 = a5kVar2.b;
            guq0 guq0Var3 = a5kVar2.a;
            hm5.M(obj);
            r2 = i5;
            str5 = str9;
            d9nVar = d9nVar2;
            j = j4;
            str4 = str10;
            x7g1Var = x7g1Var4;
            z3 = z5;
            str3 = str8;
            num2 = num3;
            guq0Var2 = guq0Var3;
            iu30Var4 = iu30Var5;
        }
        u4k u4kVar2 = (u4k) obj;
        tlg tlgVar = guq0Var2.e;
        String str11 = str5;
        zax zaxVar2 = guq0Var2.c;
        iu30 iu30Var6 = iu30Var3;
        z5k1 z5k1Var = guq0Var2.d;
        guq0 guq0Var4 = guq0Var2;
        if (tlgVar != null) {
            Integer num4 = new Integer(0);
            z6x z6xVar = (List) linkedHashMap.get(new Integer(0));
            if (z6xVar == null) {
                z6xVar = z6x.a;
            }
            linkedHashMap.put(num4, o7h.O0(new nly0(tlgVar), (Collection) z6xVar));
        }
        if (r2 != 0) {
            if (linkedHashMap.isEmpty() && z5k1Var == null && str11 == null && !z4 && xvj1.d(zaxVar2.b) <= 720 && zaxVar2.c == null && zaxVar2.d == null && zaxVar2.e == 1) {
                x7g1Var.getClass();
            } else {
                x7g1Var.getClass();
                long length = new File(str3).length();
                if (num2 != 0) {
                    iM = num2.intValue();
                    j2 = j;
                } else {
                    j2 = j;
                    iM = rwo1.m(length, j2);
                }
                try {
                    boolean z6 = z4;
                    LinkedHashMap linkedHashMap3 = linkedHashMap;
                    List listSingletonList = Collections.singletonList(new x7g1(str3, new n5f0(0L, j2), x7g1Var.c));
                    if (z5k1Var != null) {
                        try {
                            matrix = new Matrix();
                            matrix.postScale(z5k1Var.a, z5k1Var.b);
                            matrix.postTranslate(z5k1Var.c, z5k1Var.d);
                        } catch (Throwable th2) {
                            th = th2;
                            str7 = str3;
                            new File(str7).delete();
                            throw th;
                        }
                    } else {
                        matrix = null;
                    }
                    b3k b3kVarO = rwo1.o(listSingletonList, zaxVar2, linkedHashMap3, z6, true, matrix);
                    twr twrVarQ = rwo1.q(context, zaxVar2, new Integer(iM));
                    o0g1 o0g1Var2 = new o0g1(zaxVar2.b, context, new dn3(new zfr(context, (byte) 5)), rdd1.a, (Object) null, (byte) 8);
                    usj usjVar = new usj(iu30Var4, (byte) 5);
                    Map mapSingletonMap = Collections.singletonMap(new Integer(0), Boolean.FALSE);
                    a5kVar2.a = null;
                    a5kVar2.b = null;
                    a5kVar2.c = null;
                    a5kVar2.d = null;
                    a5kVar2.e = null;
                    a5kVar2.f = null;
                    a5kVar2.g = null;
                    a5kVar2.h = str3;
                    a5kVar2.i = null;
                    a5kVar2.t = z6;
                    a5kVar2.X = z3;
                    a5kVar2.Y = j2;
                    a5kVar2.Z = r2;
                    a5kVar2.P0 = 2;
                    str6 = str3;
                    d9n d9nVar3 = d9nVar;
                    try {
                        objS = smo1.s(new z4k(str11, this, iu30Var6, guq0Var4, twrVarQ, o0g1Var2, false, z3, str4, mapSingletonMap, b3kVarO, usjVar, null), a5kVar2);
                        if (objS == d9nVar3) {
                            return d9nVar3;
                        }
                        str7 = str6;
                        u4k u4kVar3 = (u4k) objS;
                        new File(str7).delete();
                        return u4kVar3;
                    } catch (Throwable th3) {
                        th = th3;
                        str7 = str6;
                        new File(str7).delete();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str6 = str3;
                }
            }
        }
        String str12 = str3;
        if (!u890.j(str12, str4)) {
            new File(str12).renameTo(new File(str4));
        }
        iu30Var4.invoke(new Float(1.0f));
        if (!z3 || u4kVar2.b != null) {
            return u4kVar2;
        }
        fie1 fie1VarW = p9p1.w(str4, str11);
        tjj1 tjj1VarU = rwo1.u(str4);
        return new u4k(u4kVar2.a, fie1VarW, tjj1VarU != null ? new Integer(tjj1VarU.a) : u4kVar2.c, tjj1VarU != null ? new Integer(tjj1VarU.b) : u4kVar2.d, u4kVar2.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(kgg1 kgg1Var, iu30 iu30Var, onm onmVar) {
        c5k c5kVar;
        ij81 ij81Var;
        if (onmVar instanceof c5k) {
            c5kVar = (c5k) onmVar;
            int i = c5kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5kVar.f = i - Integer.MIN_VALUE;
            } else {
                c5kVar = new c5k(this, onmVar);
            }
        } else {
            c5kVar = new c5k(this, onmVar);
        }
        Object obj = c5kVar.d;
        int i2 = c5kVar.f;
        if (i2 == 0) {
            hm5.M(obj);
            ij81Var = new ij81((byte) 25);
        } else {
            if (i2 != 1 && i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ij81 ij81Var2 = c5kVar.c;
            iu30Var = c5kVar.b;
            kgg1 kgg1Var2 = c5kVar.a;
            hm5.M(obj);
            ij81Var = ij81Var2;
            kgg1Var = kgg1Var2;
        }
        while (true) {
            kgg1Var.getClass();
            if (Looper.myLooper() != kgg1Var.m) {
                eg.m("Transformer is accessed on the wrong thread.");
                return null;
            }
            myr myrVar = kgg1Var.q;
            int iB = myrVar == null ? 0 : myrVar.b(ij81Var);
            d9n d9nVar = d9n.a;
            if (iB == 0) {
                c5kVar.a = kgg1Var;
                c5kVar.b = iu30Var;
                c5kVar.c = ij81Var;
                c5kVar.f = 1;
                if (hap1.i(50L, c5kVar) == d9nVar) {
                    return d9nVar;
                }
            } else {
                iu30Var.invoke(new Float(ij81Var.b / 100.0f));
                if (ij81Var.b >= 100) {
                    return rih1.a;
                }
                c5kVar.a = kgg1Var;
                c5kVar.b = iu30Var;
                c5kVar.c = ij81Var;
                c5kVar.f = 2;
                if (hap1.i(50L, c5kVar) == d9nVar) {
                    return d9nVar;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x021d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0224  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bb, code lost:
    
        if (r1 == r13) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(p.y7g1 r33, p.guq0 r34, p.iu30 r35, p.a8g1 r36, java.lang.String r37, boolean r38, java.lang.Integer r39, p.iu30 r40, boolean r41, p.onm r42) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f5k.f(p.y7g1, p.guq0, p.iu30, p.a8g1, java.lang.String, boolean, java.lang.Integer, p.iu30, boolean, p.onm):java.lang.Object");
    }
}
