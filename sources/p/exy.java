package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class exy extends c871 {
    public static final Parcelable.Creator<exy> CREATOR = new jhy(16);
    public final String a;
    public final o1f1 b;
    public final int c;
    public final boolean d;
    public final rhy e;
    public final bwe1 f;
    public final cuu0 g;

    public exy(String str, o1f1 o1f1Var, int i, boolean z, rhy rhyVar, bwe1 bwe1Var, cuu0 cuu0Var) {
        this.a = str;
        this.b = o1f1Var;
        this.c = i;
        this.d = z;
        this.e = rhyVar;
        this.f = bwe1Var;
        this.g = cuu0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exy)) {
            return false;
        }
        exy exyVar = (exy) obj;
        return u890.j(this.a, exyVar.a) && u890.j(this.b, exyVar.b) && this.c == exyVar.c && this.d == exyVar.d && u890.j(this.e, exyVar.e) && u890.j(this.f, exyVar.f) && u890.j(this.g, exyVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        int i = this.c;
        int iG = xcg1.g((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.d);
        rhy rhyVar = this.e;
        int iHashCode2 = (iG + (rhyVar == null ? 0 : rhyVar.hashCode())) * 31;
        bwe1 bwe1Var = this.f;
        int iHashCode3 = (iHashCode2 + (bwe1Var == null ? 0 : Long.hashCode(bwe1Var.a))) * 31;
        cuu0 cuu0Var = this.g;
        return iHashCode3 + (cuu0Var != null ? cuu0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            if (i2 == 1) {
                str = "PLAYLIST_WITH_TRACKS";
            } else if (i2 == 2) {
                str = "AI_PLAYLIST_DEFAULT_STICKER";
            } else if (i2 == 3) {
                str = "AI_PLAYLIST_FUN_COLLECTIBLE";
            } else if (i2 == 4) {
                str = "AI_PLAYLIST_BETTER_SCREENSHOT";
            } else {
                if (i2 != 5) {
                    throw null;
                }
                str = "MUSIC_VIDEO_PRERELEASE";
            }
            parcel.writeString(str);
        }
        parcel.writeInt(this.d ? 1 : 0);
        rhy rhyVar = this.e;
        if (rhyVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rhyVar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
    }
}
