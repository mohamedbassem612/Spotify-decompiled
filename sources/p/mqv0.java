package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mqv0 implements Parcelable {
    public static final Parcelable.Creator<mqv0> CREATOR = new g0v0((byte) 13);
    public final String a;
    public final zxf b;
    public final boolean c;

    public mqv0(String str, zxf zxfVar, boolean z) {
        this.a = str;
        this.b = zxfVar;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqv0)) {
            return false;
        }
        mqv0 mqv0Var = (mqv0) obj;
        return u890.j(this.a, mqv0Var.a) && u890.j(this.b, mqv0Var.b) && this.c == mqv0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
