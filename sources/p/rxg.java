package p;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rxg extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rxg(maa maaVar, byte b) {
        super(5);
        this.a = b;
        this.b = maaVar;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0345  */
    /* JADX WARN: Code duplicated, block: B:127:0x034f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0359  */
    /* JADX WARN: Code duplicated, block: B:134:0x0364  */
    /* JADX WARN: Code duplicated, block: B:137:0x0374  */
    /* JADX WARN: Code duplicated, block: B:140:0x0384  */
    /* JADX WARN: Code duplicated, block: B:143:0x0395  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x0421  */
    /* JADX WARN: Code duplicated, block: B:159:0x0467  */
    /* JADX WARN: Code duplicated, block: B:161:0x0470  */
    /* JADX WARN: Code duplicated, block: B:163:0x047a  */
    /* JADX WARN: Code duplicated, block: B:166:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:168:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:169:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:172:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:174:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:175:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:187:0x0550  */
    /* JADX WARN: Code duplicated, block: B:190:0x0589  */
    /* JADX WARN: Code duplicated, block: B:192:0x0592  */
    /* JADX WARN: Code duplicated, block: B:193:0x0596  */
    /* JADX WARN: Code duplicated, block: B:196:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:198:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:199:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:202:0x063f  */
    /* JADX WARN: Code duplicated, block: B:204:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:207:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:209:0x0703  */
    /* JADX WARN: Code duplicated, block: B:210:0x0707  */
    /* JADX WARN: Code duplicated, block: B:213:0x0718  */
    /* JADX WARN: Code duplicated, block: B:215:0x073b  */
    /* JADX WARN: Code duplicated, block: B:217:0x0742  */
    /* JADX WARN: Code duplicated, block: B:218:0x0746  */
    /* JADX WARN: Code duplicated, block: B:220:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:222:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:228:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:230:0x07d9 A[PHI: r2 r16
      0x07d9: PHI (r2v57 int) = (r2v54 int), (r2v58 int) binds: [B:229:0x07d7, B:227:0x07cc] A[DONT_GENERATE, DONT_INLINE]
      0x07d9: PHI (r16v19 p.llj) = (r16v17 p.llj), (r16v21 p.llj) binds: [B:229:0x07d7, B:227:0x07cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:231:0x07db  */
    /* JADX WARN: Code duplicated, block: B:234:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:237:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:238:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:243:0x085e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0861  */
    /* JADX WARN: Code duplicated, block: B:250:0x086e  */
    /* JADX WARN: Code duplicated, block: B:255:0x087e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0889  */
    /* JADX WARN: Code duplicated, block: B:266:0x0895  */
    /* JADX WARN: Code duplicated, block: B:272:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:274:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:276:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:278:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:280:0x0903  */
    /* JADX WARN: Code duplicated, block: B:281:0x0907  */
    /* JADX WARN: Code duplicated, block: B:284:0x0920  */
    /* JADX WARN: Code duplicated, block: B:286:0x0923  */
    /* JADX WARN: Code duplicated, block: B:288:0x092e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0932  */
    /* JADX WARN: Code duplicated, block: B:292:0x093b  */
    /* JADX WARN: Code duplicated, block: B:299:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:301:0x09a6 A[PHI: r4
      0x09a6: PHI (r4v39 int) = (r4v37 int), (r4v41 int) binds: [B:300:0x09a4, B:298:0x099d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:302:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:305:0x09af  */
    /* JADX WARN: Code duplicated, block: B:308:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:312:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:314:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:315:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:317:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:319:0x0a3c  */
    /* JADX WARN: Code duplicated, block: B:321:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:324:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:338:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:341:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:344:0x0af5  */
    /* JADX WARN: Code duplicated, block: B:345:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:348:0x0b00 A[PHI: r5 r41
      0x0b00: PHI (r5v32 p.rph) = (r5v30 p.rph), (r5v33 p.rph) binds: [B:347:0x0afe, B:344:0x0af5] A[DONT_GENERATE, DONT_INLINE]
      0x0b00: PHI (r41v9 p.llj) = (r41v7 p.llj), (r41v10 p.llj) binds: [B:347:0x0afe, B:344:0x0af5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:349:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:352:0x0b0b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:353:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:356:0x0b3d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:359:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:362:0x0b74 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:363:0x0b76  */
    /* JADX WARN: Code duplicated, block: B:365:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:368:0x0bbe  */
    /* JADX WARN: Code duplicated, block: B:369:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:371:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:382:0x0c5e  */
    /* JADX WARN: Code duplicated, block: B:385:0x0cab  */
    /* JADX WARN: Code duplicated, block: B:388:0x0cbd  */
    /* JADX WARN: Code duplicated, block: B:390:0x0ccf  */
    /* JADX WARN: Code duplicated, block: B:393:0x0cf6  */
    /* JADX WARN: Code duplicated, block: B:395:0x0cfd  */
    /* JADX WARN: Code duplicated, block: B:397:0x0d05  */
    /* JADX WARN: Code duplicated, block: B:399:0x0d29  */
    /* JADX WARN: Code duplicated, block: B:401:0x0d2e  */
    /* JADX WARN: Code duplicated, block: B:404:0x0d3d  */
    /* JADX WARN: Code duplicated, block: B:406:0x0d42  */
    /* JADX WARN: Code duplicated, block: B:408:0x0d48  */
    /* JADX WARN: Code duplicated, block: B:410:0x0d4e  */
    /* JADX WARN: Code duplicated, block: B:412:0x0d54  */
    /* JADX WARN: Code duplicated, block: B:414:0x0d5a  */
    /* JADX WARN: Code duplicated, block: B:416:0x035d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v77 */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Throwable {
        Object obj6;
        vu30 vu30Var;
        Function0 function0;
        ArrayList arrayListZ;
        boolean z;
        qmy qmyVar;
        qmy qmyVar2;
        List list;
        List list2;
        Iterator it;
        pkh pkhVar;
        boolean z2;
        Object objT;
        ven0 ven0Var;
        Object objT2;
        ven0 ven0Var2;
        Object objT3;
        ven0 ven0Var3;
        Object objT4;
        bs91 bs91Var;
        Object objT5;
        zph zphVar;
        boolean zI;
        Object objT6;
        xmh xmhVar;
        ven0 ven0Var4;
        ven0 ven0Var5;
        ven0 ven0Var6;
        bs91 bs91Var2;
        zph zphVar2;
        int i;
        ven0 ven0VarS;
        boolean zI2;
        Object objT7;
        jqh jqhVar;
        gra graVar;
        boolean z3;
        gfh0 gfh0VarC;
        bs91 bs91Var3;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Function0 function1;
        ven0 ven0Var7;
        vu30 vu30Var2;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        xmh xmhVar2;
        ven0 ven0Var8;
        f36 f36Var;
        ven0 ven0Var9;
        mbh mbhVarA;
        int iHashCode2;
        xos0 xos0VarM2;
        qim0 qim0VarE2;
        gfh0 gfh0VarC2;
        int iHashCode3;
        xos0 xos0VarM3;
        qim0 qim0VarE3;
        h2c h2cVar;
        int i2;
        boolean z4;
        Object objT8;
        int i3;
        tl3 tl3Var;
        Object obj7;
        gfh0 gfh0VarC3;
        int iHashCode4;
        xos0 xos0VarM4;
        qim0 qim0VarE4;
        mbh mbhVarA2;
        int iHashCode5;
        xos0 xos0VarM5;
        qim0 qim0VarE5;
        ?? r10;
        gfh0 gfh0VarC4;
        int iHashCode6;
        xos0 xos0VarM6;
        qim0 qim0VarE6;
        rph rphVar;
        iu30 iu30Var;
        llj lljVar4;
        int i4;
        boolean z5;
        Object objT9;
        Object obj8;
        Object obj9;
        int i5;
        llj lljVar5;
        Object obj10;
        xmh xmhVar3;
        ?? r14;
        ace0 ace0Var;
        ebe0 ebe0Var;
        tuw tuwVar;
        ?? r4;
        ?? r6;
        String strQ;
        String strA;
        Throwable th;
        rph rphVar2;
        b0k b0kVar;
        rih1 rih1Var;
        int i6;
        llj lljVar6;
        Object obj11;
        int i7;
        boolean z6;
        Object objT10;
        gfh0 gfh0VarC5;
        int iHashCode7;
        xos0 xos0VarM7;
        qim0 qim0VarE7;
        boolean z7;
        Object objT11;
        Throwable th2;
        llj lljVar7;
        Object objT12;
        ven0 ven0Var10;
        ven0 ven0Var11;
        ven0 ven0Var12;
        boolean zI3;
        Object objT13;
        boolean z8;
        boolean z9;
        Object objT14;
        boolean zI4;
        Object objT15;
        boolean zI5;
        Object objT16;
        jw31 jw31VarA;
        int iHashCode8;
        xos0 xos0VarM8;
        qim0 qim0VarE8;
        int iP;
        int i8;
        boolean z10;
        Object objT17;
        gfh0 gfh0VarC6;
        int iHashCode9;
        xos0 xos0VarM9;
        qim0 qim0VarE9;
        ijh ijhVar;
        gfh0 gfh0VarC7;
        int iHashCode10;
        xos0 xos0VarM10;
        qim0 qim0VarE10;
        llj lljVar8 = y580.Y;
        llj lljVar9 = y580.R0;
        llj lljVar10 = y580.N0;
        vu30 vu30Var3 = y580.O0;
        rph rphVar3 = (rph) obj2;
        iu30 iu30Var2 = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        tl3 tl3Var2 = een.h;
        boolean z11 = rphVar3.n;
        m7 m7Var = rphVar3.q;
        ebe0 ebe0Var2 = rphVar3.c;
        boolean z12 = rphVar3.s;
        Comment comment = rphVar3.p;
        ace0 ace0Var2 = rphVar3.b;
        xmh xmhVar4 = this.b;
        b0k b0kVar2 = (x340) ((b0k) obj4);
        Object objT18 = b0kVar2.T();
        j06 j06Var = ((x340) b0kVar2).a;
        m4c m4cVar = fkj0.X;
        if (objT18 == m4cVar) {
            yqg yqgVar = xmhVar4.a;
            hwe1 hwe1Var = xmhVar4.b;
            xjh xjhVar = xmhVar4.d;
            objT18 = new oih(yqgVar, hwe1Var, xjhVar, new gal(yqgVar, xjhVar, (byte) 3), xmhVar4.e);
            b0kVar2.s0(objT18);
        }
        oih oihVar = (oih) objT18;
        boolean zC = rphVar3.c();
        nim0 nim0Var = nim0.a;
        rih1 rih1Var2 = rih1.a;
        Function0 function2 = hmb0.t1;
        if (!zC) {
            b0kVar2.i0(-94696807);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC8 = t1c.c(tl3Var2, false);
            int iHashCode11 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM11 = b0kVar2.m();
            qim0 qim0VarE11 = zr7.E(b0kVar2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC8, b0kVar2, vu30Var3);
            nko1.H(xos0VarM11, b0kVar2, lljVar10);
            x0d.q(iHashCode11, b0kVar2, lljVar9, b0kVar2);
            nko1.H(qim0VarE11, b0kVar2, lljVar8);
            uwr uwrVar = cbx.a;
            xto1.e((qim0) null, 0, cbx.a(b0kVar2).b.a, 0L, b0kVar2, 0, 11);
            b0kVar2.r(true);
            b0kVar2.r(false);
            return rih1Var2;
        }
        b0kVar2.i0(-94506529);
        b0kVar2.r(false);
        ebe0 ebe0Var3 = ebe0Var2 instanceof ebe0 ? ebe0Var2 : null;
        qmy qmyVar3 = ebe0Var3 != null ? (qmy) ebe0Var3.a : null;
        boolean zG = b0kVar2.g(ace0Var2) | b0kVar2.g(m7Var) | b0kVar2.g(ebe0Var2) | b0kVar2.h(z11) | b0kVar2.g(rphVar3.m);
        Object objT19 = b0kVar2.T();
        if (!zG) {
            obj6 = m4cVar;
            if (objT19 != obj6) {
                lljVar8 = lljVar8;
                lljVar9 = lljVar9;
                lljVar10 = lljVar10;
                vu30Var = vu30Var3;
                ace0Var2 = ace0Var2;
                function0 = function2;
            }
            list = (List) objT19;
            list2 = list;
            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        pkhVar = (pkh) it.next();
                        if (!(pkhVar instanceof ekh) || (pkhVar instanceof jkh)) {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                }
            } else {
                z2 = false;
            }
            objT = b0kVar2.T();
            if (objT == obj6) {
                objT = v8r.q((Object) null);
                b0kVar2.s0(objT);
            }
            ven0Var = (ven0) objT;
            objT2 = b0kVar2.T();
            if (objT2 == obj6) {
                objT2 = v8r.q((Object) null);
                b0kVar2.s0(objT2);
            }
            ven0Var2 = (ven0) objT2;
            objT3 = b0kVar2.T();
            if (objT3 == obj6) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar2.s0(objT3);
            }
            ven0Var3 = (ven0) objT3;
            objT4 = b0kVar2.T();
            if (objT4 == obj6) {
                objT4 = new bs91();
                b0kVar2.s0(objT4);
            }
            bs91Var = (bs91) objT4;
            objT5 = b0kVar2.T();
            if (objT5 == obj6) {
                objT5 = new zph();
                b0kVar2.s0(objT5);
            }
            zphVar = (zph) objT5;
            zI = b0kVar2.i(xmhVar4) | b0kVar2.i(ven0Var) | b0kVar2.i(ven0Var3) | b0kVar2.i(ven0Var2) | b0kVar2.i(bs91Var) | b0kVar2.i(zphVar);
            objT6 = b0kVar2.T();
            if (!zI || objT6 == obj6) {
                objT6 = new ae1((Object) xmhVar4, (Object) ven0Var, (Object) ven0Var3, (Object) ven0Var2, (Object) bs91Var, (Object) zphVar, (lnm) null, (byte) 4);
                xmhVar = xmhVar4;
                ven0Var4 = ven0Var;
                ven0Var5 = ven0Var3;
                ven0Var6 = ven0Var2;
                bs91Var2 = bs91Var;
                zphVar2 = zphVar;
                b0kVar2.s0(objT6);
            } else {
                bs91Var2 = bs91Var;
                zphVar2 = zphVar;
                ven0Var6 = ven0Var2;
                ven0Var5 = ven0Var3;
                ven0Var4 = ven0Var;
                xmhVar = xmhVar4;
            }
            qxd0.t(rih1Var2, b0kVar2, (vu30) objT6);
            i = (iIntValue >> 3) & 14;
            ven0VarS = v8r.s(rphVar3, b0kVar2);
            zI2 = b0kVar2.i(ven0VarS) | b0kVar2.i(xmhVar);
            objT7 = b0kVar2.T();
            if (zI2 || objT7 == obj6) {
                objT7 = new w9f(ven0VarS, xmhVar, (byte) 24);
                b0kVar2.s0(objT7);
            }
            qxd0.i(rih1Var2, (iu30) objT7, b0kVar2);
            qim0 qim0VarY = voo1.y(voo1.y(u291.d(nim0Var, 1.0f), voo1.f), voo1.g);
            jqhVar = xmhVar.h;
            graVar = een.d;
            z3 = z2;
            gfh0VarC = t1c.c(graVar, false);
            bs91Var3 = bs91Var2;
            iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM = b0kVar2.m();
            qim0VarE = zr7.E(b0kVar2, qim0VarY);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                function1 = function0;
                b0kVar2.l(function1);
            } else {
                function1 = function0;
                b0kVar2.v0();
            }
            ven0Var7 = ven0Var5;
            vu30Var2 = vu30Var;
            nko1.H(gfh0VarC, b0kVar2, vu30Var2);
            lljVar = lljVar10;
            nko1.H(xos0VarM, b0kVar2, lljVar);
            lljVar2 = lljVar9;
            x0d.q(iHashCode, b0kVar2, lljVar2, b0kVar2);
            lljVar3 = lljVar8;
            nko1.H(qim0VarE, b0kVar2, lljVar3);
            xmhVar2 = xmhVar;
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            era eraVar = een.P0;
            ven0Var8 = ven0Var6;
            f36Var = h36.c;
            ven0Var9 = ven0Var4;
            mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
            iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM2 = b0kVar2.m();
            qim0VarE2 = zr7.E(b0kVar2, qim0VarD2);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, vu30Var2);
            nko1.H(xos0VarM2, b0kVar2, lljVar);
            x0d.q(iHashCode2, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar3);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gfh0VarC2 = t1c.c(graVar, false);
            iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM3 = b0kVar2.m();
            qim0VarE3 = zr7.E(b0kVar2, qim0VarF);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, vu30Var2);
            nko1.H(xos0VarM3, b0kVar2, lljVar);
            x0d.q(iHashCode3, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar3);
            gra graVar2 = een.g;
            h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(nim0Var, graVar2);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarX = uyn1.x(qim0VarA, 4.0f);
            mta mtaVar = cbx.b(b0kVar2).d;
            qim0 qim0VarR = u291.r(qim0VarX, 48.0f);
            i2 = (iIntValue & 896) ^ 384;
            z4 = (i2 <= 256 && b0kVar2.g(iu30Var2)) || (iIntValue & 384) == 256;
            objT8 = b0kVar2.T();
            if (z4 || objT8 == obj6) {
                objT8 = new thh(iu30Var2, (byte) 10);
                b0kVar2.s0(objT8);
            }
            qim0 qim0VarX2 = bin.x(qim0VarR, false, (String) null, (pm31) null, (idn0) null, (Function0) objT8, 15);
            i3 = iIntValue;
            tl3Var = tl3Var2;
            obj7 = obj6;
            gfh0VarC3 = t1c.c(tl3Var, false);
            iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM4 = b0kVar2.m();
            qim0VarE4 = zr7.E(b0kVar2, qim0VarX2);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC3, b0kVar2, vu30Var2);
            nko1.H(xos0VarM4, b0kVar2, lljVar);
            x0d.q(iHashCode4, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar3);
            w0h1.a(mlx.c, new jsl(cwl1.o0(b0kVar2, 2131953951)), (qim0) null, 0L, 0L, false, b0kVar2, mlx.d, 60);
            b0kVar2.r(true);
            qim0 qim0VarZ = uyn1.z(56.0f, 0.0f, 2, h2cVar.a(nim0Var, tl3Var));
            mbhVarA2 = jbh.a(f36Var, een.Q0, b0kVar2, 0);
            iHashCode5 = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM5 = b0kVar2.m();
            qim0VarE5 = zr7.E(b0kVar2, qim0VarZ);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, vu30Var2);
            nko1.H(xos0VarM5, b0kVar2, lljVar);
            x0d.q(iHashCode5, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE5, b0kVar2, lljVar3);
            uwo1.e(cwl1.o0(b0kVar2, 2131954139), (qim0) null, cbx.d(b0kVar2).h, 0L, a0e1.a(), (iu30) null, 0, false, new zic0(1), 0, (qx8) null, b0kVar2, 0, 0, 1770);
            if (qmyVar3 != 0) {
                b0kVar2.i0(679023465);
                qmy qmyVar4 = qmyVar3;
                uwo1.e(qmyVar4.a, (qim0) null, cbx.d(b0kVar2).m, cbx.a(b0kVar2).b.b, a0e1.a(), (iu30) null, 2, false, new zic0(1), 0, (qx8) null, b0kVar2, 0, 0, 1698);
                b0kVar2 = b0kVar2;
                uwo1.e(cwl1.n0(2131959572, new Object[]{qmyVar4.b, qmyVar4.c}, b0kVar2), (qim0) null, cbx.d(b0kVar2).m, cbx.a(b0kVar2).b.b, a0e1.a(), (iu30) null, 2, false, new zic0(1), 0, (qx8) null, b0kVar2, 0, 0, 1698);
                r10 = 0;
                b0kVar2.r(false);
            } else {
                r10 = 0;
                b0kVar2.i0(679851847);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            b0kVar2.r(true);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            rqo1.g((int) r10, 1, b0kVar2, (qim0) null);
            qim0 qim0VarF2 = u291.f(new wnb0(1.0f, true), 1.0f);
            gfh0VarC4 = t1c.c(graVar, (boolean) r10);
            iHashCode6 = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM6 = b0kVar2.m();
            qim0VarE6 = zr7.E(b0kVar2, qim0VarF2);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC4, b0kVar2, vu30Var2);
            nko1.H(xos0VarM6, b0kVar2, lljVar);
            x0d.q(iHashCode6, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE6, b0kVar2, lljVar3);
            if (z3) {
                b0kVar2.i0(2102465900);
                xtb0 xtb0VarA = aub0.a(0, b0kVar2, 3);
                rphVar = rphVar3;
                p8p1.c(rphVar, xtb0VarA, b0kVar2, i);
                if (i2 > 256 || !b0kVar2.g(iu30Var)) {
                    iu30Var = iu30Var2;
                    iu30Var = iu30Var2;
                    lljVar4 = lljVar;
                    i4 = i3;
                    if ((i4 & 384) != 256) {
                        z5 = false;
                    }
                    objT9 = b0kVar2.T();
                    if (z5) {
                        obj8 = obj7;
                    } else {
                        obj8 = obj7;
                        if (objT9 != obj8) {
                            obj9 = obj8;
                        }
                        b0k b0kVar3 = b0kVar2;
                        i3 = i4;
                        i5 = i2;
                        lljVar5 = lljVar4;
                        obj10 = obj9;
                        xmhVar3 = xmhVar2;
                        r14 = 0;
                        t8p1.d(zphVar2, xtb0VarA, (Function0) objT9, apo.r(868563646, new jb1(list, xmhVar3, oihVar, xtb0VarA, iu30Var, (byte) 9), b0kVar3), b0kVar3, 3072);
                        b0kVar2 = b0kVar3;
                        b0kVar2.r(false);
                    }
                    obj9 = obj8;
                    objT9 = new thh(iu30Var, (byte) 11);
                    b0kVar2.s0(objT9);
                    b0k b0kVar4 = b0kVar2;
                    i3 = i4;
                    i5 = i2;
                    lljVar5 = lljVar4;
                    obj10 = obj9;
                    xmhVar3 = xmhVar2;
                    r14 = 0;
                    t8p1.d(zphVar2, xtb0VarA, (Function0) objT9, apo.r(868563646, new jb1(list, xmhVar3, oihVar, xtb0VarA, iu30Var, (byte) 9), b0kVar4), b0kVar4, 3072);
                    b0kVar2 = b0kVar4;
                    b0kVar2.r(false);
                } else {
                    iu30Var = iu30Var2;
                    lljVar4 = lljVar;
                    i4 = i3;
                }
                z5 = true;
                objT9 = b0kVar2.T();
                if (z5) {
                    obj8 = obj7;
                    if (objT9 != obj8) {
                        obj9 = obj8;
                    }
                    b0k b0kVar5 = b0kVar2;
                    i3 = i4;
                    i5 = i2;
                    lljVar5 = lljVar4;
                    obj10 = obj9;
                    xmhVar3 = xmhVar2;
                    r14 = 0;
                    t8p1.d(zphVar2, xtb0VarA, (Function0) objT9, apo.r(868563646, new jb1(list, xmhVar3, oihVar, xtb0VarA, iu30Var, (byte) 9), b0kVar5), b0kVar5, 3072);
                    b0kVar2 = b0kVar5;
                    b0kVar2.r(false);
                } else {
                    obj8 = obj7;
                }
                obj9 = obj8;
                objT9 = new thh(iu30Var, (byte) 11);
                b0kVar2.s0(objT9);
                b0k b0kVar6 = b0kVar2;
                i3 = i4;
                i5 = i2;
                lljVar5 = lljVar4;
                obj10 = obj9;
                xmhVar3 = xmhVar2;
                r14 = 0;
                t8p1.d(zphVar2, xtb0VarA, (Function0) objT9, apo.r(868563646, new jb1(list, xmhVar3, oihVar, xtb0VarA, iu30Var, (byte) 9), b0kVar6), b0kVar6, 3072);
                b0kVar2 = b0kVar6;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(2102092195);
                qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                gfh0VarC7 = t1c.c(een.e, false);
                iHashCode10 = Long.hashCode(((x340) b0kVar2).T);
                xos0VarM10 = b0kVar2.m();
                qim0VarE10 = zr7.E(b0kVar2, qim0VarD3);
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC7, b0kVar2, vu30Var2);
                nko1.H(xos0VarM10, b0kVar2, lljVar);
                x0d.q(iHashCode10, b0kVar2, lljVar2, b0kVar2);
                nko1.H(qim0VarE10, b0kVar2, lljVar3);
                String str = jqhVar.b;
                lee1 lee1Var = cbx.d(b0kVar2).j;
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                uwo1.e(str, uyn1.x(nim0Var, 16.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
                b0kVar2.r(true);
                b0kVar2.r(false);
                lljVar5 = lljVar;
                obj10 = obj7;
                xmhVar3 = xmhVar2;
                rphVar = rphVar3;
                i5 = i2;
                r14 = 0;
                iu30Var = iu30Var2;
            }
            sok.k(bs91Var3, h2cVar.a(nim0Var, een.X), sdi.a, b0kVar2, 384, 0);
            b0kVar2.r(true);
            ace0Var = ace0Var2;
            if (ace0Var instanceof ebe0) {
                ebe0Var = (ebe0) ace0Var;
            } else {
                ebe0Var = null;
            }
            if (ebe0Var != null || (ijhVar = (ijh) ebe0Var.a) == null || (tuwVar = ijhVar.d) == null) {
                tuwVar = tuw.b;
            }
            if (comment == null && rphVar.e.a(Boolean.TRUE)) {
                r4 = 1;
            } else {
                r4 = r14;
            }
            if (!z12 || (tuwVar != tuw.c && r4 == 0)) {
                r6 = r14;
            } else {
                r6 = 1;
            }
            strQ = "";
            if (r6 == 0 || z12) {
                strA = "";
            } else {
                strA = jqhVar.a(tuwVar);
            }
            if (r6 == 0 || strA.length() > 0) {
                b0kVar2.i0(2028239774);
                th = null;
                rqo1.g((int) r14, 1, b0kVar2, (qim0) null);
                b0kVar2.r((boolean) r14);
            } else {
                b0kVar2.i0(2028275331);
                b0kVar2.r((boolean) r14);
                th = null;
            }
            if (r6 != 0) {
                b0kVar2.i0(2028416319);
                if (r4 != 0) {
                    b0kVar2.i0(2028467717);
                    qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                    cvx cvxVar4 = cbx.b(b0kVar2).b;
                    cvx cvxVar5 = cbx.b(b0kVar2).b;
                    qim0 qim0VarY2 = uyn1.y(qim0VarF3, 16.0f, 4.0f);
                    jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, (int) r14);
                    th2 = th;
                    iHashCode8 = Long.hashCode(((x340) b0kVar2).T);
                    xos0VarM8 = b0kVar2.m();
                    qim0VarE8 = zr7.E(b0kVar2, qim0VarY2);
                    if (j06Var != null) {
                        tgp1.p();
                        throw th2;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(function1);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(jw31VarA, b0kVar2, vu30Var2);
                    lljVar7 = lljVar5;
                    nko1.H(xos0VarM8, b0kVar2, lljVar7);
                    x0d.q(iHashCode8, b0kVar2, lljVar2, b0kVar2);
                    lljVar3 = lljVar3;
                    nko1.H(qim0VarE8, b0kVar2, lljVar3);
                    iP = comment.p();
                    if (iP == 0) {
                        i8 = -1;
                    } else {
                        i8 = wmh.a[l1d.C(iP)];
                    }
                    if (i8 != 1) {
                        strQ = comment.E().q();
                    } else if (i8 == 2) {
                        strQ = comment.B().p();
                    }
                    strQ.getClass();
                    uwo1.e(cwl1.n0(2131961207, new Object[]{strQ}, b0kVar2), new wnb0(1.0f, true), cbx.d(b0kVar2).m, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
                    qim0 qim0VarS = u291.s(nim0Var, 48.0f, 36.0f);
                    i7 = i5;
                    if (i7 > 256 || !b0kVar2.g(iu30Var)) {
                        i6 = i3;
                        if ((i6 & 384) != 256) {
                            z10 = false;
                        }
                        objT17 = b0kVar2.T();
                        if (z10) {
                            obj11 = obj10;
                        } else {
                            obj11 = obj10;
                            if (objT17 == obj11) {
                            }
                            qim0 qim0VarX3 = bin.x(qim0VarS, false, (String) null, (pm31) null, (idn0) null, (Function0) objT17, 15);
                            gfh0VarC6 = t1c.c(tl3Var, false);
                            iHashCode9 = Long.hashCode(((x340) b0kVar2).T);
                            xos0VarM9 = b0kVar2.m();
                            qim0VarE9 = zr7.E(b0kVar2, qim0VarX3);
                            if (j06Var != null) {
                                tgp1.p();
                                throw th2;
                            }
                            b0kVar2.m0();
                            if (((x340) b0kVar2).S) {
                                b0kVar2.l(function1);
                            } else {
                                b0kVar2.v0();
                            }
                            nko1.H(gfh0VarC6, b0kVar2, vu30Var2);
                            nko1.H(xos0VarM9, b0kVar2, lljVar7);
                            x0d.q(iHashCode9, b0kVar2, lljVar2, b0kVar2);
                            nko1.H(qim0VarE9, b0kVar2, lljVar3);
                            b0k b0kVar7 = b0kVar2;
                            w0h1.a(fux.c, new jsl(cwl1.o0(b0kVar2, 2131953444)), (qim0) null, cbx.a(b0kVar2).b.b, 0L, false, b0kVar7, fux.d, 52);
                            b0kVar = b0kVar7;
                            us71.m(b0kVar, true, true, false);
                        }
                        objT17 = new thh(iu30Var, (byte) 12);
                        b0kVar2.s0(objT17);
                        qim0 qim0VarX4 = bin.x(qim0VarS, false, (String) null, (pm31) null, (idn0) null, (Function0) objT17, 15);
                        gfh0VarC6 = t1c.c(tl3Var, false);
                        iHashCode9 = Long.hashCode(((x340) b0kVar2).T);
                        xos0VarM9 = b0kVar2.m();
                        qim0VarE9 = zr7.E(b0kVar2, qim0VarX4);
                        if (j06Var != null) {
                            tgp1.p();
                            throw th2;
                        }
                        b0kVar2.m0();
                        if (((x340) b0kVar2).S) {
                            b0kVar2.l(function1);
                        } else {
                            b0kVar2.v0();
                        }
                        nko1.H(gfh0VarC6, b0kVar2, vu30Var2);
                        nko1.H(xos0VarM9, b0kVar2, lljVar7);
                        x0d.q(iHashCode9, b0kVar2, lljVar2, b0kVar2);
                        nko1.H(qim0VarE9, b0kVar2, lljVar3);
                        b0k b0kVar8 = b0kVar2;
                        w0h1.a(fux.c, new jsl(cwl1.o0(b0kVar2, 2131953444)), (qim0) null, cbx.a(b0kVar2).b.b, 0L, false, b0kVar8, fux.d, 52);
                        b0kVar = b0kVar8;
                        us71.m(b0kVar, true, true, false);
                    } else {
                        i6 = i3;
                    }
                    z10 = true;
                    objT17 = b0kVar2.T();
                    if (z10) {
                        obj11 = obj10;
                        if (objT17 == obj11) {
                        }
                        qim0 qim0VarX5 = bin.x(qim0VarS, false, (String) null, (pm31) null, (idn0) null, (Function0) objT17, 15);
                        gfh0VarC6 = t1c.c(tl3Var, false);
                        iHashCode9 = Long.hashCode(((x340) b0kVar2).T);
                        xos0VarM9 = b0kVar2.m();
                        qim0VarE9 = zr7.E(b0kVar2, qim0VarX5);
                        if (j06Var != null) {
                            tgp1.p();
                            throw th2;
                        }
                        b0kVar2.m0();
                        if (((x340) b0kVar2).S) {
                            b0kVar2.l(function1);
                        } else {
                            b0kVar2.v0();
                        }
                        nko1.H(gfh0VarC6, b0kVar2, vu30Var2);
                        nko1.H(xos0VarM9, b0kVar2, lljVar7);
                        x0d.q(iHashCode9, b0kVar2, lljVar2, b0kVar2);
                        nko1.H(qim0VarE9, b0kVar2, lljVar3);
                        b0k b0kVar9 = b0kVar2;
                        w0h1.a(fux.c, new jsl(cwl1.o0(b0kVar2, 2131953444)), (qim0) null, cbx.a(b0kVar2).b.b, 0L, false, b0kVar9, fux.d, 52);
                        b0kVar = b0kVar9;
                        us71.m(b0kVar, true, true, false);
                    } else {
                        obj11 = obj10;
                    }
                    objT17 = new thh(iu30Var, (byte) 12);
                    b0kVar2.s0(objT17);
                    qim0 qim0VarX6 = bin.x(qim0VarS, false, (String) null, (pm31) null, (idn0) null, (Function0) objT17, 15);
                    gfh0VarC6 = t1c.c(tl3Var, false);
                    iHashCode9 = Long.hashCode(((x340) b0kVar2).T);
                    xos0VarM9 = b0kVar2.m();
                    qim0VarE9 = zr7.E(b0kVar2, qim0VarX6);
                    if (j06Var != null) {
                        tgp1.p();
                        throw th2;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(function1);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(gfh0VarC6, b0kVar2, vu30Var2);
                    nko1.H(xos0VarM9, b0kVar2, lljVar7);
                    x0d.q(iHashCode9, b0kVar2, lljVar2, b0kVar2);
                    nko1.H(qim0VarE9, b0kVar2, lljVar3);
                    b0k b0kVar10 = b0kVar2;
                    w0h1.a(fux.c, new jsl(cwl1.o0(b0kVar2, 2131953444)), (qim0) null, cbx.a(b0kVar2).b.b, 0L, false, b0kVar10, fux.d, 52);
                    b0kVar = b0kVar10;
                    us71.m(b0kVar, true, true, false);
                } else {
                    b0kVar = b0kVar2;
                    th2 = th;
                    ?? r11 = r14;
                    lljVar3 = lljVar3;
                    i6 = i3;
                    lljVar7 = lljVar5;
                    obj11 = obj10;
                    i7 = i5;
                    b0kVar.i0(2030166114);
                    cvx cvxVar6 = cbx.b(b0kVar).b;
                    x0d.s(nim0Var, 8.0f, b0kVar, (boolean) r11);
                }
                objT12 = b0kVar.T();
                if (objT12 == obj11) {
                    objT12 = v8r.q(th2);
                    b0kVar.s0(objT12);
                }
                ven0Var10 = (ven0) objT12;
                qim0 qim0VarN = anm1.N("comment_input_bar", u291.f(nim0Var, 1.0f));
                iu30Var = iu30Var;
                ven0Var11 = ven0Var9;
                ven0Var12 = ven0Var8;
                zI3 = b0kVar.i(xmhVar3) | ((i7 <= 256 && b0kVar.g(iu30Var)) || (i6 & 384) == 256) | b0kVar.i(ven0Var11) | b0kVar.i(ven0Var10) | b0kVar.i(ven0Var12);
                objT13 = b0kVar.T();
                if (zI3 || objT13 == obj11) {
                    xmh xmhVar5 = xmhVar3;
                    objT13 = new uh0(xmhVar5, ven0Var11, ven0Var10, ven0Var12, iu30Var, (byte) 14);
                    ven0Var12 = ven0Var12;
                    ven0Var11 = ven0Var11;
                    xmhVar3 = xmhVar5;
                    b0kVar.s0(objT13);
                }
                iu30 iu30Var3 = (iu30) objT13;
                boolean zI6 = b0kVar.i(ven0Var10);
                if (((i6 & 112) ^ 48) > 32) {
                    rphVar2 = rphVar;
                    if (!b0kVar.i(rphVar2)) {
                        lljVar6 = lljVar7;
                    }
                    z8 = true;
                    z9 = zI6 | z8;
                    objT14 = b0kVar.T();
                    if (z9 || objT14 == obj11) {
                        objT14 = new w9f(ven0Var10, rphVar2, (byte) 25);
                        b0kVar.s0(objT14);
                    }
                    dm5.a(iu30Var3, qim0VarN, (iu30) objT14, b0kVar, 0, 0);
                    zI4 = b0kVar.i(ven0Var7) | b0kVar.i(ven0Var11);
                    objT15 = b0kVar.T();
                    if (zI4 || objT15 == obj11) {
                        objT15 = new vs3(ven0Var7, ven0Var11, th2, (byte) 4);
                        b0kVar.s0(objT15);
                    }
                    rih1Var = rih1Var2;
                    qxd0.t(rih1Var, b0kVar, (vu30) objT15);
                    zI5 = b0kVar.i(ven0Var10) | b0kVar.i(ven0Var11) | b0kVar.i(xmhVar3) | b0kVar.i(ven0Var12);
                    objT16 = b0kVar.T();
                    if (zI5 || objT16 == obj11) {
                        objT16 = new ggh(ven0Var10, ven0Var11, xmhVar3, ven0Var12, (byte) 4);
                        b0kVar.s0(objT16);
                    }
                    qxd0.i(rih1Var, (iu30) objT16, b0kVar);
                    b0kVar.r(false);
                } else {
                    rphVar2 = rphVar;
                }
                lljVar6 = lljVar7;
                if ((i6 & 48) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zI6 | z8;
                objT14 = b0kVar.T();
                if (z9) {
                    objT14 = new w9f(ven0Var10, rphVar2, (byte) 25);
                    b0kVar.s0(objT14);
                } else {
                    objT14 = new w9f(ven0Var10, rphVar2, (byte) 25);
                    b0kVar.s0(objT14);
                }
                dm5.a(iu30Var3, qim0VarN, (iu30) objT14, b0kVar, 0, 0);
                zI4 = b0kVar.i(ven0Var7) | b0kVar.i(ven0Var11);
                objT15 = b0kVar.T();
                if (zI4) {
                    objT15 = new vs3(ven0Var7, ven0Var11, th2, (byte) 4);
                    b0kVar.s0(objT15);
                } else {
                    objT15 = new vs3(ven0Var7, ven0Var11, th2, (byte) 4);
                    b0kVar.s0(objT15);
                }
                rih1Var = rih1Var2;
                qxd0.t(rih1Var, b0kVar, (vu30) objT15);
                zI5 = b0kVar.i(ven0Var10) | b0kVar.i(ven0Var11) | b0kVar.i(xmhVar3) | b0kVar.i(ven0Var12);
                objT16 = b0kVar.T();
                if (zI5) {
                    objT16 = new ggh(ven0Var10, ven0Var11, xmhVar3, ven0Var12, (byte) 4);
                    b0kVar.s0(objT16);
                } else {
                    objT16 = new ggh(ven0Var10, ven0Var11, xmhVar3, ven0Var12, (byte) 4);
                    b0kVar.s0(objT16);
                }
                qxd0.i(rih1Var, (iu30) objT16, b0kVar);
                b0kVar.r(false);
            } else {
                b0k b0kVar11 = b0kVar2;
                rphVar2 = rphVar;
                b0kVar = b0kVar11;
                function1 = function1;
                strA = strA;
                vu30Var2 = vu30Var2;
                ?? r12 = r14;
                lljVar2 = lljVar2;
                rih1Var = rih1Var2;
                i6 = i3;
                lljVar6 = lljVar5;
                tl3Var = tl3Var;
                obj11 = obj10;
                i7 = i5;
                b0kVar.i0(2031925891);
                b0kVar.r((boolean) r12);
            }
            if (strA.length() > 0) {
                b0kVar.i0(2031993905);
                lee1 lee1Var2 = cbx.d(b0kVar).j;
                long j = cbx.a(b0kVar).b.b;
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                cvx cvxVar7 = cbx.b(b0kVar).b;
                uwo1.e(strA, uyn1.y(qim0VarF4, 16.0f, cbx.b(b0kVar).b.b), lee1Var2, j, a0e1.a(), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2016);
                b0kVar.r(false);
            } else {
                b0kVar.i0(2032420899);
                b0kVar.r(false);
            }
            if (z12) {
                b0kVar.i0(2032488045);
                String strO0 = cwl1.o0(b0kVar, 2131962402);
                lee1 lee1Var3 = cbx.d(b0kVar).h;
                long j2 = cbx.a(b0kVar).b.a;
                qim0 qim0VarN2 = anm1.N("comments-show-all", u291.f(nim0Var, 1.0f));
                z7 = (i7 <= 256 && b0kVar.g(iu30Var)) || (i6 & 384) == 256;
                objT11 = b0kVar.T();
                if (z7 || objT11 == obj11) {
                    objT11 = new thh(iu30Var, (byte) 13);
                    b0kVar.s0(objT11);
                }
                qim0 qim0VarX7 = bin.x(qim0VarN2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT11, 15);
                cvx cvxVar8 = cbx.b(b0kVar).b;
                uwo1.e(strO0, uyn1.x(qim0VarX7, 16.0f), lee1Var3, j2, a0e1.a(), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2016);
                b0kVar.r(false);
            } else {
                b0kVar.i0(2032980387);
                b0kVar.r(false);
            }
            b0kVar.r(true);
            if (rphVar2.j) {
                b0kVar.i0(-2070574476);
                qim0 qim0VarD4 = u291.d(nim0Var, 1.0f);
                objT10 = b0kVar.T();
                if (objT10 == obj11) {
                    objT10 = nyf.U0;
                    b0kVar.s0(objT10);
                }
                qim0 qim0VarX8 = bin.x(qim0VarD4, false, (String) null, (pm31) null, (idn0) null, (Function0) objT10, 14);
                gfh0VarC5 = t1c.c(tl3Var, false);
                iHashCode7 = Long.hashCode(((x340) b0kVar).T);
                xos0VarM7 = b0kVar.m();
                qim0VarE7 = zr7.E(b0kVar, qim0VarX8);
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar.m0();
                if (((x340) b0kVar).S) {
                    b0kVar.l(function1);
                } else {
                    b0kVar.v0();
                }
                nko1.H(gfh0VarC5, b0kVar, vu30Var2);
                nko1.H(xos0VarM7, b0kVar, lljVar6);
                x0d.q(iHashCode7, b0kVar, lljVar2, b0kVar);
                nko1.H(qim0VarE7, b0kVar, lljVar3);
                yto1.e(0, 0, 3, b0kVar, (qim0) null);
                z6 = true;
                b0kVar.r(true);
                b0kVar.r(false);
            } else {
                z6 = true;
                b0kVar.i0(-2070385159);
                b0kVar.r(false);
            }
            b0kVar.r(z6);
            return rih1Var;
        }
        obj6 = m4cVar;
        cwe1 cwe1Var = xmhVar4.c;
        String str2 = rphVar3.k;
        if (!(ace0Var2 instanceof ebe0) || (ebe0Var2 instanceof obe0)) {
            vu30Var = vu30Var3;
            function0 = function2;
            arrayListZ = z6x.a;
        } else {
            ijh ijhVar2 = (ijh) ((ebe0) ace0Var2).a;
            uge1 uge1Var = ijhVar2.b;
            String str3 = ijhVar2.e;
            List list3 = uge1Var.a;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((Comment) it2.next()).y()) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            boolean z13 = !z11 && z;
            boolean z14 = z11 && z;
            List list4 = uge1Var.a;
            if (z13) {
                ArrayList arrayList = new ArrayList();
                for (Object obj12 : list4) {
                    if (!((Comment) obj12).y()) {
                        arrayList.add(obj12);
                    }
                }
                list4 = arrayList;
            }
            c380 c380VarA = mqo1.A(list4);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it3 = m7Var.a().iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                it3 = it3;
                if (!((cg21) entry.getValue()).f) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    vu30Var3 = vu30Var3;
                }
            }
            vu30Var = vu30Var3;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
            Iterator it4 = linkedHashMap.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it4.next();
                Iterator it5 = it4;
                linkedHashMap2.put(entry2.getKey(), new rkh(((cg21) entry2.getValue()).b, ((cg21) entry2.getValue()).e != null, rphVar3.s, rphVar3.l.containsKey(entry2.getKey()), ((cg21) entry2.getValue()).c));
                it4 = it5;
                function2 = function2;
            }
            function0 = function2;
            skh skhVar = new skh(c380VarA, mqo1.B(linkedHashMap2), rphVar3.o);
            boolean z15 = (str3.length() <= 0 || u890.j(str2, str3) || z13) ? false : true;
            boolean z16 = !(str2 == null || str2.length() == 0);
            Set set = rphVar3.m;
            String str4 = rphVar3.a;
            boolean z17 = ebe0Var2 instanceof ebe0;
            ebe0 ebe0Var4 = z17 ? ebe0Var2 : null;
            int i9 = (ebe0Var4 == null || (qmyVar2 = (qmy) ebe0Var4.a) == null) ? 0 : qmyVar2.d;
            u380 u380Var = rphVar3.r;
            boolean z18 = (ijhVar2.d == tuw.f || z12) ? false : true;
            ebe0 ebe0Var5 = z17 ? ebe0Var2 : null;
            arrayListZ = j7p1.z(new tkh(skhVar, z15, false, z16, z13, set, z14, str4, i9, u380Var, z18, z47.u(cwe1Var, (ebe0Var5 == null || (qmyVar = (qmy) ebe0Var5.a) == null) ? null : Boolean.valueOf(qmyVar.e))));
        }
        objT19 = arrayListZ;
        b0kVar2.s0(objT19);
        list = (List) objT19;
        list2 = list;
        if (list2 instanceof Collection) {
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    pkhVar = (pkh) it.next();
                    if (!(pkhVar instanceof ekh)) {
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        } else {
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    pkhVar = (pkh) it.next();
                    if (!(pkhVar instanceof ekh)) {
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
        }
        objT = b0kVar2.T();
        if (objT == obj6) {
            objT = v8r.q((Object) null);
            b0kVar2.s0(objT);
        }
        ven0Var = (ven0) objT;
        objT2 = b0kVar2.T();
        if (objT2 == obj6) {
            objT2 = v8r.q((Object) null);
            b0kVar2.s0(objT2);
        }
        ven0Var2 = (ven0) objT2;
        objT3 = b0kVar2.T();
        if (objT3 == obj6) {
            objT3 = v8r.q(Boolean.FALSE);
            b0kVar2.s0(objT3);
        }
        ven0Var3 = (ven0) objT3;
        objT4 = b0kVar2.T();
        if (objT4 == obj6) {
            objT4 = new bs91();
            b0kVar2.s0(objT4);
        }
        bs91Var = (bs91) objT4;
        objT5 = b0kVar2.T();
        if (objT5 == obj6) {
            objT5 = new zph();
            b0kVar2.s0(objT5);
        }
        zphVar = (zph) objT5;
        zI = b0kVar2.i(xmhVar4) | b0kVar2.i(ven0Var) | b0kVar2.i(ven0Var3) | b0kVar2.i(ven0Var2) | b0kVar2.i(bs91Var) | b0kVar2.i(zphVar);
        objT6 = b0kVar2.T();
        if (zI) {
            objT6 = new ae1((Object) xmhVar4, (Object) ven0Var, (Object) ven0Var3, (Object) ven0Var2, (Object) bs91Var, (Object) zphVar, (lnm) null, (byte) 4);
            xmhVar = xmhVar4;
            ven0Var4 = ven0Var;
            ven0Var5 = ven0Var3;
            ven0Var6 = ven0Var2;
            bs91Var2 = bs91Var;
            zphVar2 = zphVar;
            b0kVar2.s0(objT6);
        } else {
            objT6 = new ae1((Object) xmhVar4, (Object) ven0Var, (Object) ven0Var3, (Object) ven0Var2, (Object) bs91Var, (Object) zphVar, (lnm) null, (byte) 4);
            xmhVar = xmhVar4;
            ven0Var4 = ven0Var;
            ven0Var5 = ven0Var3;
            ven0Var6 = ven0Var2;
            bs91Var2 = bs91Var;
            zphVar2 = zphVar;
            b0kVar2.s0(objT6);
        }
        qxd0.t(rih1Var2, b0kVar2, (vu30) objT6);
        i = (iIntValue >> 3) & 14;
        ven0VarS = v8r.s(rphVar3, b0kVar2);
        zI2 = b0kVar2.i(ven0VarS) | b0kVar2.i(xmhVar);
        objT7 = b0kVar2.T();
        if (zI2) {
            objT7 = new w9f(ven0VarS, xmhVar, (byte) 24);
            b0kVar2.s0(objT7);
        } else {
            objT7 = new w9f(ven0VarS, xmhVar, (byte) 24);
            b0kVar2.s0(objT7);
        }
        qxd0.i(rih1Var2, (iu30) objT7, b0kVar2);
        qim0 qim0VarY3 = voo1.y(voo1.y(u291.d(nim0Var, 1.0f), voo1.f), voo1.g);
        jqhVar = xmhVar.h;
        graVar = een.d;
        z3 = z2;
        gfh0VarC = t1c.c(graVar, false);
        bs91Var3 = bs91Var2;
        iHashCode = Long.hashCode(((x340) b0kVar2).T);
        xos0VarM = b0kVar2.m();
        qim0VarE = zr7.E(b0kVar2, qim0VarY3);
        hzj.A.getClass();
        if (j06Var != null) {
            tgp1.p();
            throw null;
        }
        b0kVar2.m0();
        if (((x340) b0kVar2).S) {
            function1 = function0;
            b0kVar2.l(function1);
        } else {
            function1 = function0;
            b0kVar2.v0();
        }
        ven0Var7 = ven0Var5;
        vu30Var2 = vu30Var;
        nko1.H(gfh0VarC, b0kVar2, vu30Var2);
        lljVar = lljVar10;
        nko1.H(xos0VarM, b0kVar2, lljVar);
        lljVar2 = lljVar9;
        x0d.q(iHashCode, b0kVar2, lljVar2, b0kVar2);
        lljVar3 = lljVar8;
        nko1.H(qim0VarE, b0kVar2, lljVar3);
        xmhVar2 = xmhVar;
        qim0 qim0VarD5 = u291.d(nim0Var, 1.0f);
        era eraVar2 = een.P0;
        ven0Var8 = ven0Var6;
        f36Var = h36.c;
        ven0Var9 = ven0Var4;
        mbhVarA = jbh.a(f36Var, eraVar2, b0kVar2, 0);
        iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
        xos0VarM2 = b0kVar2.m();
        qim0VarE2 = zr7.E(b0kVar2, qim0VarD5);
        if (j06Var != null) {
            tgp1.p();
            throw null;
        }
        b0kVar2.m0();
        if (((x340) b0kVar2).S) {
            b0kVar2.l(function1);
        } else {
            b0kVar2.v0();
        }
        nko1.H(mbhVarA, b0kVar2, vu30Var2);
        nko1.H(xos0VarM2, b0kVar2, lljVar);
        x0d.q(iHashCode2, b0kVar2, lljVar2, b0kVar2);
        nko1.H(qim0VarE2, b0kVar2, lljVar3);
        qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
        gfh0VarC2 = t1c.c(graVar, false);
        iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
        xos0VarM3 = b0kVar2.m();
        qim0VarE3 = zr7.E(b0kVar2, qim0VarF5);
        if (j06Var != null) {
            tgp1.p();
            throw null;
        }
        b0kVar2.m0();
        if (((x340) b0kVar2).S) {
            b0kVar2.l(function1);
        } else {
            b0kVar2.v0();
        }
        nko1.H(gfh0VarC2, b0kVar2, vu30Var2);
        nko1.H(xos0VarM3, b0kVar2, lljVar);
        x0d.q(iHashCode3, b0kVar2, lljVar2, b0kVar2);
        nko1.H(qim0VarE3, b0kVar2, lljVar3);
        gra graVar3 = een.g;
        h2cVar = h2c.a;
        qim0 qim0VarA2 = h2cVar.a(nim0Var, graVar3);
        uwr uwrVar3 = cbx.a;
        cvx cvxVar9 = cbx.b(b0kVar2).b;
        qim0 qim0VarX9 = uyn1.x(qim0VarA2, 4.0f);
        mta mtaVar2 = cbx.b(b0kVar2).d;
        qim0 qim0VarR2 = u291.r(qim0VarX9, 48.0f);
        i2 = (iIntValue & 896) ^ 384;
        if (i2 <= 256) {
        }
        objT8 = b0kVar2.T();
        if (z4) {
            objT8 = new thh(iu30Var2, (byte) 10);
            b0kVar2.s0(objT8);
        } else {
            objT8 = new thh(iu30Var2, (byte) 10);
            b0kVar2.s0(objT8);
        }
        qim0 qim0VarX10 = bin.x(qim0VarR2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT8, 15);
        i3 = iIntValue;
        tl3Var = tl3Var2;
        obj7 = obj6;
        gfh0VarC3 = t1c.c(tl3Var, false);
        iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
        xos0VarM4 = b0kVar2.m();
        qim0VarE4 = zr7.E(b0kVar2, qim0VarX10);
        if (j06Var != null) {
            tgp1.p();
            throw null;
        }
        b0kVar2.m0();
        if (((x340) b0kVar2).S) {
            b0kVar2.l(function1);
        } else {
            b0kVar2.v0();
        }
        nko1.H(gfh0VarC3, b0kVar2, vu30Var2);
        nko1.H(xos0VarM4, b0kVar2, lljVar);
        x0d.q(iHashCode4, b0kVar2, lljVar2, b0kVar2);
        nko1.H(qim0VarE4, b0kVar2, lljVar3);
        w0h1.a(mlx.c, new jsl(cwl1.o0(b0kVar2, 2131953951)), (qim0) null, 0L, 0L, false, b0kVar2, mlx.d, 60);
        b0kVar2.r(true);
        qim0 qim0VarZ2 = uyn1.z(56.0f, 0.0f, 2, h2cVar.a(nim0Var, tl3Var));
        mbhVarA2 = jbh.a(f36Var, een.Q0, b0kVar2, 0);
        iHashCode5 = Long.hashCode(((x340) b0kVar2).T);
        xos0VarM5 = b0kVar2.m();
        qim0VarE5 = zr7.E(b0kVar2, qim0VarZ2);
        if (j06Var != null) {
            tgp1.p();
            throw null;
        }
        b0kVar2.m0();
        if (((x340) b0kVar2).S) {
            b0kVar2.l(function1);
        } else {
            b0kVar2.v0();
        }
        nko1.H(mbhVarA2, b0kVar2, vu30Var2);
        nko1.H(xos0VarM5, b0kVar2, lljVar);
        x0d.q(iHashCode5, b0kVar2, lljVar2, b0kVar2);
        nko1.H(qim0VarE5, b0kVar2, lljVar3);
        uwo1.e(cwl1.o0(b0kVar2, 2131954139), (qim0) null, cbx.d(b0kVar2).h, 0L, a0e1.a(), (iu30) null, 0, false, new zic0(1), 0, (qx8) null, b0kVar2, 0, 0, 1770);
        if (qmyVar3 != 0) {
            b0kVar2.i0(679023465);
            qmy qmyVar5 = qmyVar3;
            uwo1.e(qmyVar5.a, (qim0) null, cbx.d(b0kVar2).m, cbx.a(b0kVar2).b.b, a0e1.a(), (iu30) null, 2, false, new zic0(1), 0, (qx8) null, b0kVar2, 0, 0, 1698);
            b0kVar2 = b0kVar2;
            uwo1.e(cwl1.n0(2131959572, new Object[]{qmyVar5.b, qmyVar5.c}, b0kVar2), (qim0) null, cbx.d(b0kVar2).m, cbx.a(b0kVar2).b.b, a0e1.a(), (iu30) null, 2, false, new zic0(1), 0, (qx8) null, b0kVar2, 0, 0, 1698);
            r10 = 0;
            b0kVar2.r(false);
        } else {
            r10 = 0;
            b0kVar2.i0(679851847);
            b0kVar2.r(false);
        }
        b0kVar2.r(true);
        b0kVar2.r(true);
        cvx cvxVar10 = cbx.b(b0kVar2).b;
        op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
        rqo1.g((int) r10, 1, b0kVar2, (qim0) null);
        qim0 qim0VarF6 = u291.f(new wnb0(1.0f, true), 1.0f);
        gfh0VarC4 = t1c.c(graVar, (boolean) r10);
        iHashCode6 = Long.hashCode(((x340) b0kVar2).T);
        xos0VarM6 = b0kVar2.m();
        qim0VarE6 = zr7.E(b0kVar2, qim0VarF6);
        if (j06Var != null) {
            tgp1.p();
            throw null;
        }
        b0kVar2.m0();
        if (((x340) b0kVar2).S) {
            b0kVar2.l(function1);
        } else {
            b0kVar2.v0();
        }
        nko1.H(gfh0VarC4, b0kVar2, vu30Var2);
        nko1.H(xos0VarM6, b0kVar2, lljVar);
        x0d.q(iHashCode6, b0kVar2, lljVar2, b0kVar2);
        nko1.H(qim0VarE6, b0kVar2, lljVar3);
        if (z3) {
            b0kVar2.i0(2102092195);
            qim0 qim0VarD6 = u291.d(nim0Var, 1.0f);
            gfh0VarC7 = t1c.c(een.e, false);
            iHashCode10 = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM10 = b0kVar2.m();
            qim0VarE10 = zr7.E(b0kVar2, qim0VarD6);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC7, b0kVar2, vu30Var2);
            nko1.H(xos0VarM10, b0kVar2, lljVar);
            x0d.q(iHashCode10, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE10, b0kVar2, lljVar3);
            String str5 = jqhVar.b;
            lee1 lee1Var4 = cbx.d(b0kVar2).j;
            cvx cvxVar11 = cbx.b(b0kVar2).b;
            uwo1.e(str5, uyn1.x(nim0Var, 16.0f), lee1Var4, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
            b0kVar2.r(true);
            b0kVar2.r(false);
            lljVar5 = lljVar;
            obj10 = obj7;
            xmhVar3 = xmhVar2;
            rphVar = rphVar3;
            i5 = i2;
            r14 = 0;
            iu30Var = iu30Var2;
        } else {
            b0kVar2.i0(2102465900);
            xtb0 xtb0VarA2 = aub0.a(0, b0kVar2, 3);
            rphVar = rphVar3;
            p8p1.c(rphVar, xtb0VarA2, b0kVar2, i);
            if (i2 > 256) {
                iu30Var = iu30Var2;
                iu30Var = iu30Var2;
                lljVar4 = lljVar;
                i4 = i3;
                if ((i4 & 384) != 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                iu30Var = iu30Var2;
                iu30Var = iu30Var2;
                lljVar4 = lljVar;
                i4 = i3;
                if ((i4 & 384) != 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            objT9 = b0kVar2.T();
            if (z5) {
                obj8 = obj7;
                if (objT9 != obj8) {
                    obj9 = obj8;
                }
                b0k b0kVar12 = b0kVar2;
                i3 = i4;
                i5 = i2;
                lljVar5 = lljVar4;
                obj10 = obj9;
                xmhVar3 = xmhVar2;
                r14 = 0;
                t8p1.d(zphVar2, xtb0VarA2, (Function0) objT9, apo.r(868563646, new jb1(list, xmhVar3, oihVar, xtb0VarA2, iu30Var, (byte) 9), b0kVar12), b0kVar12, 3072);
                b0kVar2 = b0kVar12;
                b0kVar2.r(false);
            } else {
                obj8 = obj7;
            }
            obj9 = obj8;
            objT9 = new thh(iu30Var, (byte) 11);
            b0kVar2.s0(objT9);
            b0k b0kVar13 = b0kVar2;
            i3 = i4;
            i5 = i2;
            lljVar5 = lljVar4;
            obj10 = obj9;
            xmhVar3 = xmhVar2;
            r14 = 0;
            t8p1.d(zphVar2, xtb0VarA2, (Function0) objT9, apo.r(868563646, new jb1(list, xmhVar3, oihVar, xtb0VarA2, iu30Var, (byte) 9), b0kVar13), b0kVar13, 3072);
            b0kVar2 = b0kVar13;
            b0kVar2.r(false);
        }
        sok.k(bs91Var3, h2cVar.a(nim0Var, een.X), sdi.a, b0kVar2, 384, 0);
        b0kVar2.r(true);
        ace0Var = ace0Var2;
        if (ace0Var instanceof ebe0) {
            ebe0Var = (ebe0) ace0Var;
        } else {
            ebe0Var = null;
        }
        if (ebe0Var != null) {
            tuwVar = tuw.b;
        } else {
            tuwVar = tuw.b;
        }
        if (comment == null) {
            r4 = r14;
        } else {
            r4 = r14;
        }
        if (z12) {
            r6 = r14;
        } else {
            r6 = r14;
        }
        strQ = "";
        if (r6 == 0) {
            strA = "";
        } else {
            strA = "";
        }
        if (r6 == 0) {
            b0kVar2.i0(2028239774);
            th = null;
            rqo1.g((int) r14, 1, b0kVar2, (qim0) null);
            b0kVar2.r((boolean) r14);
        } else {
            b0kVar2.i0(2028239774);
            th = null;
            rqo1.g((int) r14, 1, b0kVar2, (qim0) null);
            b0kVar2.r((boolean) r14);
        }
        if (r6 != 0) {
            b0kVar2.i0(2028416319);
            if (r4 != 0) {
                b0kVar2.i0(2028467717);
                qim0 qim0VarF7 = u291.f(nim0Var, 1.0f);
                cvx cvxVar12 = cbx.b(b0kVar2).b;
                cvx cvxVar13 = cbx.b(b0kVar2).b;
                qim0 qim0VarY4 = uyn1.y(qim0VarF7, 16.0f, 4.0f);
                jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, (int) r14);
                th2 = th;
                iHashCode8 = Long.hashCode(((x340) b0kVar2).T);
                xos0VarM8 = b0kVar2.m();
                qim0VarE8 = zr7.E(b0kVar2, qim0VarY4);
                if (j06Var != null) {
                    tgp1.p();
                    throw th2;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(jw31VarA, b0kVar2, vu30Var2);
                lljVar7 = lljVar5;
                nko1.H(xos0VarM8, b0kVar2, lljVar7);
                x0d.q(iHashCode8, b0kVar2, lljVar2, b0kVar2);
                lljVar3 = lljVar3;
                nko1.H(qim0VarE8, b0kVar2, lljVar3);
                iP = comment.p();
                if (iP == 0) {
                    i8 = -1;
                } else {
                    i8 = wmh.a[l1d.C(iP)];
                }
                if (i8 != 1) {
                    strQ = comment.E().q();
                } else if (i8 == 2) {
                    strQ = comment.B().p();
                }
                strQ.getClass();
                uwo1.e(cwl1.n0(2131961207, new Object[]{strQ}, b0kVar2), new wnb0(1.0f, true), cbx.d(b0kVar2).m, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
                qim0 qim0VarS2 = u291.s(nim0Var, 48.0f, 36.0f);
                i7 = i5;
                if (i7 > 256) {
                    i6 = i3;
                    if ((i6 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    i6 = i3;
                    if ((i6 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                objT17 = b0kVar2.T();
                if (z10) {
                    obj11 = obj10;
                    if (objT17 == obj11) {
                    }
                    qim0 qim0VarX11 = bin.x(qim0VarS2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT17, 15);
                    gfh0VarC6 = t1c.c(tl3Var, false);
                    iHashCode9 = Long.hashCode(((x340) b0kVar2).T);
                    xos0VarM9 = b0kVar2.m();
                    qim0VarE9 = zr7.E(b0kVar2, qim0VarX11);
                    if (j06Var != null) {
                        tgp1.p();
                        throw th2;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(function1);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(gfh0VarC6, b0kVar2, vu30Var2);
                    nko1.H(xos0VarM9, b0kVar2, lljVar7);
                    x0d.q(iHashCode9, b0kVar2, lljVar2, b0kVar2);
                    nko1.H(qim0VarE9, b0kVar2, lljVar3);
                    b0k b0kVar14 = b0kVar2;
                    w0h1.a(fux.c, new jsl(cwl1.o0(b0kVar2, 2131953444)), (qim0) null, cbx.a(b0kVar2).b.b, 0L, false, b0kVar14, fux.d, 52);
                    b0kVar = b0kVar14;
                    us71.m(b0kVar, true, true, false);
                } else {
                    obj11 = obj10;
                }
                objT17 = new thh(iu30Var, (byte) 12);
                b0kVar2.s0(objT17);
                qim0 qim0VarX12 = bin.x(qim0VarS2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT17, 15);
                gfh0VarC6 = t1c.c(tl3Var, false);
                iHashCode9 = Long.hashCode(((x340) b0kVar2).T);
                xos0VarM9 = b0kVar2.m();
                qim0VarE9 = zr7.E(b0kVar2, qim0VarX12);
                if (j06Var != null) {
                    tgp1.p();
                    throw th2;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(function1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC6, b0kVar2, vu30Var2);
                nko1.H(xos0VarM9, b0kVar2, lljVar7);
                x0d.q(iHashCode9, b0kVar2, lljVar2, b0kVar2);
                nko1.H(qim0VarE9, b0kVar2, lljVar3);
                b0k b0kVar15 = b0kVar2;
                w0h1.a(fux.c, new jsl(cwl1.o0(b0kVar2, 2131953444)), (qim0) null, cbx.a(b0kVar2).b.b, 0L, false, b0kVar15, fux.d, 52);
                b0kVar = b0kVar15;
                us71.m(b0kVar, true, true, false);
            } else {
                b0kVar = b0kVar2;
                th2 = th;
                ?? r13 = r14;
                lljVar3 = lljVar3;
                i6 = i3;
                lljVar7 = lljVar5;
                obj11 = obj10;
                i7 = i5;
                b0kVar.i0(2030166114);
                cvx cvxVar14 = cbx.b(b0kVar).b;
                x0d.s(nim0Var, 8.0f, b0kVar, (boolean) r13);
            }
            objT12 = b0kVar.T();
            if (objT12 == obj11) {
                objT12 = v8r.q(th2);
                b0kVar.s0(objT12);
            }
            ven0Var10 = (ven0) objT12;
            qim0 qim0VarN3 = anm1.N("comment_input_bar", u291.f(nim0Var, 1.0f));
            iu30Var = iu30Var;
            ven0Var11 = ven0Var9;
            ven0Var12 = ven0Var8;
            zI3 = b0kVar.i(xmhVar3) | ((i7 <= 256 && b0kVar.g(iu30Var)) || (i6 & 384) == 256) | b0kVar.i(ven0Var11) | b0kVar.i(ven0Var10) | b0kVar.i(ven0Var12);
            objT13 = b0kVar.T();
            if (zI3) {
                xmh xmhVar6 = xmhVar3;
                objT13 = new uh0(xmhVar6, ven0Var11, ven0Var10, ven0Var12, iu30Var, (byte) 14);
                ven0Var12 = ven0Var12;
                ven0Var11 = ven0Var11;
                xmhVar3 = xmhVar6;
                b0kVar.s0(objT13);
            } else {
                xmh xmhVar7 = xmhVar3;
                objT13 = new uh0(xmhVar7, ven0Var11, ven0Var10, ven0Var12, iu30Var, (byte) 14);
                ven0Var12 = ven0Var12;
                ven0Var11 = ven0Var11;
                xmhVar3 = xmhVar7;
                b0kVar.s0(objT13);
            }
            iu30 iu30Var4 = (iu30) objT13;
            boolean zI7 = b0kVar.i(ven0Var10);
            if (((i6 & 112) ^ 48) > 32) {
                rphVar2 = rphVar;
                if (!b0kVar.i(rphVar2)) {
                    lljVar6 = lljVar7;
                }
                z8 = true;
                z9 = zI7 | z8;
                objT14 = b0kVar.T();
                if (z9) {
                    objT14 = new w9f(ven0Var10, rphVar2, (byte) 25);
                    b0kVar.s0(objT14);
                } else {
                    objT14 = new w9f(ven0Var10, rphVar2, (byte) 25);
                    b0kVar.s0(objT14);
                }
                dm5.a(iu30Var4, qim0VarN3, (iu30) objT14, b0kVar, 0, 0);
                zI4 = b0kVar.i(ven0Var7) | b0kVar.i(ven0Var11);
                objT15 = b0kVar.T();
                if (zI4) {
                    objT15 = new vs3(ven0Var7, ven0Var11, th2, (byte) 4);
                    b0kVar.s0(objT15);
                } else {
                    objT15 = new vs3(ven0Var7, ven0Var11, th2, (byte) 4);
                    b0kVar.s0(objT15);
                }
                rih1Var = rih1Var2;
                qxd0.t(rih1Var, b0kVar, (vu30) objT15);
                zI5 = b0kVar.i(ven0Var10) | b0kVar.i(ven0Var11) | b0kVar.i(xmhVar3) | b0kVar.i(ven0Var12);
                objT16 = b0kVar.T();
                if (zI5) {
                    objT16 = new ggh(ven0Var10, ven0Var11, xmhVar3, ven0Var12, (byte) 4);
                    b0kVar.s0(objT16);
                } else {
                    objT16 = new ggh(ven0Var10, ven0Var11, xmhVar3, ven0Var12, (byte) 4);
                    b0kVar.s0(objT16);
                }
                qxd0.i(rih1Var, (iu30) objT16, b0kVar);
                b0kVar.r(false);
            } else {
                rphVar2 = rphVar;
            }
            lljVar6 = lljVar7;
            if ((i6 & 48) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = zI7 | z8;
            objT14 = b0kVar.T();
            if (z9) {
                objT14 = new w9f(ven0Var10, rphVar2, (byte) 25);
                b0kVar.s0(objT14);
            } else {
                objT14 = new w9f(ven0Var10, rphVar2, (byte) 25);
                b0kVar.s0(objT14);
            }
            dm5.a(iu30Var4, qim0VarN3, (iu30) objT14, b0kVar, 0, 0);
            zI4 = b0kVar.i(ven0Var7) | b0kVar.i(ven0Var11);
            objT15 = b0kVar.T();
            if (zI4) {
                objT15 = new vs3(ven0Var7, ven0Var11, th2, (byte) 4);
                b0kVar.s0(objT15);
            } else {
                objT15 = new vs3(ven0Var7, ven0Var11, th2, (byte) 4);
                b0kVar.s0(objT15);
            }
            rih1Var = rih1Var2;
            qxd0.t(rih1Var, b0kVar, (vu30) objT15);
            zI5 = b0kVar.i(ven0Var10) | b0kVar.i(ven0Var11) | b0kVar.i(xmhVar3) | b0kVar.i(ven0Var12);
            objT16 = b0kVar.T();
            if (zI5) {
                objT16 = new ggh(ven0Var10, ven0Var11, xmhVar3, ven0Var12, (byte) 4);
                b0kVar.s0(objT16);
            } else {
                objT16 = new ggh(ven0Var10, ven0Var11, xmhVar3, ven0Var12, (byte) 4);
                b0kVar.s0(objT16);
            }
            qxd0.i(rih1Var, (iu30) objT16, b0kVar);
            b0kVar.r(false);
        } else {
            b0k b0kVar16 = b0kVar2;
            rphVar2 = rphVar;
            b0kVar = b0kVar16;
            function1 = function1;
            strA = strA;
            vu30Var2 = vu30Var2;
            ?? r15 = r14;
            lljVar2 = lljVar2;
            rih1Var = rih1Var2;
            i6 = i3;
            lljVar6 = lljVar5;
            tl3Var = tl3Var;
            obj11 = obj10;
            i7 = i5;
            b0kVar.i0(2031925891);
            b0kVar.r((boolean) r15);
        }
        if (strA.length() > 0) {
            b0kVar.i0(2031993905);
            lee1 lee1Var5 = cbx.d(b0kVar).j;
            long j3 = cbx.a(b0kVar).b.b;
            qim0 qim0VarF8 = u291.f(nim0Var, 1.0f);
            cvx cvxVar15 = cbx.b(b0kVar).b;
            uwo1.e(strA, uyn1.y(qim0VarF8, 16.0f, cbx.b(b0kVar).b.b), lee1Var5, j3, a0e1.a(), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2016);
            b0kVar.r(false);
        } else {
            b0kVar.i0(2032420899);
            b0kVar.r(false);
        }
        if (z12) {
            b0kVar.i0(2032488045);
            String strO1 = cwl1.o0(b0kVar, 2131962402);
            lee1 lee1Var6 = cbx.d(b0kVar).h;
            long j4 = cbx.a(b0kVar).b.a;
            qim0 qim0VarN4 = anm1.N("comments-show-all", u291.f(nim0Var, 1.0f));
            if (i7 <= 256) {
            }
            objT11 = b0kVar.T();
            if (z7) {
                objT11 = new thh(iu30Var, (byte) 13);
                b0kVar.s0(objT11);
            } else {
                objT11 = new thh(iu30Var, (byte) 13);
                b0kVar.s0(objT11);
            }
            qim0 qim0VarX13 = bin.x(qim0VarN4, false, (String) null, (pm31) null, (idn0) null, (Function0) objT11, 15);
            cvx cvxVar16 = cbx.b(b0kVar).b;
            uwo1.e(strO1, uyn1.x(qim0VarX13, 16.0f), lee1Var6, j4, a0e1.a(), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2016);
            b0kVar.r(false);
        } else {
            b0kVar.i0(2032980387);
            b0kVar.r(false);
        }
        b0kVar.r(true);
        if (rphVar2.j) {
            b0kVar.i0(-2070574476);
            qim0 qim0VarD7 = u291.d(nim0Var, 1.0f);
            objT10 = b0kVar.T();
            if (objT10 == obj11) {
                objT10 = nyf.U0;
                b0kVar.s0(objT10);
            }
            qim0 qim0VarX14 = bin.x(qim0VarD7, false, (String) null, (pm31) null, (idn0) null, (Function0) objT10, 14);
            gfh0VarC5 = t1c.c(tl3Var, false);
            iHashCode7 = Long.hashCode(((x340) b0kVar).T);
            xos0VarM7 = b0kVar.m();
            qim0VarE7 = zr7.E(b0kVar, qim0VarX14);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar.m0();
            if (((x340) b0kVar).S) {
                b0kVar.l(function1);
            } else {
                b0kVar.v0();
            }
            nko1.H(gfh0VarC5, b0kVar, vu30Var2);
            nko1.H(xos0VarM7, b0kVar, lljVar6);
            x0d.q(iHashCode7, b0kVar, lljVar2, b0kVar);
            nko1.H(qim0VarE7, b0kVar, lljVar3);
            yto1.e(0, 0, 3, b0kVar, (qim0) null);
            z6 = true;
            b0kVar.r(true);
            b0kVar.r(false);
        } else {
            z6 = true;
            b0kVar.i0(-2070385159);
            b0kVar.r(false);
        }
        b0kVar.r(z6);
        return rih1Var;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jE;
        lwj lwjVar = (lwj) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        owj owjVar = this.b;
        e7q e7qVar = owjVar.d;
        if (lwjVar.h == 2) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-662753346);
            x340Var2.r(false);
            jE = z4p1.e(lwjVar.d);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-662751226);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var3).a.c;
            x340Var3.r(false);
            jE = j;
        }
        x340 x340Var4 = x340Var;
        boolean zG = x340Var4.g(e7qVar) | ((((iIntValue & 896) ^ 384) > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256);
        Object objT = x340Var4.T();
        if (zG || objT == fkj0.X) {
            objT = e7qVar.a(new nwj(iu30Var, (byte) 0));
            x340Var4.s0(objT);
        }
        irn1.u(anm1.N("compose-read-along-page", nim0.a), apo.r(1116887541, new qi6(jE, (u060) objT, lwjVar, (byte) 4), x340Var4), apo.r(1239791478, new qi6(owjVar, lwjVar, jE, (byte) 5), x340Var4), (erl1) null, apo.r(-1818611781, new no9(jE, owjVar, lwjVar, (byte) 2), x340Var4), x340Var4, 25008, 8);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        aw70 aw70Var = (aw70) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        rwj rwjVar = this.b;
        i3h i3hVar = (i3h) rwjVar.f;
        boolean z = (((iIntValue & 112) ^ 48) > 32 && x340Var.g(aw70Var)) || (iIntValue & 48) == 32;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == m4cVar) {
            objT = ywo1.u(aw70Var, (agc0) rwjVar.d);
            x340Var2.s0(objT);
        }
        eq01 eq01Var = (eq01) objT;
        boolean zG = x340Var2.g(i3hVar);
        Object objT2 = x340Var2.T();
        if (zG || objT2 == m4cVar) {
            ptj ptjVar = new ptj(1, i3hVar, g3h.class, "getDrawable", "getDrawable(Lcom/spotify/recents/recentsmodels/DestinationArtworkModel$CollectionType;)Landroid/graphics/drawable/Drawable;", 0, (byte) 1);
            x340Var2.s0(ptjVar);
            objT2 = ptjVar;
        }
        gw70 gw70Var = (gw70) rwjVar.e;
        iu30 iu30Var2 = (nla0) objT2;
        idd1 idd1Var = (idd1) rwjVar.g;
        int i = (iIntValue & 896) ^ 384;
        boolean z2 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var2.T();
        if (z2 || objT3 == m4cVar) {
            objT3 = new erj(iu30Var, (byte) 11);
            x340Var2.s0(objT3);
        }
        Function0 function0 = (Function0) objT3;
        boolean z3 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT4 = x340Var2.T();
        if (z3 || objT4 == m4cVar) {
            objT4 = new erj(iu30Var, (byte) 12);
            x340Var2.s0(objT4);
        }
        wwo1.g(eq01Var, gw70Var, iu30Var2, idd1Var, function0, (Function0) objT4, (qim0) null, x340Var2, 0);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jE;
        String string;
        gyj gyjVar = (gyj) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        iyj iyjVar = this.b;
        e7q e7qVar = iyjVar.c;
        if (gyjVar.g == 2) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1500626803);
            x340Var2.r(false);
            jE = z4p1.e(gyjVar.e);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1500624683);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var3).a.c;
            x340Var3.r(false);
            jE = j;
        }
        x340 x340Var4 = x340Var;
        Context context = (Context) x340Var4.k(AndroidCompositionLocals_androidKt.b);
        Object objT = x340Var4.T();
        m4c m4cVar = fkj0.X;
        jy31 jy31Var = jy31.a;
        if (objT == m4cVar) {
            objT = v8r.q(jy31Var);
            x340Var4.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var4.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(new sw31(z6x.a, false));
            x340Var4.s0(objT2);
        }
        ven0 ven0Var2 = (ven0) objT2;
        boolean zG = x340Var4.g((ly31) ven0Var.getValue());
        Object objT3 = x340Var4.T();
        if (zG || objT3 == m4cVar) {
            ky31 ky31Var = (ly31) ven0Var.getValue();
            if (u890.j(ky31Var, jy31Var)) {
                string = context.getResources().getQuantityString(2131820722, 0, 0);
            } else if (ky31Var instanceof ky31) {
                Resources resources = context.getResources();
                int i = ky31Var.a;
                string = resources.getQuantityString(2131820722, i, Integer.valueOf(i));
            } else {
                if (!u890.j(ky31Var, iy31.a)) {
                    eg.o();
                    return null;
                }
                string = context.getString(2131958374);
            }
            objT3 = string;
            x340Var4.s0(objT3);
        }
        String str = (String) objT3;
        ven0 ven0VarS = v8r.s(iu30Var, x340Var4);
        boolean zG2 = x340Var4.g(e7qVar);
        Object objT4 = x340Var4.T();
        if (zG2 || objT4 == m4cVar) {
            objT4 = e7qVar.a(new i6b(ven0VarS, (byte) 16));
            x340Var4.s0(objT4);
        }
        irn1.u(anm1.N("compose-selection-page", nim0.a), apo.r(-1619176828, new cg6(jE, (u060) objT4, context, str), x340Var4), apo.r(-1496272891, new rb9(iyjVar, jE, iu30Var, ven0Var2, ven0Var), x340Var4), (erl1) null, apo.r(-259708854, new oo9(jE, gyjVar, iyjVar, ven0Var, ven0Var2, (byte) 1), x340Var4), x340Var4, 25008, 8);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        idk idkVar = (jdk) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        tdk tdkVar = this.b;
        tdkVar.N0.a(x340Var, 0);
        sck sckVar = (sck) ((hrr0) tdkVar.Z.k).getValue();
        if (sckVar == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-984335366);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-984335365);
            p9k p9kVar = (p9k) tdkVar.T0.getValue();
            String str = sckVar.b;
            String str2 = sckVar.c;
            String string = tdkVar.Q0.getString(2131956607);
            boolean zI = x340Var3.i(tdkVar);
            Object objT = x340Var3.T();
            if (zI || objT == m4cVar) {
                objT = new sdk(tdkVar, (byte) 0);
                x340Var3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI2 = x340Var3.i(tdkVar);
            Object objT2 = x340Var3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new sdk(tdkVar, (byte) 1);
                x340Var3.s0(objT2);
            }
            otw.c(p9kVar, new o9k(str, str2, string, function0, (Function0) objT2), (qim0) null, (ipb1) null, x340Var3, 8, 12);
            x340Var3.r(false);
        }
        if (idkVar instanceof idk) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-983780155);
            int iC = l1d.C(idkVar.b);
            if (iC == 0) {
                x340Var4.i0(799554378);
                sbl.g((qim0) null, x340Var4, 0);
                x340Var4.r(false);
            } else if (iC != 1) {
                if (iC != 2) {
                    throw p3d1.k(x340Var4, 799549149, false);
                }
                x340Var4.i0(799554378);
                sbl.g((qim0) null, x340Var4, 0);
                x340Var4.r(false);
            } else {
                x340Var4.i0(799550963);
                sbl.f((qim0) null, x340Var4, 0);
                x340Var4.r(false);
            }
            x340Var4.r(false);
        } else if (idkVar instanceof gdk) {
            x340 x340Var5 = x340Var;
            x340Var5.i0(799556938);
            x340Var5.r(false);
        } else {
            if (!(idkVar instanceof hdk)) {
                throw p3d1.k(x340Var, 799547720, false);
            }
            x340 x340Var6 = x340Var;
            x340Var6.i0(-983505588);
            rck.c((hdk) idkVar, tdkVar.a, iu30Var, (qim0) null, false, x340Var6, ((iIntValue >> 3) & 14) | (iIntValue & 896), 24);
            x340Var6.r(false);
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        bek bekVar = (bek) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qj0 qj0Var = this.b;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(bekVar) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            mod.b(oi7.a.a((gw70) qj0Var.d), apo.r(-75085024, new mzj(bekVar, iu30Var, qj0Var, (byte) 6), x340Var2), x340Var2, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        kiv kivVar = oi7.a;
        tgk tgkVar = this.b;
        mod.b(kivVar.a(tgkVar.a), apo.r(-625373163, new y46((hqk) obj2, tgkVar, (iu30) obj3, (byte) 2), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gok gokVar = (gok) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        tm tmVar = this.b;
        if (gokVar instanceof eok) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1807920245);
            mod.b(oi7.a.a((gw70) tmVar.e), apo.r(130893594, new mzj(gokVar, tmVar, iu30Var, (byte) 10), x340Var2), x340Var2, 56);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1808466093);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        trk trkVar = (trk) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        ven0 ven0VarS = v8r.s((iu30) obj3, x340Var);
        gw70 gw70Var = (gw70) this.b.c;
        x340 x340Var2 = x340Var;
        boolean zG = x340Var2.g(gw70Var);
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            objT = new ei00(gw70Var, new f4g(ven0VarS, (byte) 19));
            x340Var2.s0(objT);
        }
        otw.c((ei00) objT, new ci00(2, trkVar.c, trkVar.d, trkVar.a, trkVar.b), (qim0) null, (ipb1) null, x340Var2, 8, 12);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vrk vrkVar = (vrk) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        tm tmVar = this.b;
        uwr uwrVar = cbx.a;
        long jA = cbx.a(x340Var).a.b.a();
        String str = vrkVar.a;
        boolean z = (((iIntValue & 112) ^ 48) > 32 && x340Var.i(vrkVar)) || (iIntValue & 48) == 32;
        x340 x340Var2 = x340Var;
        boolean zI = z | x340Var2.i(tmVar) | x340Var2.f(jA);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            wn2 wn2Var = new wn2(vrkVar, tmVar, jA, (lnm) null, (byte) 5);
            x340Var2.s0(wn2Var);
            objT = wn2Var;
        }
        qxd0.t(str, x340Var2, (vu30) objT);
        i1o1.e((tyq) ((idd1) tmVar.e).getValue(), vrkVar.b, (d0r) tmVar.c, (qim0) null, (ipb1) null, (vu30) null, (xu30) null, 0, (xu30) null, x340Var2, 64, 252);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        isk iskVar = (isk) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        umf0 umf0Var = this.b;
        fqg0 fqg0Var = (fqg0) umf0Var.e;
        Object obj6 = iskVar.a;
        if (iskVar.b) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1270522699);
            otw.c((maa) umf0Var.d, obj6, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (fqg0Var != null) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1270661610);
            otw.c(fqg0Var, obj6, (qim0) null, (ipb1) null, x340Var3, 0, 12);
            x340Var3.r(false);
        } else {
            x340 x340Var4 = x340Var;
            x340Var4.i0(1270757896);
            x340Var4.r(false);
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        ogl oglVar = this.b;
        cvd1.b((lgl) obj2, oglVar.a, oglVar.b, oglVar.c, (iu30) obj3, (b0k) obj4, ((iIntValue >> 3) & 14) | ((iIntValue << 6) & 57344));
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        twl twlVar = (twl) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        kwl kwlVar = this.b;
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(twlVar) : x340Var.i(twlVar) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            mod.c(new ely0[]{pxl.b.a(kwlVar.Q0), pxl.c.a(kwlVar.Z), pxl.d.a(kwlVar.R0), pxl.e.a(kwlVar.S0), oi7.a.a(kwlVar.i), q7f0.a.a(kwlVar.t), q7f0.b.a(kwlVar.X), pxl.f.a(kwlVar.Y)}, apo.r(1217492221, new mzj(twlVar, kwlVar, iu30Var, (byte) 17), x340Var2), x340Var2, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        twl twlVar = (twl) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        uwl uwlVar = this.b;
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(twlVar) : x340Var.i(twlVar) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            mod.c(new ely0[]{pxl.b.a((ymd) uwlVar.Z), pxl.c.a((zhy) uwlVar.Y), pxl.d.a((u710) uwlVar.N0), pxl.e.a((u710) uwlVar.O0), oi7.a.a((gw70) uwlVar.g), q7f0.a.a((woa) uwlVar.h), q7f0.b.a((kma) uwlVar.i), pxl.f.a((o7h1) uwlVar.X)}, apo.r(-940466967, new mzj(twlVar, uwlVar, iu30Var, (byte) 18), x340Var2), x340Var2, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        d1m d1mVar = this.b;
        zpn1.c((w0m) obj2, d1mVar.a, d1mVar.b, (iu30) obj3, (b0k) obj4, ((iIntValue >> 3) & 14) | 64 | ((iIntValue << 3) & 7168));
        return rih1.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        k3m k3mVar = this.b;
        bqn1.d((s2m) obj2, k3mVar.a, k3mVar.e, k3mVar.c, (vky) k3mVar.g.getValue(), k3mVar.b, k3mVar.f, (iu30) obj3, (b0k) obj4, ((iIntValue >> 3) & 14) | 262144 | ((iIntValue << 15) & 29360128));
        return rih1.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        this.b.e((iu30) obj3, (b0k) obj4, (iIntValue >> 6) & 14);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        x4i1 x4i1Var;
        y0q0 y0q0Var;
        String strO0;
        String str;
        boolean z;
        Function0 function0;
        j8m j8mVar;
        String str2;
        n8m n8mVar;
        String str3;
        n8m n8mVar2;
        j8m j8mVar2;
        boolean z2;
        j2i j2iVarR;
        j2i j2iVarR2;
        byte b = this.a;
        String strY0 = "";
        nim0 nim0Var = nim0.a;
        byte b2 = 8;
        rih1 rih1Var = rih1.a;
        n8m n8mVar3 = this.b;
        switch (b) {
            case 0:
                qxg qxgVar = (qxg) obj2;
                x340 x340Var = (b0k) obj4;
                ((Number) obj5).intValue();
                if (((Boolean) rwq.g((php0) ((sks0) ((br0) n8mVar3).c).b, Boolean.FALSE, (o8n) null, x340Var, 48, 2).getValue()).booleanValue() && (x4i1Var = qxgVar.a) != null) {
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var).a.c;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    gra graVar = een.d;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    x340 x340Var2 = x340Var;
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
                    hzj.A.getClass();
                    x340 x340Var3 = x340Var;
                    if (x340Var3.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var3.m0();
                    boolean z3 = x340Var3.S;
                    n4k n4kVar = hmb0.t1;
                    if (z3) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    qim0 qim0VarD2 = i541.D(h2c.a.a(nim0Var, een.Y), 0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, sgc1.u(1.0f, 1.0f), (hw61) null, false, 0L, 0L, 0, (f2b) null, 1047548);
                    Object objT = x340Var3.T();
                    String str4 = "";
                    if (objT == fkj0.X) {
                        objT = kna.O0;
                        x340Var3.s0(objT);
                    }
                    qim0 qim0VarX = j9k1.x(qim0VarD2, (xu30) objT);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM2 = x340Var3.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    qim0 qim0VarX2 = uyn1.x(dug.f(nim0Var, j, er31.a), 3.3600001f);
                    gfh0 gfh0VarC3 = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM3 = x340Var3.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX2);
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    i3a.l(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    String str5 = x4i1Var.f;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    String str6 = x4i1Var.b;
                    String str7 = x4i1Var.c;
                    str4 = str7 != null ? str7 : "";
                    Integer num = x4i1Var.g;
                    fc11.a(mqo1.A(Collections.singletonList(new phx(num != null ? z4p1.e(num.intValue()) : u7h.k, str5, str6, str4))), (qim0) null, hcx.d, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var, 392, 506);
                    us71.m(x340Var3, true, true, true);
                }
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                d7e.k(((xyg) obj2).c, idi.a, idi.b, apo.r(119914246, new ip0((byte) 10, (tm) n8mVar3, (iu30) obj3), b0kVar), b0kVar, 3504, 0);
                return rih1Var;
            case 2:
                e5h e5hVar = (e5h) obj2;
                iu30 iu30Var = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                g5h g5hVar = (g5h) n8mVar3;
                x340 x340Var4 = (b0k) obj4;
                Object objT2 = x340Var4.T();
                m4c m4cVar = fkj0.X;
                if (objT2 == m4cVar) {
                    objT2 = m4h.c;
                    x340Var4.s0(objT2);
                }
                qxd0.i(rih1Var, (iu30) objT2, x340Var4);
                if (ihc1.Z0(e5hVar.a, "?").equals("spotify:collection:tracks")) {
                    x340Var4.i0(-1443528428);
                    x340Var4.r(false);
                    y0q0Var = null;
                } else {
                    x340Var4.i0(-1443480564);
                    y0q0 y0q0VarW = w3p1.w(e5hVar.a, e5hVar.g, e5hVar.h, g5hVar.b, g5hVar.c, g5hVar.g, g5hVar.h, g5hVar.i, g5hVar.t, g5hVar.X, x340Var4, 0);
                    x340Var4.r(false);
                    y0q0Var = y0q0VarW;
                }
                int iOrdinal = e5hVar.i.ordinal();
                if (iOrdinal == 0) {
                    x340Var4.i0(-877827072);
                    int i = (iIntValue & 896) ^ 384;
                    boolean zI = ((i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var4.i(e5hVar);
                    Object objT3 = x340Var4.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new f5h(iu30Var, e5hVar, (byte) 0);
                        x340Var4.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zI2 = ((i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var4.i(e5hVar);
                    Object objT4 = x340Var4.T();
                    if (zI2 || objT4 == m4cVar) {
                        objT4 = new f5h(iu30Var, e5hVar, (byte) 1);
                        x340Var4.s0(objT4);
                    }
                    Function0 function2 = (Function0) objT4;
                    boolean zI3 = ((i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var4.i(e5hVar);
                    Object objT5 = x340Var4.T();
                    if (zI3 || objT5 == m4cVar) {
                        objT5 = new f5h(iu30Var, e5hVar, (byte) 2);
                        x340Var4.s0(objT5);
                    }
                    Function0 function3 = (Function0) objT5;
                    boolean zI4 = ((i > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var4.i(e5hVar);
                    Object objT6 = x340Var4.T();
                    if (zI4 || objT6 == m4cVar) {
                        objT6 = new a7e(iu30Var, e5hVar);
                        x340Var4.s0(objT6);
                    }
                    w3p1.b(e5hVar, y0q0Var, function1, function2, function3, (vu30) objT6, g5hVar.g, g5hVar.a, g5hVar.d, g5hVar.e, g5hVar.f.e() && !e5hVar.j, (qim0) null, x340Var4, (iIntValue >> 3) & 14);
                    x340Var4.r(false);
                } else {
                    if (iOrdinal != 1) {
                        throw p3d1.k(x340Var4, -877829115, false);
                    }
                    x340Var4.i0(-877789753);
                    d0r d0rVar = g5hVar.g;
                    boolean zI5 = ((((iIntValue & 896) ^ 384) > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var4.i(e5hVar);
                    Object objT7 = x340Var4.T();
                    if (zI5 || objT7 == m4cVar) {
                        objT7 = new f5h(iu30Var, e5hVar, (byte) 3);
                        x340Var4.s0(objT7);
                    }
                    n9p1.b(e5hVar, y0q0Var, d0rVar, (Function0) objT7, g5hVar.e, (qim0) null, x340Var4, (iIntValue >> 3) & 14);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 3:
                i5h i5hVar = (i5h) obj2;
                ((Number) obj5).intValue();
                boolean z4 = i5hVar.q;
                d0r d0rVar2 = ((j5h) n8mVar3).a;
                x340 x340Var5 = (b0k) obj4;
                boolean zG = x340Var5.g(i5hVar.a) | x340Var5.g(d0rVar2);
                Object objT8 = x340Var5.T();
                if (zG || objT8 == fkj0.X) {
                    objT8 = new hho(d0rVar2);
                    x340Var5.s0(objT8);
                }
                hho hhoVar = (hho) objT8;
                o3r o3rVar = l5h.a;
                int iC = l1d.C(i5hVar.b);
                if (iC == 0) {
                    x340Var5.i0(-492887928);
                    strO0 = cwl1.o0(x340Var5, 2131958256);
                    if (z4 && (str = i5hVar.f) != null) {
                        strO0 = xcg1.i(strO0, " • ", str);
                    }
                    x340Var5.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var5, 676835702, false);
                    }
                    x340Var5.i0(-492587724);
                    String str8 = i5hVar.d;
                    if (i5hVar.h) {
                        z = false;
                        strO0 = x0d.k(x340Var5, 676849806, 2131958258, x340Var5, false);
                    } else {
                        z = false;
                        if (!z4 || str8 == null) {
                            strO0 = x0d.k(x340Var5, 676859461, 2131958274, x340Var5, false);
                        } else {
                            x340Var5.i0(676854725);
                            strO0 = cwl1.n0(2131958257, new Object[]{str8}, x340Var5);
                            x340Var5.r(false);
                        }
                    }
                    x340Var5.r(z);
                }
                o5h.b(i5hVar.c, strO0, i5hVar.k, i5hVar.o, i5hVar.a, i5hVar.i, i5hVar.j, u291.f(nim0Var, 1.0f), i5hVar.f24p, i5hVar.q, i5hVar.r, i5hVar.l, z4 && (!i5hVar.m || u890.j(i5hVar.n, Boolean.FALSE)), apo.r(-1789269893, new a7e(hhoVar, i5hVar, (byte) 24), x340Var5), i5hVar.s, x340Var5, 0);
                return rih1Var;
            case 4:
                z7h z7hVar = (z7h) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                c8h c8hVar = (c8h) n8mVar3;
                x340 x340Var7 = x340Var6;
                boolean zI6 = ((((iIntValue2 & 896) ^ 384) > 256 && x340Var6.g(iu30Var2)) || (iIntValue2 & 384) == 256) | x340Var7.i(c8hVar);
                Object objT9 = x340Var7.T();
                if (zI6 || objT9 == fkj0.X) {
                    objT9 = new ame(iu30Var2, c8hVar, (byte) 21);
                    x340Var7.s0(objT9);
                }
                cpn1.b(196608, 30, (Function0) objT9, apo.r(-1656783778, new b8h(z7hVar, iu30Var2, (byte) 1), x340Var7), x340Var7, (qim0) null, false, false);
                return rih1Var;
            case 5:
                mhh mhhVar = (mhh) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                uhh uhhVar = (uhh) n8mVar3;
                m4c m4cVar2 = fkj0.X;
                c9 c9Var = wxz0.a;
                int i2 = (iIntValue3 & 896) ^ 384;
                boolean z5 = (i2 > 256 && x340Var8.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                x340 x340Var9 = x340Var8;
                Object objT10 = x340Var9.T();
                if (z5 || objT10 == m4cVar2) {
                    objT10 = new frf(iu30Var3, (byte) 28);
                    x340Var9.s0(objT10);
                }
                Function0 function4 = (Function0) objT10;
                boolean z6 = (i2 > 256 && x340Var9.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                Object objT11 = x340Var9.T();
                if (z6 || objT11 == m4cVar2) {
                    objT11 = new frf(iu30Var3, (byte) 29);
                    x340Var9.s0(objT11);
                }
                Function0 function5 = (Function0) objT11;
                boolean z7 = (i2 > 256 && x340Var9.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                Object objT12 = x340Var9.T();
                if (z7 || objT12 == m4cVar2) {
                    objT12 = new thh(iu30Var3, (byte) 0);
                    x340Var9.s0(objT12);
                }
                Function0 function6 = (Function0) objT12;
                boolean z8 = (i2 > 256 && x340Var9.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                Object objT13 = x340Var9.T();
                if (z8 || objT13 == m4cVar2) {
                    objT13 = new thh(iu30Var3, (byte) 1);
                    x340Var9.s0(objT13);
                }
                Function0 function7 = (Function0) objT13;
                boolean z9 = (i2 > 256 && x340Var9.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                Object objT14 = x340Var9.T();
                if (z9 || objT14 == m4cVar2) {
                    objT14 = new thh(iu30Var3, (byte) 2);
                    x340Var9.s0(objT14);
                }
                Function0 function8 = (Function0) objT14;
                boolean zI7 = x340Var9.i(uhhVar) | x340Var9.i(mhhVar);
                Object objT15 = x340Var9.T();
                if (zI7 || objT15 == m4cVar2) {
                    objT15 = new ame(uhhVar, mhhVar, (byte) 22);
                    x340Var9.s0(objT15);
                }
                Function0 function9 = (Function0) objT15;
                boolean z10 = (i2 > 256 && x340Var9.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                Object objT16 = x340Var9.T();
                if (z10 || objT16 == m4cVar2) {
                    objT16 = new sm(iu30Var3, (byte) 21);
                    x340Var9.s0(objT16);
                }
                r6p1.e(mhhVar, function4, function5, function6, function7, function8, (qim0) null, function9, c9Var, (vu30) objT16, x340Var9, (iIntValue3 >> 3) & 14);
                return rih1Var;
            case 6:
                ulh ulhVar = (ulh) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                ldo ldoVar = (ldo) n8mVar3;
                d0r d0rVar3 = (d0r) ldoVar.d;
                n6p n6pVar = (n6p) ldoVar.c;
                int i3 = (iIntValue4 & 896) ^ 384;
                boolean z11 = (i3 > 256 && x340Var10.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                x340 x340Var11 = x340Var10;
                Object objT17 = x340Var11.T();
                if (z11 || objT17 == m4cVar3) {
                    objT17 = new thh(iu30Var4, (byte) 8);
                    x340Var11.s0(objT17);
                }
                Function0 function10 = (Function0) objT17;
                boolean z12 = (i3 > 256 && x340Var11.g(iu30Var4)) || (iIntValue4 & 384) == 256;
                Object objT18 = x340Var11.T();
                if (z12 || objT18 == m4cVar3) {
                    objT18 = new thh(iu30Var4, (byte) 9);
                    x340Var11.s0(objT18);
                }
                i8p1.d(ulhVar, d0rVar3, n6pVar, function10, (Function0) objT18, (qim0) null, x340Var11, (iIntValue4 >> 3) & 14);
                return rih1Var;
            case 7:
                return a(obj, obj2, obj3, obj4, obj5);
            case 8:
                vnh vnhVar = (vnh) obj2;
                int iIntValue5 = ((Number) obj5).intValue();
                x340 x340Var12 = (b0k) obj4;
                iac0 iac0Var = (iac0) x340Var12.k(jfe0.a);
                umf0 umf0Var = (umf0) n8mVar3;
                Object objT19 = x340Var12.T();
                Object obj6 = fkj0.X;
                if (objT19 == obj6) {
                    objT19 = new j1r0(iac0Var, (los) umf0Var.d);
                    x340Var12.s0(objT19);
                }
                j1r0 j1r0Var = (j1r0) objT19;
                Object[] objArr = new Object[0];
                Object objT20 = x340Var12.T();
                if (objT20 == obj6) {
                    objT20 = nyf.V0;
                    x340Var12.s0(objT20);
                }
                ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT20, x340Var12, 48);
                boolean zI8 = x340Var12.i(ven0Var);
                Object objT21 = x340Var12.T();
                if (zI8 || objT21 == obj6) {
                    objT21 = new vk1(ven0Var, (lnm) null, (byte) 7);
                    x340Var12.s0(objT21);
                }
                qxd0.t(rih1Var, x340Var12, (vu30) objT21);
                boolean zG2 = x340Var12.g(vnhVar.b) | x340Var12.g(vnhVar.a);
                Object objT22 = x340Var12.T();
                if (zG2 || objT22 == obj6) {
                    w6p w6pVar = (w6p) umf0Var.e;
                    String str9 = vnhVar.b;
                    lik1 lik1Var = vnhVar.a;
                    boolean z13 = vnhVar.d;
                    vjh vjhVar = new vjh(umf0Var, (byte) 2);
                    em0 em0Var = (em0) w6pVar.a.c;
                    yqg yqgVar = (yqg) ((wph) em0Var.b).a.get();
                    c8o.l(yqgVar);
                    wph wphVar = (wph) em0Var.b;
                    kly0 kly0Var = wphVar.b;
                    kly0 kly0Var2 = wphVar.e;
                    kly0 kly0Var3 = wphVar.m;
                    kly0 kly0Var4 = wphVar.n;
                    hwe1 hwe1Var = (hwe1) kly0Var4.get();
                    c8o.l(hwe1Var);
                    cwe1 cwe1Var = (cwe1) kly0Var3.get();
                    c8o.l(cwe1Var);
                    xjh xjhVar = (xjh) wphVar.i.get();
                    c8o.l(xjhVar);
                    f4q f4qVar = (f4q) wphVar.j.get();
                    c8o.l(f4qVar);
                    Scheduler scheduler = (Scheduler) wphVar.G.get();
                    c8o.l(scheduler);
                    i4q i4qVar = (i4q) wphVar.C.get();
                    c8o.l(i4qVar);
                    tjh tjhVarA = wphVar.a();
                    c8o.l(tjhVarA);
                    cwe1 cwe1Var2 = (cwe1) kly0Var3.get();
                    c8o.l(cwe1Var2);
                    hwe1 hwe1Var2 = (hwe1) kly0Var4.get();
                    c8o.l(hwe1Var2);
                    pn0 pn0Var = (pn0) wphVar.r.get();
                    c8o.l(pn0Var);
                    luk lukVar = (luk) wphVar.v.get();
                    c8o.l(lukVar);
                    zd1 zd1Var = new zd1(tjhVarA, cwe1Var2, hwe1Var2, new myq0(pn0Var, new wjh(lukVar), (byte) 8), (byte) 2);
                    tjh tjhVarA2 = wphVar.a();
                    c8o.l(tjhVarA2);
                    yqg yqgVar2 = (yqg) wphVar.a.get();
                    c8o.l(yqgVar2);
                    cwe1 cwe1Var3 = (cwe1) kly0Var3.get();
                    c8o.l(cwe1Var3);
                    hwe1 hwe1Var3 = (hwe1) kly0Var4.get();
                    c8o.l(hwe1Var3);
                    pn0 pn0Var2 = (pn0) wphVar.r.get();
                    c8o.l(pn0Var2);
                    luk lukVar2 = (luk) wphVar.v.get();
                    c8o.l(lukVar2);
                    yon yonVar = new yon(tjhVarA2, yqgVar2, cwe1Var3, hwe1Var3, new myq0(pn0Var2, new wjh(lukVar2), (byte) 8));
                    tjh tjhVarA3 = wphVar.a();
                    c8o.l(tjhVarA3);
                    h1e0 h1e0Var = new h1e0(tjhVarA3, (byte) 0);
                    tjh tjhVarA4 = wphVar.a();
                    c8o.l(tjhVarA4);
                    h1e0 h1e0Var2 = new h1e0(tjhVarA4, (byte) 1);
                    tjh tjhVarA5 = wphVar.a();
                    c8o.l(tjhVarA5);
                    h1e0 h1e0Var3 = new h1e0(tjhVarA5, (byte) 2);
                    lzn0 lzn0Var = (lzn0) wphVar.c.get();
                    c8o.l(lzn0Var);
                    f5b f5bVar = new f5b(lzn0Var, (byte) 13);
                    q6p q6pVar = (q6p) ((jly0) em0Var.f).get();
                    tjh tjhVarA6 = wphVar.a();
                    c8o.l(tjhVarA6);
                    h1e0 h1e0Var4 = new h1e0(tjhVarA6, (byte) 3);
                    r6p r6pVar = (r6p) ((jly0) em0Var.g).get();
                    jjz jjzVar = (jjz) kly0Var2.get();
                    c8o.l(jjzVar);
                    Context context = (Context) kly0Var.get();
                    c8o.l(context);
                    i8h1 i8h1Var = (i8h1) wphVar.d.get();
                    c8o.l(i8h1Var);
                    yon yonVar2 = new yon(jjzVar, context, new m021(i8h1Var));
                    jjz jjzVar2 = (jjz) kly0Var2.get();
                    c8o.l(jjzVar2);
                    x981 x981Var = new x981(jjzVar2, ((Boolean) wphVar.H.get()).booleanValue(), (byte) 3);
                    pyd1 pyd1Var = (pyd1) wphVar.f.get();
                    c8o.l(pyd1Var);
                    tr41 tr41Var = new tr41(pyd1Var, (byte) 19);
                    gpo0 gpo0Var = (gpo0) wphVar.B.get();
                    c8o.l(gpo0Var);
                    Context context2 = (Context) kly0Var.get();
                    c8o.l(context2);
                    NotificationManager notificationManager = (NotificationManager) wphVar.s.get();
                    c8o.l(notificationManager);
                    qg7 qg7Var = new qg7(gpo0Var, context2, notificationManager, (byte) 23);
                    pn0 pn0Var3 = (pn0) wphVar.r.get();
                    c8o.l(pn0Var3);
                    Flowable flowable = (Flowable) wphVar.u.get();
                    c8o.l(flowable);
                    tnh tnhVar = new tnh(scheduler, i4qVar, zd1Var, yonVar, h1e0Var, h1e0Var2, h1e0Var3, f5bVar, q6pVar, h1e0Var4, r6pVar, yonVar2, x981Var, tr41Var, qg7Var, new g2x0(pn0Var3, flowable, (byte) 16));
                    o6p o6pVar = (o6p) ((jly0) em0Var.h).get();
                    x6p x6pVar = (x6p) ((jly0) em0Var.i).get();
                    tjh tjhVarA7 = wphVar.a();
                    c8o.l(tjhVarA7);
                    jqh jqhVar = (jqh) wphVar.k.get();
                    c8o.l(jqhVar);
                    bqh bqhVar = (bqh) wphVar.z.get();
                    c8o.l(bqhVar);
                    luk lukVar3 = (luk) wphVar.v.get();
                    c8o.l(lukVar3);
                    objT22 = new xmh(yqgVar, hwe1Var, cwe1Var, xjhVar, f4qVar, tnhVar, o6pVar, x6pVar, tjhVarA7, jqhVar, bqhVar, new fo4(false, false, false, lukVar3), (s6p) ((jly0) em0Var.t).get(), str9, lik1Var, z13, vjhVar);
                    x340Var12.s0(objT22);
                }
                xmh xmhVar = (xmh) objT22;
                boolean zH = ((((iIntValue5 & 112) ^ 48) > 32 && x340Var12.g(vnhVar)) || (iIntValue5 & 48) == 32) | x340Var12.h(((Boolean) ven0Var.getValue()).booleanValue());
                Object objT23 = x340Var12.T();
                if (zH || objT23 == obj6) {
                    objT23 = new umh(vnhVar.c, vnhVar.e, ((Boolean) ven0Var.getValue()).booleanValue());
                    x340Var12.s0(objT23);
                }
                otw.c(xmhVar, (umh) objT23, (qim0) null, (ipb1) null, x340Var12, 0, 12);
                boolean zI9 = x340Var12.i(j1r0Var);
                Object objT24 = x340Var12.T();
                if (zI9 || objT24 == obj6) {
                    objT24 = new syf(j1r0Var, (byte) 26);
                    x340Var12.s0(objT24);
                }
                qxd0.i(iac0Var, (iu30) objT24, x340Var12);
                return rih1Var;
            case 9:
                jwh jwhVar = (jwh) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                ((Number) obj5).intValue();
                owh owhVar = (owh) n8mVar3;
                if (jwhVar.b.isEmpty()) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(553315363);
                    x340Var14.r(false);
                } else {
                    x340 x340Var15 = x340Var13;
                    x340Var15.i0(552235199);
                    mod.c(new ely0[]{oi7.a.a(owhVar.a), d1e.b.a(owhVar.c), q7f0.a.a(owhVar.d), q7f0.b.a(owhVar.e)}, apo.r(-1314554428, new a7e(jwhVar, iu30Var5, (byte) 28), x340Var15), x340Var15, 56);
                    x340Var15.r(false);
                }
                return rih1Var;
            case 10:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                pt ptVar = (pt) n8mVar3;
                mod.c(new ely0[]{oi7.a.a((gw70) ptVar.d), d1e.b.a((zhy) ptVar.g), q7f0.a.a((woa) ptVar.e), q7f0.b.a((kma) ptVar.f)}, apo.r(-34875521, new a7e((twh) obj2, (iu30) obj3, (byte) 29), b0kVar2), b0kVar2, 56);
                return rih1Var;
            case 11:
                return d(obj, obj2, obj3, obj4, obj5);
            case 12:
                return e(obj, obj2, obj3, obj4, obj5);
            case 13:
                return f(obj, obj2, obj3, obj4, obj5);
            case 14:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                pt ptVar2 = (pt) n8mVar3;
                mod.b(oi7.a.a((gw70) ptVar2.e), apo.r(-2102006953, new mzj((a9k) obj2, ptVar2, (iu30) obj3, (byte) 4), b0kVar3), b0kVar3, 56);
                return rih1Var;
            case 15:
                return g(obj, obj2, obj3, obj4, obj5);
            case 16:
                return h(obj, obj2, obj3, obj4, obj5);
            case 17:
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                wek wekVar = (wek) n8mVar3;
                mod.b(oi7.a.a(wekVar.c), apo.r(185235279, new mzj((uek) obj2, (iu30) obj3, wekVar, b2), b0kVar4), b0kVar4, 56);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return i(obj, obj2, obj3, obj4, obj5);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return j(obj, obj2, obj3, obj4, obj5);
            case 20:
                return k(obj, obj2, obj3, obj4, obj5);
            case 21:
                return m(obj, obj2, obj3, obj4, obj5);
            case 22:
                return n(obj, obj2, obj3, obj4, obj5);
            case 23:
                return o(obj, obj2, obj3, obj4, obj5);
            case 24:
                return p(obj, obj2, obj3, obj4, obj5);
            case 25:
                return q(obj, obj2, obj3, obj4, obj5);
            case 26:
                return r(obj, obj2, obj3, obj4, obj5);
            case 27:
                return s(obj, obj2, obj3, obj4, obj5);
            case 28:
                return t(obj, obj2, obj3, obj4, obj5);
            default:
                j8m j8mVar3 = (j8m) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                int iIntValue6 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                n8m n8mVar4 = n8mVar3;
                mr4 mr4Var = n8mVar4.f;
                l7c1 l7c1Var = j8mVar3.b;
                String str10 = l7c1Var.b;
                c380 c380Var = l7c1Var.d;
                x340 x340Var16 = (b0k) obj4;
                boolean zG3 = x340Var16.g(str10);
                Object objT25 = x340Var16.T();
                if (zG3 || objT25 == m4cVar4) {
                    objT25 = v8r.q(Boolean.FALSE);
                    x340Var16.s0(objT25);
                }
                ven0 ven0Var2 = (ven0) objT25;
                boolean z14 = mr4Var.b() != lr4.b;
                boolean z15 = mr4Var.b() == lr4.c;
                if (z14) {
                    x340Var16.i0(195034083);
                    boolean zI10 = x340Var16.i(j8mVar3) | ((((iIntValue6 & 896) ^ 384) > 256 && x340Var16.g(iu30Var6)) || (iIntValue6 & 384) == 256);
                    Object objT26 = x340Var16.T();
                    if (zI10 || objT26 == m4cVar4) {
                        objT26 = new gmj((byte) 27, j8mVar3, iu30Var6);
                        x340Var16.s0(objT26);
                    }
                    x340Var16.r(false);
                    function0 = (Function0) objT26;
                } else {
                    x340Var16.i0(195147388);
                    x340Var16.r(false);
                    function0 = null;
                }
                String str11 = l7c1Var.b;
                if (!z14 || c380Var.isEmpty()) {
                    j8mVar = j8mVar3;
                    str2 = str11;
                    n8mVar = n8mVar4;
                    str3 = null;
                } else {
                    if (c380Var.isEmpty()) {
                        j8mVar = j8mVar3;
                        str2 = str11;
                        n8mVar = n8mVar4;
                    } else {
                        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                        int i4 = 0;
                        for (Object obj7 : c380Var) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                p7h.T();
                                throw null;
                            }
                            dka1 dka1Var = (dka1) obj7;
                            String str12 = i4 == 0 ? "(" : "";
                            j8m j8mVar4 = j8mVar3;
                            String str13 = i4 == p7h.L(c380Var) ? ")" : ",";
                            String str14 = dka1Var.a;
                            String str15 = dka1Var.b;
                            String str16 = str11;
                            StringBuilder sbN = gvg.n("[", str12, str14, str13, "](");
                            sbN.append(str15);
                            sbN.append(")");
                            arrayList.add(sbN.toString());
                            i4 = i5;
                            n8mVar4 = n8mVar4;
                            str11 = str16;
                            j8mVar3 = j8mVar4;
                        }
                        j8mVar = j8mVar3;
                        str2 = str11;
                        n8mVar = n8mVar4;
                        strY0 = o7h.y0(arrayList, " ", (String) null, (String) null, (iu30) null, 62);
                    }
                    str3 = strY0;
                }
                j2i j2iVarR3 = apo.r(-303404221, new m8m(z14, z15, n8mVar, str2, j8mVar, ven0Var2, function0, str3), x340Var16);
                if (c380Var.isEmpty() || z14) {
                    n8mVar2 = n8mVar;
                    j8mVar2 = j8mVar;
                    z2 = false;
                    x340Var16.i0(198952141);
                    x340Var16.r(false);
                    j2iVarR = null;
                } else {
                    x340Var16.i0(197928367);
                    n8m n8mVar5 = n8mVar;
                    j8m j8mVar5 = j8mVar;
                    n8mVar2 = n8mVar5;
                    j8mVar2 = j8mVar5;
                    j2iVarR = apo.r(903924703, new bk0(n8mVar5, z15, ven0Var2, j8mVar5, (byte) 18), x340Var16);
                    z2 = false;
                    x340Var16.r(false);
                }
                if (l7c1Var.c.isEmpty()) {
                    x340Var16.i0(199670349);
                    x340Var16.r(z2);
                    j2iVarR2 = null;
                } else {
                    x340Var16.i0(199048273);
                    j2iVarR2 = apo.r(-855435168, new jjk(j8mVar2, n8mVar2, (byte) 16), x340Var16);
                    x340Var16.r(z2);
                }
                grn1.b(6, j2iVarR3, x340Var16, j2iVarR, j2iVarR2, anm1.N("ContentStoryElement.MainContainer", nim0Var));
                return rih1Var;
        }
    }
}
