package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class czc0 implements ezc0 {
    public static final Parcelable.Creator<czc0> CREATOR = new bzc0((byte) 0);
    public final String a;
    public final String b;

    public czc0(String str, String str2) {
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
        if (!(obj instanceof czc0)) {
            return false;
        }
        czc0 czc0Var = (czc0) obj;
        return u890.j(this.a, czc0Var.a) && u890.j(this.b, czc0Var.b);
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
