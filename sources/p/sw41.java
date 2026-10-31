package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sw41 {
    public final mko a;
    public final LinkedHashSet b;
    public final ipd0 c;

    public sw41(lko lkoVar, String str, iac0 iac0Var) {
        mko mkoVarA = lko.a(lkoVar, r6x.a, str);
        this.a = mkoVarA;
        this.b = new LinkedHashSet();
        this.c = new ipd0(this);
        mkoVarA.start();
        iac0Var.getLifecycle().a(new i83(this, (byte) 19));
    }
}
