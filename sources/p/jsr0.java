package p;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jsr0 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ short f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jsr0(String str, Uri uri, long j, String str2, Function0 function0, int i, int i2) {
        super(2);
        this.a = str;
        this.b = uri;
        this.c = j;
        this.d = str2;
        this.e = function0;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        who1.j(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1), this.g);
        return rih1.a;
    }
}
