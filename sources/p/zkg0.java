package p;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zkg0 extends AbstractCollection implements Collection, pla0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ zkg0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((xkg0) obj).clear();
                break;
            case 1:
                ((hps0) obj).clear();
                break;
            case 2:
                ((ips0) obj).clear();
                break;
            default:
                ((eqs0) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((xkg0) obj2).containsValue(obj);
            case 1:
                return ((hps0) obj2).containsValue(obj);
            case 2:
                return ((ips0) obj2).containsValue(obj);
            default:
                return ((eqs0) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((xkg0) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new ukg0((xkg0) obj, (byte) 1);
            case 1:
                hps0 hps0Var = (hps0) obj;
                lug1[] lug1VarArr = new lug1[8];
                while (i < 8) {
                    lug1VarArr[i] = new nug1((byte) 2);
                    i++;
                }
                return new pps0(hps0Var, lug1VarArr);
            case 2:
                ips0 ips0Var = (ips0) obj;
                mug1[] mug1VarArr = new mug1[8];
                while (i < 8) {
                    mug1VarArr[i] = new oug1((byte) 1);
                    i++;
                }
                return new qps0(ips0Var, mug1VarArr);
            default:
                return new fqs0((eqs0) obj, (byte) 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                xkg0 xkg0Var = (xkg0) this.b;
                xkg0Var.c();
                int iG = xkg0Var.g(obj);
                if (iG < 0) {
                    return false;
                }
                xkg0Var.j(iG);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                ((xkg0) this.b).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                ((xkg0) this.b).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((xkg0) obj).i;
            case 1:
                return ((hps0) obj).f;
            case 2:
                return ((ips0) obj).f;
            default:
                return ((eqs0) obj).d.c();
        }
    }
}
