package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n3w implements Parcelable {
    public static final Parcelable.Creator<n3w> CREATOR = new s5v((byte) 24);
    public final String a;
    public final String b;
    public final lrz0 c;

    public n3w(String str, String str2, lrz0 lrz0Var) {
        this.a = str;
        this.b = str2;
        this.c = lrz0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3w)) {
            return false;
        }
        n3w n3wVar = (n3w) obj;
        return u890.j(this.a, n3wVar.a) && u890.j(this.b, n3wVar.b) && this.c.equals(n3wVar.c);
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        lrz0 lrz0Var = this.c;
        parcel.writeInt(lrz0Var.a);
        parcel.writeInt(lrz0Var.b);
        parcel.writeInt(lrz0Var.c);
    }
}
