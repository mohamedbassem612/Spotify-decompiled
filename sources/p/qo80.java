package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qo80 implements ci51 {
    public static final Parcelable.Creator<qo80> CREATOR = new xl80((byte) 2);
    public final lby a;
    public final String b;
    public final String c;

    public qo80(lby lbyVar, String str, String str2) {
        this.a = lbyVar;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo80)) {
            return false;
        }
        qo80 qo80Var = (qo80) obj;
        return u890.j(this.a, qo80Var.a) && u890.j(this.b, qo80Var.b) && u890.j(this.c, qo80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
