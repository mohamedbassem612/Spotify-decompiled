package p;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y7 extends p7 implements ListIterator {
    public final /* synthetic */ z7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(z7 z7Var, int i) {
        super(z7Var, ((List) z7Var.b).listIterator(i));
        this.e = z7Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        z7 z7Var = this.e;
        boolean zIsEmpty = z7Var.isEmpty();
        c().add(obj);
        z7Var.f.f++;
        if (zIsEmpty) {
            z7Var.b();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(z7 z7Var) {
        super(z7Var);
        this.e = z7Var;
    }
}
