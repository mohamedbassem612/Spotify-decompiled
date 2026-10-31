package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class czl extends kzl {
    public static final Parcelable.Creator<czl> CREATOR = new pol((byte) 28);
    public final String a;
    public final gxs0 b;
    public final int c;

    public czl(String str, gxs0 gxs0Var, int i) {
        this.a = str;
        this.b = gxs0Var;
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
        if (!(obj instanceof czl)) {
            return false;
        }
        czl czlVar = (czl) obj;
        return u890.j(this.a, czlVar.a) && u890.j(this.b, czlVar.b) && this.c == czlVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}
