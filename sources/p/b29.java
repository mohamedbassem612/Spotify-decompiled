package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b29 {
    public final j2t a;
    public final List b;
    public final int c;
    public final int d;
    public final liv e;

    public b29(j2t j2tVar, List list, int i, int i2, liv livVar) {
        this.a = j2tVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = livVar;
    }

    public static ajq0 a(j2t j2tVar) {
        ajq0 ajq0Var = new ajq0();
        if (j2tVar == null) {
            bhn0.i("Null surface");
            return null;
        }
        ajq0Var.a = j2tVar;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            bhn0.i("Null sharedSurfaces");
            return null;
        }
        ajq0Var.b = list;
        ajq0Var.c = -1;
        ajq0Var.d = -1;
        ajq0Var.e = liv.d;
        return ajq0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b29)) {
            return false;
        }
        b29 b29Var = (b29) obj;
        return this.a.equals(b29Var.a) && this.b.equals(b29Var.b) && this.c == b29Var.c && this.d == b29Var.d && this.e.equals(b29Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
