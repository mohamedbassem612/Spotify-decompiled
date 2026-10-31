package p;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sy8 {
    public final String a;
    public final Class b;
    public final Object c;

    public sy8(String str, Class cls, CaptureRequest.Key key) {
        this.a = str;
        if (cls == null) {
            bhn0.i("Null valueClass");
            throw null;
        }
        this.b = cls;
        this.c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sy8)) {
            return false;
        }
        sy8 sy8Var = (sy8) obj;
        if (!this.a.equals(sy8Var.a) || !this.b.equals(sy8Var.b)) {
            return false;
        }
        Object obj2 = sy8Var.c;
        Object obj3 = this.c;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.a);
        sb.append(", valueClass=");
        sb.append(this.b);
        sb.append(", token=");
        return td6.l(sb, this.c, "}");
    }
}
