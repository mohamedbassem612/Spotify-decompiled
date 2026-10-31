package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class go implements ho {
    public static final Parcelable.Creator<go> CREATOR = new ad((byte) 29);
    public final String a;
    public final String b;
    public final Integer c;

    public go(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return u890.j(this.a, goVar.a) && u890.j(this.b, goVar.b) && u890.j(this.c, goVar.c);
    }

    @Override // p.ho
    public final String getAvatar() {
        return this.b;
    }

    @Override // p.ho
    public final Integer getColor() {
        return this.c;
    }

    @Override // p.ho
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
