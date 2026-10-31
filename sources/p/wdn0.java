package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wdn0 {
    public Object[] a;
    public int b;
    public udn0 c;

    public wdn0(int i) {
        this.a = i == 0 ? lfp0.a : new Object[i];
    }

    public final void a(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.b)) {
            StringBuilder sbR = cy30.r(i, "Index ", " must be in 0..");
            sbR.append(this.b);
            eqr0.O(sbR.toString());
            throw null;
        }
        int i3 = i2 + 1;
        Object[] objArr = this.a;
        if (objArr.length < i3) {
            n(i3, objArr);
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        if (i != i4) {
            f46.Q(i + 1, i, i4, objArr2, objArr2);
        }
        objArr2[i] = obj;
        this.b++;
    }

    public final void b(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void d(wdn0 wdn0Var) {
        if (wdn0Var.i()) {
            return;
        }
        int i = this.b + wdn0Var.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        f46.Q(this.b, 0, wdn0Var.b, wdn0Var.a, this.a);
        this.b += wdn0Var.b;
    }

    public final void e() {
        f46.e0(this.a, (te70) null, 0, this.b);
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wdn0) {
            wdn0 wdn0Var = (wdn0) obj;
            int i = wdn0Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = wdn0Var.a;
                tr80 tr80VarQ = yoi1.Q(0, i2);
                int i3 = ((rr80) tr80VarQ).a;
                int i4 = ((rr80) tr80VarQ).b;
                if (i3 > i4) {
                    return true;
                }
                while (u890.j(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f() {
        if (!i()) {
            return this.a[0];
        }
        bhn0.t("ObjectList is empty.");
        return null;
    }

    public final Object g(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        p(i);
        throw null;
    }

    public final int h(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.b == 0;
    }

    public final boolean j() {
        return this.b != 0;
    }

    public final boolean k(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return false;
        }
        l(iH);
        return true;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            p(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            f46.Q(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            StringBuilder sbQ = cy30.q(i, i2, "Start (", ") and end (", ") must be in 0..");
            sbQ.append(this.b);
            eqr0.O(sbQ.toString());
            throw null;
        }
        if (i2 < i) {
            eqr0.N("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                f46.Q(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            f46.e0(this.a, (te70) null, i5, i4);
            this.b = i5;
        }
    }

    public final void n(int i, Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        f46.Q(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final Object o(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            p(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void p(int i) {
        StringBuilder sbR = cy30.r(i, "Index ", " must be in 0..");
        sbR.append(this.b - 1);
        eqr0.O(sbR.toString());
        throw null;
    }

    public final String toString() {
        xy50 xy50Var = new xy50(this, (byte) 19);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) xy50Var.invoke(obj));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ wdn0() {
        this(16);
    }
}
