package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fqs0 implements Iterator, ola0 {
    public final /* synthetic */ byte a;
    public final gqs0 b;

    public fqs0(eqs0 eqs0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new gqs0(eqs0Var.b, eqs0Var);
                break;
            case 2:
                this.b = new gqs0(eqs0Var.b, eqs0Var);
                break;
            default:
                this.b = new gqs0(eqs0Var.b, eqs0Var);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        gqs0 gqs0Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return gqs0Var.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        gqs0 gqs0Var = this.b;
        switch (b) {
            case 0:
                return new pdn0((Map) gqs0Var.b.d, gqs0Var.c, gqs0Var.next());
            case 1:
                gqs0Var.next();
                return gqs0Var.c;
            default:
                return gqs0Var.next().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        gqs0 gqs0Var = this.b;
        switch (b) {
            case 0:
                gqs0Var.remove();
                break;
            case 1:
                gqs0Var.remove();
                break;
            default:
                gqs0Var.remove();
                break;
        }
    }
}
