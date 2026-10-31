package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zio1 extends u9 {
    public static final Parcelable.Creator<zio1> CREATOR = new sao1(20);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public zio1(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zio1) {
            return ((zio1) obj).a.equals(this.a);
        }
        return false;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean j() {
        return this.d;
    }

    public final String toString() {
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        int length2 = String.valueOf(str2).length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(length + 10 + length2 + 7 + length3 + 11 + String.valueOf(z).length() + 1);
        bb00.j(sb, "Node{", str, ", id=", str2);
        sb.append(", hops=");
        sb.append(i);
        sb.append(", isNearby=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j541.M(iL, parcel);
    }
}
