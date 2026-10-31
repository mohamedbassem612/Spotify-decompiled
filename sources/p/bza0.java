package p;

import android.net.Uri;
import com.spotify.kidsaccount.api.v2.proto.CreateChildLoginTokenRequest;
import com.spotify.kidsaccount.api.v2.proto.CreateChildLoginTokenResponse;
import com.spotify.kidsaccount.api.v2.proto.GetChildAccountEducationAttributesResponse;
import com.spotify.kidsaccount.api.v2.proto.GetChildAccountSettingsRequest;
import com.spotify.kidsaccount.api.v2.proto.GetChildAccountSettingsResponse;
import com.spotify.kidsaccount.api.v2.proto.NotEmpty;
import com.spotify.kidsaccount.api.v2.proto.SetChildAccountSettingsRequest;
import com.spotify.kidsaccount.api.v2.proto.VerifyPinRequest;
import com.spotify.kidsaccount.api.v2.proto.VerifyPinResponse;
import io.reactivex.rxjava3.core.Completable;
import j$.net.URLEncoder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bza0 {
    public final iza0 a;
    public final iwe0 b;
    public final g8h1 c;
    public final boolean d;
    public final z6r0 e;

    public bza0(iza0 iza0Var, iwe0 iwe0Var, g8h1 g8h1Var, boolean z, z6r0 z6r0Var) {
        this.a = iza0Var;
        this.b = iwe0Var;
        this.c = g8h1Var;
        this.d = z;
        this.e = z6r0Var;
    }

    public static Completable g(bza0 bza0Var, String str, String str2, String str3, Boolean bool, Boolean bool2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            bool2 = null;
        }
        ak61 ak61VarO = SetChildAccountSettingsRequest.o();
        ak61VarO.n(str);
        if (str2 != null) {
            ak61VarO.r(str2);
        }
        if (str3 != null) {
            ak61VarO.q(str3);
        }
        if (bool != null) {
            ak61VarO.s(bool.booleanValue());
        }
        if (bool2 != null) {
            ak61VarO.t(bool2.booleanValue());
        }
        return bza0Var.a.k((SetChildAccountSettingsRequest) ak61VarO.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, dxr0 dxr0Var, onm onmVar) {
        vya0 vya0Var;
        String string;
        boolean zA;
        if (onmVar instanceof vya0) {
            vya0Var = (vya0) onmVar;
            int i = vya0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vya0Var.c = i - Integer.MIN_VALUE;
            } else {
                vya0Var = new vya0(this, onmVar);
            }
        } else {
            vya0Var = new vya0(this, onmVar);
        }
        Object objB = vya0Var.a;
        int i2 = vya0Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            if (ihc1.y0(str) || ihc1.y0(str2)) {
                k220.f(new IllegalStateException("Unable to create kid account. Missing required data"));
                return null;
            }
            if (str3 != null) {
                int i3 = hu50.a;
                string = gu50.a.F(str3, nne.a).toString();
            } else {
                string = null;
            }
            bww0 bww0Var = new bww0(str, str2);
            ewr0 ewr0Var = dxr0Var.a;
            boolean z = ewr0Var instanceof ewr0;
            boolean zA2 = false;
            lwr0 lwr0Var = lwr0.a;
            if (z) {
                zA = ewr0Var.a();
            } else {
                if (!u890.j(ewr0Var, lwr0Var)) {
                    eg.o();
                    return null;
                }
                zA = false;
            }
            ewr0 ewr0Var2 = dxr0Var.b;
            if (ewr0Var2 instanceof ewr0) {
                zA2 = ewr0Var2.a();
            } else if (!u890.j(ewr0Var2, lwr0Var)) {
                eg.o();
                return null;
            }
            de1 de1Var = new de1(bww0Var, string, new hxr0(zA, zA2));
            vya0Var.c = 1;
            objB = this.a.b(de1Var, vya0Var);
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
        return ((ge1) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, Boolean bool, onm onmVar) {
        wya0 wya0Var;
        if (onmVar instanceof wya0) {
            wya0Var = (wya0) onmVar;
            int i = wya0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wya0Var.e = i - Integer.MIN_VALUE;
            } else {
                wya0Var = new wya0(this, onmVar);
            }
        } else {
            wya0Var = new wya0(this, onmVar);
        }
        Object objN = wya0Var.c;
        int i2 = wya0Var.e;
        if (i2 == 0) {
            hm5.M(objN);
            qjn qjnVarO = CreateChildLoginTokenRequest.o();
            qjnVarO.n(str);
            CreateChildLoginTokenRequest createChildLoginTokenRequest = (CreateChildLoginTokenRequest) qjnVarO.build();
            wya0Var.a = str;
            wya0Var.b = bool;
            wya0Var.e = 1;
            objN = this.a.n(createChildLoginTokenRequest, wya0Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bool = wya0Var.b;
            str = wya0Var.a;
            hm5.M(objN);
        }
        String str2 = str;
        CreateChildLoginTokenResponse createChildLoginTokenResponse = (CreateChildLoginTokenResponse) objN;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : createChildLoginTokenResponse.getIsFree();
        String str3 = zBooleanValue ? "free_managed_account" : "managed_account";
        String strName = nne.a.name();
        StringBuilder sbN = gvg.n("https://accounts.spotify.com/login/ott/music#username=", URLEncoder.encode(createChildLoginTokenResponse.p(), strName), "&token=", URLEncoder.encode(createChildLoginTokenResponse.q(), strName), "&flow=");
        sbN.append(str3);
        return new u1f0(createChildLoginTokenResponse.r() ? yah0.p(createChildLoginTokenResponse.n().getValue()) : null, str2, d(sbN.toString()), createChildLoginTokenResponse.o(), zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        xya0 xya0Var;
        if (onmVar instanceof xya0) {
            xya0Var = (xya0) onmVar;
            int i = xya0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xya0Var.c = i - Integer.MIN_VALUE;
            } else {
                xya0Var = new xya0(this, onmVar);
            }
        } else {
            xya0Var = new xya0(this, onmVar);
        }
        Object objF = xya0Var.a;
        int i2 = xya0Var.c;
        if (i2 == 0) {
            hm5.M(objF);
            ml40 ml40VarO = GetChildAccountSettingsRequest.o();
            ml40VarO.n(str);
            GetChildAccountSettingsRequest getChildAccountSettingsRequest = (GetChildAccountSettingsRequest) ml40VarO.build();
            xya0Var.c = 1;
            objF = this.a.f(getChildAccountSettingsRequest, xya0Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        GetChildAccountSettingsResponse getChildAccountSettingsResponse = (GetChildAccountSettingsResponse) objF;
        String name = getChildAccountSettingsResponse.getName();
        String dateOfBirth = getChildAccountSettingsResponse.getDateOfBirth();
        String dateOfBirthMinDate = getChildAccountSettingsResponse.getDateOfBirthMinDate();
        String dateOfBirthMaxDate = getChildAccountSettingsResponse.getDateOfBirthMaxDate();
        String strN = getChildAccountSettingsResponse.n();
        String dateOfBirthMaxDate2 = getChildAccountSettingsResponse.getDateOfBirthMaxDate();
        boolean available = getChildAccountSettingsResponse.o().getAvailable();
        ewr0 ewr0Var = lwr0.a;
        ewr0 ewr0Var2 = available ? new ewr0(getChildAccountSettingsResponse.o().getValue()) : ewr0Var;
        if (getChildAccountSettingsResponse.p().getAvailable()) {
            ewr0Var = new ewr0(getChildAccountSettingsResponse.p().getValue());
        }
        return new zxa0(name, dateOfBirth, dateOfBirthMinDate, dateOfBirthMaxDate, strN, dateOfBirthMaxDate2, new dxr0(ewr0Var2, ewr0Var), getChildAccountSettingsResponse.getImageUri().getValue(), yah0.p(getChildAccountSettingsResponse.getColor().getValue()));
    }

    public final String d(String str) {
        if (!this.d) {
            return str;
        }
        y6r0 y6r0VarB = this.e.b();
        String string = this.c.b(Uri.parse(str), y6r0VarB != null ? new xvn0(y6r0VarB) : null).toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        yya0 yya0Var;
        if (onmVar instanceof yya0) {
            yya0Var = (yya0) onmVar;
            int i = yya0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yya0Var.c = i - Integer.MIN_VALUE;
            } else {
                yya0Var = new yya0(this, onmVar);
            }
        } else {
            yya0Var = new yya0(this, onmVar);
        }
        Object objM = yya0Var.a;
        int i2 = yya0Var.c;
        if (i2 == 0) {
            hm5.M(objM);
            bgo0 bgo0VarO = NotEmpty.o();
            bgo0VarO.n();
            NotEmpty notEmpty = (NotEmpty) bgo0VarO.build();
            yya0Var.c = 1;
            objM = this.a.m(notEmpty, yya0Var);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        return yah0.p(((GetChildAccountEducationAttributesResponse) objM).n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, onm onmVar) {
        zya0 zya0Var;
        if (onmVar instanceof zya0) {
            zya0Var = (zya0) onmVar;
            int i = zya0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zya0Var.c = i - Integer.MIN_VALUE;
            } else {
                zya0Var = new zya0(this, onmVar);
            }
        } else {
            zya0Var = new zya0(this, onmVar);
        }
        Object objD = zya0Var.a;
        int i2 = zya0Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            int i3 = hu50.a;
            nao0 nao0Var = new nao0(gu50.a.F(str, nne.a).toString());
            zya0Var.c = 1;
            objD = this.a.d(nao0Var, zya0Var);
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
        return ((nao0) objD).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, onm onmVar) {
        aza0 aza0Var;
        if (onmVar instanceof aza0) {
            aza0Var = (aza0) onmVar;
            int i = aza0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aza0Var.c = i - Integer.MIN_VALUE;
            } else {
                aza0Var = new aza0(this, onmVar);
            }
        } else {
            aza0Var = new aza0(this, onmVar);
        }
        Object objJ = aza0Var.a;
        int i2 = aza0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            int i3 = hu50.a;
            String string = gu50.a.F(str, nne.a).toString();
            o3j1 o3j1VarO = VerifyPinRequest.o();
            o3j1VarO.n(string);
            VerifyPinRequest verifyPinRequest = (VerifyPinRequest) o3j1VarO.build();
            aza0Var.c = 1;
            objJ = this.a.j(verifyPinRequest, aza0Var);
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
        return yah0.m(((VerifyPinResponse) objJ).n());
    }
}
