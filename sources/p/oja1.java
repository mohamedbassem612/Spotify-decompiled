package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oja1 implements Parcelable {
    public static final Parcelable.Creator<oja1> CREATOR = new nja1((byte) 0);
    public final List a;
    public final int b;
    public final boolean c;
    public final double d;

    public oja1(List list, int i, boolean z, double d) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oja1)) {
            return false;
        }
        oja1 oja1Var = (oja1) obj;
        return this.a.equals(oja1Var.a) && this.b == oja1Var.b && this.c == oja1Var.c && Double.compare(this.d, oja1Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeDouble(this.d);
    }
}
