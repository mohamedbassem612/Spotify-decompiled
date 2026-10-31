package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a5d implements c2d {
    public e4i1 N0;
    public cfc1 O0;
    public final h031 P0;
    public final h031 Q0;
    public final n3d a;
    public final n3d b;
    public final ic9 c;
    public final l4i1 d;
    public final my8 e;
    public final fdc h;
    public final z2d t;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public List i = Collections.EMPTY_LIST;
    public final Object X = new Object();
    public boolean Y = true;
    public qsk Z = null;

    public a5d(n3d n3dVar, n3d n3dVar2, h031 h031Var, h031 h031Var2, fdc fdcVar, ic9 ic9Var, b2d b2dVar) {
        this.a = n3dVar;
        this.b = n3dVar2;
        this.h = fdcVar;
        this.c = ic9Var;
        this.d = b2dVar;
        z2d z2dVar = h031Var.c;
        this.t = z2dVar;
        z2dVar.q();
        this.P0 = h031Var;
        this.Q0 = h031Var2;
        this.e = t(h031Var, h031Var2);
    }

    public static ArrayList A(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e4i1) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw pze0.g(it2);
            }
        }
        return arrayList2;
    }

    public static Matrix j(Rect rect, Size size) {
        o0c.k("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static pr70 q() {
        Object objE;
        Object objE2;
        Object objE3;
        Object objE4;
        xdn0 xdn0Var = (xdn0) new h0y((byte) 23).b;
        xdn0Var.r(jrd1.r0, "ImageCapture-Extra");
        sy8 sy8Var = qr70.d;
        xdn0Var.getClass();
        try {
            objE = xdn0Var.e(sy8Var);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        Integer num = (Integer) objE;
        if (num != null) {
            xdn0Var.r(st70.K, num);
        } else {
            mr70 mr70Var = pr70.x;
            try {
                objE2 = xdn0Var.e(qr70.e);
            } catch (IllegalArgumentException unused2) {
                objE2 = null;
            }
            if (Objects.equals(objE2, 1)) {
                xdn0Var.r(st70.K, 4101);
                xdn0Var.r(st70.L, liv.c);
            } else {
                xdn0Var.r(st70.K, Integer.valueOf(SemanticState.Hidden));
            }
        }
        qr70 qr70Var = new qr70(eqq0.b(xdn0Var));
        cx70.C(qr70Var);
        pr70 pr70Var = new pr70(qr70Var);
        try {
            objE3 = xdn0Var.e(cx70.Q);
        } catch (IllegalArgumentException unused3) {
            objE3 = null;
        }
        Size size = (Size) objE3;
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        sy8 sy8Var2 = ue90.W;
        Object objA = ve90.a();
        try {
            objA = xdn0Var.e(sy8Var2);
        } catch (IllegalArgumentException unused4) {
        }
        o0c.p((Executor) objA, "The IO executor can't be null");
        sy8 sy8Var3 = qr70.c;
        if (xdn0Var.a.containsKey(sy8Var3)) {
            Integer num2 = (Integer) xdn0Var.e(sy8Var3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                hhg1.g(num2, "The flash mode is not allowed to set: ");
                return null;
            }
            if (num2.intValue() == 3) {
                try {
                    objE4 = xdn0Var.e(qr70.i);
                } catch (IllegalArgumentException unused5) {
                    objE4 = null;
                }
                if (objE4 == null) {
                    hhg1.n("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                    return null;
                }
            }
        }
        return pr70Var;
    }

    public static my8 t(h031 h031Var, h031 h031Var2) {
        StringBuilder sb = new StringBuilder();
        sb.append(h031Var.a.b());
        sb.append(h031Var2 == null ? "" : h031Var2.a.b());
        return new my8(sb.toString(), h031Var.c.a);
    }

    public static HashMap u(ArrayList arrayList, l4i1 l4i1Var, l4i1 l4i1Var2) {
        i4i1 i4i1VarE;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e4i1 e4i1Var = (e4i1) it.next();
            if (e4i1Var instanceof cfc1) {
                cfc1 cfc1Var = (cfc1) e4i1Var;
                i4i1 i4i1VarE2 = new rpv0((byte) 3).d().e(false, l4i1Var);
                if (i4i1VarE2 == null) {
                    i4i1VarE = null;
                } else {
                    xdn0 xdn0VarN = xdn0.n(i4i1VarE2);
                    xdn0VarN.a.remove(jrd1.s0);
                    i4i1VarE = ((c681) cfc1Var.j(xdn0VarN)).h();
                }
            } else {
                i4i1VarE = e4i1Var.e(false, l4i1Var);
            }
            i4i1 i4i1VarE3 = e4i1Var.e(true, l4i1Var2);
            z4d z4dVar = new z4d();
            z4dVar.a = i4i1VarE;
            z4dVar.b = i4i1VarE3;
            map.put(e4i1Var, z4dVar);
        }
        return map;
    }

    public static boolean y(i29 i29Var, bb61 bb61Var) {
        qsk qskVar = i29Var.d;
        eqq0 eqq0Var = bb61Var.g.b;
        if (qskVar.c().size() != bb61Var.g.b.c().size()) {
            return true;
        }
        for (sy8 sy8Var : qskVar.c()) {
            if (!eqq0Var.a.containsKey(sy8Var) || !Objects.equals(eqq0Var.e(sy8Var), qskVar.e(sy8Var))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        int i2;
        i29 i29Var;
        qsk qskVar;
        boolean z2;
        synchronized (this.X) {
            try {
                x();
                synchronized (this.X) {
                    try {
                        i = 0;
                        if (!this.i.isEmpty()) {
                            Iterator it = linkedHashSet.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                e4i1 e4i1Var = (e4i1) it.next();
                                if (e4i1Var instanceof pr70) {
                                    i4i1 i4i1Var = e4i1Var.f;
                                    sy8 sy8Var = qr70.e;
                                    if (i4i1Var.g(sy8Var)) {
                                        Integer num = (Integer) i4i1Var.e(sy8Var);
                                        num.getClass();
                                        if (num.intValue() == 1) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (z2) {
                                throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z) {
                    x();
                }
                cfc1 cfc1VarR = r(linkedHashSet, z);
                e4i1 e4i1VarI = i(linkedHashSet, cfc1VarR);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (e4i1VarI != null) {
                    arrayList.add(e4i1VarI);
                }
                if (cfc1VarR != null) {
                    arrayList.add(cfc1VarR);
                    arrayList.removeAll(cfc1VarR.f23p.a);
                }
                ArrayList<e4i1> arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.g);
                ArrayList<e4i1> arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.g);
                ArrayList<e4i1> arrayList4 = new ArrayList(this.g);
                arrayList4.removeAll(arrayList);
                HashMap mapU = u(arrayList2, (l4i1) this.t.h(x2d.f165p, l4i1.a), this.d);
                Map mapP = Collections.EMPTY_MAP;
                try {
                    synchronized (this.X) {
                        try {
                            i2 = this.h.b == 2 ? 1 : 0;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    HashMap mapP2 = p(i2, this.a.g(), arrayList2, arrayList3, mapU);
                    if (this.b != null) {
                        synchronized (this.X) {
                            try {
                                if (this.h.b == 2) {
                                    i = 1;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        n3d n3dVar = this.b;
                        Objects.requireNonNull(n3dVar);
                        mapP = p(i, n3dVar.g(), arrayList2, arrayList3, mapU);
                    }
                    C(mapP2, arrayList);
                    ArrayList arrayListA = A(arrayList, this.i);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListA2 = A(arrayList5, arrayListA);
                    if (arrayListA2.size() > 0) {
                        arrayListA2.toString();
                        j2h1.M("CameraUseCaseAdapter");
                    }
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        ((e4i1) it2.next()).z(this.a);
                    }
                    this.a.l(arrayList4);
                    if (this.b != null) {
                        for (e4i1 e4i1Var2 : arrayList4) {
                            n3d n3dVar2 = this.b;
                            Objects.requireNonNull(n3dVar2);
                            e4i1Var2.z(n3dVar2);
                        }
                        n3d n3dVar3 = this.b;
                        Objects.requireNonNull(n3dVar3);
                        n3dVar3.l(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        for (e4i1 e4i1Var3 : arrayList3) {
                            if (mapP2.containsKey(e4i1Var3) && (qskVar = (i29Var = (i29) mapP2.get(e4i1Var3)).d) != null && y(i29Var, e4i1Var3.m)) {
                                e4i1Var3.g = e4i1Var3.u(qskVar);
                                if (this.Y) {
                                    this.a.j(e4i1Var3);
                                    n3d n3dVar4 = this.b;
                                    if (n3dVar4 != null) {
                                        n3dVar4.j(e4i1Var3);
                                    }
                                }
                            }
                        }
                    }
                    for (e4i1 e4i1Var4 : arrayList2) {
                        z4d z4dVar = (z4d) mapU.get(e4i1Var4);
                        Objects.requireNonNull(z4dVar);
                        n3d n3dVar5 = this.b;
                        n3d n3dVar6 = this.a;
                        if (n3dVar5 != null) {
                            e4i1Var4.a(n3dVar6, n3dVar5, z4dVar.a, z4dVar.b);
                            i29 i29Var2 = (i29) mapP2.get(e4i1Var4);
                            i29Var2.getClass();
                            e4i1Var4.g = e4i1Var4.v(i29Var2, (i29) mapP.get(e4i1Var4));
                        } else {
                            e4i1Var4.a(n3dVar6, null, z4dVar.a, z4dVar.b);
                            i29 i29Var3 = (i29) mapP2.get(e4i1Var4);
                            i29Var3.getClass();
                            e4i1Var4.g = e4i1Var4.v(i29Var3, null);
                        }
                    }
                    if (this.Y) {
                        this.a.m(arrayList2);
                        n3d n3dVar7 = this.b;
                        if (n3dVar7 != null) {
                            n3dVar7.m(arrayList2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((e4i1) it3.next()).o();
                    }
                    this.f.clear();
                    this.f.addAll(linkedHashSet);
                    this.g.clear();
                    this.g.addAll(arrayList);
                    this.N0 = e4i1VarI;
                    this.O0 = cfc1VarR;
                } catch (IllegalArgumentException e) {
                    if (!z) {
                        x();
                        if (this.h.b != 2) {
                            B(linkedHashSet, true);
                            return;
                        }
                    }
                    throw e;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void C(HashMap map, ArrayList arrayList) {
        synchronized (this.X) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e4i1 e4i1Var = (e4i1) it.next();
                    Rect rectA = this.a.c().a();
                    i29 i29Var = (i29) map.get(e4i1Var);
                    i29Var.getClass();
                    e4i1Var.x(j(rectA, i29Var.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.c2d
    public final l3d a() {
        return this.P0;
    }

    public final void b(Collection collection) {
        synchronized (this.X) {
            try {
                this.a.h(this.t);
                n3d n3dVar = this.b;
                if (n3dVar != null) {
                    n3dVar.h(this.t);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f);
                linkedHashSet.addAll(collection);
                try {
                    B(linkedHashSet, this.b != null);
                } catch (IllegalArgumentException e) {
                    throw new CameraUseCaseAdapter.CameraException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.X) {
            try {
                if (!this.Y) {
                    if (!this.g.isEmpty()) {
                        this.a.h(this.t);
                        n3d n3dVar = this.b;
                        if (n3dVar != null) {
                            n3dVar.h(this.t);
                        }
                    }
                    this.a.m(this.g);
                    n3d n3dVar2 = this.b;
                    if (n3dVar2 != null) {
                        n3dVar2.m(this.g);
                    }
                    synchronized (this.X) {
                        try {
                            if (this.Z != null) {
                                this.a.c().d(this.Z);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = this.g.iterator();
                    while (it.hasNext()) {
                        ((e4i1) it.next()).o();
                    }
                    this.Y = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    public final e4i1 i(LinkedHashSet linkedHashSet, cfc1 cfc1Var) {
        boolean z;
        boolean z2;
        e4i1 e4i1VarQ;
        synchronized (this.X) {
            try {
                ArrayList<e4i1> arrayList = new ArrayList(linkedHashSet);
                if (cfc1Var != null) {
                    arrayList.add(cfc1Var);
                    arrayList.removeAll(cfc1Var.f23p.a);
                }
                synchronized (this.X) {
                    z = false;
                    z2 = ((Integer) this.t.h(x2d.q, 0)).intValue() == 1;
                }
                if (z2) {
                    boolean z3 = false;
                    boolean z4 = false;
                    for (e4i1 e4i1Var : arrayList) {
                        if ((e4i1Var instanceof law0) || (e4i1Var instanceof cfc1)) {
                            z4 = true;
                        } else if (e4i1Var instanceof pr70) {
                            z3 = true;
                        }
                    }
                    if (!z3 || z4) {
                        boolean z5 = false;
                        for (e4i1 e4i1Var2 : arrayList) {
                            if ((e4i1Var2 instanceof law0) || (e4i1Var2 instanceof cfc1)) {
                                z = true;
                            } else if (e4i1Var2 instanceof pr70) {
                                z5 = true;
                            }
                        }
                        if (!z || z5) {
                            e4i1VarQ = null;
                        } else {
                            e4i1 e4i1Var3 = this.N0;
                            e4i1VarQ = e4i1Var3 instanceof pr70 ? e4i1Var3 : q();
                        }
                    } else {
                        e4i1 e4i1Var4 = this.N0;
                        if (e4i1Var4 instanceof law0) {
                            e4i1VarQ = e4i1Var4;
                        } else {
                            rpv0 rpv0Var = new rpv0((byte) 3);
                            ((xdn0) rpv0Var.b).r(jrd1.r0, "Preview-Extra");
                            law0 law0VarD = rpv0Var.d();
                            law0VarD.C(new y4d());
                            e4i1VarQ = law0VarD;
                        }
                    }
                } else {
                    e4i1VarQ = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e4i1VarQ;
    }

    public final HashMap p(int i, l3d l3dVar, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        ic9 ic9Var;
        HashMap map2;
        Rect rectA;
        Iterator it;
        boolean z;
        ArrayList arrayList3 = new ArrayList();
        String strB = l3dVar.b();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            ic9Var = this.c;
            map2 = null;
            if (!zHasNext) {
                break;
            }
            e4i1 e4i1Var = (e4i1) it2.next();
            int iM = e4i1Var.f.m();
            i29 i29Var = e4i1Var.g;
            Size size = i29Var != null ? i29Var.a : null;
            a3d1 a3d1Var = (a3d1) ((HashMap) ic9Var.b).get(strB);
            k29 k29VarB = a3d1Var != null ? k29.b(i, iM, size, a3d1Var.i(iM)) : null;
            int iM2 = e4i1Var.f.m();
            i29 i29Var2 = e4i1Var.g;
            Size size2 = i29Var2 != null ? i29Var2.a : null;
            i29Var2.getClass();
            ey8 ey8Var = new ey8(k29VarB, iM2, size2, i29Var2.b, cfc1.F(e4i1Var), e4i1Var.g.d, (Range) e4i1Var.f.h(i4i1.F0, (Object) null));
            arrayList3.add(ey8Var);
            map4.put(ey8Var, e4i1Var);
            map3.put(e4i1Var, e4i1Var.g);
        }
        if (!arrayList.isEmpty()) {
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            try {
                rectA = this.a.c().a();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    e4i1 e4i1Var2 = (e4i1) it.next();
                    if (e4i1Var2 != null) {
                        if (e4i1Var2.f.g(i4i1.I0)) {
                            if (e4i1Var2.f.x() == k4i1.d) {
                                z = true;
                                break;
                            }
                        } else {
                            e4i1Var2.toString();
                        }
                    }
                }
            } catch (NullPointerException unused) {
                rectA = null;
            }
            lvc1 lvc1Var = new lvc1(l3dVar, rectA != null ? pfg1.d(rectA) : null);
            Iterator it3 = arrayList.iterator();
            boolean z2 = false;
            while (it3.hasNext()) {
                e4i1 e4i1Var3 = (e4i1) it3.next();
                HashMap map7 = map2;
                z4d z4dVar = (z4d) map.get(e4i1Var3);
                i4i1 i4i1VarL = e4i1Var3.l(l3dVar, z4dVar.a, z4dVar.b);
                map5.put(i4i1VarL, e4i1Var3);
                map6.put(i4i1VarL, lvc1Var.r(i4i1VarL));
                i4i1 i4i1Var = e4i1Var3.f;
                if (i4i1Var instanceof qbw0) {
                    z2 = ((qbw0) i4i1Var).t() == 2;
                }
                map2 = map7;
            }
            HashMap map8 = map2;
            it = arrayList.iterator();
            ic9Var.getClass();
            o0c.k("No new use cases to be bound.", !map6.isEmpty());
            a3d1 a3d1Var2 = (a3d1) ((HashMap) ic9Var.b).get(strB);
            if (a3d1Var2 == null) {
                hhg1.n(l1d.m("No such camera id in supported combination list: ", strB));
                return map8;
            }
            Pair pairG = a3d1Var2.g(i, arrayList3, map6, z2, z);
            for (Map.Entry entry : map5.entrySet()) {
                map3.put((e4i1) entry.getValue(), (i29) ((Map) pairG.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairG.second).entrySet()) {
                if (map4.containsKey(entry2.getKey())) {
                    map3.put((e4i1) map4.get(entry2.getKey()), (i29) entry2.getValue());
                }
            }
        }
        return map3;
    }

    public final cfc1 r(LinkedHashSet linkedHashSet, boolean z) {
        boolean z2;
        synchronized (this.X) {
            try {
                HashSet<e4i1> hashSetV = v(linkedHashSet, z);
                if (hashSetV.size() < 2) {
                    x();
                    return null;
                }
                cfc1 cfc1Var = this.O0;
                if (cfc1Var != null && cfc1Var.f23p.a.equals(hashSetV)) {
                    cfc1 cfc1Var2 = this.O0;
                    Objects.requireNonNull(cfc1Var2);
                    return cfc1Var2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                for (e4i1 e4i1Var : hashSetV) {
                    for (int i = 0; i < 3; i++) {
                        int i2 = iArr[i];
                        Iterator it = e4i1Var.i().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            int iIntValue = ((Integer) it.next()).intValue();
                            if ((i2 & iIntValue) == iIntValue) {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            if (hashSet.contains(Integer.valueOf(i2))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i2));
                        }
                    }
                }
                return new cfc1(this.a, this.b, hashSetV, this.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.X) {
            try {
                if (this.Y) {
                    this.a.l(new ArrayList(this.g));
                    n3d n3dVar = this.b;
                    if (n3dVar != null) {
                        n3dVar.l(new ArrayList(this.g));
                    }
                    synchronized (this.X) {
                        c3d c3dVarC = this.a.c();
                        this.Z = c3dVarC.c();
                        c3dVarC.g();
                    }
                    this.Y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet v(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.X) {
            Iterator it = this.i.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            e4i1 e4i1Var = (e4i1) it2.next();
            o0c.k("Only support one level of sharing for now.", !(e4i1Var instanceof cfc1));
            Iterator it3 = e4i1Var.i().iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                if ((i & iIntValue) == iIntValue) {
                    hashSet.add(e4i1Var);
                    break;
                }
            }
        }
        return hashSet;
    }

    public final List w() {
        ArrayList arrayList;
        synchronized (this.X) {
            arrayList = new ArrayList(this.f);
        }
        return arrayList;
    }

    public final void x() {
        synchronized (this.X) {
            this.t.q();
        }
    }

    public final void z(ArrayList arrayList) {
        synchronized (this.X) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f);
            linkedHashSet.removeAll(arrayList);
            B(linkedHashSet, this.b != null);
        }
    }
}
