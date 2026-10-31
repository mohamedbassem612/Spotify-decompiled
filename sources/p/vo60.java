package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vo60 {
    public final int a;
    public final nif1 b;
    public wma1 c;
    public wma1 d;
    public wma1 e;
    public Integer f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f49p;
    public int q;

    public vo60(int i, nif1 nif1Var, wma1 wma1Var) {
        this.a = i;
        this.b = nif1Var;
        this.c = wma1Var;
    }

    public final void a(int i) {
        String str;
        String str2;
        if (this.q != 0) {
            return;
        }
        this.q = i;
        b();
        wma1 wma1Var = this.e;
        if (wma1Var != null) {
            wma1Var.a((Long) null);
        }
        this.e = null;
        String strValueOf = String.valueOf(this.j);
        nif1 nif1Var = this.b;
        nif1Var.setAttribute("response_count", strValueOf);
        nif1Var.setAttribute("failure_count", String.valueOf(this.o));
        int i2 = this.h;
        if (i2 != 0) {
            if (i2 == 1) {
                str2 = "succeeded";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str2 = "failed";
            }
            nif1Var.setAttribute("revalidation_outcome", str2);
        }
        if (i == 1) {
            str = "success";
        } else if (i == 2) {
            str = "empty";
        } else if (i == 3) {
            str = "failure";
        } else if (i == 4) {
            str = "cancelled";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "superseded";
        }
        nif1Var.setAttribute("outcome", str);
        nif1Var.stop();
    }

    public final void b() {
        wma1 wma1Var = this.c;
        if (wma1Var != null) {
            wma1Var.a((Long) null);
        }
        this.c = null;
        wma1 wma1Var2 = this.d;
        if (wma1Var2 != null) {
            wma1Var2.a((Long) null);
        }
        this.d = null;
    }
}
