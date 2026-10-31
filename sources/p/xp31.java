package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xp31 implements Parcelable {
    public static final Parcelable.Creator<xp31> CREATOR = new s231((byte) 24);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final pbf0 e;

    public xp31(String str, String str2, List list, String str3, pbf0 pbf0Var) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = pbf0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp31)) {
            return false;
        }
        xp31 xp31Var = (xp31) obj;
        return u890.j(this.a, xp31Var.a) && u890.j(this.b, xp31Var.b) && this.c.equals(xp31Var.c) && u890.j(this.d, xp31Var.d) && u890.j(this.e, xp31Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
        this.e.writeToParcel(parcel, i);
    }
}
