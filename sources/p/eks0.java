package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eks0 {
    public final ohv0 a;
    public final yqg b;
    public final ti c;
    public final String d;

    public eks0(ohv0 ohv0Var, yqg yqgVar, ti tiVar, String str) {
        this.a = ohv0Var;
        this.b = yqgVar;
        this.c = tiVar;
        this.d = str;
    }

    public final void a(Integer num) {
        LinkedHashMap linkedHashMapM = sqg0.M(oqn1.n("source", this.c.f()), oqn1.n("timestamp", String.valueOf(this.b.e())), oqn1.n("attempt_id", this.d));
        if (num != null) {
        }
        this.a.a(new khv0(null, "call_completed", linkedHashMapM));
    }
}
