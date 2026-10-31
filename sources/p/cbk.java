package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cbk implements jn60 {
    public final String a;
    public final yz21 b;
    public final String c;

    static {
        bma1.b.q("debug_tools_concert_campaign_uri_override");
    }

    public cbk(String str, yz21 yz21Var, String str2) {
        this.a = str;
        this.b = yz21Var;
        this.c = str2;
    }

    public final List d(op80 op80Var) {
        return Collections.singletonList(new n6k(new udk(this.c, null, 0, fnw.a, 22), this.a, op80Var));
    }

    public final yz21 f() {
        return this.b;
    }

    public final String getId() {
        return this.a;
    }
}
