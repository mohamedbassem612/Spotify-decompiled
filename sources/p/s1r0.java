package p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s1r0 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s1r0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uba ubaVar = (wnh1) ((WeakReference) ((svh0) obj).c).get();
                if (ubaVar != null) {
                    uba ubaVar2 = ubaVar;
                    ubaVar2.e.reset();
                    llm llmVar = ubaVar2.g.q;
                    if (llmVar != null) {
                        smo1.q(llmVar);
                    }
                }
                iac0Var.getLifecycle().d(this);
                break;
            default:
                ((qzh) ((as0) obj).c).f(sn11.b);
                break;
        }
    }

    public final void onPause(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((svh0) obj).b = true;
                break;
            default:
                ((qzh) ((as0) obj).c).f(sn11.a);
                break;
        }
    }

    public final void onResume(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((svh0) obj).b = false;
                break;
            default:
                ((qzh) ((as0) obj).c).f(sn11.c);
                break;
        }
    }
}
