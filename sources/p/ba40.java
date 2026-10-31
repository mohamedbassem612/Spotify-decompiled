package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ba40 implements ird1, av30 {
    public final /* synthetic */ byte a;
    public final iu30 b;

    public ba40() {
        this.a = (byte) 0;
        this.b = t840.X0;
    }

    public /* synthetic */ Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 2:
                break;
        }
        return iu30Var.invoke(obj);
    }

    public void o(Exception exc) {
        this.b.invoke(vvg0.a);
    }

    public void onSuccess() {
        this.b.invoke(wvg0.a);
    }

    public /* synthetic */ ba40(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }
}
