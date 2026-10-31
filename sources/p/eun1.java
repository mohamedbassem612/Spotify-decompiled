package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eun1 extends e5n1 implements Set {
    public transient rqn1 g;
    public final /* synthetic */ byte h;
    public final transient pun1 i;
    public final transient Serializable t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eun1(pun1 pun1Var, Serializable serializable, byte b) {
        super((byte) 3);
        this.h = b;
        this.i = pun1Var;
        this.t = serializable;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.h;
        pun1 pun1Var = this.i;
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

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int f(Object[] objArr) {
        switch (this.h) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rqn1 aun1Var = this.g;
                if (aun1Var == null) {
                    aun1Var = new aun1(this);
                    this.g = aun1Var;
                }
                return aun1Var.f(objArr);
            default:
                return ((lun1) this.t).f(objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.h) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rqn1 aun1Var = this.g;
                if (aun1Var == null) {
                    aun1Var = new aun1(this);
                    this.g = aun1Var;
                }
                return aun1Var.r(0);
            default:
                return ((lun1) this.t).r(0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.h) {
        }
        return 1;
    }
}
