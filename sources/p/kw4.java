package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kw4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fv4(this, (byte) 20));

    public kw4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        kw4 kw4Var = (kw4) this.c.getValue();
        return kw4Var != null ? kw4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("use_new_attention_algorithm", "android-pagebound-attention", a()));
    }
}
