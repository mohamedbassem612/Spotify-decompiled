package p;

import java.util.function.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bna implements BiFunction {
    public final /* synthetic */ cna a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kru c;

    public bna(cna cnaVar, String str, kru kruVar) {
        this.a = cnaVar;
        this.b = str;
        this.c = kruVar;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        kru kruVar = (kru) obj2;
        if (!this.a.j.contains(this.b)) {
            kru kruVar2 = this.c;
            if (kruVar == null || kruVar2.d > kruVar.d) {
                return kruVar2;
            }
        }
        return kruVar;
    }
}
