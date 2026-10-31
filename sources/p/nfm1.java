package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nfm1 extends c871 {
    public static final Parcelable.Creator<nfm1> CREATOR = new lfm1(1);
    public final String a;
    public final mfm1 b;
    public final String c;
    public final jfm1 d;
    public final ifm1 e;

    public nfm1(String str, mfm1 mfm1Var, String str2, jfm1 jfm1Var, ifm1 ifm1Var) {
        this.a = str;
        this.b = mfm1Var;
        this.c = str2;
        this.d = jfm1Var;
        this.e = ifm1Var;
    }

    public final String a() {
        return this.c;
    }

    public final ifm1 b() {
        return this.e;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfm1)) {
            return false;
        }
        nfm1 nfm1Var = (nfm1) obj;
        return u890.j(this.a, nfm1Var.a) && u890.j(this.b, nfm1Var.b) && u890.j(this.c, nfm1Var.c) && u890.j(this.d, nfm1Var.d) && u890.j(this.e, nfm1Var.e);
    }

    public final String g() {
        return this.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeParcelable(this.e, i);
    }
}
