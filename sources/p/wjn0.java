package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wjn0 implements Parcelable {
    public static final Parcelable.Creator<wjn0> CREATOR = new dan0((byte) 7);
    public final vjn0 a;
    public final boolean b;
    public final boolean c;
    public final ub d;

    static {
        new wjn0(null, 15);
    }

    public /* synthetic */ wjn0(ujn0 ujn0Var, int i) {
        this((i & 1) != 0 ? tjn0.b : ujn0Var, false, false, new sb(new oc(false), new kc(false, false), new ec(false, false), new yc(false, false), false));
    }

    public static wjn0 a(wjn0 wjn0Var, vjn0 vjn0Var, boolean z, ub ubVar, int i) {
        if ((i & 1) != 0) {
            vjn0Var = wjn0Var.a;
        }
        boolean z2 = (i & 2) != 0 ? wjn0Var.b : false;
        if ((i & 4) != 0) {
            z = wjn0Var.c;
        }
        if ((i & 8) != 0) {
            ubVar = wjn0Var.d;
        }
        wjn0Var.getClass();
        return new wjn0(vjn0Var, z2, z, ubVar);
    }

    public final vjn0 b() {
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
        if (!(obj instanceof wjn0)) {
            return false;
        }
        wjn0 wjn0Var = (wjn0) obj;
        return u890.j(this.a, wjn0Var.a) && this.b == wjn0Var.b && this.c == wjn0Var.c && u890.j(this.d, wjn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "NameModel(nameState=" + rc11.a.b(this.a.getClass()).r() + ", isLoading=" + this.b + ", isScreenReaderEnabled=" + this.c + ", acceptanceModel=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeParcelable(this.d, i);
    }

    public wjn0(vjn0 vjn0Var, boolean z, boolean z2, ub ubVar) {
        this.a = vjn0Var;
        this.b = z;
        this.c = z2;
        this.d = ubVar;
    }
}
