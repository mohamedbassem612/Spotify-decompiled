package p;

import app.p000rive.semantics.SemanticState;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jj31 {
    public final boolean a;
    public final int b;
    public final qim0 c;
    public final int d;
    public final jfe e;
    public final List f;
    public final vj31 g;
    public final Map h;
    public final boolean i;
    public final boolean j;
    public final Function0 k;
    public final iu30 l;

    public jj31(boolean z, int i, qim0 qim0Var, int i2, jfe jfeVar, List list, Map map, boolean z2, boolean z3, Function0 function0, iu30 iu30Var, int i3) {
        i2 = (i3 & 8) != 0 ? 1 : i2;
        jfeVar = (i3 & 16) != 0 ? null : jfeVar;
        list = (i3 & 32) != 0 ? z6x.a : list;
        vj31 vj31Var = vj31.f;
        map = (i3 & SemanticState.Focused) != 0 ? b7x.a : map;
        z2 = (i3 & SemanticState.Hidden) != 0 ? false : z2;
        z3 = (i3 & 512) != 0 ? false : z3;
        function0 = (i3 & SemanticState.ReadOnly) != 0 ? n521.U0 : function0;
        iu30Var = (i3 & SemanticState.Modal) != 0 ? oe31.Z0 : iu30Var;
        this.a = z;
        this.b = i;
        this.c = qim0Var;
        this.d = i2;
        this.e = jfeVar;
        this.f = list;
        this.g = vj31Var;
        this.h = map;
        this.i = z2;
        this.j = z3;
        this.k = function0;
        this.l = iu30Var;
    }
}
