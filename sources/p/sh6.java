package p;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.io.File;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sh6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public Object b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh6(Object obj, Object obj2, Object obj3, Object obj4, String str, Object obj5, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = str;
        this.t = obj5;
    }

    private final Object e(Object obj) {
        String strR0;
        sja1 sja1Var;
        File file;
        vgn0 vgn0Var;
        rih1 m231Var;
        File file2;
        String str;
        File file3;
        iqc iqcVar;
        String str2 = (String) this.t;
        sja1 sja1Var2 = (sja1) this.i;
        vgn0 vgn0Var2 = sja1Var2.f;
        znb0 znb0Var = sja1Var2.h;
        c9n c9nVar = (c9n) this.g;
        byte b = this.c;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str2.getBytes(nne.a));
                bArrDigest.getClass();
                strR0 = f46.r0(bArrDigest, hea1.T0, 30);
                File file4 = new File((File) znb0Var.getValue(), strR0);
                this.g = c9nVar;
                this.b = strR0;
                this.e = file4;
                this.d = vgn0Var2;
                this.f = sja1Var2;
                this.c = (byte) 1;
                if (vgn0Var2.a(this) != d9nVar) {
                    sja1Var = sja1Var2;
                    file = file4;
                    vgn0Var = vgn0Var2;
                }
                return d9nVar;
            }
            if (b == 1) {
                sja1Var = (sja1) this.f;
                vgn0 vgn0Var3 = (vgn0) this.d;
                file = (File) this.e;
                String str3 = (String) this.b;
                hm5.M(obj);
                vgn0Var = vgn0Var3;
                strR0 = str3;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sja1Var2 = (sja1) this.h;
                vgn0Var2 = (vgn0) this.f;
                file2 = (File) this.d;
                file3 = (File) this.e;
                str = (String) this.b;
                hm5.M(obj);
            }
            try {
                iqcVar = (iqc) sja1Var2.d().a.get(str);
                if (iqcVar != null || sja1Var2.e(iqcVar) || !file3.exists()) {
                    file2.renameTo(file3);
                    sja1Var2.d().a.put(str, new iqc(file3.length(), sja1Var2.c.b(), sja1Var2.c.b()));
                    sja1Var2.b();
                    sja1Var2.f();
                    return new e331(file3);
                }
                file2.delete();
                sja1Var2.d().a.put(str, new iqc(iqcVar.a, iqcVar.b, sja1Var2.c.b()));
                sja1Var2.f();
                return new e331(file3);
            } finally {
                vgn0Var2.c((Object) null);
            }
            iqc iqcVar2 = (iqc) sja1Var.d().a.get(strR0);
            if (iqcVar2 != null && !sja1Var.e(iqcVar2) && file.exists()) {
                sja1Var.d().a.put(strR0, new iqc(iqcVar2.a, iqcVar2.b, sja1Var.c.b()));
                sja1Var.f();
                e331 e331Var = new e331(file);
                vgn0Var.c((Object) null);
                return e331Var;
            }
            vgn0Var.c((Object) null);
            File file5 = new File((File) znb0Var.getValue(), f4i1.e(strR0, ".tmp"));
            try {
                sja1Var2.a(file5, str2);
                m231Var = rih1.a;
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            Throwable thA = e331.a(m231Var);
            if (thA != null) {
                file5.delete();
                return new e331(new m231(thA));
            }
            this.g = null;
            this.b = strR0;
            this.e = file;
            this.d = file5;
            this.f = vgn0Var2;
            this.h = sja1Var2;
            this.c = (byte) 2;
            if (vgn0Var2.a(this) != d9nVar) {
                file2 = file5;
                str = strR0;
                file3 = file;
                iqcVar = (iqc) sja1Var2.d().a.get(str);
                if (iqcVar != null) {
                }
                file2.renameTo(file3);
                sja1Var2.d().a.put(str, new iqc(file3.length(), sja1Var2.c.b(), sja1Var2.c.b()));
                sja1Var2.b();
                sja1Var2.f();
                return new e331(file3);
            }
            return d9nVar;
        } catch (Throwable th2) {
            vgn0Var.c((Object) null);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [p.lnm, p.sh6] */
    /* JADX WARN: Type inference failed for: r11v1, types: [p.lnm, p.sh6] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    private final Object g(Object obj) throws Throwable {
        vgn0 vgn0Var;
        Throwable th;
        vgn0 vgn0Var2;
        String str = (String) this.t;
        aqd1 aqd1Var = (aqd1) this.i;
        eqd1 eqd1Var = (eqd1) this.e;
        byte b = this.c;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                BluetoothDevice device = ((ScanResult) this.h).getDevice();
                eqd1Var.getClass();
                device.getAddress();
                eqd1Var.c = device.connectGatt(eqd1Var.a.getApplicationContext(), false, eqd1Var.g);
                mfe mfeVarB = k4p1.B(eqd1Var.b);
                bda1 bda1Var = new bda1(aqd1Var, (byte) 5);
                this.c = (byte) 1;
                if (mfeVarB.collect(bda1Var, (lnm) this) != d9nVar) {
                }
                return d9nVar;
            }
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    if (b != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aqd1Var = (aqd1) this.b;
                    str = (String) this.g;
                    vgn0Var = (vgn0) this.f;
                    th = (Throwable) this.d;
                    hm5.M(obj);
                    try {
                        aqd1Var.i.remove(str);
                        vgn0Var.c((Object) null);
                        eqd1Var.a();
                        throw th;
                    } catch (Throwable th2) {
                        vgn0Var.c((Object) null);
                        throw th2;
                    }
                }
                aqd1Var = (aqd1) this.g;
                str = (String) this.f;
                vgn0Var2 = (vgn0) this.d;
                hm5.M(obj);
            }
            try {
                aqd1Var.i.remove(str);
                vgn0Var2.c((Object) null);
                eqd1Var.a();
                return rih1.a;
            } catch (Throwable th3) {
                vgn0Var2.c((Object) null);
                throw th3;
            }
            vgn0 vgn0Var3 = aqd1Var.h;
            this.d = vgn0Var3;
            this.f = str;
            this.g = aqd1Var;
            this.c = (byte) 2;
            this = vgn0Var3.a((lnm) this);
            if (this != d9nVar) {
                vgn0Var2 = vgn0Var3;
                aqd1Var.i.remove(str);
                vgn0Var2.c((Object) null);
                eqd1Var.a();
                return rih1.a;
            }
        } catch (Throwable th4) {
            vgn0Var = aqd1Var.h;
            this.d = th4;
            this.f = vgn0Var;
            this.g = str;
            this.b = aqd1Var;
            this.c = (byte) 3;
            if (vgn0Var.a((lnm) this) != d9nVar) {
                th = th4;
            }
            return d9nVar;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    private final Object h(Object obj) {
        s2t s2tVarQ;
        ggj1 ggj1Var;
        dhe dheVar;
        String str = (String) this.i;
        fgj1 fgj1Var = (fgj1) this.h;
        c9n c9nVar = (c9n) this.d;
        byte b = this.c;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new vxg1((d0r) this.g, fgj1Var, str, (lnm) null, (byte) 16), 3);
            s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new vxg1((wh41) this.t, str, fgj1Var, (lnm) null, (byte) 15), 3);
            this.d = null;
            this.b = s2tVarQ;
            this.c = (byte) 1;
            obj = s2tVarQ2.Q(this);
            if (obj != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            s2tVarQ = (s2t) this.b;
            hm5.M(obj);
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ggj1Var = (ggj1) this.e;
            hm5.M(obj);
        }
        dheVar = (dhe) obj;
        if (dheVar != null) {
            return new igj1((dgj1) this.f, ggj1Var, dheVar.d);
        }
        return hgj1.a;
        ggj1 ggj1Var2 = (ggj1) obj;
        if (ggj1Var2 != null) {
            this.d = null;
            this.b = null;
            this.e = ggj1Var2;
            this.c = (byte) 2;
            Object objE = s2tVarQ.E(this);
            if (objE != d9nVar) {
                ggj1Var = ggj1Var2;
                obj = objE;
                dheVar = (dhe) obj;
                if (dheVar != null) {
                    return new igj1((dgj1) this.f, ggj1Var, dheVar.d);
                }
            }
            return d9nVar;
        }
        return hgj1.a;
    }

    private final Object i(Object obj) {
        s2t s2tVarQ;
        p811 p811Var;
        p811 p811Var2;
        gw70 gw70Var = (gw70) this.t;
        SceneTemplate.VideoEntity videoEntity = (SceneTemplate.VideoEntity) this.i;
        bju bjuVar = (bju) this.h;
        c9n c9nVar = (c9n) this.d;
        byte b = this.c;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                p811Var = (p811) this.e;
                s2tVarQ = (s2t) this.b;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811Var2 = (p811) this.e;
                hm5.M(obj);
            }
            p811Var2.a = obj;
            return rih1.a;
        }
        hm5.M(obj);
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new alj1(bjuVar, videoEntity, gw70Var, null, (byte) 0), 3);
        s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new alj1(bjuVar, videoEntity, gw70Var, null, (byte) 1), 3);
        p811Var = (p811) this.f;
        this.d = null;
        this.b = s2tVarQ;
        this.e = p811Var;
        this.c = (byte) 1;
        obj = s2tVarQ2.Q(this);
        if (obj != d9nVar) {
        }
        return d9nVar;
        p811Var.a = obj;
        p811 p811Var3 = (p811) this.g;
        this.d = null;
        this.b = null;
        this.e = p811Var3;
        this.c = (byte) 2;
        Object objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            obj = objE;
            p811Var2 = p811Var3;
            p811Var2.a = obj;
            return rih1.a;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:1: B:88:0x0186->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x018c A[Catch: all -> 0x01b6, TryCatch #3 {all -> 0x01b6, blocks: (B:61:0x01be, B:64:0x01d2, B:66:0x01da, B:68:0x01ec, B:70:0x01f8, B:53:0x0186, B:55:0x018c, B:60:0x01ba), top: B:88:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01be A[Catch: all -> 0x01b6, PHI: r1 r2 r6 r10
      0x01be: PHI (r1v12 p.uac) = (r1v6 p.uac), (r1v6 p.uac), (r1v14 p.uac), (r1v23 p.uac) binds: [B:71:0x0219, B:69:0x01f6, B:60:0x01ba, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r2v8 java.util.Map) = (r2v6 java.util.Map), (r2v6 java.util.Map), (r2v9 java.util.Map), (r2v17 java.util.Map) binds: [B:71:0x0219, B:69:0x01f6, B:60:0x01ba, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r6v9 p.hyl1) = (r6v26 p.hyl1), (r6v27 p.hyl1), (r6v28 p.hyl1), (r6v29 p.hyl1) binds: [B:71:0x0219, B:69:0x01f6, B:60:0x01ba, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r10v6 p.r261) = (r10v5 p.r261), (r10v5 p.r261), (r10v7 p.r261), (r10v16 p.r261) binds: [B:71:0x0219, B:69:0x01f6, B:60:0x01ba, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x01b6, blocks: (B:61:0x01be, B:64:0x01d2, B:66:0x01da, B:68:0x01ec, B:70:0x01f8, B:53:0x0186, B:55:0x018c, B:60:0x01ba), top: B:88:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d2 A[Catch: all -> 0x01b6, PHI: r1 r2 r6 r10 r11
      0x01d2: PHI (r1v6 p.uac) = (r1v12 p.uac), (r1v21 p.uac) binds: [B:62:0x01cf, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r2v6 java.util.Map) = (r2v8 java.util.Map), (r2v15 java.util.Map) binds: [B:62:0x01cf, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r6v8 p.hyl1) = (r6v30 p.hyl1), (r6v31 p.hyl1) binds: [B:62:0x01cf, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r10v5 p.r261) = (r10v6 p.r261), (r10v14 p.r261) binds: [B:62:0x01cf, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r11v10 java.lang.Object) = (r11v16 java.lang.Object), (r11v22 java.lang.Object) binds: [B:62:0x01cf, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x01b6, blocks: (B:61:0x01be, B:64:0x01d2, B:66:0x01da, B:68:0x01ec, B:70:0x01f8, B:53:0x0186, B:55:0x018c, B:60:0x01ba), top: B:88:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01da A[Catch: all -> 0x01b6, TryCatch #3 {all -> 0x01b6, blocks: (B:61:0x01be, B:64:0x01d2, B:66:0x01da, B:68:0x01ec, B:70:0x01f8, B:53:0x0186, B:55:0x018c, B:60:0x01ba), top: B:88:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec A[Catch: all -> 0x01b6, TryCatch #3 {all -> 0x01b6, blocks: (B:61:0x01be, B:64:0x01d2, B:66:0x01da, B:68:0x01ec, B:70:0x01f8, B:53:0x0186, B:55:0x018c, B:60:0x01ba), top: B:88:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01f6 -> B:61:0x01be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0219 -> B:61:0x01be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object j(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sh6.j(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.t;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                sh6 sh6Var = new sh6(this.h, obj2, obj3, lnmVar, (byte) 0);
                sh6Var.g = obj;
                return sh6Var;
            case 1:
                sh6 sh6Var2 = new sh6((byte) 1, (jo70) this.f, (d0r) this.g, (gq7) this.h, (String) obj2, (wh41) obj3, lnmVar);
                sh6Var2.d = obj;
                return sh6Var2;
            case 2:
                sh6 sh6Var3 = new sh6((rm9) this.e, (String) this.f, (String) this.g, (String) this.h, (String) obj2, (String) obj3, lnmVar, (byte) 2);
                sh6Var3.d = obj;
                return sh6Var3;
            case 3:
                sh6 sh6Var4 = new sh6(this.h, obj2, obj3, lnmVar, (byte) 3);
                sh6Var4.d = obj;
                return sh6Var4;
            case 4:
                sh6 sh6Var5 = new sh6((rjs0) this.e, (jh71) this.g, (p371) this.h, (o571) obj2, (u771) obj3, lnmVar);
                sh6Var5.f = obj;
                return sh6Var5;
            case 5:
                sh6 sh6Var6 = new sh6(this.h, obj2, obj3, lnmVar, (byte) 5);
                sh6Var6.d = obj;
                return sh6Var6;
            case 6:
                sh6 sh6Var7 = new sh6(this.h, obj2, obj3, lnmVar, (byte) 6);
                sh6Var7.d = obj;
                return sh6Var7;
            case 7:
                return new sh6((kf61) obj2, (qd61) obj3, lnmVar, (byte) 7);
            case 8:
                sh6 sh6Var8 = new sh6((uv61) this.h, this.g, this.i, (tv80) obj3, lnmVar);
                sh6Var8.f = obj;
                return sh6Var8;
            case 9:
                sh6 sh6Var9 = new sh6(this.h, obj2, obj3, lnmVar, (byte) 9);
                sh6Var9.d = obj;
                return sh6Var9;
            case 10:
                sh6 sh6Var10 = new sh6((sja1) obj2, (String) obj3, lnmVar, (byte) 10);
                sh6Var10.g = obj;
                return sh6Var10;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new sh6((eqd1) this.e, (ScanResult) this.h, (aqd1) obj2, (String) obj3, lnmVar);
            case grn1.d /* 12 */:
                sh6 sh6Var11 = new sh6((byte) 12, (dgj1) this.f, (d0r) this.g, (fgj1) this.h, (String) obj2, (wh41) obj3, lnmVar);
                sh6Var11.d = obj;
                return sh6Var11;
            case 13:
                sh6 sh6Var12 = new sh6((byte) 13, (p811) this.f, (p811) this.g, (bju) this.h, (SceneTemplate.VideoEntity) obj2, (gw70) obj3, lnmVar);
                sh6Var12.d = obj;
                return sh6Var12;
            case 14:
                sh6 sh6Var13 = new sh6(this.h, obj2, obj3, lnmVar, (byte) 14);
                sh6Var13.f = obj;
                return sh6Var13;
            default:
                sh6 sh6Var14 = new sh6((umn1) this.e, (fqn1) this.f, (sln1) this.g, (b1o1) this.h, (String) obj2, (yln1) obj3, lnmVar, (byte) 15);
                sh6Var14.d = obj;
                return sh6Var14;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f3 A[Catch: all -> 0x026c, TRY_LEAVE, TryCatch #3 {all -> 0x026c, blocks: (B:119:0x0265, B:150:0x02ed, B:152:0x02f3, B:124:0x0277, B:147:0x02d7, B:127:0x0283, B:144:0x02c6, B:140:0x02b0), top: B:395:0x0232 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0304  */
    /* JADX WARN: Code duplicated, block: B:156:0x0307  */
    /* JADX WARN: Code duplicated, block: B:159:0x030e  */
    /* JADX WARN: Code duplicated, block: B:193:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:196:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:199:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:200:0x0402  */
    /* JADX WARN: Code duplicated, block: B:203:0x0410  */
    /* JADX WARN: Code duplicated, block: B:204:0x0415  */
    /* JADX WARN: Code duplicated, block: B:206:0x041d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0422  */
    /* JADX WARN: Code duplicated, block: B:232:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:252:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:280:0x068c  */
    /* JADX WARN: Code duplicated, block: B:286:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:288:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: Exception -> 0x0026, zzhm -> 0x0108, TryCatch #4 {zzhm -> 0x0108, Exception -> 0x0026, blocks: (B:9:0x0021, B:14:0x002d, B:52:0x00f6, B:17:0x0039, B:40:0x00c4, B:42:0x00c8, B:44:0x00ce, B:46:0x00d4, B:48:0x00da, B:50:0x00e0, B:20:0x0049, B:38:0x00b2, B:23:0x0057, B:24:0x006b, B:26:0x0071, B:30:0x0086, B:32:0x008a, B:35:0x0093), top: B:397:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:337:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:338:0x07bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:340:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[Catch: Exception -> 0x0026, zzhm -> 0x0108, TryCatch #4 {zzhm -> 0x0108, Exception -> 0x0026, blocks: (B:9:0x0021, B:14:0x002d, B:52:0x00f6, B:17:0x0039, B:40:0x00c4, B:42:0x00c8, B:44:0x00ce, B:46:0x00d4, B:48:0x00da, B:50:0x00e0, B:20:0x0049, B:38:0x00b2, B:23:0x0057, B:24:0x006b, B:26:0x0071, B:30:0x0086, B:32:0x008a, B:35:0x0093), top: B:397:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:364:0x0869  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:389:0x0929  */
    /* JADX WARN: Code duplicated, block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8 A[Catch: Exception -> 0x0026, zzhm -> 0x0108, TryCatch #4 {zzhm -> 0x0108, Exception -> 0x0026, blocks: (B:9:0x0021, B:14:0x002d, B:52:0x00f6, B:17:0x0039, B:40:0x00c4, B:42:0x00c8, B:44:0x00ce, B:46:0x00d4, B:48:0x00da, B:50:0x00e0, B:20:0x0049, B:38:0x00b2, B:23:0x0057, B:24:0x006b, B:26:0x0071, B:30:0x0086, B:32:0x008a, B:35:0x0093), top: B:397:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:430:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:440:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4 A[Catch: Exception -> 0x0026, zzhm -> 0x0108, TryCatch #4 {zzhm -> 0x0108, Exception -> 0x0026, blocks: (B:9:0x0021, B:14:0x002d, B:52:0x00f6, B:17:0x0039, B:40:0x00c4, B:42:0x00c8, B:44:0x00ce, B:46:0x00d4, B:48:0x00da, B:50:0x00e0, B:20:0x0049, B:38:0x00b2, B:23:0x0057, B:24:0x006b, B:26:0x0071, B:30:0x0086, B:32:0x008a, B:35:0x0093), top: B:397:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0 A[Catch: Exception -> 0x0026, zzhm -> 0x0108, TryCatch #4 {zzhm -> 0x0108, Exception -> 0x0026, blocks: (B:9:0x0021, B:14:0x002d, B:52:0x00f6, B:17:0x0039, B:40:0x00c4, B:42:0x00c8, B:44:0x00ce, B:46:0x00d4, B:48:0x00da, B:50:0x00e0, B:20:0x0049, B:38:0x00b2, B:23:0x0057, B:24:0x006b, B:26:0x0071, B:30:0x0086, B:32:0x008a, B:35:0x0093), top: B:397:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:281:0x06a2 -> B:283:0x06a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v20 java.lang.Object, still in use, count: 2, list:
          (r8v20 java.lang.Object) from 0x0086: PHI (r8 I:??) = (r8v17 java.lang.Object), (r8v20 java.lang.Object) binds: [B:29:0x0085, B:28:0x0084] A[DONT_GENERATE, DONT_INLINE]
          (r8v20 java.lang.Object) from 0x0076: CHECK_CAST (p.vmn1) (r8v20 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 2390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sh6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh6(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.t = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh6(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.h = obj;
        this.i = obj2;
        this.t = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh6(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.i = obj;
        this.t = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh6(rjs0 rjs0Var, jh71 jh71Var, p371 p371Var, o571 o571Var, u771 u771Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.e = rjs0Var;
        this.g = jh71Var;
        this.h = p371Var;
        this.i = o571Var;
        this.t = u771Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh6(uv61 uv61Var, Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.h = uv61Var;
        this.g = obj;
        this.i = obj2;
        this.t = tv80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh6(eqd1 eqd1Var, ScanResult scanResult, aqd1 aqd1Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.e = eqd1Var;
        this.h = scanResult;
        this.i = aqd1Var;
        this.t = str;
    }
}
