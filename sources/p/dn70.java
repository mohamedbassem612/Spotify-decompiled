package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dn70 implements rjp0 {
    public final /* synthetic */ l811 a;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ rjp0 c;

    public dn70(l811 l811Var, en70 en70Var, p811 p811Var, rjp0 rjp0Var) {
        this.a = l811Var;
        this.b = p811Var;
        this.c = rjp0Var;
    }

    public final void b(Object obj) {
        bn70 bn70Var;
        bn70 bn70Var2 = (bn70) obj;
        l811 l811Var = this.a;
        boolean z = l811Var.a;
        p811 p811Var = this.b;
        if (z && (((bn70Var = (bn70) p811Var.a) == null && bn70Var2 == null) || (bn70Var != null && bn70Var2 != null && u890.j(bn70Var.a, bn70Var2.a) && u890.j(bn70Var.b, bn70Var2.b)))) {
            p811Var.a = bn70Var2;
            return;
        }
        l811Var.a = true;
        p811Var.a = bn70Var2;
        this.c.b(bn70Var2);
    }
}
