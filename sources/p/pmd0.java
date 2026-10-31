package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pmd0 extends AbstractSequentialList implements Serializable {
    public final /* synthetic */ byte a = 1;
    public final List b;
    public final Object c;

    public pmd0(List list, acp1 acp1Var) {
        list.getClass();
        this.b = list;
        this.c = acp1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new nmd0(this, this.b.listIterator(i), (byte) 1);
            default:
                return new mrn1(this, this.b.listIterator(i), (byte) 1);
        }
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                this.b.subList(i, i2).clear();
                break;
            default:
                this.b.subList(i, i2).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return this.b.size();
    }

    public pmd0(List list, su30 su30Var) {
        list.getClass();
        this.b = list;
        this.c = su30Var;
    }
}
