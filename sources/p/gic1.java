package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gic1 implements tic1 {
    public static final Parcelable.Creator<gic1> CREATOR = new y7c1((byte) 9);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public gic1(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gic1)) {
            return false;
        }
        gic1 gic1Var = (gic1) obj;
        return u890.j(this.a, gic1Var.a) && u890.j(this.b, gic1Var.b) && u890.j(this.c, gic1Var.c) && u890.j(this.d, gic1Var.d) && this.e == gic1Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.e) + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
