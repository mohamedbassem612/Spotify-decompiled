package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bte0 implements ooe1 {
    @Override // p.ooe1
    public final void b(pne1 pne1Var) {
        String string = pne1Var.toString();
        o0c.r(4000, 4000);
        int length = string.length();
        int i = 0;
        ArrayList arrayList = new ArrayList((length / 4000) + (length % 4000 == 0 ? 0 : 1));
        while (i >= 0 && i < length) {
            int i2 = i + 4000;
            string.subSequence(i, (i2 < 0 || i2 > length) ? length : i2).toString();
            arrayList.add(rih1.a);
            i = i2;
        }
    }
}
