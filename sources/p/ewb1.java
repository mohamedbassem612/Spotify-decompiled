package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ewb1 implements Parcelable {
    public static final Parcelable.Creator<ewb1> CREATOR = new yub1((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final cwb1 f;
    public final iwb1 g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ ewb1(String str, String str2, String str3, String str4, boolean z, cwb1 cwb1Var, iwb1 iwb1Var, boolean z2, int i) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : cwb1Var, (i & 64) != 0 ? hwb1.a : iwb1Var, (i & 128) != 0 ? false : z2, false);
    }

    public final boolean a() {
        return this.h;
    }

    public final iwb1 b() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewb1)) {
            return false;
        }
        ewb1 ewb1Var = (ewb1) obj;
        return u890.j(this.a, ewb1Var.a) && u890.j(this.b, ewb1Var.b) && u890.j(this.c, ewb1Var.c) && u890.j(this.d, ewb1Var.d) && this.e == ewb1Var.e && u890.j(this.f, ewb1Var.f) && u890.j(this.g, ewb1Var.g) && this.h == ewb1Var.h && this.i == ewb1Var.i;
    }

    public final String g() {
        return this.a;
    }

    public final String getContextUri() {
        return this.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        cwb1 cwb1Var = this.f;
        return Boolean.hashCode(this.i) + xcg1.g((this.g.hashCode() + ((iG + (cwb1Var == null ? 0 : cwb1Var.hashCode())) * 31)) * 31, 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        cwb1 cwb1Var = this.f;
        if (cwb1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cwb1Var.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }

    public ewb1(String str, String str2, String str3, String str4, boolean z, cwb1 cwb1Var, iwb1 iwb1Var, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = cwb1Var;
        this.g = iwb1Var;
        this.h = z2;
        this.i = z3;
    }
}
