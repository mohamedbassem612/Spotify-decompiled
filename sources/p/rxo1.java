package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rxo1 {
    public final String a;
    public final String b;
    public final boolean c;

    public rxo1(String str, String str2, boolean z) {
        zod.o(str);
        this.a = str;
        zod.o(str2);
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxo1)) {
            return false;
        }
        rxo1 rxo1Var = (rxo1) obj;
        return k8p1.h(this.a, rxo1Var.a) && k8p1.h(this.b, rxo1Var.b) && k8p1.h((Object) null, (Object) null) && this.c == rxo1Var.c;
    }

    public final int hashCode() {
        return k8p1.j(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        zod.s((Object) null);
        throw null;
    }
}
