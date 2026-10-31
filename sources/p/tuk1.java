package p;

import android.content.Context;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tuk1 implements xpw {
    public final ia00 X;
    public final ia00 Y;
    public final d9k Z;
    public final String a;
    public final ilh1 b;
    public final blp c;
    public final blp d;
    public final blp e;
    public final q8n f;
    public final Context g;
    public final bpb1 h = gio1.b((Object) null);
    public final js20 i;
    public final psw t;

    public tuk1(String str, ilh1 ilh1Var, blp blpVar, blp blpVar2, blp blpVar3, q8n q8nVar, Context context) {
        this.a = str;
        this.b = ilh1Var;
        this.c = blpVar;
        this.d = blpVar2;
        this.e = blpVar3;
        this.f = q8nVar;
        this.g = context;
        byte b = 0;
        byte b2 = 1;
        this.i = x3p1.n(new ruk1(this, b), eak1.V0, new fak1(this, (byte) 4), (o8n) null, new ruk1(this, b2), 8);
        j2i j2iVar = orj.a;
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
        this.X = n3o1.q(this).a(new quk1(this, b), new quk1(this, b2));
        this.Y = n3o1.q(this).a(new quk1(this, (byte) 2), cxj1.R0);
        this.Z = new d9k(this, (byte) 2);
    }

    public final rqw a() {
        return this.Z;
    }

    public final jsw c() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final Object e(String str, boolean z, tqw tqwVar, onm onmVar) {
        suk1 suk1Var;
        Object value;
        gwk1 gwk1Var;
        Object value2;
        gwk1 gwk1Var2;
        d9n d9nVar;
        tqw tqwVar2;
        boolean z2;
        Object value3;
        gwk1 gwk1Var3;
        tqw tqwVar3;
        Object value4;
        gwk1 gwk1Var4;
        gwk1 gwk1VarB;
        if (onmVar instanceof suk1) {
            suk1Var = (suk1) onmVar;
            int i = suk1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                suk1Var.e = i - Integer.MIN_VALUE;
            } else {
                suk1Var = new suk1(this, onmVar);
            }
        } else {
            suk1Var = new suk1(this, onmVar);
        }
        suk1 suk1Var2 = suk1Var;
        Object obj = suk1Var2.c;
        int i2 = suk1Var2.e;
        rih1 rih1Var = rih1.a;
        bpb1 bpb1Var = this.h;
        d9n d9nVar2 = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                gwk1 gwk1Var5 = (gwk1) bpb1Var.getValue();
                if (gwk1Var5 != null) {
                    gwk1 gwk1Var6 = gwk1Var5.r ? gwk1Var5 : null;
                    if (gwk1Var6 != null) {
                        gwk1 gwk1Var7 = gwk1Var6;
                        gwk1 gwk1VarX = lm5.x(gwk1.b(gwk1Var6, (Map) null, true, false, false, false, 507903));
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, gwk1VarX);
                        d9nVar = d9nVar2;
                        ilh1 ilh1Var = this.b;
                        String str2 = gwk1Var7.e;
                        String str3 = gwk1Var7.f;
                        Map map = gwk1Var7.m;
                        suk1Var2.a = tqwVar;
                        suk1Var2.b = z;
                        suk1Var2.e = 1;
                        if (ilh1Var.n(str2, str3, map, str, suk1Var2) != d9nVar) {
                            tqwVar2 = tqwVar;
                            z2 = z;
                        }
                    }
                }
            }
            if (i2 == 1) {
                z2 = suk1Var2.b;
                tqwVar2 = suk1Var2.a;
                hm5.M(obj);
                d9nVar = d9nVar2;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = suk1Var2.b;
                tqwVar3 = suk1Var2.a;
                hm5.M(obj);
                d9nVar = d9nVar2;
            }
            do {
                value4 = bpb1Var.getValue();
                gwk1Var4 = (gwk1) value4;
                if (gwk1Var4 != null) {
                    gwk1VarB = gwk1.b(gwk1Var4, (Map) null, false, false, false, false, 491519);
                } else {
                    gwk1VarB = null;
                }
            } while (!bpb1Var.k(value4, gwk1VarB));
            t6j1 t6j1Var = new t6j1(this, tqwVar3, (lnm) null, (byte) 14);
            suk1Var2.a = null;
            suk1Var2.b = z2;
            suk1Var2.e = 3;
            return fn31.Y(this.f, t6j1Var, suk1Var2) == d9nVar ? d9nVar : rih1Var;
            do {
                value3 = bpb1Var.getValue();
                gwk1Var3 = (gwk1) value3;
            } while (!bpb1Var.k(value3, gwk1Var3 != null ? lm5.x(gwk1.b(gwk1Var3, (Map) null, false, false, false, false, 499711)) : null));
            if (!z2) {
                suk1Var2.a = tqwVar2;
                suk1Var2.b = z2;
                suk1Var2.e = 2;
                if (hap1.i(500L, suk1Var2) != d9nVar) {
                    tqwVar3 = tqwVar2;
                    do {
                        value4 = bpb1Var.getValue();
                        gwk1Var4 = (gwk1) value4;
                        if (gwk1Var4 != null) {
                            gwk1VarB = gwk1.b(gwk1Var4, (Map) null, false, false, false, false, 491519);
                        } else {
                            gwk1VarB = null;
                        }
                    } while (!bpb1Var.k(value4, gwk1VarB));
                    t6j1 t6j1Var2 = new t6j1(this, tqwVar3, (lnm) null, (byte) 14);
                    suk1Var2.a = null;
                    suk1Var2.b = z2;
                    suk1Var2.e = 3;
                    if (fn31.Y(this.f, t6j1Var2, suk1Var2) == d9nVar) {
                    }
                }
            }
        } catch (CancellationException e) {
            do {
                value2 = bpb1Var.getValue();
                gwk1Var2 = (gwk1) value2;
            } while (!bpb1Var.k(value2, gwk1Var2 != null ? gwk1Var2.c() : null));
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to send votes", new Object[0]);
            do {
                value = bpb1Var.getValue();
                gwk1Var = (gwk1) value;
            } while (!bpb1Var.k(value, gwk1Var != null ? gwk1Var.c() : null));
            kt91 kt91Var = (kt91) this.c.get();
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957799});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131957799, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            return rih1Var;
        }
    }

    public final mqw getBehavior() {
        return this.i;
    }
}
