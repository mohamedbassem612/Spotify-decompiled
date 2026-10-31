package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t6i0 implements u6i0 {
    public static final Parcelable.Creator<t6i0> CREATOR = new cyh0((byte) 18);
    public final String a;
    public final String b;
    public final n5f0 c;

    public t6i0(String str, String str2, n5f0 n5f0Var) {
        this.a = str;
        this.b = str2;
        this.c = n5f0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6i0)) {
            return false;
        }
        t6i0 t6i0Var = (t6i0) obj;
        return u890.j(this.a, t6i0Var.a) && u890.j(this.b, t6i0Var.b) && this.c.equals(t6i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        n5f0 n5f0Var = this.c;
        parcel.writeLong(n5f0Var.a);
        parcel.writeLong(n5f0Var.b);
    }
}
