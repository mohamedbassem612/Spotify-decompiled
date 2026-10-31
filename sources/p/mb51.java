package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mb51 implements xpw {
    public final /* synthetic */ byte a = 0;
    public final mqw b;
    public final rqw c;
    public final String d;
    public final jsw e;

    public mb51(Object obj, Object obj2, iu30 iu30Var, iu30 iu30Var2, fqg0 fqg0Var) {
        this.b = fqg0Var.e;
        this.c = fqg0Var.f;
        this.d = fqg0Var.a.b();
        this.e = new lb51(obj, obj2, iu30Var, iu30Var2, fqg0Var);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final String b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        byte b = this.a;
        rbc0 rbc0Var = this.e;
        switch (b) {
            case 0:
                return (lb51) rbc0Var;
            default:
                return rbc0Var;
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public mb51(xpw xpwVar, iu30 iu30Var, Object obj) {
        this.b = xpwVar.getBehavior();
        this.c = xpwVar.a();
        this.d = xpwVar.b();
        this.e = new rbc0(iu30Var, obj, xpwVar, (byte) 1);
    }
}
