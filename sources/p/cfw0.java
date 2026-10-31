package p;

import android.os.Trace;
import com.spotify.betamax.player.VideoSurfaceView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cfw0 extends a8d1 implements vu30 {
    public final /* synthetic */ sbw0 N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ tv80 P0;
    public byte X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gfw0 Z;
    public p811 a;
    public p811 b;
    public String c;
    public lsm0 d;
    public gfw0 e;
    public sbw0 f;
    public tv80 g;
    public r091 h;
    public int i;
    public long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfw0(gfw0 gfw0Var, sbw0 sbw0Var, boolean z, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Z = gfw0Var;
        this.N0 = sbw0Var;
        this.O0 = z;
        this.P0 = tv80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        cfw0 cfw0Var = new cfw0(this.Z, this.N0, this.O0, this.P0, lnmVar);
        cfw0Var.Y = obj;
        return cfw0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x012d A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:46:0x0115, B:48:0x011d, B:50:0x0123, B:52:0x012d, B:62:0x0158, B:64:0x015e, B:66:0x0166, B:69:0x016d, B:72:0x0173, B:74:0x0184, B:80:0x01a2, B:81:0x01a5, B:83:0x01ad, B:85:0x01b4, B:84:0x01b1, B:86:0x01b9, B:87:0x01bc, B:55:0x0149, B:57:0x014d, B:59:0x0151, B:17:0x0065, B:30:0x00af, B:34:0x00bd, B:36:0x00cc, B:38:0x00d7, B:40:0x00e1, B:42:0x00ed, B:91:0x01c4, B:92:0x01c7, B:101:0x020d, B:102:0x0214, B:104:0x0216, B:105:0x0219, B:22:0x008a, B:27:0x0093, B:41:0x00ea, B:76:0x018d, B:79:0x0196, B:35:0x00c4), top: B:108:0x0018, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:46:0x0115, B:48:0x011d, B:50:0x0123, B:52:0x012d, B:62:0x0158, B:64:0x015e, B:66:0x0166, B:69:0x016d, B:72:0x0173, B:74:0x0184, B:80:0x01a2, B:81:0x01a5, B:83:0x01ad, B:85:0x01b4, B:84:0x01b1, B:86:0x01b9, B:87:0x01bc, B:55:0x0149, B:57:0x014d, B:59:0x0151, B:17:0x0065, B:30:0x00af, B:34:0x00bd, B:36:0x00cc, B:38:0x00d7, B:40:0x00e1, B:42:0x00ed, B:91:0x01c4, B:92:0x01c7, B:101:0x020d, B:102:0x0214, B:104:0x0216, B:105:0x0219, B:22:0x008a, B:27:0x0093, B:41:0x00ea, B:76:0x018d, B:79:0x0196, B:35:0x00c4), top: B:108:0x0018, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x016d A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:46:0x0115, B:48:0x011d, B:50:0x0123, B:52:0x012d, B:62:0x0158, B:64:0x015e, B:66:0x0166, B:69:0x016d, B:72:0x0173, B:74:0x0184, B:80:0x01a2, B:81:0x01a5, B:83:0x01ad, B:85:0x01b4, B:84:0x01b1, B:86:0x01b9, B:87:0x01bc, B:55:0x0149, B:57:0x014d, B:59:0x0151, B:17:0x0065, B:30:0x00af, B:34:0x00bd, B:36:0x00cc, B:38:0x00d7, B:40:0x00e1, B:42:0x00ed, B:91:0x01c4, B:92:0x01c7, B:101:0x020d, B:102:0x0214, B:104:0x0216, B:105:0x0219, B:22:0x008a, B:27:0x0093, B:41:0x00ea, B:76:0x018d, B:79:0x0196, B:35:0x00c4), top: B:108:0x0018, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    /* JADX WARN: Code duplicated, block: B:72:0x0173 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:46:0x0115, B:48:0x011d, B:50:0x0123, B:52:0x012d, B:62:0x0158, B:64:0x015e, B:66:0x0166, B:69:0x016d, B:72:0x0173, B:74:0x0184, B:80:0x01a2, B:81:0x01a5, B:83:0x01ad, B:85:0x01b4, B:84:0x01b1, B:86:0x01b9, B:87:0x01bc, B:55:0x0149, B:57:0x014d, B:59:0x0151, B:17:0x0065, B:30:0x00af, B:34:0x00bd, B:36:0x00cc, B:38:0x00d7, B:40:0x00e1, B:42:0x00ed, B:91:0x01c4, B:92:0x01c7, B:101:0x020d, B:102:0x0214, B:104:0x0216, B:105:0x0219, B:22:0x008a, B:27:0x0093, B:41:0x00ea, B:76:0x018d, B:79:0x0196, B:35:0x00c4), top: B:108:0x0018, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:46:0x0115, B:48:0x011d, B:50:0x0123, B:52:0x012d, B:62:0x0158, B:64:0x015e, B:66:0x0166, B:69:0x016d, B:72:0x0173, B:74:0x0184, B:80:0x01a2, B:81:0x01a5, B:83:0x01ad, B:85:0x01b4, B:84:0x01b1, B:86:0x01b9, B:87:0x01bc, B:55:0x0149, B:57:0x014d, B:59:0x0151, B:17:0x0065, B:30:0x00af, B:34:0x00bd, B:36:0x00cc, B:38:0x00d7, B:40:0x00e1, B:42:0x00ed, B:91:0x01c4, B:92:0x01c7, B:101:0x020d, B:102:0x0214, B:104:0x0216, B:105:0x0219, B:22:0x008a, B:27:0x0093, B:41:0x00ea, B:76:0x018d, B:79:0x0196, B:35:0x00c4), top: B:108:0x0018, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:46:0x0115, B:48:0x011d, B:50:0x0123, B:52:0x012d, B:62:0x0158, B:64:0x015e, B:66:0x0166, B:69:0x016d, B:72:0x0173, B:74:0x0184, B:80:0x01a2, B:81:0x01a5, B:83:0x01ad, B:85:0x01b4, B:84:0x01b1, B:86:0x01b9, B:87:0x01bc, B:55:0x0149, B:57:0x014d, B:59:0x0151, B:17:0x0065, B:30:0x00af, B:34:0x00bd, B:36:0x00cc, B:38:0x00d7, B:40:0x00e1, B:42:0x00ed, B:91:0x01c4, B:92:0x01c7, B:101:0x020d, B:102:0x0214, B:104:0x0216, B:105:0x0219, B:22:0x008a, B:27:0x0093, B:41:0x00ea, B:76:0x018d, B:79:0x0196, B:35:0x00c4), top: B:108:0x0018, inners: #1, #2, #3 }] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        p811 p811Var;
        p811 p811Var2;
        long jB;
        Object objM;
        lsm0 lsm0VarQ;
        tv80 tv80Var;
        Object objL;
        r091 r091Var;
        String str;
        gfw0 gfw0Var;
        r091 r091Var2;
        String str2;
        wii1 wii1Var;
        tv80 tv80Var2;
        zkm zkmVar;
        WeakReference weakReference;
        tv80 tv80VarA;
        VideoSurfaceView videoSurfaceView;
        c9n c9nVar = (c9n) this.Y;
        int iIncrementAndGet = this.X;
        boolean z = this.O0;
        sbw0 sbw0Var = this.N0;
        rih1 rih1Var = rih1.a;
        gfw0 gfw0Var2 = this.Z;
        d9n d9nVar = d9n.a;
        try {
            if (iIncrementAndGet == 0) {
                hm5.M(obj);
                iIncrementAndGet = rfw0.a.incrementAndGet();
                mif1.d("PreviewCard.Player.intentToPlay", iIncrementAndGet);
                p811Var = new p811();
                p811Var2 = new p811();
                if (gfw0Var2.K != 1) {
                    mif1.e("PreviewCard.Player.intentToPlay", iIncrementAndGet);
                    return rih1Var;
                }
                jB = gfw0Var2.g.b();
                this.Y = c9nVar;
                this.a = p811Var;
                this.b = p811Var2;
                this.i = iIncrementAndGet;
                this.t = jB;
                this.X = (byte) 1;
                objM = gfw0Var2.m(sbw0Var, z, this);
                if (objM != d9nVar) {
                }
                return d9nVar;
            }
            if (iIncrementAndGet == 1) {
                long j = this.t;
                iIncrementAndGet = this.i;
                p811 p811Var3 = this.b;
                p811 p811Var4 = this.a;
                hm5.M(obj);
                p811Var2 = p811Var3;
                p811Var = p811Var4;
                jB = j;
                objM = obj;
            } else {
                if (iIncrementAndGet != 2) {
                    if (iIncrementAndGet == 3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = this.t;
                int i = this.i;
                r091Var = this.h;
                tv80 tv80Var3 = this.g;
                sbw0 sbw0Var2 = this.f;
                gfw0Var = this.e;
                lsm0 lsm0Var = this.d;
                str = this.c;
                p811Var2 = this.b;
                p811 p811Var5 = this.a;
                try {
                    hm5.M(obj);
                    tv80Var = tv80Var3;
                    objL = obj;
                    p811Var = p811Var5;
                    iIncrementAndGet = i;
                    lsm0VarQ = lsm0Var;
                    sbw0Var = sbw0Var2;
                    jB = j2;
                } catch (Throwable th) {
                    th = th;
                    iIncrementAndGet = i;
                }
            }
            wii1Var = (wii1) objL;
            if (smo1.u(c9nVar) && gfw0Var.v(sbw0Var)) {
                tv80Var2 = tv80Var;
                if (((r091) gfw0Var.k.b) == r091Var) {
                    gfw0Var.q.m((Object) null, Boolean.TRUE);
                    zkmVar = (zkm) ((bpb1) gfw0Var.l.f).getValue();
                    if (zkmVar != null || !zkmVar.d || !zkmVar.c || !k9k.f(zkmVar, sbw0Var)) {
                        gfw0Var.C = true;
                        weakReference = gfw0Var.t;
                        if (weakReference != null && (videoSurfaceView = (VideoSurfaceView) weakReference.get()) != null) {
                            r091Var.i(videoSurfaceView);
                        }
                        if (tv80Var2 == null) {
                            if (wii1Var != null) {
                                tv80VarA = wii1Var.a;
                            } else {
                                tv80VarA = null;
                            }
                            if (tv80VarA == null) {
                                tv80VarA = gfw0Var.n.a(sbw0Var.a, str, lsm0VarQ.b.a instanceof gec1);
                            }
                        } else {
                            tv80VarA = tv80Var2;
                        }
                        AtomicInteger atomicInteger = rfw0.a;
                        Trace.beginSection("PreviewCard.Player.play");
                        if (wii1Var != null) {
                            try {
                                jB = gfw0Var.g.b();
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        }
                        r091Var.e(tv80VarA, new Long(jB), sbw0Var.c, eky0.a);
                        Trace.endSection();
                    }
                    if (gfw0Var.h.a()) {
                        r091Var.c();
                    } else {
                        r091Var.k();
                    }
                    p811Var.a = r091Var;
                    p811Var2.a = str;
                    AtomicInteger atomicInteger2 = rfw0.a;
                    mif1.e("PreviewCard.Player.intentToPlay", iIncrementAndGet);
                    r091Var2 = (r091) p811Var.a;
                    str2 = (String) p811Var2.a;
                    if (r091Var2 != null && str2 != null) {
                        this.Y = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f = null;
                        this.g = null;
                        this.h = null;
                        this.i = iIncrementAndGet;
                        this.X = (byte) 3;
                        if (smo1.s(new dfw0(this.N0, gfw0Var2, str2, r091Var2, (lnm) null), this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
            }
            AtomicInteger atomicInteger3 = rfw0.a;
            mif1.e("PreviewCard.Player.intentToPlay", iIncrementAndGet);
            return rih1Var;
            if (!((Boolean) objM).booleanValue()) {
                AtomicInteger atomicInteger4 = rfw0.a;
                mif1.e("PreviewCard.Player.intentToPlay", iIncrementAndGet);
                return rih1Var;
            }
            AtomicInteger atomicInteger5 = rfw0.a;
            Trace.beginSection("PreviewCard.Player.acquire");
            try {
                r091 r091VarF = gfw0Var2.k.f(gfw0Var2.s);
                Trace.endSection();
                if (sbw0Var.d.b.e == null) {
                    throw new IllegalArgumentException("MultiPlayerContent must have a non-null entityUri in its reportingMetadata");
                }
                String strP = gfw0.p(sbw0Var);
                lsm0VarQ = gfw0Var2.q(sbw0Var);
                if (r091VarF != null) {
                    tv80Var = this.P0;
                    Trace.beginSection("PreviewCard.Player.load");
                    try {
                        r091VarF.b(lsm0VarQ);
                        Trace.endSection();
                        this.Y = c9nVar;
                        this.a = p811Var;
                        this.b = p811Var2;
                        this.c = strP;
                        this.d = lsm0VarQ;
                        this.e = gfw0Var2;
                        this.f = sbw0Var;
                        this.g = tv80Var;
                        this.h = r091VarF;
                        this.i = iIncrementAndGet;
                        this.t = jB;
                        this.X = (byte) 2;
                        objL = gfw0Var2.l(sbw0Var, z, this);
                        if (objL == d9nVar) {
                            return d9nVar;
                        }
                        r091Var = r091VarF;
                        str = strP;
                        gfw0Var = gfw0Var2;
                        wii1Var = (wii1) objL;
                        if (smo1.u(c9nVar)) {
                            tv80Var2 = tv80Var;
                            if (((r091) gfw0Var.k.b) == r091Var) {
                                gfw0Var.q.m((Object) null, Boolean.TRUE);
                                zkmVar = (zkm) ((bpb1) gfw0Var.l.f).getValue();
                                if (zkmVar != null) {
                                    gfw0Var.C = true;
                                    weakReference = gfw0Var.t;
                                    if (weakReference != null) {
                                        r091Var.i(videoSurfaceView);
                                    }
                                    if (tv80Var2 == null) {
                                        if (wii1Var != null) {
                                            tv80VarA = wii1Var.a;
                                        } else {
                                            tv80VarA = null;
                                        }
                                        if (tv80VarA == null) {
                                            tv80VarA = gfw0Var.n.a(sbw0Var.a, str, lsm0VarQ.b.a instanceof gec1);
                                        }
                                    } else {
                                        tv80VarA = tv80Var2;
                                    }
                                    AtomicInteger atomicInteger6 = rfw0.a;
                                    Trace.beginSection("PreviewCard.Player.play");
                                    if (wii1Var != null) {
                                        jB = gfw0Var.g.b();
                                    }
                                    r091Var.e(tv80VarA, new Long(jB), sbw0Var.c, eky0.a);
                                    Trace.endSection();
                                    if (gfw0Var.h.a()) {
                                        r091Var.c();
                                    } else {
                                        r091Var.k();
                                    }
                                    p811Var.a = r091Var;
                                    p811Var2.a = str;
                                } else {
                                    gfw0Var.C = true;
                                    weakReference = gfw0Var.t;
                                    if (weakReference != null) {
                                        r091Var.i(videoSurfaceView);
                                    }
                                    if (tv80Var2 == null) {
                                        if (wii1Var != null) {
                                            tv80VarA = wii1Var.a;
                                        } else {
                                            tv80VarA = null;
                                        }
                                        if (tv80VarA == null) {
                                            tv80VarA = gfw0Var.n.a(sbw0Var.a, str, lsm0VarQ.b.a instanceof gec1);
                                        }
                                    } else {
                                        tv80VarA = tv80Var2;
                                    }
                                    AtomicInteger atomicInteger7 = rfw0.a;
                                    Trace.beginSection("PreviewCard.Player.play");
                                    if (wii1Var != null) {
                                        jB = gfw0Var.g.b();
                                    }
                                    r091Var.e(tv80VarA, new Long(jB), sbw0Var.c, eky0.a);
                                    Trace.endSection();
                                    if (gfw0Var.h.a()) {
                                        r091Var.c();
                                    } else {
                                        r091Var.k();
                                    }
                                    p811Var.a = r091Var;
                                    p811Var2.a = str;
                                }
                            }
                        }
                        AtomicInteger atomicInteger8 = rfw0.a;
                        mif1.e("PreviewCard.Player.intentToPlay", iIncrementAndGet);
                        return rih1Var;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                rih1Var = rih1Var;
                AtomicInteger atomicInteger9 = rfw0.a;
                mif1.e("PreviewCard.Player.intentToPlay", iIncrementAndGet);
                r091Var2 = (r091) p811Var.a;
                str2 = (String) p811Var2.a;
                if (r091Var2 != null) {
                    this.Y = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    this.i = iIncrementAndGet;
                    this.X = (byte) 3;
                    if (smo1.s(new dfw0(this.N0, gfw0Var2, str2, r091Var2, (lnm) null), this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        AtomicInteger atomicInteger10 = rfw0.a;
        mif1.e("PreviewCard.Player.intentToPlay", iIncrementAndGet);
        throw th;
    }
}
