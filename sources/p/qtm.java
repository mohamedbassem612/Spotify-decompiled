package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qtm implements ttm {
    public static final Parcelable.Creator<qtm> CREATOR = new ezl((byte) 29);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public qtm(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String M() {
        return this.e;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtm)) {
            return false;
        }
        qtm qtmVar = (qtm) obj;
        return u890.j(this.a, qtmVar.a) && u890.j(this.b, qtmVar.b) && u890.j(this.c, qtmVar.c) && u890.j(this.d, qtmVar.d) && u890.j(this.e, qtmVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
