package p;

import android.net.Uri;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r5w0 {
    public static final PlaylistRequestDecorationPolicy k;
    public static final rrc0 l;
    public final c0k0 a;
    public final xrc0 b;
    public final vtc0 c;
    public final rxj0 d;
    public final ulk0 e;
    public final i8h1 f;
    public final xjl0 g;
    public final dn81 h;
    public final z9k0 i;
    public final xgn0 j = ygn0.a();

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
        vwu0VarR.A();
        hru0VarS.z(vwu0VarR);
        k = hru0VarS.build();
        l = new rrc0(Collections.singleton(dlc0.d));
    }

    public r5w0(c0k0 c0k0Var, xrc0 xrc0Var, vtc0 vtc0Var, rxj0 rxj0Var, ulk0 ulk0Var, i8h1 i8h1Var, xjl0 xjl0Var, dn81 dn81Var, z9k0 z9k0Var) {
        this.a = c0k0Var;
        this.b = xrc0Var;
        this.c = vtc0Var;
        this.d = rxj0Var;
        this.e = ulk0Var;
        this.f = i8h1Var;
        this.g = xjl0Var;
        this.h = dn81Var;
        this.i = z9k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        if (r12 == r9) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.s0k0 r11, p.onm r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p.o5w0
            if (r0 == 0) goto L13
            r0 = r12
            p.o5w0 r0 = (p.o5w0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.o5w0 r0 = new p.o5w0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            int r1 = r0.d
            p.r9k0 r2 = p.r9k0.a
            r3 = 0
            p.z9k0 r4 = r10.i
            p.rih1 r5 = p.rih1.a
            r6 = 2
            p.xgn0 r7 = r10.j
            r8 = 1
            p.d9n r9 = p.d9n.a
            if (r1 == 0) goto L46
            if (r1 == r8) goto L3e
            if (r1 != r6) goto L38
            p.s0k0 r11 = r0.a
            p.hm5.M(r12)     // Catch: java.lang.Throwable -> L35
            goto L7c
        L35:
            r10 = move-exception
            goto Lb2
        L38:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r3
        L3e:
            p.s0k0 r11 = r0.a
            p.hm5.M(r12)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L44 java.lang.Exception -> Laa
            goto L71
        L44:
            r10 = move-exception
            goto Lb1
        L46:
            p.hm5.M(r12)
            boolean r12 = r7.g()
            if (r12 != 0) goto L50
            return r5
        L50:
            p.ulk0 r12 = r10.e     // Catch: java.lang.Throwable -> L35
            boolean r12 = r12.c     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L5a
            r7.c(r3)
            return r5
        L5a:
            p.dn81 r12 = r10.h     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L44 java.lang.Exception -> Laa
            r0.a = r11     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L44 java.lang.Exception -> Laa
            r0.d = r8     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L44 java.lang.Exception -> Laa
            java.lang.Object r12 = r12.b     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L44 java.lang.Exception -> Laa
            p.cdk0 r12 = (p.cdk0) r12     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L44 java.lang.Exception -> Laa
            p.ldk0 r12 = (p.ldk0) r12     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L44 java.lang.Exception -> Laa
            java.lang.Object r12 = r12.h(r0)     // Catch: java.lang.Throwable -> L35 java.util.concurrent.CancellationException -> L44 java.lang.Exception -> Laa
            if (r12 != r9) goto L6d
            goto L6e
        L6d:
            r12 = r5
        L6e:
            if (r12 != r9) goto L71
            goto L7b
        L71:
            r0.a = r11     // Catch: java.lang.Throwable -> L35
            r0.d = r6     // Catch: java.lang.Throwable -> L35
            java.lang.Object r12 = r10.f(r11, r0)     // Catch: java.lang.Throwable -> L35
            if (r12 != r9) goto L7c
        L7b:
            return r9
        L7c:
            p.m5w0 r12 = (p.m5w0) r12     // Catch: java.lang.Throwable -> L35
            if (r12 != 0) goto L87
            p.z9k0.a(r4, r2)     // Catch: java.lang.Throwable -> L35
            r7.c(r3)
            return r5
        L87:
            boolean r0 = r10.e(r11, r12)     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto La1
            boolean r12 = r12 instanceof p.l5w0     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto La1
            p.rxj0 r12 = r10.d     // Catch: java.lang.Throwable -> L35
            boolean r12 = r12.Z     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto La1
            p.k5w0 r12 = r10.b(r11)     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto La1
            boolean r0 = r10.e(r11, r12)     // Catch: java.lang.Throwable -> L35
        La1:
            if (r0 != 0) goto La6
            p.z9k0.a(r4, r2)     // Catch: java.lang.Throwable -> L35
        La6:
            r7.c(r3)
            return r5
        Laa:
            p.z9k0.a(r4, r2)     // Catch: java.lang.Throwable -> L35
            r7.c(r3)
            return r5
        Lb1:
            throw r10     // Catch: java.lang.Throwable -> L35
        Lb2:
            r7.c(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r5w0.a(p.s0k0, p.onm):java.lang.Object");
    }

    public final k5w0 b(s0k0 s0k0Var) {
        k5w0 m231Var;
        if (this.e.b == null) {
            return null;
        }
        String string = new Uri.Builder().scheme("spotify").authority("internal").path("bridge-tracks-curation").appendQueryParameter("playlist", s0k0Var.a).appendQueryParameter("trackARowId", s0k0Var.b).build().toString();
        ng7 ng7Var = new ng7(string);
        try {
            m231Var = new k5w0(ng7Var, "spotify:assisted-curation?context=" + Uri.encode(string) + "&mode=selection");
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? null : m231Var;
    }

    public final l5w0 c(s0k0 s0k0Var) {
        l5w0 m231Var;
        if (this.e.a == null) {
            return null;
        }
        hib0 hib0Var = new hib0(s0k0Var.a, s0k0Var.b, s0k0Var.c, s0k0Var.d);
        try {
            m231Var = new l5w0(hib0Var, (String) rab0.T0.invoke(hib0Var));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? null : m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r2 == r7) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Enum d(p.s0k0 r20, p.onm r21) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r5w0.d(p.s0k0, p.onm):java.lang.Enum");
    }

    public final boolean e(s0k0 s0k0Var, m5w0 m5w0Var) {
        tv80 m231Var;
        b431 b431Var;
        b431 b431Var2;
        ou80 ou80Var;
        String uri = m5w0Var.getUri();
        String str = null;
        try {
            i8h1 i8h1Var = this.f;
            r6h1 r6h1VarB = this.g.b();
            String str2 = s0k0Var.c;
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-overlap-edit-page-track-row";
            x6h1VarI.f = "2.2.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.d = str2;
            x6h1 x6h1VarC = x6h1VarI.a().c();
            x6h1VarC.i.add(new a7h1("swap_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
            if (uri == null) {
                uri = "";
            }
            m231Var = i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri)), y6h1VarA, r6h1VarB, System.currentTimeMillis()), (xj61) null);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        tv80 tv80Var = m231Var;
        if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
            str = ou80Var.a;
        }
        boolean z = m5w0Var instanceof l5w0;
        ulk0 ulk0Var = this.e;
        if (z) {
            hib0 hib0Var = ((l5w0) m5w0Var).a;
            if (!ulk0Var.c && (b431Var2 = ulk0Var.a) != null) {
                b431Var2.a(hib0Var, str);
                ulk0Var.c = true;
                return true;
            }
        } else {
            if (!(m5w0Var instanceof k5w0)) {
                eg.o();
                return false;
            }
            ng7 ng7Var = ((k5w0) m5w0Var).a;
            if (!ulk0Var.c && (b431Var = ulk0Var.b) != null) {
                b431Var.a(ng7Var, str);
                ulk0Var.c = true;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(s0k0 s0k0Var, onm onmVar) {
        q5w0 q5w0Var;
        boolean z = this.d.Z;
        if (onmVar instanceof q5w0) {
            q5w0Var = (q5w0) onmVar;
            int i = q5w0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q5w0Var.d = i - Integer.MIN_VALUE;
            } else {
                q5w0Var = new q5w0(this, onmVar);
            }
        } else {
            q5w0Var = new q5w0(this, onmVar);
        }
        Object objD = q5w0Var.b;
        int i2 = q5w0Var.d;
        if (i2 == 0) {
            hm5.M(objD);
            q5w0Var.a = s0k0Var;
            q5w0Var.d = 1;
            objD = d(s0k0Var, q5w0Var);
            Object obj = d9n.a;
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s0k0Var = q5w0Var.a;
            hm5.M(objD);
        }
        int iOrdinal = ((n5w0) objD).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    k5w0 k5w0VarB = b(s0k0Var);
                    if (z) {
                        return k5w0VarB;
                    }
                } else if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
            }
            return z ? b(s0k0Var) : c(s0k0Var);
        }
        l5w0 l5w0VarC = c(s0k0Var);
        if (l5w0VarC != null) {
            return l5w0VarC;
        }
        k5w0 k5w0VarB2 = b(s0k0Var);
        if (z) {
            return k5w0VarB2;
        }
        return null;
    }
}
