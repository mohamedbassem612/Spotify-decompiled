package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pye0 implements Parcelable, jik1 {
    public static final Parcelable.Creator<pye0> CREATOR = new rwe0((byte) 4);
    public final String a;
    public final zzy b;
    public final int c;
    public final Boolean d;

    public pye0(String str, zzy zzyVar, int i, Boolean bool) {
        this.a = str;
        this.b = zzyVar;
        this.c = i;
        this.d = bool;
    }

    public final String a() {
        return this.a;
    }

    public final zzy b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pye0)) {
            return false;
        }
        pye0 pye0Var = (pye0) obj;
        return u890.j(this.a, pye0Var.a) && u890.j(this.b, pye0Var.b) && this.c == pye0Var.c && u890.j(this.d, pye0Var.d);
    }

    public final int g() {
        return this.c;
    }

    public final lik1 getViewUri() {
        return cfm0.i("spotify:internal:parental-control:login-choice:", this.a, nik1.n0);
    }

    public final Boolean h() {
        return this.d;
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        Boolean bool = this.d;
        return iK + (bool == null ? 0 : bool.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "NONE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "QUICKSILVER";
        }
        parcel.writeString(str);
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
    }
}
