package p;

import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentDeliveryMode;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class qm5 {
    public static final HashSet a = dm61.t0(new Integer[]{Integer.valueOf(AdvertisementType.OTHER), 202});
    public static final HashSet b = dm61.t0(new Integer[]{Integer.valueOf(ContentDeliveryMode.DVR), 504, 429});
    public static pm5 c;
    public static List d;
    public static int e;

    public static List a() {
        List list = d;
        if (list != null) {
            return list;
        }
        u890.C("transformedEvents");
        throw null;
    }

    public static final void b(md50 md50Var) {
        try {
            wf10.c().execute(new fe(md50Var, (byte) 4));
        } catch (Exception unused) {
        }
    }
}
