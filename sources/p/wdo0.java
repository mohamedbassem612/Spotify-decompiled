package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wdo0 implements Parcelable {
    public static final Parcelable.Creator<wdo0> CREATOR = new b4o0((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public wdo0(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public static wdo0 a(wdo0 wdo0Var, int i) {
        String str = wdo0Var.a;
        String str2 = wdo0Var.b;
        String str3 = wdo0Var.c;
        String str4 = wdo0Var.d;
        wdo0Var.getClass();
        return new wdo0(i, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdo0)) {
            return false;
        }
        wdo0 wdo0Var = (wdo0) obj;
        return u890.j(this.a, wdo0Var.a) && u890.j(this.b, wdo0Var.b) && u890.j(this.c, wdo0Var.c) && u890.j(this.d, wdo0Var.d) && this.e == wdo0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
