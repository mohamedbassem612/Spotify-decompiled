package p;

import android.content.Context;
import android.content.IntentFilter;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.serviceapi.android.quasarworker.QuasarWorker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l4f0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4f0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final Object e(Object obj) {
        e3s0 e3s0Var = (e3s0) this.e;
        s2s0 s2s0Var = (s2s0) this.d;
        ssw0 ssw0Var = (ssw0) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        }
        hm5.M(obj);
        this.c = ssw0Var;
        this.b = (byte) 1;
        Object objB = ssw0Var.b(Boolean.valueOf(s2s0Var.a(e3s0Var)), this);
        if (objB != d9nVar) {
            objB = rih1Var;
        }
        if (objB != d9nVar) {
        }
        Context context = s2s0Var.a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        ezc ezcVarF = h4p1.f(new ary(tr20.a, context, intentFilter, s2s0Var.b, (lnm) null, (byte) 4));
        ap70 ap70Var = new ap70(ssw0Var, s2s0Var, e3s0Var, (byte) 29);
        this.c = null;
        this.b = (byte) 2;
        return ezcVarF.collect(ap70Var, this) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r12.collect(r3, r11) == r7) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l4f0.g(java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj) {
        Object objG;
        List list = (List) this.d;
        iku0 iku0Var = (iku0) this.c;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            this.b = (byte) 1;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Set set = s4b1.f;
                if (uic.g((String) obj2, blc0.ti)) {
                    arrayList.add(obj2);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            Object obj3 = rih1.a;
            if (!zIsEmpty && (objG = iku0Var.c.g(iku0Var.g, arrayList, this)) == d9nVar) {
                obj3 = objG;
            }
            if (obj3 != d9nVar) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        xyc0 xyc0Var = iku0Var.b;
        String str = iku0Var.g;
        String str2 = iku0Var.f.a;
        tv80 tv80Var = (tv80) this.e;
        zxc0 zxc0Var = tv80Var != null ? new zxc0(tv80Var.a) : null;
        this.b = (byte) 2;
        Object objE = xyc0Var.e(str, list, "end", str2, "spotify:assisted-curation", zxc0Var, this);
        return objE == d9nVar ? d9nVar : objE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a5, code lost:
    
        if (r3.emit(r2, r22) == r8) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            java.lang.Object r1 = r0.e
            p.vzn0 r1 = (p.vzn0) r1
            p.cv21 r1 = r1.a
            java.lang.Object r2 = r0.d
            p.svb0 r2 = (p.svb0) r2
            java.lang.Object r3 = r0.c
            p.vr20 r3 = (p.vr20) r3
            byte r4 = r0.b
            r5 = 0
            r6 = 2
            r7 = 1
            p.d9n r8 = p.d9n.a
            if (r4 == 0) goto L2c
            if (r4 == r7) goto L28
            if (r4 != r6) goto L22
            p.hm5.M(r23)
            goto La8
        L22:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r5
        L28:
            p.hm5.M(r23)
            goto L96
        L2c:
            p.hm5.M(r23)
            java.lang.Object r4 = r2.c
            p.fna r4 = (p.fna) r4
            p.vtf r9 = new p.vtf
            java.lang.String r10 = r1.a
            java.lang.String r11 = r1.c
            java.lang.String r12 = r1.b
            r9.<init>(r10, r11, r12)
            java.lang.Object r4 = r4.b
            p.xid r4 = (p.xid) r4
            java.lang.Object r10 = r4.c
            p.fwn0 r10 = (p.fwn0) r10
            p.dwn0 r11 = new p.dwn0
            java.lang.String r12 = "spotify:internal:users-nearby-check-in"
            java.lang.String r13 = ""
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            android.content.Intent r10 = r10.a(r11)
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r12 = "check.in.sheet.parameters"
            r11.putParcelable(r12, r9)
            r10.putExtras(r11)
            java.lang.String r9 = "is_internal_navigation"
            r10.putExtra(r9, r7)
            java.lang.Object r4 = r4.b
            p.uz5 r4 = (p.uz5) r4
            r4.a(r10)
            java.lang.Object r2 = r2.b
            p.pni1 r2 = (p.pni1) r2
            p.kly0 r2 = r2.a
            java.lang.Object r2 = r2.get()
            p.t65 r2 = (p.t65) r2
            int r2 = r2.a()
            long r9 = (long) r2
            r0.c = r3
            r0.b = r7
            java.lang.Object r2 = p.hap1.i(r9, r0)
            if (r2 != r8) goto L96
            goto La7
        L96:
            p.e0o0 r2 = new p.e0o0
            java.lang.String r1 = r1.a
            r2.<init>(r1)
            r0.c = r5
            r0.b = r6
            java.lang.Object r0 = r3.emit(r2, r0)
            if (r0 != r8) goto La8
        La7:
            return r8
        La8:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l4f0.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    private final Object j(Object obj) {
        Object objY;
        gfw0 gfw0Var = (gfw0) this.d;
        q8n q8nVar = gfw0Var.f;
        i091 i091Var = (i091) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            String str = (String) this.e;
            this.c = i091Var;
            this.b = (byte) 1;
            if (!ebp1.q(i091Var) || i091Var.a == null) {
                objY = rih1Var;
            } else {
                WeakReference weakReference = gfw0Var.t;
                if ((weakReference != null ? (VideoSurfaceView) weakReference.get() : null) == null || (objY = fn31.Y(q8nVar, new cqu0(gfw0Var, str, (lnm) null, (byte) 7), this)) != d9nVar) {
                    objY = rih1Var;
                }
            }
            if (objY != d9nVar) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (ebp1.q(i091Var)) {
            gfw0Var.A.m((Object) null, i091Var);
        }
        cqu0 cqu0Var = new cqu0(gfw0Var, i091Var, (lnm) null, (byte) 8);
        this.c = null;
        this.b = (byte) 2;
        return fn31.Y(q8nVar, cqu0Var, this) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (p.fn31.Y(r7, r15, r14) == r13) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (p.fn31.Y(r7, r15, r14) == r13) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.e
            r3 = r0
            p.iew r3 = (p.iew) r3
            java.lang.Object r0 = r14.d
            r2 = r0
            p.p1f0 r2 = (p.p1f0) r2
            java.lang.Object r0 = r2.e
            p.dqn r0 = (p.dqn) r0
            java.lang.Object r1 = r2.f
            r7 = r1
            p.q8n r7 = (p.q8n) r7
            java.lang.Object r1 = r14.c
            r8 = r1
            p.c9n r8 = (p.c9n) r8
            byte r1 = r14.b
            r9 = 0
            r10 = 3
            r11 = 2
            r12 = 1
            r5 = 0
            p.d9n r13 = p.d9n.a
            if (r1 == 0) goto L3a
            if (r1 == r12) goto L36
            if (r1 == r11) goto L31
            if (r1 != r10) goto L2a
            goto L31
        L2a:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r14)
            r14 = 0
            return r14
        L31:
            p.hm5.M(r15)
            goto La0
        L36:
            p.hm5.M(r15)
            goto L4d
        L3a:
            p.hm5.M(r15)
            p.frw0 r15 = new p.frw0
            r15.<init>(r2, r3, r5, r9)
            r14.c = r8
            r14.b = r12
            java.lang.Object r15 = p.fn31.Y(r7, r15, r14)
            if (r15 != r13) goto L4d
            goto L9f
        L4d:
            p.cqn r15 = r0.b
            p.aqn r15 = r15.c
            boolean r1 = r15 instanceof p.zpn
            if (r1 == 0) goto L58
            p.zpn r15 = (p.zpn) r15
            goto L59
        L58:
            r15 = r5
        L59:
            if (r15 != 0) goto L5d
            r15 = r9
            goto L66
        L5d:
            boolean r1 = r0.a
            if (r1 == 0) goto L64
            boolean r15 = r15.t
            goto L66
        L64:
            boolean r15 = r15.X
        L66:
            if (r15 == 0) goto L72
            p.pew0 r1 = new p.pew0
            r6 = 6
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            p.fn31.q(r8, r5, r9, r1, r10)
        L72:
            boolean r15 = r0.a
            if (r15 != 0) goto L90
            p.cqn r15 = r0.b
            p.aqn r15 = r15.c
            boolean r15 = r15.k0()
            if (r15 == 0) goto L90
            p.frw0 r15 = new p.frw0
            r15.<init>(r2, r3, r5, r12)
            r14.c = r5
            r14.b = r11
            java.lang.Object r14 = p.fn31.Y(r7, r15, r14)
            if (r14 != r13) goto La0
            goto L9f
        L90:
            p.frw0 r15 = new p.frw0
            r15.<init>(r2, r3, r5, r11)
            r14.c = r5
            r14.b = r10
            java.lang.Object r14 = p.fn31.Y(r7, r15, r14)
            if (r14 != r13) goto La0
        L9f:
            return r13
        La0:
            p.rih1 r14 = p.rih1.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l4f0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 == r6) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r8) throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            com.spotify.serviceapi.android.quasarworker.QuasarWorker r0 = (com.spotify.serviceapi.android.quasarworker.QuasarWorker) r0
            java.lang.Object r1 = r7.c
            p.c9n r1 = (p.c9n) r1
            byte r2 = r7.b
            r3 = 0
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1d
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            goto L49
        L19:
            r7 = move-exception
            goto L4c
        L1b:
            r7 = move-exception
            goto L50
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L23:
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            goto L38
        L27:
            p.hm5.M(r8)
            r0.u()     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            r7.c = r1     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            r7.b = r5     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            java.lang.Object r8 = r0.y(r7)     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            if (r8 != r6) goto L38
            goto L48
        L38:
            java.lang.Object r8 = r7.e     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            p.l811 r8 = (p.l811) r8     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            r8.a = r5     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            r7.c = r3     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            r7.b = r4     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            java.lang.Object r8 = r0.k(r1, r7)     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            if (r8 != r6) goto L49
        L48:
            return r6
        L49:
            p.y8d0 r8 = (p.y8d0) r8     // Catch: java.lang.Exception -> L19 java.util.concurrent.CancellationException -> L1b
            return r8
        L4c:
            r0.t(r7)
            throw r7
        L50:
            java.util.concurrent.atomic.AtomicReference r8 = r0.i
            java.lang.Object r8 = r8.get()
            java.lang.Exception r8 = (java.lang.Exception) r8
            if (r8 == 0) goto L5e
            r0.t(r8)
            goto L61
        L5e:
            r0.q()
        L61:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l4f0.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) throws Throwable {
        tig0 m231Var;
        tig0 tig0Var;
        kdy0 kdy0Var = (kdy0) this.e;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                mr20 mr20VarD = ((u4q0) kdy0Var.c).d();
                this.d = null;
                this.c = null;
                this.b = (byte) 1;
                obj = b5p1.i(mr20VarD, this);
                if (obj == d9nVar) {
                }
                return d9nVar;
            }
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tig0Var = (tig0) this.c;
                hm5.M(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return new mmr0(tig0Var, bool);
            m231Var = (tig0) obj;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            m231Var = sig0.a;
        }
        tig0 tig0Var2 = m231Var;
        mr20 mr20VarA = ((am30) kdy0Var.d).a();
        this.d = null;
        this.c = tig0Var2;
        this.b = (byte) 2;
        Object objI = b5p1.i(mr20VarA, this);
        if (objI != d9nVar) {
            obj = objI;
            tig0Var = tig0Var2;
            Boolean bool2 = (Boolean) obj;
            bool2.booleanValue();
            return new mmr0(tig0Var, bool2);
        }
        return d9nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r0.emit(r13, r12) == r5) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r12.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r13)
            goto L59
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r4
        L1b:
            p.hm5.M(r13)
            goto L3e
        L1f:
            p.hm5.M(r13)
            p.l4f0 r13 = new p.l4f0
            java.lang.Object r1 = r12.d
            p.yup0 r1 = (p.yup0) r1
            java.lang.Object r6 = r12.e
            java.lang.String r6 = (java.lang.String) r6
            r7 = 26
            r13.<init>(r1, r6, r4, r7)
            r12.c = r0
            r12.b = r3
            r6 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r13 = p.rc2.O(r6, r13, r12)
            if (r13 != r5) goto L3e
            goto L58
        L3e:
            p.j001 r13 = (p.j001) r13
            if (r13 != 0) goto L4e
            p.j001 r6 = new p.j001
            r10 = 0
            p.z6x r11 = p.z6x.a
            r7 = 0
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = r6
        L4e:
            r12.c = r4
            r12.b = r2
            java.lang.Object r12 = r0.emit(r13, r12)
            if (r12 != r5) goto L59
        L58:
            return r5
        L59:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l4f0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    private final Object s(Object obj) {
        xsf1 xsf1Var;
        String str;
        List list;
        String str2 = (String) this.e;
        yup0 yup0Var = (yup0) this.d;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            btf1 btf1Var = (btf1) yup0Var.c;
            this.b = (byte) 1;
            obj = btf1Var.a(str2, "listening-activity-reaction-sheet", this, true);
            if (obj != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xsf1Var = (xsf1) this.c;
            hm5.M(obj);
        }
        String str3 = (String) ((zlj0) obj).a();
        if (xsf1Var != null) {
            str = xsf1Var.a;
        } else {
            str = null;
        }
        String str4 = xsf1Var != null ? xsf1Var.b : null;
        if (xsf1Var != null) {
            list = xsf1Var.c;
        } else {
            list = z6x.a;
        }
        return new j001(str, str4, false, str3, list);
        xsf1 xsf1Var2 = (xsf1) ((zlj0) obj).a();
        wml wmlVar = (wml) yup0Var.d;
        this.c = xsf1Var2;
        this.b = (byte) 2;
        Object objA = wmlVar.a(str2, this);
        if (objA != d9nVar) {
            obj = objA;
            xsf1Var = xsf1Var2;
            String str5 = (String) ((zlj0) obj).a();
            if (xsf1Var != null) {
                str = xsf1Var.a;
            } else {
                str = null;
            }
            String str6 = xsf1Var != null ? xsf1Var.b : null;
            if (xsf1Var != null) {
                list = xsf1Var.c;
            } else {
                list = z6x.a;
            }
            return new j001(str, str6, false, str5, list);
        }
        return d9nVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final Object t(Object obj) throws KotlinNothingValueException {
        uh01 uh01Var = (uh01) this.d;
        nsw0 nsw0Var = (nsw0) this.c;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                throw l1d.v(obj);
            }
            if (b == 2) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        ay8 ay8VarH = d3p1.H(uh01Var.a, uh01Var.X, (ah01) this.e);
        boolean z = uh01Var.h;
        d9n d9nVar = d9n.a;
        if (z) {
            zrf zrfVar = new zrf(nsw0Var, (byte) 5);
            this.c = null;
            this.b = (byte) 1;
            ay8VarH.collect(zrfVar, this);
            return d9nVar;
        }
        tzy0 tzy0Var = new tzy0(new p811(), nsw0Var, (byte) 6);
        this.c = null;
        this.b = (byte) 2;
        ay8VarH.collect(tzy0Var, this);
        return d9nVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new l4f0((n4f0) this.d, (yg8) obj2, lnmVar, (byte) 0);
            case 1:
                return new l4f0((mxf0) this.c, (jxf0) this.d, (tqw) obj2, lnmVar, (byte) 1);
            case 2:
                l4f0 l4f0Var = new l4f0((mag0) this.d, (cag0) obj2, lnmVar, (byte) 2);
                l4f0Var.c = obj;
                return l4f0Var;
            case 3:
                l4f0 l4f0Var2 = new l4f0((mag0) this.d, (dag0) obj2, lnmVar, (byte) 3);
                l4f0Var2.c = obj;
                return l4f0Var2;
            case 4:
                l4f0 l4f0Var3 = new l4f0((vug0) obj2, lnmVar, (byte) 4);
                l4f0Var3.d = obj;
                return l4f0Var3;
            case 5:
                return new l4f0((q1d0) this.c, (xtb0) this.d, (String) obj2, lnmVar, (byte) 5);
            case 6:
                l4f0 l4f0Var4 = new l4f0((ydh0) this.d, (ssw0) obj2, lnmVar, (byte) 6);
                l4f0Var4.c = obj;
                return l4f0Var4;
            case 7:
                l4f0 l4f0Var5 = new l4f0((nwh0) obj2, lnmVar, (byte) 7);
                l4f0Var5.d = obj;
                return l4f0Var5;
            case 8:
                return new l4f0((e4j0) this.c, (n3j0) this.d, (q3j0) obj2, lnmVar, (byte) 8);
            case 9:
                return new l4f0((cej0) this.c, (j9k0) this.d, (tv80) obj2, lnmVar, (byte) 9);
            case 10:
                return new l4f0((dub1) this.c, (Function0) this.d, (ven0) obj2, lnmVar, (byte) 10);
            case 11:
                l4f0 l4f0Var6 = new l4f0((n3n0) this.d, (k3n0) obj2, lnmVar, (byte) 11);
                l4f0Var6.c = obj;
                return l4f0Var6;
            case 12:
                return new l4f0((String) this.c, (p410) this.d, (tv80) obj2, lnmVar, (byte) 12);
            case 13:
                l4f0 l4f0Var7 = new l4f0((s880) this.d, (String) obj2, lnmVar, (byte) 13);
                l4f0Var7.c = obj;
                return l4f0Var7;
            case 14:
                return new l4f0((gun0) this.c, (lj30) this.d, (fpo) obj2, lnmVar, (byte) 14);
            case 15:
                l4f0 l4f0Var8 = new l4f0((v4o0) obj2, lnmVar, (byte) 15);
                l4f0Var8.d = obj;
                return l4f0Var8;
            case 16:
                l4f0 l4f0Var9 = new l4f0((qno0) this.d, (tlo0) obj2, lnmVar, (byte) 16);
                l4f0Var9.c = obj;
                return l4f0Var9;
            case 17:
                return new l4f0((rzo0) this.d, (String) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                l4f0 l4f0Var10 = new l4f0((s2s0) this.d, (e3s0) obj2, lnmVar, (byte) 18);
                l4f0Var10.c = obj;
                return l4f0Var10;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                l4f0 l4f0Var11 = new l4f0((zqs0) obj2, lnmVar, (byte) 19);
                l4f0Var11.d = obj;
                return l4f0Var11;
            case 20:
                return new l4f0((iku0) this.c, (List) this.d, (tv80) obj2, lnmVar, (byte) 20);
            case 21:
                l4f0 l4f0Var12 = new l4f0((svb0) this.d, (vzn0) obj2, lnmVar, (byte) 21);
                l4f0Var12.c = obj;
                return l4f0Var12;
            case 22:
                l4f0 l4f0Var13 = new l4f0((gfw0) this.d, (String) obj2, lnmVar, (byte) 22);
                l4f0Var13.c = obj;
                return l4f0Var13;
            case 23:
                l4f0 l4f0Var14 = new l4f0((p1f0) this.d, (iew) obj2, lnmVar, (byte) 23);
                l4f0Var14.c = obj;
                return l4f0Var14;
            case 24:
                l4f0 l4f0Var15 = new l4f0((QuasarWorker) this.d, (l811) obj2, lnmVar, (byte) 24);
                l4f0Var15.c = obj;
                return l4f0Var15;
            case 25:
                l4f0 l4f0Var16 = new l4f0((kdy0) obj2, lnmVar, (byte) 25);
                l4f0Var16.d = obj;
                return l4f0Var16;
            case 26:
                return new l4f0((yup0) this.d, (String) obj2, lnmVar, (byte) 26);
            case 27:
                l4f0 l4f0Var17 = new l4f0((yup0) this.d, (String) obj2, lnmVar, (byte) 27);
                l4f0Var17.c = obj;
                return l4f0Var17;
            case 28:
                l4f0 l4f0Var18 = new l4f0((uh01) this.d, (ah01) obj2, lnmVar, (byte) 28);
                l4f0Var18.c = obj;
                return l4f0Var18;
            default:
                l4f0 l4f0Var19 = new l4f0((o911) obj2, lnmVar, (byte) 29);
                l4f0Var19.d = obj;
                return l4f0Var19;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((Float) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create(obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((i091) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:540:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:70:0x0150  */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0305, code lost:
    
        if (r2 == r10) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0460, code lost:
    
        if (p.hap1.i(500, r27) == r10) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01dc, code lost:
    
        if (p.fc11.i(r0, r27) == r10) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l4f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4f0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4f0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
