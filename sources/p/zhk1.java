package p;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zhk1 implements c7r0 {
    public var0 Y;
    public final i8h1 a;
    public final l6h1 b;
    public final n7h1 c;
    public final fkk1 d;
    public final boolean e;
    public final w7u0 f;
    public View h;
    public final m2r0 g = new m2r0();
    public final bpb1 i = gio1.b((Object) null);
    public final ben0 t = new ben0();
    public final bpb1 X = gio1.b((Object) null);

    public zhk1(i8h1 i8h1Var, l6h1 l6h1Var, wnh1 wnh1Var, fkk1 fkk1Var, iac0 iac0Var, boolean z, w7u0 w7u0Var) {
        this.a = i8h1Var;
        this.b = l6h1Var;
        this.c = wnh1Var;
        this.d = fkk1Var;
        this.e = z;
        this.f = w7u0Var;
        fkk1Var.a().f(iac0Var, new qpj0(this, (byte) 15));
    }

    public static m511 f(Rect rect) {
        m511 m511Var = new m511(rect.left, rect.top, rect.right, rect.bottom);
        j0p1.p();
        if (m511Var.equals(m511.e)) {
            return null;
        }
        return m511Var;
    }

    @Override // p.c7r0
    public final void a(upn1 upn1Var) {
        if (upn1Var instanceof m7r0) {
            c(((m7r0) upn1Var).c);
            return;
        }
        if (upn1Var instanceof l7r0) {
            c(((l7r0) upn1Var).c);
            return;
        }
        if (upn1Var instanceof n7r0) {
            this.h = null;
            this.g.g();
            return;
        }
        if (upn1Var instanceof k7r0) {
            boolean z = ((k7r0) upn1Var).c;
            Boolean boolValueOf = Boolean.valueOf(z);
            bpb1 bpb1Var = this.i;
            if (boolValueOf.equals(bpb1Var.getValue())) {
                return;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z);
            bpb1Var.getClass();
            bpb1Var.m(null, boolValueOf2);
            this.t.c(z);
        }
    }

    public final void c(View view) {
        if (view == null) {
            return;
        }
        this.h = view;
        Rect rect = (Rect) this.d.a().e();
        m511 m511VarF = rect != null ? f(rect) : null;
        m2r0 m2r0Var = this.g;
        m2r0Var.j(m511VarF);
        m2r0Var.i(view);
        op80 op80VarK = j6p1.k(j6p1.k(j6p1.k(j6p1.k(new jp80(m2r0Var), new eq80(new e3h1(this.b, this.c, this.a))), new g6r0(q601.b(f5p1.n(this.i)), this.t)), new xir0(q601.b(f5p1.n(this.X)), this.f)), new lhp0(new otu((byte) 15)));
        if (this.e) {
            op80VarK = j6p1.k(op80VarK, new r601(true));
            var0 var0Var = this.Y;
            if (var0Var != null) {
                op80VarK = j6p1.k(op80VarK, new uar0(var0Var));
            }
        }
        xhk1.c(view, op80VarK);
    }

    @Override // p.c7r0
    public final Bundle d() {
        return null;
    }

    @Override // p.c7r0
    public final void dispose() {
        this.h = null;
        this.g.g();
    }

    @Override // p.c7r0
    public final void e(vir0 vir0Var) {
        bpb1 bpb1Var = this.X;
        bpb1Var.getClass();
        bpb1Var.m(null, vir0Var);
    }

    @Override // p.c7r0
    public final void b(Bundle bundle) {
    }
}
