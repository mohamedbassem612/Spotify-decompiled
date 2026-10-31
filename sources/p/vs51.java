package p;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vs51 extends hab0 implements xu30 {
    public final /* synthetic */ c380 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs51(c380 c380Var, long j, long j2, iu30 iu30Var, Function0 function0, boolean z, long j3, float f, Function0 function1, boolean z2) {
        super(3);
        this.a = c380Var;
        this.b = j;
        this.c = j2;
        this.d = iu30Var;
        this.e = function0;
        this.f = z;
        this.g = j3;
        this.h = f;
        this.i = function1;
        this.t = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        Throwable th;
        long j;
        c380 c380VarA;
        int i;
        long j2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj2;
        float fM0 = ((wat) x340Var.k(t4k.h)).M0(hjl.i(((i2c) obj).b));
        c380 c380Var = this.a;
        boolean zG = x340Var.g(c380Var) | x340Var.f(this.b) | x340Var.d(fM0);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            if (!c380Var.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = c380Var.iterator();
                int i2 = 0;
                long j3 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    th = null;
                    j = 0;
                    long j4 = this.b;
                    if (!zHasNext) {
                        if (arrayList.size() > 1) {
                            blk1 blk1Var = (blk1) o7h.A0(arrayList);
                            if (((blk1Var.b - blk1Var.a) / j4) * fM0 < 8.0f) {
                                blk1 blk1Var2 = (blk1) l1d.i(2, arrayList);
                                blk1 blk1Var3 = new blk1(blk1Var2.a, j4, o7h.N0(blk1Var.c, blk1Var2.c), blk1Var2.d, true);
                                arrayList.remove(arrayList.size() - 1);
                                arrayList.set(arrayList.size() - 1, blk1Var3);
                            }
                        }
                        c380VarA = mqo1.A(arrayList);
                        break;
                    }
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    ps51 ps51Var = (ps51) next;
                    Iterator it2 = it;
                    float f = ((ps51Var.d - ps51Var.c) / j4) * fM0;
                    arrayList2.add(ps51Var);
                    boolean z = i2 == c380Var.size() - 1;
                    if (z || f >= 8.0f) {
                        if (!z) {
                            j4 = ((ps51) o7h.A0(arrayList2)).d;
                        }
                        long j5 = j4;
                        i = i3;
                        arrayList.add(new blk1(j3, j5, o7h.l1(arrayList2), arrayList.isEmpty(), z));
                        if (!z && i < c380Var.size()) {
                            arrayList2 = new ArrayList();
                            j3 = ((ps51) c380Var.get(i)).c;
                        }
                    } else {
                        i = i3;
                    }
                    i2 = i;
                    it = it2;
                }
            } else {
                c380VarA = mqo1.A(z6x.a);
                th = null;
                j = 0;
            }
            objT = v8r.q(c380VarA);
            x340Var.s0(objT);
        } else {
            th = null;
            j = 0;
        }
        ven0 ven0Var = (ven0) objT;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var, nim0Var);
        hzj.A.getClass();
        if (x340Var.a == null) {
            tgp1.p();
            throw th;
        }
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(hmb0.t1);
        } else {
            x340Var.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        boolean zIsEmpty = ((c380) ven0Var.getValue()).isEmpty();
        long j6 = this.b;
        long j7 = this.c;
        if (zIsEmpty || j6 <= j) {
            x340Var.i0(-541198457);
            j2 = j7;
            ft51.a(j2, j6, u291.h(anm1.N("nonSegmentedSeekbar", nim0Var), 16.0f), x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(-541439668);
            ft51.c((c380) ven0Var.getValue(), j6, u291.h(anm1.N("segmentedSeekbar", nim0Var), 16.0f), j7, x340Var, 0);
            j6 = j6;
            x340Var = x340Var;
            x340Var.r(false);
            j2 = j7;
        }
        iu30 iu30Var = this.d;
        boolean zG2 = x340Var.g(iu30Var);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new n601(iu30Var, (byte) 24);
            x340Var.s0(objT2);
        }
        iu30 iu30Var2 = (iu30) objT2;
        Function0 function0 = this.e;
        boolean zG3 = x340Var.g(function0);
        Object objT3 = x340Var.T();
        if (zG3 || objT3 == m4cVar) {
            objT3 = new us21(function0, (byte) 25);
            x340Var.s0(objT3);
        }
        x340 x340Var2 = x340Var;
        ft51.e(j2, j6, iu30Var2, (Function0) objT3, this.f, this.g, this.h, this.i, this.t, x340Var2, 0);
        x340Var2.r(true);
        return rih1.a;
    }
}
