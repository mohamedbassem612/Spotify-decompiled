package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l15 implements pdy0 {
    public final k15 a;
    public final luk b;
    public final idd1 c;

    public l15(k15 k15Var, luk lukVar) {
        this.a = k15Var;
        this.b = lukVar;
        this.c = new idd1(new uz4(this, (byte) 19));
    }

    public final k15 a() {
        k15 k15VarA;
        l15 l15Var = (l15) this.c.getValue();
        return (l15Var == null || (k15VarA = l15Var.a()) == null) ? this.a : k15VarA;
    }

    public final List models() {
        String str = a().a;
        k15[] k15VarArrValues = k15.values();
        ArrayList arrayList = new ArrayList(k15VarArrValues.length);
        for (k15 k15Var : k15VarArrValues) {
            arrayList.add(k15Var.a);
        }
        return Collections.singletonList(new fpb("audio_params_test_destinations", "android-share-audio-params-test-page", str, arrayList));
    }

    public l15(luk lukVar) {
        this(k15.DISABLED, lukVar);
    }
}
