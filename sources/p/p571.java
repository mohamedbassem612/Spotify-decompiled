package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p571 implements Parcelable {
    public static final Parcelable.Creator<p571> CREATOR = new o471((byte) 25);
    public final o571 a;
    public final boolean b;

    public p571(o571 o571Var, boolean z) {
        this.a = o571Var;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p571)) {
            return false;
        }
        p571 p571Var = (p571) obj;
        return u890.j(this.a, p571Var.a) && this.b == p571Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
