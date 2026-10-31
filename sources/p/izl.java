package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class izl extends kzl {
    public static final Parcelable.Creator<izl> CREATOR = new ezl((byte) 3);
    public final String a;
    public final p791 b;

    public izl(String str, p791 p791Var) {
        this.a = str;
        this.b = p791Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izl)) {
            return false;
        }
        izl izlVar = (izl) obj;
        return u890.j(this.a, izlVar.a) && this.b == izlVar.b;
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
