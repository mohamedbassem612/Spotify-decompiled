package p;

import com.spotify.teenlink.proto.view.CreateLinkViewRequest;
import com.spotify.teenlink.proto.view.CreateLinkViewResponse;
import com.spotify.teenlink.proto.view.GetAgeConfigResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class axd1 {
    public final bxd1 a;

    public axd1(bxd1 bxd1Var) {
        this.a = bxd1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        ywd1 ywd1Var;
        if (onmVar instanceof ywd1) {
            ywd1Var = (ywd1) onmVar;
            int i = ywd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ywd1Var.c = i - Integer.MIN_VALUE;
            } else {
                ywd1Var = new ywd1(this, onmVar);
            }
        } else {
            ywd1Var = new ywd1(this, onmVar);
        }
        Object objA = ywd1Var.a;
        int i2 = ywd1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            wln wlnVarN = CreateLinkViewRequest.n();
            wlnVarN.q(str);
            wlnVarN.n(str2);
            CreateLinkViewRequest createLinkViewRequestBuild = wlnVarN.build();
            ywd1Var.c = 1;
            objA = this.a.a(createLinkViewRequestBuild, ywd1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        return ((CreateLinkViewResponse) objA).n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        zwd1 zwd1Var;
        if (onmVar instanceof zwd1) {
            zwd1Var = (zwd1) onmVar;
            int i = zwd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zwd1Var.c = i - Integer.MIN_VALUE;
            } else {
                zwd1Var = new zwd1(this, onmVar);
            }
        } else {
            zwd1Var = new zwd1(this, onmVar);
        }
        Object objB = zwd1Var.a;
        int i2 = zwd1Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            zwd1Var.c = 1;
            objB = this.a.b(zwd1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        GetAgeConfigResponse getAgeConfigResponse = (GetAgeConfigResponse) objB;
        return new bwd1(getAgeConfigResponse.n(), getAgeConfigResponse.p(), getAgeConfigResponse.o());
    }
}
