package p;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fhn1 extends p7 implements ListIterator {
    public final /* synthetic */ yhn1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhn1(yhn1 yhn1Var, int i) {
        super(yhn1Var, ((List) yhn1Var.b).listIterator(i));
        this.e = yhn1Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        yhn1 yhn1Var = this.e;
        boolean zIsEmpty = yhn1Var.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        if (zIsEmpty) {
            yhn1Var.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhn1(yhn1 yhn1Var) {
        super(yhn1Var);
        this.e = yhn1Var;
    }
}
