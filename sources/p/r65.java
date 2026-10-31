package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r65 implements pdy0 {
    public final q65 a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new f55(this, (byte) 15));

    public r65(q65 q65Var, int i, luk lukVar) {
        this.a = q65Var;
        this.b = i;
        this.c = lukVar;
    }

    public final q65 a() {
        q65 q65VarA;
        r65 r65Var = (r65) this.d.getValue();
        return (r65Var == null || (q65VarA = r65Var.a()) == null) ? this.a : q65VarA;
    }

    public final int b() {
        r65 r65Var = (r65) this.d.getValue();
        return r65Var != null ? r65Var.b() : this.b;
    }

    public final List models() {
        String str = a().a;
        q65[] q65VarArrValues = q65.values();
        ArrayList arrayList = new ArrayList(q65VarArrValues.length);
        for (q65 q65Var : q65VarArrValues) {
            arrayList.add(q65Var.a);
        }
        return p7h.M(new fpb[]{new fpb("accepted_ble_range", "android-usersnearby-discoverysender-impl", str, arrayList), new fpb("send_token_interval_millis", "android-usersnearby-discoverysender-impl", b(), 1000, 3000)});
    }
}
