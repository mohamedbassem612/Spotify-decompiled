package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class td7 implements yd7 {
    public static final Parcelable.Creator<td7> CREATOR = new f67((byte) 7);
    public final bh90 a;
    public final String b;
    public final p6r0 c;

    public td7(bh90 bh90Var) {
        this.a = bh90Var;
        Set set = s4b1.f;
        this.b = "spotify:assisted-curation:search:album:".concat(uic.x(bh90Var.a).h());
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = yon1.G1("ASSISTED_CURATION_SEARCH_ALBUM_ENTITY", "assisted-curation/search/album-entity", 184, "assisted-curation");
    }

    @Override // p.yd7
    public final String U0() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.yd7
    public final p6r0 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td7) && u890.j(this.a, ((td7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
