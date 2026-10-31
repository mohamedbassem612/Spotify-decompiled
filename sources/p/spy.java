package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class spy implements of51 {
    public static final Parcelable.Creator<spy> CREATOR = new jhy((byte) 8);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final rpy e;
    public final List f;
    public final String g;
    public final String h;

    public spy(int i, String str, String str2, String str3, rpy rpyVar, List list, String str4, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = rpyVar;
        this.f = list;
        this.g = str4;
        this.h = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spy)) {
            return false;
        }
        spy spyVar = (spy) obj;
        return this.a == spyVar.a && u890.j(this.b, spyVar.b) && u890.j(this.c, spyVar.c) && u890.j(this.d, spyVar.d) && u890.j(this.e, spyVar.e) && this.f.equals(spyVar.f) && u890.j(this.g, spyVar.g) && u890.j(this.h, spyVar.h);
    }

    public final int hashCode() {
        int iB = f4i1.b((this.e.hashCode() + cy30.d(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
        String str = this.g;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p.of51
    public final int p() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        this.e.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            ((cq70) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
