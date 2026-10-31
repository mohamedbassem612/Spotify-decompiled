package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ije0 extends hab0 implements iu30 {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ j2i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ije0(List list, String str, boolean z, boolean z2, Function0 function0, Function0 function1, boolean z3, j2i j2iVar) {
        super(1);
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = function0;
        this.f = function1;
        this.g = z3;
        this.h = j2iVar;
    }

    public final Object invoke(Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        rtb0.c(rtb0Var, (Object) null, new j2i(-345579927, new hb7(this.b, this.c, this.d, this.e, this.f, this.g), true), 3);
        List list = this.a;
        if (!list.isEmpty()) {
            rtb0.c(rtb0Var, (Object) null, hxi.a, 3);
            rtb0Var.e(list.size(), new xg50(list, (byte) 23), new xg50(list, (byte) 24), new j2i(2039820996, new ylh(list, this.h, (byte) 2), true));
        }
        return rih1.a;
    }
}
