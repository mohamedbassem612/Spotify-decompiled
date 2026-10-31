package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mob {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;

    public mob(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mob)) {
            return false;
        }
        mob mobVar = (mob) obj;
        return this.a.equals(mobVar.a) && this.b == mobVar.b && this.c.equals(mobVar.c) && this.d == mobVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
