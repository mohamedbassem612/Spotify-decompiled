package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qpl extends xl81 implements id21, cq00, yod1, hv51 {
    public static final Parcelable.Creator<qpl> CREATOR = new txk(21);
    public final int X;
    public final int Y;
    public final String a;
    public final String b;
    public final ArrayList c;
    public final List d;
    public final int e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final boolean t;

    public qpl(String str, String str2, ArrayList arrayList, List list, int i, String str3, boolean z, String str4, String str5, boolean z2, int i2, int i3) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = list;
        this.e = i;
        this.f = str3;
        this.g = z;
        this.h = str4;
        this.i = str5;
        this.t = z2;
        this.X = i2;
        this.Y = i3;
    }

    @Override // p.cq00
    public final List T() {
        return this.c;
    }

    public final int a1() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpl)) {
            return false;
        }
        qpl qplVar = (qpl) obj;
        return u890.j(this.a, qplVar.a) && u890.j(this.b, qplVar.b) && u890.j(this.c, qplVar.c) && u890.j(this.d, qplVar.d) && this.e == qplVar.e && u890.j(this.f, qplVar.f) && this.g == qplVar.g && u890.j(this.h, qplVar.h) && u890.j(this.i, qplVar.i) && this.t == qplVar.t && this.X == qplVar.X && this.Y == qplVar.Y;
    }

    public final boolean f() {
        return this.g;
    }

    public final List getTags() {
        return this.d;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return l1d.C(this.Y) + ab80.k(this.X, xcg1.g(cy30.d(cy30.d(xcg1.g(cy30.d(kaa0.f(this.e, f4i1.b(p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t), 31);
    }

    @Override // p.cq00
    public final String n0() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((qpl) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(fd21.m(this.X));
        int i2 = this.Y;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "EXPLICIT";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "OVER_19_ONLY";
        }
        parcel.writeString(str);
    }

    @Override // p.cq00
    public final int z() {
        return this.e;
    }

    public /* synthetic */ qpl(String str, String str2, ArrayList arrayList, h290 h290Var, int i, String str3, boolean z, String str4, boolean z2, int i2) {
        this(str, str2, arrayList, h290Var, i, str3, z, str4, "", z2, i2, 1);
    }
}
