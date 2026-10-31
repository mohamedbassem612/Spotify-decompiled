package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ekn implements Parcelable {
    public static final Parcelable.Creator<ekn> CREATOR = new rtm((byte) 25);
    public final String a;
    public final jaw0 b;
    public final ArrayList c;
    public final zlk1 d;
    public final xk41 e;
    public final boolean f;
    public final ArrayList g;
    public final String h;
    public final r591 i;
    public final String t;

    public ekn(String str, jaw0 jaw0Var, ArrayList arrayList, zlk1 zlk1Var, xk41 xk41Var, boolean z, ArrayList arrayList2, String str2, r591 r591Var, String str3) {
        this.a = str;
        this.b = jaw0Var;
        this.c = arrayList;
        this.d = zlk1Var;
        this.e = xk41Var;
        this.f = z;
        this.g = arrayList2;
        this.h = str2;
        this.i = r591Var;
        this.t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekn)) {
            return false;
        }
        ekn eknVar = (ekn) obj;
        return u890.j(this.a, eknVar.a) && u890.j(this.b, eknVar.b) && this.c.equals(eknVar.c) && u890.j(this.d, eknVar.d) && u890.j(this.e, eknVar.e) && this.f == eknVar.f && this.g.equals(eknVar.g) && u890.j(this.h, eknVar.h) && this.i == eknVar.i && u890.j(this.t, eknVar.t);
    }

    public final int hashCode() {
        int iD = cy30.d(p3d1.f(this.g, xcg1.g((this.e.hashCode() + ((this.d.hashCode() + p3d1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31)) * 31, 31, this.f), 31), 31, this.h);
        r591 r591Var = this.i;
        return this.t.hashCode() + ((iD + (r591Var == null ? 0 : r591Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        parcel.writeInt(this.f ? 1 : 0);
        Iterator itO2 = xvj1.o(this.g, parcel);
        while (itO2.hasNext()) {
            ((e311) itO2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.h);
        r591 r591Var = this.i;
        if (r591Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r591Var.name());
        }
        parcel.writeString(this.t);
    }
}
