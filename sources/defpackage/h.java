package defpackage;

import kotlin.jvm.functions.Function0;
import p.hab0;
import p.iu30;
import p.rih1;
import p.vy71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vy71 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(vy71 vy71Var, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = vy71Var;
        this.c = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        vy71 vy71Var = this.b;
        switch (b) {
            case 0:
                if (!vy71Var.i()) {
                    function0.invoke();
                }
                break;
            case 1:
                if (!vy71Var.i()) {
                    function0.invoke();
                }
                break;
            default:
                if (!vy71Var.i()) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
