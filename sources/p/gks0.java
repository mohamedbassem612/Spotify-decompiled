package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gks0 {
    public final yqg a;
    public final ohv0 b;
    public final nhc c;

    public gks0(yqg yqgVar, ohv0 ohv0Var, nhc nhcVar) {
        this.a = yqgVar;
        this.b = ohv0Var;
        this.c = nhcVar;
    }

    public static eks0 a(ohv0 ohv0Var, yqg yqgVar, ti tiVar) {
        String strZ = nhc.z();
        eks0 eks0Var = new eks0(ohv0Var, yqgVar, tiVar, strZ);
        ohv0Var.a(new khv0(null, "call_started", sqg0.J(oqn1.n("source", tiVar.f()), oqn1.n("timestamp", String.valueOf(yqgVar.e())), oqn1.n("attempt_id", strZ))));
        return eks0Var;
    }
}
