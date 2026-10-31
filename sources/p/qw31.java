package p;

import androidx.car.app.model.Row;
import androidx.car.app.model.RowSection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qw31 extends af51 {
    public final RowSection a() {
        Iterator it = ((af51) this).a.iterator();
        while (it.hasNext()) {
            ot31.k.a((Row) it.next());
        }
        return new RowSection(this, 0);
    }
}
