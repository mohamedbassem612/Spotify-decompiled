package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class g3d0 implements Parcelable {
    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        String strM = "name";
        if (!(this instanceof x2d0) && !(this instanceof y2d0)) {
            if (this instanceof u2d0) {
                strM = "custom";
            } else if (this instanceof m2d0) {
                strM = "addTime";
            } else if (this instanceof o2d0) {
                strM = "addedBy";
            } else if (this instanceof w2d0) {
                strM = "duration";
            } else if (this instanceof e3d0) {
                strM = "show.name";
            } else {
                strM = "album.name";
                if (!(this instanceof q2d0)) {
                    if (this instanceof s2d0) {
                        strM = "artist.name";
                    } else if (this instanceof v2d0) {
                        strM = "disc.number";
                    } else if (!(this instanceof r2d0)) {
                        if (this instanceof c3d0) {
                            strM = "publishDate";
                        } else if (this instanceof f3d0) {
                            strM = "track.number";
                        } else if (this instanceof t2d0) {
                            strM = "artist.name";
                        } else if (this instanceof p2d0) {
                            strM = "album.artist.name";
                        } else if (this instanceof n2d0) {
                            strM = "addTime.reversed";
                        } else if (this instanceof z2d0) {
                            strM = l1d.m("provided.", ((z2d0) this).b());
                        } else {
                            if (!(this instanceof a3d0)) {
                                eg.o();
                                return null;
                            }
                            strM = l1d.m("providedNonReversible.", ((a3d0) this).b());
                        }
                    }
                }
            }
        }
        return ((this instanceof d3d0) && ((d3d0) this).a()) ? strM.concat(".reversed") : strM;
    }
}
