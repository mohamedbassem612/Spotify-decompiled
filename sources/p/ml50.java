package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ml50 implements nl50 {
    public static final Parcelable.Creator<ml50> CREATOR = new xk50((byte) 6);
    public final String a;
    public final String b;
    public final List c;

    public ml50(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final String U() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml50)) {
            return false;
        }
        ml50 ml50Var = (ml50) obj;
        return u890.j(this.a, ml50Var.a) && u890.j(this.b, ml50Var.b) && u890.j(this.c, ml50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String i1() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
    }
}
