package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z3i0 implements xpw {
    public final /* synthetic */ byte a;
    public boolean b;
    public final psw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public z3i0(String str, String str2, zgq zgqVar, phq phqVar) {
        this.a = (byte) 1;
        this.d = zgqVar;
        this.e = phqVar;
        this.f = new idd1(new fh61(this, str2, (byte) 10));
        this.g = new idd1(new m551(this, str, str2, (byte) 9));
        this.h = new idd1(new yt3(str, (byte) 7));
        this.i = new u7h1(new u841(this, (byte) 23), new q871(this, (byte) 1));
        this.t = new rey0(new q871(this, (byte) 0));
        j2i j2iVar = new j2i(207129665, new c771(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (ia00) this.t;
            default:
                return (u7h1) this.i;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (ljm0) this.i;
            default:
                return (rey0) this.t;
        }
    }

    public z3i0(FlowableMap flowableMap, Flowable flowable, qmg qmgVar, o3e0 o3e0Var, oj3 oj3Var, boolean z) {
        this.a = (byte) 0;
        this.d = flowableMap;
        this.e = flowable;
        this.f = qmgVar;
        this.g = o3e0Var;
        this.h = oj3Var;
        this.b = z;
        this.i = h7w.D(new z6h0(this, (byte) 10), (bs50) null, (iu30) null, new j2i(2031850265, new sw1(this, (byte) 22), true), 6);
        j2i j2iVar = new j2i(910051977, new y3i0(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.t = n3o1.q(this).a(ytg0.Z, ytg0.N0);
    }
}
