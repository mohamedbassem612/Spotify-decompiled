package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bot0 implements Parcelable {
    public static final Parcelable.Creator<bot0> CREATOR = new r7t0((byte) 27);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final pbf0 e;
    public final List f;
    public final vrt0 g;
    public final lhz0 h;
    public final List i;

    public bot0(String str, String str2, int i, int i2, pbf0 pbf0Var, List list, vrt0 vrt0Var, lhz0 lhz0Var, List list2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = pbf0Var;
        this.f = list;
        this.g = vrt0Var;
        this.h = lhz0Var;
        this.i = list2;
    }

    public static bot0 a(bot0 bot0Var, int i, vrt0 vrt0Var, lhz0 lhz0Var, ArrayList arrayList, int i2) {
        String str = bot0Var.a;
        String str2 = bot0Var.b;
        if ((i2 & 4) != 0) {
            i = bot0Var.c;
        }
        int i3 = i;
        int i4 = bot0Var.d;
        pbf0 pbf0Var = bot0Var.e;
        List list = bot0Var.f;
        if ((i2 & 64) != 0) {
            vrt0Var = bot0Var.g;
        }
        vrt0 vrt0Var2 = vrt0Var;
        if ((i2 & 128) != 0) {
            lhz0Var = bot0Var.h;
        }
        lhz0 lhz0Var2 = lhz0Var;
        List list2 = arrayList;
        if ((i2 & 256) != 0) {
            list2 = bot0Var.i;
        }
        return new bot0(str, str2, i3, i4, pbf0Var, list, vrt0Var2, lhz0Var2, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bot0)) {
            return false;
        }
        bot0 bot0Var = (bot0) obj;
        return u890.j(this.a, bot0Var.a) && u890.j(this.b, bot0Var.b) && this.c == bot0Var.c && this.d == bot0Var.d && u890.j(this.e, bot0Var.e) && u890.j(this.f, bot0Var.f) && u890.j(this.g, bot0Var.g) && u890.j(this.h, bot0Var.h) && u890.j(this.i, bot0Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iF = kaa0.f(this.d, kaa0.f(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        pbf0 pbf0Var = this.e;
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + f4i1.b((iF + (pbf0Var != null ? pbf0Var.hashCode() : 0)) * 31, 31, this.f)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        Iterator itM2 = kk0.m(parcel, this.i);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
    }

    public /* synthetic */ bot0(String str, String str2, int i, pbf0 pbf0Var, List list) {
        this(str, str2, 0, i, pbf0Var, list, new art0(cbe0.a), khz0.a, z6x.a);
    }
}
