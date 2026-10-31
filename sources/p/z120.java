package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z120 implements b220 {
    public static final Parcelable.Creator<z120> CREATOR = new no10((byte) 21);
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;

    public z120(String str, String str2, String str3, String str4, String str5, List list, List list2) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list2;
        this.g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z120)) {
            return false;
        }
        z120 z120Var = (z120) obj;
        return u890.j(this.a, z120Var.a) && u890.j(this.b, z120Var.b) && u890.j(this.c, z120Var.c) && u890.j(this.d, z120Var.d) && u890.j(this.e, z120Var.e) && u890.j(this.f, z120Var.f) && u890.j(this.g, z120Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((fr51) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        List list = this.f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((fr51) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.g);
    }
}
