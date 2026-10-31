package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g extends i {
    public static final Parcelable.Creator<g> CREATOR = new scc((byte) 4);
    public final List X;
    public final boolean Y;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final List t;

    public g(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, List list2, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.t = list;
        this.X = list2;
        this.Y = z6;
    }

    public static g j(g gVar, boolean z, ArrayList arrayList, boolean z2, int i) {
        String str = gVar.a;
        String str2 = gVar.b;
        String str3 = gVar.c;
        String str4 = gVar.d;
        if ((i & 16) != 0) {
            z = gVar.e;
        }
        return new g(str, str2, str3, str4, z, gVar.f, gVar.g, gVar.h, gVar.i, gVar.t, (i & 1024) != 0 ? gVar.X : arrayList, (i & 2048) != 0 ? gVar.Y : z2);
    }

    @Override // p.i
    public final String a() {
        return this.d;
    }

    @Override // p.i
    public final boolean b() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return u890.j(this.a, gVar.a) && u890.j(this.b, gVar.b) && u890.j(this.c, gVar.c) && u890.j(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g && this.h == gVar.h && this.i == gVar.i && u890.j(this.t, gVar.t) && u890.j(this.X, gVar.X) && this.Y == gVar.Y;
    }

    @Override // p.i
    public final boolean g() {
        return this.h;
    }

    @Override // p.i
    public final String getImageUri() {
        return this.c;
    }

    @Override // p.i
    public final String getName() {
        return this.b;
    }

    @Override // p.i
    public final String getUri() {
        return this.a;
    }

    @Override // p.i
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int iB = f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.t);
        List list = this.X;
        return Boolean.hashCode(this.Y) + ((iB + (list == null ? 0 : list.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.t);
        while (itM.hasNext()) {
            ((f) itM.next()).writeToParcel(parcel, i);
        }
        List list = this.X;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.Y ? 1 : 0);
    }
}
