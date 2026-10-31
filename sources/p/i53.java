package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i53 extends ei90 {
    public static final Parcelable.Creator<i53> CREATOR = new ue2((byte) 27);
    public final ArrayList a;
    public final int b;
    public final f53 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public i53(ArrayList arrayList, int i, f53 f53Var, boolean z, boolean z2, boolean z3) {
        this.a = arrayList;
        this.b = i;
        this.c = f53Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i53)) {
            return false;
        }
        i53 i53Var = (i53) obj;
        return this.a.equals(i53Var.a) && this.b == i53Var.b && u890.j(this.c, i53Var.c) && this.d == i53Var.d && this.e == i53Var.e && this.f == i53Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g((this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itO = xvj1.o(this.a, parcel);
        while (itO.hasNext()) {
            ((ol11) itO.next()).writeToParcel(parcel, i);
        }
        switch (this.b) {
            case 1:
                str = "UNDEFINED";
                break;
            case 2:
                str = "ALBUM";
                break;
            case 3:
                str = "SINGLE";
                break;
            case 4:
                str = "COMPILATION";
                break;
            case 5:
                str = "EP";
                break;
            case 6:
                str = "AUDIOBOOK";
                break;
            case 7:
                str = "PODCAST";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
        parcel.writeValue(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
