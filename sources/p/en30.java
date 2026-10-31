package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class en30 implements Parcelable {
    public static final Parcelable.Creator<en30> CREATOR = new ix20((byte) 23);
    public final we10 a;
    public final we10 b;

    public en30(we10 we10Var, we10 we10Var2) {
        this.a = we10Var;
        this.b = we10Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en30)) {
            return false;
        }
        en30 en30Var = (en30) obj;
        return u890.j(this.a, en30Var.a) && u890.j(this.b, en30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
