package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class woy extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woy(u7p0 u7p0Var, xh71 xh71Var, mp8 mp8Var, lnm lnmVar) {
        super(5, lnmVar);
        this.a = (byte) 4;
        this.e = u7p0Var;
        this.f = xh71Var;
        this.g = mp8Var;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x031d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0333  */
    /* JADX WARN: Code duplicated, block: B:161:0x0355 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:168:0x0373  */
    /* JADX WARN: Code duplicated, block: B:170:0x037b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0395  */
    /* JADX WARN: Code duplicated, block: B:174:0x0399  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:182:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:186:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:187:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:189:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:191:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:196:0x0407  */
    /* JADX WARN: Code duplicated, block: B:198:0x040f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0426  */
    /* JADX WARN: Code duplicated, block: B:203:0x0429  */
    /* JADX WARN: Code duplicated, block: B:207:0x0433  */
    /* JADX WARN: Code duplicated, block: B:209:0x043a  */
    /* JADX WARN: Code duplicated, block: B:211:0x0446  */
    /* JADX WARN: Code duplicated, block: B:213:0x044e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0456  */
    /* JADX WARN: Code duplicated, block: B:217:0x045e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0461  */
    /* JADX WARN: Code duplicated, block: B:220:0x0464  */
    /* JADX WARN: Code duplicated, block: B:221:0x0469  */
    /* JADX WARN: Code duplicated, block: B:223:0x046d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0475  */
    /* JADX WARN: Code duplicated, block: B:230:0x0484  */
    /* JADX WARN: Code duplicated, block: B:232:0x0487  */
    /* JADX WARN: Code duplicated, block: B:233:0x048a  */
    /* JADX WARN: Code duplicated, block: B:235:0x048d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0492  */
    /* JADX WARN: Code duplicated, block: B:239:0x049f  */
    /* JADX WARN: Code duplicated, block: B:242:0x04a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:249:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:251:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:256:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:266:0x0524  */
    /* JADX WARN: Code duplicated, block: B:267:0x052a  */
    /* JADX WARN: Code duplicated, block: B:275:0x0541  */
    /* JADX WARN: Code duplicated, block: B:280:0x0553  */
    /* JADX WARN: Code duplicated, block: B:281:0x0559  */
    /* JADX WARN: Code duplicated, block: B:282:0x055b A[PHI: r1 r2
      0x055b: PHI (r1v22 java.lang.String) = (r1v19 java.lang.String), (r28v0 java.lang.String) binds: [B:298:0x0596, B:281:0x0559] A[DONT_GENERATE, DONT_INLINE]
      0x055b: PHI (r2v19 java.util.Map) = (r2v17 java.util.Map), (r2v21 java.util.Map) binds: [B:298:0x0596, B:281:0x0559] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:285:0x056a  */
    /* JADX WARN: Code duplicated, block: B:286:0x056f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0578  */
    /* JADX WARN: Code duplicated, block: B:291:0x0580 A[PHI: r2
      0x0580: PHI (r2v16 java.util.Map) = (r2v15 java.util.Map), (r2v17 java.util.Map) binds: [B:303:0x05ac, B:290:0x057e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:292:0x0583  */
    /* JADX WARN: Code duplicated, block: B:294:0x058b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0590  */
    /* JADX WARN: Code duplicated, block: B:299:0x0598  */
    /* JADX WARN: Code duplicated, block: B:300:0x059e  */
    /* JADX WARN: Code duplicated, block: B:302:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:308:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:311:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:313:0x05da  */
    /* JADX WARN: Code duplicated, block: B:315:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:318:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:322:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:326:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:329:0x0603  */
    /* JADX WARN: Code duplicated, block: B:330:0x0605  */
    /* JADX WARN: Code duplicated, block: B:333:0x060c  */
    /* JADX WARN: Code duplicated, block: B:334:0x0617 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:335:0x0619  */
    /* JADX WARN: Code duplicated, block: B:337:0x061f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:340:0x0624 A[PHI: r1
      0x0624: PHI (r1v59 java.util.Map) = (r1v51 java.util.Map), (r1v53 java.util.Map), (r1v53 java.util.Map), (r1v60 java.util.Map) binds: [B:358:0x064e, B:353:0x0643, B:355:0x0649, B:339:0x0622] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:343:0x062b A[PHI: r1
      0x062b: PHI (r1v56 java.util.Map) = (r1v51 java.util.Map), (r1v53 java.util.Map), (r1v57 java.util.Map) binds: [B:359:0x0650, B:355:0x0649, B:342:0x0629] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:345:0x0630 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:346:0x0632  */
    /* JADX WARN: Code duplicated, block: B:349:0x0639 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:350:0x063b  */
    /* JADX WARN: Code duplicated, block: B:352:0x0641  */
    /* JADX WARN: Code duplicated, block: B:354:0x0645  */
    /* JADX WARN: Code duplicated, block: B:357:0x064c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0650 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:360:0x0652  */
    /* JADX WARN: Code duplicated, block: B:365:0x0682  */
    /* JADX WARN: Code duplicated, block: B:367:0x068c  */
    /* JADX WARN: Code duplicated, block: B:370:0x0695  */
    /* JADX WARN: Code duplicated, block: B:372:0x0698  */
    /* JADX WARN: Code duplicated, block: B:373:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:375:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:377:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:380:0x06e2 A[LOOP:3: B:378:0x06dc->B:380:0x06e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:383:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:385:0x0705  */
    /* JADX WARN: Code duplicated, block: B:387:0x070b  */
    /* JADX WARN: Code duplicated, block: B:451:0x080b  */
    /* JADX WARN: Code duplicated, block: B:454:0x081a  */
    /* JADX WARN: Code duplicated, block: B:456:0x081d  */
    /* JADX WARN: Code duplicated, block: B:457:0x0820  */
    /* JADX WARN: Code duplicated, block: B:461:0x0829  */
    /* JADX WARN: Code duplicated, block: B:463:0x082f  */
    /* JADX WARN: Code duplicated, block: B:464:0x0839  */
    /* JADX WARN: Code duplicated, block: B:466:0x083c  */
    /* JADX WARN: Code duplicated, block: B:469:0x0844  */
    /* JADX WARN: Code duplicated, block: B:472:0x084f  */
    /* JADX WARN: Code duplicated, block: B:475:0x0859  */
    /* JADX WARN: Code duplicated, block: B:480:0x0874  */
    /* JADX WARN: Code duplicated, block: B:482:0x0880  */
    /* JADX WARN: Code duplicated, block: B:484:0x0888  */
    /* JADX WARN: Code duplicated, block: B:487:0x0891  */
    /* JADX WARN: Code duplicated, block: B:489:0x0894  */
    /* JADX WARN: Code duplicated, block: B:490:0x089c  */
    /* JADX WARN: Code duplicated, block: B:491:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:494:0x08af  */
    /* JADX WARN: Code duplicated, block: B:497:0x08c1 A[LOOP:8: B:492:0x08a9->B:497:0x08c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:501:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:504:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:505:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:508:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:511:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:513:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:521:0x0938 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:522:0x093a  */
    /* JADX WARN: Code duplicated, block: B:527:0x0955  */
    /* JADX WARN: Code duplicated, block: B:52:0x016f  */
    /* JADX WARN: Code duplicated, block: B:535:0x096d  */
    /* JADX WARN: Code duplicated, block: B:536:0x0970 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:537:0x0972  */
    /* JADX WARN: Code duplicated, block: B:542:0x0984  */
    /* JADX WARN: Code duplicated, block: B:545:0x0995  */
    /* JADX WARN: Code duplicated, block: B:548:0x099d  */
    /* JADX WARN: Code duplicated, block: B:553:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:554:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:567:0x09ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:571:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:575:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:576:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:579:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:580:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:583:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:586:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:587:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:589:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:592:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:594:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:597:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:600:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:668:0x04b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x0ad4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0738 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0865 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[LOOP:6: B:473:0x0853->B:688:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x08cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x08c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x08c5 A[EDGE_INSN: B:693:0x08c5->B:499:0x08c5 BREAK  A[LOOP:8: B:492:0x08a9->B:497:0x08c1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x04ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x025f  */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0507, code lost:
    
        if (r0.length() == 0) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x061f, code lost:
    
        if (r24 != null) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0622, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0636, code lost:
    
        if (r50.containsKey(r7) == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0649, code lost:
    
        if (r1.containsKey(r7) == false) goto L343;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r81) {
        /*
            Method dump skipped, instruction units count: 3127
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.woy.e(java.lang.Object):java.lang.Object");
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (b) {
            case 0:
                woy woyVar = new woy(obj7, obj6, (lnm) obj5, (byte) 0);
                woyVar.b = (k1r) obj;
                woyVar.c = (y4m) obj2;
                woyVar.d = (r840) obj3;
                woyVar.e = (ast0) obj4;
                return woyVar.invokeSuspend(rih1Var);
            case 1:
                woy woyVar2 = new woy(obj7, obj6, (lnm) obj5, (byte) 1);
                woyVar2.b = (o2z) obj;
                woyVar2.c = (p2z) obj2;
                woyVar2.d = (n2z) obj3;
                woyVar2.e = (tqw) obj4;
                woyVar2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                woy woyVar3 = new woy(obj7, obj6, (lnm) obj5, (byte) 2);
                woyVar3.b = (um01) obj;
                woyVar3.c = (vm01) obj2;
                woyVar3.d = (tm01) obj3;
                woyVar3.e = (tqw) obj4;
                woyVar3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                woy woyVar4 = new woy(obj7, obj6, (lnm) obj5, (byte) 3);
                woyVar4.b = (mr01) obj;
                woyVar4.c = (Map) obj2;
                woyVar4.d = (Map) obj3;
                woyVar4.e = (Map) obj4;
                return woyVar4.invokeSuspend(rih1Var);
            default:
                woy woyVar5 = new woy((u7p0) this.e, (xh71) obj7, (mp8) obj6, (lnm) obj5);
                woyVar5.b = (s671) obj;
                woyVar5.c = (x671) obj2;
                woyVar5.d = (tqw) obj4;
                woyVar5.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                k1r k1rVar = (k1r) this.b;
                y4m y4mVar = (y4m) this.c;
                r840 r840Var = (r840) this.d;
                ast0 ast0Var = (ast0) this.e;
                hm5.M(obj);
                return xoy.g((koy) obj3, k1rVar, y4mVar, r840Var, ast0Var);
            case 1:
                iu30 iu30Var = (iu30) obj2;
                goq goqVar = (goq) obj3;
                o2z o2zVar = (o2z) this.b;
                p2z p2zVar = (p2z) this.c;
                m2z m2zVar = (n2z) this.d;
                tqw tqwVar = (tqw) this.e;
                hm5.M(obj);
                if (m2zVar instanceof m2z) {
                    iu30Var.invoke(new v051(new z951(p2zVar.a, p2zVar.i, false, (p7w) null, false, p2zVar.s, p2zVar.t, false, u951.a, (String) null, p2zVar.e, (String) null, false, 0, false, false, false, 259376), tqwVar != null ? n3o1.y(tqwVar) : null, m2zVar.a));
                    return rih1Var;
                }
                if (u890.j(m2zVar, j2z.a)) {
                    iu30Var.invoke(new cz41(Collections.singletonList(p2zVar.a), p2zVar.a, p2zVar.q, tqwVar != null ? n3o1.y(tqwVar) : null));
                    return rih1Var;
                }
                if (u890.j(m2zVar, l2z.a)) {
                    bpb1 bpb1Var = (bpb1) goqVar.h;
                    bpb1Var.m((Object) null, sqg0.O((Map) bpb1Var.getValue(), Collections.singletonMap(new edz(p2zVar.a), new bet(true ^ p2zVar.r))));
                    return rih1Var;
                }
                if (!u890.j(m2zVar, k2z.a)) {
                    eg.o();
                    return null;
                }
                lik1 lik1Var = new lik1(((e8r0) goqVar.f).a().e);
                Observable observableA = a6z.a((a6z) goqVar.d, o2zVar.a, (String) null, (Map) null, lik1Var, new r6z((String) null, true, false, true, false, false, false, false, false, false, false, true, false, false, true, false, (ugo0) null, (c821) null, false, false, false, false, (ok51) null, false, (String) null, false, (p860) null, 1073723381), (cee) null, 38);
                mfm mfmVarA = ((i4q) goqVar.e).a(lik1Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.b(mfmVarA, observableA, yon1.Y0(), (bjm) null, tqwVar != null ? n3o1.y(tqwVar) : null, 20);
                return rih1Var;
            case 2:
                iu30 iu30Var2 = (iu30) obj2;
                um01 um01Var = (um01) this.b;
                vm01 vm01Var = (vm01) this.c;
                sm01 sm01Var = (tm01) this.d;
                tqw tqwVar2 = (tqw) this.e;
                hm5.M(obj);
                if (!(sm01Var instanceof sm01)) {
                    if (u890.j(sm01Var, rm01.a)) {
                        iu30Var2.invoke(new s051(um01Var.a, tqwVar2 != null ? n3o1.y(tqwVar2) : null));
                        return rih1Var;
                    }
                    if (u890.j(sm01Var, qm01.a)) {
                        iu30Var2.invoke(new m151(um01Var.a, tqwVar2 != null ? n3o1.y(tqwVar2) : null));
                        return rih1Var;
                    }
                    if (u890.j(sm01Var, om01.a) || u890.j(sm01Var, pm01.a)) {
                        ((ne) obj3).e(um01Var.a, tqwVar2 != null ? n3o1.y(tqwVar2) : null, vm01Var.t);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                boolean z2 = vm01Var.j;
                int i = vm01Var.I;
                if (z2 && sgy.a(um01Var.a) && !vm01Var.k) {
                    return rih1Var;
                }
                String str = um01Var.a;
                if (!vm01Var.h && i == 2) {
                    i = 3;
                }
                int i2 = i;
                boolean z3 = vm01Var.i;
                boolean z4 = vm01Var.w;
                Integer num = vm01Var.x;
                if (!vm01Var.y && (!vm01Var.z || !vm01Var.C)) {
                    z = false;
                }
                iu30Var2.invoke(new v051(new x951(str, i2, z3, z4, num, z, vm01Var.z, vm01Var.A, vm01Var.B, vm01Var.F), tqwVar2 != null ? n3o1.y(tqwVar2) : null, sm01Var.a));
                return rih1Var;
            case 3:
                return e(obj);
            default:
                xh71 xh71Var = (xh71) obj2;
                s671 s671Var = (s671) this.b;
                x671 x671Var = (x671) this.c;
                tqw tqwVar3 = (tqw) this.d;
                hm5.M(obj);
                s671Var.getEnabled();
                tv80 tv80VarD = cvl1.d(tqwVar3);
                if (s671Var instanceof q671) {
                    kby kbyVar = x671Var.b;
                    xh71.b(xh71Var, new wa71(((q671) s671Var).a, ((mp8) obj3).d(kbyVar.p, kbyVar.v) ? ((q671) s671Var).c : null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 124), (Bundle) null, new vm71("playlist-row-quick-action"), tv80VarD, (List) null, 18);
                    return rih1Var;
                }
                if (s671Var instanceof r671) {
                    xh71.b(xh71Var, new wa71((String) null, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), (Bundle) null, tm71.b, tv80VarD, (List) null, 18);
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ woy(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
    }
}
