package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class jaa implements o2r {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public n3r d;

    public jaa(boolean z) {
        this.a = z;
    }

    @Override // p.o2r
    public final void a(yeg1 yeg1Var) {
        yeg1Var.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(yeg1Var)) {
            return;
        }
        arrayList.add(yeg1Var);
        this.c++;
    }

    public final void c(int i) {
        n3r n3rVar = this.d;
        String str = zoi1.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((yeg1) this.b.get(i2)).m(this, n3rVar, this.a, i);
        }
    }

    public final void i() {
        n3r n3rVar = this.d;
        String str = zoi1.a;
        for (int i = 0; i < this.c; i++) {
            ((yeg1) this.b.get(i)).e(this, n3rVar, this.a);
        }
        this.d = null;
    }

    public final void l(n3r n3rVar) {
        for (int i = 0; i < this.c; i++) {
            ((yeg1) this.b.get(i)).t(this, n3rVar, this.a);
        }
    }

    public final void m(n3r n3rVar) {
        this.d = n3rVar;
        for (int i = 0; i < this.c; i++) {
            ((yeg1) this.b.get(i)).j(this, n3rVar, this.a);
        }
    }
}
