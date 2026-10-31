package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w2o implements h0r0 {
    public final z7e0 a;
    public final l1o b;
    public final y2o c;
    public final q3b1 d;
    public final x290 e;
    public final o7r0 f;
    public final dg0 g;
    public final j7p h;
    public final ien0 i;
    public final cbr0 j;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public w2o(z7e0 z7e0Var, l1o l1oVar, y2o y2oVar, q3b1 q3b1Var, x290 x290Var, o7r0 o7r0Var, dg0 dg0Var, e5b0 e5b0Var, j7p j7pVar) throws NoWhenBranchMatchedException {
        p6r0 p6r0VarN;
        this.a = z7e0Var;
        this.b = l1oVar;
        this.c = y2oVar;
        this.d = q3b1Var;
        this.e = x290Var;
        this.f = o7r0Var;
        this.g = dg0Var;
        this.h = j7pVar;
        ien0 ien0Var = new ien0((Object) null);
        this.i = ien0Var;
        int iC = l1d.C(l1oVar.a());
        if (iC == 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarN = yon1.N();
        } else {
            if (iC != 1) {
                eg.o();
                throw null;
            }
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarN = yon1.Y();
        }
        Parcelable.Creator creator = lik1.CREATOR;
        this.j = new cbr0(new dbr0[]{new bn70(p6r0VarN, oap1.i(l1oVar.getUri()), (nar0) null), new a6o0(ien0Var), new t1r0(true), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    public final cbr0 a() {
        return this.j;
    }

    public final p2r0 b() {
        return z7e0.a(this.a, this.c, new fnn(this, (byte) 6));
    }

    public final void c(lzh lzhVar, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2068882578);
        int i2 = (x340Var.i(lzhVar) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            q7r0 q7r0VarG = ((cir0) x340Var.k(k2r0.a)).g();
            boolean zG = x340Var.g(q7r0VarG);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new j5t(q7r0VarG);
                x340Var.s0(objT);
            }
            b6r0 b6r0VarF = wro1.F((j5t) objT, this.f, this.g, this.h, x340Var);
            ebr0 ebr0VarA = lzhVar.a();
            Parcelable parcelableB = lzhVar.b();
            ecr0 ecr0VarE = b6r0VarF.e((xnn0) x340Var.k(aon0.a));
            phi0 phi0VarD = b6r0VarF.d();
            ezc ezcVarC = b6r0VarF.c();
            Function0 function0B = b6r0VarF.b();
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new h1m(this, (byte) 27);
                x340Var.s0(objT2);
            }
            fc11.d(ebr0VarA, parcelableB, ecr0VarE, phi0VarD, ezcVarC, function0B, (qim0) null, (vu30) objT2, x340Var, 1572864);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g1o(this, lzhVar, i, (byte) 1);
        }
    }
}
