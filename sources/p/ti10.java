package p;

import com.spotify.familygatedcontent.v1.GetFeatureRequestDialogRequest;
import com.spotify.familygatedcontent.v1.RequestFeatureRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ti10 {
    public final ui10 a;

    public ti10(ui10 ui10Var) {
        this.a = ui10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        qi10 qi10Var;
        if (onmVar instanceof qi10) {
            qi10Var = (qi10) onmVar;
            int i = qi10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qi10Var.c = i - Integer.MIN_VALUE;
            } else {
                qi10Var = new qi10(this, onmVar);
            }
        } else {
            qi10Var = new qi10(this, onmVar);
        }
        Object objJ = qi10Var.a;
        int i2 = qi10Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            fn40 fn40VarN = GetFeatureRequestDialogRequest.n();
            fn40VarN.q(str);
            fn40VarN.n(str2);
            Single map = this.a.b(fn40VarN.build()).map(new yjp1(str, (byte) 7));
            qi10Var.c = 1;
            objJ = fc11.j(map, qi10Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, onm onmVar) {
        ri10 ri10Var;
        if (onmVar instanceof ri10) {
            ri10Var = (ri10) onmVar;
            int i = ri10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ri10Var.c = i - Integer.MIN_VALUE;
            } else {
                ri10Var = new ri10(this, onmVar);
            }
        } else {
            ri10Var = new ri10(this, onmVar);
        }
        Object objJ = ri10Var.a;
        int i2 = ri10Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ro21 ro21VarN = RequestFeatureRequest.n();
            ro21VarN.q(str);
            if (str2 != null) {
                ro21VarN.n(str2);
            }
            RequestFeatureRequest requestFeatureRequestBuild = ro21VarN.build();
            requestFeatureRequestBuild.getClass();
            Single map = this.a.a(requestFeatureRequestBuild).map(si10.b);
            ri10Var.c = 1;
            objJ = fc11.j(map, ri10Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }
}
