package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hqs0 implements Iterator, ola0 {
    public final /* synthetic */ byte a;
    public final kqs0 b;

    public hqs0(dqs0 dqs0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new kqs0(dqs0Var.b, dqs0Var.d, (byte) 0);
                break;
            default:
                this.b = new kqs0(dqs0Var.b, dqs0Var.d, (byte) 0);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        kqs0 kqs0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return kqs0Var.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        kqs0 kqs0Var = this.b;
        switch (b) {
            case 0:
                return new bng0(kqs0Var.b, kqs0Var.b().a, (byte) 1);
            default:
                return kqs0Var.b().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
