package p;

import android.content.Context;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a5c extends x9a {
    public static final long m;
    public static final /* synthetic */ int n = 0;
    public final yqg b;
    public final Context c;
    public final String d;
    public final b7n e;
    public final xrc0 f;
    public final iyc0 g;
    public final sjj0 h;
    public final r87 i;
    public final lfb j;
    public final v4c k;
    public final pud l;

    static {
        ytw0 ytw0Var = jfv.b;
        m = fdg1.k0(10, ngv.e);
    }

    public a5c(yqg yqgVar, Context context, String str, b7n b7nVar, xrc0 xrc0Var, iyc0 iyc0Var, fjb fjbVar, sjj0 sjj0Var, r87 r87Var, lfb lfbVar) {
        super(fjbVar);
        this.b = yqgVar;
        this.c = context;
        this.d = str;
        this.e = b7nVar;
        this.f = xrc0Var;
        this.g = iyc0Var;
        this.h = sjj0Var;
        this.i = r87Var;
        this.j = lfbVar;
        this.k = new v4c(this, (byte) 0);
        this.l = pud.BRIDGE_TRACKS;
    }

    @Override // p.x9a
    public final pud e() {
        return this.l;
    }

    @Override // p.x9a
    public final jvd f() {
        return this.k;
    }

    @Override // p.x9a
    public final boolean g(List list) {
        return true;
    }

    @Override // p.x9a
    public final boolean k(il51 il51Var) {
        return il51Var.b;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b5 A[LOOP:0: B:28:0x00af->B:30:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (r0 == r10) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable l(int r13, java.lang.String r14, java.util.Set r15, p.onm r16) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a5c.l(int, java.lang.String, java.util.Set, p.onm):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r8 == r5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(p.onm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.s4c
            if (r0 == 0) goto L13
            r0 = r8
            p.s4c r0 = (p.s4c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.s4c r0 = new p.s4c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r8)
            goto L6d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.hm5.M(r8)
            goto L59
        L35:
            p.hm5.M(r8)
            java.lang.String r8 = r7.d
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r1 = "playlist"
            java.lang.String r1 = r8.getQueryParameter(r1)
            if (r1 != 0) goto L47
            goto L5d
        L47:
            java.lang.String r6 = "trackARowId"
            java.lang.String r8 = r8.getQueryParameter(r6)
            if (r8 != 0) goto L50
            goto L5d
        L50:
            r0.c = r3
            java.lang.Object r8 = r7.n(r1, r8, r0)
            if (r8 != r5) goto L59
            goto L6c
        L59:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L5e
        L5d:
            return r4
        L5e:
            p.sjj0 r1 = r7.h
            io.reactivex.rxjava3.core.Single r8 = r1.b(r8)
            r0.c = r2
            java.lang.Object r8 = p.fc11.j(r8, r0)
            if (r8 != r5) goto L6d
        L6c:
            return r5
        L6d:
            p.hi90 r8 = (p.hi90) r8
            p.q4c r0 = new p.q4c
            java.lang.String r1 = r8.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            android.content.Context r7 = r7.c
            r2 = 2131952480(0x7f130360, float:1.9541404E38)
            java.lang.String r7 = r7.getString(r2, r1)
            java.lang.String r8 = r8.getImageUri()
            r0.<init>(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.a5c.m(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(String str, String str2, onm onmVar) {
        t4c t4cVar;
        if (onmVar instanceof t4c) {
            t4cVar = (t4c) onmVar;
            int i = t4cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t4cVar.c = i - Integer.MIN_VALUE;
            } else {
                t4cVar = new t4c(this, onmVar);
            }
        } else {
            t4cVar = new t4c(this, onmVar);
        }
        Object objF = t4cVar.a;
        int i2 = t4cVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            iqz0 iqz0Var = new iqz0(0, 1);
            Set setSingleton = Collections.singleton(new hrc0(str2));
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
            iou0VarV.D(true);
            hru0VarS.v(iou0VarV);
            trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) null, setSingleton, false, (src0) null, iqz0Var, (prc0) null, 0, (List) null, 474);
            t4cVar.c = 1;
            objF = this.f.f(str, trc0Var, t4cVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        zuc0 zuc0Var = (zuc0) o7h.s0(((wsc0) ((py21) objF).d()).e);
        if (zuc0Var != null) {
            return zuc0Var.c;
        }
        return null;
    }
}
