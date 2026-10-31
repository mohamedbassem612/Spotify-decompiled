package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yit implements cjt, dkt {
    public static final Parcelable.Creator<yit> CREATOR = new qms((byte) 10);
    public final l3f0 a;
    public final bk8 b;
    public final n5o c;
    public final boolean d;

    public yit(l3f0 l3f0Var, bk8 bk8Var, n5o n5oVar, boolean z) {
        this.a = l3f0Var;
        this.b = bk8Var;
        this.c = n5oVar;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yit)) {
            return false;
        }
        yit yitVar = (yit) obj;
        return u890.j(this.a, yitVar.a) && this.b == yitVar.b && u890.j(this.c, yitVar.c) && this.d == yitVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        n5o n5oVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (n5oVar == null ? 0 : n5oVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b.name());
        n5o n5oVar = this.c;
        if (n5oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            n5oVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ yit(l3f0 l3f0Var, bk8 bk8Var, n5o n5oVar, int i) {
        this(l3f0Var, bk8Var, (i & 4) != 0 ? null : n5oVar, false);
    }
}
