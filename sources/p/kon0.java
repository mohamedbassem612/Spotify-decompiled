package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kon0 extends hab0 implements iu30 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ uvj b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ tob1 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kon0(Map map, uvj uvjVar, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, tob1 tob1Var, ven0 ven0Var) {
        super(1);
        this.a = map;
        this.b = uvjVar;
        this.c = iu30Var;
        this.d = iu30Var2;
        this.e = iu30Var3;
        this.f = tob1Var;
        this.g = ven0Var;
    }

    public final Object invoke(Object obj) {
        float fFloatValue;
        xa5 xa5Var = (xa5) obj;
        if (!((List) this.f.getValue()).contains(xa5Var.e())) {
            bby bbyVar = bby.b;
            d9y0.s();
            bby bbyVar2 = bby.b;
            ln00 ln00Var = ln00.b;
            fza.d();
            return hm5.P(bbyVar2, ln00.b);
        }
        String str = ((hnn0) xa5Var.e()).f;
        Map map = this.a;
        Float f = (Float) map.get(str);
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            map.put(((hnn0) xa5Var.e()).f, Float.valueOf(0.0f));
            fFloatValue = 0.0f;
        }
        if (!((hnn0) xa5Var.b()).f.equals(((hnn0) xa5Var.e()).f)) {
            fFloatValue = (((Boolean) this.b.l().getValue()).booleanValue() || ((Boolean) this.g.getValue()).booleanValue()) ? fFloatValue - 1.0f : fFloatValue + 1.0f;
        }
        map.put(((hnn0) xa5Var.b()).f, Float.valueOf(fFloatValue));
        return new p9m((bby) this.c.invoke(xa5Var), (ln00) this.d.invoke(xa5Var), fFloatValue, (c391) this.e.invoke(xa5Var));
    }
}
