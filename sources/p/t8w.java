package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t8w implements Parcelable {
    public static final Parcelable.Creator<t8w> CREATOR = new x7w((byte) 4);
    public final int a;
    public final yxa0 b;

    public t8w(int i, yxa0 yxa0Var) {
        this.a = i;
        this.b = yxa0Var;
    }

    public final yxa0 a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8w)) {
            return false;
        }
        t8w t8wVar = (t8w) obj;
        return this.a == t8wVar.a && u890.j(this.b, t8wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
