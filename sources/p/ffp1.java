package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ffp1 extends wso1 implements Set {
    public transient d1p1 b;
    public final /* synthetic */ byte c;
    public final transient pun1 d;
    public final transient Serializable e;

    public /* synthetic */ ffp1(pun1 pun1Var, Serializable serializable, byte b) {
        this.c = b;
        this.d = pun1Var;
        this.e = serializable;
    }

    public final int b(Object[] objArr) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                d1p1 vdp1Var = this.b;
                if (vdp1Var == null) {
                    vdp1Var = new vdp1(this);
                    this.b = vdp1Var;
                }
                return vdp1Var.b(objArr);
            default:
                return ((whp1) this.e).b(objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
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
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                d1p1 vdp1Var = this.b;
                if (vdp1Var == null) {
                    vdp1Var = new vdp1(this);
                    this.b = vdp1Var;
                }
                return vdp1Var.i(0);
            default:
                return ((whp1) this.e).i(0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.c) {
        }
        return 1;
    }
}
