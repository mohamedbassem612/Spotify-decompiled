package p;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class qhc implements Iterable {
    public static final qmd0 a = new qmd0(new byte[0]);

    public static qhc b(Iterator it, int i) {
        if (i == 1) {
            return (qhc) it.next();
        }
        int i2 = i >>> 1;
        return b(it, i2).c(b(it, i - i2));
    }

    public static jhc l() {
        return new jhc((byte) 0);
    }

    public final qhc c(qhc qhcVar) {
        int size = size();
        int size2 = qhcVar.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = sp31.h;
        sp31 sp31Var = this instanceof sp31 ? (sp31) this : null;
        if (qhcVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return qhcVar;
        }
        int size3 = qhcVar.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = qhcVar.size();
            byte[] bArr = new byte[size4 + size5];
            d(0, bArr, 0, size4);
            qhcVar.d(0, bArr, size4, size5);
            return new qmd0(bArr);
        }
        if (sp31Var != null) {
            qhc qhcVar2 = sp31Var.d;
            if (qhcVar.size() + qhcVar2.size() < 128) {
                int size6 = qhcVar2.size();
                int size7 = qhcVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                qhcVar2.d(0, bArr2, 0, size6);
                qhcVar.d(0, bArr2, size6, size7);
                return new sp31(sp31Var.c, new qmd0(bArr2));
            }
        }
        if (sp31Var != null) {
            qhc qhcVar3 = sp31Var.d;
            qhc qhcVar4 = sp31Var.c;
            if (qhcVar4.f() > qhcVar3.f() && sp31Var.f > qhcVar.f()) {
                return new sp31(qhcVar4, new sp31(qhcVar3, qhcVar));
            }
        }
        if (size3 >= sp31.h[Math.max(f(), qhcVar.f()) + 1]) {
            return new sp31(this, qhcVar);
        }
        bb01 bb01Var = new bb01((byte) 12);
        bb01Var.d(this);
        bb01Var.d(qhcVar);
        Stack stack = (Stack) bb01Var.b;
        qhc sp31Var2 = (qhc) stack.pop();
        while (!stack.isEmpty()) {
            sp31Var2 = new sp31((qhc) stack.pop(), sp31Var2);
        }
        return sp31Var2;
    }

    public final void d(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            q58.g(30, i, "Source offset < 0: ");
            return;
        }
        if (i2 < 0) {
            q58.g(30, i2, "Target offset < 0: ");
            return;
        }
        if (i3 < 0) {
            q58.g(23, i3, "Length < 0: ");
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            q58.g(34, i4, "Source end offset < 0: ");
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            q58.g(34, i5, "Target end offset < 0: ");
        } else if (i3 > 0) {
            e(i, bArr, i2, i3);
        }
    }

    public abstract void e(int i, byte[] bArr, int i2, int i3);

    public int f() {
        return 0;
    }

    public boolean i() {
        return true;
    }

    public abstract boolean k();

    public abstract int m(int i, int i2, int i3);

    public abstract int n(int i, int i2, int i3);

    public abstract int o();

    public abstract String p();

    public final String q() {
        try {
            return p();
        } catch (UnsupportedEncodingException e) {
            bhn0.o("UTF-8 not supported?", e);
            return null;
        }
    }

    public abstract void r(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
