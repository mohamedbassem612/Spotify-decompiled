package p;

import com.spotify.playlistmixing.proto.SetMixState;
import com.spotify.playlistmixing.proto.SignalData;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qjk0 implements jjk0 {
    public final iyc0 a;
    public final kv00 b;
    public final bjk0 c;
    public final n3d0 d;
    public final mr20 e;
    public r3d0 f;

    public qjk0(iyc0 iyc0Var, kv00 kv00Var, bjk0 bjk0Var, n3d0 n3d0Var, mr20 mr20Var) {
        this.a = iyc0Var;
        this.b = kv00Var;
        this.c = bjk0Var;
        this.d = n3d0Var;
        this.e = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (c(r11, r6) == r9) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, p.ayc0 r12, java.util.List r13, boolean r14, p.onm r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof p.kjk0
            if (r0 == 0) goto L14
            r0 = r15
            p.kjk0 r0 = (p.kjk0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p.kjk0 r0 = new p.kjk0
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.c
            int r0 = r6.e
            p.iyc0 r1 = r10.a
            r7 = 3
            r2 = 2
            r3 = 1
            r8 = 0
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L49
            if (r0 == r3) goto L41
            if (r0 == r2) goto L39
            if (r0 != r7) goto L33
            p.hm5.M(r15)
            goto Lbb
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r8
        L39:
            boolean r11 = r6.b
            java.lang.String r12 = r6.a
            p.hm5.M(r15)
            goto L91
        L41:
            boolean r14 = r6.b
            java.lang.String r11 = r6.a
            p.hm5.M(r15)
            goto L60
        L49:
            p.hm5.M(r15)
            java.util.List r12 = java.util.Collections.singletonList(r12)
            r6.a = r11
            r6.b = r14
            r6.e = r3
            r15 = r1
            p.xyc0 r15 = (p.xyc0) r15
            java.lang.Object r15 = r15.s(r11, r12, r13, r6)
            if (r15 != r9) goto L60
            goto Lba
        L60:
            p.py21 r15 = (p.py21) r15
            boolean r12 = r15 instanceof p.oy21
            if (r12 != 0) goto L79
            com.spotify.playlistmixing.utils.MixingStateError$SignalFailed r10 = new com.spotify.playlistmixing.utils.MixingStateError$SignalFailed
            p.ly21 r15 = (p.ly21) r15
            p.jy21 r11 = r15.a
            java.lang.String r11 = r11.b()
            r10.<init>(r11)
            p.m231 r11 = new p.m231
            r11.<init>(r10)
            return r11
        L79:
            if (r14 == 0) goto Lad
            r6.a = r11
            r6.b = r14
            r6.e = r2
            p.xyc0 r1 = (p.xyc0) r1
            r5 = 0
            java.lang.String r3 = "mix"
            r4 = 0
            r2 = r11
            java.lang.Object r15 = r1.p(r2, r3, r4, r5, r6)
            if (r15 != r9) goto L8f
            goto Lba
        L8f:
            r11 = r14
            r12 = r2
        L91:
            p.py21 r15 = (p.py21) r15
            boolean r13 = r15 instanceof p.oy21
            if (r13 != 0) goto Laa
            com.spotify.playlistmixing.utils.MixingStateError$LensOperationFailed r10 = new com.spotify.playlistmixing.utils.MixingStateError$LensOperationFailed
            p.ly21 r15 = (p.ly21) r15
            p.jy21 r11 = r15.a
            java.lang.String r11 = r11.b()
            r10.<init>(r11)
            p.m231 r11 = new p.m231
            r11.<init>(r10)
            return r11
        Laa:
            r14 = r11
            r11 = r12
            goto Lae
        Lad:
            r2 = r11
        Lae:
            r6.a = r8
            r6.b = r14
            r6.e = r7
            java.lang.Object r10 = r10.c(r11, r6)
            if (r10 != r9) goto Lbb
        Lba:
            return r9
        Lbb:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qjk0.a(java.lang.String, p.ayc0, java.util.List, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        ljk0 ljk0Var;
        if (onmVar instanceof ljk0) {
            ljk0Var = (ljk0) onmVar;
            int i = ljk0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ljk0Var.c = i - Integer.MIN_VALUE;
            } else {
                ljk0Var = new ljk0(this, onmVar);
            }
        } else {
            ljk0Var = new ljk0(this, onmVar);
        }
        Object objI = ljk0Var.a;
        int i2 = ljk0Var.c;
        if (i2 == 0) {
            hm5.M(objI);
            r3d0 r3d0Var = this.f;
            if (r3d0Var != null) {
                return r3d0Var;
            }
            ljk0Var.c = 1;
            objI = b5p1.i(this.e, ljk0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        r3d0 r3d0VarA = this.d.a((String) objI);
        this.f = r3d0VarA;
        return r3d0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (p.fc11.i(r6, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.mjk0
            if (r0 == 0) goto L13
            r0 = r8
            p.mjk0 r0 = (p.mjk0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.mjk0 r0 = new p.mjk0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            p.kv00 r6 = r6.b
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r8)     // Catch: java.lang.Throwable -> L66
            goto L66
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L33:
            java.lang.String r7 = r0.a
            p.hm5.M(r8)     // Catch: java.lang.Throwable -> L66
            goto L51
        L39:
            p.hm5.M(r8)
            java.lang.Class<p.uu8> r8 = p.uu8.class
            java.util.List r1 = java.util.Collections.singletonList(r7)     // Catch: java.lang.Throwable -> L66
            io.reactivex.rxjava3.core.Completable r8 = r6.a(r8, r1)     // Catch: java.lang.Throwable -> L66
            r0.a = r7     // Catch: java.lang.Throwable -> L66
            r0.d = r4     // Catch: java.lang.Throwable -> L66
            java.lang.Object r8 = p.fc11.i(r8, r0)     // Catch: java.lang.Throwable -> L66
            if (r8 != r5) goto L51
            goto L65
        L51:
            java.lang.Class<p.fuj0> r8 = p.fuj0.class
            java.util.List r7 = java.util.Collections.singletonList(r7)     // Catch: java.lang.Throwable -> L66
            io.reactivex.rxjava3.core.Completable r6 = r6.a(r8, r7)     // Catch: java.lang.Throwable -> L66
            r0.a = r2     // Catch: java.lang.Throwable -> L66
            r0.d = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r6 = p.fc11.i(r6, r0)     // Catch: java.lang.Throwable -> L66
            if (r6 != r5) goto L66
        L65:
            return r5
        L66:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qjk0.c(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        if (f(r4, r5) == r10) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r17, p.onm r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qjk0.d(java.lang.String, p.onm, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(String str, onm onmVar, boolean z) {
        ojk0 ojk0Var;
        if (onmVar instanceof ojk0) {
            ojk0Var = (ojk0) onmVar;
            int i = ojk0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ojk0Var.c = i - Integer.MIN_VALUE;
            } else {
                ojk0Var = new ojk0(this, onmVar);
            }
        } else {
            ojk0Var = new ojk0(this, onmVar);
        }
        ojk0 ojk0Var2 = ojk0Var;
        Object obj = ojk0Var2.a;
        int i2 = ojk0Var2.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        pl81 pl81VarN = SignalData.n();
        pl81VarN.n();
        phc byteString = ((SignalData) pl81VarN.build()).toByteString();
        uk61 uk61VarN = SetMixState.n();
        uk61VarN.n(z);
        ayc0 ayc0Var = new ayc0("mix-state", byteString, ((SetMixState) uk61VarN.build()).toByteString(), z, (String) null, 16);
        List listSingletonList = z ? Collections.singletonList("mix") : z6x.a;
        ojk0Var2.c = 1;
        Object objA = a(str, ayc0Var, listSingletonList, !z, ojk0Var2);
        Object obj2 = d9n.a;
        return objA == obj2 ? obj2 : objA;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, onm onmVar) {
        pjk0 pjk0Var;
        r3d0 r3d0Var;
        if (onmVar instanceof pjk0) {
            pjk0Var = (pjk0) onmVar;
            int i = pjk0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjk0Var.e = i - Integer.MIN_VALUE;
            } else {
                pjk0Var = new pjk0(this, onmVar);
            }
        } else {
            pjk0Var = new pjk0(this, onmVar);
        }
        Object objB = pjk0Var.c;
        int i2 = pjk0Var.e;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            pjk0Var.a = str;
            pjk0Var.e = 1;
            objB = b(pjk0Var);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = pjk0Var.a;
            hm5.M(objB);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objB);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r3d0Var = pjk0Var.b;
            str = pjk0Var.a;
            hm5.M(objB);
        }
        if (!(((g3d0) objB) instanceof u2d0)) {
            pjk0Var.a = null;
            pjk0Var.b = null;
            pjk0Var.e = 3;
            if (r3d0Var.d(str, u2d0.a, pjk0Var) == obj) {
                return obj;
            }
        }
        return rih1Var;
        r3d0Var = (r3d0) objB;
        pjk0Var.a = str;
        pjk0Var.b = r3d0Var;
        pjk0Var.e = 2;
        objB = r3d0Var.a(str, pjk0Var);
        if (objB != obj) {
            if (!(((g3d0) objB) instanceof u2d0)) {
                pjk0Var.a = null;
                pjk0Var.b = null;
                pjk0Var.e = 3;
                if (r3d0Var.d(str, u2d0.a, pjk0Var) == obj) {
                }
            }
            return rih1Var;
        }
        return obj;
    }
}
