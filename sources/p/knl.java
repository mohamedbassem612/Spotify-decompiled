package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class knl implements h0r0 {
    public final z7e0 a;
    public final nnl b;
    public final q3b1 c;
    public final o7r0 d;
    public final dg0 e;
    public final j7p f;
    public final ien0 g;
    public final cbr0 h;

    public knl(z7e0 z7e0Var, gnl gnlVar, nnl nnlVar, q3b1 q3b1Var, o7r0 o7r0Var, dg0 dg0Var, j7p j7pVar) {
        this.a = z7e0Var;
        this.b = nnlVar;
        this.c = q3b1Var;
        this.d = o7r0Var;
        this.e = dg0Var;
        this.f = j7pVar;
        ien0 ien0Var = new ien0((Object) null);
        this.g = ien0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarR1 = yon1.r1();
        Parcelable.Creator creator = lik1.CREATOR;
        this.h = new cbr0(new dbr0[]{new bn70(p6r0VarR1, oap1.i(gnlVar.getUri()), (nar0) null), new a6o0(ien0Var), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.h;
    }

    public final p2r0 b() {
        return z7e0.a(this.a, this.b, new v7l(this, (byte) 8));
    }

    public final void c(lzh lzhVar, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1452425579);
        int i2 = (x340Var.i(lzhVar) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            q7r0 q7r0VarG = ((cir0) x340Var.k(k2r0.a)).g();
            boolean zG = x340Var.g(q7r0VarG);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new k5t(q7r0VarG);
                x340Var.s0(objT);
            }
            b6r0 b6r0VarS = cgj1.s((k5t) objT, this.d, this.e, this.f, x340Var);
            ebr0 ebr0VarA = lzhVar.a();
            Parcelable parcelableB = lzhVar.b();
            ecr0 ecr0VarE = b6r0VarS.e((xnn0) x340Var.k(aon0.a));
            phi0 phi0VarD = b6r0VarS.d();
            ezc ezcVarC = b6r0VarS.c();
            Function0 function0B = b6r0VarS.b();
            boolean zI = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new boj(this, (byte) 28);
                x340Var.s0(objT2);
            }
            fc11.d(ebr0VarA, parcelableB, ecr0VarE, phi0VarD, ezcVarC, function0B, (qim0) null, (vu30) objT2, x340Var, 1572864);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(this, lzhVar, i, (byte) 13);
        }
    }
}
