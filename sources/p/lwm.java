package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lwm implements Parcelable {
    public static final Parcelable.Creator<lwm> CREATOR = new rtm((byte) 9);
    public final String a;
    public final String b;
    public final rwm c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;

    public lwm(String str, String str2, rwm rwmVar, Integer num, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = rwmVar;
        this.d = num;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final String d() {
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
        if (!(obj instanceof lwm)) {
            return false;
        }
        lwm lwmVar = (lwm) obj;
        return u890.j(this.a, lwmVar.a) && u890.j(this.b, lwmVar.b) && this.c == lwmVar.c && u890.j(this.d, lwmVar.d) && u890.j(this.e, lwmVar.e) && u890.j(this.f, lwmVar.f) && u890.j(this.g, lwmVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        rwm rwmVar = this.c;
        int iHashCode3 = (iHashCode2 + (rwmVar == null ? 0 : rwmVar.hashCode())) * 31;
        Integer num = this.d;
        int iD = cy30.d(cy30.d((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        rwm rwmVar = this.c;
        if (rwmVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rwmVar.name());
        }
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
