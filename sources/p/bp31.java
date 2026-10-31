package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class bp31 implements o2q0, iv30 {
    public final /* synthetic */ cp31 a;

    public bp31(cp31 cp31Var) {
        this.a = cp31Var;
    }

    public final void b(String str, zf30 zf30Var) {
        tac0 tac0Var;
        cp31 cp31Var = this.a;
        ((cxn0) cp31Var.a).b(str, zf30Var);
        q2g0 q2g0Var = (q2g0) cp31Var.c;
        ek2 ek2Var = q2g0Var.d;
        if (q2g0Var.a.k() instanceof a6w0) {
            zf30 zf30Var2 = q2g0Var.c;
            if (zf30Var2 != null && (tac0Var = zf30Var2.s1) != null) {
                tac0Var.d(ek2Var);
            }
            q2g0Var.c = zf30Var;
            boolean z = zf30Var instanceof bbr0;
            q2g0Var.b.b(z ? (bbr0) zf30Var : null);
            if (z) {
                zf30Var.s1.a(ek2Var);
            }
        }
        ((k1c0) cp31Var.b).b(str, zf30Var);
        ((qmo) cp31Var.d).b(str, zf30Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o2q0) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return new tv30(2, this.a, cp31.class, "onCurrentFragmentChanged", "onCurrentFragmentChanged(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
