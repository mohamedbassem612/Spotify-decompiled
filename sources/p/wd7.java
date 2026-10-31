package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wd7 implements yd7 {
    public static final Parcelable.Creator<wd7> CREATOR = new f67((byte) 10);
    public final String a;
    public final int b;
    public final String c;
    public final p6r0 d;

    public wd7(String str, int i) {
        this.a = str;
        this.b = i;
        Set set = s4b1.f;
        this.c = gvg.h("spotify:assisted-curation:search:artist:", uic.x(str).h(), ":", td6.h(i));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = yon1.G1("ASSISTED_CURATION_SEARCH_ARTIST_ENTITY", "assisted-curation/search/artist-entity", 186, "assisted-curation");
    }

    @Override // p.yd7
    public final String U0() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p.yd7
    public final p6r0 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd7)) {
            return false;
        }
        wd7 wd7Var = (wd7) obj;
        return u890.j(this.a, wd7Var.a) && this.b == wd7Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "TOP_TRACKS";
        } else if (i2 == 2) {
            str = "ALBUMS";
        } else if (i2 == 3) {
            str = "SINGLES";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "APPEARS_ON";
        }
        parcel.writeString(str);
    }
}
