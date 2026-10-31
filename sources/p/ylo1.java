package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ylo1 extends u9 {
    public static final Parcelable.Creator<ylo1> CREATOR = new hmo1(1);
    public final byte a;
    public final byte b;
    public final String c;

    public ylo1(byte b, byte b2, String str) {
        this.a = b;
        this.b = b2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ylo1.class != obj.getClass()) {
            return false;
        }
        ylo1 ylo1Var = (ylo1) obj;
        return this.a == ylo1Var.a && this.b == ylo1Var.b && this.c.equals(ylo1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.a + 31) * 31) + this.b) * 31);
    }

    public final String toString() {
        byte b = this.a;
        int length = String.valueOf((int) b).length();
        byte b2 = this.b;
        int length2 = String.valueOf((int) b2).length();
        String str = this.c;
        StringBuilder sb = new StringBuilder(length + 53 + length2 + 10 + String.valueOf(str).length() + 2);
        c13.n(b, b2, "AmsEntityUpdateParcelable{, mEntityId=", ", mAttributeId=", sb);
        return l1d.q(sb, ", mValue='", str, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b);
        j541.F(parcel, 4, this.c);
        j541.M(iL, parcel);
    }
}
