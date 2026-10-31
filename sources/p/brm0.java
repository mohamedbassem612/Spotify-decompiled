package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class brm0 extends ksi1 {
    public final ArrayList a;
    public final Map b;

    public brm0(ArrayList arrayList) {
        this.a = arrayList;
        this.b = sqg0.T(arrayList);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}
