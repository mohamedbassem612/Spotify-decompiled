package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class igm0 implements Parcelable {
    public static final Parcelable.Creator<igm0> CREATOR = new fgm0((byte) 4);
    public final Map a;
    public final boolean b;

    public igm0(Map map, boolean z) {
        this.a = map;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igm0)) {
            return false;
        }
        igm0 igm0Var = (igm0) obj;
        return u890.j(this.a, igm0Var.a) && this.b == igm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itJ = xcg1.j(parcel, this.a);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.b ? 1 : 0);
    }

    public /* synthetic */ igm0() {
        this(b7x.a, false);
    }
}
