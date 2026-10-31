package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x8v implements Comparator, Parcelable {
    public static final Parcelable.Creator<x8v> CREATOR = new s5v((byte) 1);
    public final w8v[] a;
    public int b;
    public final String c;
    public final int d;

    public x8v(Parcel parcel) {
        this.c = parcel.readString();
        w8v[] w8vVarArr = (w8v[]) parcel.createTypedArray(w8v.CREATOR);
        String str = zoi1.a;
        this.a = w8vVarArr;
        this.d = w8vVarArr.length;
    }

    public final x8v a(String str) {
        return Objects.equals(this.c, str) ? this : new x8v(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        w8v w8vVar = (w8v) obj;
        w8v w8vVar2 = (w8v) obj2;
        UUID uuid = whc.b;
        if (uuid.equals(w8vVar.b)) {
            return uuid.equals(w8vVar2.b) ? 0 : 1;
        }
        return w8vVar.b.compareTo(w8vVar2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x8v.class == obj.getClass()) {
            x8v x8vVar = (x8v) obj;
            if (Objects.equals(this.c, x8vVar.c) && Arrays.equals(this.a, x8vVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        String str = this.c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public x8v(String str, boolean z, w8v... w8vVarArr) {
        this.c = str;
        w8vVarArr = z ? (w8v[]) w8vVarArr.clone() : w8vVarArr;
        this.a = w8vVarArr;
        this.d = w8vVarArr.length;
        Arrays.sort(w8vVarArr, this);
    }

    public x8v(w8v... w8vVarArr) {
        this(null, true, w8vVarArr);
    }
}
