package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fi90 implements Parcelable {
    public static final Parcelable.Creator<fi90> CREATOR = new qg90((byte) 4);
    public final String a;
    public final String b;
    public final String c;

    public fi90(String str, String str2, String str3) {
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
        if (!(obj instanceof fi90)) {
            return false;
        }
        fi90 fi90Var = (fi90) obj;
        return u890.j(this.a, fi90Var.a) && u890.j(this.b, fi90Var.b) && u890.j(this.c, fi90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
