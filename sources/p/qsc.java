package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qsc {
    public final yqg a;
    public Boolean b;
    public boolean c;
    public boolean d;
    public Long e;
    public String f = "";

    public qsc(yqg yqgVar) {
        this.a = yqgVar;
    }

    public final synchronized String a(boolean z) {
        try {
            if (!Boolean.valueOf(z).equals(this.b) || this.c) {
                this.b = Boolean.valueOf(z);
                this.c = false;
                long jB = this.a.b();
                Long l = this.e;
                if (l != null) {
                    jB = Math.max(jB, l.longValue() + 1);
                }
                this.e = Long.valueOf(jB);
                this.f = String.valueOf(jB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }

    public final synchronized void b() {
        this.c = true;
    }
}
