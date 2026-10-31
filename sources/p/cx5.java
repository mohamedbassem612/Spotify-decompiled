package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cx5 extends u9 {
    public static final Parcelable.Creator<cx5> CREATOR = new agm0((byte) 21);
    public final int a;
    public final int b;
    public final int c;

    public cx5() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cx5.class == obj.getClass()) {
            cx5 cx5Var = (cx5) obj;
            if (this.a == cx5Var.a && this.b == cx5Var.b && this.c == cx5Var.c) {
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
        StringBuilder sb = new StringBuilder(length + 37 + length2 + 15 + String.valueOf(i3).length() + 2);
        c13.n(i, i2, "CallToAction { textSize=", ", buttonSize=", sb);
        return fd21.h(sb, ", cornerRadius=", i3, " }");
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

    public cx5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
