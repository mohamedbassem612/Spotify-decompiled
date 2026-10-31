package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o620 implements Parcelable {
    public static final Parcelable.Creator<o620> CREATOR = new u220((byte) 7);
    public final String a;
    public final if20 b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;
    public final String g;

    public o620(String str, if20 if20Var, String str2, boolean z, String str3, ArrayList arrayList, String str4) {
        this.a = str;
        this.b = if20Var;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = arrayList;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o620)) {
            return false;
        }
        o620 o620Var = (o620) obj;
        return u890.j(this.a, o620Var.a) && u890.j(this.b, o620Var.b) && u890.j(this.c, o620Var.c) && this.d == o620Var.d && u890.j(this.e, o620Var.e) && this.f.equals(o620Var.f) && u890.j(this.g, o620Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + p3d1.f(this.f, (iG + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        Iterator itO = xvj1.o(this.f, parcel);
        while (itO.hasNext()) {
            ((o620) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
    }
}
