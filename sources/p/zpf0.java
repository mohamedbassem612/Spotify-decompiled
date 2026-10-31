package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zpf0 implements Parcelable {
    public static final Parcelable.Creator<zpf0> CREATOR = new ipf0((byte) 8);
    public final String a;
    public final String b;
    public final String c;

    public zpf0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpf0)) {
            return false;
        }
        zpf0 zpf0Var = (zpf0) obj;
        return u890.j(this.a, zpf0Var.a) && u890.j(this.b, zpf0Var.b) && u890.j(this.c, zpf0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
