package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wol implements apl {
    public static final Parcelable.Creator<wol> CREATOR = new pol((byte) 4);
    public final String a;
    public final lg31 b;
    public final boolean c;

    public wol(String str, lg31 lg31Var, boolean z) {
        this.a = str;
        this.b = lg31Var;
        this.c = z;
    }

    public static wol a(wol wolVar, lg31 lg31Var, int i) {
        String str = wolVar.a;
        if ((i & 2) != 0) {
            lg31Var = wolVar.b;
        }
        return new wol(str, lg31Var, (i & 4) != 0 ? wolVar.c : true);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wol)) {
            return false;
        }
        wol wolVar = (wol) obj;
        return u890.j(this.a, wolVar.a) && u890.j(this.b, wolVar.b) && this.c == wolVar.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lg31 lg31Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (lg31Var == null ? 0 : lg31Var.hashCode())) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        lg31 lg31Var = this.b;
        if (lg31Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lg31Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c ? 1 : 0);
    }

    public /* synthetic */ wol(String str, lg31 lg31Var, int i) {
        this(str, (i & 2) != 0 ? null : lg31Var, false);
    }
}
