package p;

import com.spotify.address.endpoint.model.v1.proto.AddressCollection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fhk1 {
    public static rfk1 a(int i, AddressCollection addressCollection) {
        qfk1 qfk1Var = null;
        if (i != 2 || !addressCollection.s()) {
            return null;
        }
        String strP = addressCollection.p().o().p();
        strP.getClass();
        if (ihc1.y0(strP)) {
            strP = null;
        }
        String strO = addressCollection.p().o().o();
        strO.getClass();
        if (ihc1.y0(strO)) {
            strO = null;
        }
        if (addressCollection.p().r()) {
            String title = addressCollection.p().p().getTitle();
            String subtitle = addressCollection.p().p().getSubtitle();
            subtitle.getClass();
            String str = !ihc1.y0(subtitle) ? subtitle : null;
            String strN = addressCollection.p().p().n();
            strN.getClass();
            String str2 = !ihc1.y0(strN) ? strN : null;
            String strQ = addressCollection.p().p().q();
            strQ.getClass();
            qfk1Var = new qfk1(title, str, str2, !ihc1.y0(strQ) ? strQ : null, addressCollection.p().p().p());
        }
        return new rfk1(strP, strO, qfk1Var, o7h.y0(addressCollection.p().q(), "\n", (String) null, (String) null, (iu30) null, 62));
    }
}
