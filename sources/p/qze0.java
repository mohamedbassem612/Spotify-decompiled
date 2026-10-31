package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qze0 implements Parcelable {
    public static final Parcelable.Creator<qze0> CREATOR = new rwe0((byte) 8);
    public final String a;
    public final String b;
    public final zzy c;
    public final Integer d;
    public final Intent e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;

    public qze0(String str, String str2, zzy zzyVar, Integer num, Intent intent, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = zzyVar;
        this.d = num;
        this.e = intent;
        this.f = i;
        this.g = i2;
        this.h = z;
        this.i = z2;
    }

    public static qze0 a(qze0 qze0Var, int i, int i2, boolean z, int i3) {
        String str = qze0Var.a;
        String str2 = qze0Var.b;
        zzy zzyVar = qze0Var.c;
        Integer num = qze0Var.d;
        Intent intent = qze0Var.e;
        if ((i3 & 32) != 0) {
            i = qze0Var.f;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = qze0Var.g;
        }
        int i5 = i2;
        if ((i3 & 128) != 0) {
            z = qze0Var.h;
        }
        return new qze0(str, str2, zzyVar, num, intent, i4, i5, z, qze0Var.i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qze0)) {
            return false;
        }
        qze0 qze0Var = (qze0) obj;
        return u890.j(this.a, qze0Var.a) && u890.j(this.b, qze0Var.b) && u890.j(this.c, qze0Var.c) && u890.j(this.d, qze0Var.d) && u890.j(this.e, qze0Var.e) && this.f == qze0Var.f && this.g == qze0Var.g && this.h == qze0Var.h && this.i == qze0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Intent intent = this.e;
        return Boolean.hashCode(this.i) + xcg1.g(ab80.k(this.g, ab80.k(this.f, (iHashCode2 + (intent != null ? intent.hashCode() : 0)) * 31, 31), 31), 31, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeParcelable(this.e, i);
        int i2 = this.f;
        if (i2 == 1) {
            str = "READY";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "LOADING";
        }
        parcel.writeString(str);
        int i3 = this.g;
        if (i3 == 1) {
            str2 = "NONE";
        } else if (i3 == 2) {
            str2 = "LOGIN_FAILED";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "UPGRADE_REQUIRED";
        }
        parcel.writeString(str2);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
