package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q8f1 implements Parcelable {
    public static final Parcelable.Creator<q8f1> CREATOR = new lse1((byte) 29);
    public final String a;
    public final String b;
    public final xxh c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final d761 h;
    public final int i;
    public final List t;

    public q8f1(String str, String str2, xxh xxhVar, String str3, int i, String str4, String str5, d761 d761Var, int i2, List list) {
        this.a = str;
        this.b = str2;
        this.c = xxhVar;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = d761Var;
        this.i = i2;
        this.t = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8f1)) {
            return false;
        }
        q8f1 q8f1Var = (q8f1) obj;
        return u890.j(this.a, q8f1Var.a) && u890.j(this.b, q8f1Var.b) && u890.j(this.c, q8f1Var.c) && u890.j(this.d, q8f1Var.d) && this.e == q8f1Var.e && u890.j(this.f, q8f1Var.f) && u890.j(this.g, q8f1Var.g) && u890.j(this.h, q8f1Var.h) && this.i == q8f1Var.i && u890.j(this.t, q8f1Var.t);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.e, cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31), 31, this.f), 31, this.g);
        d761 d761Var = this.h;
        int iHashCode = (iD + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31;
        int i = this.i;
        return this.t.hashCode() + ((iHashCode + (i != 0 ? l1d.C(i) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        int i2 = this.i;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(us71.q(i2));
        }
        Iterator itM = kk0.m(parcel, this.t);
        while (itM.hasNext()) {
            ((m8f1) itM.next()).writeToParcel(parcel, i);
        }
    }
}
