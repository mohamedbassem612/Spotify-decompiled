package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hes0 implements Parcelable {
    public static final Parcelable.Creator<hes0> CREATOR = new ybs0((byte) 12);
    public final kes0 a;
    public final boolean b;
    public final String c;
    public final String d;

    public hes0(kes0 kes0Var, boolean z, String str, String str2) {
        this.a = kes0Var;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static hes0 a(hes0 hes0Var, kes0 kes0Var, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            kes0Var = hes0Var.a;
        }
        if ((i & 2) != 0) {
            z = hes0Var.b;
        }
        if ((i & 4) != 0) {
            str = hes0Var.c;
        }
        if ((i & 8) != 0) {
            str2 = hes0Var.d;
        }
        hes0Var.getClass();
        return new hes0(kes0Var, z, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    /* JADX WARN: Code duplicated, block: B:28:0x0040  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hes0)) {
            return false;
        }
        hes0 hes0Var = (hes0) obj;
        if (!u890.j(this.a, hes0Var.a) || this.b != hes0Var.b) {
            return false;
        }
        String str = hes0Var.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            nl7 nl7Var = jes0.b;
            zEquals = str2.equals(str);
        }
        if (!zEquals) {
            return false;
        }
        String str3 = hes0Var.d;
        String str4 = this.d;
        if (str4 == null) {
            if (str3 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (str3 == null) {
            zEquals2 = false;
        } else {
            nl7 nl7Var2 = ges0.b;
            zEquals2 = str4.equals(str3);
        }
        return zEquals2;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = 0;
        kes0 kes0Var = this.a;
        int iG = xcg1.g((kes0Var == null ? 0 : kes0Var.hashCode()) * 31, 31, this.b);
        String str = this.c;
        if (str == null) {
            iHashCode = 0;
        } else {
            nl7 nl7Var = jes0.b;
            iHashCode = str.hashCode();
        }
        int i = (iG + iHashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            nl7 nl7Var2 = ges0.b;
            iHashCode2 = str2.hashCode();
        }
        return i + iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kes0 kes0Var = this.a;
        if (kes0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kes0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b ? 1 : 0);
        String str = this.c;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nl7 nl7Var = jes0.b;
            parcel.writeString(str);
        }
        String str2 = this.d;
        if (str2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        nl7 nl7Var2 = ges0.b;
        parcel.writeString(str2);
    }

    public /* synthetic */ hes0(String str, int i) {
        this(null, false, null, (i & 8) != 0 ? null : str);
    }
}
