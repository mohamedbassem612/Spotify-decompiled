package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q8b implements Parcelable {
    public static final Parcelable.Creator<q8b> CREATOR = new mra((byte) 13);
    public final boolean a;
    public final List b;

    public q8b(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8b)) {
            return false;
        }
        q8b q8bVar = (q8b) obj;
        return this.a == q8bVar.a && u890.j(this.b, q8bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeStringList(this.b);
    }
}
