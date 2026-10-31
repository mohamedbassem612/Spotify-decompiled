package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ytm implements Parcelable {
    public static final Parcelable.Creator<ytm> CREATOR = new rtm((byte) 1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ytm(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytm)) {
            return false;
        }
        ytm ytmVar = (ytm) obj;
        return u890.j(this.a, ytmVar.a) && u890.j(this.b, ytmVar.b) && u890.j(this.c, ytmVar.c) && u890.j(this.d, ytmVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
