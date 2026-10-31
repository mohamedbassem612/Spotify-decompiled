package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ge81 extends hab0 implements zu30 {
    public final /* synthetic */ zhc0 a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge81(zhc0 zhc0Var, int i) {
        super(4);
        this.a = zhc0Var;
        this.b = i;
    }

    @Override // p.zu30
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        return new u3((Context) obj2, (ViewGroup) obj3, this.a, this.b);
    }
}
