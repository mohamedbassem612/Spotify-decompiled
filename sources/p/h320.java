package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h320 implements Parcelable {
    public static final Parcelable.Creator<h320> CREATOR = new u220((byte) 2);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public h320(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h320)) {
            return false;
        }
        h320 h320Var = (h320) obj;
        return u890.j(this.a, h320Var.a) && u890.j(this.b, h320Var.b) && u890.j(this.c, h320Var.c) && u890.j(this.d, h320Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
