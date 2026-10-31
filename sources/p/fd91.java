package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fd91 implements Parcelable {
    public static final Parcelable.Creator<fd91> CREATOR = new yx81((byte) 9);
    public final tka0 a;
    public final ArrayList b;

    public fd91(tka0 tka0Var, ArrayList arrayList) {
        this.a = tka0Var;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd91)) {
            return false;
        }
        fd91 fd91Var = (fd91) obj;
        return u890.j(this.a, fd91Var.a) && this.b.equals(fd91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        wdg wdgVar = this.a;
        parcel.writeString(wdgVar != null ? wdgVar.n().getName() : null);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            wdg wdgVar2 = (tka0) itO.next();
            parcel.writeString(wdgVar2 != null ? wdgVar2.n().getName() : null);
        }
    }
}
