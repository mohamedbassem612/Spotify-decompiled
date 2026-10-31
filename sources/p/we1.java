package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class we1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ idd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we1(idd1 idd1Var, byte b) {
        super(1);
        this.a = b;
        this.b = idd1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        idd1 idd1Var = this.b;
        switch (b) {
            case 0:
                vyk0 vyk0Var = (vyk0) obj;
                String str = (String) idd1Var.getValue();
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), vyk0Var.a, r6h1.c, System.currentTimeMillis());
            default:
                return new isf((bmr) idd1Var.getValue(), new psf((osf) obj));
        }
    }
}
