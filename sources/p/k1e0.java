package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Completable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k1e0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1e0(Object obj, o95 o95Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 17;
        jsq0 jsq0Var = jsq0.b;
        ksq0 ksq0Var = ksq0.b;
        this.d = obj;
        this.c = o95Var;
        this.e = ven0Var;
        this.f = ven0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    private final Object e(Object obj) {
        float f;
        d9n d9nVar;
        o95 o95Var;
        Float f2;
        pxg1 pxg1VarO0;
        jsq0 jsq0Var = jsq0.b;
        ven0 ven0Var = (ven0) this.f;
        Object obj2 = this.d;
        ven0 ven0Var2 = (ven0) this.e;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar2 = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 2) {
                hm5.M(obj);
                f = 1.0f;
                d9nVar = d9nVar2;
            } else {
                if (b != 3) {
                    if (b == 4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    if (b == 5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f = 1.0f;
                d9nVar = d9nVar2;
            }
            o95Var = (o95) this.c;
            f2 = new Float(f);
            pxg1VarO0 = irn1.o0(500, 0, klv.c, 2);
            this.b = (byte) 4;
            if (o95.b(o95Var, f2, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        hm5.M(obj);
        Object obj3 = jsq0Var.get(ven0Var2.getValue());
        if (obj3.equals(obj2) || ((Boolean) ksq0.b.get(obj3)).booleanValue()) {
            boolean zEquals = obj3.equals(obj2);
            o95 o95Var2 = (o95) this.c;
            if (!zEquals) {
                Float f3 = new Float(0.0f);
                pxg1 pxg1VarO1 = irn1.o0(500, 0, klv.c, 2);
                this.b = (byte) 2;
                f = 1.0f;
                d9nVar = d9nVar2;
                if (o95.b(o95Var2, f3, pxg1VarO1, (Float) null, (iu30) null, this, 12) == d9nVar) {
                    return d9nVar;
                }
            } else if (((Number) o95Var2.e()).floatValue() < 1.0f) {
                ven0Var2.setValue(ven0Var.getValue());
                o95 o95Var3 = (o95) this.c;
                Float f4 = new Float(1.0f);
                pxg1 pxg1VarO2 = irn1.o0(500, 0, klv.c, 2);
                this.b = (byte) 5;
                if (o95.b(o95Var3, f4, pxg1VarO2, (Float) null, (iu30) null, this, 12) == d9nVar2) {
                    return d9nVar2;
                }
            }
        } else {
            ven0Var2.setValue(ven0Var.getValue());
            o95 o95Var4 = (o95) this.c;
            Float f5 = new Float(1.0f);
            this.b = (byte) 1;
            if (o95Var4.g(f5, this) == d9nVar2) {
                return d9nVar2;
            }
        }
        return rih1Var;
        Object value = ven0Var.getValue();
        if (jsq0Var.get(value).equals(obj2)) {
            ven0Var2.setValue(value);
            this.b = (byte) 3;
            if (hap1.i(100L, this) == d9nVar) {
                return d9nVar;
            }
            o95Var = (o95) this.c;
            f2 = new Float(f);
            pxg1VarO0 = irn1.o0(500, 0, klv.c, 2);
            this.b = (byte) 4;
            if (o95.b(o95Var, f2, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    private final Object g(Object obj) throws Throwable {
        rjp0 rjp0Var;
        war0 war0Var = (war0) this.f;
        rjp0 rjp0Var2 = (ssw0) this.d;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                rjp0 qpj0Var = new qpj0(rjp0Var2, (byte) 4);
                try {
                    fns fnsVar = igu.a;
                    bs50 bs50Var = pyf0.a.f;
                    e3p0 e3p0Var = new e3p0(war0Var, qpj0Var, (lnm) null, (byte) 20);
                    this.d = null;
                    this.c = qpj0Var;
                    this.b = (byte) 1;
                    if (fn31.Y(bs50Var, e3p0Var, this) != d9nVar) {
                        rjp0Var = qpj0Var;
                    }
                } catch (Throwable th) {
                    rjp0Var2 = qpj0Var;
                    th = th;
                    fns fnsVar2 = igu.a;
                    bs50 bs50Var2 = pyf0.a.f;
                    geo0 geo0Var = geo0.b;
                    bs50Var2.getClass();
                    o8n o8nVarL = flo1.l(bs50Var2, geo0Var);
                    e3p0 e3p0Var2 = new e3p0(war0Var, rjp0Var2, (lnm) null, (byte) 21);
                    this.d = null;
                    this.c = null;
                    this.e = th;
                    this.b = (byte) 3;
                    if (fn31.Y(o8nVarL, e3p0Var2, this) != d9nVar) {
                        throw th;
                    }
                }
                return d9nVar;
            }
            if (b != 1) {
                if (b == 2) {
                    hm5.M(obj);
                    throw new KotlinNothingValueException();
                }
                if (b != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) this.e;
                hm5.M(obj);
                throw th2;
            }
            rjp0Var = (rjp0) this.c;
            hm5.M(obj);
            this.d = null;
            this.c = rjp0Var;
            this.b = (byte) 2;
            hap1.f(this);
            return d9nVar;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: Exception -> 0x002a, CancellationException -> 0x0146, PHI: r0 r7 r11
      0x008c: PHI (r0v22 java.lang.String) = (r0v35 java.lang.String), (r0v41 java.lang.String) binds: [B:30:0x0088, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r7v9 byte) = (r7v10 byte), (r7v0 byte) binds: [B:30:0x0088, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x008c: PHI (r11v12 java.lang.Object) = (r11v24 java.lang.Object), (r11v25 java.lang.Object) binds: [B:30:0x0088, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0146, Exception -> 0x002a, blocks: (B:29:0x0078, B:32:0x008c, B:44:0x012d, B:46:0x0135, B:37:0x009d, B:38:0x00a5, B:41:0x00bf, B:8:0x0025, B:11:0x002d, B:12:0x0032, B:15:0x003d), top: B:61:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[Catch: Exception -> 0x002a, CancellationException -> 0x0146, TryCatch #2 {CancellationException -> 0x0146, Exception -> 0x002a, blocks: (B:29:0x0078, B:32:0x008c, B:44:0x012d, B:46:0x0135, B:37:0x009d, B:38:0x00a5, B:41:0x00bf, B:8:0x0025, B:11:0x002d, B:12:0x0032, B:15:0x003d), top: B:61:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0135 A[Catch: Exception -> 0x002a, CancellationException -> 0x0146, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0146, Exception -> 0x002a, blocks: (B:29:0x0078, B:32:0x008c, B:44:0x012d, B:46:0x0135, B:37:0x009d, B:38:0x00a5, B:41:0x00bf, B:8:0x0025, B:11:0x002d, B:12:0x0032, B:15:0x003d), top: B:61:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[LOOP:0: B:19:0x0050->B:67:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0133 -> B:49:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0140 -> B:49:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0175 -> B:49:0x0143). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object h(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k1e0.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if (r0.emit(r3, r10) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r10.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L16
            p.hm5.M(r11)
            goto Lab
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L1c:
            java.lang.Object r1 = r10.c
            java.lang.String r1 = (java.lang.String) r1
            p.hm5.M(r11)
            goto L8d
        L24:
            p.hm5.M(r11)
            java.lang.Object r11 = r10.e
            p.kqt0 r11 = (p.kqt0) r11
            java.lang.String r11 = r11.b
            java.lang.String r1 = p.nzy.k(r11)
            java.lang.Object r11 = r10.f
            p.mqt0 r11 = (p.mqt0) r11
            p.kly0 r11 = r11.b
            java.lang.Object r11 = r11.get()
            p.kjw0 r11 = (p.kjw0) r11
            java.util.List r6 = java.util.Collections.singletonList(r1)
            r10.d = r0
            r10.c = r1
            r10.b = r3
            r11.getClass()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L53
            p.b7x r11 = p.b7x.a
            goto L8a
        L53:
            p.uu00 r7 = r11.a
            p.nec0 r8 = new p.nec0
            r9 = 12
            r8.<init>(r6, r9)
            p.kge r6 = p.flo1.k(r7, r8)
            p.q8n r7 = r11.b
            p.mr20 r6 = p.o4p1.r(r6, r7)
            p.c1v0 r7 = new p.c1v0
            r8 = 10
            r7.<init>(r6, r8)
            p.wzv0 r6 = new p.wzv0
            r6.<init>(r7, r3)
            p.m9r0 r3 = new p.m9r0
            r7 = 23
            r3.<init>(r6, r11, r7)
            p.q8t0 r11 = new p.q8t0
            r6 = 3
            r7 = 4
            r11.<init>(r6, r4, r7)
            p.lt20 r6 = new p.lt20
            r7 = 0
            r6.<init>(r3, r11, r7)
            java.lang.Object r11 = p.b5p1.i(r6, r10)
        L8a:
            if (r11 != r5) goto L8d
            goto Laa
        L8d:
            java.util.Map r11 = (java.util.Map) r11
            p.jqt0 r3 = new p.jqt0
            java.lang.Object r11 = r11.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L9b
            java.lang.String r11 = ""
        L9b:
            r3.<init>(r11)
            r10.d = r4
            r10.c = r4
            r10.b = r2
            java.lang.Object r10 = r0.emit(r3, r10)
            if (r10 != r5) goto Lab
        Laa:
            return r5
        Lab:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k1e0.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r9.collect(r2, r8) == r6) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            p.g1u0 r0 = (p.g1u0) r0
            java.lang.Object r1 = r8.d
            p.vr20 r1 = (p.vr20) r1
            byte r2 = r8.b
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            p.hm5.M(r9)
            goto L5a
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L1f:
            p.hm5.M(r9)
            goto L37
        L23:
            p.hm5.M(r9)
            p.v0u0 r9 = new p.v0u0
            r2 = 3
            r9.<init>(r5, r2)
            r8.d = r1
            r8.b = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r6) goto L37
            goto L59
        L37:
            p.uu00 r9 = r0.l
            java.lang.Object r2 = r8.e
            java.lang.String r2 = (java.lang.String) r2
            io.reactivex.rxjava3.core.Observable r9 = p.l0p1.i(r2, r9)
            p.ezc r9 = p.yoi1.g(r9)
            p.uqs0 r2 = new p.uqs0
            java.lang.Object r4 = r8.f
            p.x0u0 r4 = (p.x0u0) r4
            r7 = 4
            r2.<init>(r7, r4, r0, r1)
            r8.d = r5
            r8.b = r3
            java.lang.Object r8 = r9.collect(r2, r8)
            if (r8 != r6) goto L5a
        L59:
            return r6
        L5a:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k1e0.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r0.emit(r8, r7) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r7.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r8)
            goto L4f
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L1b:
            java.lang.Object r0 = r7.c
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r8)
            goto L42
        L23:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.e
            p.ytp0 r8 = (p.ytp0) r8
            java.lang.Object r8 = r8.e
            p.qns0 r8 = (p.qns0) r8
            java.lang.Object r1 = r7.f
            java.util.List r1 = (java.util.List) r1
            r7.d = r4
            r7.c = r0
            r7.b = r3
            r3 = 0
            java.lang.String r6 = "PreviewCard"
            java.lang.Object r8 = r8.a(r6, r1, r7, r3)
            if (r8 != r5) goto L42
            goto L4e
        L42:
            r7.d = r4
            r7.c = r4
            r7.b = r2
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r5) goto L4f
        L4e:
            return r5
        L4f:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k1e0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:117:0x0203  */
    /* JADX WARN: Code duplicated, block: B:120:0x0207  */
    /* JADX WARN: Code duplicated, block: B:125:0x021f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0223  */
    /* JADX WARN: Code duplicated, block: B:128:0x0226  */
    /* JADX WARN: Code duplicated, block: B:130:0x0229  */
    /* JADX WARN: Code duplicated, block: B:131:0x022c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0237  */
    /* JADX WARN: Code duplicated, block: B:138:0x023a  */
    /* JADX WARN: Code duplicated, block: B:139:0x023d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0243  */
    /* JADX WARN: Code duplicated, block: B:143:0x024e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0252  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02af  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    /* JADX WARN: Code duplicated, block: B:44:0x011d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:74:0x0170  */
    /* JADX WARN: Code duplicated, block: B:76:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0185  */
    /* JADX WARN: Code duplicated, block: B:81:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x019c  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b0  */
    private final Object o(Object obj) {
        Object objF;
        wsc0 wsc0Var;
        Object objS;
        ArrayList<yh90> arrayList;
        Iterator it;
        boolean z;
        boolean z2;
        String str;
        String str2;
        mq70 mq70Var;
        up70 up70VarA;
        boolean z3;
        String str3;
        String str4;
        int iOrdinal;
        String str5;
        String str6;
        String str7;
        String str8;
        long jU;
        yh90 jh90Var;
        io70 io70Var;
        yh90 yh90Var;
        ArrayList arrayList2;
        String str9;
        String str10;
        String str11;
        io70 io70Var2;
        io70 io70Var3;
        List list;
        ljw0 ljw0Var;
        ko7 ko7Var;
        List list2;
        List list3;
        Set set;
        Set set2;
        ArrayList arrayList3;
        yh90 yh90Var2;
        String str12;
        ytp0 ytp0Var = (ytp0) this.e;
        byte b = this.b;
        Object obj2 = null;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            rsc0 rsc0Var = (xrc0) ytp0Var.b;
            String str13 = (String) this.f;
            trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) ytp0Var.f, (g3d0) null, f46.S0(new orc0[]{yqc0.a, wqc0.a}), false, new rrc0(f46.S0(new dlc0[]{dlc0.d, dlc0.g})), hqz0.a, (prc0) null, 0, (List) null, 458);
            this.b = (byte) 1;
            objF = rsc0Var.f(str13, trc0Var, this);
            if (objF != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
            objF = obj;
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (ArrayList) this.d;
            wsc0 wsc0Var2 = (wsc0) this.c;
            hm5.M(obj);
            wsc0Var = wsc0Var2;
            objS = obj;
        }
        mmr0 mmr0Var = (mmr0) objS;
        set = (Set) mmr0Var.a;
        set2 = (Set) mmr0Var.b;
        String str14 = wsc0Var.f.b;
        arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        for (yh90 yh90VarA : arrayList) {
            if (!(yh90VarA instanceof yh90)) {
                yh90Var2 = yh90VarA;
                str12 = yh90Var2.a;
                if (set.contains(str12)) {
                    yh90VarA = yh90.a(yh90Var2, false, 3579);
                } else if (set2.contains(str12)) {
                    yh90VarA = yh90.a(yh90Var2, true, 2047);
                }
            }
            arrayList3.add(yh90VarA);
        }
        return new hey(str14, arrayList3);
        wsc0Var = (wsc0) ((py21) objF).d();
        List list4 = wsc0Var.e;
        ArrayList arrayList4 = new ArrayList();
        for (Iterator it2 = list4.iterator(); it2.hasNext(); it2 = it) {
            zuc0 zuc0Var = (zuc0) it2.next();
            Set set3 = s4b1.f;
            String str15 = zuc0Var.c;
            tu00 tu00Var = zuc0Var.q;
            blc0 blc0Var = uic.x(str15).c;
            blc0 blc0Var2 = blc0.ti;
            Object obj3 = obj2;
            if (blc0Var == blc0Var2 || blc0Var == blc0.Pg) {
                jo70 jo70VarA = tu00Var.a(jo70.class);
                xkk1 xkk1VarA = tu00Var.a(xkk1.class);
                pjw0 pjw0VarA = tu00Var.a(pjw0.class);
                zoy0 zoy0VarA = tu00Var.a(zoy0.class);
                hll hllVarA = tu00Var.a(hll.class);
                String str16 = jo70VarA != null ? jo70VarA.a : null;
                String str17 = str16 == null ? "" : str16;
                if (hllVarA == null || (list3 = hllVarA.b) == null) {
                    it = it2;
                } else {
                    it = it2;
                    z = list3.contains(ell.b);
                    if (zuc0Var.m || (blc0Var == blc0Var2 && z)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        str2 = "";
                    } else {
                        if (xkk1VarA != null || (mq70Var = xkk1VarA.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) {
                            str = null;
                        } else {
                            str = up70VarA.a.a;
                        }
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                    }
                    if (hllVarA != null || (list2 = hllVarA.b) == null) {
                        z3 = false;
                    } else {
                        List list5 = list2;
                        if ((list5 instanceof Collection) && list5.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it3 = list5.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    int iOrdinal2 = ((ell) it3.next()).ordinal();
                                    if (iOrdinal2 == 2 || iOrdinal2 == 3 || iOrdinal2 == 4) {
                                        z3 = true;
                                    }
                                } else {
                                    z3 = false;
                                }
                            }
                        }
                    }
                    if (pjw0VarA != null) {
                        ljw0Var = pjw0VarA.b;
                        if (ljw0Var instanceof ljw0) {
                            str3 = ljw0Var.a.a.a.a;
                        } else {
                            if (ljw0Var instanceof mjw0) {
                                eg.o();
                                return obj3;
                            }
                            ko7Var = ((mjw0) ljw0Var).a.c;
                            if (ko7Var != null) {
                                str3 = ko7Var.a.a.a;
                            } else {
                                str3 = null;
                            }
                        }
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    iOrdinal = blc0Var.ordinal();
                    if (iOrdinal != 844) {
                        String str18 = zuc0Var.c;
                        if (jo70VarA != null) {
                            str5 = jo70VarA.c;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str6 = "";
                        } else {
                            str6 = str5;
                        }
                        if (jo70VarA != null || (io70Var = jo70VarA.e) == null) {
                            str7 = null;
                        } else {
                            str7 = io70Var.a;
                        }
                        if (str7 == null) {
                            str8 = "";
                        } else {
                            str8 = str7;
                        }
                        if (hllVarA != null) {
                            jU = jfv.u(hllVarA.a, ngv.e);
                        } else {
                            jU = 0;
                        }
                        jh90Var = new jh90(str18, str17, str2, str8, str4, str6, z, z3, jU, zoy0VarA != null ? zoy0VarA.c : 0L);
                    } else {
                        if (iOrdinal == 926) {
                            eg.o();
                            return obj3;
                        }
                        if (jo70VarA != null || (list = jo70VarA.d) == null) {
                            arrayList2 = null;
                        } else {
                            List<ho70> list6 = list;
                            arrayList2 = new ArrayList(q7h.U(list6, 10));
                            for (ho70 ho70Var : list6) {
                                arrayList2.add(new xh90(ho70Var.b, ho70Var.a));
                            }
                        }
                        if (arrayList2 == null) {
                            arrayList2 = z6x.a;
                        }
                        ArrayList arrayList5 = arrayList2;
                        String str19 = zuc0Var.c;
                        if (jo70VarA != null || (io70Var3 = jo70VarA.e) == null) {
                            str9 = null;
                        } else {
                            str9 = io70Var3.b;
                        }
                        if (str9 == null) {
                            str10 = "";
                        } else {
                            str10 = str9;
                        }
                        if (jo70VarA != null || (io70Var2 = jo70VarA.e) == null) {
                            str11 = null;
                        } else {
                            str11 = io70Var2.a;
                        }
                        jh90Var = new yh90(str19, str17, str2, str10, str11 != null ? str11 : "", str4, z, z3, false, z2, arrayList5, false);
                    }
                    yh90Var = jh90Var;
                }
                if (zuc0Var.m) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (xkk1VarA != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                } else {
                    str2 = "";
                }
                if (hllVarA != null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (pjw0VarA != null) {
                    ljw0Var = pjw0VarA.b;
                    if (ljw0Var instanceof ljw0) {
                        str3 = ljw0Var.a.a.a.a;
                    } else {
                        if (ljw0Var instanceof mjw0) {
                            eg.o();
                            return obj3;
                        }
                        ko7Var = ((mjw0) ljw0Var).a.c;
                        if (ko7Var != null) {
                            str3 = ko7Var.a.a.a;
                        } else {
                            str3 = null;
                        }
                    }
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                iOrdinal = blc0Var.ordinal();
                if (iOrdinal != 844) {
                    String str110 = zuc0Var.c;
                    if (jo70VarA != null) {
                        str5 = jo70VarA.c;
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    if (jo70VarA != null) {
                        str7 = null;
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str8 = "";
                    } else {
                        str8 = str7;
                    }
                    if (hllVarA != null) {
                        jU = jfv.u(hllVarA.a, ngv.e);
                    } else {
                        jU = 0;
                    }
                    jh90Var = new jh90(str110, str17, str2, str8, str4, str6, z, z3, jU, zoy0VarA != null ? zoy0VarA.c : 0L);
                } else {
                    if (iOrdinal == 926) {
                        eg.o();
                        return obj3;
                    }
                    if (jo70VarA != null) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = z6x.a;
                    }
                    ArrayList arrayList6 = arrayList2;
                    String str111 = zuc0Var.c;
                    if (jo70VarA != null) {
                        str9 = null;
                    } else {
                        str9 = null;
                    }
                    if (str9 == null) {
                        str10 = "";
                    } else {
                        str10 = str9;
                    }
                    if (jo70VarA != null) {
                        str11 = null;
                    } else {
                        str11 = null;
                    }
                    jh90Var = new yh90(str111, str17, str2, str10, str11 != null ? str11 : "", str4, z, z3, false, z2, arrayList6, false);
                }
                yh90Var = jh90Var;
            } else {
                it = it2;
                yh90Var = null;
            }
            if (yh90Var != null) {
                arrayList4.add(yh90Var);
            }
            obj2 = obj3;
        }
        xd1 xd1Var = new xd1(ytp0Var, wsc0Var, arrayList4, (lnm) null, (byte) 18);
        this.c = wsc0Var;
        this.d = arrayList4;
        this.b = (byte) 2;
        objS = smo1.s(xd1Var, this);
        if (objS != d9nVar) {
            arrayList = arrayList4;
            mmr0 mmr0Var2 = (mmr0) objS;
            set = (Set) mmr0Var2.a;
            set2 = (Set) mmr0Var2.b;
            String str112 = wsc0Var.f.b;
            arrayList3 = new ArrayList(q7h.U(arrayList, 10));
            while (r1.hasNext()) {
                if (!(yh90VarA instanceof yh90)) {
                    yh90Var2 = yh90VarA;
                    str12 = yh90Var2.a;
                    if (set.contains(str12)) {
                        yh90VarA = yh90.a(yh90Var2, false, 3579);
                    } else if (set2.contains(str12)) {
                        yh90VarA = yh90.a(yh90Var2, true, 2047);
                    }
                }
                arrayList3.add(yh90VarA);
            }
            return new hey(str112, arrayList3);
        }
        return d9nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r2.emit(r1, r20) == r7) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.f
            p.kjm r1 = (p.kjm) r1
            java.lang.Object r2 = r0.d
            p.vr20 r2 = (p.vr20) r2
            byte r3 = r0.b
            r4 = 0
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L28
            if (r3 == r6) goto L22
            if (r3 != r5) goto L1c
            p.hm5.M(r21)
            goto Laf
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r4
        L22:
            p.hm5.M(r21)
            r3 = r21
            goto L87
        L28:
            p.hm5.M(r21)
            java.lang.Object r3 = r0.c
            p.r0s0 r3 = (p.r0s0) r3
            java.lang.Object r3 = r3.b
            p.vr51 r3 = (p.vr51) r3
            java.lang.Object r8 = r0.e
            p.vpu0 r8 = (p.vpu0) r8
            r0.d = r2
            r0.b = r6
            p.iqi0 r9 = r8.b
            java.util.List r9 = r9.f
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto Lb2
            r10 = 0
            java.lang.Object r9 = r9.get(r10)
            p.fji0 r9 = (p.fji0) r9
            java.lang.Object r3 = r3.b
            p.xy91 r3 = (p.xy91) r3
            p.qy91 r11 = new p.qy91
            p.x4i1 r12 = r9.a
            java.lang.String r12 = r12.b
            java.lang.String r13 = r8.c
            boolean r17 = p.u890.j(r12, r13)
            boolean r12 = r8.d
            p.wls0 r13 = r8.e
            p.wls0 r14 = p.wls0.f
            if (r13 != r14) goto L6b
            p.wls0 r13 = r9.f
            if (r13 != r14) goto L6b
            r19 = r6
            goto L6d
        L6b:
            r19 = r10
        L6d:
            p.x4i1 r6 = r9.a
            r18 = r12
            java.lang.String r12 = r6.b
            java.lang.String r13 = r6.a
            java.lang.String r14 = r8.c
            java.lang.String r15 = r6.e
            java.lang.String r6 = r6.h
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r3 = r3.b(r11, r0)
            if (r3 != r7) goto L87
            goto Lae
        L87:
            p.jhm r3 = (p.jhm) r3
            if (r3 != 0) goto L8c
            goto La4
        L8c:
            java.util.List r3 = java.util.Collections.singletonList(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r6 = r1.b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r3 = p.o7h.N0(r6, r3)
            p.igm r6 = r1.a
            boolean r1 = r1.c
            p.kjm r8 = new p.kjm
            r8.<init>(r6, r3, r1)
            r1 = r8
        La4:
            r0.d = r4
            r0.b = r5
            java.lang.Object r0 = r2.emit(r1, r0)
            if (r0 != r7) goto Laf
        Lae:
            return r7
        Laf:
            p.rih1 r0 = p.rih1.a
            return r0
        Lb2:
            java.lang.String r0 = "Missing member in members list."
            p.hhg1.n(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k1e0.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b3 A[LOOP:0: B:22:0x00ad->B:24:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[SYNTHETIC] */
    private final Object r(Object obj) {
        Object objF;
        wsc0 wsc0Var;
        Object objA;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        LinkedHashMap linkedHashMap;
        ctu0 ctu0Var = (ctu0) this.f;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            rsc0 rsc0Var = ctu0Var.a;
            String str = ctu0Var.c;
            trc0 trc0Var = ctu0.d;
            this.b = (byte) 1;
            objF = rsc0Var.f(str, trc0Var, this);
            if (objF != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
            objF = obj;
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList3 = (ArrayList) this.e;
            wsc0Var = (wsc0) this.d;
            ctu0 ctu0Var2 = (ctu0) this.c;
            hm5.M(obj);
            arrayList = arrayList3;
            ctu0Var = ctu0Var2;
            objA = obj;
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        kby kbyVar = wsc0Var.f;
        String str2 = kbyVar.b;
        String strA = kbyVar.d.a(1);
        String str3 = ctu0Var.c;
        Map map = kbyVar.q;
        String str4 = kbyVar.p;
        List list = kbyVar.z;
        arrayList2 = new ArrayList(q7h.U(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ll81) it.next()).a);
        }
        x7i1 x7i1Var = kbyVar.w;
        boolean z = kbyVar.D;
        boolean z2 = kbyVar.j;
        int i = wsc0Var.c;
        Map map2 = wsc0Var.j;
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new il51(arrayList, zBooleanValue, str2, strA, arrayList2, map, str4, x7i1Var, str3, z, z2, i, linkedHashMap.keySet());
        wsc0Var = (wsc0) ((py21) objF).d();
        List list2 = wsc0Var.e;
        ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((zuc0) it2.next()).c);
        }
        this.c = ctu0Var;
        this.d = wsc0Var;
        this.e = arrayList4;
        this.b = (byte) 2;
        trc0 trc0Var2 = ctu0.d;
        objA = ctu0Var.a(wsc0Var, this);
        if (objA != d9nVar) {
            arrayList = arrayList4;
            boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
            kby kbyVar2 = wsc0Var.f;
            String str5 = kbyVar2.b;
            String strA2 = kbyVar2.d.a(1);
            String str6 = ctu0Var.c;
            Map map3 = kbyVar2.q;
            String str7 = kbyVar2.p;
            List list3 = kbyVar2.z;
            arrayList2 = new ArrayList(q7h.U(list3, 10));
            it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ll81) it.next()).a);
            }
            x7i1 x7i1Var2 = kbyVar2.w;
            boolean z3 = kbyVar2.D;
            boolean z4 = kbyVar2.j;
            int i2 = wsc0Var.c;
            Map map4 = wsc0Var.j;
            linkedHashMap = new LinkedHashMap();
            while (r2.hasNext()) {
                if (((Number) entry.getValue()).intValue() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new il51(arrayList, zBooleanValue2, str5, strA2, arrayList2, map3, str7, x7i1Var2, str6, z3, z4, i2, linkedHashMap.keySet());
        }
        return d9nVar;
    }

    private final Object s(Object obj) throws Throwable {
        Throwable th;
        c0r c0rVar;
        Object obj2 = this.f;
        xe91 xe91Var = (xe91) obj2;
        j1v0 j1v0Var = (j1v0) this.e;
        ssw0 ssw0Var = (ssw0) this.d;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0rVar = (c0r) this.c;
                try {
                    hm5.M(obj);
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            c0rVar.dispose();
            throw th;
        }
        hm5.M(obj);
        Boolean boolValueOf = Boolean.valueOf(j1v0Var.a(xe91Var));
        this.d = ssw0Var;
        this.b = (byte) 1;
        if (ssw0Var.b(boolValueOf, this) == d9nVar) {
            return d9nVar;
        }
        l381 l381VarC = xe91Var.c();
        boolean zIsEmpty = l381VarC.b().b().isEmpty();
        rih1 rih1Var = rih1.a;
        if (zIsEmpty) {
            return rih1Var;
        }
        c0r c0rVarC = ((rzq) j1v0Var.c.d).c(l381VarC.b().a(rih1Var));
        try {
            fn31.T(ssw0Var, (o8n) null, 0, new elu0((Object) c0rVarC, (Object) ssw0Var, (Object) j1v0Var, obj2, (lnm) null, (byte) 3), 3);
            this.d = null;
            this.c = c0rVarC;
            this.b = (byte) 2;
            hap1.f(this);
            return d9nVar;
        } catch (Throwable th3) {
            th = th3;
            c0rVar = c0rVarC;
        }
    }

    private final Object t(Object obj) {
        Exception exc;
        Object obj2;
        String str = (String) this.e;
        k4v0 k4v0Var = (k4v0) this.c;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                xyc0 xyc0Var = k4v0Var.a;
                String str2 = (String) this.f;
                this.b = (byte) 1;
                xyc0 xyc0Var2 = xyc0Var;
                obj = c921.H(xyc0Var2.c, new qyc0(str, xyc0Var2, str2, (lnm) null, (byte) 0), this);
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
                obj2 = this.d;
                try {
                    hm5.M(obj);
                    return obj2;
                } catch (Exception e) {
                    exc = e;
                }
            }
            Logger.k("Episode access expiration failed: %s", new Object[]{exc.getMessage()});
            return obj2;
            if (((py21) obj) instanceof oy21) {
                try {
                    Completable completableA = k4v0Var.b.a(l1z.class, Collections.singletonList(str));
                    this.d = obj;
                    this.b = (byte) 2;
                    if (fc11.i(completableA, this) == d9nVar) {
                        return d9nVar;
                    }
                } catch (Exception e2) {
                    Object obj3 = obj;
                    exc = e2;
                    obj2 = obj3;
                }
            }
            return obj;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                k1e0 k1e0Var = new k1e0(this.e, obj2, lnmVar, (byte) 0);
                k1e0Var.d = obj;
                return k1e0Var;
            case 1:
                return new k1e0(this.e, obj2, lnmVar, (byte) 1);
            case 2:
                k1e0 k1e0Var2 = new k1e0((y2e0) obj2, lnmVar, (byte) 2);
                k1e0Var2.e = obj;
                return k1e0Var2;
            case 3:
                k1e0 k1e0Var3 = new k1e0(this.e, obj2, lnmVar, (byte) 3);
                k1e0Var3.d = obj;
                return k1e0Var3;
            case 4:
                k1e0 k1e0Var4 = new k1e0((o6e0) obj2, lnmVar, (byte) 4);
                k1e0Var4.d = obj;
                return k1e0Var4;
            case 5:
                k1e0 k1e0Var5 = new k1e0(this.c, this.e, obj2, lnmVar, (byte) 5);
                k1e0Var5.d = obj;
                return k1e0Var5;
            case 6:
                k1e0 k1e0Var6 = new k1e0(this.e, obj2, lnmVar, (byte) 6);
                k1e0Var6.d = obj;
                return k1e0Var6;
            case 7:
                k1e0 k1e0Var7 = new k1e0(this.e, obj2, lnmVar, (byte) 7);
                k1e0Var7.d = obj;
                return k1e0Var7;
            case 8:
                k1e0 k1e0Var8 = new k1e0(this.e, obj2, lnmVar, (byte) 8);
                k1e0Var8.c = obj;
                return k1e0Var8;
            case 9:
                k1e0 k1e0Var9 = new k1e0((jn7) obj2, lnmVar, (byte) 9);
                k1e0Var9.d = obj;
                return k1e0Var9;
            case 10:
                k1e0 k1e0Var10 = new k1e0((aje0) obj2, lnmVar, (byte) 10);
                k1e0Var10.d = obj;
                return k1e0Var10;
            case 11:
                return new k1e0((ven0) this.d, (ven0) this.e, (wrm0) obj2, lnmVar);
            case 12:
                k1e0 k1e0Var11 = new k1e0((kqi0) obj2, lnmVar, (byte) 12);
                k1e0Var11.e = obj;
                return k1e0Var11;
            case 13:
                k1e0 k1e0Var12 = new k1e0(this.c, this.e, obj2, lnmVar, (byte) 13);
                k1e0Var12.d = obj;
                return k1e0Var12;
            case 14:
                k1e0 k1e0Var13 = new k1e0(this.c, this.e, obj2, lnmVar, (byte) 14);
                k1e0Var13.d = obj;
                return k1e0Var13;
            case 15:
                k1e0 k1e0Var14 = new k1e0(this.e, obj2, lnmVar, (byte) 15);
                k1e0Var14.d = obj;
                return k1e0Var14;
            case 16:
                k1e0 k1e0Var15 = new k1e0((rok0) obj2, lnmVar, (byte) 16);
                k1e0Var15.d = obj;
                return k1e0Var15;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                jsq0 jsq0Var = jsq0.b;
                Object obj3 = this.d;
                ksq0 ksq0Var = ksq0.b;
                return new k1e0(obj3, (o95) this.c, (ven0) this.e, (ven0) obj2, lnmVar);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                k1e0 k1e0Var16 = new k1e0((war0) obj2, lnmVar, (byte) 18);
                k1e0Var16.d = obj;
                return k1e0Var16;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                k1e0 k1e0Var17 = new k1e0(this.e, obj2, lnmVar, (byte) 19);
                k1e0Var17.d = obj;
                return k1e0Var17;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                k1e0 k1e0Var18 = new k1e0(this.e, obj2, lnmVar, (byte) 20);
                k1e0Var18.d = obj;
                return k1e0Var18;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                k1e0 k1e0Var19 = new k1e0(this.e, obj2, lnmVar, (byte) 21);
                k1e0Var19.d = obj;
                return k1e0Var19;
            case 22:
                k1e0 k1e0Var20 = new k1e0(this.c, this.e, obj2, lnmVar, (byte) 22);
                k1e0Var20.d = obj;
                return k1e0Var20;
            case 23:
                k1e0 k1e0Var21 = new k1e0(this.e, obj2, lnmVar, (byte) 23);
                k1e0Var21.d = obj;
                return k1e0Var21;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new k1e0(this.e, obj2, lnmVar, (byte) 24);
            case 25:
                k1e0 k1e0Var22 = new k1e0(this.c, this.e, obj2, lnmVar, (byte) 25);
                k1e0Var22.d = obj;
                return k1e0Var22;
            case 26:
                return new k1e0((ctu0) obj2, lnmVar, (byte) 26);
            case 27:
                k1e0 k1e0Var23 = new k1e0(this.e, obj2, lnmVar, (byte) 27);
                k1e0Var23.d = obj;
                return k1e0Var23;
            case 28:
                return new k1e0(this.c, this.e, obj2, lnmVar, (byte) 28);
            default:
                return new k1e0(this.e, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((ujk0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zq90) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:306:0x0642  */
    /* JADX WARN: Code duplicated, block: B:307:0x0646  */
    /* JADX WARN: Code duplicated, block: B:313:0x0655  */
    /* JADX WARN: Code duplicated, block: B:325:0x067c A[PHI: r6 r8
      0x067c: PHI (r6v11 java.lang.Object) = (r6v10 java.lang.Object), (r6v13 java.lang.Object), (r6v13 java.lang.Object), (r6v18 java.lang.Object) binds: [B:324:0x0676, B:316:0x065a, B:317:0x065c, B:323:0x0674] A[DONT_GENERATE, DONT_INLINE]
      0x067c: PHI (r8v7 p.o6e0) = (r8v6 p.o6e0), (r8v5 p.o6e0), (r8v5 p.o6e0), (r8v8 p.o6e0) binds: [B:324:0x0676, B:316:0x065a, B:317:0x065c, B:323:0x0674] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:328:0x068b A[PHI: r0
      0x068b: PHI (r0v62 java.lang.Object) = (r0v61 java.lang.Object), (r0v83 java.lang.Object) binds: [B:326:0x0688, B:291:0x0605] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:330:0x0691  */
    /* JADX WARN: Code duplicated, block: B:333:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:360:0x073b  */
    /* JADX WARN: Code duplicated, block: B:397:0x0816  */
    /* JADX WARN: Code duplicated, block: B:432:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:491:0x0649 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x08f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x08dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0156  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v26 java.lang.Object, still in use, count: 2, list:
          (r3v26 java.lang.Object) from 0x063e: PHI (r3 I:??) = (r3v20 java.lang.Object), (r3v26 java.lang.Object) binds: [B:303:0x063d, B:497:0x063e] A[DONT_GENERATE, DONT_INLINE]
          (r3v26 java.lang.Object) from 0x0636: CHECK_CAST (p.p6e0) (r3v26 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k1e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1e0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1e0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1e0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1e0(ven0 ven0Var, ven0 ven0Var2, wrm0 wrm0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = wrm0Var;
    }
}
