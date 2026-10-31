package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ukk1 implements vkk1 {
    public static final Parcelable.Creator<ukk1> CREATOR = new tfk1((byte) 29);
    public final ArrayList a;

    public ukk1(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukk1) && this.a.equals(((ukk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((skk1) itO.next()).writeToParcel(parcel, i);
        }
    }
}
