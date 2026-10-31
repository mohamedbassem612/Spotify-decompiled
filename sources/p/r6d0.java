package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r6d0 implements Parcelable {
    public static final Parcelable.Creator<r6d0> CREATOR = new bzc0((byte) 22);
    public final String a;
    public final String b;
    public final String c;

    public r6d0(String str, String str2, String str3) {
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
        if (!(obj instanceof r6d0)) {
            return false;
        }
        r6d0 r6d0Var = (r6d0) obj;
        return u890.j(this.a, r6d0Var.a) && u890.j(this.b, r6d0Var.b) && u890.j(this.c, r6d0Var.c);
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
