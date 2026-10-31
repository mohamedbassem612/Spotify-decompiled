package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x7g implements z7g {
    public static final Parcelable.Creator<x7g> CREATOR = new wxf((byte) 20);
    public final t7g a;
    public final h9g b;

    public x7g(t7g t7gVar, h9g h9gVar) {
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
        if (!(obj instanceof x7g)) {
            return false;
        }
        x7g x7gVar = (x7g) obj;
        return u890.j(this.a, x7gVar.a) && u890.j(this.b, x7gVar.b);
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
