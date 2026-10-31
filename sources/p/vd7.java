package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vd7 implements yd7 {
    public static final Parcelable.Creator<vd7> CREATOR = new f67((byte) 9);
    public final oh90 a;
    public final String b;
    public final p6r0 c;

    public vd7(oh90 oh90Var) {
        this.a = oh90Var;
        Set set = s4b1.f;
        this.b = "spotify:assisted-curation:search:playlist:".concat(uic.x(oh90Var.a).h());
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = yon1.G1("ASSISTED_CURATION_SEARCH_PLAYLIST_ENTITY", "assisted-curation/search/playlist-entity", 189, "assisted-curation");
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
        return (obj instanceof vd7) && u890.j(this.a, ((vd7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
