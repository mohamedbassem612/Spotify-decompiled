package p;

import com.spotify.accountswitching.v1.GetAddAccountPageRequest;
import com.spotify.familyviewservice.v1.AddChildToPlanRequest;
import com.spotify.familyviewservice.v1.Allocation;
import com.spotify.familyviewservice.v1.CreateDowngradeCheckoutRequest;
import com.spotify.familyviewservice.v1.CreateDowngradeCheckoutResponse;
import com.spotify.familyviewservice.v1.GenAlphaManagedSettings;
import com.spotify.familyviewservice.v1.GetAddChildToPlanPageRequest;
import com.spotify.familyviewservice.v1.GetProfileRequest;
import com.spotify.familyviewservice.v1.GetProfileResponse;
import com.spotify.familyviewservice.v1.GetRegularMemberDetailsRequest;
import com.spotify.familyviewservice.v1.GetRegularMemberDetailsResponse;
import com.spotify.familyviewservice.v1.GetRemoveMemberPageRequest;
import com.spotify.familyviewservice.v1.MemberProfile;
import com.spotify.familyviewservice.v1.RemoveOrDeleteMemberRequest;
import com.spotify.familyviewservice.v1.RemoveOrDeleteMemberResponse;
import com.spotify.familyviewservice.v1.SetParentalControlRequest;
import com.spotify.familyviewservice.v1.SetParentalControlsRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gj10 {
    public final hj10 a;
    public final fw b;
    public final jq c;

    public gj10(hj10 hj10Var, fw fwVar, jq jqVar) {
        this.a = hj10Var;
        this.b = fwVar;
        this.c = jqVar;
    }

    public static int d(MemberProfile memberProfile) {
        if (memberProfile.hasColor()) {
            return memberProfile.getColor().getValue();
        }
        return 0;
    }

    public static Object j(gj10 gj10Var, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, onm onmVar, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            bool3 = null;
        }
        if ((i & 16) != 0) {
            bool4 = null;
        }
        vk61 vk61VarO = SetParentalControlRequest.o();
        vk61VarO.t(str);
        if (bool != null) {
            vk61VarO.q(bool.booleanValue());
        }
        if (bool2 != null) {
            vk61VarO.r(bool2.booleanValue());
        }
        if (bool3 != null) {
            vk61VarO.n(bool3.booleanValue());
        }
        if (bool4 != null) {
            vk61VarO.s(bool4.booleanValue());
        }
        SetParentalControlRequest setParentalControlRequest = (SetParentalControlRequest) vk61VarO.build();
        hj10 hj10Var = gj10Var.a;
        setParentalControlRequest.getClass();
        Object objI = fc11.i(hj10Var.h(setParentalControlRequest), onmVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    public static Completable k(gj10 gj10Var, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            bool3 = null;
        }
        nc40 nc40VarN = GenAlphaManagedSettings.n();
        if (str2 != null) {
            nc40VarN.t(str2);
        }
        if (str3 != null) {
            nc40VarN.s(str3);
        }
        if (bool != null) {
            nc40VarN.n(bool.booleanValue());
        }
        if (bool2 != null) {
            nc40VarN.q(bool2.booleanValue());
        }
        if (bool3 != null) {
            nc40VarN.r(bool3.booleanValue());
        }
        GenAlphaManagedSettings genAlphaManagedSettingsBuild = nc40VarN.build();
        wk61 wk61VarO = SetParentalControlsRequest.o();
        wk61VarO.n(str);
        wk61VarO.q(genAlphaManagedSettingsBuild);
        SetParentalControlsRequest setParentalControlsRequest = (SetParentalControlsRequest) wk61VarO.build();
        hj10 hj10Var = gj10Var.a;
        setParentalControlsRequest.getClass();
        return hj10Var.c(setParentalControlsRequest);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        wi10 wi10Var;
        if (onmVar instanceof wi10) {
            wi10Var = (wi10) onmVar;
            int i = wi10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wi10Var.c = i - Integer.MIN_VALUE;
            } else {
                wi10Var = new wi10(this, onmVar);
            }
        } else {
            wi10Var = new wi10(this, onmVar);
        }
        Object objJ = wi10Var.a;
        int i2 = wi10Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ed1 ed1VarO = AddChildToPlanRequest.o();
            ed1VarO.n(str);
            SingleSource map = this.a.o((AddChildToPlanRequest) ed1VarO.build()).map(xi10.b);
            wi10Var.c = 1;
            objJ = fc11.j(map, wi10Var);
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
    public final Object b(String str, onm onmVar, boolean z) {
        yi10 yi10Var;
        if (onmVar instanceof yi10) {
            yi10Var = (yi10) onmVar;
            int i = yi10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yi10Var.c = i - Integer.MIN_VALUE;
            } else {
                yi10Var = new yi10(this, onmVar);
            }
        } else {
            yi10Var = new yi10(this, onmVar);
        }
        Object objJ = yi10Var.a;
        int i2 = yi10Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            akn aknVarO = CreateDowngradeCheckoutRequest.o();
            aknVarO.n(str);
            aknVarO.q(z);
            Single<CreateDowngradeCheckoutResponse> singleN = this.a.n((CreateDowngradeCheckoutRequest) aknVarO.build());
            yi10Var.c = 1;
            objJ = fc11.j(singleN, yi10Var);
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
        if (u890.j((CreateDowngradeCheckoutResponse) objJ, CreateDowngradeCheckoutResponse.o())) {
            objJ = null;
        }
        CreateDowngradeCheckoutResponse createDowngradeCheckoutResponse = (CreateDowngradeCheckoutResponse) objJ;
        if (createDowngradeCheckoutResponse != null) {
            return new fru(createDowngradeCheckoutResponse.n(), createDowngradeCheckoutResponse.p());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        zi10 zi10Var;
        if (onmVar instanceof zi10) {
            zi10Var = (zi10) onmVar;
            int i = zi10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zi10Var.c = i - Integer.MIN_VALUE;
            } else {
                zi10Var = new zi10(this, onmVar);
            }
        } else {
            zi10Var = new zi10(this, onmVar);
        }
        Object objJ = zi10Var.a;
        int i2 = zi10Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            mk40 mk40VarO = GetAddChildToPlanPageRequest.o();
            mk40VarO.n(str);
            SingleSource map = this.a.m((GetAddChildToPlanPageRequest) mk40VarO.build()).map(new zjp1(str, (byte) 4));
            zi10Var.c = 1;
            objJ = fc11.j(map, zi10Var);
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
    public final Object e(String str, onm onmVar) {
        aj10 aj10Var;
        Object obj;
        if (onmVar instanceof aj10) {
            aj10Var = (aj10) onmVar;
            int i = aj10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aj10Var.c = i - Integer.MIN_VALUE;
            } else {
                aj10Var = new aj10(this, onmVar);
            }
        } else {
            aj10Var = new aj10(this, onmVar);
        }
        Object objD = aj10Var.a;
        int i2 = aj10Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            wo40 wo40VarO = GetProfileRequest.o();
            wo40VarO.n(str);
            GetProfileRequest getProfileRequest = (GetProfileRequest) wo40VarO.build();
            getProfileRequest.getClass();
            aj10Var.c = 1;
            objD = this.a.d(getProfileRequest, aj10Var);
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
        sy21 sy21Var = (sy21) objD;
        if (!sy21Var.a.Q0 || (obj = sy21Var.b) == null) {
            hhg1.o(sy21Var, "Failed to load profile data: ");
            return null;
        }
        MemberProfile memberProfileN = ((GetProfileResponse) obj).n();
        return new y0x0(d(memberProfileN), memberProfileN.getDisplayName(), memberProfileN.getImageUrl());
    }

    public final Single f(boolean z) {
        jq jqVar = this.c;
        if (z) {
            lk40 lk40VarO = GetAddAccountPageRequest.o();
            lk40VarO.n();
            GetAddAccountPageRequest getAddAccountPageRequestBuild = lk40VarO.build();
            getAddAccountPageRequestBuild.getClass();
            return this.b.a(getAddAccountPageRequestBuild).zipWith(jqVar.k(), new ubc(this, (byte) 10));
        }
        kk40 kk40VarO = com.spotify.familyviewservice.accountswitching.v1.GetAddAccountPageRequest.o();
        kk40VarO.n();
        com.spotify.familyviewservice.accountswitching.v1.GetAddAccountPageRequest getAddAccountPageRequest = (com.spotify.familyviewservice.accountswitching.v1.GetAddAccountPageRequest) kk40VarO.build();
        getAddAccountPageRequest.getClass();
        return this.a.l(getAddAccountPageRequest).zipWith(jqVar.k(), new nbc(this, (byte) 10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(String str, onm onmVar) {
        bj10 bj10Var;
        Object obj;
        if (onmVar instanceof bj10) {
            bj10Var = (bj10) onmVar;
            int i = bj10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bj10Var.c = i - Integer.MIN_VALUE;
            } else {
                bj10Var = new bj10(this, onmVar);
            }
        } else {
            bj10Var = new bj10(this, onmVar);
        }
        Object objK = bj10Var.a;
        int i2 = bj10Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            np40 np40VarO = GetRegularMemberDetailsRequest.o();
            np40VarO.n(str);
            GetRegularMemberDetailsRequest getRegularMemberDetailsRequest = (GetRegularMemberDetailsRequest) np40VarO.build();
            getRegularMemberDetailsRequest.getClass();
            bj10Var.c = 1;
            objK = this.a.k(getRegularMemberDetailsRequest, bj10Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        sy21 sy21Var = (sy21) objK;
        if (!sy21Var.a.Q0 || (obj = sy21Var.b) == null) {
            hhg1.o(sy21Var, "Failed to load regular member details: ");
            return null;
        }
        GetRegularMemberDetailsResponse getRegularMemberDetailsResponse = (GetRegularMemberDetailsResponse) obj;
        String memberId = getRegularMemberDetailsResponse.getMemberId();
        String displayName = getRegularMemberDetailsResponse.u().getDisplayName();
        String imageUrl = getRegularMemberDetailsResponse.u().getImageUrl();
        int iD = d(getRegularMemberDetailsResponse.u());
        boolean zP = getRegularMemberDetailsResponse.t().p();
        boolean zS = getRegularMemberDetailsResponse.s();
        boolean zR = getRegularMemberDetailsResponse.r();
        boolean zP2 = getRegularMemberDetailsResponse.p();
        h290 h290VarN = getRegularMemberDetailsResponse.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        Iterator it = h290VarN.iterator();
        while (it.hasNext()) {
            arrayList.add(((Allocation) it.next()).getName());
        }
        return new lg11(memberId, displayName, imageUrl, iD, zP, zS, zR, zP2, arrayList, getRegularMemberDetailsResponse.q(), getRegularMemberDetailsResponse.o(), getRegularMemberDetailsResponse.p(), getRegularMemberDetailsResponse.t().q(), getRegularMemberDetailsResponse.t().n(), getRegularMemberDetailsResponse.t().r());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, onm onmVar) {
        cj10 cj10Var;
        if (onmVar instanceof cj10) {
            cj10Var = (cj10) onmVar;
            int i = cj10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cj10Var.c = i - Integer.MIN_VALUE;
            } else {
                cj10Var = new cj10(this, onmVar);
            }
        } else {
            cj10Var = new cj10(this, onmVar);
        }
        Object objJ = cj10Var.a;
        int i2 = cj10Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            op40 op40VarO = GetRemoveMemberPageRequest.o();
            op40VarO.n(str);
            SingleSource map = this.a.b((GetRemoveMemberPageRequest) op40VarO.build()).map(dj10.b);
            cj10Var.c = 1;
            objJ = fc11.j(map, cj10Var);
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
    public final Object i(String str, onm onmVar) {
        ej10 ej10Var;
        if (onmVar instanceof ej10) {
            ej10Var = (ej10) onmVar;
            int i = ej10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ej10Var.c = i - Integer.MIN_VALUE;
            } else {
                ej10Var = new ej10(this, onmVar);
            }
        } else {
            ej10Var = new ej10(this, onmVar);
        }
        Object objJ = ej10Var.a;
        int i2 = ej10Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            p921 p921VarO = RemoveOrDeleteMemberRequest.o();
            p921VarO.n(str);
            Single<RemoveOrDeleteMemberResponse> singleF = this.a.f((RemoveOrDeleteMemberRequest) p921VarO.build());
            ej10Var.c = 1;
            objJ = fc11.j(singleF, ej10Var);
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
        return ((RemoveOrDeleteMemberResponse) objJ).n();
    }
}
