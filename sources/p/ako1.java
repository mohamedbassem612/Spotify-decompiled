package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ako1 extends iio1 {
    public static final ako1 N0;
    public static final Object[] Z;
    public final transient int X;
    public final transient int Y;
    public final transient Object[] h;
    public final transient int i;
    public final transient Object[] t;

    static {
        Object[] objArr = new Object[0];
        Z = objArr;
        N0 = new ako1(0, 0, 0, objArr, objArr);
    }

    public ako1(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super((byte) 4);
        this.h = objArr;
        this.i = i;
        this.t = objArr2;
        this.X = i2;
        this.Y = i3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.t;
        if (objArr.length == 0) {
            return false;
        }
        int iF = ajo1.F(obj.hashCode());
        while (true) {
            int i = iF & this.X;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iF = i + 1;
        }
    }

    @Override // p.iio1, java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.i;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        djo1 djo1VarQ = this.g;
        if (djo1VarQ == null) {
            djo1VarQ = yho1.q(this.Y, this.h);
            this.g = djo1VarQ;
        }
        return djo1VarQ.r(0);
    }

    public final Object[] k() {
        return this.h;
    }

    public final int l() {
        return 0;
    }

    public final int m() {
        return this.Y;
    }

    public final int o(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.Y;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.Y;
    }
}
