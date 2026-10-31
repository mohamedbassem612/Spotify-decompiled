package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h8g implements s8g {
    public static final Parcelable.Creator<h8g> CREATOR = new wxf((byte) 29);
    public final t7g a;
    public final f9g b;

    public h8g(t7g t7gVar, f9g f9gVar) {
        this.a = t7gVar;
        this.b = f9gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8g)) {
            return false;
        }
        h8g h8gVar = (h8g) obj;
        return u890.j(this.a, h8gVar.a) && u890.j(this.b, h8gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
