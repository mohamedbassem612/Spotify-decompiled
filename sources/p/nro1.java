package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nro1 extends u9 {
    public static final Parcelable.Creator<nro1> CREATOR = new sao1((byte) 11);
    public final String a;
    public final int b;
    public final int c;

    public nro1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nro1.class == obj.getClass()) {
            nro1 nro1Var = (nro1) obj;
            if (this.b == nro1Var.b && this.c == nro1Var.c && Objects.equals(this.a, nro1Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        Locale locale = Locale.US;
        return l1d.n(this.a, "}", cy30.q(this.b, this.c, "WebIconParcelable{", "x", " - "));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c);
        j541.M(iL, parcel);
    }
}
