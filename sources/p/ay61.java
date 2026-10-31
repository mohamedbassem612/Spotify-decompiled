package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ay61 implements Parcelable {
    public static final Parcelable.Creator<ay61> CREATOR = new hs61((byte) 11);
    public final c380 X;
    public final gy71 Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final cqs0 e;
    public final c380 f;
    public final int g;
    public final bef0 h;
    public final boolean i;
    public final int t;

    public ay61(String str, String str2, String str3, String str4, cqs0 cqs0Var, c9 c9Var, bef0 bef0Var, boolean z, int i, c380 c380Var, gy71 gy71Var, String str5, int i2) {
        this(str, str2, str3, str4, cqs0Var, (c380) c9Var, 0, bef0Var, z, i, (i2 & 1024) != 0 ? fg91.b : c380Var, (i2 & 2048) != 0 ? null : gy71Var, (i2 & 4096) != 0 ? null : str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay61)) {
            return false;
        }
        ay61 ay61Var = (ay61) obj;
        return u890.j(this.a, ay61Var.a) && u890.j(this.b, ay61Var.b) && u890.j(this.c, ay61Var.c) && u890.j(this.d, ay61Var.d) && u890.j(this.e, ay61Var.e) && u890.j(this.f, ay61Var.f) && this.g == ay61Var.g && u890.j(this.h, ay61Var.h) && this.i == ay61Var.i && this.t == ay61Var.t && u890.j(this.X, ay61Var.X) && u890.j(this.Y, ay61Var.Y) && u890.j(this.Z, ay61Var.Z);
    }

    public final int hashCode() {
        int iF = kk0.f(this.X, ab80.k(this.t, xcg1.g((this.h.hashCode() + kaa0.f(this.g, kk0.f(this.f, (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31), 31)) * 31, 31, this.i), 31), 31);
        gy71 gy71Var = this.Y;
        int iHashCode = (iF + (gy71Var == null ? 0 : gy71Var.hashCode())) * 31;
        String str = this.Z;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        m7 m7Var = this.e;
        parcel.writeInt(m7Var.c());
        for (Map.Entry entry : m7Var.a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Iterator itL = x0d.l(this.f, parcel);
        while (itL.hasNext()) {
            ((k9h) itL.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(pze0.q(this.t));
        Iterator itL2 = x0d.l(this.X, parcel);
        while (itL2.hasNext()) {
            ((opf0) itL2.next()).writeToParcel(parcel, i);
        }
        gy71 gy71Var = this.Y;
        if (gy71Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gy71Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.Z);
    }

    public ay61(String str, String str2, String str3, String str4, cqs0 cqs0Var, c380 c380Var, int i, bef0 bef0Var, boolean z, int i2, c380 c380Var2, gy71 gy71Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = cqs0Var;
        this.f = c380Var;
        this.g = i;
        this.h = bef0Var;
        this.i = z;
        this.t = i2;
        this.X = c380Var2;
        this.Y = gy71Var;
        this.Z = str5;
    }
}
