package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nc4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c;

    public nc4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
        this.c = new idd1(new wb4(this, (byte) 7));
    }

    public final boolean a() {
        nc4 nc4Var = (nc4) this.c.getValue();
        return nc4Var != null ? nc4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("dynamic_data_saver_stream_quality", "android-datasavermode", a()));
    }

    public nc4(luk lukVar) {
        this(false, lukVar);
    }
}
