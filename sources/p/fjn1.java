package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fjn1 extends u9 {
    public static final Parcelable.Creator<fjn1> CREATOR = new e9n1((byte) 21);
    public final float a;
    public final float b;
    public final float c;

    public fjn1(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjn1)) {
            return false;
        }
        fjn1 fjn1Var = (fjn1) obj;
        return this.a == fjn1Var.a && this.b == fjn1Var.b && this.c == fjn1Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeFloat(this.a);
        j541.K(parcel, 3, 4);
        parcel.writeFloat(this.b);
        j541.K(parcel, 4, 4);
        parcel.writeFloat(this.c);
        j541.M(iL, parcel);
    }
}
