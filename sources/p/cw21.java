package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cw21 implements Parcelable {
    public static final Parcelable.Creator<cw21> CREATOR = new g321((byte) 23);
    public final LinkedHashMap a;
    public final LinkedHashMap b;

    public cw21(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw21)) {
            return false;
        }
        cw21 cw21Var = (cw21) obj;
        return this.a.equals(cw21Var.a) && this.b.equals(cw21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedHashMap linkedHashMap = this.a;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString(((m7f0) entry.getKey()).name());
            ((l7f0) entry.getValue()).writeToParcel(parcel, i);
        }
        LinkedHashMap linkedHashMap2 = this.b;
        parcel.writeInt(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            parcel.writeString(((vaa0) entry2.getKey()).name());
            ((uaa0) entry2.getValue()).writeToParcel(parcel, i);
        }
    }
}
