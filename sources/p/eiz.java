package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eiz implements Parcelable {
    public static final Parcelable.Creator<eiz> CREATOR = new dez((byte) 9);
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final sg90 e;
    public final boolean f;

    public eiz(String str, String str2, int i, String str3, sg90 sg90Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = sg90Var;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eiz)) {
            return false;
        }
        eiz eizVar = (eiz) obj;
        return u890.j(this.a, eizVar.a) && u890.j(this.b, eizVar.b) && this.c == eizVar.c && u890.j(this.d, eizVar.d) && u890.j(this.e, eizVar.e) && this.f == eizVar.f;
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        sg90 sg90Var = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (sg90Var != null ? sg90Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(zjy.r(this.c));
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ eiz(int i, String str, String str2, String str3, sg90 sg90Var) {
        this(str, str2, i, str3, sg90Var, false);
    }
}
