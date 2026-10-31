package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y481 implements nb10 {
    public static final Parcelable.Creator<y481> CREATOR = new ro71((byte) 5);
    public final String a;
    public final Long b;
    public final int c;

    public y481(String str, Long l, int i) {
        this.a = str;
        this.b = l;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y481)) {
            return false;
        }
        y481 y481Var = (y481) obj;
        return u890.j(this.a, y481Var.a) && u890.j(this.b, y481Var.b) && this.c == y481Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (l != null ? l.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
        parcel.writeInt(this.c);
    }
}
