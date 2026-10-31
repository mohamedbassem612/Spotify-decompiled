package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p8g implements r8g {
    public static final Parcelable.Creator<p8g> CREATOR = new i8g((byte) 5);
    public final boolean a;
    public final t7g b;
    public final h9g c;
    public final i050 d;

    public p8g(boolean z, t7g t7gVar, h9g h9gVar, i050 i050Var) {
        this.a = z;
        this.b = t7gVar;
        this.c = h9gVar;
        this.d = i050Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8g)) {
            return false;
        }
        p8g p8gVar = (p8g) obj;
        return this.a == p8gVar.a && u890.j(this.b, p8gVar.b) && u890.j(this.c, p8gVar.c) && u890.j(this.d, p8gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeParcelable(this.d, i);
    }
}
