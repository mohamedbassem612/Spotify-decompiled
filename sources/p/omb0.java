package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class omb0 implements hfh0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ pmb0 e;
    public final /* synthetic */ vmb0 f;
    public final /* synthetic */ iu30 g;

    public omb0(int i, int i2, Map map, iu30 iu30Var, pmb0 pmb0Var, vmb0 vmb0Var, iu30 iu30Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = iu30Var;
        this.e = pmb0Var;
        this.f = vmb0Var;
        this.g = iu30Var2;
    }

    @Override // p.hfh0
    public final void a() {
        rh80 rh80Var;
        hmb0 hmb0Var = this.f.a;
        boolean zW = this.e.W();
        iu30 iu30Var = this.g;
        if (!zW || (rh80Var = ((sh80) hmb0Var.e1.d).F1) == null) {
            iu30Var.invoke(((sh80) hmb0Var.e1.d).P0);
        } else {
            iu30Var.invoke(rh80Var.P0);
        }
    }

    @Override // p.hfh0
    public final Map c() {
        return this.c;
    }

    @Override // p.hfh0
    public final iu30 e() {
        return this.d;
    }

    @Override // p.hfh0
    public final int getHeight() {
        return this.b;
    }

    @Override // p.hfh0
    public final int getWidth() {
        return this.a;
    }
}
