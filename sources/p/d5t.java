package p;

import com.spotify.image.esperanto.proto.EsImage$GetImageParams;
import com.spotify.image.esperanto.proto.EsImage$Size;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d5t extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ir20 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ uo5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5t(String str, ir20 ir20Var, int i, int i2, uo5 uo5Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = str;
        this.c = ir20Var;
        this.d = i;
        this.e = i2;
        this.f = uo5Var;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new d5t(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((d5t) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        com.spotify.image.esperanto.proto.a aVarN = EsImage$GetImageParams.n();
        aVarN.q(this.b);
        com.spotify.image.esperanto.proto.b bVarN = EsImage$GetImageParams.Resolve.n();
        mmr0 mmr0VarG = this.c.g(this.d, this.e);
        int iIntValue = ((Number) mmr0VarG.a).intValue();
        int iIntValue2 = ((Number) mmr0VarG.b).intValue();
        if (iIntValue != 0 && iIntValue2 != 0) {
            unz unzVarN = EsImage$Size.n();
            unzVarN.q(iIntValue);
            unzVarN.n(iIntValue2);
            bVarN.n(unzVarN);
        }
        aVarN.n((EsImage$GetImageParams.Resolve) bVarN.build());
        Single singleOnErrorReturn = ((ur70) this.f.b).callSingle("spotify.image.esperanto.proto.Image", "GetImage", (EsImage$GetImageParams) aVarN.build()).map(fkj0.V0).onErrorReturn(wdu0.O0);
        this.a = true;
        Object objJ = fc11.j(singleOnErrorReturn, this);
        d9n d9nVar = d9n.a;
        return objJ == d9nVar ? d9nVar : objJ;
    }
}
