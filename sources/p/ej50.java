package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ej50 extends ari1 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e;
    public List f;
    public boolean g;
    public tw4 h;
    public iu30 i;
    public final gv20 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f29p;
    public float q;
    public float r;
    public boolean s;

    public ej50() {
        int i = u7h.l;
        this.e = nfb.p();
        int i2 = bui1.a;
        this.f = z6x.a;
        this.g = true;
        this.j = new gv20(this, (byte) 4);
        this.k = "";
        this.o = 1.0f;
        this.f29p = 1.0f;
        this.s = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.ari1
    public final void a(DrawScope drawScope) throws NoWhenBranchMatchedException {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = kch0.a();
                this.b = fArrA;
            } else {
                kch0.e(fArrA);
            }
            kch0.k(this.q + this.m, this.r + this.n, fArrA);
            kch0.h(this.l, fArrA);
            kch0.i(this.o, this.f29p, fArrA);
            kch0.k(-this.m, -this.n, fArrA);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                tw4 tw4VarA = this.h;
                if (tw4VarA == null) {
                    tw4VarA = ww4.a();
                    this.h = tw4VarA;
                }
                anm1.O(this.f, tw4VarA);
            }
            this.g = false;
        }
        cab cabVarA1 = drawScope.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            dg8 dg8VarV = cabVarA1.v();
            float[] fArr = this.b;
            if (fArr != null) {
                dg8VarV.y(fArr);
            }
            tw4 tw4Var = this.h;
            if (!this.f.isEmpty() && tw4Var != null) {
                dg8.j(dg8VarV, tw4Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ari1) arrayList.get(i)).a(drawScope);
            }
        } finally {
            i3a.n(cabVarA1, jU);
        }
    }

    @Override // p.ari1
    public final iu30 b() {
        return this.i;
    }

    @Override // p.ari1
    public final void d(gv20 gv20Var) {
        this.i = gv20Var;
    }

    public final void e(int i, ari1 ari1Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, ari1Var);
        } else {
            arrayList.add(ari1Var);
        }
        g(ari1Var);
        ari1Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = bui1.a;
            if (u7h.g(j2) == u7h.g(j) && u7h.f(j2) == u7h.f(j) && u7h.d(j2) == u7h.d(j)) {
                return;
            }
            this.d = false;
            this.e = nfb.p();
        }
    }

    public final void g(ari1 ari1Var) {
        if (!(ari1Var instanceof w8s0)) {
            if (ari1Var instanceof ej50) {
                ej50 ej50Var = (ej50) ari1Var;
                if (ej50Var.d && this.d) {
                    f(ej50Var.e);
                    return;
                }
                this.d = false;
                int i = u7h.l;
                this.e = nfb.p();
                return;
            }
            return;
        }
        w8s0 w8s0Var = (w8s0) ari1Var;
        Brush brush = w8s0Var.b;
        if (this.d && brush != null) {
            if (brush instanceof n6a1) {
                f(((n6a1) brush).a);
            } else {
                this.d = false;
                int i2 = u7h.l;
                this.e = nfb.p();
            }
        }
        Brush brush2 = w8s0Var.g;
        if (this.d && brush2 != null) {
            if (brush2 instanceof n6a1) {
                f(((n6a1) brush2).a);
                return;
            }
            this.d = false;
            int i3 = u7h.l;
            this.e = nfb.p();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ari1 ari1Var = (ari1) arrayList.get(i);
            sb.append("\t");
            sb.append(ari1Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
