package p;

import android.content.Context;
import android.content.pm.ResolveInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dsw0 implements iu30 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ResolveInfo b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ CharSequence d;
    public final /* synthetic */ long e;

    public /* synthetic */ dsw0(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j) {
        this.a = context;
        this.b = resolveInfo;
        this.c = z;
        this.d = charSequence;
        this.e = j;
    }

    public final Object invoke(Object obj) {
        p2o1.b.c1(this.a, this.b, Boolean.valueOf(this.c), this.d, new nbe1(this.e));
        ((r3e1) obj).close();
        return rih1.a;
    }
}
