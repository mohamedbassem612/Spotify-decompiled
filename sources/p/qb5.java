package p;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qb5 extends a8d1 implements vu30 {
    public final /* synthetic */ Drawable a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb5(Drawable drawable, Function0 function0, Function0 function1, lnm lnmVar) {
        super(2, lnmVar);
        this.a = drawable;
        this.b = function0;
        this.c = function1;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new qb5(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        qb5 qb5VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        qb5VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        ((AnimatedImageDrawable) this.a).registerAnimationCallback(suo1.s(this.b, this.c));
        return rih1.a;
    }
}
