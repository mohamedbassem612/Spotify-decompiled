package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class pl70 {
    public static final qim0 a = u291.r(nim0.a, 24.0f);

    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    public static final void a(final jmr0 jmr0Var, qim0 qim0Var, final long j, b0k b0kVar, final int i, final int i2) {
        qim0 qim0Var2;
        int i3;
        final qim0 qim0Var3;
        qim0 qim0Var4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1142959010);
        int i4 = i | (x340Var.i(jmr0Var) ? 4 : 2);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.g(qim0Var2) ? SemanticState.Hidden : SemanticState.Focused);
        }
        int i6 = i3 | (x340Var.f(j) ? 2048 : SemanticState.ReadOnly);
        boolean z = true;
        if (x340Var.Y(i6 & 1, (i6 & 1171) != 1170)) {
            x340Var.d0();
            int i7 = i & 1;
            qim0 qim0Var5 = nim0.a;
            if (i7 != 0 && !x340Var.E()) {
                x340Var.b0();
            } else if (i5 != 0) {
                qim0Var2 = qim0Var5;
            }
            qim0 qim0Var6 = qim0Var2;
            x340Var.s();
            if ((((i6 & 7168) ^ 3072) <= 2048 || !x340Var.f(j)) && (i6 & 3072) != 2048) {
                z = false;
            }
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = z4h1.b(j, u7h.k) ? null : new f2b(j, 5);
                x340Var.s0(objT);
            }
            ColorFilter colorFilter = (ColorFilter) objT;
            x340Var.i0(609378564);
            x340Var.r(false);
            if (Size.c(jmr0Var.i(), 9205357640488583168L)) {
                qim0Var4 = a;
            } else {
                long jI = jmr0Var.i();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jI & 4294967295L)))) {
                    qim0Var4 = a;
                } else {
                    qim0Var4 = qim0Var5;
                }
            }
            t1c.a(xyn1.s(qim0Var6.then(qim0Var4), jmr0Var, (tl3) null, mif1.Q0, 0.0f, colorFilter, 22).then(qim0Var5), x340Var, 0);
            qim0Var3 = qim0Var6;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30(jmr0Var, qim0Var3, j, i, i2) { // from class: p.fl70
                public final /* synthetic */ jmr0 a;
                public final /* synthetic */ qim0 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ byte d;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.d = i2;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(57);
                    pl70.a(this.a, this.b, this.c, (b0k) obj, iP, this.d);
                    return rih1.a;
                }
            };
        }
    }
}
