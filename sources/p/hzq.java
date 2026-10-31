package p;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hzq extends mdy implements p331 {
    public final Status d;

    public hzq(DataHolder dataHolder) {
        super(dataHolder);
        this.d = new Status(dataHolder.e, null, null, null);
    }

    public final /* bridge */ /* synthetic */ Object c(int i, int i2) {
        return new z2o1(((mdy) this).a, i, i2);
    }

    @Override // p.p331
    public final Status getStatus() {
        return this.d;
    }
}
