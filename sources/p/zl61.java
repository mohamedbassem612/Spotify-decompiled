package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zl61 extends cm61 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Set d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zl61(Set set, Set set2, byte b) {
        super((byte) 1);
        this.b = b;
        this.c = set;
        this.d = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.b;
        b291 b291Var = this.d;
        Set set = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return set.contains(obj) && b291Var.contains(obj);
            default:
                return set.contains(obj) && !b291Var.d.equals(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.c.containsAll(collection) && this.d.containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.b;
        Set set = this.c;
        b291 b291Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Collections.disjoint(b291Var, set);
            default:
                return b291Var.containsAll(set);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ao90(this);
            default:
                return new ao90(this, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.b;
        b291 b291Var = this.d;
        Set set = this.c;
        int i = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (b291Var.contains(it.next())) {
                        i++;
                    }
                }
                break;
            default:
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!b291Var.d.equals(it2.next())) {
                        i++;
                    }
                }
                break;
        }
        return i;
    }
}
