package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cz80 implements jn60 {
    public final /* synthetic */ byte a;
    public final String b;
    public final String c;
    public final yz21 d;
    public final Object e;

    public /* synthetic */ cz80(String str, String str2, yz21 yz21Var, Object obj, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = yz21Var;
        this.e = obj;
    }

    public final List d(op80 op80Var) {
        byte b = this.a;
        Object obj = this.e;
        String str = this.b;
        switch (b) {
            case 0:
                return Collections.singletonList(new mx80(new ky80(this.c, ((fz80) obj).a, "spotify:playlist:37i9dQZF1EYkqdzj48dyYq", true, false, false, false, false, false, false, false, false, false, false, false), str, op80Var));
            default:
                b7m1 b7m1Var = (b7m1) obj;
                return Collections.singletonList(new r6m1(new a7m1(this.c, b7m1Var.a, zgo1.u(b7m1Var.b)), str, op80Var));
        }
    }

    public final yz21 f() {
        byte b = this.a;
        return this.d;
    }

    public final String getId() {
        byte b = this.a;
        return this.b;
    }
}
