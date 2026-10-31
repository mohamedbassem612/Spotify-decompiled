package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class trc0 implements Parcelable {
    public static final Parcelable.Creator<trc0> CREATOR = new v5c0((byte) 27);
    public final PlaylistRequestDecorationPolicy a;
    public final g3d0 b;
    public final Set c;
    public final boolean d;
    public final src0 e;
    public final mqz0 f;
    public final prc0 g;
    public final int h;
    public final List i;

    public /* synthetic */ trc0(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, g3d0 g3d0Var, Set set, boolean z, src0 src0Var, mqz0 mqz0Var, prc0 prc0Var, int i, List list, int i2) {
        this((i2 & 1) != 0 ? PlaylistRequestDecorationPolicy.n() : playlistRequestDecorationPolicy, (i2 & 2) != 0 ? null : g3d0Var, (i2 & 4) != 0 ? w7x.a : set, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? new rrc0(dm61.z0(dlc0.d, dlc0.g)) : src0Var, (i2 & 32) != 0 ? jqz0.a : mqz0Var, (i2 & 64) != 0 ? prc0.a : prc0Var, (i2 & 128) != 0 ? 100 : i, (i2 & 256) != 0 ? z6x.a : list);
    }

    public static trc0 a(trc0 trc0Var, PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, g3d0 g3d0Var, Set set, mqz0 mqz0Var, int i) {
        if ((i & 1) != 0) {
            playlistRequestDecorationPolicy = trc0Var.a;
        }
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy2 = playlistRequestDecorationPolicy;
        if ((i & 2) != 0) {
            g3d0Var = trc0Var.b;
        }
        g3d0 g3d0Var2 = g3d0Var;
        if ((i & 4) != 0) {
            set = trc0Var.c;
        }
        Set set2 = set;
        boolean z = (i & 8) != 0 ? trc0Var.d : false;
        src0 src0Var = trc0Var.e;
        if ((i & 32) != 0) {
            mqz0Var = trc0Var.f;
        }
        mqz0 mqz0Var2 = mqz0Var;
        prc0 prc0Var = trc0Var.g;
        int i2 = (i & 128) != 0 ? trc0Var.h : 0;
        List list = trc0Var.i;
        trc0Var.getClass();
        return new trc0(playlistRequestDecorationPolicy2, g3d0Var2, set2, z, src0Var, mqz0Var2, prc0Var, i2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trc0)) {
            return false;
        }
        trc0 trc0Var = (trc0) obj;
        return u890.j(this.a, trc0Var.a) && u890.j(this.b, trc0Var.b) && u890.j(this.c, trc0Var.c) && this.d == trc0Var.d && u890.j(this.e, trc0Var.e) && u890.j(this.f, trc0Var.f) && this.g == trc0Var.g && this.h == trc0Var.h && u890.j(this.i, trc0Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g3d0 g3d0Var = this.b;
        return this.i.hashCode() + kaa0.f(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + xcg1.g(gvg.c((iHashCode + (g3d0Var == null ? 0 : g3d0Var.hashCode())) * 31, 31, this.c), 31, this.d)) * 31)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dxo1.x(this.a, parcel);
        parcel.writeParcelable(this.b, i);
        Iterator itH = k4s0.h(this.c, parcel);
        while (itH.hasNext()) {
            parcel.writeParcelable((Parcelable) itH.next(), i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g.name());
        parcel.writeInt(this.h);
        parcel.writeStringList(this.i);
    }

    public trc0(PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy, g3d0 g3d0Var, Set set, boolean z, src0 src0Var, mqz0 mqz0Var, prc0 prc0Var, int i, List list) {
        this.a = playlistRequestDecorationPolicy;
        this.b = g3d0Var;
        this.c = set;
        this.d = z;
        this.e = src0Var;
        this.f = mqz0Var;
        this.g = prc0Var;
        this.h = i;
        this.i = list;
    }
}
