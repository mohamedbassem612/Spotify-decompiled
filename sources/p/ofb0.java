package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ofb0 extends u9 {
    public static final Parcelable.Creator<ofb0> CREATOR = new e9n1((byte) 15);
    public final long a;
    public final int b;
    public final boolean c;
    public final x1o1 d;

    public ofb0(long j, int i, boolean z, x1o1 x1o1Var) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = x1o1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ofb0)) {
            return false;
        }
        ofb0 ofb0Var = (ofb0) obj;
        return this.a == ofb0Var.a && this.b == ofb0Var.b && this.c == ofb0Var.c && k8p1.h(this.d, ofb0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sb.append("maxAge=");
            int i = a5o1.a;
            if (j == 0) {
                sb.append("0s");
            } else {
                sb.ensureCapacity(sb.length() + 27);
                boolean z = false;
                if (j < 0) {
                    sb.append("-");
                    if (j != Long.MIN_VALUE) {
                        j = -j;
                    } else {
                        j = Long.MAX_VALUE;
                        z = true;
                    }
                }
                if (j >= 86400000) {
                    sb.append(j / 86400000);
                    sb.append("d");
                    j %= 86400000;
                }
                if (true == z) {
                    j = 25975808;
                }
                if (j >= 3600000) {
                    sb.append(j / 3600000);
                    sb.append("h");
                    j %= 3600000;
                }
                if (j >= 60000) {
                    sb.append(j / 60000);
                    sb.append("m");
                    j %= 60000;
                }
                if (j >= 1000) {
                    sb.append(j / 1000);
                    sb.append("s");
                    j %= 1000;
                }
                if (j > 0) {
                    sb.append(j);
                    sb.append("ms");
                }
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(", ");
            if (i2 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i2 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i2 != 2) {
                    bhn0.q();
                    return null;
                }
                str = "GRANULARITY_FINE";
            }
            sb.append(str);
        }
        if (this.c) {
            sb.append(", bypass");
        }
        x1o1 x1o1Var = this.d;
        if (x1o1Var != null) {
            sb.append(", impersonation=");
            sb.append(x1o1Var);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 8);
        parcel.writeLong(this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j541.E(parcel, 5, this.d, i);
        j541.M(iL, parcel);
    }
}
