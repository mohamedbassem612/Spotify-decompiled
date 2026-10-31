package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e8c0 implements Parcelable {
    public static final Parcelable.Creator<e8c0> CREATOR = new v5c0((byte) 11);
    public final String a;
    public final String b;

    public e8c0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8c0)) {
            return false;
        }
        e8c0 e8c0Var = (e8c0) obj;
        return u890.j(this.a, e8c0Var.a) && u890.j(this.b, e8c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
