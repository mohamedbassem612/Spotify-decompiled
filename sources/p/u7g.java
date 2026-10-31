package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u7g implements w7g {
    public static final Parcelable.Creator<u7g> CREATOR = new wxf((byte) 18);
    public final t7g a;
    public final h9g b;

    public u7g(t7g t7gVar, h9g h9gVar) {
        this.a = t7gVar;
        this.b = h9gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7g)) {
            return false;
        }
        u7g u7gVar = (u7g) obj;
        return u890.j(this.a, u7gVar.a) && u890.j(this.b, u7gVar.b);
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
