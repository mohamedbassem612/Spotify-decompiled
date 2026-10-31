package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ta10 extends z1p1 {
    public final String c;
    public final String d;
    public final IOException e;
    public final String f;

    public ta10(String str, String str2, IOException iOException) {
        this.c = str;
        this.d = str2;
        this.e = iOException;
        this.f = gvg.h("Request to ", str2, " failed with ", iOException.getMessage());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta10)) {
            return false;
        }
        ta10 ta10Var = (ta10) obj;
        return u890.j(this.c, ta10Var.c) && u890.j(this.d, ta10Var.d) && this.e.equals(ta10Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return "externalTrackingRequestFailed";
    }

    public final String n() {
        return this.c;
    }
}
