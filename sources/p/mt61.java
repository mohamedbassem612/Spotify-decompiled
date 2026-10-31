package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mt61 implements Parcelable {
    public static final Parcelable.Creator<mt61> CREATOR = new hs61((byte) 3);
    public final gu61 a;
    public final boolean b;

    public mt61(gu61 gu61Var, boolean z) {
        this.a = gu61Var;
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
        if (!(obj instanceof mt61)) {
            return false;
        }
        mt61 mt61Var = (mt61) obj;
        return u890.j(this.a, mt61Var.a) && this.b == mt61Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
