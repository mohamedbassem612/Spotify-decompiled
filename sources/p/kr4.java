package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kr4 implements pdy0 {
    public final jr4 a;
    public final luk b;
    public final idd1 c;

    public kr4(jr4 jr4Var, luk lukVar) {
        this.a = jr4Var;
        this.b = lukVar;
        this.c = new idd1(new rq4(this, (byte) 12));
    }

    public final jr4 a() {
        jr4 jr4VarA;
        kr4 kr4Var = (kr4) this.c.getValue();
        return (kr4Var == null || (jr4VarA = kr4Var.a()) == null) ? this.a : jr4VarA;
    }

    public final List models() {
        String str = a().a;
        jr4[] jr4VarArrValues = jr4.values();
        ArrayList arrayList = new ArrayList(jr4VarArrValues.length);
        for (jr4 jr4Var : jr4VarArrValues) {
            arrayList.add(jr4Var.a);
        }
        return Collections.singletonList(new fpb("mark_as_played_endpoint_options", "android-markasplayed", str, arrayList));
    }

    public kr4(luk lukVar) {
        this(jr4.LEGACY, lukVar);
    }
}
