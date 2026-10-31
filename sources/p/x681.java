package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x681 implements z681 {
    public static final Parcelable.Creator<x681> CREATOR = new ro71((byte) 6);
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public x681(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x681)) {
            return false;
        }
        x681 x681Var = (x681) obj;
        return u890.j(this.a, x681Var.a) && u890.j(this.b, x681Var.b) && u890.j(this.c, x681Var.c) && u890.j(this.d, x681Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
    }
}
