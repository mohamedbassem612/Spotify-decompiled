package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qlr implements av30, vf10 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ qlr(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public /* synthetic */ Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return iu30Var.invoke(obj);
    }

    public void d() {
        wf10.u = true;
        iu30 iu30Var = this.b;
        lfb lfbVar = s1f0.b;
        if (s1f0.d == null) {
            synchronized (lfbVar) {
                s1f0.d = new s1f0();
            }
        }
        s1f0 s1f0Var = s1f0.d;
        if (s1f0Var != null) {
            iu30Var.invoke(s1f0Var);
        } else {
            u890.C("instance");
            throw null;
        }
    }
}
