package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vnm1 implements wnm1 {
    public static final Parcelable.Creator<vnm1> CREATOR = new lfm1((byte) 28);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public vnm1(String str, String str2, Integer num, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnm1)) {
            return false;
        }
        vnm1 vnm1Var = (vnm1) obj;
        return u890.j(this.a, vnm1Var.a) && u890.j(this.b, vnm1Var.b) && u890.j(this.c, vnm1Var.c) && u890.j(this.d, vnm1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return iD + (num == null ? 0 : num.hashCode());
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
    }
}
