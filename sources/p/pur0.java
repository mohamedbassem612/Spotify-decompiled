package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pur0 implements Parcelable {
    public static final Parcelable.Creator<pur0> CREATOR = new zsr0((byte) 3);
    public final String a;
    public final vur0 b;
    public final String c;
    public final String d;
    public final p6r0 e;
    public final lik1 f;

    public pur0(String str, vur0 vur0Var, String str2, String str3, p6r0 p6r0Var, lik1 lik1Var) {
        this.a = str;
        this.b = vur0Var;
        this.c = str2;
        this.d = str3;
        this.e = p6r0Var;
        this.f = lik1Var;
    }

    public final lik1 a() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p6r0 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pur0)) {
            return false;
        }
        pur0 pur0Var = (pur0) obj;
        return u890.j(this.a, pur0Var.a) && this.b == pur0Var.b && u890.j(this.c, pur0Var.c) && u890.j(this.d, pur0Var.d) && u890.j(this.e, pur0Var.e) && u890.j(this.f, pur0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.f.a.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeParcelable(this.f, i);
    }
}
