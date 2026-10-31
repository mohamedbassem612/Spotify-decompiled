package p;

import com.google.protobuf.h;
import com.spotify.messages.UbiProd1PageVisitEnd;
import com.spotify.messages.UbiProd1PageVisitEndNonAuth;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ajr0 extends hab0 implements Function0 {
    public final /* synthetic */ bjr0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajr0(bjr0 bjr0Var, String str, int i, long j, String str2) {
        super(0);
        this.a = bjr0Var;
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = str2;
    }

    public final Object invoke() {
        bjr0 bjr0Var = this.a;
        xe01 xe01Var = bjr0Var.c;
        j9a j9aVar = bjr0Var.b.a;
        Object value = xe01Var.a.getValue();
        value.getClass();
        boolean zBooleanValue = ((Boolean) value).booleanValue();
        String str = this.e;
        long j = this.d;
        int i = this.c;
        String str2 = this.b;
        if (zBooleanValue) {
            o9h1 o9h1VarN = UbiProd1PageVisitEnd.n();
            o9h1VarN.s(str2);
            o9h1VarN.r(i);
            o9h1VarN.q(j);
            o9h1VarN.n(str);
            o9h1VarN.t((String) j9aVar.a);
            h hVarBuild = o9h1VarN.build();
            hVarBuild.getClass();
            return hVarBuild;
        }
        q9h1 q9h1VarN = UbiProd1PageVisitEndNonAuth.n();
        q9h1VarN.s(str2);
        q9h1VarN.r(i);
        q9h1VarN.q(j);
        q9h1VarN.n(str);
        q9h1VarN.t((String) j9aVar.a);
        h hVarBuild2 = q9h1VarN.build();
        hVarBuild2.getClass();
        return hVarBuild2;
    }
}
