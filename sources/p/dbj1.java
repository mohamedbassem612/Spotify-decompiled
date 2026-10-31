package p;

import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dbj1 implements uaj1 {
    public final ia00 X;
    public final psw Y;
    public final op0 a;
    public final g9c0 b;
    public final qaj1 c;
    public final fv0 d;
    public final gw70 e;
    public final boolean f;
    public final fv0 g;
    public final bzs h;
    public final e7m0 i;
    public final h44 t;

    public dbj1(hcj1 hcj1Var, y3q y3qVar, z3q z3qVar, op0 op0Var, a4q a4qVar, av0 av0Var, i44 i44Var, g9c0 g9c0Var, qaj1 qaj1Var, fv0 fv0Var, gw70 gw70Var) {
        q9j1 q9j1Var;
        this.a = op0Var;
        this.b = g9c0Var;
        this.c = qaj1Var;
        this.d = fv0Var;
        this.e = gw70Var;
        paj1 paj1Var = qaj1Var.c;
        this.f = paj1Var != paj1.c;
        fv0 fv0Var2 = qaj1Var.g;
        this.g = fv0Var2 == null ? fv0Var : fv0Var2;
        bzs bzsVar = new bzs();
        this.h = bzsVar;
        t7i1 t7i1Var = new t7i1(hcj1Var, (byte) 2);
        switch (y3qVar.a) {
            case 0:
                thq thqVar = y3qVar.b;
                daq daqVar = thqVar.b;
                q8n q8nVar = (q8n) daqVar.V2.get();
                v5q v5qVar = thqVar.c;
                q9j1Var = new q9j1(qaj1Var, bzsVar, q8nVar, v5qVar.a(), (pxc) v5qVar.f5.get(), (ao0) daqVar.Hk.get());
                break;
            case 1:
                r7q r7qVar = y3qVar.b;
                daq daqVar2 = r7qVar.b;
                q8n q8nVar2 = (q8n) daqVar2.V2.get();
                s7q s7qVar = r7qVar.d;
                q9j1Var = new q9j1(qaj1Var, bzsVar, q8nVar2, s7qVar.d(), (pxc) s7qVar.Eh.get(), (ao0) daqVar2.Hk.get());
                break;
            default:
                r7q r7qVar2 = y3qVar.b;
                daq daqVar3 = r7qVar2.b;
                q8n q8nVar3 = (q8n) daqVar3.V2.get();
                teq teqVar = r7qVar2.d;
                q9j1Var = new q9j1(qaj1Var, bzsVar, q8nVar3, teqVar.b(), (pxc) teqVar.t7.get(), (ao0) daqVar3.Hk.get());
                break;
        }
        this.i = sbl.B(ddj1.a, t7i1Var, q9j1Var, new lda1(2, hcj1Var, hcj1.class, "onProps", "onProps(Lcom/spotify/adsdisplay/element/video/VideoAdElement$Props;Lcom/spotify/adsdisplay/elementimpl/video/mobius/domain/VideoAdState;)Lcom/spotify/mobius/Next;", 0, (byte) 9), new jyi1(a4qVar, this, hcj1Var, (byte) 2));
        h44 h44VarG = i44Var.g();
        this.t = h44VarG;
        xr6 xr6Var = dcj1.a;
        this.X = dcj1.a(paj1Var, h44VarG != h44.b);
        j2i j2iVar = new j2i(-237464989, new cbj1(this, z3qVar, av0Var), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
    }

    public static final bcu0 j(dbj1 dbj1Var, edj1 edj1Var, x340 x340Var) {
        Object obj = fkj0.X;
        x340Var.i0(1069826715);
        qaj1 qaj1Var = dbj1Var.c;
        uoa uoaVar = qaj1Var.f;
        if (uoaVar != null) {
            x340Var.i0(-1744503997);
            boolean zI = x340Var.i(uoaVar);
            Object objT = x340Var.T();
            if (zI || objT == obj) {
                objT = new cu0(uoaVar, (byte) 7);
                x340Var.s0(objT);
            }
            qxd0.i(uoaVar, (iu30) objT, x340Var);
            boolean zI2 = x340Var.i(uoaVar);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == obj) {
                objT2 = new yaj1(uoaVar, (byte) 1);
                x340Var.s0(objT2);
            }
            bcu0 bcu0Var = (bcu0) objT2;
            x340Var.r(false);
            x340Var.r(false);
            return bcu0Var;
        }
        x340Var.i0(-1744254137);
        x340Var.r(false);
        woa woaVarA = dbj1Var.b.a(qaj1Var.e);
        Object objT3 = x340Var.T();
        if (objT3 == obj) {
            objT3 = new bw91();
            x340Var.s0(objT3);
        }
        bw91 bw91Var = (bw91) objT3;
        if (edj1Var instanceof ddj1) {
            bw91Var.getClass();
            d9 d9Var = pv91.r(bw91Var.a, bw91Var).c;
            bw91Var.clear();
            ListIterator listIterator = d9Var.listIterator(0);
            while (listIterator.hasNext()) {
                uoa uoaVar2 = (uoa) listIterator.next();
                uoaVar2.f();
                woaVarA.c(uoaVar2);
            }
        }
        boolean zI3 = x340Var.i(woaVarA) | x340Var.i(dbj1Var) | x340Var.i(bw91Var);
        Object objT4 = x340Var.T();
        if (zI3 || objT4 == obj) {
            objT4 = new bbj1(woaVarA, dbj1Var, bw91Var);
            x340Var.s0(objT4);
        }
        bcu0 bcu0Var2 = (bcu0) objT4;
        x340Var.r(false);
        return bcu0Var2;
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Y;
    }

    public final mqw getBehavior() {
        return this.i;
    }
}
