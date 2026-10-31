package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q26 extends csd1 {
    public static volatile q26 b;
    public static final n5u c = new n5u((byte) 5);
    public csd1 a;

    public static q26 e() {
        if (b != null) {
            return b;
        }
        synchronized (q26.class) {
            try {
                if (b == null) {
                    q26 q26Var = new q26();
                    q26Var.a = new cus();
                    b = q26Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void a(Runnable runnable) {
        this.a.a(runnable);
    }

    public final boolean c() {
        return this.a.c();
    }

    public final void d(Runnable runnable) {
        this.a.d(runnable);
    }
}
