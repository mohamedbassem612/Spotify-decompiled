package p;

import android.app.Activity;
import android.view.View;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hlu0 implements rgy {
    public final xrc0 a;
    public final iyc0 b;
    public final op31 c;
    public final yt91 d;
    public final dqn e;
    public final uu00 f;
    public final q8n g;
    public final q8n h;
    public final zwz0 i;
    public final ylk0 j;
    public final ylk0 k;
    public final vo4 l;
    public final zpn m;
    public final llm n;

    public hlu0(xrc0 xrc0Var, iyc0 iyc0Var, op31 op31Var, yt91 yt91Var, dqn dqnVar, uu00 uu00Var, q8n q8nVar, q8n q8nVar2, zwz0 zwz0Var, ylk0 ylk0Var, ylk0 ylk0Var2, vo4 vo4Var, zpn zpnVar) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = op31Var;
        this.d = yt91Var;
        this.e = dqnVar;
        this.f = uu00Var;
        this.g = q8nVar;
        this.h = q8nVar2;
        this.i = zwz0Var;
        this.j = ylk0Var;
        this.k = ylk0Var2;
        this.l = vo4Var;
        this.m = zpnVar;
        this.n = us71.h(q8nVar);
    }

    public final Object a(String str, bkn bknVar) {
        return fn31.Y(this.g, new ian0(this, str, (lnm) null, (byte) 13), bknVar);
    }

    public final void b(String str) {
        zpn zpnVar = this.m;
        if (zpnVar.a && !zpnVar.e.isEmpty() && (zpnVar.i instanceof xpn)) {
            yt91 yt91Var = this.d;
            Activity activity = (Activity) yt91Var.b;
            er91 er91Var = new er91((fs91) null, activity.getString(2131963262, str), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            boolean zH = ((a1r0) yt91Var.d).h(activity);
            kt91 kt91Var = (kt91) yt91Var.c;
            if (zH) {
                kt91Var.o(er91Var);
            } else {
                kt91Var.k(er91Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(String str, bqn bqnVar, onm onmVar) {
        alu0 alu0Var;
        if (onmVar instanceof alu0) {
            alu0Var = (alu0) onmVar;
            int i = alu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                alu0Var.c = i - Integer.MIN_VALUE;
            } else {
                alu0Var = new alu0(this, onmVar);
            }
        } else {
            alu0Var = new alu0(this, onmVar);
        }
        alu0 alu0Var2 = alu0Var;
        Object objC = alu0Var2.a;
        int i2 = alu0Var2.c;
        if (i2 == 0) {
            hm5.M(objC);
            String str2 = bqnVar.c;
            zpn zpnVar = this.m;
            String str3 = zpnVar.g;
            String str4 = zpnVar.h;
            alu0Var2.c = 1;
            objC = this.j.c(str, str2, str3, str4, ddd1.S0, null, alu0Var2);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        ((py21) objC).d();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(List list, onm onmVar) {
        blu0 blu0Var;
        if (onmVar instanceof blu0) {
            blu0Var = (blu0) onmVar;
            int i = blu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                blu0Var.c = i - Integer.MIN_VALUE;
            } else {
                blu0Var = new blu0(this, onmVar);
            }
        } else {
            blu0Var = new blu0(this, onmVar);
        }
        Object objJ = blu0Var.a;
        int i2 = blu0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single map = this.f.b(new oi("create-playlist", false, new nec0(list, (byte) 8))).filter(f610.Z0).firstOrError().map(o610.Z0);
            blu0Var.c = 1;
            objJ = fc11.j(map, blu0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object e(String str, wpn wpnVar, onm onmVar) {
        clu0 clu0Var;
        if (onmVar instanceof clu0) {
            clu0Var = (clu0) onmVar;
            int i = clu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                clu0Var.c = i - Integer.MIN_VALUE;
            } else {
                clu0Var = new clu0(this, onmVar);
            }
        } else {
            clu0Var = new clu0(this, onmVar);
        }
        Object objY = clu0Var.a;
        int i2 = clu0Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            zpn zpnVar = this.m;
            String str2 = (String) o7h.V0(zpnVar.e);
            String str3 = zpnVar.g;
            String str4 = zpnVar.h;
            trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) null, wpnVar.a, dm61.x0(wqc0.a, wpnVar.b), false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 473);
            clu0Var.c = 1;
            xyc0 xyc0Var = this.b;
            objY = fn31.Y(xyc0Var.c, new ryc0(xyc0Var, str2, trc0Var, str, str3, str4, (lnm) null), clu0Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return ((yxc0) ((py21) objY).d()).a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01da  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (p.fn31.Y(r22.h, r1, r3) == r9) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bd, code lost:
    
        if (r1 == r9) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0221, code lost:
    
        if (p.rc2.N(r4, r1, r3) == r9) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.String r23, p.xpn r24, p.onm r25) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hlu0.f(java.lang.String, p.xpn, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x014d -> B:46:0x0154). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable g(java.util.List r19, p.g3d0 r20, p.onm r21) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hlu0.g(java.util.List, p.g3d0, p.onm):java.io.Serializable");
    }
}
