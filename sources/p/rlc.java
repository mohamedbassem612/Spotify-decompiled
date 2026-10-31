package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rlc implements o5s {
    public final /* synthetic */ tlc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zf30 c;

    public rlc(tlc tlcVar, String str, zf30 zf30Var) {
        this.a = tlcVar;
        this.b = str;
        this.c = zf30Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.c.s1.d(this);
    }

    public final void onResume(iac0 iac0Var) {
        this.a.a(this.b);
    }
}
