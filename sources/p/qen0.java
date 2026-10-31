package p;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qen0 extends yl61 implements ama0 {
    public final oen0 b;

    public qen0(oen0 oen0Var) {
        super(oen0Var);
        this.b = oen0Var;
    }

    public final boolean add(Object obj) {
        return this.b.a(obj);
    }

    public final boolean addAll(Collection collection) {
        oen0 oen0Var = this.b;
        int i = oen0Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            oen0Var.j(it.next());
        }
        return i != oen0Var.d;
    }

    public final void clear() {
        this.b.b();
    }

    public final Iterator iterator() {
        return new nh40(this);
    }

    public final boolean remove(Object obj) {
        return this.b.l(obj);
    }

    public final boolean removeAll(Collection collection) {
        oen0 oen0Var = this.b;
        int i = oen0Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            oen0Var.i(it.next());
        }
        return i != oen0Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[LOOP:0: B:5:0x0011->B:17:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053 A[EDGE_INSN: B:24:0x0053->B:18:0x0053 BREAK  A[LOOP:0: B:5:0x0011->B:17:0x0050], SYNTHETIC] */
    public final boolean retainAll(Collection collection) {
        oen0 oen0Var = this.b;
        Object[] objArr = oen0Var.b;
        int i = oen0Var.d;
        long[] jArr = oen0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!o7h.i0(collection, objArr[i5])) {
                                oen0Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != oen0Var.d;
    }
}
