package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hso implements Parcelable {
    public static final Parcelable.Creator<hso> CREATOR = new rco((byte) 17);
    public final LinkedHashMap a;
    public final ekn b;

    public hso(LinkedHashMap linkedHashMap, ekn eknVar) {
        this.a = linkedHashMap;
        this.b = eknVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hso)) {
            return false;
        }
        hso hsoVar = (hso) obj;
        return this.a.equals(hsoVar.a) && u890.j(this.b, hsoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedHashMap linkedHashMap = this.a;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeParcelable(this.b, i);
    }
}
