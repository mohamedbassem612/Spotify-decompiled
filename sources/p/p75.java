package p;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class p75 implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ v340 c;
    public final /* synthetic */ nd41 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ View f;

    public /* synthetic */ p75(Context context, iu30 iu30Var, v340 v340Var, nd41 nd41Var, int i, View view) {
        this.a = context;
        this.b = iu30Var;
        this.c = v340Var;
        this.d = nd41Var;
        this.e = i;
        this.f = view;
    }

    public final Object invoke() {
        return new fbk1(this.a, this.b, this.c, this.d, this.e, this.f).getLayoutNode();
    }
}
