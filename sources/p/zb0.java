package p;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zb0 extends vv71 {
    public yq71 a;
    public final hrr0 b;

    public zb0(yq71 yq71Var, n511 n511Var) {
        this.a = yq71Var;
        this.b = v8r.q(n511Var);
    }

    @Override // p.vv71
    public final vv71 a(xs71 xs71Var, yq71 yq71Var, long j, long j2, long j3) {
        Object obj;
        ua91 ua91Var = new ua91(j, Offset.f(j2, j3), j3);
        n511 n511VarC = c();
        if (n511VarC == null) {
            yq71 yq71Var2 = this.a;
            if (yq71Var2 == null) {
                List listB = xs71Var.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (xs71Var.c().contains((ys71) obj)) {
                        break;
                    }
                    i++;
                }
                ys71 ys71Var = (ys71) obj;
                yq71Var2 = ys71Var != null ? ys71Var.Z : null;
            }
            n511VarC = f4p1.s(xs71Var, yq71Var2);
            if (n511VarC == null) {
                n511VarC = anm1.g(j2, j);
            }
        }
        f4p1.w(ua91Var, j, j2, j3, true);
        return new yb0(ua91Var, yq71Var, n511VarC);
    }

    @Override // p.vv71
    public final boolean b() {
        return true;
    }

    @Override // p.vv71
    public final n511 c() {
        return (n511) this.b.getValue();
    }

    @Override // p.vv71
    public final ua91 e() {
        return null;
    }

    @Override // p.vv71
    public final n511 f(xs71 xs71Var) {
        Object obj;
        n511 n511VarC = c();
        if (n511VarC != null) {
            return n511VarC;
        }
        if (c() == null) {
            yq71 yq71Var = this.a;
            if (yq71Var == null) {
                List listB = xs71Var.b();
                int size = listB.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (xs71Var.c().contains((ys71) obj)) {
                        break;
                    }
                    i++;
                }
                ys71 ys71Var = (ys71) obj;
                yq71Var = ys71Var != null ? ys71Var.Z : null;
            }
            n511 n511VarS = f4p1.s(xs71Var, yq71Var);
            if (n511VarS != null) {
                this.b.setValue(n511VarS);
            }
        }
        return c();
    }

    @Override // p.vv71
    public final vv71 g(yq71 yq71Var) {
        if (this.a == null) {
            this.a = yq71Var;
        }
        return this;
    }

    @Override // p.vv71
    public final void i(n511 n511Var) {
        this.b.setValue(n511Var);
    }
}
