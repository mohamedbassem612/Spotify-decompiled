package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rnf0 implements Parcelable {
    public static final Parcelable.Creator<rnf0> CREATOR = new j7f0((byte) 24);
    public final kw9 a;
    public final String b;
    public final bef0 c;
    public final vef0 d;
    public final int e;
    public final ez61 f;
    public final String g;
    public final List h;
    public final String i;
    public final wkt t;

    public /* synthetic */ rnf0(kw9 kw9Var, String str, bef0 bef0Var, vef0 vef0Var, int i, ez61 ez61Var, String str2, ArrayList arrayList, String str3, int i2) {
        this(kw9Var, str, bef0Var, vef0Var, i, ez61Var, str2, (i2 & 128) != 0 ? z6x.a : arrayList, (i2 & 256) != 0 ? null : str3, (wkt) null);
    }

    public static rnf0 a(rnf0 rnf0Var, kw9 kw9Var, vef0 vef0Var, int i, ez61 ez61Var, String str, ArrayList arrayList, String str2, wkt wktVar, int i2) {
        if ((i2 & 1) != 0) {
            kw9Var = rnf0Var.a;
        }
        return new rnf0(kw9Var, rnf0Var.b, rnf0Var.c, (i2 & 8) != 0 ? rnf0Var.d : vef0Var, (i2 & 16) != 0 ? rnf0Var.e : i, (i2 & 32) != 0 ? rnf0Var.f : ez61Var, (i2 & 64) != 0 ? rnf0Var.g : str, (i2 & 128) != 0 ? rnf0Var.h : arrayList, (i2 & 256) != 0 ? rnf0Var.i : str2, (i2 & 512) != 0 ? rnf0Var.t : wktVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnf0)) {
            return false;
        }
        rnf0 rnf0Var = (rnf0) obj;
        return u890.j(this.a, rnf0Var.a) && u890.j(this.b, rnf0Var.b) && u890.j(this.c, rnf0Var.c) && u890.j(this.d, rnf0Var.d) && this.e == rnf0Var.e && u890.j(this.f, rnf0Var.f) && u890.j(this.g, rnf0Var.g) && u890.j(this.h, rnf0Var.h) && u890.j(this.i, rnf0Var.i) && u890.j(this.t, rnf0Var.t);
    }

    public final int hashCode() {
        int iF = pze0.f(this.f, kaa0.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31), 31);
        String str = this.g;
        int iB = f4i1.b((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        wkt wktVar = this.t;
        return iHashCode + (wktVar != null ? wktVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        Iterator itM = kk0.m(parcel, this.h);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.i);
    }

    public rnf0(kw9 kw9Var, String str, bef0 bef0Var, vef0 vef0Var, int i, ez61 ez61Var, String str2, List list, String str3, wkt wktVar) {
        this.a = kw9Var;
        this.b = str;
        this.c = bef0Var;
        this.d = vef0Var;
        this.e = i;
        this.f = ez61Var;
        this.g = str2;
        this.h = list;
        this.i = str3;
        this.t = wktVar;
    }
}
