package p;

import com.spotify.extendedmetadata.extensions.extendedcreditsimpl.proto.ExtendedCredits;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ou00 implements ov00 {
    public final ez00 a(byte[] bArr) {
        h290<ExtendedCredits.Credit> h290VarN = ExtendedCredits.o(bArr).n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (ExtendedCredits.Credit credit : h290VarN) {
            arrayList.add(new k6o(credit.q(), credit.o(), credit.n(), credit.p(), credit.getRole()));
        }
        return new nu00(arrayList);
    }

    public final int b() {
        return 96;
    }

    public final Class type() {
        return nu00.class;
    }
}
