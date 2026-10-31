package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eka1 implements Parcelable {
    public static final Parcelable.Creator<eka1> CREATOR = new nja1((byte) 3);
    public final String a;
    public final String b;
    public final String c;

    public eka1(String str, String str2, String str3) {
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
        if (!(obj instanceof eka1)) {
            return false;
        }
        eka1 eka1Var = (eka1) obj;
        return u890.j(this.a, eka1Var.a) && u890.j(this.b, eka1Var.b) && u890.j(this.c, eka1Var.c);
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
