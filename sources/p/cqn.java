package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cqn implements Parcelable {
    public static final Parcelable.Creator<cqn> CREATOR = new rtm((byte) 29);
    public final String a;
    public final String b;
    public final aqn c;

    public /* synthetic */ cqn(String str, String str2, aqn aqnVar, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, aqnVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqn)) {
            return false;
        }
        cqn cqnVar = (cqn) obj;
        return u890.j(this.a, cqnVar.a) && u890.j(this.b, cqnVar.b) && u890.j(this.c, cqnVar.c);
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
        parcel.writeParcelable(this.c, i);
    }

    public cqn(String str, String str2, aqn aqnVar) {
        this.a = str;
        this.b = str2;
        this.c = aqnVar;
    }
}
