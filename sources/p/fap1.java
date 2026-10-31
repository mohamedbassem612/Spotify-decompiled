package p;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import com.spotify.hovercraftasr.v1.a;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fap1 {
    public static b180 a;
    public static b180 b;

    public static final void a(j2i j2iVar, j2i j2iVar2, long j, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-74962517);
        int i2 = i | (x340Var.f(j) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            g9p1.a(j2iVar, anm1.N("compact_scanning_layout", qim0Var3), anm1.N("compact_scanning_camera", qim0Var3), j2iVar2, j, x340Var, 24630 | ((i2 << 9) & 458752));
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6((Object) j2iVar, (Object) j2iVar2, j, (Object) qim0Var2, i, (byte) 4);
        }
    }

    public static final void b(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1500831559);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(-663327885);
            bnx bnxVar = bnx.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131964166));
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(bnxVar, jslVar, u291.r(qim0Var, 12.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, bnx.d, 48);
            x340Var.r(false);
        } else {
            x340Var.i0(-663029975);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3z0(z, qim0Var, i, (byte) 4);
        }
    }

    public static final rhc c(a aVar) {
        byte[] byteArray = aVar.build().toByteArray();
        int length = byteArray.length;
        zod.u(byteArray.length, 0L, length);
        return new rhc(f46.Z(0, byteArray, length));
    }

    public static final void d(tvj1 tvj1Var, uoa uoaVar) {
        if (!(tvj1Var instanceof svj1)) {
            if (!(tvj1Var instanceof rvj1)) {
                eg.o();
                return;
            }
            y1k1 y1k1Var = ((rvj1) tvj1Var).a;
            uoaVar.k = y1k1Var;
            p3u0 p3u0Var = uoaVar.f;
            if (p3u0Var != null) {
                p3u0Var.N0(y1k1Var);
            }
            uoaVar.l = y1k1Var;
            p3u0 p3u0Var2 = uoaVar.f;
            if (p3u0Var2 != null) {
                p3u0Var2.O0(y1k1Var);
                return;
            }
            return;
        }
        svj1 svj1Var = (svj1) tvj1Var;
        int i = svj1Var.c;
        int i2 = svj1Var.b;
        if (i < i2) {
            i = i2;
        }
        y1k1 y1k1Var2 = new y1k1(i, i);
        uoaVar.k = y1k1Var2;
        p3u0 p3u0Var3 = uoaVar.f;
        if (p3u0Var3 != null) {
            p3u0Var3.N0(y1k1Var2);
        }
        y1k1 y1k1Var3 = new y1k1(0, 0);
        uoaVar.l = y1k1Var3;
        p3u0 p3u0Var4 = uoaVar.f;
        if (p3u0Var4 != null) {
            p3u0Var4.O0(y1k1Var3);
        }
    }

    public static final LinkedHashMap e(xoe0 xoe0Var) {
        xkg0 xkg0VarB;
        Map mapSingletonMap = Collections.singletonMap(k50.c, xoe0Var.c);
        cpe0 cpe0Var = xoe0Var.b;
        if (cpe0Var instanceof kbh) {
            kbh kbhVar = (kbh) cpe0Var;
            xkg0 xkg0Var = new xkg0();
            xkg0Var.put(n50.c, kbhVar.e.b);
            woe0 woe0Var = kbhVar.f;
            if (woe0Var != null) {
            }
            woe0 woe0Var2 = kbhVar.g;
            if (woe0Var2 != null) {
            }
            woe0 woe0Var3 = kbhVar.h;
            if (woe0Var3 != null) {
                xkg0Var.put(m50.c, woe0Var3.b);
            }
            xkg0VarB = xkg0Var.b();
        } else {
            if (!(cpe0Var instanceof tj51)) {
                eg.o();
                return null;
            }
            xkg0 xkg0Var2 = new xkg0();
            int i = 0;
            for (Object obj : ((tj51) cpe0Var).d) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                wqe0 wqe0Var = (wqe0) obj;
                int i3 = 0;
                for (Object obj2 : wqe0Var.c) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    xkg0Var2.put(new t50(i, i3), ((woe0) obj2).b);
                    i3 = i4;
                }
                pap1 pap1Var = wqe0Var.d;
                xqe0 xqe0Var = pap1Var instanceof xqe0 ? (xqe0) pap1Var : null;
                if (xqe0Var != null) {
                    xkg0Var2.put(new u50(i), xqe0Var.d.b);
                }
                i = i2;
            }
            xkg0VarB = xkg0Var2.b();
        }
        return sqg0.O(mapSingletonMap, xkg0VarB);
    }

    public static final ksm0 f(String str, String str2, String str3, boolean z) {
        Set set = s4b1.f;
        boolean zG = uic.g(str, blc0.ed);
        gec1 gec1Var = new gec1((z || zG) ? "41c4d9c65eca47ec9b7faeccbc98fe5b" : "f9dcb11cef0d4b0e979134b802af06ee");
        String str4 = zG ? str3 : str;
        if (!zG) {
            str = null;
        }
        return new ksm0(gec1Var, str3, str2, "audiobrowse-client-native", str4, str, 448);
    }

    public static final void g(String str) {
        File fileI = i();
        if (fileI == null || str == null) {
            return;
        }
        new File(fileI, str).delete();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ud30 h(String str) {
        switch (str.hashCode()) {
            case -1211426044:
                if (str.equals("hours3")) {
                    return ud30.c;
                }
                return null;
            case -1211426041:
                if (str.equals("hours6")) {
                    return ud30.d;
                }
                return null;
            case -525639283:
                if (str.equals("minutes1DebugOnly")) {
                    return ud30.b;
                }
                return null;
            case 1100498288:
                if (str.equals("hours12")) {
                    return ud30.e;
                }
                return null;
            case 1100498321:
                if (str.equals("hours24")) {
                    return ud30.f;
                }
                return null;
            default:
                return null;
        }
    }

    public static final File i() {
        File file = new File(wf10.a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final boolean j(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (nhc1.Y(stackTraceElement.getClassName(), "com.facebook", false) || nhc1.Y(stackTraceElement.getClassName(), "com.meta", false)) {
                    if (!nhc1.Y(stackTraceElement.getClassName(), "com.facebook.appevents.codeless", false) && !nhc1.Y(stackTraceElement.getClassName(), "com.facebook.appevents.suggestedevents", false)) {
                        return true;
                    }
                    if (!nhc1.Y(stackTraceElement.getMethodName(), "onClick", false) && !nhc1.Y(stackTraceElement.getMethodName(), "onItemClick", false) && !nhc1.Y(stackTraceElement.getMethodName(), "onTouch", false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final xab1 k(c9n c9nVar, vs0 vs0Var) {
        o8n o8nVarJ = c9nVar.J();
        int i = xpi1.b;
        q8n q8nVarA = o8nVarJ.A(q8n.b);
        return (q8nVarA == null || q8nVarA.equals(igu.b)) ? fn31.S(c9nVar, igu.b, 4, vs0Var) : fn31.S(smo1.e(new a3t(c9nVar.J())), new b3t(q8nVarA), 4, vs0Var);
    }

    public static tdl0 l() {
        return new tdl0((byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x028a A[PHI: r14 r15
      0x028a: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:102:0x0241, B:115:0x0288] A[DONT_GENERATE, DONT_INLINE]
      0x028a: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:102:0x0241, B:115:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x028e A[LOOP:3: B:101:0x0233->B:118:0x028e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0295  */
    /* JADX WARN: Code duplicated, block: B:179:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:188:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:193:0x03dc A[LOOP:5: B:192:0x03da->B:193:0x03dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x041e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0434  */
    /* JADX WARN: Code duplicated, block: B:231:0x0296 A[EDGE_INSN: B:231:0x0296->B:120:0x0296 BREAK  A[LOOP:3: B:101:0x0233->B:118:0x028e], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:193:0x03dc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r42v0, types: [android.view.ViewStructure] */
    public static final void m(ViewStructure viewStructure, hmb0 hmb0Var, AutofillId autofillId, String str, q511 q511Var) {
        ?? r38;
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        pb4 pb4Var;
        af5 af5Var;
        ej4 ej4Var;
        rze1 rze1Var;
        pm31 pm31Var;
        boolean z;
        fam famVar;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        boolean z3;
        boolean z4;
        boolean z5;
        String strV;
        int size;
        String str2;
        String[] strArr;
        String[] strArr2;
        int i;
        int i2;
        int i3;
        boolean z6;
        pb4 pb4Var2;
        rze1 rze1Var2;
        af5 af5Var2;
        ej4 ej4Var2;
        pm31 pm31Var2;
        boolean z7;
        d261 d261Var = z161.a;
        d261 d261Var2 = m161.a;
        o161 o161VarX = hmb0Var.x();
        boolean z8 = true;
        if (o161VarX != null) {
            nen0 nen0Var = o161VarX.a;
            j = 128;
            Object[] objArr = nen0Var.b;
            Object[] objArr2 = nen0Var.c;
            long[] jArr = nen0Var.a;
            j2 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i4 = 0;
                pb4Var2 = null;
                z = false;
                rze1Var2 = null;
                af5Var2 = null;
                ej4Var2 = null;
                famVar = null;
                bool = null;
                pm31Var2 = null;
                z2 = false;
                num = null;
                obj = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i4];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                int i7 = (i4 << 3) + i6;
                                Object obj2 = objArr[i7];
                                Object obj3 = objArr2[i7];
                                d261 d261Var3 = (d261) obj2;
                                if (u890.j(d261Var3, z161.s)) {
                                    pb4Var2 = (pb4) obj3;
                                } else if (u890.j(d261Var3, z161.a)) {
                                    String str3 = (String) o7h.s0((List) obj3);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (u890.j(d261Var3, z161.r)) {
                                    famVar = (fam) obj3;
                                } else if (u890.j(d261Var3, z161.t)) {
                                    ej4Var2 = (ej4) obj3;
                                } else if (u890.j(d261Var3, z161.G)) {
                                    af5Var2 = (af5) obj3;
                                } else if (u890.j(d261Var3, z161.l)) {
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (u890.j(d261Var3, z161.R)) {
                                    num = (Integer) obj3;
                                } else if (u890.j(d261Var3, z161.N)) {
                                    z2 = z8;
                                } else if (u890.j(d261Var3, z161.o)) {
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (u890.j(d261Var3, z161.z)) {
                                    pm31Var2 = (pm31) obj3;
                                } else if (u890.j(d261Var3, z161.K)) {
                                    bool = (Boolean) obj3;
                                } else if (u890.j(d261Var3, z161.L)) {
                                    rze1Var2 = (rze1) obj3;
                                } else if (u890.j(d261Var3, m161.b)) {
                                    viewStructure.setClickable(z8);
                                } else if (u890.j(d261Var3, m161.c)) {
                                    viewStructure.setLongClickable(z8);
                                } else if (u890.j(d261Var3, m161.w)) {
                                    viewStructure.setFocusable(z8);
                                } else if (u890.j(d261Var3, m161.k)) {
                                    z = z8;
                                }
                                z7 = z8;
                                if (Build.VERSION.SDK_INT >= 34 && u890.j(d261Var3, yoi1.g)) {
                                    obj = obj3;
                                }
                            } else {
                                z7 = z8;
                            }
                            j4 >>= 8;
                            i6++;
                            z8 = z7;
                        }
                        z6 = z8;
                        z6 = z6;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        z6 = z8 ? 1 : 0;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    z8 = z6 ? 1 : 0;
                }
            } else {
                z6 = true;
                c = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                pb4Var2 = null;
                z = false;
                rze1Var2 = null;
                af5Var2 = null;
                ej4Var2 = null;
                famVar = null;
                bool = null;
                pm31Var2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            pb4Var = pb4Var2;
            rze1Var = rze1Var2;
            af5Var = af5Var2;
            ej4Var = ej4Var2;
            pm31Var = pm31Var2;
            r38 = z6;
        } else {
            r38 = 1;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            pb4Var = null;
            af5Var = null;
            ej4Var = null;
            rze1Var = null;
            pm31Var = null;
            z = false;
            famVar = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        }
        o161 o161VarX2 = hmb0Var.x();
        if (o161VarX2 != null && o161VarX2.c && !o161VarX2.d) {
            o161VarX2 = o161VarX2.c();
            wdn0 wdn0Var = new wdn0(hmb0Var.o().a.c);
            wdn0Var.c(hmb0Var.o());
            while (wdn0Var.j()) {
                hmb0 hmb0Var2 = (hmb0) wdn0Var.l(wdn0Var.b - 1);
                o161 o161VarX3 = hmb0Var2.x();
                if (o161VarX3 != null && !o161VarX3.c) {
                    o161VarX2.e(o161VarX3);
                    if (!o161VarX3.d) {
                        wdn0Var.c(hmb0Var2.o());
                    }
                }
            }
        }
        if (o161VarX2 != null) {
            nen0 nen0Var2 = o161VarX2.a;
            Object[] objArr3 = nen0Var2.b;
            Object[] objArr4 = nen0Var2.c;
            long[] jArr2 = nen0Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i8 = 8;
                list = null;
                int i9 = 0;
                while (true) {
                    long j5 = jArr2[i9];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c) & j5 & j3) == j3) {
                        i = i9;
                        if (i != length2) {
                            break;
                            break;
                        } else {
                            i9 = i + 1;
                            objArr3 = objArr5;
                            jArr2 = jArr3;
                        }
                    } else {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j5 & j2) < j) {
                                int i12 = (i9 << 3) + i11;
                                Object obj4 = objArr5[i12];
                                Object obj5 = objArr4[i12];
                                i3 = i8;
                                d261 d261Var4 = (d261) obj4;
                                i2 = i11;
                                if (u890.j(d261Var4, z161.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (u890.j(d261Var4, z161.C)) {
                                    list = (List) obj5;
                                }
                            } else {
                                i2 = i11;
                                i3 = i8;
                            }
                            j5 >>= i3;
                            i11 = i2 + 1;
                            i8 = i3;
                        }
                        if (i10 != i8) {
                            break;
                        }
                        i = i9;
                        if (i != length2) {
                            break;
                        }
                        i9 = i + 1;
                        objArr3 = objArr5;
                        jArr2 = jArr3;
                    }
                }
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(hmb0Var.b);
        if (hmb0Var.v() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        no80.I((ViewStructure) viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (pb4Var != null) {
            numValueOf = Integer.valueOf(pb4Var.a);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = rze1Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            no80.J((ViewStructure) viewStructure, numValueOf.intValue());
        }
        if (af5Var != null) {
            no80.K((ViewStructure) viewStructure, no80.t(af5Var.b));
        }
        if (ej4Var != null) {
            no80.K((ViewStructure) viewStructure, ej4Var.a);
        }
        if (famVar != null && (strArr2 = (String[]) ((qb4) famVar).a().toArray(new String[0])) != null) {
            no80.H((ViewStructure) viewStructure, strArr2);
        }
        hmb0 hmb0Var3 = (hmb0) q511Var.a.b(hmb0Var.b);
        if (hmb0Var3 != null && hmb0Var3.g != -4) {
            que0 que0Var = q511Var.c;
            int iD = q511Var.d(hmb0Var3);
            long[] jArr4 = (long[]) que0Var.c;
            long j6 = jArr4[iD];
            long j7 = jArr4[iD + 1];
            int i13 = (int) (j6 >> 32);
            int i14 = (int) j6;
            viewStructure.setDimens(i13, i14, 0, 0, ((int) (j7 >> 32)) - i13, ((int) j7) - i14);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (rze1Var != null) {
            viewStructure.setCheckable(r38);
            viewStructure.setChecked(rze1Var == rze1.a);
        } else if (bool != null && (pm31Var == null || pm31Var.a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        fam.a.getClass();
        String str4 = (String) f46.j0((String[]) s9m.c.a().toArray(new String[0]));
        if (famVar != null && (strArr = (String[]) ((qb4) famVar).a().toArray(new String[0])) != null) {
            boolean zM = f46.M(strArr, str4);
            z3 = true;
            boolean z9 = zM;
            if (!z2 || z9) {
                z4 = z3;
            } else {
                z4 = false;
            }
            if (!z4 || zBooleanValue) {
                z5 = z3;
            } else {
                z5 = false;
            }
            no80.M((ViewStructure) viewStructure, z5);
            viewStructure.setVisibility(((ndo0) hmb0Var.e1.e).v1() ? 4 : 0);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (int i15 = 0; i15 < size; i15++) {
                    str2 = ((Object) str2) + ((af5) list.get(i15)).b + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (hmb0Var.o().isEmpty() && pm31Var != null && (strV = flo1.v(pm31Var.a)) != null) {
                viewStructure.setClassName(strV);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    ph5.S((ViewStructure) viewStructure, num.intValue());
                }
                if (z4) {
                    no80.P((ViewStructure) viewStructure);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            bhn0.d();
            return;
        }
        z3 = true;
        if (z2) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        if (z4) {
            z5 = z3;
        } else {
            z5 = z3;
        }
        no80.M((ViewStructure) viewStructure, z5);
        viewStructure.setVisibility(((ndo0) hmb0Var.e1.e).v1() ? 4 : 0);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i15 < size) {
                str2 = ((Object) str2) + ((af5) list.get(i15)).b + "\n";
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (hmb0Var.o().isEmpty()) {
            viewStructure.setClassName(strV);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                ph5.S((ViewStructure) viewStructure, num.intValue());
            }
            if (z4) {
                no80.P((ViewStructure) viewStructure);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final JSONObject n(String str) {
        File fileI = i();
        if (fileI != null) {
            try {
                return new JSONObject(fpi1.H(new FileInputStream(new File(fileI, str))));
            } catch (Exception unused) {
                g(str);
            }
        }
        return null;
    }

    public static final void o(String str, JSONArray jSONArray, id50 id50Var) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectO = fpi1.o();
            if (jSONObjectO != null) {
                Iterator<String> itKeys = jSONObjectO.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectO.get(next));
                }
            }
            String str2 = md50.j;
            cwl1.R((xd) null, String.format("%s/instruments", Arrays.copyOf(new Object[]{wf10.b()}, 1)), jSONObject, id50Var).d();
        } catch (JSONException unused) {
        }
    }

    public static final void p(View view, s1q0 s1q0Var) {
        view.setTag(2131431632, s1q0Var);
    }

    public static final Next q(alp0 alp0Var, tkp0 tkp0Var) {
        l0l l0lVar;
        l0l l0lVar2;
        gbl gblVar;
        l0l l0lVar3;
        l0l l0lVar4;
        String str;
        d2l d2lVar = alp0Var.b;
        String name = null;
        if (tkp0Var instanceof lkp0) {
            alp0 alp0VarA = alp0.a(alp0Var, (List) null, ((lkp0) tkp0Var).a, (l0l) null, (gbl) null, (gbl) null, false, (String) null, (l0l) null, false, 1021);
            d2l d2lVar2 = alp0VarA.b;
            if (d2lVar2 == null || (l0lVar4 = d2lVar2.a) == null) {
                return Next.h(alp0VarA);
            }
            l0l l0lVar5 = d2lVar != null ? d2lVar.a : null;
            if (!u890.j(l0lVar4.j(), l0lVar5 != null ? l0lVar5.j() : null)) {
                if (!u890.j(l0lVar4.getName(), l0lVar5 != null ? l0lVar5.getName() : null) && ((str = alp0VarA.g) == null || (!ihc1.h0(str, l0lVar4.j(), false) && !ihc1.h0(str, l0lVar4.getName(), false)))) {
                    alp0VarA = alp0.a(alp0VarA, (List) null, (d2l) null, (l0l) null, (gbl) null, (gbl) null, false, (String) null, (l0l) null, false, 959);
                }
            }
            return Next.h(alp0VarA);
        }
        if (tkp0Var instanceof mkp0) {
            return Next.h(alp0.a(alp0Var, (List) null, (d2l) null, d2lVar != null ? d2lVar.a : null, (gbl) null, alp0Var.d, false, (String) null, (l0l) null, false, 971));
        }
        if (tkp0Var instanceof nkp0) {
            alp0 alp0VarA2 = alp0.a(alp0Var, (List) null, (d2l) null, (l0l) null, (gbl) null, (gbl) null, true, (String) null, (l0l) null, false, 991);
            d2l d2lVar3 = alp0VarA2.b;
            if (d2lVar3 != null && (l0lVar2 = d2lVar3.a) != null) {
                gbl gblVar2 = alp0VarA2.e;
                if (alp0VarA2.f && gblVar2 == (gblVar = gbl.X) && !l0lVar2.l() && (l0lVar3 = alp0VarA2.c) != null && u890.j(l0lVar2.d(), l0lVar3.d()) && ((alp0VarA2.d.b && gblVar2 == gblVar) || (!l0lVar2.n() && l0lVar3.n()))) {
                    return Next.i(alp0VarA2, Effects.a(new ikp0[]{new ikp0(l0lVar2)}));
                }
            }
            return Next.h(alp0VarA2);
        }
        if (tkp0Var instanceof okp0) {
            return Next.h(alp0.a(alp0Var, ((okp0) tkp0Var).a, (d2l) null, (l0l) null, (gbl) null, (gbl) null, false, (String) null, (l0l) null, false, 1022));
        }
        if (tkp0Var instanceof pkp0) {
            alp0 alp0VarA3 = alp0.a(alp0Var, (List) null, (d2l) null, (l0l) null, ((pkp0) tkp0Var).a, (gbl) null, false, (String) null, (l0l) null, false, 1015);
            if (smo1.G(alp0VarA3)) {
                return Next.i(alp0.a(alp0VarA3, (List) null, (d2l) null, (l0l) null, (gbl) null, (gbl) null, false, (String) null, d2lVar != null ? d2lVar.a : null, false, 895), Effects.a(new gkp0[]{new gkp0()}));
            }
            return Next.h(alp0VarA3);
        }
        if (tkp0Var instanceof qkp0) {
            return Next.h(alp0.a(alp0Var, (List) null, (d2l) null, (l0l) null, (gbl) null, (gbl) null, false, ((qkp0) tkp0Var).a, (l0l) null, false, 959));
        }
        if (!(tkp0Var instanceof skp0)) {
            if (tkp0Var instanceof rkp0) {
                return Next.h(alp0.a(alp0Var, (List) null, (d2l) null, (l0l) null, (gbl) null, (gbl) null, false, (String) null, (l0l) null, ((rkp0) tkp0Var).a, 511));
            }
            eg.o();
            return null;
        }
        boolean zG = smo1.G(alp0Var);
        l0l l0lVar6 = alp0Var.h;
        if (zG && l0lVar6 != null && !l0lVar6.l()) {
            if (d2lVar != null && (l0lVar = d2lVar.a) != null) {
                name = l0lVar.getName();
            }
            if (u890.j(name, l0lVar6.getName())) {
                return Next.i(alp0.a(alp0Var, (List) null, (d2l) null, (l0l) null, (gbl) null, (gbl) null, false, (String) null, (l0l) null, false, 895), Effects.a(new hkp0[]{new hkp0(l0lVar6)}));
            }
        }
        return Next.h(alp0.a(alp0Var, (List) null, (d2l) null, (l0l) null, (gbl) null, (gbl) null, false, (String) null, (l0l) null, false, 895));
    }

    public static final void r(String str, String str2) {
        File fileI = i();
        if (fileI == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileI, str));
            fileOutputStream.write(str2.getBytes(nne.a));
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
