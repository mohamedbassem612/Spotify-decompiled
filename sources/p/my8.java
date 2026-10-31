package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class my8 {
    public final String a;
    public final a19 b;

    public my8(String str, a19 a19Var) {
        if (str == null) {
            bhn0.i("Null cameraIdString");
            throw null;
        }
        this.a = str;
        this.b = a19Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof my8)) {
            return false;
        }
        my8 my8Var = (my8) obj;
        return this.a.equals(my8Var.a) && this.b.equals(my8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.a + ", cameraConfigId=" + this.b + "}";
    }
}
