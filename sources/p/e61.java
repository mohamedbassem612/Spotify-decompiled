package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e61 extends hab0 implements xu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ float c;
    public final /* synthetic */ gdx d;
    public final /* synthetic */ lee1 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ nl3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(int i, List list, float f, gdx gdxVar, lee1 lee1Var, qim0 qim0Var, nl3 nl3Var) {
        super(3);
        this.a = i;
        this.b = list;
        this.c = f;
        this.d = gdxVar;
        this.e = lee1Var;
        this.f = qim0Var;
        this.g = nl3Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        List list;
        boolean zBooleanValue;
        Object obj4;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        i2c i2cVar = (i2c) obj;
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        int i = 0;
        float f = this.c;
        List list2 = this.b;
        boolean z2 = true;
        int i2 = this.a;
        if (i2 == 2) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1493164438);
            x340Var.r(false);
            b0kVar = b0kVar;
            list = list2;
        } else {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-602353827);
            if (i2 == 1) {
                x340Var2.i0(-602351874);
                int i3 = hjl.i(i2cVar.b);
                List<w51> list3 = list2;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                for (w51 w51Var : list3) {
                    arrayList.add(new mmr0(w51Var.a, Boolean.valueOf(w51Var.b)));
                    i = 0;
                    z2 = true;
                }
                yae1 yae1VarQ = d5p1.q(i, x340Var2, z2 ? 1 : 0);
                wat watVar = (wat) x340Var2.k(t4k.h);
                gdx gdxVar = this.d;
                vzq0 vzq0Var = gdxVar.a;
                flb0 flb0Var = flb0.a;
                list = list2;
                float fC = gdxVar.a.c(flb0Var) + vzq0Var.b(flb0Var);
                float f2 = gdxVar.d + gdxVar.e;
                boolean zG = x340Var2.g(arrayList) | x340Var2.e(i3) | x340Var2.d(f) | x340Var2.g(watVar) | x340Var2.g(yae1VarQ);
                lee1 lee1Var = this.e;
                boolean zG2 = zG | x340Var2.g(lee1Var);
                Object objT = x340Var2.T();
                if (zG2 || objT == fkj0.X) {
                    obj4 = objT;
                    Iterator it = arrayList.iterator();
                    int iI0 = 0;
                    while (it.hasNext()) {
                        mmr0 mmr0Var = (mmr0) it.next();
                        Iterator it2 = it;
                        iI0 = watVar.i0(fC) + ((int) (yae1.a(yae1VarQ, (String) mmr0Var.a, lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32)) + (((Boolean) mmr0Var.b).booleanValue() ? watVar.i0(f2) : 0) + iI0;
                        it = it2;
                    }
                    Boolean boolValueOf = Boolean.valueOf(((list.size() - 1) * watVar.i0(f)) + iI0 <= i3);
                    x340Var2.s0(boolValueOf);
                    obj4 = boolValueOf;
                }
                obj4 = objT;
                zBooleanValue = ((Boolean) obj4).booleanValue();
                z = false;
                x340Var2.r(false);
            } else {
                z = false;
                list = list2;
                x340Var2.i0(-1493037673);
                x340Var2.r(false);
                zBooleanValue = false;
            }
            x340Var2.r(z);
            z2 = zBooleanValue;
        }
        n4k n4kVar = hmb0.t1;
        nl3 nl3Var = this.g;
        qim0 qim0Var = this.f;
        if (z2) {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(-1492924735);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(new d36(f, true, new g21(nl3Var, (byte) 29)), een.N0, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarF);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(jw31VarA, x340Var3, lljVar4);
            nko1.H(xos0VarM, x340Var3, lljVar3);
            x0d.q(iHashCode, x340Var3, lljVar2, x340Var3);
            nko1.H(qim0VarE, x340Var3, lljVar);
            x340Var3.i0(-99915031);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((w51) it3.next()).c.invoke(x340Var3, 0);
            }
            us71.m(x340Var3, false, true, false);
        } else {
            x340 x340Var4 = (x340) b0kVar;
            x340Var4.i0(-1492651098);
            qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(new d36(f, true, new um5(false)), nl3Var, x340Var4, 0);
            int iHashCode2 = Long.hashCode(x340Var4.T);
            xos0 xos0VarM2 = x340Var4.m();
            qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarF2);
            hzj.A.getClass();
            if (x340Var4.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var4.m0();
            if (x340Var4.S) {
                x340Var4.l(n4kVar);
            } else {
                x340Var4.v0();
            }
            nko1.H(mbhVarA, x340Var4, lljVar4);
            nko1.H(xos0VarM2, x340Var4, lljVar3);
            x0d.q(iHashCode2, x340Var4, lljVar2, x340Var4);
            nko1.H(qim0VarE2, x340Var4, lljVar);
            x340Var4.i0(-1779165884);
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ((w51) it4.next()).c.invoke(x340Var4, 0);
            }
            us71.m(x340Var4, false, true, false);
        }
        return rih1.a;
    }
}
