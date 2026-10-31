package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zyh extends u9 {
    public static final Parcelable.Creator<zyh> CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    static {
        new hwb((byte) 2).v();
        CREATOR = new jrn1((byte) 11);
    }

    public zyh(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zyh)) {
            return false;
        }
        zyh zyhVar = (zyh) obj;
        return this.a == zyhVar.a && this.b == zyhVar.b && this.c == zyhVar.c && this.d == zyhVar.d;
    }

    public final int hashCode() {
        return k8p1.j(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        int length3 = String.valueOf(i3).length();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        c13.n(i, i2, "ComplianceOptions{callerProductId=", ", dataOwnerProductId=", sb);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 1, this.a);
        j541.z(parcel, 2, this.b);
        j541.z(parcel, 3, this.c);
        j541.s(parcel, 4, this.d);
        j541.n(iJ, parcel);
    }
}
