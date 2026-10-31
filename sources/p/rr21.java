package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rr21 implements Parcelable {
    public static final Parcelable.Creator<rr21> CREATOR = new g321((byte) 17);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final long i;

    public rr21(String str, String str2, String str3, Integer num, ArrayList arrayList, ArrayList arrayList2, String str4, String str5, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = str4;
        this.h = str5;
        this.i = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr21)) {
            return false;
        }
        rr21 rr21Var = (rr21) obj;
        return u890.j(this.a, rr21Var.a) && u890.j(this.b, rr21Var.b) && u890.j(this.c, rr21Var.c) && u890.j(this.d, rr21Var.d) && this.e.equals(rr21Var.e) && this.f.equals(rr21Var.f) && u890.j(this.g, rr21Var.g) && u890.j(this.h, rr21Var.h) && this.i == rr21Var.i;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iB = f4i1.b(f4i1.b((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return Long.hashCode(this.i) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.i);
    }
}
