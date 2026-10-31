package p;

import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fm61 extends ye30 {
    public final Object d;
    public final rt70 e;
    public final int f;
    public final int g;

    public fm61(zx70 zx70Var, Size size, rt70 rt70Var) {
        super(zx70Var);
        this.d = new Object();
        if (size == null) {
            this.f = this.b.getWidth();
            this.g = this.b.getHeight();
        } else {
            this.f = size.getWidth();
            this.g = size.getHeight();
        }
        this.e = rt70Var;
    }

    @Override // p.ye30, p.zx70
    public final rt70 Q0() {
        return this.e;
    }

    @Override // p.ye30, p.zx70
    public final int getHeight() {
        return this.g;
    }

    @Override // p.ye30, p.zx70
    public final int getWidth() {
        return this.f;
    }
}
