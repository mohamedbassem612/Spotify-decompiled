package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class d7 implements Iterator, ola0 {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;

    public d7(h661 h661Var) {
        this.a = (byte) 2;
        this.c = h661Var;
        this.b = h661Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return this.b < ((g7) obj).b();
            case 1:
                return this.b < ((Object[]) obj).length;
            case 2:
                return this.b > 0;
            case 3:
                return this.b > 0;
            case 4:
                return this.b < ((ina1) obj).g();
            case 5:
                return this.b < ((byte[]) obj).length;
            case 6:
                return this.b < ((long[]) obj).length;
            case 7:
                return this.b < ((short[]) obj).length;
            default:
                return this.b < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    hhg1.k();
                    return null;
                }
                int i = this.b;
                this.b = i + 1;
                return ((g7) obj).get(i);
            case 1:
                try {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    bhn0.t(e.getMessage());
                    return null;
                }
            case 2:
                h661 h661Var = (h661) obj;
                int iD = h661Var.d();
                int i3 = this.b;
                this.b = i3 - 1;
                return h661Var.g(iD - i3);
            case 3:
                q0z q0zVar = (q0z) obj;
                int i4 = ((m0v0) q0zVar).c;
                int i5 = this.b;
                this.b = i5 - 1;
                return ((m0v0) q0zVar).e[i4 - i5];
            case 4:
                int i6 = this.b;
                this.b = i6 + 1;
                return ((ina1) obj).h(i6);
            case 5:
                int i7 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i7 < bArr.length) {
                    this.b = i7 + 1;
                    return new p3h1(bArr[i7]);
                }
                bhn0.t(String.valueOf(i7));
                return null;
            case 6:
                int i8 = this.b;
                long[] jArr = (long[]) obj;
                if (i8 < jArr.length) {
                    this.b = i8 + 1;
                    return new z4h1(jArr[i8]);
                }
                bhn0.t(String.valueOf(i8));
                return null;
            case 7:
                int i9 = this.b;
                short[] sArr = (short[]) obj;
                if (i9 < sArr.length) {
                    this.b = i9 + 1;
                    return new n5h1(sArr[i9]);
                }
                bhn0.t(String.valueOf(i9));
                return null;
            default:
                int i10 = this.b;
                this.b = i10 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                tw20.p();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = this.b - 1;
                this.b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public /* synthetic */ d7(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    public d7(q0z q0zVar) {
        this.a = (byte) 3;
        this.c = q0zVar;
        this.b = ((m0v0) q0zVar).c;
    }
}
