package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class goe implements Parcelable {
    public static final Parcelable.Creator<goe> CREATOR = new zge((byte) 9);
    public final boolean X;
    public final f8j0 Y;
    public final String a;
    public final ctf b;
    public final zks0 c;
    public final gxz0 d;
    public final List e;
    public final List f;
    public final int g;
    public final jlh1 h;
    public final boolean i;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ goe(String str, ctf ctfVar, zks0 zks0Var, gxz0 gxz0Var, ArrayList arrayList, List list, jlh1 jlh1Var, long j, boolean z, f8j0 f8j0Var, int i) {
        gxz0 gxz0Var2 = (i & 8) != 0 ? null : gxz0Var;
        List list2 = (i & 32) != 0 ? z6x.a : list;
        this(str, ctfVar, zks0Var, gxz0Var2, arrayList, list2, list2.size(), (i & 128) != 0 ? new jlh1(0, 0, 0) : jlh1Var, false, (i & 512) != 0 ? 0L : j, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? e8j0.a : f8j0Var);
    }

    public static goe a(goe goeVar, String str, btf btfVar, gxz0 gxz0Var, ArrayList arrayList, List list, int i, int i2) {
        String str2 = (i2 & 1) != 0 ? goeVar.a : str;
        btf btfVar2 = (i2 & 2) != 0 ? goeVar.b : btfVar;
        zks0 zks0Var = goeVar.c;
        gxz0 gxz0Var2 = (i2 & 8) != 0 ? goeVar.d : gxz0Var;
        List list2 = (i2 & 16) != 0 ? goeVar.e : arrayList;
        List list3 = (i2 & 32) != 0 ? goeVar.f : list;
        int i3 = (i2 & 64) != 0 ? goeVar.g : i;
        jlh1 jlh1Var = goeVar.h;
        boolean z = goeVar.i;
        long j = goeVar.t;
        boolean z2 = goeVar.X;
        f8j0 f8j0Var = goeVar.Y;
        goeVar.getClass();
        return new goe(str2, btfVar2, zks0Var, gxz0Var2, list2, list3, i3, jlh1Var, z, j, z2, f8j0Var);
    }

    public final List b() {
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
        if (!(obj instanceof goe)) {
            return false;
        }
        goe goeVar = (goe) obj;
        return u890.j(this.a, goeVar.a) && u890.j(this.b, goeVar.b) && u890.j(this.c, goeVar.c) && u890.j(this.d, goeVar.d) && u890.j(this.e, goeVar.e) && u890.j(this.f, goeVar.f) && this.g == goeVar.g && u890.j(this.h, goeVar.h) && this.i == goeVar.i && this.t == goeVar.t && this.X == goeVar.X && u890.j(this.Y, goeVar.Y);
    }

    public final List g() {
        return this.e;
    }

    public final String getId() {
        return this.a;
    }

    public final zks0 h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        gxz0 gxz0Var = this.d;
        return this.Y.hashCode() + xcg1.g(cy30.f(xcg1.g((this.h.hashCode() + kaa0.f(this.g, f4i1.b(f4i1.b((iHashCode + (gxz0Var == null ? 0 : gxz0Var.hashCode())) * 31, 31, this.e), 31, this.f), 31)) * 31, 31, this.i), this.t, 31), 31, this.X);
    }

    public final ctf j() {
        return this.b;
    }

    public final ArrayList k() {
        List list = this.e;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((jwm) it.next()).a);
        }
        return arrayList;
    }

    public final boolean l() {
        zks0 zks0Var = this.c;
        return zks0Var.b == xks0.c && zks0Var.d == yks0.b && (this.b instanceof btf) && this.e.size() == 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        gxz0 gxz0Var = this.d;
        if (gxz0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gxz0Var.writeToParcel(parcel, i);
        }
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            ((jwm) itM.next()).writeToParcel(parcel, i);
        }
        Iterator itM2 = kk0.m(parcel, this.f);
        while (itM2.hasNext()) {
            ((tom) itM2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.g);
        this.h.writeToParcel(parcel, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeLong(this.t);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeParcelable(this.Y, i);
    }

    public goe(String str, ctf ctfVar, zks0 zks0Var, gxz0 gxz0Var, List list, List list2, int i, jlh1 jlh1Var, boolean z, long j, boolean z2, f8j0 f8j0Var) {
        this.a = str;
        this.b = ctfVar;
        this.c = zks0Var;
        this.d = gxz0Var;
        this.e = list;
        this.f = list2;
        this.g = i;
        this.h = jlh1Var;
        this.i = z;
        this.t = j;
        this.X = z2;
        this.Y = f8j0Var;
    }
}
