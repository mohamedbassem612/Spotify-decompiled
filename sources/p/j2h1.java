package p;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import com.google.android.gms.wearable.Asset;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class j2h1 {
    public static final uda a = new uda();
    public static final df41 b = new df41(new ia4((byte) 17), new llj((byte) 13));
    public static byte c = 3;

    public static r561 A(vu30 vu30Var) {
        r561 r561Var = new r561();
        r561Var.d = aym.p(r561Var, r561Var, vu30Var);
        return r561Var;
    }

    public static Handler B() {
        return Build.VERSION.SDK_INT >= 28 ? ph5.f(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }

    public static final int C(int i, String str) {
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }

    public static final CompletableCreate D(o8n o8nVar, vu30 vu30Var) {
        if (o8nVar.A(fkj0.W0) == null) {
            return new CompletableCreate(new x141(o8nVar, vu30Var));
        }
        bhn0.s(o8nVar, "Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ");
        return null;
    }

    public static void E(int i, vda vdaVar, cjl cjlVar, boolean z) {
        float f = cjlVar.f0;
        lhl lhlVar = cjlVar.J;
        int iD = lhlVar.f.d();
        lhl lhlVar2 = cjlVar.L;
        int iD2 = lhlVar2.f.d();
        int iE = lhlVar.e() + iD;
        int iE2 = iD2 - lhlVar2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iS = cjlVar.s();
        int i2 = (iD2 - iD) - iS;
        if (iD > iD2) {
            i2 = (iD - iD2) - iS;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iD;
        int i4 = i3 + iS;
        if (iD > iD2) {
            i4 = i3 - iS;
        }
        cjlVar.M(i3, i4);
        w(i + 1, vdaVar, cjlVar, z);
    }

    public static void F(int i, cjl cjlVar, vda vdaVar, cjl cjlVar2, boolean z) {
        float f = cjlVar2.f0;
        lhl lhlVar = cjlVar2.J;
        int iE = lhlVar.e() + lhlVar.f.d();
        lhl lhlVar2 = cjlVar2.L;
        int iD = lhlVar2.f.d() - lhlVar2.e();
        if (iD >= iE) {
            int iS = cjlVar2.s();
            if (cjlVar2.i0 != 8) {
                int i2 = cjlVar2.s;
                if (i2 == 2) {
                    iS = (int) (cjlVar2.f0 * 0.5f * (cjlVar instanceof djl ? cjlVar.s() : cjlVar.V.s()));
                } else if (i2 == 0) {
                    iS = iD - iE;
                }
                iS = Math.max(cjlVar2.v, iS);
                int i3 = cjlVar2.w;
                if (i3 > 0) {
                    iS = Math.min(i3, iS);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iS)) + 0.5f));
            cjlVar2.M(i4, iS + i4);
            w(i + 1, vdaVar, cjlVar2, z);
        }
    }

    public static void G(int i, vda vdaVar, cjl cjlVar) {
        float f = cjlVar.g0;
        lhl lhlVar = cjlVar.K;
        int iD = lhlVar.f.d();
        lhl lhlVar2 = cjlVar.M;
        int iD2 = lhlVar2.f.d();
        int iE = lhlVar.e() + iD;
        int iE2 = iD2 - lhlVar2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iM = cjlVar.m();
        int i2 = (iD2 - iD) - iM;
        if (iD > iD2) {
            i2 = (iD - iD2) - iM;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iD + i3;
        int i5 = i4 + iM;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iM;
        }
        cjlVar.N(i4, i5);
        L(i + 1, vdaVar, cjlVar);
    }

    public static void H(int i, cjl cjlVar, vda vdaVar, cjl cjlVar2) {
        float f = cjlVar2.g0;
        lhl lhlVar = cjlVar2.K;
        int iE = lhlVar.e() + lhlVar.f.d();
        lhl lhlVar2 = cjlVar2.M;
        int iD = lhlVar2.f.d() - lhlVar2.e();
        if (iD >= iE) {
            int iM = cjlVar2.m();
            if (cjlVar2.i0 != 8) {
                int i2 = cjlVar2.t;
                if (i2 == 2) {
                    iM = (int) (f * 0.5f * (cjlVar instanceof djl ? cjlVar.m() : cjlVar.V.m()));
                } else if (i2 == 0) {
                    iM = iD - iE;
                }
                iM = Math.max(cjlVar2.y, iM);
                int i3 = cjlVar2.z;
                if (i3 > 0) {
                    iM = Math.min(i3, iM);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iM)) + 0.5f));
            cjlVar2.N(i4, iM + i4);
            L(i + 1, vdaVar, cjlVar2);
        }
    }

    public static String I(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static String J(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static final String K(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        n561 n561VarC0 = z561.c0(i2h1.a, type);
        StringBuilder sb = new StringBuilder(((Class) z561.e0(n561VarC0)).getName());
        Iterator it = n561VarC0.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                p7h.S();
                throw null;
            }
        }
        sb.append(nhc1.V(i, "[]"));
        return sb.toString();
    }

    public static void L(int i, vda vdaVar, cjl cjlVar) {
        boolean z;
        lhl lhlVar;
        lhl lhlVar2;
        lhl lhlVar3;
        lhl lhlVar4;
        if (cjlVar.o) {
            return;
        }
        if (!(cjlVar instanceof djl) && cjlVar.B() && k(cjlVar)) {
            djl.a0(cjlVar, vdaVar, new uda());
        }
        lhl lhlVarK = cjlVar.k(3);
        lhl lhlVarK2 = cjlVar.k(5);
        int iD = lhlVarK.d();
        int iD2 = lhlVarK2.d();
        HashSet<lhl> hashSet = lhlVarK.a;
        bjl bjlVar = bjl.c;
        if (hashSet != null && lhlVarK.c) {
            for (lhl lhlVar5 : hashSet) {
                cjl cjlVar2 = lhlVar5.d;
                int i2 = i + 1;
                boolean zK = k(cjlVar2);
                lhl lhlVar6 = cjlVar2.K;
                lhl lhlVar7 = cjlVar2.M;
                if (cjlVar2.B() && zK) {
                    djl.a0(cjlVar2, vdaVar, new uda());
                }
                boolean z2 = (lhlVar5 == lhlVar6 && (lhlVar4 = lhlVar7.f) != null && lhlVar4.c) || (lhlVar5 == lhlVar7 && (lhlVar3 = lhlVar6.f) != null && lhlVar3.c);
                bjl bjlVar2 = cjlVar2.U[1];
                if (bjlVar2 != bjlVar || zK) {
                    if (!cjlVar2.B()) {
                        if (lhlVar5 == lhlVar6 && lhlVar7.f == null) {
                            int iE = lhlVar6.e() + iD;
                            cjlVar2.N(iE, cjlVar2.m() + iE);
                            L(i2, vdaVar, cjlVar2);
                        } else if (lhlVar5 == lhlVar7 && lhlVar6.f == null) {
                            int iE2 = iD - lhlVar7.e();
                            cjlVar2.N(iE2 - cjlVar2.m(), iE2);
                            L(i2, vdaVar, cjlVar2);
                        } else if (z2 && !cjlVar2.A()) {
                            G(i2, vdaVar, cjlVar2);
                        }
                    }
                } else if (bjlVar2 == bjlVar && cjlVar2.z >= 0 && cjlVar2.y >= 0 && (cjlVar2.i0 == 8 || (cjlVar2.t == 0 && cjlVar2.Y == 0.0f))) {
                    if (!cjlVar2.A() && !cjlVar2.G && z2 && !cjlVar2.A()) {
                        H(i2, cjlVar, vdaVar, cjlVar2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (cjlVar instanceof tq50) {
            return;
        }
        HashSet<lhl> hashSet2 = lhlVarK2.a;
        if (hashSet2 != null && lhlVarK2.c) {
            for (lhl lhlVar8 : hashSet2) {
                cjl cjlVar3 = lhlVar8.d;
                int i3 = i + 1;
                boolean zK2 = k(cjlVar3);
                lhl lhlVar9 = cjlVar3.K;
                lhl lhlVar10 = cjlVar3.M;
                if (cjlVar3.B() && zK2) {
                    djl.a0(cjlVar3, vdaVar, new uda());
                }
                boolean z4 = (lhlVar8 == lhlVar9 && (lhlVar2 = lhlVar10.f) != null && lhlVar2.c) || (lhlVar8 == lhlVar10 && (lhlVar = lhlVar9.f) != null && lhlVar.c);
                bjl bjlVar3 = cjlVar3.U[1];
                if (bjlVar3 != bjlVar || zK2) {
                    if (!cjlVar3.B()) {
                        if (lhlVar8 == lhlVar9 && lhlVar10.f == null) {
                            int iE3 = lhlVar9.e() + iD2;
                            cjlVar3.N(iE3, cjlVar3.m() + iE3);
                            L(i3, vdaVar, cjlVar3);
                        } else if (lhlVar8 == lhlVar10 && lhlVar9.f == null) {
                            int iE4 = iD2 - lhlVar10.e();
                            cjlVar3.N(iE4 - cjlVar3.m(), iE4);
                            L(i3, vdaVar, cjlVar3);
                        } else if (z4 && !cjlVar3.A()) {
                            G(i3, vdaVar, cjlVar3);
                        }
                    }
                } else if (bjlVar3 == bjlVar && cjlVar3.z >= 0 && cjlVar3.y >= 0 && (cjlVar3.i0 == 8 || (cjlVar3.t == 0 && cjlVar3.Y == 0.0f))) {
                    if (!cjlVar3.A() && !cjlVar3.G && z4 && !cjlVar3.A()) {
                        H(i3, cjlVar, vdaVar, cjlVar3);
                    }
                }
            }
        }
        lhl lhlVarK3 = cjlVar.k(6);
        if (lhlVarK3.a != null && lhlVarK3.c) {
            int iD3 = lhlVarK3.d();
            for (lhl lhlVar11 : lhlVarK3.a) {
                cjl cjlVar4 = lhlVar11.d;
                int i4 = i + 1;
                boolean zK3 = k(cjlVar4);
                lhl lhlVar12 = cjlVar4.N;
                if (cjlVar4.B() && zK3) {
                    djl.a0(cjlVar4, vdaVar, new uda());
                }
                if (cjlVar4.U[z3 ? 1 : 0] != bjlVar || zK3) {
                    if (!cjlVar4.B()) {
                        if (lhlVar11 == lhlVar12) {
                            int iE5 = lhlVar11.e() + iD3;
                            if (cjlVar4.F) {
                                int i5 = iE5 - cjlVar4.c0;
                                int i6 = cjlVar4.X + i5;
                                cjlVar4.b0 = i5;
                                cjlVar4.K.l(i5);
                                cjlVar4.M.l(i6);
                                lhlVar12.l(iE5);
                                z = z3 ? 1 : 0;
                                cjlVar4.m = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            L(i4, vdaVar, cjlVar4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        cjlVar.o = z3;
    }

    public static void M(String str) {
        z(5, J(str));
    }

    public static void N(String str) {
        z(5, J(str));
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e7 A[SYNTHETIC] */
    public static vcn1 O(Object obj, ArrayList arrayList) {
        gfp1 gfp1VarO = vcn1.o();
        gfp1VarO.g(1);
        if (obj == null) {
            gfp1VarO.g(14);
            return gfp1VarO.e();
        }
        bjp1 bjp1VarH = pbn1.H();
        if (obj instanceof String) {
            gfp1VarO.g(2);
            bjp1VarH.h((String) obj);
        } else if (obj instanceof Integer) {
            gfp1VarO.g(6);
            bjp1VarH.l(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            gfp1VarO.g(5);
            bjp1VarH.k(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            gfp1VarO.g(3);
            bjp1VarH.i(((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            gfp1VarO.g(4);
            bjp1VarH.j(((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            gfp1VarO.g(8);
            bjp1VarH.q(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            gfp1VarO.g(7);
            bjp1VarH.n(((Byte) obj).byteValue());
        } else {
            int i = 0;
            if (obj instanceof byte[]) {
                gfp1VarO.g(1);
                byte[] bArr = (byte[]) obj;
                bjp1VarH.g(gun1.l(0, bArr, bArr.length));
            } else if (obj instanceof String[]) {
                gfp1VarO.g(11);
                bjp1VarH.t(Arrays.asList((String[]) obj));
            } else if (obj instanceof long[]) {
                gfp1VarO.g(12);
                long[] jArr = (long[]) obj;
                ArrayList arrayList2 = new ArrayList(jArr.length);
                while (i < jArr.length) {
                    arrayList2.add(Long.valueOf(jArr[i]));
                    i++;
                }
                bjp1VarH.u(arrayList2);
            } else if (obj instanceof float[]) {
                gfp1VarO.g(15);
                float[] fArr = (float[]) obj;
                ArrayList arrayList3 = new ArrayList(fArr.length);
                while (i < fArr.length) {
                    arrayList3.add(Float.valueOf(fArr[i]));
                    i++;
                }
                bjp1VarH.v(arrayList3);
            } else if (obj instanceof Asset) {
                gfp1VarO.g(13);
                arrayList.add((Asset) obj);
                bjp1VarH.w(arrayList.size() - 1);
            } else if (obj instanceof vzq) {
                gfp1VarO.g(9);
                HashMap map = ((vzq) obj).a;
                TreeSet<String> treeSet = new TreeSet(map.keySet());
                kdn1[] kdn1VarArr = new kdn1[treeSet.size()];
                for (String str : treeSet) {
                    xdp1 xdp1VarP = kdn1.p();
                    xdp1VarP.d();
                    ((dyn1) xdp1VarP).b.q(str);
                    vcn1 vcn1VarO = O(map.get(str), arrayList);
                    xdp1VarP.d();
                    ((dyn1) xdp1VarP).b.r(vcn1VarO);
                    kdn1VarArr[i] = (kdn1) xdp1VarP.e();
                    i++;
                }
                bjp1VarH.r(Arrays.asList(kdn1VarArr));
            } else {
                if (!(obj instanceof ArrayList)) {
                    jah.g("newFieldValueFromValue: unexpected value ".concat(obj.getClass().getSimpleName()));
                    return null;
                }
                gfp1VarO.g(10);
                ArrayList arrayList4 = (ArrayList) obj;
                int size = arrayList4.size();
                int iR = 14;
                Object obj2 = null;
                while (i < size) {
                    Object obj3 = arrayList4.get(i);
                    vcn1 vcn1VarO2 = O(obj3, arrayList);
                    if (vcn1VarO2.r() != 14 && vcn1VarO2.r() != 2 && vcn1VarO2.r() != 6 && vcn1VarO2.r() != 9) {
                        hhg1.n("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ".concat(String.valueOf(obj3.getClass())));
                        return null;
                    }
                    if (iR != 14) {
                        if (vcn1VarO2.r() == iR) {
                            String strValueOf = String.valueOf(obj2.getClass());
                            String strValueOf2 = String.valueOf(obj3.getClass());
                            hhg1.n(rjx.o(new StringBuilder(strValueOf.length() + 80 + strValueOf2.length()), "ArrayList elements must all be of the sameclass, but this one contains a ", strValueOf, " and a ", strValueOf2));
                            return null;
                        }
                    } else if (vcn1VarO2.r() != 14) {
                        iR = vcn1VarO2.r();
                        obj2 = obj3;
                    } else {
                        iR = 14;
                        if (vcn1VarO2.r() == iR) {
                            String strValueOf3 = String.valueOf(obj2.getClass());
                            String strValueOf4 = String.valueOf(obj3.getClass());
                            hhg1.n(rjx.o(new StringBuilder(strValueOf3.length() + 80 + strValueOf4.length()), "ArrayList elements must all be of the sameclass, but this one contains a ", strValueOf3, " and a ", strValueOf4));
                            return null;
                        }
                    }
                    bjp1VarH.s(vcn1VarO2);
                    i++;
                }
            }
        }
        gfp1VarO.d();
        ((dyn1) gfp1VarO).b.q(bjp1VarH.e());
        return gfp1VarO.e();
    }

    public static void P(ArrayList arrayList, vzq vzqVar, String str, vcn1 vcn1Var) {
        vcn1 vcn1Var2;
        HashMap map = vzqVar.a;
        int iR = vcn1Var.r();
        if (iR == 14) {
            map.put(str, null);
            return;
        }
        pbn1 pbn1VarN = vcn1Var.n();
        if (iR == 1) {
            map.put(str, pbn1VarN.s().m());
            return;
        }
        int i = 0;
        if (iR == 11) {
            map.put(str, (String[]) pbn1VarN.D().toArray(new String[0]));
            return;
        }
        if (iR == 12) {
            Object[] array = pbn1VarN.E().toArray();
            int length = array.length;
            long[] jArr = new long[length];
            while (i < length) {
                Object obj = array[i];
                obj.getClass();
                jArr[i] = ((Number) obj).longValue();
                i++;
            }
            map.put(str, jArr);
            return;
        }
        if (iR == 15) {
            Object[] array2 = pbn1VarN.F().toArray();
            int length2 = array2.length;
            float[] fArr = new float[length2];
            while (i < length2) {
                Object obj2 = array2[i];
                obj2.getClass();
                fArr[i] = ((Number) obj2).floatValue();
                i++;
            }
            map.put(str, fArr);
            return;
        }
        if (iR == 2) {
            map.put(str, pbn1VarN.t());
            return;
        }
        if (iR == 3) {
            map.put(str, Double.valueOf(pbn1VarN.u()));
            return;
        }
        if (iR == 4) {
            map.put(str, Float.valueOf(pbn1VarN.v()));
            return;
        }
        if (iR == 5) {
            map.put(str, Long.valueOf(pbn1VarN.w()));
            return;
        }
        if (iR == 6) {
            map.put(str, Integer.valueOf(pbn1VarN.x()));
            return;
        }
        if (iR == 7) {
            map.put(str, Byte.valueOf((byte) pbn1VarN.y()));
            return;
        }
        if (iR == 8) {
            map.put(str, Boolean.valueOf(pbn1VarN.z()));
            return;
        }
        if (iR == 13) {
            map.put(str, (Asset) arrayList.get((int) pbn1VarN.G()));
            return;
        }
        if (iR == 9) {
            vzq vzqVar2 = new vzq();
            for (kdn1 kdn1Var : pbn1VarN.A()) {
                try {
                    P(arrayList, vzqVar2, kdn1Var.n(), kdn1Var.o());
                } catch (RuntimeException e) {
                    bhn0.o("DataBundle parse error for: ".concat(String.valueOf(str)), e);
                    return;
                }
            }
            map.put(str, vzqVar2);
            return;
        }
        if (iR != 10) {
            jah.g("populateBundle: unexpected type ".concat(Integer.toString(iR)));
            return;
        }
        Iterator it = pbn1VarN.B().iterator();
        do {
            int iR2 = 14;
            while (true) {
                if (!it.hasNext()) {
                    ArrayList arrayList2 = new ArrayList(pbn1VarN.C());
                    for (vcn1 vcn1Var3 : pbn1VarN.B()) {
                        if (vcn1Var3.r() == 14) {
                            arrayList2.add(null);
                        } else if (iR2 == 9) {
                            vzq vzqVar3 = new vzq();
                            for (kdn1 kdn1Var2 : vcn1Var3.n().A()) {
                                P(arrayList, vzqVar3, kdn1Var2.n(), kdn1Var2.o());
                            }
                            arrayList2.add(vzqVar3);
                        } else if (iR2 == 2) {
                            arrayList2.add(vcn1Var3.n().t());
                        } else {
                            if (iR2 != 6) {
                                hhg1.n("Unexpected typeOfArrayList: ".concat(Integer.toString(iR2)));
                                return;
                            }
                            arrayList2.add(Integer.valueOf(vcn1Var3.n().x()));
                        }
                    }
                    if (iR2 == 14) {
                        map.put(str, arrayList2);
                        return;
                    }
                    if (iR2 == 9) {
                        map.put(str, arrayList2);
                        return;
                    }
                    if (iR2 == 2) {
                        map.put(str, arrayList2);
                        return;
                    } else if (iR2 == 6) {
                        map.put(str, arrayList2);
                        return;
                    } else {
                        eg.m("Unexpected typeOfArrayList: ".concat(Integer.toString(iR2)));
                        return;
                    }
                }
                vcn1Var2 = (vcn1) it.next();
                if (iR2 != 14) {
                    if (vcn1Var2.r() != iR2) {
                        String string = Integer.toString(iR2);
                        String string2 = Integer.toString(vcn1Var2.r());
                        StringBuilder sb = new StringBuilder(string.length() + String.valueOf(str).length() + 99 + 5 + string2.length());
                        bb00.j(sb, "The ArrayList elements should all be the same type, but ArrayList with key ", str, " contains items of type ", string);
                        hhg1.n(l1d.n(" and ", string2, sb));
                        return;
                    }
                } else if (vcn1Var2.r() == 9 || vcn1Var2.r() == 2 || vcn1Var2.r() == 6) {
                    iR2 = vcn1Var2.r();
                }
            }
        } while (vcn1Var2.r() == 14);
        String string3 = Integer.toString(vcn1Var2.r());
        hhg1.n(rjx.o(new StringBuilder(string3.length() + 37 + String.valueOf(str).length()), "Unexpected TypedValue type: ", string3, " for key ", str));
    }

    public static final void a(fn1 fn1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1025158362);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(fn1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("add_to_library_button", qim0Var);
            gdx gdxVarS = yla.s(x340Var);
            pk1 pk1Var = new pk1(fn1Var.b() ? qk1.b : qk1.a, false, fn1Var.a(), cwl1.o0(x340Var, 2131951772), (j7p1) null, 18);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new y1(function0, (byte) 9);
                x340Var.s0(objT);
            }
            h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT), qim0VarN, (max) null, gdxVarS, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(fn1Var, qim0Var, function0, i, (byte) 6);
        }
    }

    public static final void b(gt40 gt40Var, ql3 ql3Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1959221577);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(gt40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.g(ql3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(j2iVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && x340Var.H()) {
            x340Var.b0();
        } else {
            if (i4 != 0) {
                ql3Var = ql3.c;
            }
            s1c s1cVar = s1c.a;
            x340Var.j0(578571862);
            int i5 = i3 & 896;
            x340Var.j0(-548224868);
            if (!(x340Var.a instanceof i06)) {
                tgp1.p();
                throw null;
            }
            x340Var.g0();
            if (x340Var.S) {
                x340Var.l(s1cVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gt40Var, x340Var, wnb.e);
            nko1.H(ql3Var, x340Var, wnb.f);
            k4s0.i((i5 >> 6) & 14, j2iVar, x340Var, true, false);
            x340Var.r(false);
        }
        ql3 ql3Var2 = ql3Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(gt40Var, ql3Var2, j2iVar, i, i2, (byte) 3);
        }
    }

    public static xat c(float f) {
        return new xat(f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    public static final void d(qim0 qim0Var, xtb0 xtb0Var, uvx uvxVar, int i, vzq0 vzq0Var, g36 g36Var, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
        int i4;
        xtb0 xtb0Var2;
        g36 g36Var2;
        xtb0 xtb0Var3;
        g36 g36Var3;
        int i5;
        xtb0 xtb0Var4;
        int i6;
        g36 g36Var4;
        int i7;
        uvx uvxVar2 = uvxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-63649911);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(qim0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                xtb0Var2 = xtb0Var;
                int i8 = x340Var.i(xtb0Var2) ? 32 : 16;
                i4 |= i8;
            } else {
                xtb0Var2 = xtb0Var;
            }
            i4 |= i8;
        } else {
            xtb0Var2 = xtb0Var;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) != 0) {
                i7 = 128;
            } else {
                if ((i2 & 512) == 0 ? x340Var.g(uvxVar2) : x340Var.i(uvxVar2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
            }
            i4 |= i7;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var.i(vzq0Var) ? 16384 : 8192;
        }
        int i9 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                g36Var2 = g36Var;
                int i10 = x340Var.i(g36Var2) ? 1048576 : 524288;
                i9 |= i10;
            } else {
                g36Var2 = g36Var;
            }
            i9 |= i10;
        } else {
            g36Var2 = g36Var;
        }
        if ((12582912 & i2) == 0) {
            i9 |= x340Var.i(iu30Var) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i9 & 1, (4793491 & i9) != 4793490)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                xtb0 xtb0VarA = (i3 & 2) != 0 ? aub0.a(0, x340Var, 3) : xtb0Var2;
                uvx uvxVar3 = (i3 & 4) != 0 ? new uvx((pgx) null, 0, (tvx) null, (p3v) null, 31) : uvxVar2;
                int i11 = uvxVar3.c().equals(ngx.e) ? 1 : 2;
                if ((i3 & 64) != 0) {
                    xtb0Var4 = xtb0VarA;
                    i6 = i11;
                    g36Var4 = h36.c;
                    uvxVar2 = uvxVar3;
                } else {
                    xtb0Var4 = xtb0VarA;
                    i6 = i11;
                    uvxVar2 = uvxVar3;
                }
                x340Var.s();
                mod.b(vvx.b().a(uvxVar2), apo.r(225930313, new gvx(qim0Var, xtb0Var4, vzq0Var, g36Var4, iu30Var, i6), x340Var), x340Var, 56);
                xtb0Var3 = xtb0Var4;
                g36Var3 = g36Var4;
                i5 = i6;
            } else {
                x340Var.b0();
                i6 = i;
                xtb0Var4 = xtb0Var2;
            }
            g36Var4 = g36Var2;
            x340Var.s();
            mod.b(vvx.b().a(uvxVar2), apo.r(225930313, new gvx(qim0Var, xtb0Var4, vzq0Var, g36Var4, iu30Var, i6), x340Var), x340Var, 56);
            xtb0Var3 = xtb0Var4;
            g36Var3 = g36Var4;
            i5 = i6;
        } else {
            x340Var.b0();
            xtb0Var3 = xtb0Var2;
            g36Var3 = g36Var2;
            i5 = i;
        }
        uvx uvxVar4 = uvxVar2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hvx(qim0Var, xtb0Var3, uvxVar4, i5, vzq0Var, g36Var3, iu30Var, i2, i3);
        }
    }

    public static final void e(ajv ajvVar, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1977781714);
        if (((i | 2) & 19) == 18 && x340Var.H()) {
            x340Var.b0();
        } else {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                ajvVar = (ajv) x340Var.k(p4k.a());
            } else {
                x340Var.b0();
            }
            x340Var.s();
            mod.c(new ely0[]{p4k.a().a(ajvVar)}, j2iVar, x340Var, 48);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l04(ajvVar, j2iVar, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void f(String str, qim0 qim0Var, long j, long j2, lee1 lee1Var, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        String str2;
        int i3;
        qim0 qim0Var2;
        int i4;
        int i5;
        vu30 vu30Var2;
        int i6;
        boolean z;
        lee1 lee1Var2;
        vu30 vu30Var3;
        qim0 qim0Var3;
        b0k b0kVar2;
        long j3;
        long j4;
        h311 h311VarV;
        qim0 qim0Var4;
        long j5;
        vu30 vu30Var4;
        lee1 lee1Var3;
        long j6;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1608919246);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (b0kVar3.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.g(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= 128;
            }
            if ((i & 3072) == 0) {
                i3 |= 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            i4 = 196608 | i3;
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    vu30Var2 = vu30Var;
                    if (b0kVar3.i(vu30Var2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i4 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i7 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        uwr uwrVar = cbx.a;
                        long j7 = cbx.a(b0kVar3).b.a;
                        long j8 = cbx.a(b0kVar3).a.d;
                        lee1 lee1Var4 = cbx.d(b0kVar3).h;
                        if (i5 != 0) {
                            vu30Var2 = null;
                        }
                        j5 = j7;
                        vu30Var4 = vu30Var2;
                        lee1Var3 = lee1Var4;
                        j6 = j8;
                    } else {
                        b0kVar3.b0();
                        j5 = j;
                        qim0Var4 = qim0Var2;
                        j6 = j2;
                        vu30Var4 = vu30Var2;
                        lee1Var3 = lee1Var;
                    }
                    b0kVar3.s();
                    lee1 lee1Var5 = lee1Var3;
                    long j9 = j5;
                    b0kVar2 = b0kVar3;
                    ti5.a(apo.r(-1772295543, new sfq0(str2, lee1Var5, j9, (byte) 1), b0kVar3), u291.f(qim0Var4, 1.0f), apo.r(2049436103, new say0(vu30Var4, (byte) 3), b0kVar3), apo.r(-151859522, new kk11(), b0kVar3), 0.0f, poo1.r(0, 13), kkn.C(j6, j6, 0L, j5, 0L, b0kVar3, 52), b0kVar2, 3462, 144);
                    lee1Var2 = lee1Var5;
                    j4 = j6;
                    vu30Var3 = vu30Var4;
                    qim0Var3 = qim0Var4;
                    j3 = j9;
                } else {
                    b0kVar3.b0();
                    lee1Var2 = lee1Var;
                    vu30Var3 = vu30Var2;
                    qim0Var3 = qim0Var2;
                    b0kVar2 = b0kVar3;
                    j3 = j;
                    j4 = j2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new cye1(str, qim0Var3, j3, j4, lee1Var2, vu30Var3, i, i2);
                }
            }
            i4 = 1769472 | i3;
            vu30Var2 = vu30Var;
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    uwr uwrVar2 = cbx.a;
                    long j10 = cbx.a(b0kVar3).b.a;
                    long j11 = cbx.a(b0kVar3).a.d;
                    lee1 lee1Var6 = cbx.d(b0kVar3).h;
                    if (i5 != 0) {
                        vu30Var2 = null;
                    }
                    j5 = j10;
                    vu30Var4 = vu30Var2;
                    lee1Var3 = lee1Var6;
                    j6 = j11;
                } else {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    uwr uwrVar3 = cbx.a;
                    long j12 = cbx.a(b0kVar3).b.a;
                    long j13 = cbx.a(b0kVar3).a.d;
                    lee1 lee1Var7 = cbx.d(b0kVar3).h;
                    if (i5 != 0) {
                        vu30Var2 = null;
                    }
                    j5 = j12;
                    vu30Var4 = vu30Var2;
                    lee1Var3 = lee1Var7;
                    j6 = j13;
                }
                b0kVar3.s();
                lee1 lee1Var8 = lee1Var3;
                long j14 = j5;
                b0kVar2 = b0kVar3;
                ti5.a(apo.r(-1772295543, new sfq0(str2, lee1Var8, j14, (byte) 1), b0kVar3), u291.f(qim0Var4, 1.0f), apo.r(2049436103, new say0(vu30Var4, (byte) 3), b0kVar3), apo.r(-151859522, new kk11(), b0kVar3), 0.0f, poo1.r(0, 13), kkn.C(j6, j6, 0L, j5, 0L, b0kVar3, 52), b0kVar2, 3462, 144);
                lee1Var2 = lee1Var8;
                j4 = j6;
                vu30Var3 = vu30Var4;
                qim0Var3 = qim0Var4;
                j3 = j14;
            } else {
                b0kVar3.b0();
                lee1Var2 = lee1Var;
                vu30Var3 = vu30Var2;
                qim0Var3 = qim0Var2;
                b0kVar2 = b0kVar3;
                j3 = j;
                j4 = j2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new cye1(str, qim0Var3, j3, j4, lee1Var2, vu30Var3, i, i2);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            i3 |= 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        i4 = 196608 | i3;
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((1572864 & i) == 0) {
                vu30Var2 = vu30Var;
                if (b0kVar3.i(vu30Var2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    uwr uwrVar4 = cbx.a;
                    long j15 = cbx.a(b0kVar3).b.a;
                    long j16 = cbx.a(b0kVar3).a.d;
                    lee1 lee1Var9 = cbx.d(b0kVar3).h;
                    if (i5 != 0) {
                        vu30Var2 = null;
                    }
                    j5 = j15;
                    vu30Var4 = vu30Var2;
                    lee1Var3 = lee1Var9;
                    j6 = j16;
                } else {
                    if (i7 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    uwr uwrVar5 = cbx.a;
                    long j17 = cbx.a(b0kVar3).b.a;
                    long j18 = cbx.a(b0kVar3).a.d;
                    lee1 lee1Var10 = cbx.d(b0kVar3).h;
                    if (i5 != 0) {
                        vu30Var2 = null;
                    }
                    j5 = j17;
                    vu30Var4 = vu30Var2;
                    lee1Var3 = lee1Var10;
                    j6 = j18;
                }
                b0kVar3.s();
                lee1 lee1Var11 = lee1Var3;
                long j19 = j5;
                b0kVar2 = b0kVar3;
                ti5.a(apo.r(-1772295543, new sfq0(str2, lee1Var11, j19, (byte) 1), b0kVar3), u291.f(qim0Var4, 1.0f), apo.r(2049436103, new say0(vu30Var4, (byte) 3), b0kVar3), apo.r(-151859522, new kk11(), b0kVar3), 0.0f, poo1.r(0, 13), kkn.C(j6, j6, 0L, j5, 0L, b0kVar3, 52), b0kVar2, 3462, 144);
                lee1Var2 = lee1Var11;
                j4 = j6;
                vu30Var3 = vu30Var4;
                qim0Var3 = qim0Var4;
                j3 = j19;
            } else {
                b0kVar3.b0();
                lee1Var2 = lee1Var;
                vu30Var3 = vu30Var2;
                qim0Var3 = qim0Var2;
                b0kVar2 = b0kVar3;
                j3 = j;
                j4 = j2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new cye1(str, qim0Var3, j3, j4, lee1Var2, vu30Var3, i, i2);
            }
        }
        i4 = 1769472 | i3;
        vu30Var2 = vu30Var;
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                uwr uwrVar6 = cbx.a;
                long j110 = cbx.a(b0kVar3).b.a;
                long j111 = cbx.a(b0kVar3).a.d;
                lee1 lee1Var12 = cbx.d(b0kVar3).h;
                if (i5 != 0) {
                    vu30Var2 = null;
                }
                j5 = j110;
                vu30Var4 = vu30Var2;
                lee1Var3 = lee1Var12;
                j6 = j111;
            } else {
                if (i7 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                uwr uwrVar7 = cbx.a;
                long j112 = cbx.a(b0kVar3).b.a;
                long j113 = cbx.a(b0kVar3).a.d;
                lee1 lee1Var13 = cbx.d(b0kVar3).h;
                if (i5 != 0) {
                    vu30Var2 = null;
                }
                j5 = j112;
                vu30Var4 = vu30Var2;
                lee1Var3 = lee1Var13;
                j6 = j113;
            }
            b0kVar3.s();
            lee1 lee1Var14 = lee1Var3;
            long j114 = j5;
            b0kVar2 = b0kVar3;
            ti5.a(apo.r(-1772295543, new sfq0(str2, lee1Var14, j114, (byte) 1), b0kVar3), u291.f(qim0Var4, 1.0f), apo.r(2049436103, new say0(vu30Var4, (byte) 3), b0kVar3), apo.r(-151859522, new kk11(), b0kVar3), 0.0f, poo1.r(0, 13), kkn.C(j6, j6, 0L, j5, 0L, b0kVar3, 52), b0kVar2, 3462, 144);
            lee1Var2 = lee1Var14;
            j4 = j6;
            vu30Var3 = vu30Var4;
            qim0Var3 = qim0Var4;
            j3 = j114;
        } else {
            b0kVar3.b0();
            lee1Var2 = lee1Var;
            vu30Var3 = vu30Var2;
            qim0Var3 = qim0Var2;
            b0kVar2 = b0kVar3;
            j3 = j;
            j4 = j2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cye1(str, qim0Var3, j3, j4, lee1Var2, vu30Var3, i, i2);
        }
    }

    public static final long g(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void h(Throwable th, Throwable th2) {
        if (th != th2) {
            ozn1.a.d(th, th2);
        }
    }

    public static final String i(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static long j(boolean z, int i, h0a h0aVar, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = h0aVar == h0a.b ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static boolean k(cjl cjlVar) {
        bjl[] bjlVarArr = cjlVar.U;
        bjl bjlVar = bjlVarArr[0];
        bjl bjlVar2 = bjlVarArr[1];
        djl djlVar = cjlVar.V;
        djl djlVar2 = djlVar != null ? djlVar : null;
        bjl bjlVar3 = bjl.a;
        if (djlVar2 != null) {
            bjl bjlVar4 = ((cjl) djlVar2).U[0];
        }
        if (djlVar2 != null) {
            bjl bjlVar5 = ((cjl) djlVar2).U[1];
        }
        bjl bjlVar6 = bjl.c;
        bjl bjlVar7 = bjl.b;
        boolean z = bjlVar == bjlVar3 || cjlVar.C() || bjlVar == bjlVar7 || (bjlVar == bjlVar6 && cjlVar.s == 0 && cjlVar.Y == 0.0f && cjlVar.v(0)) || (bjlVar == bjlVar6 && cjlVar.s == 1 && cjlVar.w(0, cjlVar.s()));
        boolean z2 = bjlVar2 == bjlVar3 || cjlVar.D() || bjlVar2 == bjlVar7 || (bjlVar2 == bjlVar6 && cjlVar.t == 0 && cjlVar.Y == 0.0f && cjlVar.v(1)) || (bjlVar2 == bjlVar6 && cjlVar.t == 1 && cjlVar.w(1, cjlVar.m()));
        return (cjlVar.Y > 0.0f && (z || z2)) || (z && z2);
    }

    public static final Type l(oma0 oma0Var, boolean z) {
        qma0 qma0VarK = oma0Var.k();
        if (qma0VarK instanceof qma0) {
            qma0 qma0Var = qma0VarK;
            GenericDeclaration genericDeclarationB = qma0Var.b();
            if (genericDeclarationB == null) {
                t8e1.o(oma0Var, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : genericDeclarationB.getTypeParameters()) {
                if (u890.j(typeVariable2.getName(), qma0Var.c())) {
                    if (z2) {
                        hhg1.n("Array contains more than one matching element.");
                        return null;
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z2) {
                return typeVariable;
            }
            bhn0.t("Array contains no element matching the predicate.");
            return null;
        }
        if (!(qma0VarK instanceof tka0)) {
            t8e1.o(oma0Var, "Unsupported type classifier: ");
            return null;
        }
        tka0 tka0Var = (tka0) qma0VarK;
        Class clsT = z ? t(tka0Var) : ((wdg) tka0Var).n();
        List listV = oma0Var.v();
        if (listV.isEmpty()) {
            return clsT;
        }
        if (!clsT.isArray()) {
            return n(clsT, listV);
        }
        if (clsT.getComponentType().isPrimitive()) {
            return clsT;
        }
        tma0 tma0Var = (tma0) o7h.X0(listV);
        if (tma0Var == null) {
            hhg1.g(oma0Var, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        int iA = tma0Var.a();
        oma0 oma0VarB = tma0Var.b();
        int i = iA == 0 ? -1 : h2h1.a[l1d.C(iA)];
        if (i == -1 || i == 1) {
            return clsT;
        }
        if (i != 2 && i != 3) {
            eg.o();
            return null;
        }
        oma0VarB.getClass();
        Type typeL = l(oma0VarB, false);
        return typeL instanceof Class ? clsT : new ph40(typeL);
    }

    public static final zpr0 n(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(v((tma0) it.next()));
            }
            return new zpr0(cls, (Type) null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(v((tma0) it2.next()));
            }
            return new zpr0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        zpr0 zpr0VarN = n(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(q7h.U(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(v((tma0) it3.next()));
        }
        return new zpr0(cls, zpr0VarN, arrayList3);
    }

    public static void o(String str) {
        z(3, J(str));
    }

    public static void p(String str) {
        z(6, J(str));
    }

    public static void q(String str) {
        z(6, J(str));
    }

    public static final tka0 s(Annotation annotation) {
        return rc11.a.b(annotation.annotationType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class t(tka0 tka0Var) {
        Class clsN = ((wdg) tka0Var).n();
        if (clsN.isPrimitive()) {
            String name = clsN.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsN;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class u(tka0 tka0Var) {
        Class clsN = ((wdg) tka0Var).n();
        if (clsN.isPrimitive()) {
            return clsN;
        }
        String name = clsN.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final Type v(tma0 tma0Var) {
        int iD = tma0Var.d();
        if (iD == 0) {
            return kql1.c;
        }
        oma0 oma0VarC = tma0Var.c();
        oma0VarC.getClass();
        int iC = l1d.C(iD);
        if (iC == 0) {
            return l(oma0VarC, true);
        }
        if (iC == 1) {
            return new kql1((Type) null, l(oma0VarC, true));
        }
        if (iC == 2) {
            return new kql1(l(oma0VarC, true), (Type) null);
        }
        eg.o();
        return null;
    }

    public static void w(int i, vda vdaVar, cjl cjlVar, boolean z) {
        lhl lhlVar;
        lhl lhlVar2;
        boolean z2;
        lhl lhlVar3;
        lhl lhlVar4;
        if (cjlVar.n) {
            return;
        }
        if (!(cjlVar instanceof djl) && cjlVar.B() && k(cjlVar)) {
            djl.a0(cjlVar, vdaVar, new uda());
        }
        lhl lhlVarK = cjlVar.k(2);
        lhl lhlVarK2 = cjlVar.k(4);
        int iD = lhlVarK.d();
        int iD2 = lhlVarK2.d();
        HashSet<lhl> hashSet = lhlVarK.a;
        bjl bjlVar = bjl.c;
        if (hashSet != null && lhlVarK.c) {
            for (lhl lhlVar5 : hashSet) {
                cjl cjlVar2 = lhlVar5.d;
                int i2 = i + 1;
                boolean zK = k(cjlVar2);
                lhl lhlVar6 = cjlVar2.J;
                lhl lhlVar7 = cjlVar2.L;
                if (cjlVar2.B() && zK) {
                    z2 = true;
                    djl.a0(cjlVar2, vdaVar, new uda());
                } else {
                    z2 = true;
                }
                boolean z3 = ((lhlVar5 == lhlVar6 && (lhlVar4 = lhlVar7.f) != null && lhlVar4.c) || (lhlVar5 == lhlVar7 && (lhlVar3 = lhlVar6.f) != null && lhlVar3.c)) ? z2 : false;
                bjl bjlVar2 = cjlVar2.U[0];
                if (bjlVar2 != bjlVar || zK) {
                    if (!cjlVar2.B()) {
                        if (lhlVar5 == lhlVar6 && lhlVar7.f == null) {
                            int iE = lhlVar6.e() + iD;
                            cjlVar2.M(iE, cjlVar2.s() + iE);
                            w(i2, vdaVar, cjlVar2, z);
                        } else if (lhlVar5 == lhlVar7 && lhlVar6.f == null) {
                            int iE2 = iD - lhlVar7.e();
                            cjlVar2.M(iE2 - cjlVar2.s(), iE2);
                            w(i2, vdaVar, cjlVar2, z);
                        } else if (z3 && !cjlVar2.z()) {
                            E(i2, vdaVar, cjlVar2, z);
                        }
                    }
                } else if (bjlVar2 == bjlVar && cjlVar2.w >= 0 && cjlVar2.v >= 0 && (cjlVar2.i0 == 8 || (cjlVar2.s == 0 && cjlVar2.Y == 0.0f))) {
                    if (!cjlVar2.z() && !cjlVar2.G && z3 && !cjlVar2.z()) {
                        F(i2, cjlVar, vdaVar, cjlVar2, z);
                    }
                }
            }
        }
        if (cjlVar instanceof tq50) {
            return;
        }
        HashSet<lhl> hashSet2 = lhlVarK2.a;
        if (hashSet2 != null && lhlVarK2.c) {
            for (lhl lhlVar8 : hashSet2) {
                cjl cjlVar3 = lhlVar8.d;
                int i3 = i + 1;
                boolean zK2 = k(cjlVar3);
                lhl lhlVar9 = cjlVar3.J;
                lhl lhlVar10 = cjlVar3.L;
                if (cjlVar3.B() && zK2) {
                    djl.a0(cjlVar3, vdaVar, new uda());
                }
                boolean z4 = (lhlVar8 == lhlVar9 && (lhlVar2 = lhlVar10.f) != null && lhlVar2.c) || (lhlVar8 == lhlVar10 && (lhlVar = lhlVar9.f) != null && lhlVar.c);
                bjl bjlVar3 = cjlVar3.U[0];
                if (bjlVar3 != bjlVar || zK2) {
                    if (!cjlVar3.B()) {
                        if (lhlVar8 == lhlVar9 && lhlVar10.f == null) {
                            int iE3 = lhlVar9.e() + iD2;
                            cjlVar3.M(iE3, cjlVar3.s() + iE3);
                            w(i3, vdaVar, cjlVar3, z);
                        } else if (lhlVar8 == lhlVar10 && lhlVar9.f == null) {
                            int iE4 = iD2 - lhlVar10.e();
                            cjlVar3.M(iE4 - cjlVar3.s(), iE4);
                            w(i3, vdaVar, cjlVar3, z);
                        } else if (z4 && !cjlVar3.z()) {
                            E(i3, vdaVar, cjlVar3, z);
                        }
                    }
                } else if (bjlVar3 == bjlVar && cjlVar3.w >= 0 && cjlVar3.v >= 0) {
                    if (cjlVar3.i0 == 8 || (cjlVar3.s == 0 && cjlVar3.Y == 0.0f)) {
                        if (!cjlVar3.z() && !cjlVar3.G && z4 && !cjlVar3.z()) {
                            F(i3, cjlVar, vdaVar, cjlVar3, z);
                        }
                    }
                }
            }
        }
        cjlVar.n = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.core.InitializationException */
    public static boolean x(String str, d4d d4dVar) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) d4dVar.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(crn1.l(e));
        }
    }

    public static boolean y(String str) {
        return z(3, J(str));
    }

    public static boolean z(int i, String str) {
        return c <= i || Log.isLoggable(str, i);
    }

    public boolean m(yky0 yky0Var) {
        return false;
    }

    public Object r(yky0 yky0Var) {
        throw new IllegalStateException("");
    }
}
