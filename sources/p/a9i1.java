package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a9i1 implements Parcelable {
    public static final Parcelable.Creator<a9i1> CREATOR = new gwg1((byte) 29);
    public final String a;
    public final eaa0 b;
    public final px10 c;
    public final e490 d;
    public final c490 e;
    public final String f;

    public a9i1(String str, eaa0 eaa0Var, px10 px10Var, e490 e490Var, c490 c490Var, String str2) {
        this.a = str;
        this.b = eaa0Var;
        this.c = px10Var;
        this.d = e490Var;
        this.e = c490Var;
        this.f = str2;
    }

    public final c490 a() {
        return this.e;
    }

    public final e490 b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9i1)) {
            return false;
        }
        a9i1 a9i1Var = (a9i1) obj;
        return u890.j(this.a, a9i1Var.a) && u890.j(this.b, a9i1Var.b) && this.c == a9i1Var.c && this.d == a9i1Var.d && u890.j(this.e, a9i1Var.e) && u890.j(this.f, a9i1Var.f);
    }

    public final String g() {
        return this.f;
    }

    public final eaa0 h() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        eaa0 eaa0Var = this.b;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (eaa0Var == null ? 0 : eaa0Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final px10 j() {
        return this.c;
    }

    public final String k() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
    }
}
