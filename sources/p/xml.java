package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xml implements oim {
    public static final Parcelable.Creator<xml> CREATOR = new txk((byte) 19);
    public final String a;
    public final lik1 b;
    public final boolean c;
    public final bjm d;

    public xml(String str, lik1 lik1Var, boolean z) {
        this.a = str;
        this.b = lik1Var;
        this.c = z;
        this.d = new bjm(6, str, (String) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xml)) {
            return false;
        }
        xml xmlVar = (xml) obj;
        return u890.j(this.a, xmlVar.a) && u890.j(this.b, xmlVar.b) && this.c == xmlVar.c;
    }

    public final bjm getTarget() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
