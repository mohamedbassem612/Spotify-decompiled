package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class gzf implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final Integer f;
    public final boolean g;
    public static final fzf Companion = new fzf();
    public static final Parcelable.Creator<gzf> CREATOR = new wxf(8);

    public /* synthetic */ gzf(int i, String str, String str2, String str3, boolean z, String str4, Integer num, boolean z2) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, ezf.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzf)) {
            return false;
        }
        gzf gzfVar = (gzf) obj;
        return u890.j(this.a, gzfVar.a) && u890.j(this.b, gzfVar.b) && u890.j(this.c, gzfVar.c) && this.d == gzfVar.d && u890.j(this.e, gzfVar.e) && u890.j(this.f, gzfVar.f) && this.g == gzfVar.g;
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.g ? 1 : 0);
    }

    public gzf(Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = num;
        this.g = z2;
    }
}
