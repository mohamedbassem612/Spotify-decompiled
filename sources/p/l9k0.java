package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l9k0 implements Parcelable {
    public static final Parcelable.Creator<l9k0> CREATOR = new ohj0((byte) 20);
    public final String a;
    public final a9k0 b;

    public l9k0(String str, a9k0 a9k0Var) {
        this.a = str;
        this.b = a9k0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9k0)) {
            return false;
        }
        l9k0 l9k0Var = (l9k0) obj;
        return u890.j(this.a, l9k0Var.a) && u890.j(this.b, l9k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
