package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ev implements Parcelable {
    public static final Parcelable.Creator<ev> CREATOR = new gp((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;
    public final Long f;

    public /* synthetic */ ev(String str, String str2, String str3, Integer num, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, false, null);
    }

    public final boolean a() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        return u890.j(this.a, evVar.a) && u890.j(this.b, evVar.b) && u890.j(this.c, evVar.c) && u890.j(this.d, evVar.d) && this.e == evVar.e && u890.j(this.f, evVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iG = xcg1.g((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        Long l = this.f;
        return iG + (l != null ? l.hashCode() : 0);
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
        Long l = this.f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            eqq.u(parcel, 1, l);
        }
    }

    public ev(String str, String str2, String str3, Integer num, boolean z, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = z;
        this.f = l;
    }
}
