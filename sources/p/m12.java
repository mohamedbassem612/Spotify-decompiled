package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Any;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m12 implements n12 {
    public static final Parcelable.Creator<m12> CREATOR = new ev1((byte) 13);
    public final int a;
    public final int b;
    public final String c;
    public final Any d;

    public m12(int i, int i2, String str, Any any) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = any;
    }

    public final String D() {
        return this.c;
    }

    public final int M0() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0024  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof m12) {
                m12 m12Var = (m12) obj;
                if (this.a == m12Var.a && this.b == m12Var.b) {
                    String str = m12Var.c;
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
                        zEquals = str2.equals(str);
                    }
                    if (zEquals && u890.j(this.d, m12Var.d)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, l1d.C(this.a) * 31, 31);
        String str = this.c;
        return this.d.hashCode() + ((iK + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final int u() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(kk0.x(this.a));
        parcel.writeString(kk0.w(this.b));
        String str = this.c;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        Any any = this.d;
        if (any == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeByteArray(any.toByteArray());
        }
    }
}
