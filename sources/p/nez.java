package p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nez {
    public final bqz a;

    public nez(bqz bqzVar) {
        this.a = bqzVar;
    }

    public final Single a() {
        return this.a.b("audio.equalizer_v2").map(mif1.b1);
    }

    public final Single b() {
        int[] iArrH = l1d.H(6);
        ArrayList arrayList = new ArrayList(iArrH.length);
        for (int i : iArrH) {
            arrayList.add(this.a.b(i3a.f(i)).map(s321.c1));
        }
        return Single.zip(arrayList, new xgc(this, (byte) 9));
    }
}
