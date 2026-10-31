package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class opl implements Parcelable {
    public static final Parcelable.Creator<opl> CREATOR = new pol((byte) 17);
    public final String a;
    public final int b;
    public final mg31 c;

    public opl(String str, int i, mg31 mg31Var) {
        this.a = str;
        this.b = i;
        this.c = mg31Var;
    }

    public final int a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opl)) {
            return false;
        }
        opl oplVar = (opl) obj;
        return u890.j(this.a, oplVar.a) && this.b == oplVar.b && u890.j(this.c, oplVar.c);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        mg31 mg31Var = this.c;
        return iK + (mg31Var == null ? 0 : mg31Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "IMAGE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "VIDEO";
        }
        parcel.writeString(str);
        mg31 mg31Var = this.c;
        if (mg31Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mg31Var.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ opl(String str, int i) {
        this(str, i, null);
    }
}
