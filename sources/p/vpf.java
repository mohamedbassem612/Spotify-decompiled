package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vpf implements Parcelable {
    public static final Parcelable.Creator<vpf> CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final w4i1 g;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
        CREATOR = new zbf((byte) 29);
    }

    public vpf(String str, String str2, String str3, String str4, String str5, long j, w4i1 w4i1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = w4i1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpf)) {
            return false;
        }
        vpf vpfVar = (vpf) obj;
        return u890.j(this.a, vpfVar.a) && u890.j(this.b, vpfVar.b) && u890.j(this.c, vpfVar.c) && u890.j(this.d, vpfVar.d) && u890.j(this.e, vpfVar.e) && this.f == vpfVar.f && u890.j(this.g, vpfVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        parcel.writeParcelable(this.g, i);
    }
}
