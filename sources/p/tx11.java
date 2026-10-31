package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tx11 implements xx11 {
    public static final Parcelable.Creator<tx11> CREATOR = new e211((byte) 21);
    public final String a;
    public final String b;
    public final Set c;

    public tx11(String str, String str2, Set set) {
        this.a = str;
        this.b = str2;
        this.c = set;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx11)) {
            return false;
        }
        tx11 tx11Var = (tx11) obj;
        return u890.j(this.a, tx11Var.a) && u890.j(this.b, tx11Var.b) && this.c.equals(tx11Var.c);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itH = k4s0.h(this.c, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
    }
}
