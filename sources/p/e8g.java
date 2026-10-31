package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e8g implements s8g {
    public static final Parcelable.Creator<e8g> CREATOR = new wxf((byte) 26);
    public final t7g a;
    public final h9g b;
    public final int c;

    public e8g(t7g t7gVar, h9g h9gVar, int i) {
        this.a = t7gVar;
        this.b = h9gVar;
        this.c = i;
    }

    public static e8g a(e8g e8gVar, h9g h9gVar, int i, int i2) {
        t7g t7gVar = e8gVar.a;
        if ((i2 & 2) != 0) {
            h9gVar = e8gVar.b;
        }
        if ((i2 & 4) != 0) {
            i = e8gVar.c;
        }
        e8gVar.getClass();
        return new e8g(t7gVar, h9gVar, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8g)) {
            return false;
        }
        e8g e8gVar = (e8g) obj;
        return u890.j(this.a, e8gVar.a) && u890.j(this.b, e8gVar.b) && this.c == e8gVar.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = this.c;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        int i2 = this.c;
        if (i2 == 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        if (i2 == 1) {
            str = "SPOTIFY";
        } else if (i2 == 2) {
            str = "SPOTIFY_NATIVE";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "GPB";
        }
        parcel.writeString(str);
    }
}
