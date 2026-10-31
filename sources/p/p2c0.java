package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p2c0 implements Parcelable {
    public static final Parcelable.Creator<p2c0> CREATOR = new cwb0((byte) 4);
    public final q2c0 a;
    public final String b;
    public final String c;

    public p2c0(q2c0 q2c0Var, String str, String str2) {
        this.a = q2c0Var;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2c0)) {
            return false;
        }
        p2c0 p2c0Var = (p2c0) obj;
        return this.a == p2c0Var.a && u890.j(this.b, p2c0Var.b) && u890.j(this.c, p2c0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
