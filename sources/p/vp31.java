package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vp31 implements Parcelable {
    public static final Parcelable.Creator<vp31> CREATOR = new agm0((byte) 13);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final ArrayList g;
    public final Long h;

    public vp31(String str, String str2, String str3, String str4, List list, int i, ArrayList arrayList, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = i;
        this.g = arrayList;
        this.h = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp31)) {
            return false;
        }
        vp31 vp31Var = (vp31) obj;
        return u890.j(this.a, vp31Var.a) && u890.j(this.b, vp31Var.b) && u890.j(this.c, vp31Var.c) && u890.j(this.d, vp31Var.d) && this.e.equals(vp31Var.e) && this.f == vp31Var.f && this.g.equals(vp31Var.g) && u890.j(this.h, vp31Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = p3d1.f(this.g, kaa0.f(this.f, f4i1.b(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31);
        Long l = this.h;
        return iF + (l != null ? l.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeStringList(this.e);
        parcel.writeInt(this.f);
        Iterator itO = xvj1.o(this.g, parcel);
        while (itO.hasNext()) {
            ((k1z0) itO.next()).writeToParcel(parcel, i);
        }
        Long l = this.h;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }
}
