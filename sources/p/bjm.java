package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bjm implements Parcelable {
    public static final Parcelable.Creator<bjm> CREATOR = new ezl(14);
    public final String a;
    public final String b;
    public final String c;

    public bjm(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjm)) {
            return false;
        }
        bjm bjmVar = (bjm) obj;
        return u890.j(this.a, bjmVar.a) && u890.j(this.b, bjmVar.b) && u890.j(this.c, bjmVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public /* synthetic */ bjm(int i, String str, String str2) {
        this(str, (i & 2) != 0 ? null : str2, (String) null);
    }
}
