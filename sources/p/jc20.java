package p;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jc20 implements PointerInputEventHandler {
    public final /* synthetic */ View a;
    public final /* synthetic */ ee21 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ bw91 g;
    public final /* synthetic */ HashMap h;
    public final /* synthetic */ ven0 i;

    public jc20(View view, ee21 ee21Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, iu30 iu30Var, bw91 bw91Var, HashMap map, ven0 ven0Var4) {
        this.a = view;
        this.b = ee21Var;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = iu30Var;
        this.g = bw91Var;
        this.h = map;
        this.i = ven0Var4;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        View view = this.a;
        ee21 ee21Var = this.b;
        ven0 ven0Var = this.c;
        ven0 ven0Var2 = this.d;
        ven0 ven0Var3 = this.e;
        uh0 uh0Var = new uh0(view, ee21Var, ven0Var, ven0Var2, ven0Var3, (byte) 25);
        iu30 iu30Var = this.f;
        bw91 bw91Var = this.g;
        dy7 dy7Var = new dy7(view, iu30Var, bw91Var, ven0Var, ven0Var2, ven0Var3, (byte) 7);
        jzm jzmVar = new jzm(view, ven0Var, ven0Var2, ven0Var3, (byte) 17);
        uuy uuyVar = new uuy(this.h, bw91Var, ven0Var2, ven0Var, this.i, ven0Var3, (byte) 4);
        float f = g5v.a;
        Object objD = s9p1.D(nav0Var, new z4v(uh0Var, dy7Var, jzmVar, uuyVar, null), lnmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }
}
