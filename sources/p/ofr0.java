package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ofr0 implements qfr0 {
    public final String a;
    public final List b;
    public final tfr0 c;

    public ofr0(String str, List list, tfr0 tfr0Var) {
        this.a = str;
        this.b = list;
        this.c = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofr0)) {
            return false;
        }
        ofr0 ofr0Var = (ofr0) obj;
        return this.a.equals(ofr0Var.a) && this.b.equals(ofr0Var.b) && this.c.equals(ofr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
