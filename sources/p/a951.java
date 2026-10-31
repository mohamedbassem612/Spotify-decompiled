package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a951 extends d951 {
    public static final Parcelable.Creator<a951> CREATOR = new uo41((byte) 24);
    public final siq0 a;
    public final boolean b;

    public a951(siq0 siq0Var, boolean z) {
        this.a = siq0Var;
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
        if (!(obj instanceof a951)) {
            return false;
        }
        a951 a951Var = (a951) obj;
        return u890.j(this.a, a951Var.a) && this.b == a951Var.b;
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
