package p;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s4r implements Function {
    public final /* synthetic */ List a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ File c;

    public s4r(List list, q8n q8nVar, File file) {
        this.a = list;
        this.b = q8nVar;
        this.c = file;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ze3 ze3Var = new ze3(d4r.c1, (byte) 3);
        j0d1 j0d1VarB = guo1.B();
        q8n q8nVar = this.b;
        q8nVar.getClass();
        o8n o8nVarL = flo1.l(q8nVar, j0d1VarB);
        File file = this.c;
        llm llmVarE = smo1.e(o8nVarL.y(new z8n(f4i1.f("DataStore(", file.getName(), ")"))));
        z5o z5oVar = new z5o(file, (byte) 10);
        return new knv0(new h191(new isr0(z5oVar, (byte) 27), mif1.o1, Collections.singletonList(new vdd(this.a, null, (byte) 1)), ze3Var, llmVarE));
    }
}
