package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m8g implements o8g {
    public static final Parcelable.Creator<m8g> CREATOR = new i8g((byte) 3);
    public final t7g a;
    public final h9g b;
    public final i050 c;

    public m8g(t7g t7gVar, h9g h9gVar, i050 i050Var) {
        this.a = t7gVar;
        this.b = h9gVar;
        this.c = i050Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8g)) {
            return false;
        }
        m8g m8gVar = (m8g) obj;
        return u890.j(this.a, m8gVar.a) && u890.j(this.b, m8gVar.b) && u890.j(this.c, m8gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
    }
}
