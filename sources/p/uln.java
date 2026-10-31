package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uln implements Parcelable {
    public static final Parcelable.Creator<uln> CREATOR;
    public final String a;
    public final String b;
    public final i971 c;

    static {
        Parcelable.Creator creator = w4i1.CREATOR;
        CREATOR = new rtm((byte) 26);
    }

    public uln(String str, String str2, i971 i971Var) {
        this.a = str;
        this.b = str2;
        this.c = i971Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uln)) {
            return false;
        }
        uln ulnVar = (uln) obj;
        return u890.j(this.a, ulnVar.a) && u890.j(this.b, ulnVar.b) && u890.j(this.c, ulnVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
    }
}
