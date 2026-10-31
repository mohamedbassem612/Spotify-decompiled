package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class def0 implements Parcelable {
    public static final Parcelable.Creator<def0> CREATOR = new j7f0(9);
    public final String a;
    public final List b;
    public final boolean c;

    public def0(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof def0)) {
            return false;
        }
        def0 def0Var = (def0) obj;
        return u890.j(this.a, def0Var.a) && u890.j(this.b, def0Var.b) && this.c == def0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
