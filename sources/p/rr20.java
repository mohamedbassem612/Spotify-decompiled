package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rr20 implements moy0 {
    public final mr20 a;
    public final o8n b;

    public rr20(mr20 mr20Var, o8n o8nVar) {
        this.a = mr20Var;
        this.b = o8nVar;
    }

    public final void subscribe(gnc1 gnc1Var) {
        gnc1Var.getClass();
        gnc1Var.onSubscribe(new jw20(this.a, gnc1Var, this.b));
    }
}
