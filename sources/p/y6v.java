package p;

import androidx.compose.ui.geometry.Offset;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y6v extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ dw91 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6v(int i, String str, iu30 iu30Var, ven0 ven0Var, vyz0 vyz0Var, dw91 dw91Var) {
        super(0);
        this.b = dw91Var;
        this.c = i;
        this.e = vyz0Var;
        this.f = str;
        this.g = iu30Var;
        this.d = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        ven0 ven0Var = this.d;
        int i = this.c;
        dw91 dw91Var = this.b;
        switch (b) {
            case 0:
                Float f = (Float) dw91Var.get(Integer.valueOf(i));
                if (f != null) {
                    bs51.d(ven0Var, (ss50) obj2, (xtb0) obj, (ven0) obj3, new p00(f.floatValue()));
                }
                return rih1Var;
            default:
                long j = ((Offset) sqg0.G(Integer.valueOf(i), dw91Var)).a;
                ceo ceoVar = iu90.a;
                long jF = Offset.f(j, ((Offset) ven0Var.getValue()).a);
                String str = (String) obj2;
                LinkedHashMap linkedHashMap = ((vyz0) obj3).a;
                if (linkedHashMap.size() == 64) {
                    linkedHashMap.remove(o7h.p0(linkedHashMap.keySet()));
                }
                hsw0 hsw0Var = hsw0.a;
                long jUpdateAndGet = hsw0.b.updateAndGet(gsw0.a);
                if (linkedHashMap.containsKey(Long.valueOf(jUpdateAndGet))) {
                    bhn0.f(gvg.f(jUpdateAndGet, "Reaction request ID ", " was reused"));
                    return null;
                }
                linkedHashMap.put(Long.valueOf(jUpdateAndGet), new mhs0(jUpdateAndGet, jF, str));
                ((iu30) obj).invoke(new du90(jUpdateAndGet, str));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6v(dw91 dw91Var, int i, ven0 ven0Var, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var2) {
        super(0);
        this.b = dw91Var;
        this.c = i;
        this.d = ven0Var;
        this.f = ss50Var;
        this.g = xtb0Var;
        this.e = ven0Var2;
    }
}
