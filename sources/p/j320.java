package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j320 implements n320 {
    public static final Parcelable.Creator<j320> CREATOR = new u220((byte) 1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;
    public final h320 g;

    public j320(String str, String str2, String str3, String str4, ArrayList arrayList, boolean z, h320 h320Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = z;
        this.g = h320Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j320)) {
            return false;
        }
        j320 j320Var = (j320) obj;
        return u890.j(this.a, j320Var.a) && u890.j(this.b, j320Var.b) && u890.j(this.c, j320Var.c) && u890.j(this.d, j320Var.d) && u890.j(this.e, j320Var.e) && this.f == j320Var.f && u890.j(this.g, j320Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        List list = this.e;
        return this.g.hashCode() + xcg1.g((iD2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        List list = this.e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((i320) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.f ? 1 : 0);
        this.g.writeToParcel(parcel, i);
    }
}
