package p;

import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oa0 implements cvl1, xpw {
    public final psw O0;
    public final Activity a;
    public final bi0 b;
    public final mxr c;
    public final goq d;
    public final twu e;
    public final r2v f;
    public final nu g;
    public final tom h;
    public final Function0 i;
    public final String t;
    public final idd1 X = new idd1(new ja0(this, (byte) 0));
    public final idd1 Y = new idd1(new ja0(this, (byte) 1));
    public final rey0 Z = new rey0(new ia0(this, (byte) 0));
    public final dvm0 N0 = new dvm0(lbg1.N0, new ia0(this, (byte) 1));

    public oa0(Activity activity, bi0 bi0Var, mxr mxrVar, goq goqVar, twu twuVar, r2v r2vVar, nu nuVar, tom tomVar, Function0 function0) {
        this.a = activity;
        this.b = bi0Var;
        this.c = mxrVar;
        this.d = goqVar;
        this.e = twuVar;
        this.f = r2vVar;
        this.g = nuVar;
        this.h = tomVar;
        this.i = function0;
        this.t = tomVar.a;
        j2i j2iVar = new j2i(1224216332, new r1(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.O0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.N0;
    }

    public final jsw c() {
        return this.O0;
    }

    public final qvk0 e() {
        return (qvk0) this.X.getValue();
    }

    public final mqw getBehavior() {
        return this.Z;
    }
}
