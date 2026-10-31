package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h281 implements Parcelable {
    public static final Parcelable.Creator<h281> CREATOR = new ro71((byte) 3);
    public final String a;
    public final String b;
    public final jlw0 c;
    public final String d;
    public final Long e;

    public h281(String str, String str2, jlw0 jlw0Var, String str3, Long l) {
        this.a = str;
        this.b = str2;
        this.c = jlw0Var;
        this.d = str3;
        this.e = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h281)) {
            return false;
        }
        h281 h281Var = (h281) obj;
        return u890.j(this.a, h281Var.a) && u890.j(this.b, h281Var.b) && u890.j(this.c, h281Var.c) && u890.j(this.d, h281Var.d) && u890.j(this.e, h281Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        jlw0 jlw0Var = this.c;
        int iD2 = cy30.d((iD + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31, 31, this.d);
        Long l = this.e;
        return iD2 + (l != null ? l.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        Long l = this.e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }
}
