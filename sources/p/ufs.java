package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ufs {
    public final Context a;
    public final yqg b;
    public final ggv c;
    public final htr d;

    public ufs(Context context, yqg yqgVar, ggv ggvVar, htr htrVar) {
        this.a = context;
        this.b = yqgVar;
        this.c = ggvVar;
        this.d = htrVar;
    }

    public final tfs a(String str, int i, int i2, Integer num, boolean z, boolean z2) {
        return new tfs(this.a.getResources(), this.b, this.c, this.d, new zcz(str, i, i2, num, z), z, z2);
    }
}
