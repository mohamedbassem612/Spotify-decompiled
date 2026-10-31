package p;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l1o1 extends pwq implements gzq {
    public final String a() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        dataHolder.a0(i, "asset_key");
        return dataHolder.d[this.c].getString(i, dataHolder.c.getInt("asset_key"));
    }

    public final /* synthetic */ Object freeze() {
        return new f1o1(this);
    }

    public final String getId() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        dataHolder.a0(i, "asset_id");
        return dataHolder.d[this.c].getString(i, dataHolder.c.getInt("asset_id"));
    }
}
