package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i3g1 implements Parcelable {
    public static final Parcelable.Creator<i3g1> CREATOR = new h3g1((byte) 0);
    public final String a;
    public final String b;
    public final String c;

    public i3g1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static i3g1 a(i3g1 i3g1Var, String str, String str2, int i) {
        String str3 = i3g1Var.a;
        if ((i & 2) != 0) {
            str = i3g1Var.b;
        }
        if ((i & 4) != 0) {
            str2 = i3g1Var.c;
        }
        i3g1Var.getClass();
        return new i3g1(str3, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3g1)) {
            return false;
        }
        i3g1 i3g1Var = (i3g1) obj;
        String str = i3g1Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            nl7 nl7Var = dyf.b;
            zEquals = str2.equals(str);
        }
        if (!zEquals) {
            return false;
        }
        String str3 = i3g1Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (str3 == null) {
            zEquals2 = false;
        } else {
            nl7 nl7Var2 = ss20.b;
            zEquals2 = str4.equals(str3);
        }
        if (!zEquals2) {
            return false;
        }
        String str5 = i3g1Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 == null) {
                zEquals3 = true;
            } else {
                zEquals3 = false;
            }
        } else if (str5 == null) {
            zEquals3 = false;
        } else {
            nl7 nl7Var3 = ol7.b;
            zEquals3 = str6.equals(str5);
        }
        return zEquals3;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = 0;
        String str = this.a;
        if (str == null) {
            iHashCode = 0;
        } else {
            nl7 nl7Var = dyf.b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            nl7 nl7Var2 = ss20.b;
            iHashCode2 = str2.hashCode();
        }
        int i2 = (i + iHashCode2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            nl7 nl7Var3 = ol7.b;
            iHashCode3 = str3.hashCode();
        }
        return i2 + iHashCode3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nl7 nl7Var = dyf.b;
            parcel.writeString(str);
        }
        String str2 = this.b;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nl7 nl7Var2 = ss20.b;
            parcel.writeString(str2);
        }
        String str3 = this.c;
        if (str3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        nl7 nl7Var3 = ol7.b;
        parcel.writeString(str3);
    }
}
