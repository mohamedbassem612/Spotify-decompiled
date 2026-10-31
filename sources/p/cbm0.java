package p;

import com.spotify.address.endpoint.model.v1.proto.AddressForm;
import com.spotify.address.endpoint.model.v1.proto.FormField;
import com.spotify.address.endpoint.model.v1.proto.SavedAddress;
import com.spotify.address.endpoint.model.v1.proto.d;
import com.spotify.address.endpoint.model.v1.proto.e;
import com.spotify.address.endpoint.model.v1.proto.f;
import com.spotify.address.endpoint.model.v1.proto.g;
import com.spotify.address.endpoint.model.v1.proto.i;
import com.spotify.address.endpoint.model.v1.proto.k;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cbm0 {
    public static final cbm0 a = new cbm0();
    public static final bma1 b = bma1.b.u("address_mock_endpoint_response");
    public static final Map c = sqg0.J(new mmr0[]{new mmr0("AL", "Alabama"), new mmr0("AK", "Alaska"), new mmr0("FL", "Florida"), new mmr0("HI", "Hawaii"), new mmr0("OH", "Ohio"), new mmr0("TX", "Texas"), new mmr0("DC", "Washington, DC"), new mmr0("error", "Network Error"), new mmr0("invalid", "Invalid"), new mmr0("suggestion", "Suggestion")});
    public static final SavedAddress d;

    static {
        rd41 rd41VarS = SavedAddress.s();
        rd41VarS.n(p7h.M(new String[]{"1600 Pennsylvania Avenue", "Washington, DC 20500", "US"}));
        rd41VarS.r();
        d = (SavedAddress) rd41VarS.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AddressForm b(boolean z) {
        j12 j12VarU = AddressForm.u();
        FormField[] formFieldArr = new FormField[4];
        e eVarU = FormField.u();
        eVarU.t("street");
        eVarU.u("Street");
        if (z) {
            d dVarT = FormField.Autocomplete.t();
            dVarT.t();
            dVarT.r();
            dVarT.s();
            dVarT.n();
            eVarU.r((FormField.Autocomplete) dVarT.build());
        } else {
            eVarU.v(FormField.Text.p());
        }
        i iVarR = FormField.ValidationRule.r();
        iVarR.q(FormField.ValidationRule.Mandatory.n());
        iVarR.n("Enter a valid address");
        eVarU.n(Collections.singletonList(iVarR.build()));
        formFieldArr[0] = eVarU.build();
        e eVarU2 = FormField.u();
        eVarU2.t("city");
        eVarU2.u("Town/City");
        eVarU2.v(FormField.Text.p());
        i iVarR2 = FormField.ValidationRule.r();
        iVarR2.q(FormField.ValidationRule.Mandatory.n());
        iVarR2.n("Enter a valid town/city");
        eVarU2.n(Collections.singletonList(iVarR2.build()));
        formFieldArr[1] = eVarU2.build();
        e eVarU3 = FormField.u();
        eVarU3.t("state");
        eVarU3.u("State");
        f fVarS = FormField.Dropdown.s();
        fVarS.r();
        Map map = c;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            g gVarO = FormField.Dropdown.Option.o();
            gVarO.q((String) entry.getKey());
            gVarO.n((String) entry.getValue());
            arrayList.add((FormField.Dropdown.Option) gVarO.build());
        }
        fVarS.n(arrayList);
        eVarU3.s(fVarS);
        i iVarR3 = FormField.ValidationRule.r();
        iVarR3.q(FormField.ValidationRule.Mandatory.n());
        iVarR3.n("Select your state");
        eVarU3.n(Collections.singletonList(iVarR3.build()));
        formFieldArr[2] = eVarU3.build();
        e eVarU4 = FormField.u();
        eVarU4.t("zip");
        eVarU4.u("ZIP code");
        eVarU4.v(FormField.Text.p());
        i iVarR4 = FormField.ValidationRule.r();
        iVarR4.q(FormField.ValidationRule.Mandatory.n());
        iVarR4.n("This field is required");
        i iVarR5 = FormField.ValidationRule.r();
        k kVarP = FormField.ValidationRule.RegEx.p();
        kVarP.n();
        iVarR5.r(kVarP);
        iVarR5.n("Enter a valid 5-digit ZIP Code");
        eVarU4.n(p7h.M(new FormField.ValidationRule[]{iVarR4.build(), iVarR5.build()}));
        formFieldArr[3] = eVarU4.build();
        j12VarU.n(p7h.M(formFieldArr));
        j12VarU.s();
        j12VarU.r();
        j12VarU.t();
        return (AddressForm) j12VarU.build();
    }

    public static i12 c(RetrofitMaker retrofitMaker, dma1 dma1Var, q8n q8nVar) {
        yam0 yam0Var;
        try {
            yam0Var = (yam0) yam0.d.get(dma1Var.l(b, 0));
        } catch (Throwable unused) {
            yam0Var = yam0.b;
        }
        return (i12) yam0Var.a.invoke(retrofitMaker, q8nVar);
    }

    public static bbm0 d(cbm0 cbm0Var, q8n q8nVar, iu30 iu30Var, int i) {
        iu30 iu30Var2 = ook0.Z;
        iu30 lbc0Var = ook0.Y;
        if ((i & 2) != 0) {
            iu30Var = null;
        }
        if ((i & 4) != 0) {
            iu30Var2 = null;
        }
        if ((i & 8) != 0) {
            lbc0Var = new lbc0(1, a, cbm0.class, "buildSubmitFormSuccessResponse", "buildSubmitFormSuccessResponse(Lcom/spotify/address/endpoint/model/v1/proto/SubmitFormRequest;)Lcom/spotify/address/endpoint/model/v1/proto/SubmitFormResponse;", 0, (byte) 26);
        }
        return new bbm0(q8nVar, iu30Var, iu30Var2, lbc0Var);
    }
}
