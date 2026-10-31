package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wdh1 implements xdh1 {
    public final String a;
    public final ynb0 b;
    public final boolean c;

    public wdh1(String str, ynb0 ynb0Var, boolean z) {
        this.a = str;
        this.b = ynb0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdh1)) {
            return false;
        }
        wdh1 wdh1Var = (wdh1) obj;
        return u890.j(this.a, wdh1Var.a) && u890.j(this.b, wdh1Var.b) && this.c == wdh1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
