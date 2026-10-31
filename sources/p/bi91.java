package p;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bi91 extends a9 {
    public static final /* synthetic */ int c = 0;
    public Object a;
    public int b;

    public final boolean add(Object obj) {
        Object obj2;
        int i = this.b;
        if (i == 0) {
            this.a = obj;
        } else {
            Object obj3 = this.a;
            if (i == 1) {
                if (u890.j(obj3, obj)) {
                    return false;
                }
                this.a = new Object[]{this.a, obj};
            } else if (i < 5) {
                Object[] objArr = (Object[]) obj3;
                if (f46.M(objArr, obj)) {
                    return false;
                }
                int i2 = this.b;
                if (i2 == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(zno1.s(objArrCopyOf.length));
                    f46.K0(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    obj2 = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i2 + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    obj2 = objArrCopyOf2;
                }
                this.a = obj2;
            } else if (!w0h1.l(obj3).add(obj)) {
                return false;
            }
        }
        this.b++;
        return true;
    }

    public final int b() {
        return this.b;
    }

    public final void clear() {
        this.a = null;
        this.b = 0;
    }

    public final boolean contains(Object obj) {
        if (b() == 0) {
            return false;
        }
        if (b() == 1) {
            return u890.j(this.a, obj);
        }
        int iB = b();
        Object obj2 = this.a;
        return iB < 5 ? f46.M((Object[]) obj2, obj) : ((Set) obj2).contains(obj);
    }

    public final Iterator iterator() {
        int i = this.b;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        Object obj = this.a;
        if (i == 1) {
            return new khq0(obj, (byte) 1);
        }
        return i < 5 ? new nps0((Object[]) obj) : w0h1.l(obj).iterator();
    }
}
