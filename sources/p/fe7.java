package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fe7 implements Parcelable {
    public static final Parcelable.Creator<fe7> CREATOR = new f67((byte) 13);
    public final String a;
    public final me7 b;
    public final yd7 c;

    public fe7(String str, me7 me7Var, yd7 yd7Var) {
        this.a = str;
        this.b = me7Var;
        this.c = yd7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe7)) {
            return false;
        }
        fe7 fe7Var = (fe7) obj;
        return u890.j(this.a, fe7Var.a) && this.b == fe7Var.b && u890.j(this.c, fe7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
