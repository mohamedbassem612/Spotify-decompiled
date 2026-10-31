package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ocy0 extends tcy0 {
    public static final Parcelable.Creator<ocy0> CREATOR = new zzx0((byte) 16);
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    public ocy0(String str, String str2, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
    }

    @Override // p.tcy0
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
        if (!(obj instanceof ocy0)) {
            return false;
        }
        ocy0 ocy0Var = (ocy0) obj;
        return u890.j(this.a, ocy0Var.a) && u890.j(this.b, ocy0Var.b) && u890.j(this.c, ocy0Var.c) && u890.j(this.d, ocy0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            ((xu21) itM.next()).writeToParcel(parcel, i);
        }
    }
}
