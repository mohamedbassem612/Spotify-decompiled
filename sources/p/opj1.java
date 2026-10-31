package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class opj1 extends u9 {
    public final int a;
    public final int b;
    public final int c;
    public static final pue0 d = new pue0("VideoInfo", (String) null);
    public static final Parcelable.Creator<opj1> CREATOR = new jrn1((byte) 27);

    public opj1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opj1)) {
            return false;
        }
        opj1 opj1Var = (opj1) obj;
        return this.b == opj1Var.b && this.a == opj1Var.a && this.c == opj1Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c);
        j541.M(iL, parcel);
    }
}
