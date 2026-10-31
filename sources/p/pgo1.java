package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pgo1 extends u9 {
    public static final Parcelable.Creator<pgo1> CREATOR = new sao1(16);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public pgo1(int i, String str, String str2, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.c;
        String string = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        int i = this.a;
        int length = String.valueOf(i).length();
        String str = this.b;
        StringBuilder sb = new StringBuilder(string.length() + String.valueOf(str).length() + length + 24 + 7 + 1);
        sb.append("MessageEventParcelable[");
        sb.append(i);
        sb.append(",");
        sb.append(str);
        return l1d.q(sb, ", size=", string, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.a);
        j541.F(parcel, 3, this.b);
        j541.v(parcel, 4, this.c);
        j541.F(parcel, 5, this.d);
        j541.M(iL, parcel);
    }
}
