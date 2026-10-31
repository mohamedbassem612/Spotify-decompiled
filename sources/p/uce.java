package p;

import com.spotify.checkout.proto.model.v1.proto.ChangeCountry;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class uce {
    public static sce a(ChangeCountry changeCountry) {
        tan tanVar;
        h290<ChangeCountry.PickerForm.CountryType> h290VarO = changeCountry.o().o();
        ArrayList arrayList = new ArrayList();
        String strN = null;
        for (ChangeCountry.PickerForm.CountryType countryType : h290VarO) {
            int iP = countryType.p();
            int i = iP == 0 ? -1 : tce.a[l1d.C(iP)];
            if (i == 1) {
                tanVar = new tan(countryType.o().n(), countryType.o().getName(), countryType.o().getUrl());
            } else if (i != 2) {
                tanVar = null;
            } else {
                strN = countryType.n().n();
                tanVar = new tan(countryType.n().n(), countryType.n().getName(), null);
            }
            if (tanVar != null) {
                arrayList.add(tanVar);
            }
        }
        return new sce(changeCountry.p(), changeCountry.o().p().o(), new van(changeCountry.o().getTitle(), arrayList, changeCountry.o().r().o(), strN));
    }
}
