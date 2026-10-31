package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o6k extends hab0 implements xu30 {
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ i5d a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u7h d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6k(i5d i5dVar, boolean z, boolean z2, u7h u7hVar, long j, Function0 function0, Function0 function1, Function0 function2, Function0 function3, iu30 iu30Var, Function0 function4, iu30 iu30Var2) {
        super(3);
        this.a = i5dVar;
        this.b = z;
        this.c = z2;
        this.d = u7hVar;
        this.e = j;
        this.f = function0;
        this.g = function1;
        this.h = function2;
        this.i = function3;
        this.t = iu30Var;
        this.X = function4;
        this.Y = iu30Var2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            w6k.c((u5d) it.next(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, b0kVar, 0);
        }
        return rih1.a;
    }
}
