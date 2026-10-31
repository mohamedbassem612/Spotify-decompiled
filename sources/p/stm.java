package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class stm implements ttm {
    public static final Parcelable.Creator<stm> CREATOR = new rtm((byte) 0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public stm(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // p.ttm
    public final String M() {
        return this.e;
    }

    @Override // p.ttm
    public final String c() {
        return this.c;
    }

    @Override // p.ttm
    public final String d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stm)) {
            return false;
        }
        stm stmVar = (stm) obj;
        return u890.j(this.a, stmVar.a) && u890.j(this.b, stmVar.b) && u890.j(this.c, stmVar.c) && u890.j(this.d, stmVar.d) && u890.j(this.e, stmVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
