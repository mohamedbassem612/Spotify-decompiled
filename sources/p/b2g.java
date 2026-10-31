package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b2g implements Parcelable, jik1 {
    public static final Parcelable.Creator<b2g> CREATOR = new wxf((byte) 10);
    public final String a;
    public final Boolean b;
    public final zzy c;

    public b2g(Boolean bool, String str, zzy zzyVar) {
        this.a = str;
        this.b = bool;
        this.c = zzyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2g)) {
            return false;
        }
        b2g b2gVar = (b2g) obj;
        return u890.j(this.a, b2gVar.a) && u890.j(this.b, b2gVar.b) && u890.j(this.c, b2gVar.c);
    }

    public final lik1 getViewUri() {
        Parcelable.Creator creator = lik1.CREATOR;
        String str = null;
        b7x b7xVar = (14 & 2) != 0 ? b7x.a : null;
        if ((14 & 8) != 0) {
            b7xVar.getClass();
            str = "spotify:internal:parental-control:child-login:" + this.a + "";
        }
        return new lik1(str);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return this.c.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Boolean bool = this.b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeParcelable(this.c, i);
    }
}
