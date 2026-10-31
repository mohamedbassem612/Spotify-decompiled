package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ttm1 implements Parcelable {
    public static final Parcelable.Creator<ttm1> CREATOR = new ynm1(5);
    public static final Map i = sqg0.J(new mmr0[]{new mmr0(aey.a, tlb.class), new mmr0(aey.b, y481.class), new mmr0(aey.c, j93.class), new mmr0(aey.d, ha00.class), new mmr0(aey.e, lxi1.class), new mmr0(aey.f, ho6.class), new mmr0(aey.g, do8.class), new mmr0(aey.h, y030.class), new mmr0(aey.i, obn.class), new mmr0(aey.t, xlu0.class), new mmr0(aey.X, giv0.class), new mmr0(aey.Y, h9o0.class), new mmr0(aey.Z, bbk.class), new mmr0(aey.N0, sy3.class)});
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final aey e;
    public final String f;
    public final nb10 g;
    public final int h;

    public ttm1(String str, String str2, boolean z, String str3, aey aeyVar, String str4, nb10 nb10Var, int i2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = aeyVar;
        this.f = str4;
        this.g = nb10Var;
        this.h = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttm1)) {
            return false;
        }
        ttm1 ttm1Var = (ttm1) obj;
        return u890.j(this.a, ttm1Var.a) && u890.j(this.b, ttm1Var.b) && this.c == ttm1Var.c && u890.j(this.d, ttm1Var.d) && this.e == ttm1Var.e && u890.j(this.f, ttm1Var.f) && u890.j(this.g, ttm1Var.g) && this.h == ttm1Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        nb10 nb10Var = this.g;
        return l1d.C(this.h) + ((iHashCode2 + (nb10Var != null ? nb10Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i2);
        int i3 = this.h;
        if (i3 == 1) {
            str = "Empty";
        } else if (i3 == 2) {
            str = "Waiting";
        } else if (i3 == 3) {
            str = "Downloading";
        } else if (i3 == 4) {
            str = "Downloaded";
        } else {
            if (i3 != 5) {
                throw null;
            }
            str = "Error";
        }
        parcel.writeString(str);
    }

    public /* synthetic */ ttm1(String str, String str2, String str3, aey aeyVar, nb10 nb10Var) {
        this(str, str2, false, str3, aeyVar, null, nb10Var, 1);
    }
}
