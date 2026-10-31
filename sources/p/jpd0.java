package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jpd0 {
    public final mko a;
    public final LinkedHashSet b;
    public final ipd0 c;

    public jpd0(lko lkoVar, String str, iac0 iac0Var) {
        mko mkoVarA = lko.a(lkoVar, new huz(w7x.a, (byte) 10), str);
        this.a = mkoVarA;
        this.b = new LinkedHashSet();
        this.c = new ipd0(this);
        mkoVarA.start();
        iac0Var.getLifecycle().a(new i83(this, (byte) 11));
    }
}
