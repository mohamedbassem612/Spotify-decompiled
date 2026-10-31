package p;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.car.app.model.Alert;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class exs {
    public static final oqq0 l = new nxh(new m(7));
    public n0g1 a;
    public o4a b;
    public kqg0 c;
    public final Context d;
    public final pp00 e;
    public zws f;
    public zws g;
    public volatile Thread h;
    public pna1 i;
    public po7 j;
    public Boolean k;

    public exs(k0g1 k0g1Var, pp00 pp00Var, Context context) {
        zws zwsVar;
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = pp00Var;
        if (k0g1Var instanceof zws) {
            zwsVar = (zws) k0g1Var;
        } else {
            zws zwsVar2 = zws.F0;
            zwsVar2.getClass();
            yws ywsVar = new yws(zwsVar2);
            ywsVar.d(k0g1Var);
            zwsVar = new zws(ywsVar);
        }
        this.f = zwsVar;
        this.g = zwsVar;
        this.j = po7.i;
        if (zwsVar.A0 && context == null) {
            oon1.H("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(kqg0 kqg0Var, zws zwsVar, op00[] op00VarArr) {
        int i = kqg0Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            qnf1 qnf1Var = kqg0Var.c[i2];
            Map map = (Map) zwsVar.D0.get(i2);
            if (map != null && map.containsKey(qnf1Var)) {
                Map map2 = (Map) zwsVar.D0.get(i2);
                if (map2 != null && map2.get(qnf1Var) != null) {
                    bhn0.d();
                    return;
                }
                op00VarArr[i2] = null;
            }
        }
    }

    public static void b(kqg0 kqg0Var, zws zwsVar, op00[] op00VarArr) {
        for (int i = 0; i < kqg0Var.a; i++) {
            int i2 = kqg0Var.b[i];
            if (zwsVar.E0.get(i) || zwsVar.I.contains(Integer.valueOf(i2))) {
                op00VarArr[i] = null;
            }
        }
    }

    public static void c(kqg0 kqg0Var, zws zwsVar, op00[] op00VarArr) {
        int i = kqg0Var.a;
        qnf1[] qnf1VarArr = kqg0Var.c;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            e(qnf1VarArr[i2], zwsVar, map);
        }
        e(kqg0Var.f, zwsVar, map);
        for (int i3 = 0; i3 < i; i3++) {
            h0g1 h0g1Var = (h0g1) map.get(Integer.valueOf(kqg0Var.b[i3]));
            if (h0g1Var != null) {
                pnf1 pnf1Var = h0g1Var.a;
                b380 b380Var = h0g1Var.b;
                op00VarArr[i3] = (b380Var.isEmpty() || qnf1VarArr[i3].b(pnf1Var) == -1) ? null : new op00(0, pnf1Var, bmq0.b0(b380Var));
            }
        }
    }

    public static void e(qnf1 qnf1Var, k0g1 k0g1Var, HashMap map) {
        for (int i = 0; i < qnf1Var.a; i++) {
            h0g1 h0g1Var = (h0g1) k0g1Var.H.get(qnf1Var.a(i));
            if (h0g1Var != null) {
                pnf1 pnf1Var = h0g1Var.a;
                h0g1 h0g1Var2 = (h0g1) map.get(Integer.valueOf(pnf1Var.c));
                if (h0g1Var2 == null || (h0g1Var2.b.isEmpty() && !h0g1Var.b.isEmpty())) {
                    map.put(Integer.valueOf(pnf1Var.c), h0g1Var);
                }
            }
        }
    }

    public static Pair f(op00[] op00VarArr, int i) {
        for (int i2 = 0; i2 < op00VarArr.length; i2++) {
            op00 op00Var = op00VarArr[i2];
            if (op00Var != null && op00Var.a.c == i) {
                return Pair.create(op00Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int g(ie30 ie30Var, b380 b380Var) {
        for (int i = 0; i < b380Var.size(); i++) {
            for (int i2 = 0; i2 < ie30Var.c.size(); i2++) {
                if (((u9b0) ie30Var.c.get(i2)).b.equals(b380Var.get(i))) {
                    return i;
                }
            }
        }
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    public static int h(ie30 ie30Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(ie30Var.d)) {
            return 4;
        }
        String strI = i(str);
        String strI2 = i(ie30Var.d);
        if (strI2 == null || strI == null) {
            return (z && strI2 == null) ? 1 : 0;
        }
        if (strI2.startsWith(strI) || strI.startsWith(strI2)) {
            return 3;
        }
        String str2 = zoi1.a;
        return strI2.split("-", 2)[0].equals(strI.split("-", 2)[0]) ? 2 : 0;
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean l(zws zwsVar, int i, ie30 ie30Var) {
        if ((i & 3584) == 0) {
            return false;
        }
        i0g1 i0g1Var = zwsVar.w;
        if (i0g1Var.c && (i & SemanticState.Modal) == 0) {
            return false;
        }
        if (i0g1Var.b) {
            boolean z = (ie30Var.N == 0 && ie30Var.O == 0) ? false : true;
            boolean z2 = (i & SemanticState.ReadOnly) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    public static op00 m(qnf1 qnf1Var, int[][] iArr, zws zwsVar) {
        if (zwsVar.w.a != 2) {
            int i = 0;
            pnf1 pnf1Var = null;
            xws xwsVar = null;
            for (int i2 = 0; i2 < qnf1Var.a; i2++) {
                pnf1 pnf1VarA = qnf1Var.a(i2);
                int[] iArr2 = iArr[i2];
                for (int i3 = 0; i3 < pnf1VarA.a; i3++) {
                    if (jca.u(iArr2[i3], zwsVar.B0)) {
                        xws xwsVar2 = new xws(iArr2[i3], pnf1VarA.d[i3]);
                        if (xwsVar != null) {
                            if (sxh.a.d(xwsVar2.b, xwsVar.b).d(xwsVar2.a, xwsVar.a).f() > 0) {
                                pnf1Var = pnf1VarA;
                                i = i3;
                                xwsVar = xwsVar2;
                            }
                        } else {
                            pnf1Var = pnf1VarA;
                            i = i3;
                            xwsVar = xwsVar2;
                        }
                    }
                }
            }
            if (pnf1Var != null) {
                return new op00(0, pnf1Var, new int[]{i});
            }
        }
        return null;
    }

    public static Pair o(int i, kqg0 kqg0Var, int[][][] iArr, bxs bxsVar, Comparator comparator) {
        int i2;
        bg11 bg11VarT;
        kqg0 kqg0Var2 = kqg0Var;
        ArrayList arrayList = new ArrayList();
        int i3 = kqg0Var2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == kqg0Var2.b[i4]) {
                qnf1 qnf1Var = kqg0Var2.c[i4];
                for (int i5 = 0; i5 < qnf1Var.a; i5++) {
                    pnf1 pnf1VarA = qnf1Var.a(i5);
                    bg11 bg11VarB = bxsVar.b(i4, pnf1VarA, iArr[i4][i5]);
                    int i6 = pnf1VarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        cxs cxsVar = (cxs) bg11VarB.get(i7);
                        int iA = cxsVar.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                bg11VarT = b380.t(cxsVar);
                            } else {
                                bg11 arrayList2 = new ArrayList();
                                arrayList2.add(cxsVar);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    cxs cxsVar2 = (cxs) bg11VarB.get(i8);
                                    int i9 = i3;
                                    if (cxsVar2.a() == 2 && cxsVar.b(cxsVar2)) {
                                        arrayList2.add(cxsVar2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                bg11VarT = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(bg11VarT);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            kqg0Var2 = kqg0Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((cxs) list.get(i10)).c;
        }
        cxs cxsVar3 = (cxs) list.get(0);
        return Pair.create(new op00(0, cxsVar3.b, iArr2), Integer.valueOf(cxsVar3.a));
    }

    public final yws d() {
        zws zwsVar = this.f;
        zwsVar.getClass();
        return new yws(zwsVar);
    }

    public final void j(k0g1 k0g1Var) {
        if (k0g1Var == null) {
            return;
        }
        if (k0g1Var instanceof zws) {
            this.g = (zws) k0g1Var;
            return;
        }
        yws ywsVar = new yws(this.g);
        ywsVar.d(k0g1Var);
        this.g = new zws(ywsVar);
    }

    public final void k() {
        pna1 pna1Var;
        if (this.h != null) {
            dm5.z(Thread.currentThread().equals(this.h), "DefaultTrackSelector is accessed on the wrong thread.");
        }
        if (Build.VERSION.SDK_INT >= 32 && (pna1Var = this.i) != null) {
            pna1Var.e();
            this.i = null;
        }
        this.a = null;
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02f6  */
    public final o0g1 n(jca[] jcaVarArr, qnf1 qnf1Var, p2i0 p2i0Var, sqe1 sqe1Var) {
        byte b;
        String str;
        int[] iArr;
        qnf1[] qnf1VarArr;
        int[] iArr2;
        bg11 bg11VarT;
        String languageTag;
        Pair pairO;
        CaptioningManager captioningManager;
        Locale locale;
        boolean z;
        Context context;
        int[] iArr3;
        qnf1 qnf1Var2 = qnf1Var;
        int i = 1;
        int[] iArr4 = new int[jcaVarArr.length + 1];
        int length = jcaVarArr.length + 1;
        pnf1[][] pnf1VarArr = new pnf1[length][];
        int[][][] iArr5 = new int[jcaVarArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = qnf1Var2.a;
            pnf1VarArr[i2] = new pnf1[i3];
            iArr5[i2] = new int[i3][];
        }
        int length2 = jcaVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr6[i4] = jcaVarArr[i4].S();
        }
        int i5 = 0;
        while (true) {
            b = 5;
            if (i5 >= qnf1Var2.a) {
                break;
            }
            pnf1 pnf1VarA = qnf1Var2.a(i5);
            int i6 = pnf1VarA.c == 5 ? i : 0;
            int length3 = jcaVarArr.length;
            int i7 = i;
            int i8 = 0;
            int i9 = 0;
            while (i8 < jcaVarArr.length) {
                jca jcaVar = jcaVarArr[i8];
                int iMax = 0;
                int[] iArr7 = iArr4;
                int i10 = i;
                for (int i11 = 0; i11 < pnf1VarA.a; i11++) {
                    iMax = Math.max(iMax, jcaVar.R(pnf1VarA.d[i11]) & 7);
                }
                int i12 = iArr7[i8] == 0 ? i10 : 0;
                if (iMax > i9 || (iMax == i9 && i6 != 0 && i7 == 0 && i12 != 0)) {
                    i9 = iMax;
                    i7 = i12;
                    length3 = i8;
                }
                i8++;
                i = i10;
                iArr4 = iArr7;
            }
            int[] iArr8 = iArr4;
            int i13 = i;
            if (length3 == jcaVarArr.length) {
                iArr3 = new int[pnf1VarA.a];
            } else {
                jca jcaVar2 = jcaVarArr[length3];
                int[] iArr9 = new int[pnf1VarA.a];
                for (int i14 = 0; i14 < pnf1VarA.a; i14++) {
                    iArr9[i14] = jcaVar2.R(pnf1VarA.d[i14]);
                }
                iArr3 = iArr9;
            }
            int i15 = iArr8[length3];
            pnf1VarArr[length3][i15] = pnf1VarA;
            iArr5[length3][i15] = iArr3;
            iArr8[length3] = i15 + 1;
            i5++;
            qnf1Var2 = qnf1Var;
            i = i13;
            iArr4 = iArr8;
        }
        int[] iArr10 = iArr4;
        int i16 = i;
        qnf1[] qnf1VarArr2 = new qnf1[jcaVarArr.length];
        String[] strArr = new String[jcaVarArr.length];
        int[] iArr11 = new int[jcaVarArr.length];
        for (int i17 = 0; i17 < jcaVarArr.length; i17++) {
            int i18 = iArr10[i17];
            qnf1VarArr2[i17] = new qnf1((pnf1[]) zoi1.Y(i18, pnf1VarArr[i17]));
            iArr5[i17] = (int[][]) zoi1.Y(i18, iArr5[i17]);
            strArr[i17] = jcaVarArr[i17].i();
            iArr11[i17] = jcaVarArr[i17].b;
        }
        kqg0 kqg0Var = new kqg0(iArr11, qnf1VarArr2, iArr6, iArr5, new qnf1((pnf1[]) zoi1.Y(iArr10[jcaVarArr.length], pnf1VarArr[jcaVarArr.length])));
        this.h = Thread.currentThread();
        Boolean boolValueOf = this.k;
        if (boolValueOf == null && (context = this.d) != null) {
            boolValueOf = Boolean.valueOf(zoi1.T(context));
            this.k = boolValueOf;
        }
        if (this.g.A0 && Build.VERSION.SDK_INT >= 32 && this.i == null) {
            this.i = new pna1(this.d, new fss(this, b), boolValueOf);
        }
        int i19 = kqg0Var.a;
        op00[] op00VarArr = new op00[i19];
        c(kqg0Var, this.g, op00VarArr);
        a(kqg0Var, this.g, op00VarArr);
        b(kqg0Var, this.g, op00VarArr);
        zws zwsVar = this.g;
        Context context2 = this.d;
        int i20 = kqg0Var.a;
        Pair pairF = f(op00VarArr, i16);
        if (pairF == null) {
            int i21 = 0;
            while (true) {
                if (i21 >= i20) {
                    z = false;
                    break;
                }
                if (2 == iArr11[i21] && qnf1VarArr2[i21].a > 0) {
                    z = true;
                    break;
                }
                i21++;
            }
            pairF = o(1, kqg0Var, iArr5, new uws(z, this, zwsVar, iArr6), new m((byte) 11));
            if (pairF != null) {
                op00VarArr[((Integer) pairF.second).intValue()] = (op00) pairF.first;
            }
        }
        if (pairF == null) {
            str = null;
        } else {
            op00 op00Var = (op00) pairF.first;
            str = op00Var.a.d[op00Var.b[0]].d;
        }
        Pair pairF2 = f(op00VarArr, 2);
        int i22 = 4;
        Pair pairF3 = f(op00VarArr, 4);
        if (pairF2 == null && pairF3 == null) {
            Pair pairO2 = zwsVar.w.a == 2 ? null : o(2, kqg0Var, iArr5, new tws(zwsVar, str, iArr6, (!zwsVar.k || context2 == null) ? null : zoi1.C(context2), (byte) 0), new m((byte) 10));
            Pair pairO3 = ((zwsVar.E || pairO2 == null) && zwsVar.w.a != 2) ? o(i22, kqg0Var, iArr5, new sws(zwsVar), new m((byte) 9)) : null;
            if (pairO3 != null) {
                op00VarArr[((Integer) pairO3.second).intValue()] = (op00) pairO3.first;
            } else if (pairO2 != null) {
                op00VarArr[((Integer) pairO2.second).intValue()] = (op00) pairO2.first;
            }
        } else {
            i22 = 4;
        }
        if (f(op00VarArr, 3) == null) {
            if (zwsVar.w.a == 2) {
                pairO = null;
            } else {
                if (!zwsVar.B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                    languageTag = null;
                } else {
                    String str2 = zoi1.a;
                    languageTag = locale.toLanguageTag();
                }
                pairO = o(3, kqg0Var, iArr5, new k65(zwsVar, str, languageTag, (byte) 5), new m((byte) 8));
            }
            if (pairO != null) {
                op00VarArr[((Integer) pairO.second).intValue()] = (op00) pairO.first;
            }
        }
        int iA = jca.a(0, 0, 0, 0);
        if (zwsVar.w.a == 2) {
            iArr = iArr11;
            qnf1VarArr = qnf1VarArr2;
        } else {
            r380 r380Var = new r380(i22);
            int i23 = 0;
            while (i23 < i19) {
                op00 op00Var2 = op00VarArr[i23];
                if (op00Var2 != null) {
                    pnf1 pnf1Var = op00Var2.a;
                    if (zwsVar.E0.get(i23) || zwsVar.I.contains(Integer.valueOf(pnf1Var.c))) {
                        iArr2 = iArr11;
                    } else {
                        r380Var.g(pnf1Var.b);
                        int i24 = 0;
                        while (true) {
                            int[] iArr12 = op00Var2.b;
                            iArr2 = iArr11;
                            if (i24 < iArr12.length) {
                                String str3 = pnf1Var.d[iArr12[i24]].n;
                                if (str3 != null) {
                                    r380Var.g(str3);
                                }
                                i24++;
                                iArr11 = iArr2;
                            }
                        }
                    }
                } else {
                    iArr2 = iArr11;
                }
                i23++;
                iArr11 = iArr2;
            }
            iArr = iArr11;
            t380 t380VarI = r380Var.i();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i25 = 0;
            while (i25 < i20) {
                if (iArr[i25] == 5) {
                    qnf1 qnf1Var3 = qnf1VarArr2[i25];
                    int i26 = 0;
                    while (i26 < qnf1Var3.a) {
                        pnf1 pnf1VarA2 = qnf1Var3.a(i26);
                        arrayList.add(pnf1VarA2);
                        int i27 = i25;
                        int[] iArr13 = (int[]) iArr5[i25][i26].clone();
                        qnf1[] qnf1VarArr3 = qnf1VarArr2;
                        qnf1 qnf1Var4 = qnf1Var3;
                        for (int i28 = 0; i28 < iArr13.length; i28++) {
                            String str4 = pnf1VarA2.d[i28].n;
                            if (str4 != null && !t380VarI.contains(str4)) {
                                iArr13[i28] = iA;
                            }
                        }
                        arrayList2.add(iArr13);
                        i26++;
                        qnf1VarArr2 = qnf1VarArr3;
                        i25 = i27;
                        qnf1Var3 = qnf1Var4;
                    }
                }
                i25++;
                qnf1VarArr2 = qnf1VarArr2;
            }
            qnf1VarArr = qnf1VarArr2;
            int size = arrayList.size();
            pnf1[] pnf1VarArr2 = new pnf1[size];
            dm5.y(arrayList.size() == size);
            arrayList.toArray(pnf1VarArr2);
            qnf1 qnf1Var5 = new qnf1(pnf1VarArr2);
            int size2 = arrayList2.size();
            int[][] iArr14 = new int[size2][];
            dm5.y(arrayList2.size() == size2);
            arrayList2.toArray(iArr14);
            for (int i29 = 0; i29 < i20; i29++) {
                if (iArr[i29] == 5) {
                    op00 op00VarM = m(qnf1Var5, iArr14, zwsVar);
                    op00VarArr[i29] = op00VarM;
                    if (op00VarM == null) {
                        break;
                    }
                    Arrays.fill(iArr14[qnf1Var5.b(op00VarM.a)], iA);
                }
            }
        }
        for (int i30 = 0; i30 < i20; i30++) {
            int i31 = iArr[i30];
            if (i31 != 2 && i31 != 1) {
                if (i31 != 3 && i31 != 4) {
                    if (i31 != 5 && op00VarArr[i30] == null) {
                        op00VarArr[i30] = m(qnf1VarArr[i30], iArr5[i30], zwsVar);
                    }
                }
            }
        }
        c(kqg0Var, this.g, op00VarArr);
        a(kqg0Var, this.g, op00VarArr);
        b(kqg0Var, this.g, op00VarArr);
        pp00 pp00Var = this.e;
        o4a o4aVar = this.b;
        o4aVar.getClass();
        qp00[] qp00VarArrA = pp00Var.a(op00VarArr, o4aVar);
        ld21[] ld21VarArr = new ld21[i19];
        for (int i32 = 0; i32 < i19; i32++) {
            ld21VarArr[i32] = (this.g.E0.get(i32) || this.g.I.contains(Integer.valueOf(kqg0Var.b[i32])) || (kqg0Var.b[i32] != -2 && qp00VarArrA[i32] == null)) ? null : ld21.c;
        }
        this.g.getClass();
        zws zwsVar2 = this.g;
        if (zwsVar2.w.a != 0) {
            int i33 = 0;
            int i34 = 0;
            int i35 = -1;
            while (true) {
                if (i33 >= kqg0Var.a) {
                    if (i34 != 1) {
                        break;
                    }
                    int i36 = zwsVar2.w.b ? 1 : 2;
                    ld21 ld21Var = ld21VarArr[i35];
                    ld21VarArr[i35] = new ld21(i36, ld21Var != null && ld21Var.b);
                    break;
                }
                int i37 = kqg0Var.b[i33];
                qp00 qp00Var = qp00VarArrA[i33];
                if (i37 != 1 && qp00Var != null) {
                    break;
                }
                if (i37 == 1 && qp00Var != null && qp00Var.length() == 1) {
                    if (l(zwsVar2, iArr5[i33][kqg0Var.c[i33].b(qp00Var.n())][qp00Var.f(0)], qp00Var.s())) {
                        i34++;
                        i35 = i33;
                    }
                }
                i33++;
            }
        }
        Pair pairCreate = Pair.create(ld21VarArr, qp00VarArrA);
        qp00[] qp00VarArr = (qp00[]) pairCreate.second;
        int length4 = qp00VarArr.length;
        List[] listArr = new List[length4];
        for (int i38 = 0; i38 < qp00VarArr.length; i38++) {
            qp00 qp00Var2 = qp00VarArr[i38];
            if (qp00Var2 != null) {
                bg11VarT = b380.t(qp00Var2);
            } else {
                w280 w280Var = b380.b;
                bg11VarT = bg11.e;
            }
            listArr[i38] = bg11VarT;
        }
        v280 v280Var = new v280(4);
        int i39 = 0;
        while (true) {
            int i40 = kqg0Var.a;
            qnf1[] qnf1VarArr4 = kqg0Var.c;
            if (i39 >= i40) {
                break;
            }
            qnf1 qnf1Var6 = qnf1VarArr4[i39];
            int i41 = 0;
            while (i41 < qnf1Var6.a) {
                pnf1 pnf1VarA3 = qnf1Var6.a(i41);
                int i42 = qnf1VarArr4[i39].a(i41).a;
                int[] iArr15 = new int[i42];
                int i43 = 0;
                for (int i44 = 0; i44 < i42; i44++) {
                    if ((kqg0Var.e[i39][i41][i44] & 7) == 4) {
                        iArr15[i43] = i44;
                        i43++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr15, i43);
                List[] listArr2 = listArr;
                int iMin = 16;
                String str5 = null;
                int i45 = 0;
                boolean z2 = false;
                int i46 = 0;
                while (i45 < iArrCopyOf.length) {
                    String str6 = qnf1VarArr4[i39].a(i41).d[iArrCopyOf[i45]].f66p;
                    int i47 = i46 + 1;
                    if (i46 == 0) {
                        str5 = str6;
                    } else {
                        z2 = (!Objects.equals(str5, str6)) | z2;
                    }
                    iMin = Math.min(iMin, kqg0Var.e[i39][i41][i45] & 24);
                    i45++;
                    i46 = i47;
                }
                if (z2) {
                    iMin = Math.min(iMin, kqg0Var.d[i39]);
                }
                boolean z3 = iMin != 0;
                int i48 = pnf1VarA3.a;
                int[] iArr16 = new int[i48];
                boolean[] zArr = new boolean[i48];
                int i49 = 0;
                while (i49 < pnf1VarA3.a) {
                    iArr16[i49] = kqg0Var.e[i39][i41][i49] & 7;
                    int i50 = 0;
                    boolean z4 = false;
                    while (i50 < length4) {
                        List list = listArr2[i50];
                        int i51 = length4;
                        int i52 = i39;
                        int i53 = 0;
                        while (i53 < list.size()) {
                            qp00 qp00Var3 = (qp00) list.get(i53);
                            int i54 = i53;
                            if (qp00Var3.n().equals(pnf1VarA3) && qp00Var3.m(i49) != -1) {
                                z4 = true;
                                break;
                            }
                            i53 = i54 + 1;
                        }
                        i50++;
                        length4 = i51;
                        i39 = i52;
                    }
                    zArr[i49] = z4;
                    i49++;
                    i39 = i39;
                }
                v280Var.c(new n3g1(pnf1VarA3, z3, iArr16, zArr));
                i41++;
                listArr = listArr2;
                length4 = length4;
                i39 = i39;
            }
            i39++;
            length4 = length4;
        }
        qnf1 qnf1Var7 = kqg0Var.f;
        for (int i55 = 0; i55 < qnf1Var7.a; i55++) {
            pnf1 pnf1VarA4 = qnf1Var7.a(i55);
            int[] iArr17 = new int[pnf1VarA4.a];
            Arrays.fill(iArr17, 0);
            v280Var.c(new n3g1(pnf1VarA4, false, iArr17, new boolean[pnf1VarA4.a]));
        }
        return new o0g1((ld21[]) pairCreate.first, (qp00[]) pairCreate.second, new o3g1(v280Var.g()), kqg0Var);
    }

    public final void p(k0g1 k0g1Var) {
        if (k0g1Var instanceof zws) {
            q((zws) k0g1Var);
        }
        yws ywsVar = new yws(this.f);
        ywsVar.d(k0g1Var);
        q(new zws(ywsVar));
    }

    public final void q(zws zwsVar) {
        boolean zEquals = this.f.equals(zwsVar);
        this.f = zwsVar;
        if (zEquals) {
            return;
        }
        if (zwsVar.A0 && this.d == null) {
            oon1.H("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        n0g1 n0g1Var = this.a;
        if (n0g1Var != null) {
            n0g1Var.e(zwsVar);
        }
    }

    public exs(Context context) {
        this(context, new u61());
    }

    public exs(Context context, u61 u61Var) {
        this(zws.F0, u61Var, context);
    }
}
