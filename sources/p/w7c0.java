package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w7c0 implements Parcelable {
    public static final Parcelable.Creator<w7c0> CREATOR = new v5c0((byte) 10);
    public final Map a;

    public w7c0(Map map) {
        this.a = map;
    }

    public final Object a(v7c0 v7c0Var) {
        Object obj = this.a.get(v7c0Var);
        return obj == null ? v7c0Var.getDefault() : obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7c0) && u890.j(this.a, ((w7c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itJ = xcg1.j(parcel, this.a);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeValue(entry.getValue());
        }
    }
}
