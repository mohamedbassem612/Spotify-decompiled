package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c220 implements Parcelable {
    public static final Parcelable.Creator<c220> CREATOR = new no10((byte) 23);
    public final String a;
    public final String b;
    public final b220 c;

    public c220(String str, String str2, b220 b220Var) {
        this.a = str;
        this.b = str2;
        this.c = b220Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c220)) {
            return false;
        }
        c220 c220Var = (c220) obj;
        return u890.j(this.a, c220Var.a) && u890.j(this.b, c220Var.b) && u890.j(this.c, c220Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
