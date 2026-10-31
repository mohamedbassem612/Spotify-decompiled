package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vgk1 implements Parcelable {
    public static final Parcelable.Creator<vgk1> CREATOR = new tfk1((byte) 24);
    public final List a;
    public final String b;
    public final rfk1 c;

    public vgk1(List list, String str, rfk1 rfk1Var) {
        this.a = list;
        this.b = str;
        this.c = rfk1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgk1)) {
            return false;
        }
        vgk1 vgk1Var = (vgk1) obj;
        return this.a.equals(vgk1Var.a) && u890.j(this.b, vgk1Var.b) && u890.j(this.c, vgk1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        rfk1 rfk1Var = this.c;
        return iD + (rfk1Var == null ? 0 : rfk1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeString(this.b);
        rfk1 rfk1Var = this.c;
        if (rfk1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rfk1Var.writeToParcel(parcel, i);
        }
    }
}
