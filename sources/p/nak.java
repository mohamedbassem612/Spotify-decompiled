package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nak implements Parcelable {
    public static final Parcelable.Creator<nak> CREATOR = new v6h((byte) 17);
    public final String a;
    public final String b;
    public final ccr c;

    public nak(String str, String str2, ccr ccrVar) {
        this.a = str;
        this.b = str2;
        this.c = ccrVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nak)) {
            return false;
        }
        nak nakVar = (nak) obj;
        return u890.j(this.a, nakVar.a) && u890.j(this.b, nakVar.b) && this.c == nakVar.c;
    }

    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        ccr ccrVar = this.c;
        return iD + (ccrVar == null ? 0 : ccrVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        ccr ccrVar = this.c;
        if (ccrVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ccrVar.name());
        }
    }
}
