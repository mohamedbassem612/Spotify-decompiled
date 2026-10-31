package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jdn1 extends u9 {
    public static final Parcelable.Creator<jdn1> CREATOR = new e9n1(17);
    public double a;
    public boolean b;
    public int c;
    public yz5 d;
    public int e;
    public kkn1 f;
    public double g;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jdn1)) {
            return false;
        }
        jdn1 jdn1Var = (jdn1) obj;
        if (this.a == jdn1Var.a && this.b == jdn1Var.b && this.c == jdn1Var.c && o4e.c(this.d, jdn1Var.d) && this.e == jdn1Var.e) {
            kkn1 kkn1Var = this.f;
            if (o4e.c(kkn1Var, kkn1Var) && this.g == jdn1Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        double d = this.a;
        j541.K(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z = this.b;
        j541.K(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.c;
        j541.K(parcel, 4, 4);
        parcel.writeInt(i2);
        j541.E(parcel, 5, this.d, i);
        int i3 = this.e;
        j541.K(parcel, 6, 4);
        parcel.writeInt(i3);
        j541.E(parcel, 7, this.f, i);
        double d2 = this.g;
        j541.K(parcel, 8, 8);
        parcel.writeDouble(d2);
        j541.M(iL, parcel);
    }
}
