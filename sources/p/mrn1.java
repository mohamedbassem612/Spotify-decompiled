package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mrn1 extends bgg1 implements ListIterator {
    public final /* synthetic */ byte c;
    public final /* synthetic */ AbstractList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mrn1(AbstractList abstractList, ListIterator listIterator, byte b) {
        super(listIterator, (byte) 1);
        this.c = b;
        this.d = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p.bgg1
    public final Object b(Object obj) {
        byte b = this.c;
        AbstractList abstractList = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((acp1) ((omd0) abstractList).c).zza(obj);
            default:
                return ((acp1) ((pmd0) abstractList).c).zza(obj);
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b(((ListIterator) this.b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
