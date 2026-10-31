package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class urw0 implements wrw0 {
    public final int a;
    public final String b;

    public urw0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String a() {
        String str;
        int i = this.a;
        if (i == 1) {
            str = "summary_too_large";
        } else if (i == 2) {
            str = "invalid_protobuf";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "invalid_diagnostic_session_id_size";
        }
        return f4i1.f(str, ":", this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urw0)) {
            return false;
        }
        urw0 urw0Var = (urw0) obj;
        return this.a == urw0Var.a && this.b.equals(urw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
