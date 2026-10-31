package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class bs implements Function {
    public final /* synthetic */ cs a;
    public final /* synthetic */ lw b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public bs(cs csVar, lw lwVar, String str, String str2, boolean z) {
        this.a = csVar;
        this.b = lwVar;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final Object apply(Object obj) {
        zv zvVar = (bw) obj;
        if (!(zvVar instanceof zv)) {
            if (zvVar instanceof aw) {
                return Single.just(Boolean.FALSE);
            }
            eg.o();
            return null;
        }
        ai8 ai8Var = zvVar.a;
        cs csVar = this.a;
        return csVar.b((mlb1) null).flatMap(new zr(csVar, this.b, ai8Var, this.c, this.d, this.e));
    }
}
