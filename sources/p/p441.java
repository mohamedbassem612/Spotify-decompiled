package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p441 implements Iterator, q441 {
    public o441 a;
    public boolean b = true;
    public final /* synthetic */ r441 c;

    public p441(r441 r441Var) {
        this.c = r441Var;
    }

    @Override // p.q441
    public final void a(o441 o441Var) {
        o441 o441Var2 = this.a;
        if (o441Var == o441Var2) {
            o441 o441Var3 = o441Var2.d;
            this.a = o441Var3;
            this.b = o441Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        o441 o441Var = this.a;
        return (o441Var == null || o441Var.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            o441 o441Var = this.c.a;
            this.a = o441Var;
            return o441Var;
        }
        o441 o441Var2 = this.a;
        o441 o441Var3 = o441Var2 != null ? o441Var2.c : null;
        this.a = o441Var3;
        return o441Var3;
    }
}
