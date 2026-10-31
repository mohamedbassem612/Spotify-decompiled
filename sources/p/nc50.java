package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nc50 implements Parcelable {
    public static final Parcelable.Creator<nc50> CREATOR = new n750((byte) 17);
    public final String a;
    public final v850 b;

    public nc50(String str, v850 v850Var) {
        this.a = str;
        this.b = v850Var;
    }

    public final String a() {
        return this.a;
    }

    public final v850 b() {
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
        if (!(obj instanceof nc50)) {
            return false;
        }
        nc50 nc50Var = (nc50) obj;
        return u890.j(this.a, nc50Var.a) && this.b == nc50Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
