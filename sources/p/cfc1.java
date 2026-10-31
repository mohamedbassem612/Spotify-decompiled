package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cfc1 extends e4i1 {
    public wa61 A;
    public final dfc1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hjk1 f23p;
    public final xi20 q;
    public final xi20 r;
    public lvc1 s;
    public yjq t;
    public n3d1 u;
    public n3d1 v;
    public n3d1 w;
    public n3d1 x;
    public va61 y;
    public va61 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfc1(n3d n3dVar, n3d n3dVar2, HashSet hashSet, l4i1 l4i1Var) {
        super(G(hashSet));
        xi20 xi20Var = xi20.i;
        this.o = G(hashSet);
        this.q = xi20Var;
        this.r = xi20Var;
        this.f23p = new hjk1(n3dVar, n3dVar2, hashSet, l4i1Var, new uh61((byte) 24));
    }

    public static ArrayList F(e4i1 e4i1Var) {
        ArrayList arrayList = new ArrayList();
        if (!(e4i1Var instanceof cfc1)) {
            arrayList.add(e4i1Var.f.x());
            return arrayList;
        }
        Iterator it = ((cfc1) e4i1Var).f23p.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((e4i1) it.next()).f.x());
        }
        return arrayList;
    }

    public static dfc1 G(HashSet hashSet) {
        xdn0 xdn0VarD = xdn0.d();
        new c681(xdn0VarD);
        xdn0VarD.r(st70.K, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            e4i1 e4i1Var = (e4i1) it.next();
            if (e4i1Var.f.g(i4i1.I0)) {
                arrayList.add(e4i1Var.f.x());
            }
        }
        xdn0VarD.r(dfc1.b, arrayList);
        xdn0VarD.r(cx70.P, 2);
        return new dfc1(eqq0.b(xdn0VarD));
    }

    public final void B() {
        wa61 wa61Var = this.A;
        if (wa61Var != null) {
            wa61Var.b();
            this.A = null;
        }
        n3d1 n3d1Var = this.u;
        if (n3d1Var != null) {
            n3d1Var.b();
            this.u = null;
        }
        n3d1 n3d1Var2 = this.v;
        if (n3d1Var2 != null) {
            n3d1Var2.b();
            this.v = null;
        }
        n3d1 n3d1Var3 = this.w;
        if (n3d1Var3 != null) {
            n3d1Var3.b();
            this.w = null;
        }
        n3d1 n3d1Var4 = this.x;
        if (n3d1Var4 != null) {
            n3d1Var4.b();
            this.x = null;
        }
        lvc1 lvc1Var = this.s;
        if (lvc1Var != null) {
            ((rts) lvc1Var.b).release();
            w8p1.y(new v241(lvc1Var, (byte) 11));
            this.s = null;
        }
        yjq yjqVar = this.t;
        if (yjqVar != null) {
            ((e4d1) yjqVar.c).release();
            w8p1.y(new fss(yjqVar, (byte) 14));
            this.t = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List C(String str, String str2, i4i1 i4i1Var, i29 i29Var, i29 i29Var2) {
        boolean z;
        String str3 = "DualSurfaceProcessorNode";
        w8p1.m();
        hjk1 hjk1Var = this.f23p;
        if (i29Var2 == null) {
            D(str, str2, i4i1Var, i29Var, null);
            n3d n3dVarB = b();
            Objects.requireNonNull(n3dVarB);
            this.s = new lvc1(n3dVarB, new rts(i29Var.b));
            boolean z2 = this.i != null;
            n3d1 n3d1Var = this.w;
            int iP = ((cx70) this.f).p();
            hjk1Var.getClass();
            HashMap map = new HashMap();
            for (e4i1 e4i1Var : hjk1Var.a) {
                ht21 ht21Var = hjk1Var.X;
                n3d n3dVar = hjk1Var.f;
                hjk1 hjk1Var2 = hjk1Var;
                boolean z3 = z2;
                map.put(e4i1Var, hjk1Var2.p(e4i1Var, ht21Var, n3dVar, n3d1Var, iP, z3));
                z2 = z3;
                hjk1Var = hjk1Var2;
            }
            hjk1 hjk1Var3 = hjk1Var;
            lvc1 lvc1Var = this.s;
            n3d1 n3d1Var2 = this.w;
            ArrayList arrayList = new ArrayList(map.values());
            if (n3d1Var2 == null) {
                bhn0.i("Null surfaceEdge");
                return null;
            }
            lvc1Var.getClass();
            w8p1.m();
            lvc1Var.d = new jev();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o19 o19Var = (o19) it.next();
                jev jevVar = (jev) lvc1Var.d;
                Rect rect = o19Var.d;
                int i = o19Var.f;
                boolean z4 = o19Var.g;
                Matrix matrix = new Matrix(n3d1Var2.b);
                RectF rectF = new RectF(rect);
                Size size = o19Var.e;
                RectF rectF2 = pfg1.a;
                Iterator it2 = it;
                matrix.postConcat(pfg1.a(rectF, new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), i, z4));
                o0c.l(pfg1.c(pfg1.e(pfg1.d(rect), i), false, size));
                Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
                zwg zwgVarA = n3d1Var2.g.a();
                zwgVarA.a = size;
                jevVar.put(o19Var, new n3d1(o19Var.b, o19Var.c, zwgVarA.i(), matrix, false, rect2, n3d1Var2.i - i, -1, n3d1Var2.e != z4));
                it = it2;
            }
            try {
                ((rts) lvc1Var.b).b(n3d1Var2.c((n3d) lvc1Var.c, true));
            } catch (ProcessingException unused) {
                j2h1.q("SurfaceProcessorNode");
            }
            for (Map.Entry entry : ((jev) lvc1Var.d).entrySet()) {
                lvc1Var.b(n3d1Var2, entry);
                n3d1 n3d1Var3 = (n3d1) entry.getValue();
                vqh0 vqh0Var = new vqh0((Object) lvc1Var, (Object) n3d1Var2, (Object) entry, (byte) 13);
                n3d1Var3.getClass();
                w8p1.m();
                n3d1Var3.a();
                n3d1Var3.m.add(vqh0Var);
            }
            n3d1Var2.o.add(new jj5((jev) lvc1Var.d, (byte) 3));
            jev jevVar2 = (jev) lvc1Var.d;
            HashMap map2 = new HashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                map2.put((e4i1) entry2.getKey(), (n3d1) jevVar2.get(entry2.getValue()));
            }
            hjk1Var3.t(map2);
            Object[] objArr = {this.y.c()};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
            return Collections.unmodifiableList(arrayList2);
        }
        D(str, str2, i4i1Var, i29Var, i29Var2);
        Matrix matrix2 = this.j;
        n3d n3dVarH = h();
        Objects.requireNonNull(n3dVarH);
        boolean zN = n3dVarH.n();
        Size size2 = i29Var2.a;
        Rect rect3 = this.i;
        if (rect3 != null) {
            z = false;
        } else {
            z = false;
            rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        Rect rect4 = rect3;
        n3d n3dVarH2 = h();
        Objects.requireNonNull(n3dVarH2);
        int iG = g(n3dVarH2, z);
        n3d n3dVarH3 = h();
        Objects.requireNonNull(n3dVarH3);
        n3d1 n3d1Var4 = new n3d1(3, 34, i29Var2, matrix2, zN, rect4, iG, -1, k(n3dVarH3));
        this.v = n3d1Var4;
        Objects.requireNonNull(h());
        this.x = n3d1Var4;
        va61 va61VarE = E(this.v, i4i1Var, i29Var2);
        this.z = va61VarE;
        wa61 wa61Var = this.A;
        if (wa61Var != null) {
            wa61Var.b();
        }
        wa61 wa61Var2 = new wa61(new bfc1(this, str, str2, i4i1Var, i29Var, i29Var2));
        this.A = wa61Var2;
        va61VarE.f = wa61Var2;
        this.t = new yjq(b(), h(), new hev(i29Var.b, this.q, this.r));
        boolean z5 = this.i != null;
        n3d1 n3d1Var5 = this.w;
        n3d1 n3d1Var6 = this.x;
        int iP2 = ((cx70) this.f).p();
        hjk1Var.getClass();
        HashMap map3 = new HashMap();
        for (e4i1 e4i1Var2 : hjk1Var.a) {
            o19 o19VarP = hjk1Var.p(e4i1Var2, hjk1Var.X, hjk1Var.f, n3d1Var5, iP2, z5);
            ht21 ht21Var2 = hjk1Var.Y;
            n3d n3dVar2 = hjk1Var.g;
            Objects.requireNonNull(n3dVar2);
            map3.put(e4i1Var2, new p09(o19VarP, hjk1Var.p(e4i1Var2, ht21Var2, n3dVar2, n3d1Var6, iP2, z5)));
            n3d1Var5 = n3d1Var5;
        }
        yjq yjqVar = this.t;
        q09 q09Var = new q09(this.w, this.x, new ArrayList(map3.values()));
        yjqVar.getClass();
        e4d1 e4d1Var = (e4d1) yjqVar.c;
        w8p1.m();
        yjqVar.f = q09Var;
        yjqVar.e = new jev();
        q09 q09Var2 = (q09) yjqVar.f;
        n3d1 n3d1Var7 = q09Var2.a;
        n3d1 n3d1Var8 = q09Var2.b;
        Iterator it3 = q09Var2.c.iterator();
        while (it3.hasNext()) {
            p09 p09Var = (p09) it3.next();
            jev jevVar3 = (jev) yjqVar.e;
            o19 o19Var2 = p09Var.a;
            Rect rect5 = o19Var2.d;
            int i2 = o19Var2.f;
            boolean z6 = o19Var2.g;
            Matrix matrix3 = new Matrix();
            Size sizeE = pfg1.e(pfg1.d(rect5), i2);
            Size size3 = o19Var2.e;
            Iterator it4 = it3;
            o0c.l(pfg1.c(sizeE, false, size3));
            HashMap map4 = map3;
            String str4 = str3;
            Rect rect6 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
            zwg zwgVarA2 = n3d1Var7.g.a();
            zwgVarA2.a = size3;
            jevVar3.put(p09Var, new n3d1(o19Var2.b, o19Var2.c, zwgVarA2.i(), matrix3, false, rect6, n3d1Var7.i - i2, -1, n3d1Var7.e != z6));
            it3 = it4;
            map3 = map4;
            str3 = str4;
        }
        HashMap map5 = map3;
        String str5 = str3;
        try {
            e4d1Var.b(n3d1Var7.c((n3d) yjqVar.d, true));
        } catch (ProcessingException unused2) {
            j2h1.q(str5);
        }
        try {
            e4d1Var.b(n3d1Var8.c((n3d) yjqVar.b, false));
        } catch (ProcessingException unused3) {
            j2h1.q(str5);
        }
        n3d n3dVar3 = (n3d) yjqVar.d;
        n3d n3dVar4 = (n3d) yjqVar.b;
        for (Map.Entry entry3 : ((jev) yjqVar.e).entrySet()) {
            n3d1 n3d1Var9 = n3d1Var7;
            n3d1 n3d1Var10 = n3d1Var8;
            yjqVar.i(n3dVar3, n3dVar4, n3d1Var9, n3d1Var10, entry3);
            n3d1 n3d1Var11 = (n3d1) entry3.getValue();
            n3d n3dVar5 = n3dVar4;
            n3d n3dVar6 = n3dVar3;
            yjq yjqVar2 = yjqVar;
            iev ievVar = new iev(yjqVar2, n3dVar6, n3dVar5, n3d1Var9, n3d1Var10, entry3, (byte) 0);
            yjqVar = yjqVar2;
            n3dVar3 = n3dVar6;
            n3dVar4 = n3dVar5;
            n3d1Var11.getClass();
            w8p1.m();
            n3d1Var11.a();
            n3d1Var11.m.add(ievVar);
            n3d1Var7 = n3d1Var9;
            n3d1Var8 = n3d1Var10;
        }
        jev jevVar4 = (jev) yjqVar.e;
        HashMap map6 = new HashMap();
        for (Map.Entry entry4 : map5.entrySet()) {
            map6.put((e4i1) entry4.getKey(), (n3d1) jevVar4.get(entry4.getValue()));
        }
        hjk1Var.t(map6);
        Object[] objArr2 = {this.y.c(), this.z.c()};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i3 = 0; i3 < 2; i3++) {
            Object obj2 = objArr2[i3];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void D(String str, String str2, i4i1 i4i1Var, i29 i29Var, i29 i29Var2) {
        Matrix matrix = this.j;
        n3d n3dVarB = b();
        Objects.requireNonNull(n3dVarB);
        boolean zN = n3dVarB.n();
        Size size = i29Var.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        n3d n3dVarB2 = b();
        Objects.requireNonNull(n3dVarB2);
        int iG = g(n3dVarB2, false);
        n3d n3dVarB3 = b();
        Objects.requireNonNull(n3dVarB3);
        n3d1 n3d1Var = new n3d1(3, 34, i29Var, matrix, zN, rect, iG, -1, k(n3dVarB3));
        this.u = n3d1Var;
        Objects.requireNonNull(b());
        this.w = n3d1Var;
        va61 va61VarE = E(this.u, i4i1Var, i29Var);
        this.y = va61VarE;
        wa61 wa61Var = this.A;
        if (wa61Var != null) {
            wa61Var.b();
        }
        wa61 wa61Var2 = new wa61(new bfc1(this, str, str2, i4i1Var, i29Var, i29Var2));
        this.A = wa61Var2;
        va61VarE.f = wa61Var2;
    }

    public final va61 E(n3d1 n3d1Var, i4i1 i4i1Var, i29 i29Var) {
        va61 va61VarD = va61.d(i4i1Var, i29Var.a);
        vnd vndVar = va61VarD.b;
        hjk1 hjk1Var = this.f23p;
        Iterator it = hjk1Var.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((bb61) ((e4i1) it.next()).f.e(i4i1.A0)).g.c;
            List list = bb61.i;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            vndVar.b = i;
        }
        Size size = i29Var.a;
        Iterator it2 = hjk1Var.a.iterator();
        while (it2.hasNext()) {
            bb61 bb61VarC = va61.d(((e4i1) it2.next()).f, size).c();
            wnd wndVar = bb61VarC.g;
            vndVar.a(wndVar.d);
            List<d2d> list2 = bb61VarC.e;
            ArrayList arrayList = va61VarD.e;
            for (d2d d2dVar : list2) {
                vndVar.b(d2dVar);
                if (!arrayList.contains(d2dVar)) {
                    arrayList.add(d2dVar);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : bb61VarC.d) {
                ArrayList arrayList2 = va61VarD.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : bb61VarC.c) {
                ArrayList arrayList3 = va61VarD.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            vndVar.i(wndVar.b);
        }
        n3d1Var.getClass();
        w8p1.m();
        n3d1Var.a();
        o0c.q("Consumer can only be linked once.", !n3d1Var.j);
        n3d1Var.j = true;
        va61VarD.b(n3d1Var.l, i29Var.b, -1);
        vndVar.b(hjk1Var.h);
        qsk qskVar = i29Var.d;
        if (qskVar != null) {
            vndVar.i(qskVar);
        }
        return va61VarD;
    }

    @Override // p.e4i1
    public final i4i1 e(boolean z, l4i1 l4i1Var) {
        dfc1 dfc1Var = this.o;
        qsk qskVarA = l4i1Var.a(dfc1Var.x(), 1);
        if (z) {
            qskVarA = qsk.B(qskVarA, dfc1Var.a);
        }
        if (qskVarA == null) {
            return null;
        }
        return j(qskVarA).h();
    }

    @Override // p.e4i1
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // p.e4i1
    public final h4i1 j(qsk qskVar) {
        return new c681(xdn0.n(qskVar));
    }

    @Override // p.e4i1
    public final void p() {
        hjk1 hjk1Var = this.f23p;
        for (e4i1 e4i1Var : hjk1Var.a) {
            gjk1 gjk1Var = (gjk1) hjk1Var.c.get(e4i1Var);
            Objects.requireNonNull(gjk1Var);
            e4i1Var.a(gjk1Var, null, null, e4i1Var.e(true, hjk1Var.e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0197  */
    @Override // p.e4i1
    public final i4i1 r(l3d l3dVar, h4i1 h4i1Var) {
        Object objE;
        liv livVar;
        List arrayList;
        ft21 ft21Var;
        xdn0 xdn0VarE = h4i1Var.e();
        hjk1 hjk1Var = this.f23p;
        HashSet hashSet = hjk1Var.i;
        ht21 ht21Var = hjk1Var.X;
        l3d l3dVar2 = ht21Var.f;
        List listG = l3dVar2.g(34);
        HashSet<i4i1> hashSet2 = ht21Var.d;
        for (i4i1 i4i1Var : hashSet2) {
            if (!((Boolean) i4i1Var.h(i4i1.H0, Boolean.FALSE)).booleanValue() && (i4i1Var instanceof cx70) && (ft21Var = (ft21) ((cx70) i4i1Var).h(cx70.U, (Object) null)) != null && ft21Var.c) {
                ArrayList arrayList2 = new ArrayList(listG);
                arrayList2.addAll(l3dVar2.e(34));
                listG = arrayList2;
                break;
            }
        }
        sy8 sy8Var = cx70.T;
        xdn0VarE.getClass();
        try {
            objE = xdn0VarE.e(sy8Var);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        List list = (List) objE;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).equals(34)) {
                    arrayList = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
            listG = arrayList;
        }
        Rational rational = ht21Var.c;
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet3 = new HashSet();
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            hashSet3.addAll(ht21Var.b((i4i1) it2.next()));
        }
        Iterator it3 = hashSet3.iterator();
        while (it3.hasNext()) {
            if (!g57.a(rational, (Size) it3.next())) {
                arrayList3.addAll(ht21Var.f(ht21Var.b, listG, false));
                break;
            }
        }
        arrayList3.addAll(ht21Var.f(rational, listG, false));
        arrayList3.addAll(ht21Var.e(listG, false));
        if (arrayList3.isEmpty()) {
            j2h1.M("ResolutionsMerger");
            arrayList3.addAll(ht21Var.e(listG, true));
        }
        arrayList3.toString();
        j2h1.o("ResolutionsMerger");
        xdn0VarE.r(cx70.V, arrayList3);
        sy8 sy8Var2 = i4i1.E0;
        Iterator it4 = hashSet.iterator();
        int iMax = 0;
        while (it4.hasNext()) {
            iMax = Math.max(iMax, ((Integer) ((i4i1) it4.next()).h(i4i1.E0, 0)).intValue());
        }
        xdn0VarE.r(sy8Var2, Integer.valueOf(iMax));
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            liv livVar2 = (liv) ((i4i1) it5.next()).h(st70.L, liv.c);
            livVar2.getClass();
            arrayList4.add(livVar2);
        }
        if (arrayList4.isEmpty()) {
            livVar = null;
            break;
        }
        liv livVar3 = (liv) arrayList4.get(0);
        Integer numValueOf = Integer.valueOf(livVar3.a);
        Integer numValueOf2 = Integer.valueOf(livVar3.b);
        int i = 1;
        while (true) {
            if (i >= arrayList4.size()) {
                livVar = new liv(numValueOf.intValue(), numValueOf2.intValue());
                break;
            }
            liv livVar4 = (liv) arrayList4.get(i);
            Integer numValueOf3 = Integer.valueOf(livVar4.a);
            if (numValueOf.equals(0)) {
                numValueOf = numValueOf3;
            } else if (!numValueOf3.equals(0)) {
                if (numValueOf.equals(2) && !numValueOf3.equals(1)) {
                    numValueOf = numValueOf3;
                } else if ((!numValueOf3.equals(2) || numValueOf.equals(1)) && !numValueOf.equals(numValueOf3)) {
                    numValueOf = null;
                }
            }
            Integer numValueOf4 = Integer.valueOf(livVar4.b);
            if (numValueOf2.equals(0)) {
                numValueOf2 = numValueOf4;
            } else if (!numValueOf4.equals(0) && !numValueOf2.equals(numValueOf4)) {
                numValueOf2 = null;
            }
            if (numValueOf == null || numValueOf2 == null) {
                livVar = null;
                break;
            }
            i++;
        }
        if (livVar == null) {
            hhg1.n("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return null;
        }
        xdn0VarE.r(st70.L, livVar);
        for (e4i1 e4i1Var : hjk1Var.a) {
            i4i1 i4i1Var2 = e4i1Var.f;
            sy8 sy8Var3 = i4i1.K0;
            if (((Integer) i4i1Var2.h(sy8Var3, 0)).intValue() != 0) {
                Integer num = (Integer) e4i1Var.f.h(sy8Var3, 0);
                num.intValue();
                xdn0VarE.r(sy8Var3, num);
            }
            if (e4i1Var.f.t() != 0) {
                xdn0VarE.r(i4i1.J0, Integer.valueOf(e4i1Var.f.t()));
            }
        }
        return h4i1Var.h();
    }

    @Override // p.e4i1
    public final void s() {
        for (e4i1 e4i1Var : this.f23p.a) {
            e4i1Var.s();
            e4i1Var.q();
        }
    }

    @Override // p.e4i1
    public final void t() {
        Iterator it = this.f23p.a.iterator();
        while (it.hasNext()) {
            ((e4i1) it.next()).t();
        }
    }

    @Override // p.e4i1
    public final i29 u(qsk qskVar) {
        this.y.a(qskVar);
        Object[] objArr = {this.y.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        A(Collections.unmodifiableList(arrayList));
        zwg zwgVarA = this.g.a();
        zwgVarA.d = qskVar;
        return zwgVarA.i();
    }

    @Override // p.e4i1
    public final i29 v(i29 i29Var, i29 i29Var2) {
        A(C(d(), h() == null ? null : h().g().b(), this.f, i29Var, i29Var2));
        m();
        return i29Var;
    }

    @Override // p.e4i1
    public final void w() {
        B();
        hjk1 hjk1Var = this.f23p;
        for (e4i1 e4i1Var : hjk1Var.a) {
            gjk1 gjk1Var = (gjk1) hjk1Var.c.get(e4i1Var);
            Objects.requireNonNull(gjk1Var);
            e4i1Var.z(gjk1Var);
        }
    }
}
