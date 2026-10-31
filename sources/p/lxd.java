package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lxd extends u9 {
    public static final Parcelable.Creator<lxd> CREATOR = new xud((byte) 11);
    public final String a;
    public final p791 b;

    public lxd(String str, p791 p791Var) {
        this.a = str;
        this.b = p791Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxd)) {
            return false;
        }
        lxd lxdVar = (lxd) obj;
        return u890.j(this.a, lxdVar.a) && this.b == lxdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
