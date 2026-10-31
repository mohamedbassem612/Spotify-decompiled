package p;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.betamax.transcoder.BetamaxTranscoderException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class boj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ boj(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x01af  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f0 A[LOOP:2: B:151:0x01d3->B:156:0x01f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:162:0x0204  */
    /* JADX WARN: Code duplicated, block: B:165:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0224  */
    /* JADX WARN: Code duplicated, block: B:171:0x0228  */
    /* JADX WARN: Code duplicated, block: B:173:0x022e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0233  */
    /* JADX WARN: Code duplicated, block: B:178:0x023b A[PHI: r37
      0x023b: PHI (r37v6 int) = (r37v1 int), (r37v1 int), (r37v1 int), (r37v7 int) binds: [B:270:0x0392, B:267:0x0389, B:256:0x0370, B:177:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:180:0x0241  */
    /* JADX WARN: Code duplicated, block: B:182:0x0248  */
    /* JADX WARN: Code duplicated, block: B:184:0x0250  */
    /* JADX WARN: Code duplicated, block: B:186:0x0254  */
    /* JADX WARN: Code duplicated, block: B:190:0x026a  */
    /* JADX WARN: Code duplicated, block: B:193:0x0271  */
    /* JADX WARN: Code duplicated, block: B:194:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x027c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0284  */
    /* JADX WARN: Code duplicated, block: B:200:0x0297  */
    /* JADX WARN: Code duplicated, block: B:204:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:205:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02af  */
    /* JADX WARN: Code duplicated, block: B:210:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:212:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:215:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:216:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:220:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:223:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:226:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:235:0x0307  */
    /* JADX WARN: Code duplicated, block: B:269:0x038c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0395  */
    /* JADX WARN: Code duplicated, block: B:274:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:277:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:279:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:281:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:283:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:285:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:286:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:288:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:290:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:292:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:295:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:298:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:299:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:302:0x0400  */
    /* JADX WARN: Code duplicated, block: B:304:0x0404  */
    /* JADX WARN: Code duplicated, block: B:306:0x0407  */
    /* JADX WARN: Code duplicated, block: B:308:0x040e  */
    /* JADX WARN: Code duplicated, block: B:311:0x0415  */
    /* JADX WARN: Code duplicated, block: B:313:0x041d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0424 A[PHI: r2
      0x0424: PHI (r2v61 p.ys31) = (r2v56 p.ys31), (r2v63 p.ys31) binds: [B:342:0x0466, B:312:0x041b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:317:0x0427  */
    /* JADX WARN: Code duplicated, block: B:319:0x042b  */
    /* JADX WARN: Code duplicated, block: B:352:0x047b  */
    /* JADX WARN: Code duplicated, block: B:357:0x048b  */
    /* JADX WARN: Code duplicated, block: B:359:0x048e  */
    /* JADX WARN: Code duplicated, block: B:361:0x0491  */
    /* JADX WARN: Code duplicated, block: B:363:0x0496  */
    /* JADX WARN: Code duplicated, block: B:366:0x049d  */
    /* JADX WARN: Code duplicated, block: B:368:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:373:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:374:0x04af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:375:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:377:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:380:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:382:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:383:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:387:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:389:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:404:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:410:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:415:0x050a  */
    /* JADX WARN: Code duplicated, block: B:417:0x050e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0514 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:420:0x0516  */
    /* JADX WARN: Code duplicated, block: B:421:0x0519  */
    /* JADX WARN: Code duplicated, block: B:423:0x051c  */
    /* JADX WARN: Code duplicated, block: B:428:0x0527  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:430:0x052c  */
    /* JADX WARN: Code duplicated, block: B:433:0x0534  */
    /* JADX WARN: Code duplicated, block: B:436:0x053d  */
    /* JADX WARN: Code duplicated, block: B:437:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:443:0x0552  */
    /* JADX WARN: Code duplicated, block: B:445:0x055e  */
    /* JADX WARN: Code duplicated, block: B:447:0x0562  */
    /* JADX WARN: Code duplicated, block: B:449:0x056e  */
    /* JADX WARN: Code duplicated, block: B:452:0x0580  */
    /* JADX WARN: Code duplicated, block: B:454:0x0585  */
    /* JADX WARN: Code duplicated, block: B:464:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:467:0x05c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:472:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:474:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:475:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:477:0x05ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:481:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:482:0x05fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:483:0x0600  */
    /* JADX WARN: Code duplicated, block: B:485:0x060c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:488:0x0622  */
    /* JADX WARN: Code duplicated, block: B:491:0x063a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:494:0x0641  */
    /* JADX WARN: Code duplicated, block: B:498:0x066a  */
    /* JADX WARN: Code duplicated, block: B:501:0x0681 A[LOOP:3: B:496:0x0664->B:501:0x0681, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:505:0x0692  */
    /* JADX WARN: Code duplicated, block: B:506:0x0695  */
    /* JADX WARN: Code duplicated, block: B:510:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:513:0x06b8 A[LOOP:4: B:508:0x069b->B:513:0x06b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:517:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:520:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:524:0x06d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:527:0x06de  */
    /* JADX WARN: Code duplicated, block: B:530:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:531:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:547:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x01f9 A[EDGE_INSN: B:548:0x01f9->B:158:0x01f9 BREAK  A[LOOP:2: B:151:0x01d3->B:156:0x01f0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x0686 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x068c A[EDGE_INSN: B:550:0x068c->B:503:0x068c BREAK  A[LOOP:3: B:496:0x0664->B:501:0x0681], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x06bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:0x06c1 A[EDGE_INSN: B:552:0x06c1->B:515:0x06c1 BREAK  A[LOOP:4: B:508:0x069b->B:513:0x06b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0118  */
    /* JADX WARN: Code duplicated, block: B:82:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0136  */
    /* JADX WARN: Code duplicated, block: B:89:0x0138 A[PHI: r19
      0x0138: PHI (r19v8 boolean) = (r19v0 boolean), (r19v1 boolean), (r19v1 boolean), (r19v1 boolean), (r19v1 boolean), (r19v2 boolean), (r19v12 boolean) binds: [B:122:0x018a, B:113:0x0173, B:115:0x0177, B:117:0x017d, B:111:0x0170, B:105:0x0161, B:88:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x013a  */
    /* JADX WARN: Code duplicated, block: B:91:0x013d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0141  */
    /* JADX WARN: Code duplicated, block: B:95:0x0145  */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0237, code lost:
    
        if (r2 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0239, code lost:
    
        r37 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x026e, code lost:
    
        if (r2 == null) goto L177;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object a(java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.boj.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:312:0x08f8  */
    public final Object invoke(Object obj, Object obj2) {
        String string;
        Uri uri;
        Long l;
        Long l2;
        ven0 ven0Var;
        es41 es41Var;
        goj0 goj0VarA;
        lsx lsxVar;
        wvh vvhVar;
        jxh jxhVar;
        qwl qwlVar;
        p8g1 p8g1Var;
        byte b = this.a;
        float fE = 0.0f;
        byte b2 = 9;
        nim0 nim0Var = nim0.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                String str = ((vmg1) obj3).b;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g(str);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        if (str != null) {
                            Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
                            String displayName = Locale.forLanguageTag(str).getDisplayName(localeForLanguageTag);
                            if (displayName.length() > 0) {
                                StringBuilder sb = new StringBuilder();
                                char cCharAt = displayName.charAt(0);
                                localeForLanguageTag.getClass();
                                sb.append((Object) eth.U(cCharAt, localeForLanguageTag));
                                sb.append(displayName.substring(1));
                                string = sb.toString();
                            } else {
                                string = displayName;
                            }
                        } else {
                            string = null;
                        }
                        x340Var2.s0(string);
                        objT = string;
                    }
                    String strK = (String) objT;
                    if (strK == null) {
                        strK = x0d.k(x340Var2, -1409921514, 2131963373, x340Var2, false);
                    } else {
                        x340Var2.i0(-1409932767);
                        x340Var2.r(false);
                    }
                    eqr0.b(0, 2, strK, x340Var2, (qim0) null);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    eqr0.b(0, 2, ((vtm1) obj3).a.c(), x340Var4, (qim0) null);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                vim vimVar = (vim) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str2 = vimVar.c;
                    if (str2 == null) {
                        uri = Uri.EMPTY;
                    } else {
                        String str3 = !ihc1.y0(str2) ? str2 : null;
                        if (str3 != null) {
                            uri = Uri.parse(str3);
                        } else {
                            uri = Uri.EMPTY;
                        }
                    }
                    Uri uri2 = uri;
                    uri2.getClass();
                    String str4 = vimVar.a;
                    String str5 = vimVar.b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    bmq0.a(uri2, (qim0) null, (hcx) null, str4, str5, vimVar.d, 0L, false, x340Var6, 0, 198);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                dro.m((vfm) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                dro.n((wfm) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                j06 j06Var = x340Var8.a;
                if (!zY) {
                    x340Var8.b0();
                    return rih1Var;
                }
                qim0 qim0VarF = u291.f(bmq0.L(nim0Var, k1o1.q(x340Var8), (g6o0) null), 1.0f);
                uwr uwrVar = cbx.a;
                long jA = cbx.a(x340Var8).a.a.a();
                cua cuaVar = cbx.b(x340Var8).f;
                cua cuaVar2 = cbx.b(x340Var8).f;
                qim0 qim0VarF2 = dug.f(qim0VarF, jA, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12));
                auj aujVar = (auj) obj3;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var8, 0);
                int iHashCode = Long.hashCode(x340Var8.T);
                xos0 xos0VarM = x340Var8.m();
                qim0 qim0VarE = zr7.E(x340Var8, qim0VarF2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                boolean z2 = x340Var8.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var8, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var8, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var8, lljVar3);
                nko1.F(x340Var8);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var8, lljVar4);
                qim0 qim0VarH = l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var8), false, 14);
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM2 = x340Var8.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarH);
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(gfh0VarC, x340Var8, lljVar);
                nko1.H(xos0VarM2, x340Var8, lljVar2);
                x0d.q(iHashCode2, x340Var8, lljVar3, x340Var8);
                nko1.H(qim0VarE2, x340Var8, lljVar4);
                aujVar.o1(h2c.a.a(nim0Var, een.h), x340Var8, 0);
                x340Var8.r(true);
                x340Var8.i0(-469196850);
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                if (aujVar.j1()) {
                    qim0VarF3 = qim0VarF3.then(l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var8), false, 14));
                }
                x340Var8.r(false);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM3 = x340Var8.m();
                qim0 qim0VarE3 = zr7.E(x340Var8, qim0VarF3);
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(gfh0VarC2, x340Var8, lljVar);
                nko1.H(xos0VarM3, x340Var8, lljVar2);
                x0d.q(iHashCode3, x340Var8, lljVar3, x340Var8);
                nko1.H(qim0VarE3, x340Var8, lljVar4);
                Object objT2 = x340Var8.T();
                if (objT2 == fkj0.X) {
                    objT2 = new xtj();
                    x340Var8.s0(objT2);
                }
                aujVar.n1((xtj) objT2, x340Var8, 6);
                x340Var8.r(true);
                x340Var8.r(true);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((euj) obj3).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String str6 = ((hvl1) obj3).a;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str6, nim0.a, cbx.d(x340Var10).e, cbx.a(x340Var10).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 48, 0, 2032);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((wtw) obj3).c.b.invoke(x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                return new u7h(((jlz0) obj3).c);
            case 10:
                ((Number) obj2).intValue();
                x340 x340Var13 = (b0k) obj;
                x340Var13.i0(-1803563656);
                jia jiaVar = ((g7m1) obj3).d;
                x340Var13.r(false);
                return jiaVar;
            case 11:
                ((Number) obj).longValue();
                ((ayh) obj3).y0((BetamaxTranscoderException) obj2);
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                w6k.g((f7d) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                f9k f9kVar = (f9k) obj;
                a9k a9kVar = (a9k) obj2;
                yqg yqgVar = (yqg) ((pt) obj3).d;
                i5d i5dVar = a9kVar.g;
                z = i5dVar == null || (i5dVar != null && (l2 = i5dVar.h) != null && (l2.longValue() > yqgVar.b() ? 1 : (l2.longValue() == yqgVar.b() ? 0 : -1)) <= 0);
                Set setT = e9k.t(f9kVar, z);
                e7k e7kVar = (z || (l = i5dVar.h) == null) ? null : new e7k(l.longValue(), f9kVar.a, (String) null, (String) null);
                a9k a9kVarA = a9k.a(a9kVar, f9kVar.a, f9kVar.b, f9kVar.c, null, z, null, null, false, false, null, null, null, 32576);
                if (e7kVar != null) {
                    setT = dm61.x0(e7kVar, setT);
                }
                return First.c(a9kVarA, setT);
            case 14:
                x340 x340Var14 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                Object obj4 = fkj0.X;
                rak rakVar = (rak) obj3;
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ven0 ven0VarH = rwq.h((wen0) rakVar.g.getValue(), x340Var15, 0);
                    ven0 ven0VarH2 = rwq.h(rakVar.h, x340Var15, 0);
                    boolean zI = x340Var15.i(rakVar) | x340Var15.i(ven0VarH);
                    Object objT3 = x340Var15.T();
                    if (zI || objT3 == obj4) {
                        objT3 = new gmj(rakVar, ven0VarH, b2);
                        x340Var15.s0(objT3);
                    }
                    qxd0.S((Function0) objT3, x340Var15);
                    kiv kivVar = szf0.a;
                    rzf0 rzf0VarB = szf0.b((View) x340Var15.k(AndroidCompositionLocals_androidKt.f));
                    Object objT4 = x340Var15.T();
                    if (objT4 == obj4) {
                        Bundle bundle = rakVar.e;
                        objT4 = Integer.valueOf(bundle != null ? bundle.getInt("scroll-value") : 0);
                        x340Var15.s0(objT4);
                    }
                    int iIntValue8 = ((Number) objT4).intValue();
                    Object objT5 = x340Var15.T();
                    if (objT5 == obj4) {
                        objT5 = c13.l(iIntValue8 == 0, x340Var15);
                    }
                    ven0 ven0Var2 = (ven0) objT5;
                    es41 es41VarC = l6o1.C(iIntValue8, 6, 0, x340Var15);
                    rakVar.t = es41VarC;
                    String str7 = ((xbk) ven0VarH.getValue()).a;
                    Integer numValueOf2 = Integer.valueOf(es41VarC.f.s());
                    Integer numValueOf3 = Integer.valueOf(iIntValue8);
                    boolean zI2 = x340Var15.i(ven0Var2) | x340Var15.i(ven0VarH) | x340Var15.i(es41VarC);
                    Object objT6 = x340Var15.T();
                    if (zI2 || objT6 == obj4) {
                        objT6 = new fe6(ven0Var2, ven0VarH, es41VarC, iIntValue8, (lnm) null, (byte) 6);
                        ven0Var = ven0VarH;
                        es41Var = es41VarC;
                        x340Var15.s0(objT6);
                    } else {
                        ven0Var = ven0VarH;
                        es41Var = es41VarC;
                    }
                    qxd0.r(str7, numValueOf2, numValueOf3, (vu30) objT6, x340Var15);
                    mod.c(new ely0[]{kivVar.a(rzf0VarB), szf0.b.a(rzf0VarB != null ? rzf0VarB.a() : null)}, apo.r(1401725801, new qak(rakVar, ven0Var, es41Var, ven0VarH2, (byte) 2), x340Var15), x340Var15, 56);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var16 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    hux huxVarK = rck.k(3);
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var17).g;
                    w0h1.a(huxVarK, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var17, 56, 56);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 16:
                return a(obj, obj2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                xek xekVar = (xek) obj;
                ioj0 ioj0Var = (ioj0) obj2;
                List list = xekVar.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hoj0 hoj0VarC = ioj0Var.c(j6k.class, (String) it.next());
                    j6k j6kVar = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (j6k) goj0VarA.a;
                    if (j6kVar != null) {
                        arrayList.add(j6kVar);
                    }
                }
                List listA1 = o7h.a1(arrayList, new p0d((jb3) obj3, (byte) 13));
                ArrayList arrayList2 = new ArrayList(q7h.U(listA1, 10));
                Iterator it2 = listA1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((j6k) it2.next()).a);
                }
                return new bfk(xekVar.a, list.size(), o7h.d1(arrayList2, 3), xekVar.c, xekVar.d);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var18 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    String str8 = ((mkk) obj3).a;
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(str8, (qim0) null, cbx.d(x340Var19).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var19, 0, 0, 2042);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                d1u.b((uy30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x340 x340Var20 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(-1610432930, new lpk(rwq.h((wen0) ((mpk) obj3).a.getValue(), x340Var21, 0), (byte) 0), x340Var21), x340Var21, 3078, 6);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x340 x340Var22 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                spk spkVar = (spk) obj3;
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    qsw.c(new obk1(((hva) spkVar.d).a), apo.r(-35354551, new rpk(spkVar, rwq.h((wen0) ((idd1) spkVar.f).getValue(), x340Var23, 0), rwq.h((wen0) ((idd1) spkVar.g).getValue(), x340Var23, 0), (byte) 1), x340Var23), x340Var23, 48);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var24 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                jrk jrkVar = (jrk) obj3;
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    lrk lrkVar = (lrk) b2p1.C(jrkVar.d, x340Var25).getValue();
                    if (lrkVar == null) {
                        x340Var25.i0(-481799068);
                        x340Var25.r(false);
                    } else {
                        x340Var25.i0(-481799067);
                        float fM = dsa0.m(x340Var25, 2131167023);
                        if (jrkVar.c) {
                            x340Var25.i0(1102587341);
                            x340Var25.r(false);
                        } else {
                            fE = z5c.e(x340Var25, 1102633376, 2131165289, x340Var25, false);
                        }
                        lvx.b(lrkVar, (tgk) jrkVar.f.getValue(), fM + fE, fM, (qim0) null, x340Var25, 0);
                        x340Var25.r(false);
                    }
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var26 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    int iOrdinal = ((r591) obj3).ordinal();
                    if (iOrdinal == 0) {
                        lsxVar = ksx.c;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        lsxVar = lsx.c;
                    }
                    lsx lsxVar2 = lsxVar;
                    uwr uwrVar5 = cbx.a;
                    w0h1.a(lsxVar2, isl.a, (qim0) null, cbx.a(x340Var27).b.a, 0L, false, x340Var27, 56, 52);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var28 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                s781 s781Var = ((oxk) obj3).f;
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    Uri uri3 = Uri.parse(s781Var.c);
                    jsl jslVar = new jsl(s781Var.b);
                    uwr uwrVar6 = cbx.a;
                    cua cuaVar3 = cbx.b(x340Var29).f;
                    eso1.e(uri3, jslVar, i1p1.q(nim0Var, er31.b(4.0f)), new p3v(24.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var29, 24576, 0, 4064);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                ((p1l) obj3).d((b0k) obj, czo1.p(7));
                return rih1Var;
            case 26:
                x340 x340Var30 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                qdl qdlVar = (qdl) obj3;
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    cir0 cir0Var = (cir0) x340Var31.k(k2r0.a);
                    Object objT7 = x340Var31.T();
                    m4c m4cVar = fkj0.X;
                    if (objT7 == m4cVar) {
                        objT7 = new kb4();
                        x340Var31.s0(objT7);
                    }
                    kb4 kb4Var = (kb4) objT7;
                    boolean zG2 = x340Var31.g(qdlVar.c);
                    Object objT8 = x340Var31.T();
                    if (zG2 || objT8 == m4cVar) {
                        objT8 = new pdl(qdlVar);
                        x340Var31.s0(objT8);
                    }
                    pdl pdlVar = (pdl) objT8;
                    String str9 = qdlVar.b.a;
                    boolean zI3 = x340Var31.i(cir0Var);
                    Object objT9 = x340Var31.T();
                    if (zI3 || objT9 == m4cVar) {
                        objT9 = new ndl(cir0Var, (byte) 0);
                        x340Var31.s0(objT9);
                    }
                    jo31.a(str9, kb4Var, pdlVar, (Function0) objT9, x340Var31, 0);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                fdg1.h((ah91) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 28:
                ((knl) obj3).g.c(new z5o0((h0r0) obj, (c7r0) obj2));
                return rih1Var;
            default:
                owl owlVar = (owl) obj;
                z910 z910Var = (z910) obj2;
                String str10 = owlVar.a;
                kwl kwlVar = (kwl) obj3;
                if (z910Var.e && (p8g1Var = z910Var.f) != null) {
                    int i = p8g1Var.b;
                    kwlVar.T0.a(new zmd(p8g1Var.a, new tr80(0, i, 1), new tr80(p8g1Var.c, i, 1)));
                }
                boolean z3 = kwlVar.N0;
                blb blbVar = z910Var.c;
                if (z910Var.a) {
                    return swl.a;
                }
                jxh jxhVar2 = kxh.a;
                if (blbVar == null) {
                    jxhVar = jxhVar2;
                } else if (hap1.q(blbVar)) {
                    jxhVar = ixh.a;
                } else {
                    if (blbVar instanceof blb) {
                        blb blbVar2 = blbVar;
                        vvhVar = new wvh(blbVar2.a, blbVar2.b, z3 ? blbVar2.f : null);
                    } else if (blbVar instanceof clb) {
                        clb clbVar = (clb) blbVar;
                        vvhVar = new xvh(clbVar.a, clbVar.b);
                    } else if (blbVar instanceof zkb) {
                        vvhVar = new uvh(new t9b1(blbVar));
                    } else {
                        if (!(blbVar instanceof alb)) {
                            eg.o();
                            return null;
                        }
                        if (z3) {
                            alb albVar = (alb) blbVar;
                            vvhVar = new vvh(albVar.a, albVar.b);
                        } else {
                            jxhVar = jxhVar2;
                        }
                    }
                    jxhVar = new jxh(vvhVar);
                }
                boolean zJ = u890.j(z910Var.b, hno.a);
                if (blbVar != null && jxhVar.equals(jxhVar2)) {
                    z = true;
                }
                if (!zJ) {
                    qwlVar = new qwl(str10, z910Var.b, jxhVar, z910Var.d, z910Var.g);
                } else {
                    if (!(jxhVar instanceof jxh)) {
                        return ((jxhVar instanceof ixh) || z) ? pwl.a : new rwl(owlVar.b);
                    }
                    qwlVar = new qwl(str10, z910Var.b, jxhVar, z910Var.d, z910Var.g);
                }
                return qwlVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ boj(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
