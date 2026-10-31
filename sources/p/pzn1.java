package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pzn1 extends lvn1 implements Set {
    public transient ewn1 b;
    public final /* synthetic */ byte c;
    public final transient pun1 d;
    public final transient Serializable e;

    public /* synthetic */ pzn1(pun1 pun1Var, Serializable serializable, byte b) {
        this.c = b;
        this.d = pun1Var;
        this.e = serializable;
    }

    @Override // p.lvn1
    public final int b(int i, Object[] objArr) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ewn1 mzn1Var = this.b;
                if (mzn1Var == null) {
                    mzn1Var = new mzn1(this);
                    this.b = mzn1Var;
                }
                return mzn1Var.b(i, objArr);
            default:
                return ((zzn1) this.e).b(i, objArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.c;
        pun1 pun1Var = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(pun1Var.get(key));
            default:
                return pun1Var.get(obj) != null;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this && this != obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ewn1 mzn1Var = this.b;
                if (mzn1Var == null) {
                    mzn1Var = new mzn1(this);
                    this.b = mzn1Var;
                }
                return mzn1Var.listIterator(0);
            default:
                return ((zzn1) this.e).listIterator(0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.c) {
        }
        return 1;
    }
}
