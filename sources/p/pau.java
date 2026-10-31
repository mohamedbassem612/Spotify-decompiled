package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pau implements Parcelable {
    public static final Parcelable.Creator<pau> CREATOR = new zrt((byte) 11);
    public final int a;
    public final wt91 b;

    public pau(int i, wt91 wt91Var) {
        this.a = i;
        this.b = wt91Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pau)) {
            return false;
        }
        pau pauVar = (pau) obj;
        return this.a == pauVar.a && u890.j(this.b, pauVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
