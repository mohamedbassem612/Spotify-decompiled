package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c9o1 extends u9 {
    public static final Parcelable.Creator<c9o1> CREATOR = new w2o1((byte) 22);
    public final String a;
    public final byte[] b;
    public final ArrayList c;

    public c9o1(String str, ArrayList arrayList, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c9o1)) {
            return false;
        }
        c9o1 c9o1Var = (c9o1) obj;
        return k8p1.h(this.a, c9o1Var.a) && k8p1.h(this.b, c9o1Var.b) && k8p1.h(this.c, c9o1Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.v(parcel, 2, this.b);
        ArrayList arrayList = new ArrayList(this.c);
        int iL2 = j541.L(3, parcel);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        j541.M(iL2, parcel);
        j541.M(iL, parcel);
    }
}
