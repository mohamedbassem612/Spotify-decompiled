package p;

import com.spotify.kidsaccount.api.v3.proto.AddChildRequest;
import com.spotify.kidsaccount.api.v3.proto.AddChildResponse;
import com.spotify.kidsaccount.api.v3.proto.ChildAttributes;
import com.spotify.kidsaccount.api.v3.proto.ChildProfile;
import com.spotify.kidsaccount.api.v3.proto.GetChildDateOfBirthRangeRequest;
import com.spotify.kidsaccount.api.v3.proto.GetChildDateOfBirthRangeResponse;
import com.spotify.kidsaccount.api.v3.proto.GetCreateChildConfigRequest;
import com.spotify.kidsaccount.api.v3.proto.GetCreateChildConfigResponse;
import com.spotify.kidsaccount.api.v3.proto.GetTransitionChildConfigRequest;
import com.spotify.kidsaccount.api.v3.proto.GetTransitionChildConfigResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gza0 {
    public final jza0 a;

    public gza0(jza0 jza0Var) {
        this.a = jza0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, dxr0 dxr0Var, String str4, onm onmVar) {
        cza0 cza0Var;
        String string;
        boolean z;
        if (onmVar instanceof cza0) {
            cza0Var = (cza0) onmVar;
            int i = cza0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cza0Var.c = i - Integer.MIN_VALUE;
            } else {
                cza0Var = new cza0(this, onmVar);
            }
        } else {
            cza0Var = new cza0(this, onmVar);
        }
        Object objB = cza0Var.a;
        int i2 = cza0Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            if (str3 != null) {
                int i3 = hu50.a;
                string = gu50.a.F(str3, nne.a).toString();
            } else {
                string = null;
            }
            dd1 dd1VarN = AddChildRequest.n();
            e2g e2gVarN = ChildProfile.n();
            e2gVarN.q(str);
            e2gVarN.n(str2);
            dd1VarN.s(e2gVarN.build());
            b0g b0gVarN = ChildAttributes.n();
            mwr0 mwr0Var = dxr0Var.b;
            boolean z2 = mwr0Var instanceof ewr0;
            boolean z3 = false;
            lwr0 lwr0Var = lwr0.a;
            if (z2) {
                z = ((ewr0) mwr0Var).a;
            } else {
                if (!u890.j(mwr0Var, lwr0Var)) {
                    eg.o();
                    return null;
                }
                z = false;
            }
            b0gVarN.n(z);
            mwr0 mwr0Var2 = dxr0Var.a;
            if (mwr0Var2 instanceof ewr0) {
                z3 = ((ewr0) mwr0Var2).a;
            } else if (!u890.j(mwr0Var2, lwr0Var)) {
                eg.o();
                return null;
            }
            b0gVarN.q(z3);
            dd1VarN.n(b0gVarN.build());
            if (string != null) {
                dd1VarN.r(string);
            }
            if (str4 != null) {
                dd1VarN.q(str4);
            }
            AddChildRequest addChildRequestBuild = dd1VarN.build();
            cza0Var.c = 1;
            objB = this.a.b(addChildRequestBuild, cza0Var);
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
        return ((AddChildResponse) objB).getChildId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        dza0 dza0Var;
        if (onmVar instanceof dza0) {
            dza0Var = (dza0) onmVar;
            int i = dza0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dza0Var.c = i - Integer.MIN_VALUE;
            } else {
                dza0Var = new dza0(this, onmVar);
            }
        } else {
            dza0Var = new dza0(this, onmVar);
        }
        Object objA = dza0Var.a;
        int i2 = dza0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            nl40 nl40VarN = GetChildDateOfBirthRangeRequest.n();
            nl40VarN.n();
            GetChildDateOfBirthRangeRequest getChildDateOfBirthRangeRequestBuild = nl40VarN.build();
            getChildDateOfBirthRangeRequestBuild.getClass();
            dza0Var.c = 1;
            objA = this.a.a(getChildDateOfBirthRangeRequestBuild, dza0Var);
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
        GetChildDateOfBirthRangeResponse getChildDateOfBirthRangeResponse = (GetChildDateOfBirthRangeResponse) objA;
        return new g0g(getChildDateOfBirthRangeResponse.o(), getChildDateOfBirthRangeResponse.n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        eza0 eza0Var;
        if (onmVar instanceof eza0) {
            eza0Var = (eza0) onmVar;
            int i = eza0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eza0Var.c = i - Integer.MIN_VALUE;
            } else {
                eza0Var = new eza0(this, onmVar);
            }
        } else {
            eza0Var = new eza0(this, onmVar);
        }
        Object objC = eza0Var.a;
        int i2 = eza0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            im40 im40VarN = GetCreateChildConfigRequest.n();
            im40VarN.q();
            if (str != null) {
                im40VarN.n(str);
            }
            GetCreateChildConfigRequest getCreateChildConfigRequestBuild = im40VarN.build();
            eza0Var.c = 1;
            objC = this.a.c(getCreateChildConfigRequestBuild, eza0Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        GetCreateChildConfigResponse getCreateChildConfigResponse = (GetCreateChildConfigResponse) objC;
        return l0o1.l(getCreateChildConfigResponse.q(), getCreateChildConfigResponse.n(), getCreateChildConfigResponse.r(), getCreateChildConfigResponse.p(), getCreateChildConfigResponse.o(), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(yig1 yig1Var, onm onmVar) {
        fza0 fza0Var;
        GetTransitionChildConfigRequest getTransitionChildConfigRequestBuild;
        if (onmVar instanceof fza0) {
            fza0Var = (fza0) onmVar;
            int i = fza0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fza0Var.c = i - Integer.MIN_VALUE;
            } else {
                fza0Var = new fza0(this, onmVar);
            }
        } else {
            fza0Var = new fza0(this, onmVar);
        }
        Object objD = fza0Var.a;
        int i2 = fza0Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            if (yig1Var instanceof xig1) {
                wq40 wq40VarN = GetTransitionChildConfigRequest.n();
                wq40VarN.q(((xig1) yig1Var).a);
                getTransitionChildConfigRequestBuild = (GetTransitionChildConfigRequest) wq40VarN.build();
            } else {
                if (!(yig1Var instanceof wig1)) {
                    eg.o();
                    return null;
                }
                wq40 wq40VarN2 = GetTransitionChildConfigRequest.n();
                wq40VarN2.n(((wig1) yig1Var).a);
                getTransitionChildConfigRequestBuild = wq40VarN2.build();
            }
            getTransitionChildConfigRequestBuild.getClass();
            fza0Var.c = 1;
            objD = this.a.d(getTransitionChildConfigRequestBuild, fza0Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        GetTransitionChildConfigResponse getTransitionChildConfigResponse = (GetTransitionChildConfigResponse) objD;
        return l0o1.l(getTransitionChildConfigResponse.r(), getTransitionChildConfigResponse.n(), getTransitionChildConfigResponse.s(), getTransitionChildConfigResponse.p(), getTransitionChildConfigResponse.o(), getTransitionChildConfigResponse.q());
    }
}
