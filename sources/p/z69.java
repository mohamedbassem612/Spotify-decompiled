package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z69 implements Parcelable {
    public static final Parcelable.Creator<z69> CREATOR = new so8((byte) 18);
    public final c79 a;
    public final f79 b;

    public z69(c79 c79Var, f79 f79Var) {
        this.a = c79Var;
        this.b = f79Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z69)) {
            return false;
        }
        z69 z69Var = (z69) obj;
        return u890.j(this.a, z69Var.a) && u890.j(this.b, z69Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
