package p;

import com.spotify.address.endpoint.model.v1.proto.AddressForm;
import com.spotify.address.endpoint.model.v1.proto.FormField;
import com.spotify.address.endpoint.model.v1.proto.d;
import com.spotify.address.endpoint.model.v1.proto.e;
import com.spotify.address.endpoint.model.v1.proto.f;
import com.spotify.address.endpoint.model.v1.proto.h;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x12 {
    public static AddressForm a(AddressForm addressForm, Map map) {
        j12 j12Var = (j12) addressForm.toBuilder();
        j12Var.q();
        h290<FormField> h290VarR = addressForm.r();
        ArrayList arrayList = new ArrayList();
        for (FormField formField : h290VarR) {
            String str = (String) map.get(formField.getId());
            if (str != null) {
                int iQ = formField.q();
                int i = iQ == 0 ? -1 : w12.a[l1d.C(iQ)];
                if (i == -1) {
                    formField = null;
                } else if (i == 1) {
                    e eVar = (e) formField.toBuilder();
                    h hVar = (h) formField.s().toBuilder();
                    hVar.n(str);
                    eVar.v(hVar);
                    formField = (FormField) eVar.build();
                } else if (i == 2) {
                    e eVar2 = (e) formField.toBuilder();
                    f fVar = (f) formField.p().toBuilder();
                    fVar.q(str);
                    eVar2.s(fVar);
                    formField = (FormField) eVar2.build();
                } else if (i != 3) {
                    if (i != 4) {
                        eg.o();
                        return null;
                    }
                    formField = null;
                } else {
                    e eVar3 = (e) formField.toBuilder();
                    d dVar = (d) formField.o().toBuilder();
                    dVar.q(str);
                    eVar3.q(dVar);
                    formField = (FormField) eVar3.build();
                }
            }
            if (formField != null) {
                arrayList.add(formField);
            }
        }
        j12Var.n(arrayList);
        return (AddressForm) j12Var.build();
    }
}
