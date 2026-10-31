package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aen0 implements ama0, Set, ola0 {
    public final ydn0 a;
    public final ydn0 b;

    public aen0(ydn0 ydn0Var) {
        this.a = ydn0Var;
        this.b = ydn0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        ydn0 ydn0Var = this.b;
        int i = ydn0Var.g;
        for (Object obj : collection) {
            int iD = ydn0Var.d(obj);
            ydn0Var.b[iD] = obj;
            long[] jArr = ydn0Var.c;
            int i2 = ydn0Var.d;
            jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            ydn0Var.d = iD;
            if (ydn0Var.e == Integer.MAX_VALUE) {
                ydn0Var.e = iD;
            }
        }
        return i != ydn0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aen0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((aen0) obj).a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new nh40(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        ydn0 ydn0Var = this.b;
        int i = ydn0Var.g;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = ydn0Var.f;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = ydn0Var.a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (u890.j(ydn0Var.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                ydn0Var.h(iNumberOfTrailingZeros);
            }
        }
        return i != ydn0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.b.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return bmq0.c0(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return bmq0.d0(this, objArr);
    }
}
