package p;

import android.app.ApplicationExitInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sue0 implements xm5 {
    @Override // p.xm5
    public final void a(ApplicationExitInfo applicationExitInfo) {
        String string = applicationExitInfo.toString();
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
