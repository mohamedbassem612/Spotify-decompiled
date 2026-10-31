package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zv70 implements knt, Parcelable {
    public static final Parcelable.Creator<zv70> CREATOR = new mj70((byte) 9);
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;

    public zv70(int i, String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv70)) {
            return false;
        }
        zv70 zv70Var = (zv70) obj;
        return u890.j(this.a, zv70Var.a) && u890.j(this.b, zv70Var.b) && u890.j(this.c, zv70Var.c) && u890.j(this.d, zv70Var.d) && this.e == zv70Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        parcel.writeInt(this.e);
    }
}
