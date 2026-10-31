package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fhs0 implements Parcelable {
    public static final Parcelable.Creator<fhs0> CREATOR = new ybs0((byte) 24);
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;
    public final String e;
    public final c380 f;

    public fhs0(String str, String str2, c380 c380Var, String str3, String str4, c380 c380Var2) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = str3;
        this.e = str4;
        this.f = c380Var2;
    }

    public static fhs0 a(fhs0 fhs0Var, c380 c380Var) {
        String str = fhs0Var.a;
        String str2 = fhs0Var.b;
        String str3 = fhs0Var.d;
        String str4 = fhs0Var.e;
        c380 c380Var2 = fhs0Var.f;
        fhs0Var.getClass();
        return new fhs0(str, str2, c380Var, str3, str4, c380Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhs0)) {
            return false;
        }
        fhs0 fhs0Var = (fhs0) obj;
        return u890.j(this.a, fhs0Var.a) && u890.j(this.b, fhs0Var.b) && u890.j(this.c, fhs0Var.c) && u890.j(this.d, fhs0Var.d) && u890.j(this.e, fhs0Var.e) && u890.j(this.f, fhs0Var.f);
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c380 c380Var = this.f;
        return iHashCode2 + (c380Var != null ? c380Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itL = x0d.l(this.c, parcel);
        while (itL.hasNext()) {
            parcel.writeParcelable((Parcelable) itL.next(), i);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
    }
}
