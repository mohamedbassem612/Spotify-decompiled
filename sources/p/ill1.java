package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ill1 implements Parcelable {
    public static final Parcelable.Creator<ill1> CREATOR = new ylk1((byte) 22);
    public final String a;
    public final Map b;

    public ill1(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ill1)) {
            return false;
        }
        ill1 ill1Var = (ill1) obj;
        return u890.j(this.a, ill1Var.a) && u890.j(this.b, ill1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itJ = xcg1.j(parcel, this.b);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
