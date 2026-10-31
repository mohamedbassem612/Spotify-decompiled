package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class isi1 extends fba {
    public final Object i;

    public isi1(Object obj, j2e0 j2e0Var) {
        super(Collections.EMPTY_LIST);
        j(j2e0Var);
        this.i = obj;
    }

    @Override // p.fba
    public final float b() {
        return 1.0f;
    }

    @Override // p.fba
    public final Object e() {
        j2e0 j2e0Var = this.e;
        Object obj = this.i;
        float f = this.d;
        return j2e0Var.j(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // p.fba
    public final Object f(sua0 sua0Var, float f) {
        return e();
    }

    @Override // p.fba
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // p.fba
    public final void i(float f) {
        this.d = f;
    }
}
