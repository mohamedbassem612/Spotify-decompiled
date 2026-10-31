package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fp21 {
    public final ppi1 a;
    public long b;
    public int c;

    public fp21() {
        Pattern pattern = ppi1.b;
        ypa ypaVarI = ypa.i();
        ppi1 ppi1Var = ppi1.c;
        if (ppi1Var == null) {
            ppi1Var = new ppi1(ypaVarI);
            ppi1.c = ppi1Var;
        }
        this.a = ppi1Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean a() {
        boolean z;
        if (this.c != 0) {
            this.a.a.getClass();
            if (ypa.g() > this.b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized void b(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.c = 0;
            }
            return;
        }
        this.c++;
        synchronized (this) {
            long jMin = (i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.c) + ((long) (Math.random() * 1000.0d)), 1800000.0d) : 86400000L;
            this.a.a.getClass();
            this.b = ypa.g() + jMin;
        }
        return;
        throw th;
    }
}
