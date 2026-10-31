package p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gg91 extends d9 {
    public static final gg91 b = new gg91(new Object[0]);
    public final Object[] a;

    public gg91(Object[] objArr) {
        this.a = objArr;
    }

    public final int b() {
        return this.a.length;
    }

    @Override // p.d9
    public final d9 c(int i, Object obj) {
        Object[] objArr = this.a;
        yxo1.s(i, objArr.length);
        if (i == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            f46.W(0, i, 6, objArr, objArr2);
            f46.Q(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new gg91(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        f46.Q(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        return new crs0(objArr.length + 1, 0, objArrCopyOf, uwo1.q(objArr[31]));
    }

    @Override // p.d9
    public final d9 d(Object obj) {
        Object[] objArr = this.a;
        if (objArr.length >= 32) {
            return new crs0(objArr.length + 1, 0, objArr, uwo1.q(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        objArrCopyOf[objArr.length] = obj;
        return new gg91(objArrCopyOf);
    }

    @Override // p.d9
    public final d9 e(Collection collection) {
        Object[] objArr = this.a;
        if (collection.size() + objArr.length > 32) {
            ers0 ers0VarF = f();
            ers0VarF.addAll(collection);
            return ers0VarF.d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new gg91(objArrCopyOf);
    }

    @Override // p.d9
    public final ers0 f() {
        return new ers0(this, (Object[]) null, this.a, 0);
    }

    public final Object get(int i) {
        Object[] objArr = this.a;
        yxo1.r(i, objArr.length);
        return objArr[i];
    }

    @Override // p.d9
    public final d9 i(b9 b9Var) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) b9Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? b : new gg91(f46.a0(0, length, objArrCopyOf));
    }

    public final int indexOf(Object obj) {
        return f46.p0(this.a, obj);
    }

    @Override // p.d9
    public final d9 k(int i) {
        Object[] objArr = this.a;
        yxo1.r(i, objArr.length);
        if (objArr.length == 1) {
            return b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        f46.Q(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new gg91(objArrCopyOf);
    }

    @Override // p.d9
    public final d9 l(int i, Object obj) {
        Object[] objArr = this.a;
        yxo1.r(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new gg91(objArrCopyOf);
    }

    public final int lastIndexOf(Object obj) {
        return f46.u0(this.a, obj);
    }

    public final ListIterator listIterator(int i) {
        Object[] objArr = this.a;
        yxo1.s(i, objArr.length);
        return new sac(i, objArr.length, objArr);
    }
}
