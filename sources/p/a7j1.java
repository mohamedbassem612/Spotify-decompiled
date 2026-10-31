package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a7j1 implements Parcelable, ir0 {
    public static final Parcelable.Creator<a7j1> CREATOR = new xbi1((byte) 23);
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final r57 e;
    public final Long f;

    public a7j1(String str, int i, int i2, int i3, r57 r57Var, Long l) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = r57Var;
        this.f = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7j1)) {
            return false;
        }
        a7j1 a7j1Var = (a7j1) obj;
        return u890.j(this.a, a7j1Var.a) && this.b == a7j1Var.b && this.c == a7j1Var.c && this.d == a7j1Var.d && u890.j(this.e, a7j1Var.e) && u890.j(this.f, a7j1Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31;
        Long l = this.f;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
        Long l = this.f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }
}
