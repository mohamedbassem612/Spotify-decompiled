package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ex5 extends u9 {
    public static final Parcelable.Creator<ex5> CREATOR = new hmo1((byte) 14);
    public final int a;
    public final int b;
    public final int c;

    public ex5() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ex5.class == obj.getClass()) {
            ex5 ex5Var = (ex5) obj;
            if (this.a == ex5Var.a && this.b == ex5Var.b && this.c == ex5Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i3).length() + 2);
        c13.n(i, i2, "Headline { textAlignment=", ", textWeight=", sb);
        return fd21.h(sb, ", textSize=", i3, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c);
        j541.M(iL, parcel);
    }

    public ex5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
