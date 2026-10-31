package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v660 implements Parcelable {
    public static final Parcelable.Creator<v660> CREATOR = new xk50((byte) 15);
    public final List a;
    public final x660 b;
    public final jq70 c;
    public final w660 d;

    public v660(List list, x660 x660Var, jq70 jq70Var, w660 w660Var) {
        this.a = list;
        this.b = x660Var;
        this.c = jq70Var;
        this.d = w660Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v660)) {
            return false;
        }
        v660 v660Var = (v660) obj;
        return this.a.equals(v660Var.a) && this.b == v660Var.b && u890.j(this.c, v660Var.c) && u890.j(this.d, v660Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        jq70 jq70Var = this.c;
        int iHashCode2 = (iHashCode + (jq70Var == null ? 0 : jq70Var.hashCode())) * 31;
        w660 w660Var = this.d;
        return iHashCode2 + (w660Var != null ? w660Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
        w660 w660Var = this.d;
        if (w660Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            w660Var.writeToParcel(parcel, i);
        }
    }
}
