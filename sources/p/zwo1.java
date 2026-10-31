package p;

import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zwo1 {
    public final yuo1 a;
    public final den1 b;
    public final swo1 c;
    public final String d = UUID.randomUUID().toString();
    public long e = 10000;

    public zwo1(yuo1 yuo1Var, den1 den1Var, swo1 swo1Var) {
        this.a = yuo1Var;
        this.b = den1Var;
        this.c = swo1Var;
    }

    public final swo1 a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nwo1 nwo1Var, onm onmVar) {
        vwo1 vwo1Var;
        if (onmVar instanceof vwo1) {
            vwo1Var = (vwo1) onmVar;
            int i = vwo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vwo1Var.c = i - Integer.MIN_VALUE;
            } else {
                vwo1Var = new vwo1(this, onmVar);
            }
        } else {
            vwo1Var = new vwo1(this, onmVar);
        }
        Object obj = vwo1Var.a;
        int i2 = vwo1Var.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            vwo1Var.c = 1;
            Object objA = nwo1Var.a(this, vwo1Var);
            d9n d9nVar = d9n.a;
            return objA == d9nVar ? d9nVar : rih1Var;
        } catch (Exception unused) {
        }
    }

    public final void c(zkn1 zkn1Var, vkn1 vkn1Var) {
        String str = this.c.c;
        yuo1 yuo1Var = this.a;
        if (vkn1Var != null) {
            yuo1Var.getClass();
            zkn1Var.d();
            ((aln1) zkn1Var.b).J(vkn1Var);
        }
        Iterator it = yuo1Var.c.b.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                bhn0.d();
                return;
            } else {
                zkn1Var.d();
                ((aln1) zkn1Var.b).M(0);
            }
        }
        lnm lnmVar = null;
        if (((aln1) zkn1Var.b).B()) {
            ConcurrentHashMap concurrentHashMap = eho1.a;
            int iC = ((aln1) zkn1Var.b).C();
            gin1 gin1VarX = ((aln1) zkn1Var.b).x();
            gkn1.a(gin1VarX);
            eho1.a(iC + 20000, Math.addExact(Math.multiplyExact(gin1VarX.x(), 1000L), gin1VarX.y() / 1000000) * 1000);
        } else {
            ConcurrentHashMap concurrentHashMap2 = eho1.a;
            int iP = ((aln1) zkn1Var.b).P();
            gin1 gin1VarX2 = ((aln1) zkn1Var.b).x();
            gkn1.a(gin1VarX2);
            long jAddExact = Math.addExact(Math.multiplyExact(gin1VarX2.x(), 1000L), gin1VarX2.y() / 1000000) * 1000;
            if (iP == 1) {
                xin1.a();
                throw null;
            }
            eho1.a(iP + 9998, jAddExact);
        }
        gln1 gln1VarE = yuo1Var.b.e(str);
        zkn1Var.d();
        ((aln1) zkn1Var.b).K(gln1VarE);
        aon1 aon1VarA = bon1.A();
        aon1VarA.d();
        ((bon1) aon1VarA.b).B((aln1) zkn1Var.e());
        bon1 bon1Var = (bon1) aon1VarA.e();
        fqn1 fqn1Var = yuo1Var.a;
        fn31.T(((qeh1) fqn1Var.d).a(), (o8n) null, 0, new zdm1(fqn1Var, bon1Var, lnmVar, (byte) 5), 3);
    }

    public final Object d(int i, Integer num, vu30 vu30Var, a8d1 a8d1Var) {
        return new nwo1(i, vu30Var, num).a(this, a8d1Var);
    }
}
