package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p.awl1;
import p.btk;
import p.cd80;
import p.i6b;
import p.qs10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class WorkManagerInitializer implements cd80 {
    static {
        qs10.c("WrkMgrInitializer");
    }

    public final Object create(Context context) {
        qs10.a().getClass();
        awl1.f(context, new btk(new i6b((byte) 17)));
        return awl1.d(context);
    }

    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
