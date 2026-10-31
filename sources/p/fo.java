package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fo implements ho {
    public static final Parcelable.Creator<fo> CREATOR = new ad((byte) 28);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public fo(Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = z;
        this.f = str4;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        return u890.j(this.a, foVar.a) && u890.j(this.b, foVar.b) && u890.j(this.c, foVar.c) && u890.j(this.d, foVar.d) && this.e == foVar.e && u890.j(this.f, foVar.f) && this.g == foVar.g;
    }

    @Override // p.ho
    public final String getAvatar() {
        return this.c;
    }

    @Override // p.ho
    public final Integer getColor() {
        return this.d;
    }

    @Override // p.ho
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iG = xcg1.g((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((iG + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
