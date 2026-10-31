package p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ce41 extends hso1 {
    public final Bundle b;
    public final ae41 c;
    public String d = "";
    public int e;
    public final kl1 f;

    public ce41(Bundle bundle, ae41 ae41Var) {
        this.b = bundle;
        this.c = ae41Var;
        this.f = ae41Var.a;
    }

    public final short C() {
        return (short) mue1.C(this.b, this.d);
    }

    public final float F() {
        String str = this.d;
        Bundle bundle = this.b;
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        y9g1.o(str);
        throw null;
    }

    public final double H() {
        String str = this.d;
        Bundle bundle = this.b;
        double d = bundle.getDouble(str, Double.MIN_VALUE);
        if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d;
        }
        y9g1.o(str);
        throw null;
    }

    public final boolean K() {
        String str = this.d;
        Bundle bundle = this.b;
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return z;
        }
        y9g1.o(str);
        throw null;
    }

    public final char N() {
        String str = this.d;
        Bundle bundle = this.b;
        char c = bundle.getChar(str, (char) 0);
        if (c != 0 || bundle.getChar(str, (char) 65535) != 65535) {
            return c;
        }
        y9g1.o(str);
        throw null;
    }

    public final int T(h661 h661Var) {
        return mue1.C(this.b, this.d);
    }

    public final String V() {
        String str = this.d;
        String string = this.b.getString(str);
        if (string != null) {
            return string;
        }
        y9g1.o(str);
        throw null;
    }

    public final boolean X() {
        String str = this.d;
        Bundle bundle = this.b;
        return !(bundle.containsKey(str) && bundle.get(str) == null);
    }

    public final Object Y(nma0 nma0Var) {
        Object objA;
        Object stringArray;
        h661 descriptor = nma0Var.getDescriptor();
        Object obj = null;
        if (u890.j(descriptor, zd41.a)) {
            j661 j661Var = dne.a;
            objA = dne.a(this);
        } else if (u890.j(descriptor, zd41.b)) {
            objA = les.b.deserialize(this);
        } else if (u890.j(descriptor, zd41.c)) {
            objA = z4s.b.deserialize(this);
        } else if (u890.j(descriptor, zd41.d)) {
            objA = jg70.a(this);
        } else if (u890.j(descriptor, zd41.i) || u890.j(descriptor, zd41.j)) {
            objA = ane.a(this);
        } else if (u890.j(descriptor, zd41.k) || u890.j(descriptor, zd41.l)) {
            objA = cne.a.deserialize(this);
        } else if (u890.j(descriptor, zd41.e)) {
            Parcelable[] parcelableArrA = fqr0.a(this);
            Object objDeserialize = nma0Var.deserialize(c6x.b);
            objDeserialize.getClass();
            objA = Arrays.copyOf(parcelableArrA, parcelableArrA.length, rc11.a.b(objDeserialize.getClass()).n());
        } else if (u890.j(descriptor, zd41.f)) {
            objA = fqr0.a(this);
        } else if (u890.j(descriptor, zd41.g) || u890.j(descriptor, zd41.h)) {
            objA = tqr0.a.deserialize(this);
        } else {
            objA = (u890.j(descriptor, zd41.m) || u890.j(descriptor, zd41.n) || u890.j(descriptor, zd41.o)) ? nna1.a.deserialize(this) : null;
        }
        if (objA == null) {
            h661 descriptor2 = nma0Var.getDescriptor();
            boolean zJ = u890.j(descriptor2, yd41.a);
            Bundle bundle = this.b;
            if (zJ) {
                String str = this.d;
                stringArray = bundle.getIntegerArrayList(str);
                if (stringArray == null) {
                    y9g1.o(str);
                    throw null;
                }
            } else if (u890.j(descriptor2, yd41.b)) {
                String str2 = this.d;
                stringArray = bundle.getStringArrayList(str2);
                if (stringArray == null) {
                    y9g1.o(str2);
                    throw null;
                }
            } else if (u890.j(descriptor2, yd41.c)) {
                String str3 = this.d;
                stringArray = bundle.getBooleanArray(str3);
                if (stringArray == null) {
                    y9g1.o(str3);
                    throw null;
                }
            } else if (u890.j(descriptor2, yd41.d)) {
                String str4 = this.d;
                stringArray = bundle.getCharArray(str4);
                if (stringArray == null) {
                    y9g1.o(str4);
                    throw null;
                }
            } else if (u890.j(descriptor2, yd41.e)) {
                String str5 = this.d;
                stringArray = bundle.getDoubleArray(str5);
                if (stringArray == null) {
                    y9g1.o(str5);
                    throw null;
                }
            } else if (u890.j(descriptor2, yd41.f)) {
                String str6 = this.d;
                stringArray = bundle.getFloatArray(str6);
                if (stringArray == null) {
                    y9g1.o(str6);
                    throw null;
                }
            } else if (u890.j(descriptor2, yd41.g)) {
                String str7 = this.d;
                stringArray = bundle.getIntArray(str7);
                if (stringArray == null) {
                    y9g1.o(str7);
                    throw null;
                }
            } else if (u890.j(descriptor2, yd41.h)) {
                String str8 = this.d;
                stringArray = bundle.getLongArray(str8);
                if (stringArray == null) {
                    y9g1.o(str8);
                    throw null;
                }
            } else if (u890.j(descriptor2, yd41.i)) {
                String str9 = this.d;
                stringArray = bundle.getStringArray(str9);
                if (stringArray == null) {
                    y9g1.o(str9);
                    throw null;
                }
            }
            obj = stringArray;
        } else {
            obj = objA;
        }
        return obj == null ? nma0Var.deserialize(this) : obj;
    }

    public final x1k b(h661 h661Var) {
        if (u890.j(this.d, "")) {
            return this;
        }
        String str = this.d;
        Bundle bundle = this.b.getBundle(str);
        if (bundle != null) {
            return new ce41(bundle, this.c);
        }
        y9g1.o(str);
        throw null;
    }

    public final kl1 c() {
        return this.f;
    }

    public final byte c0() {
        return (byte) mue1.C(this.b, this.d);
    }

    public final int n() {
        return mue1.C(this.b, this.d);
    }

    public final int p(h661 h661Var) {
        boolean zJ = u890.j(h661Var.getKind(), uic1.i);
        Bundle bundle = this.b;
        int size = (zJ || u890.j(h661Var.getKind(), vic1.h)) ? bundle.size() : h661Var.d();
        while (true) {
            int i = this.e;
            if (i >= size || !h661Var.i(i) || bundle.containsKey(h661Var.e(this.e))) {
                break;
            }
            this.e++;
        }
        int i2 = this.e;
        if (i2 >= size) {
            return -1;
        }
        this.d = h661Var.e(i2);
        int i3 = this.e;
        this.e = i3 + 1;
        return i3;
    }

    public final long u() {
        String str = this.d;
        Bundle bundle = this.b;
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j;
        }
        y9g1.o(str);
        throw null;
    }
}
