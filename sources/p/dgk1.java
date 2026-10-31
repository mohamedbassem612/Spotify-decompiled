package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dgk1 implements fgk1 {
    public static final Parcelable.Creator<dgk1> CREATOR = new tfk1((byte) 9);
    public final String a;
    public final kq70 b;
    public final String c;
    public final String d;
    public final cgk1 e;
    public final ArrayList f;
    public final igm0 g;

    public dgk1(String str, kq70 kq70Var, String str2, String str3, cgk1 cgk1Var, ArrayList arrayList, igm0 igm0Var) {
        this.a = str;
        this.b = kq70Var;
        this.c = str2;
        this.d = str3;
        this.e = cgk1Var;
        this.f = arrayList;
        this.g = igm0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgk1)) {
            return false;
        }
        dgk1 dgk1Var = (dgk1) obj;
        return u890.j(this.a, dgk1Var.a) && u890.j(this.b, dgk1Var.b) && u890.j(this.c, dgk1Var.c) && u890.j(this.d, dgk1Var.d) && u890.j(this.e, dgk1Var.e) && this.f.equals(dgk1Var.f) && u890.j(this.g, dgk1Var.g);
    }

    @Override // p.fgk1
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return this.g.hashCode() + p3d1.f(this.f, (this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        Iterator itO = xvj1.o(this.f, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        this.g.writeToParcel(parcel, i);
    }
}
