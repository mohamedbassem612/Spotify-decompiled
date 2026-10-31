package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x73 implements sdm {
    public final c9c0 a;
    public final ov20 b;
    public final xvo c;
    public final rh11 d;
    public final x390 e;
    public final boolean f;
    public final zxm1 g;
    public final waz0 h;
    public final o860 i;
    public final q8n j;
    public final b7q k;
    public final b221 l;
    public final yg7 m;
    public final gmt n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a4q0 f78p;
    public final dh30 q;
    public final drp0 r;
    public final y4q s;

    public x73(c9c0 c9c0Var, ov20 ov20Var, xvo xvoVar, rh11 rh11Var, x390 x390Var, boolean z, zxm1 zxm1Var, waz0 waz0Var, o860 o860Var, q8n q8nVar, b7q b7qVar, b221 b221Var, yg7 yg7Var, gmt gmtVar, boolean z2, a4q0 a4q0Var, dh30 dh30Var, drp0 drp0Var, y4q y4qVar) {
        this.a = c9c0Var;
        this.b = ov20Var;
        this.c = xvoVar;
        this.d = rh11Var;
        this.e = x390Var;
        this.f = z;
        this.g = zxm1Var;
        this.h = waz0Var;
        this.i = o860Var;
        this.j = q8nVar;
        this.k = b7qVar;
        this.l = b221Var;
        this.m = yg7Var;
        this.n = gmtVar;
        this.o = z2;
        this.f78p = a4q0Var;
        this.q = dh30Var;
        this.r = drp0Var;
        this.s = y4qVar;
    }

    public static boolean b(y73 y73Var, bbz0 bbz0Var, int i) {
        boolean zJ;
        int iC = l1d.C(i);
        if (iC != 1) {
            zJ = iC != 2 ? false : u890.j(y73Var.a.l, Boolean.TRUE);
        } else {
            zJ = true;
        }
        return zJ && bbz0Var.k.contains(abz0.c);
    }

    public final Object a(oim oimVar, us0 us0Var) {
        return fn31.Y(this.j, new hi2(this, (z73) oimVar, (lnm) null, (byte) 9), us0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Object obj, iu30 iu30Var, onm onmVar) {
        v73 v73Var;
        if (onmVar instanceof v73) {
            v73Var = (v73) onmVar;
            int i = v73Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v73Var.d = i - Integer.MIN_VALUE;
            } else {
                v73Var = new v73(this, onmVar);
            }
        } else {
            v73Var = new v73(this, onmVar);
        }
        Object objO = v73Var.b;
        int i2 = v73Var.d;
        if (i2 == 0) {
            hm5.M(objO);
            w73 w73Var = new w73(iu30Var, (lnm) null, (byte) 0);
            v73Var.a = obj;
            v73Var.d = 1;
            objO = rc2.O(2000L, w73Var, v73Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = v73Var.a;
            hm5.M(objO);
        }
        return objO == null ? obj : objO;
    }
}
