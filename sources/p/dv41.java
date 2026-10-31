package p;

import com.google.protobuf.h;
import com.spotify.contexts.Sdk;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dv41 implements r900 {
    public final kc00 a;

    public dv41(kc00 kc00Var) {
        this.a = kc00Var;
    }

    @Override // p.r900
    public final String a() {
        return "context_sdk";
    }

    @Override // p.r900
    public final h getData() {
        adn0 adn0Var = (adn0) ((den0) this.a.b).get();
        StringBuilder sb = new StringBuilder("1.1.1");
        boolean z = adn0Var.b;
        Integer num = adn0Var.a;
        if (!z) {
            sb.append("-essopt");
        }
        if (adn0.b(num) != null) {
            sb.append("-sendinterval" + adn0.b(num) + ".0s");
        }
        sb.append("-batchpayload");
        sb.append(adn0Var.k / 1000);
        sb.append("k-batchsize");
        sb.append(adn0Var.j);
        if (adn0Var.c) {
            sb.append("-bgsend");
        }
        if (adn0Var.d) {
            sb.append("-bckgsendonstop");
        }
        if (adn0Var.e) {
            sb.append("-sendonbcd");
        }
        int i = adn0Var.h;
        if (i > 0) {
            sb.append("-heartbeat" + i + "/" + adn0Var.i);
        }
        bv41 bv41VarN = Sdk.n();
        bv41VarN.q(sb.toString());
        bv41VarN.n();
        return bv41VarN.build();
    }
}
