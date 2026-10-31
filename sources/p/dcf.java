package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dcf implements gcf {
    public static final Parcelable.Creator<dcf> CREATOR = new zbf((byte) 4);
    public final String a;
    public final tom b;
    public final tom c;

    public dcf(String str, tom tomVar, tom tomVar2) {
        this.a = str;
        this.b = tomVar;
        this.c = tomVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcf)) {
            return false;
        }
        dcf dcfVar = (dcf) obj;
        return u890.j(this.a, dcfVar.a) && u890.j(this.b, dcfVar.b) && u890.j(this.c, dcfVar.c);
    }

    @Override // p.gcf
    public final String getRequestId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }
}
