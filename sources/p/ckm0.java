package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ckm0 extends xl81 implements id21, cq00, yod1 {
    public static final Parcelable.Creator<ckm0> CREATOR = new fgm0((byte) 15);
    public final String a;
    public final String b;
    public final ArrayList c;
    public final List d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;

    public ckm0(String str, String str2, ArrayList arrayList, List list, int i, String str3, String str4, int i2) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = list;
        this.e = i;
        this.f = str3;
        this.g = str4;
        this.h = i2;
    }

    @Override // p.cq00
    public final List T() {
        return this.c;
    }

    public final int a1() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckm0)) {
            return false;
        }
        ckm0 ckm0Var = (ckm0) obj;
        return u890.j(this.a, ckm0Var.a) && u890.j(this.b, ckm0Var.b) && this.c.equals(ckm0Var.c) && this.d.equals(ckm0Var.d) && this.e == ckm0Var.e && u890.j(this.f, ckm0Var.f) && u890.j(this.g, ckm0Var.g) && this.h == ckm0Var.h;
    }

    public final List getTags() {
        return this.d;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return l1d.C(this.h) + cy30.d(cy30.d(kaa0.f(this.e, f4i1.b(p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    @Override // p.cq00
    public final String n0() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((qpl) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(fd21.m(this.h));
    }

    @Override // p.cq00
    public final int z() {
        return this.e;
    }
}
