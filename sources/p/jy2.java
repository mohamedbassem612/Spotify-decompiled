package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jy2 implements Parcelable {
    public static final Parcelable.Creator<jy2> CREATOR = new ue2((byte) 25);
    public final String a;
    public final List b;
    public final Function0 c;

    public jy2(String str, List list, Function0 function0) {
        this.a = str;
        this.b = list;
        this.c = function0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy2)) {
            return false;
        }
        jy2 jy2Var = (jy2) obj;
        return u890.j(this.a, jy2Var.a) && this.b.equals(jy2Var.b) && this.c.equals(jy2Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((iy2) itM.next()).writeToParcel(parcel, i);
        }
    }
}
