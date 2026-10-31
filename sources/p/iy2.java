package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iy2 implements Parcelable {
    public static final Parcelable.Creator<iy2> CREATOR = new ue2((byte) 24);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;

    public /* synthetic */ iy2(int i, String str, String str2, String str3, ArrayList arrayList) {
        this(str, str2, (i & 16) != 0 ? z6x.a : arrayList, null, str3, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy2)) {
            return false;
        }
        iy2 iy2Var = (iy2) obj;
        return u890.j(this.a, iy2Var.a) && u890.j(this.b, iy2Var.b) && u890.j(this.c, iy2Var.c) && u890.j(this.d, iy2Var.d) && u890.j(this.e, iy2Var.e) && this.f == iy2Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.f) + f4i1.b((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeInt(this.f ? 1 : 0);
    }

    public iy2(String str, String str2, List list, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = z;
    }
}
