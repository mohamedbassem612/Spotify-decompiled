package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class de41 extends zso1 {
    public final Bundle b;
    public final ae41 c;
    public String d = "";
    public final kl1 e;

    public de41(Bundle bundle, ae41 ae41Var) {
        this.b = bundle;
        this.c = ae41Var;
        this.e = ae41Var.a;
    }

    public final void D(h661 h661Var, int i) {
        this.d = h661Var.e(i);
    }

    public final void J() {
        this.b.putString(this.d, null);
    }

    public final void O(short s) {
        this.b.putInt(this.d, s);
    }

    public final void P(boolean z) {
        this.b.putBoolean(this.d, z);
    }

    public final void S(float f) {
        this.b.putFloat(this.d, f);
    }

    public final void U(char c) {
        this.b.putChar(this.d, c);
    }

    public final void a0(int i) {
        this.b.putInt(this.d, i);
    }

    public final z1k b(h661 h661Var) {
        if (u890.j(this.d, "")) {
            return this;
        }
        Bundle bundleH = mno1.h((mmr0[]) Arrays.copyOf(new mmr0[0], 0));
        this.b.putBundle(this.d, bundleH);
        return new de41(bundleH, this.c);
    }

    public final kl1 c() {
        return this.e;
    }

    public final boolean d0() {
        return false;
    }

    public final void h(double d) {
        this.b.putDouble(this.d, d);
    }

    public final void h0(String str) {
        this.b.putString(this.d, str);
    }

    public final void i(nma0 nma0Var, Object obj) {
        h661 descriptor = nma0Var.getDescriptor();
        if (u890.j(descriptor, zd41.a)) {
            j661 j661Var = dne.a;
            dne.b(this, (CharSequence) obj);
            return;
        }
        if (u890.j(descriptor, zd41.b)) {
            les.b.serialize(this, (Parcelable) obj);
            return;
        }
        if (u890.j(descriptor, zd41.c)) {
            z4s.b.serialize(this, (Serializable) obj);
            return;
        }
        if (u890.j(descriptor, zd41.d)) {
            j661 j661Var2 = jg70.a;
            IBinder iBinder = (IBinder) obj;
            if (this instanceof de41) {
                this.b.putBinder(this.d, iBinder);
                return;
            } else {
                hhg1.f(i541.z(this, jg70.a.a));
                return;
            }
        }
        if (u890.j(descriptor, zd41.i) || u890.j(descriptor, zd41.j)) {
            j661 j661Var3 = ane.a;
            CharSequence[] charSequenceArr = (CharSequence[]) obj;
            if (this instanceof de41) {
                this.b.putCharSequenceArray(this.d, charSequenceArr);
                return;
            } else {
                hhg1.f(i541.z(this, ane.a.a));
                return;
            }
        }
        if (u890.j(descriptor, zd41.k) || u890.j(descriptor, zd41.l)) {
            cne.a.serialize(this, (List) obj);
            return;
        }
        if (u890.j(descriptor, zd41.e) || u890.j(descriptor, zd41.f)) {
            j661 j661Var4 = fqr0.a;
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            if (this instanceof de41) {
                this.b.putParcelableArray(this.d, parcelableArr);
                return;
            } else {
                hhg1.f(i541.z(this, fqr0.a.a));
                return;
            }
        }
        if (u890.j(descriptor, zd41.g) || u890.j(descriptor, zd41.h)) {
            tqr0.a.serialize(this, (List) obj);
            return;
        }
        if (u890.j(descriptor, zd41.m) || u890.j(descriptor, zd41.n) || u890.j(descriptor, zd41.o)) {
            nna1.a.serialize(this, (SparseArray) obj);
            return;
        }
        h661 descriptor2 = nma0Var.getDescriptor();
        boolean zJ = u890.j(descriptor2, yd41.a);
        Bundle bundle = this.b;
        if (zJ) {
            bundle.putIntegerArrayList(this.d, mth1.H((List) obj));
            return;
        }
        if (u890.j(descriptor2, yd41.b)) {
            bundle.putStringArrayList(this.d, mth1.H((List) obj));
            return;
        }
        if (u890.j(descriptor2, yd41.c)) {
            bundle.putBooleanArray(this.d, (boolean[]) obj);
            return;
        }
        if (u890.j(descriptor2, yd41.d)) {
            bundle.putCharArray(this.d, (char[]) obj);
            return;
        }
        if (u890.j(descriptor2, yd41.e)) {
            bundle.putDoubleArray(this.d, (double[]) obj);
            return;
        }
        if (u890.j(descriptor2, yd41.f)) {
            bundle.putFloatArray(this.d, (float[]) obj);
            return;
        }
        if (u890.j(descriptor2, yd41.g)) {
            bundle.putIntArray(this.d, (int[]) obj);
        } else if (u890.j(descriptor2, yd41.h)) {
            bundle.putLongArray(this.d, (long[]) obj);
        } else if (!u890.j(descriptor2, yd41.i)) {
            nma0Var.serialize(this, obj);
        } else {
            bundle.putStringArray(this.d, (String[]) obj);
        }
    }

    public final void j(byte b) {
        this.b.putInt(this.d, b);
    }

    public final void r(h661 h661Var, int i) {
        this.b.putInt(this.d, i);
    }

    public final void z(long j) {
        this.b.putLong(this.d, j);
    }
}
