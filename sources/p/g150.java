package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g150 implements Parcelable {
    public static final Parcelable.Creator<g150> CREATOR = new fd40((byte) 11);
    public final i050 a;
    public final boolean b;
    public final f150 c;
    public final a250 d;

    public g150(i050 i050Var, boolean z, f150 f150Var, a250 a250Var) {
        this.a = i050Var;
        this.b = z;
        this.c = f150Var;
        this.d = a250Var;
    }

    public static g150 a(g150 g150Var, boolean z, f150 f150Var, a250 a250Var, int i) {
        i050 i050Var = g150Var.a;
        if ((i & 2) != 0) {
            z = g150Var.b;
        }
        if ((i & 4) != 0) {
            f150Var = g150Var.c;
        }
        return new g150(i050Var, z, f150Var, a250Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g150)) {
            return false;
        }
        g150 g150Var = (g150) obj;
        return u890.j(this.a, g150Var.a) && this.b == g150Var.b && u890.j(this.c, g150Var.c) && u890.j(this.d, g150Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
