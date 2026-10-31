package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cy1 implements gy1 {
    public static final Parcelable.Creator<cy1> CREATOR = new ev1((byte) 4);
    public final LinkedHashSet a;
    public final LinkedHashSet b;

    public cy1(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.a = linkedHashSet;
        this.b = linkedHashSet2;
    }

    public final Set a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy1)) {
            return false;
        }
        cy1 cy1Var = (cy1) obj;
        return this.a.equals(cy1Var.a) && this.b.equals(cy1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedHashSet linkedHashSet = this.a;
        parcel.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        LinkedHashSet linkedHashSet2 = this.b;
        parcel.writeInt(linkedHashSet2.size());
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            parcel.writeString((String) it2.next());
        }
    }
}
