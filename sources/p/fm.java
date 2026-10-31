package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fm extends gm {
    public static final Parcelable.Creator<fm> CREATOR = new ad((byte) 22);
    public final String a;
    public final em b;

    public fm(String str, em emVar) {
        this.a = str;
        this.b = emVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj;
        return u890.j(this.a, fmVar.a) && u890.j(this.b, fmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
