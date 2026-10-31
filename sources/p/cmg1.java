package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cmg1 implements Parcelable {
    public static final Parcelable.Creator<cmg1> CREATOR = new h3g1((byte) 11);
    public final yxa0 a;
    public final String b;
    public final String c;
    public final String d;
    public final dxr0 e;
    public final vur0 f;
    public final yq00 g;

    public cmg1(yxa0 yxa0Var, String str, String str2, String str3, dxr0 dxr0Var, vur0 vur0Var, yq00 yq00Var) {
        this.a = yxa0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = dxr0Var;
        this.f = vur0Var;
        this.g = yq00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmg1)) {
            return false;
        }
        cmg1 cmg1Var = (cmg1) obj;
        return u890.j(this.a, cmg1Var.a) && u890.j(this.b, cmg1Var.b) && u890.j(this.c, cmg1Var.c) && u890.j(this.d, cmg1Var.d) && u890.j(this.e, cmg1Var.e) && this.f == cmg1Var.f && u890.j(this.g, cmg1Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        vur0 vur0Var = this.f;
        int iHashCode5 = (iHashCode4 + (vur0Var == null ? 0 : vur0Var.hashCode())) * 31;
        yq00 yq00Var = this.g;
        return iHashCode5 + (yq00Var != null ? yq00Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        vur0 vur0Var = this.f;
        if (vur0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(vur0Var.name());
        }
        parcel.writeParcelable(this.g, i);
    }
}
