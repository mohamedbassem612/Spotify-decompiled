package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uas0 implements Parcelable {
    public static final Parcelable.Creator<uas0> CREATOR = new zsr0((byte) 28);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final v7u g;
    public final boolean h;
    public final String i;

    public uas0(String str, String str2, String str3, String str4, String str5, List list, v7u v7uVar, boolean z, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.g = v7uVar;
        this.h = z;
        this.i = str6;
    }

    public final String Z() {
        return this.i;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uas0)) {
            return false;
        }
        uas0 uas0Var = (uas0) obj;
        return u890.j(this.a, uas0Var.a) && u890.j(this.b, uas0Var.b) && u890.j(this.c, uas0Var.c) && u890.j(this.d, uas0Var.d) && u890.j(this.e, uas0Var.e) && u890.j(this.f, uas0Var.f) && u890.j(this.g, uas0Var.g) && this.h == uas0Var.h && u890.j(this.i, uas0Var.i);
    }

    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        v7u v7uVar = this.g;
        int iG = xcg1.g((iB + (v7uVar == null ? 0 : v7uVar.a.hashCode())) * 31, 31, this.h);
        String str = this.i;
        return iG + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            ((p2c0) itM.next()).writeToParcel(parcel, i);
        }
        v7u v7uVar = this.g;
        if (v7uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            v7uVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
    }
}
