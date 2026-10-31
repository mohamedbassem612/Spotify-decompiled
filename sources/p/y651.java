package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y651 implements Parcelable {
    public static final Parcelable.Creator<y651> CREATOR = new uo41((byte) 13);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final gyh f;
    public final l651 g;

    public /* synthetic */ y651(String str, String str2, String str3, boolean z, gyh gyhVar, l651 l651Var, int i) {
        this(str, str2, str3, z, (i & 16) == 0, (i & 32) != 0 ? null : gyhVar, (i & 64) != 0 ? l651.a : l651Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y651)) {
            return false;
        }
        y651 y651Var = (y651) obj;
        return u890.j(this.a, y651Var.a) && u890.j(this.b, y651Var.b) && u890.j(this.c, y651Var.c) && this.d == y651Var.d && this.e == y651Var.e && this.f == y651Var.f && this.g == y651Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        gyh gyhVar = this.f;
        return this.g.hashCode() + ((iG + (gyhVar != null ? gyhVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        gyh gyhVar = this.f;
        if (gyhVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gyhVar.name());
        }
        parcel.writeString(this.g.name());
    }

    public y651(String str, String str2, String str3, boolean z, boolean z2, gyh gyhVar, l651 l651Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = gyhVar;
        this.g = l651Var;
    }
}
