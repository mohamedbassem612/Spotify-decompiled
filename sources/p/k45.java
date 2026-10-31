package p;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class k45 implements qdt0 {
    public final /* synthetic */ ggg1 a;
    public final /* synthetic */ x180 b;
    public final /* synthetic */ xid c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ ooo e;
    public final /* synthetic */ aae1 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ e8k1 h;
    public final /* synthetic */ iu30 i;

    public /* synthetic */ k45(ggg1 ggg1Var, x180 x180Var, xid xidVar, iu30 iu30Var, ooo oooVar, aae1 aae1Var, Function0 function0, e8k1 e8k1Var, iu30 iu30Var2) {
        this.a = ggg1Var;
        this.b = x180Var;
        this.c = xidVar;
        this.d = iu30Var;
        this.e = oooVar;
        this.f = aae1Var;
        this.g = function0;
        this.h = e8k1Var;
        this.i = iu30Var2;
    }

    @Override // p.qdt0
    public final InputConnection a(EditorInfo editorInfo) {
        ggg1 ggg1Var = this.a;
        em0 em0Var = new em0(new b8p1(ggg1Var), ggg1Var, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        prn1.y(editorInfo, ggg1Var.h(), ggg1Var.h().e, this.b);
        return new lrb1(em0Var, editorInfo);
    }
}
