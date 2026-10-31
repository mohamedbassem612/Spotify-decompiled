package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vv3 implements Parcelable {
    public static final Parcelable.Creator<vv3> CREATOR = new i93((byte) 15);
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public vv3(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv3)) {
            return false;
        }
        vv3 vv3Var = (vv3) obj;
        return u890.j(this.a, vv3Var.a) && u890.j(this.b, vv3Var.b) && this.c == vv3Var.c && u890.j(this.d, vv3Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }

    public /* synthetic */ vv3(int i, String str, String str2) {
        this(str, str2, (i & 4) != 0, null);
    }
}
