package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n441 implements Iterator, q441 {
    public o441 a;
    public o441 b;

    @Override // p.q441
    public final void a(o441 o441Var) {
        o441 o441Var2 = this.a;
        o441 o441Var3 = null;
        if (o441Var2 == o441Var && o441Var == this.b) {
            this.b = null;
            this.a = null;
            o441Var2 = null;
        }
        o441 o441Var4 = o441Var2;
        if (o441Var2 == o441Var) {
            o441Var4 = o441Var2.d;
            this.a = o441Var4;
        }
        o441 o441Var5 = this.b;
        if (o441Var5 == o441Var) {
            if (o441Var5 != o441Var4 && o441Var4 != null) {
                o441Var3 = o441Var5.c;
            }
            this.b = o441Var3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        o441 o441Var = this.b;
        o441 o441Var2 = this.a;
        this.b = (o441Var == o441Var2 || o441Var2 == null) ? null : o441Var.c;
        return o441Var;
    }
}
