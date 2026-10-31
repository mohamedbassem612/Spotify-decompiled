package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class z2w0 implements Parcelable {
    public final String X;
    public final ajd0 Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final r8l1 c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final List i;
    public final boolean t;
    public static final y2w0 Companion = new y2w0();
    public static final Parcelable.Creator<z2w0> CREATOR = new g0v0(21);
    public static final znb0[] N0 = {null, null, null, dm5.S(2, tnt0.W0), dm5.S(2, tnt0.X0), dm5.S(2, tnt0.Y0), null, null, dm5.S(2, tnt0.Z0), null, null, null, null};

    public /* synthetic */ z2w0(int i, String str, String str2, r8l1 r8l1Var, List list, List list2, List list3, String str3, String str4, List list4, boolean z, String str5, ajd0 ajd0Var, boolean z2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, x2w0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = r8l1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list4;
        }
        if ((i & 512) == 0) {
            this.t = false;
        } else {
            this.t = z;
        }
        if ((i & 1024) == 0) {
            this.X = null;
        } else {
            this.X = str5;
        }
        if ((i & 2048) == 0) {
            this.Y = null;
        } else {
            this.Y = ajd0Var;
        }
        if ((i & 4096) == 0) {
            this.Z = false;
        } else {
            this.Z = z2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2w0)) {
            return false;
        }
        z2w0 z2w0Var = (z2w0) obj;
        return u890.j(this.a, z2w0Var.a) && u890.j(this.b, z2w0Var.b) && u890.j(this.c, z2w0Var.c) && u890.j(this.d, z2w0Var.d) && u890.j(this.e, z2w0Var.e) && u890.j(this.f, z2w0Var.f) && u890.j(this.g, z2w0Var.g) && u890.j(this.h, z2w0Var.h) && u890.j(this.i, z2w0Var.i) && this.t == z2w0Var.t && u890.j(this.X, z2w0Var.X) && u890.j(this.Y, z2w0Var.Y) && this.Z == z2w0Var.Z;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        r8l1 r8l1Var = this.c;
        int iHashCode3 = (iHashCode2 + (r8l1Var == null ? 0 : r8l1Var.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list4 = this.i;
        int iG = xcg1.g((iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31, 31, this.t);
        String str4 = this.X;
        int iHashCode9 = (iG + (str4 == null ? 0 : str4.hashCode())) * 31;
        ajd0 ajd0Var = this.Y;
        return Boolean.hashCode(this.Z) + ((iHashCode9 + (ajd0Var != null ? ajd0Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        r8l1 r8l1Var = this.c;
        if (r8l1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r8l1Var.writeToParcel(parcel, i);
        }
        List list = this.d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((n3w0) it.next()).writeToParcel(parcel, i);
            }
        }
        List list2 = this.e;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((qcl1) it2.next()).writeToParcel(parcel, i);
            }
        }
        List list3 = this.f;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((do10) it3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        List list4 = this.i;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                ((zti0) it4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.X);
        ajd0 ajd0Var = this.Y;
        if (ajd0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ajd0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.Z ? 1 : 0);
    }

    public z2w0(String str, String str2, r8l1 r8l1Var, List list, List list2, List list3, String str3, String str4, List list4, boolean z, String str5, ajd0 ajd0Var, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = r8l1Var;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = str3;
        this.h = str4;
        this.i = list4;
        this.t = z;
        this.X = str5;
        this.Y = ajd0Var;
        this.Z = z2;
    }
}
