package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rqe1 implements Parcelable {
    public static final Parcelable.Creator<rqe1> CREATOR = new pwd1((byte) 18);
    public final int a;
    public final mqe1 b;
    public final srt0 c;
    public final String d;

    public rqe1(int i, mqe1 mqe1Var, srt0 srt0Var, String str) {
        this.a = i;
        this.b = mqe1Var;
        this.c = srt0Var;
        this.d = str;
    }

    public static rqe1 a(rqe1 rqe1Var, int i, mqe1 mqe1Var, srt0 srt0Var, String str, int i2) {
        if ((i2 & 1) != 0) {
            i = rqe1Var.a;
        }
        if ((i2 & 2) != 0) {
            mqe1Var = rqe1Var.b;
        }
        if ((i2 & 4) != 0) {
            srt0Var = rqe1Var.c;
        }
        if ((i2 & 8) != 0) {
            str = rqe1Var.d;
        }
        return new rqe1(i, mqe1Var, srt0Var, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqe1)) {
            return false;
        }
        rqe1 rqe1Var = (rqe1) obj;
        return this.a == rqe1Var.a && u890.j(this.b, rqe1Var.b) && u890.j(this.c, rqe1Var.c) && u890.j(this.d, rqe1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(new w871(this.d), i);
    }
}
