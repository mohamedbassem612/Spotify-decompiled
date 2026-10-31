package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yb7 implements Parcelable {
    public static final Parcelable.Creator<yb7> CREATOR = new f67((byte) 5);
    public final String a;
    public final String b;
    public final String c;
    public final qb7 d;

    public yb7(String str, String str2, String str3, qb7 qb7Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qb7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb7)) {
            return false;
        }
        yb7 yb7Var = (yb7) obj;
        return u890.j(this.a, yb7Var.a) && u890.j(this.b, yb7Var.b) && u890.j(this.c, yb7Var.c) && this.d == yb7Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
    }
}
