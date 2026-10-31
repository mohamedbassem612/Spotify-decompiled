package p;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ved0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Comparable f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ved0(int i, int i2, long j, String str, String str2, qim0 qim0Var) {
        super(2);
        this.b = str;
        this.g = qim0Var;
        this.e = j;
        this.f = str2;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Comparable comparable = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(this.d | 1);
                int i = this.c;
                long j = this.e;
                String str = this.b;
                d0p1.e(i, iP, j, str, (String) comparable, (b0k) obj, (qim0) obj3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                String str2 = this.b;
                int i2 = this.c;
                int i3 = this.d;
                long j2 = this.e;
                hqn1.f(str2, i2, (Uri) comparable, i3, j2, (Function0) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ved0(String str, int i, Uri uri, int i2, long j, Function0 function0, int i3) {
        super(2);
        this.b = str;
        this.c = i;
        this.f = uri;
        this.d = i2;
        this.e = j;
        this.g = function0;
    }
}
