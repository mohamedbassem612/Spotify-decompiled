package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wgc implements Iterator {
    public final /* synthetic */ byte a = 6;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Iterable d;

    public wgc(n5o1 n5o1Var) {
        this.d = n5o1Var;
        this.c = n5o1Var.e();
    }

    public byte a() {
        try {
            byte[] bArr = this.d.b;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            bhn0.t(e.getMessage());
            return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.b < this.c;
            case 1:
                return this.b < this.c;
            case 2:
                return this.b < this.c;
            case 3:
                return this.b < this.c;
            case 4:
                return this.b < this.c;
            case 5:
                return this.b < this.c;
            default:
                return this.b < this.c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        ihc ihcVar = this.d;
        int i = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int i2 = this.b;
                if (i2 < i) {
                    this.b = i2 + 1;
                    return Byte.valueOf(((fhc) ihcVar).f(i2));
                }
                hhg1.k();
                return null;
            case 1:
                int i3 = this.b;
                if (i3 < i) {
                    this.b = i3 + 1;
                    return Byte.valueOf(((ohc) ihcVar).f(i3));
                }
                hhg1.k();
                return null;
            case 2:
                int i4 = this.b;
                if (i4 < i) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((hhc) ihcVar).n(i4));
                }
                hhg1.k();
                return null;
            case 3:
                int i5 = this.b;
                if (i5 < i) {
                    this.b = i5 + 1;
                    return Byte.valueOf(ihcVar.b[i5]);
                }
                hhg1.k();
                return null;
            case 4:
                return Byte.valueOf(a());
            case 5:
                int i6 = this.b;
                if (i6 < i) {
                    this.b = i6 + 1;
                    return Byte.valueOf(((n5o1) ihcVar).c(i6));
                }
                hhg1.k();
                return null;
            default:
                int i7 = this.b;
                if (i7 < i) {
                    this.b = i7 + 1;
                    return Byte.valueOf(((ahp1) ihcVar).c(i7));
                }
                hhg1.k();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public wgc(ahp1 ahp1Var) {
        this.d = ahp1Var;
        this.c = ahp1Var.d();
    }

    public wgc(fhc fhcVar) {
        this.d = fhcVar;
        this.c = fhcVar.size();
    }

    public wgc(hhc hhcVar) {
        this.d = hhcVar;
        this.c = hhcVar.size();
    }

    public wgc(ihc ihcVar) {
        this.d = ihcVar;
        this.c = ihcVar.size();
    }

    public wgc(ohc ohcVar) {
        this.d = ohcVar;
        this.c = ohcVar.size();
    }

    public wgc(qmd0 qmd0Var) {
        this.d = qmd0Var;
        this.c = qmd0Var.b.length;
    }
}
