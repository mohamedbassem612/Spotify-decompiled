package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xd7 implements yd7 {
    public static final Parcelable.Creator<xd7> CREATOR = new f67((byte) 11);
    public final vh90 a;
    public final String b;
    public final p6r0 c;

    public xd7(vh90 vh90Var) {
        this.a = vh90Var;
        Set set = s4b1.f;
        this.b = "spotify:assisted-curation:search:show:".concat(uic.x(vh90Var.a).h());
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = yon1.G1("ASSISTED_CURATION_SEARCH_SHOW_ENTITY", "assisted-curation/search/show-entity", 190, "assisted-curation");
    }

    public final String U0() {
        return this.b;
    }

    public final int describeContents() {
        return 0;
    }

    public final p6r0 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd7) && u890.j(this.a, ((xd7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
