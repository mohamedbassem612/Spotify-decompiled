package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import j$.net.URLEncoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p551 implements Update {
    public final jqd0 a;
    public final m39 b;
    public final ij01 c;
    public final xaz0 d;
    public final o551 e;
    public final xgc f;
    public final ks21 g;
    public final rpv0 h;
    public final khc i;

    public p551(jqd0 jqd0Var, m39 m39Var, ij01 ij01Var, xaz0 xaz0Var, o551 o551Var, xgc xgcVar, ks21 ks21Var, mhc mhcVar, rpv0 rpv0Var, khc khcVar, ubc ubcVar, nhc nhcVar, lhc lhcVar, nbc nbcVar, vhc vhcVar) {
        this.a = jqd0Var;
        this.b = m39Var;
        this.c = ij01Var;
        this.d = xaz0Var;
        this.e = o551Var;
        this.f = xgcVar;
        this.g = ks21Var;
        this.h = rpv0Var;
        this.i = khcVar;
    }

    /* JADX WARN: Code duplicated, block: B:208:0x038e  */
    /* JADX WARN: Code duplicated, block: B:221:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:223:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:227:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:229:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:233:0x03c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:251:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:277:0x048b  */
    /* JADX WARN: Code duplicated, block: B:281:0x0494  */
    /* JADX WARN: Code duplicated, block: B:283:0x049c  */
    /* JADX WARN: Code duplicated, block: B:285:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:287:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:288:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:290:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:291:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:296:0x0501  */
    /* JADX WARN: Code duplicated, block: B:300:0x050d  */
    /* JADX WARN: Code duplicated, block: B:301:0x050f  */
    /* JADX WARN: Code duplicated, block: B:303:0x051a  */
    /* JADX WARN: Code duplicated, block: B:305:0x0526  */
    /* JADX WARN: Code duplicated, block: B:310:0x052f A[PHI: r2
      0x052f: PHI (r2v56 java.lang.String) = (r2v54 java.lang.String), (r2v62 java.lang.String) binds: [B:318:0x0547, B:308:0x052c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:311:0x0531  */
    /* JADX WARN: Code duplicated, block: B:313:0x0535  */
    /* JADX WARN: Code duplicated, block: B:315:0x0541  */
    /* JADX WARN: Code duplicated, block: B:321:0x0552  */
    /* JADX WARN: Code duplicated, block: B:323:0x0558 A[PHI: r3
      0x0558: PHI (r3v47 com.spotify.mobius.Next) = 
      (r3v2 com.spotify.mobius.Next)
      (r3v2 com.spotify.mobius.Next)
      (r3v58 com.spotify.mobius.Next)
      (r3v2 com.spotify.mobius.Next)
     binds: [B:320:0x0550, B:322:0x0556, B:401:0x06e0, B:330:0x056b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:324:0x055b  */
    /* JADX WARN: Code duplicated, block: B:326:0x0561  */
    /* JADX WARN: Code duplicated, block: B:328:0x0565  */
    /* JADX WARN: Code duplicated, block: B:329:0x0569  */
    /* JADX WARN: Code duplicated, block: B:332:0x056e  */
    /* JADX WARN: Code duplicated, block: B:334:0x057a  */
    /* JADX WARN: Code duplicated, block: B:341:0x058b  */
    /* JADX WARN: Code duplicated, block: B:344:0x0591  */
    /* JADX WARN: Code duplicated, block: B:347:0x05ae A[LOOP:2: B:345:0x05a8->B:347:0x05ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:351:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:359:0x0601 A[LOOP:4: B:357:0x05fb->B:359:0x0601, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:363:0x0628 A[LOOP:5: B:361:0x0622->B:363:0x0628, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:365:0x0649  */
    /* JADX WARN: Code duplicated, block: B:367:0x064d  */
    /* JADX WARN: Code duplicated, block: B:369:0x0659  */
    /* JADX WARN: Code duplicated, block: B:372:0x0660  */
    /* JADX WARN: Code duplicated, block: B:375:0x0665  */
    /* JADX WARN: Code duplicated, block: B:376:0x0669  */
    /* JADX WARN: Code duplicated, block: B:379:0x0674 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:392:0x06c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:393:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:394:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:397:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:399:0x06db  */
    /* JADX WARN: Code duplicated, block: B:400:0x06de  */
    /* JADX WARN: Code duplicated, block: B:402:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:406:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:411:0x0706  */
    /* JADX WARN: Code duplicated, block: B:414:0x0720  */
    /* JADX WARN: Code duplicated, block: B:451:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:453:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:454:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:456:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:457:0x07af  */
    /* JADX WARN: Code duplicated, block: B:460:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:462:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:463:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:465:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:466:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:508:0x086f  */
    /* JADX WARN: Code duplicated, block: B:528:0x08e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:529:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:531:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:536:0x0910  */
    /* JADX WARN: Code duplicated, block: B:538:0x0913  */
    /* JADX WARN: Code duplicated, block: B:540:0x091e  */
    /* JADX WARN: Code duplicated, block: B:543:0x093c  */
    /* JADX WARN: Code duplicated, block: B:545:0x0945 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:547:0x0948  */
    /* JADX WARN: Code duplicated, block: B:548:0x094a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:549:0x094c  */
    /* JADX WARN: Code duplicated, block: B:550:0x0952 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:551:0x0954  */
    /* JADX WARN: Code duplicated, block: B:552:0x095a  */
    /* JADX WARN: Code duplicated, block: B:554:0x095d  */
    /* JADX WARN: Code duplicated, block: B:557:0x0981  */
    /* JADX WARN: Code duplicated, block: B:563:0x099b  */
    /* JADX WARN: Code duplicated, block: B:739:0x05e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:0x05cb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Next a(z551 z551Var, q151 q151Var) {
        boolean z;
        boolean z2;
        Set setZ;
        x951 x951Var;
        z951 z951Var;
        z951 z951Var2;
        p7w p7wVar;
        boolean z3;
        r851 r851Var;
        boolean z4;
        r851 r851Var2;
        Next next;
        Next next2;
        boolean z5;
        boolean z6;
        String str;
        Next n551Var;
        siq0 siq0Var;
        String str2;
        k851 k851Var;
        z2g0 z2g0Var;
        String str3;
        llr0 klr0Var;
        k851 k851Var2;
        z2g0 z2g0Var2;
        Next te20Var;
        boolean z7;
        a951 a951Var;
        siq0 siq0Var2;
        List list;
        k851 k851Var3;
        f820 f820Var;
        String str4;
        yo20 yo20Var;
        ArrayList arrayList;
        z2g0 z2g0Var3;
        k851 k851Var4;
        z2g0 z2g0Var4;
        f820 f820Var2;
        Next<db20> next3;
        Set setP1;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        Iterator it2;
        ArrayList arrayList4;
        db20 db20Var;
        siq0 siq0Var3;
        Next next4;
        p6r0 p6r0VarJ;
        boolean z8;
        String str5;
        xo20 xo20Var;
        String str6;
        Next te20Var2;
        h1z0 h1z0Var;
        Next next5;
        xyn1 nx41Var;
        xyn1 tc51Var;
        f951 f951Var = z551Var.d;
        String str7 = z551Var.b;
        boolean z9 = z551Var.O0;
        val valVar = z551Var.e;
        Next next6 = z551Var.h;
        String str8 = z551Var.a;
        boolean z10 = q151Var instanceof l051;
        jlr0 jlr0Var = jlr0.a;
        Next next7 = se20.a;
        Next next8 = null;
        boolean z11 = false;
        xyn1 xyn1Var = sc51.b;
        if (z10) {
            l051 l051Var = (l051) q151Var;
            String strB = l051Var.b();
            boolean z12 = l051Var instanceof k051;
            if (z12 && u890.j(str8, ((k051) l051Var).a)) {
                return Next.j();
            }
            boolean z13 = l051Var instanceof j051;
            if (z13 && ((j051) l051Var).a.length() == 0) {
                return Next.j();
            }
            String strA = l051Var.a();
            boolean z14 = str8.length() > 0 && strA.length() == 0;
            boolean z15 = next6 instanceof re20;
            if (!z15) {
                str6 = strA;
                if (!(next6 instanceof te20)) {
                    if (!(next6 instanceof se20)) {
                        eg.o();
                        return null;
                    }
                    te20Var2 = next6;
                } else if (z14 || z12) {
                    te20Var2 = next7;
                } else {
                    List list2 = ((te20) next6).a;
                    ArrayList arrayList5 = new ArrayList(q7h.U(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(db20.a((db20) it3.next(), false));
                    }
                    next8 = null;
                    te20Var2 = new te20(arrayList5, null);
                }
            } else if (z14 || z12) {
                str6 = strA;
                te20Var2 = next7;
            } else {
                str6 = strA;
                te20Var2 = re20.a((re20) next6, null, false, 6);
            }
            if (z12) {
                h1z0Var = new h1z0(next8);
            } else {
                if (!z13) {
                    eg.o();
                    return next8;
                }
                h1z0Var = new h1z0(gyh.b);
            }
            h1z0 h1z0Var2 = h1z0Var;
            String str9 = str6;
            z551 z551VarA = z551.a(z551Var, str9, null, 0, null, null, null, jlr0Var, te20Var2, null, 0, null, null, false, h1z0Var2, false, 24378);
            fw41 fw41Var = z551VarA.f;
            if (z14) {
                return Next.i(z551.a(z551VarA, null, null, 0, y851.a, null, null, null, null, null, 0, null, null, false, null, false, 32759), Effects.a(new hx41[]{new hx41(strB, valVar)}));
            }
            if (!(valVar instanceof ral) && !z13) {
                return Next.i(z551VarA, Effects.a(new px41[]{new px41(str9, strB, fw41Var.e)}));
            }
            if (z13) {
                j051 j051Var = (j051) l051Var;
                tc51Var = new tc51(l1d.m("spotify:search:", URLEncoder.encode(j051Var.a, "utf8")), j051Var.c, tb10.b, !z9);
                next5 = null;
            } else {
                if (!z12) {
                    eg.o();
                    return null;
                }
                if (((di4) this.c.b).B()) {
                    next5 = null;
                    nx41Var = new mx41(str9, strB, (tv80) null, fw41Var.c);
                } else {
                    next5 = null;
                    nx41Var = new nx41(str9, strB, null, fw41Var.c);
                }
                tc51Var = nx41Var;
            }
            Set setW0 = dm61.w0(new xyn1[]{tc51Var});
            if (z15) {
                if (((re20) next6).a != null) {
                    setW0.add(wc51.b);
                    break;
                }
            } else if (next6 instanceof te20) {
                List list3 = ((te20) next6).a;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        if (((db20) it4.next()).c) {
                            setW0.add(wc51.b);
                            break;
                        }
                    }
                }
            } else if (!u890.j(next6, next7)) {
                eg.o();
                return next5;
            }
            if (z13) {
                setW0.add(xyn1Var);
            }
            return Next.i(z551VarA, setW0);
        }
        Next re20Var = next6;
        boolean z16 = true;
        if (q151Var.equals(x051.a)) {
            return (u890.j(str7, str8) && ((f951Var instanceof w851) || (f951Var instanceof x851))) ? Next.j() : Next.h(z551.a(z551Var, null, null, 0, u851.a, null, null, null, null, null, 0, null, null, false, null, false, 32755));
        }
        if (q151Var instanceof w051) {
            w051 w051Var = (w051) q151Var;
            d951 d951Var = w051Var.c;
            String str10 = w051Var.a;
            boolean z17 = !(str8.length() == 0 && str7.length() == 0 && str10.length() > 0) && (str7.equals(str10) || ((nhc1.Z(str8, str10) || nhc1.Z(str10, str8)) && (str7.length() == 0 || (!(nhc1.Z(str8, str7) || nhc1.Z(str7, str8)) || Math.abs(str8.length() - str10.length()) < Math.abs(str8.length() - str7.length())))));
            String str11 = w051Var.b;
            boolean z18 = d951Var instanceof a951;
            if (z18) {
                siq0 siq0Var4 = ((a951) d951Var).a;
                next2 = null;
                if (re20Var instanceof re20) {
                    if (f951Var instanceof a951) {
                        xo20 xo20Var2 = ((re20) re20Var).a;
                        if (siq0Var4 instanceof riq0) {
                            xo20Var = null;
                        } else {
                            if (!(siq0Var4 instanceof qiq0)) {
                                eg.o();
                                return null;
                            }
                            xo20Var = ((qiq0) siq0Var4).a;
                        }
                        if (!u890.j(xo20Var2, xo20Var)) {
                            z11 = true;
                        }
                    }
                } else if (re20Var instanceof te20) {
                    if (siq0Var4 instanceof riq0) {
                        te20 te20Var3 = (te20) re20Var;
                        String str12 = te20Var3.b;
                        if (str12 == null || u890.j(str12, str11)) {
                            if (!te20Var3.b().isEmpty()) {
                                a951 a951Var2 = f951Var instanceof a951 ? (a951) f951Var : null;
                                if (!((a951Var2 != null ? a951Var2.a : null) instanceof riq0)) {
                                }
                            }
                        }
                    } else {
                        if (!(siq0Var4 instanceof qiq0)) {
                            eg.o();
                            return null;
                        }
                        List list4 = ((qiq0) siq0Var4).c;
                        if (list4 != null) {
                            te20 te20Var4 = (te20) re20Var;
                            if (!o7h.p1(list4).equals(o7h.p1(te20Var4.b())) || ((str5 = te20Var4.b) != null && !u890.j(str5, str11))) {
                            }
                        }
                    }
                    z11 = true;
                } else if (!(re20Var instanceof se20)) {
                    eg.o();
                    return null;
                }
                z5 = d951Var instanceof w851;
                if (!z5 || (d951Var instanceof x851) || (d951Var instanceof z851) || z18) {
                    z6 = true;
                } else {
                    if (!(d951Var instanceof y851) && !(d951Var instanceof b951)) {
                        eg.o();
                        return next2;
                    }
                    z6 = false;
                }
                if ((str8.length() == 0 || !z6) && !z11 && (!((r12 = d951Var instanceof z851)) || !u890.j(valVar, ral.a))) {
                    if (!z17) {
                        if (!(f951Var instanceof u851) || (f951Var instanceof s851)) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z18) {
                        }
                    }
                    str = w051Var.a;
                    e7r0 e7r0Var = z551Var.Y;
                    if (!u890.j(str7, str8) && u890.j(str8, str) && z18 && (f951Var instanceof a951)) {
                        a951 a951Var3 = (a951) d951Var;
                        boolean z19 = a951Var3.b;
                        siq0 siq0Var5 = a951Var3.a;
                        siq0 siq0Var6 = ((a951) f951Var).a;
                        if (siq0Var5 instanceof riq0) {
                            riq0 riq0Var = (riq0) siq0Var5;
                            if (siq0Var6 instanceof riq0) {
                                List list5 = ((riq0) siq0Var6).a;
                                n551Var = new n551(e7r0Var, list5.size(), new a951(new riq0(o7h.N0(riq0Var.a, list5)), z19));
                            } else {
                                n551Var = next2;
                            }
                        } else {
                            if (!(siq0Var5 instanceof qiq0)) {
                                eg.o();
                                return next2;
                            }
                            qiq0 qiq0Var = (qiq0) siq0Var5;
                            xo20 xo20Var3 = qiq0Var.a;
                            if (z19 || !(siq0Var6 instanceof qiq0)) {
                                n551Var = next2;
                            } else {
                                List list6 = qiq0Var.c;
                                qiq0 qiq0Var2 = (qiq0) siq0Var6;
                                List list7 = qiq0Var2.b;
                                if (u890.j(xo20Var3, qiq0Var2.a)) {
                                    List list8 = qiq0Var2.c;
                                    if ((list6 == null || list8 == null) ? u890.j(list6, list8) : o7h.p1(list6).equals(o7h.p1(list8))) {
                                        n551Var = new n551(e7r0Var, list7.size(), new a951(new qiq0(xo20Var3, o7h.N0(qiq0Var.b, list7), list6), z19));
                                    } else {
                                        n551Var = next2;
                                    }
                                } else {
                                    n551Var = next2;
                                }
                            }
                        }
                    } else {
                        n551Var = next2;
                    }
                    if (n551Var == null) {
                        String str13 = w051Var.b;
                        if (!z18) {
                            AtomicReferenceArray atomicReferenceArray = p6r0.e;
                            p6r0VarJ = yon1.U4();
                        } else if (m39.a(d951Var).isEmpty()) {
                            siq0Var3 = ((a951) d951Var).a;
                            if (siq0Var3 instanceof riq0) {
                                next4 = next2;
                            } else {
                                if (!(siq0Var3 instanceof qiq0)) {
                                    eg.o();
                                    return next2;
                                }
                                next4 = ((qiq0) siq0Var3).a;
                            }
                            p6r0VarJ = ulc.j(next4);
                        } else {
                            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                            p6r0VarJ = yon1.G1("SEARCH_FILTERED", "search/filtered", 1786, "search");
                        }
                        n551Var = new n551(new e7r0(str13, p6r0VarJ, str, w051Var.d, o7h.y0(m39.a(d951Var), ",", (String) null, (String) null, (iu30) null, 62)), 0, d951Var);
                    }
                    String str14 = w051Var.a;
                    f951 f951Var2 = n551Var.c;
                    int i = n551Var.b;
                    if (z18) {
                        siq0Var = ((a951) d951Var).a;
                        str2 = "";
                        if (siq0Var instanceof riq0) {
                            k851Var2 = (k851) o7h.C0(((riq0) siq0Var).a);
                            if (k851Var2 != null && (z2g0Var2 = k851Var2.b) != null && (str3 = z2g0Var2.b) != null) {
                                str2 = str3;
                            }
                        } else {
                            if (!(siq0Var instanceof qiq0)) {
                                eg.o();
                                return null;
                            }
                            k851Var = (k851) o7h.C0(((qiq0) siq0Var).b);
                            if (k851Var != null && (z2g0Var = k851Var.b) != null && (str3 = z2g0Var.b) != null) {
                                str2 = str3;
                            }
                        }
                        klr0Var = new klr0(str2, false);
                    } else {
                        klr0Var = jlr0Var;
                    }
                    if (z18) {
                        a951Var = (a951) d951Var;
                        if (a951Var.b) {
                            siq0Var2 = a951Var.a;
                            if (siq0Var2 instanceof qiq0) {
                                if (re20Var instanceof te20) {
                                    te20Var = (te20) re20Var;
                                } else {
                                    te20Var = next2;
                                }
                                if (te20Var == null) {
                                    te20Var = re20Var;
                                } else {
                                    k851Var4 = (k851) o7h.s0(((qiq0) siq0Var2).b);
                                    if (k851Var4 != null && (z2g0Var4 = k851Var4.b) != null && (f820Var2 = z2g0Var4.f) != null) {
                                        next3 = f820Var2.a;
                                        if (next3.isEmpty()) {
                                            next3 = next2;
                                        }
                                        if (next3 != null) {
                                            setP1 = o7h.p1(te20Var.b());
                                            arrayList2 = new ArrayList(q7h.U(next3, 10));
                                            it = next3.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(((db20) it.next()).a);
                                            }
                                            Set setP2 = o7h.p1(arrayList2);
                                            List list9 = te20Var.a;
                                            ArrayList arrayList6 = new ArrayList();
                                            for (Object obj : list9) {
                                                db20Var = (db20) obj;
                                                if (!setP1.contains(db20Var.a) && !setP2.contains(db20Var.a)) {
                                                    arrayList6.add(obj);
                                                }
                                            }
                                            arrayList3 = new ArrayList(q7h.U(arrayList6, 10));
                                            it2 = arrayList6.iterator();
                                            while (it2.hasNext()) {
                                                arrayList3.add(db20.a((db20) it2.next(), z16));
                                                z16 = true;
                                            }
                                            arrayList4 = new ArrayList(q7h.U(next3, 10));
                                            for (db20 db20Var2 : next3) {
                                                arrayList4.add(db20.a(db20Var2, setP1.contains(db20Var2.a)));
                                            }
                                            te20Var = te20.a(te20Var, o7h.N0(arrayList4, arrayList3), next2, 2);
                                        }
                                    }
                                }
                            } else {
                                if (!(siq0Var2 instanceof riq0)) {
                                    eg.o();
                                    return null;
                                }
                                list = ((riq0) siq0Var2).a;
                                k851Var3 = (k851) o7h.s0(list);
                                if (k851Var3 != null || (z2g0Var3 = k851Var3.b) == null) {
                                    f820Var = null;
                                } else {
                                    f820Var = z2g0Var3.f;
                                }
                                if (re20Var instanceof te20) {
                                    te20Var = (te20) re20Var;
                                } else {
                                    te20Var = null;
                                }
                                if (this.b.a.a0() || f820Var == null) {
                                    if (te20Var != null) {
                                        str4 = te20Var.b;
                                    } else {
                                        str4 = null;
                                    }
                                    if (str4 == null) {
                                        yo20Var = ((k851) list.get(0)).b.e;
                                        if (yo20Var != null) {
                                            arrayList = yo20Var.a;
                                        } else {
                                            arrayList = z6x.a;
                                        }
                                        re20Var = new re20(null, arrayList, false);
                                        te20Var = re20Var;
                                    }
                                } else {
                                    ArrayList<db20> arrayList7 = f820Var.a;
                                    if (arrayList7.isEmpty()) {
                                        if (te20Var != null) {
                                            str4 = te20Var.b;
                                        } else {
                                            str4 = null;
                                        }
                                        if (str4 == null) {
                                            yo20Var = ((k851) list.get(0)).b.e;
                                            if (yo20Var != null) {
                                                arrayList = yo20Var.a;
                                            } else {
                                                arrayList = z6x.a;
                                            }
                                            re20Var = new re20(null, arrayList, false);
                                            te20Var = re20Var;
                                        }
                                    } else if ((te20Var != null ? te20Var.b : null) != null) {
                                        Set setP3 = o7h.p1(te20Var.b());
                                        ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
                                        for (db20 db20Var3 : arrayList7) {
                                            arrayList8.add(db20.a(db20Var3, setP3.contains(db20Var3.a)));
                                        }
                                        te20Var = te20.a(te20Var, arrayList8, null, 2);
                                    } else {
                                        te20Var = new te20(arrayList7, null);
                                    }
                                }
                            }
                        } else {
                            te20Var = re20Var;
                        }
                    } else {
                        te20Var = re20Var;
                    }
                    e7r0 e7r0Var2 = n551Var.a;
                    boolean z20 = !u890.j(z551Var.g, jlr0Var);
                    if (!z9 || (n551Var.c instanceof a951)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    return Next.h(z551.a(z551Var, null, str14, i, f951Var2, null, null, klr0Var, te20Var, null, 1, null, e7r0Var2, z20, null, z7, 9521));
                }
                return Next.j();
            }
            next2 = null;
            z11 = false;
            z5 = d951Var instanceof w851;
            if (z5) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (str8.length() == 0) {
                if (!z17) {
                    if (f951Var instanceof u851) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if (z18) {
                    }
                }
                str = w051Var.a;
                e7r0 e7r0Var3 = z551Var.Y;
                if (!u890.j(str7, str8)) {
                    n551Var = next2;
                } else {
                    n551Var = next2;
                }
                if (n551Var == null) {
                    String str15 = w051Var.b;
                    if (!z18) {
                        AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                        p6r0VarJ = yon1.U4();
                    } else if (m39.a(d951Var).isEmpty()) {
                        AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                        p6r0VarJ = yon1.G1("SEARCH_FILTERED", "search/filtered", 1786, "search");
                    } else {
                        siq0Var3 = ((a951) d951Var).a;
                        if (siq0Var3 instanceof riq0) {
                            next4 = next2;
                        } else {
                            if (!(siq0Var3 instanceof qiq0)) {
                                eg.o();
                                return next2;
                            }
                            next4 = ((qiq0) siq0Var3).a;
                        }
                        p6r0VarJ = ulc.j(next4);
                    }
                    n551Var = new n551(new e7r0(str15, p6r0VarJ, str, w051Var.d, o7h.y0(m39.a(d951Var), ",", (String) null, (String) null, (iu30) null, 62)), 0, d951Var);
                }
                String str16 = w051Var.a;
                f951 f951Var3 = n551Var.c;
                int i2 = n551Var.b;
                if (z18) {
                    klr0Var = jlr0Var;
                } else {
                    siq0Var = ((a951) d951Var).a;
                    str2 = "";
                    if (siq0Var instanceof riq0) {
                        k851Var2 = (k851) o7h.C0(((riq0) siq0Var).a);
                        if (k851Var2 != null) {
                            str2 = str3;
                        }
                    } else {
                        if (!(siq0Var instanceof qiq0)) {
                            eg.o();
                            return null;
                        }
                        k851Var = (k851) o7h.C0(((qiq0) siq0Var).b);
                        if (k851Var != null) {
                            str2 = str3;
                        }
                    }
                    klr0Var = new klr0(str2, false);
                }
                if (z18) {
                    a951Var = (a951) d951Var;
                    if (a951Var.b) {
                        te20Var = re20Var;
                    } else {
                        siq0Var2 = a951Var.a;
                        if (siq0Var2 instanceof qiq0) {
                            if (re20Var instanceof te20) {
                                te20Var = (te20) re20Var;
                            } else {
                                te20Var = next2;
                            }
                            if (te20Var == null) {
                                te20Var = re20Var;
                            } else {
                                k851Var4 = (k851) o7h.s0(((qiq0) siq0Var2).b);
                                if (k851Var4 != null) {
                                    next3 = f820Var2.a;
                                    if (next3.isEmpty()) {
                                        next3 = next2;
                                    }
                                    if (next3 != null) {
                                        setP1 = o7h.p1(te20Var.b());
                                        arrayList2 = new ArrayList(q7h.U(next3, 10));
                                        it = next3.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((db20) it.next()).a);
                                        }
                                        Set setP4 = o7h.p1(arrayList2);
                                        List list10 = te20Var.a;
                                        ArrayList arrayList9 = new ArrayList();
                                        while (r6.hasNext()) {
                                            db20Var = (db20) obj;
                                            if (!setP1.contains(db20Var.a)) {
                                            }
                                        }
                                        arrayList3 = new ArrayList(q7h.U(arrayList9, 10));
                                        it2 = arrayList9.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(db20.a((db20) it2.next(), z16));
                                            z16 = true;
                                        }
                                        arrayList4 = new ArrayList(q7h.U(next3, 10));
                                        while (r2.hasNext()) {
                                            arrayList4.add(db20.a(db20Var2, setP1.contains(db20Var2.a)));
                                        }
                                        te20Var = te20.a(te20Var, o7h.N0(arrayList4, arrayList3), next2, 2);
                                    }
                                }
                            }
                        } else {
                            if (!(siq0Var2 instanceof riq0)) {
                                eg.o();
                                return null;
                            }
                            list = ((riq0) siq0Var2).a;
                            k851Var3 = (k851) o7h.s0(list);
                            if (k851Var3 != null) {
                                f820Var = null;
                            } else {
                                f820Var = null;
                            }
                            if (re20Var instanceof te20) {
                                te20Var = (te20) re20Var;
                            } else {
                                te20Var = null;
                            }
                            if (this.b.a.a0()) {
                                if (te20Var != null) {
                                    str4 = te20Var.b;
                                } else {
                                    str4 = null;
                                }
                                if (str4 == null) {
                                    yo20Var = ((k851) list.get(0)).b.e;
                                    if (yo20Var != null) {
                                        arrayList = yo20Var.a;
                                    } else {
                                        arrayList = z6x.a;
                                    }
                                    re20Var = new re20(null, arrayList, false);
                                    te20Var = re20Var;
                                }
                            } else {
                                if (te20Var != null) {
                                    str4 = te20Var.b;
                                } else {
                                    str4 = null;
                                }
                                if (str4 == null) {
                                    yo20Var = ((k851) list.get(0)).b.e;
                                    if (yo20Var != null) {
                                        arrayList = yo20Var.a;
                                    } else {
                                        arrayList = z6x.a;
                                    }
                                    re20Var = new re20(null, arrayList, false);
                                    te20Var = re20Var;
                                }
                            }
                        }
                    }
                } else {
                    te20Var = re20Var;
                }
                e7r0 e7r0Var4 = n551Var.a;
                boolean z21 = !u890.j(z551Var.g, jlr0Var);
                if (z9) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                return Next.h(z551.a(z551Var, null, str16, i2, f951Var3, null, null, klr0Var, te20Var, null, 1, null, e7r0Var4, z21, null, z7, 9521));
            }
            if (!z17) {
                if (f951Var instanceof u851) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if (z18) {
                }
            }
            str = w051Var.a;
            e7r0 e7r0Var5 = z551Var.Y;
            if (!u890.j(str7, str8)) {
                n551Var = next2;
            } else {
                n551Var = next2;
            }
            if (n551Var == null) {
                String str17 = w051Var.b;
                if (!z18) {
                    AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                    p6r0VarJ = yon1.U4();
                } else if (m39.a(d951Var).isEmpty()) {
                    AtomicReferenceArray atomicReferenceArray6 = p6r0.e;
                    p6r0VarJ = yon1.G1("SEARCH_FILTERED", "search/filtered", 1786, "search");
                } else {
                    siq0Var3 = ((a951) d951Var).a;
                    if (siq0Var3 instanceof riq0) {
                        next4 = next2;
                    } else {
                        if (!(siq0Var3 instanceof qiq0)) {
                            eg.o();
                            return next2;
                        }
                        next4 = ((qiq0) siq0Var3).a;
                    }
                    p6r0VarJ = ulc.j(next4);
                }
                n551Var = new n551(new e7r0(str17, p6r0VarJ, str, w051Var.d, o7h.y0(m39.a(d951Var), ",", (String) null, (String) null, (iu30) null, 62)), 0, d951Var);
            }
            String str18 = w051Var.a;
            f951 f951Var4 = n551Var.c;
            int i3 = n551Var.b;
            if (z18) {
                klr0Var = jlr0Var;
            } else {
                siq0Var = ((a951) d951Var).a;
                str2 = "";
                if (siq0Var instanceof riq0) {
                    k851Var2 = (k851) o7h.C0(((riq0) siq0Var).a);
                    if (k851Var2 != null) {
                        str2 = str3;
                    }
                } else {
                    if (!(siq0Var instanceof qiq0)) {
                        eg.o();
                        return null;
                    }
                    k851Var = (k851) o7h.C0(((qiq0) siq0Var).b);
                    if (k851Var != null) {
                        str2 = str3;
                    }
                }
                klr0Var = new klr0(str2, false);
            }
            if (z18) {
                a951Var = (a951) d951Var;
                if (a951Var.b) {
                    te20Var = re20Var;
                } else {
                    siq0Var2 = a951Var.a;
                    if (siq0Var2 instanceof qiq0) {
                        if (re20Var instanceof te20) {
                            te20Var = (te20) re20Var;
                        } else {
                            te20Var = next2;
                        }
                        if (te20Var == null) {
                            te20Var = re20Var;
                        } else {
                            k851Var4 = (k851) o7h.s0(((qiq0) siq0Var2).b);
                            if (k851Var4 != null) {
                                next3 = f820Var2.a;
                                if (next3.isEmpty()) {
                                    next3 = next2;
                                }
                                if (next3 != null) {
                                    setP1 = o7h.p1(te20Var.b());
                                    arrayList2 = new ArrayList(q7h.U(next3, 10));
                                    it = next3.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((db20) it.next()).a);
                                    }
                                    Set setP5 = o7h.p1(arrayList2);
                                    List list11 = te20Var.a;
                                    ArrayList arrayList10 = new ArrayList();
                                    while (r6.hasNext()) {
                                        db20Var = (db20) obj;
                                        if (!setP1.contains(db20Var.a)) {
                                        }
                                    }
                                    arrayList3 = new ArrayList(q7h.U(arrayList10, 10));
                                    it2 = arrayList10.iterator();
                                    while (it2.hasNext()) {
                                        arrayList3.add(db20.a((db20) it2.next(), z16));
                                        z16 = true;
                                    }
                                    arrayList4 = new ArrayList(q7h.U(next3, 10));
                                    while (r2.hasNext()) {
                                        arrayList4.add(db20.a(db20Var2, setP1.contains(db20Var2.a)));
                                    }
                                    te20Var = te20.a(te20Var, o7h.N0(arrayList4, arrayList3), next2, 2);
                                }
                            }
                        }
                    } else {
                        if (!(siq0Var2 instanceof riq0)) {
                            eg.o();
                            return null;
                        }
                        list = ((riq0) siq0Var2).a;
                        k851Var3 = (k851) o7h.s0(list);
                        if (k851Var3 != null) {
                            f820Var = null;
                        } else {
                            f820Var = null;
                        }
                        if (re20Var instanceof te20) {
                            te20Var = (te20) re20Var;
                        } else {
                            te20Var = null;
                        }
                        if (this.b.a.a0()) {
                            if (te20Var != null) {
                                str4 = te20Var.b;
                            } else {
                                str4 = null;
                            }
                            if (str4 == null) {
                                yo20Var = ((k851) list.get(0)).b.e;
                                if (yo20Var != null) {
                                    arrayList = yo20Var.a;
                                } else {
                                    arrayList = z6x.a;
                                }
                                re20Var = new re20(null, arrayList, false);
                                te20Var = re20Var;
                            }
                        } else {
                            if (te20Var != null) {
                                str4 = te20Var.b;
                            } else {
                                str4 = null;
                            }
                            if (str4 == null) {
                                yo20Var = ((k851) list.get(0)).b.e;
                                if (yo20Var != null) {
                                    arrayList = yo20Var.a;
                                } else {
                                    arrayList = z6x.a;
                                }
                                re20Var = new re20(null, arrayList, false);
                                te20Var = re20Var;
                            }
                        }
                    }
                }
            } else {
                te20Var = re20Var;
            }
            e7r0 e7r0Var6 = n551Var.a;
            boolean z22 = !u890.j(z551Var.g, jlr0Var);
            if (z9) {
                z7 = true;
            } else {
                z7 = true;
            }
            return Next.h(z551.a(z551Var, null, str18, i3, f951Var4, null, null, klr0Var, te20Var, null, 1, null, e7r0Var6, z22, null, z7, 9521));
            return Next.j();
        }
        if (q151Var instanceof y051) {
            y051 y051Var = (y051) q151Var;
            String str19 = y051Var.b;
            s851 s851Var = y051Var.c;
            String str20 = y051Var.a;
            if (u890.j(str20, str8)) {
                r851 r851Var3 = s851Var instanceof r851 ? (r851) s851Var : null;
                if (r851Var3 == null) {
                    z3 = s851Var instanceof r851;
                    if (z3) {
                        r851Var = (r851) s851Var;
                    } else {
                        r851Var = null;
                    }
                    if (r851Var == null) {
                        z4 = false;
                    } else {
                        z4 = !r851Var.d;
                    }
                    if (!z4) {
                        String str21 = z551Var.a;
                        if (z3) {
                            r851Var2 = (r851) s851Var;
                        } else {
                            r851Var2 = null;
                        }
                        if (r851Var2 == null) {
                            next = re20Var;
                        } else {
                            next = next7;
                        }
                        AtomicReferenceArray atomicReferenceArray7 = p6r0.e;
                        return Next.h(z551.a(z551Var, null, str21, 0, s851Var, null, null, null, next, null, 1, null, new e7r0(str19, yon1.U4(), str20, 24), false, null, false, 30065));
                    }
                } else if (!(re20Var instanceof re20)) {
                    if (re20Var instanceof te20) {
                        List list12 = r851Var3.e;
                        if (list12 != null ? o7h.p1(list12).equals(o7h.p1(((te20) re20Var).b())) : ((te20) re20Var).b().isEmpty()) {
                            String str22 = ((te20) re20Var).b;
                            if (str22 == null || u890.j(str22, str19)) {
                            }
                        }
                    } else if (!(re20Var instanceof se20)) {
                        eg.o();
                        return null;
                    }
                    z3 = s851Var instanceof r851;
                    if (z3) {
                        r851Var = (r851) s851Var;
                    } else {
                        r851Var = null;
                    }
                    if (r851Var == null) {
                        z4 = false;
                    } else {
                        z4 = !r851Var.d;
                    }
                    if (!z4) {
                        String str23 = z551Var.a;
                        if (z3) {
                            r851Var2 = (r851) s851Var;
                        } else {
                            r851Var2 = null;
                        }
                        if (r851Var2 == null) {
                            next = re20Var;
                        } else {
                            next = next7;
                        }
                        AtomicReferenceArray atomicReferenceArray8 = p6r0.e;
                        return Next.h(z551.a(z551Var, null, str23, 0, s851Var, null, null, null, next, null, 1, null, new e7r0(str19, yon1.U4(), str20, 24), false, null, false, 30065));
                    }
                } else if (u890.j(r851Var3.a, ((re20) re20Var).a)) {
                    z3 = s851Var instanceof r851;
                    if (z3) {
                        r851Var = (r851) s851Var;
                    } else {
                        r851Var = null;
                    }
                    if (r851Var == null) {
                        z4 = false;
                    } else {
                        z4 = !r851Var.d;
                    }
                    if (!z4) {
                        String str24 = z551Var.a;
                        if (z3) {
                            r851Var2 = (r851) s851Var;
                        } else {
                            r851Var2 = null;
                        }
                        if (r851Var2 == null && r851Var2.a == null && r851Var2.e == null && (!(re20Var instanceof te20) || ((te20) re20Var).b == null)) {
                            next = next7;
                        } else {
                            next = re20Var;
                        }
                        AtomicReferenceArray atomicReferenceArray9 = p6r0.e;
                        return Next.h(z551.a(z551Var, null, str24, 0, s851Var, null, null, null, next, null, 1, null, new e7r0(str19, yon1.U4(), str20, 24), false, null, false, 30065));
                    }
                }
            }
            return Next.j();
        }
        if (!(q151Var instanceof v051)) {
            if (q151Var instanceof s051) {
                s051 s051Var = (s051) q151Var;
                return Next.a(f46.S0(new xyn1[]{xyn1Var, new ux41(s051Var.a, s051Var.b)}));
            }
            if (q151Var instanceof z051) {
                return this.d.k(z551Var);
            }
            if (q151Var instanceof kz41) {
                return Next.a(f46.S0(new xyn1[]{xyn1Var, dx41.b}));
            }
            if (q151Var instanceof p051) {
                return Next.a(Effects.a(new hx41[]{new hx41(ejb.f(), valVar)}));
            }
            if (q151Var instanceof f051) {
                return this.g.c(z551Var, (f051) q151Var);
            }
            if (q151Var instanceof e151) {
                return this.e.a(z551Var, (e151) q151Var);
            }
            if (q151Var instanceof pz41) {
                return j0o1.v(z551Var);
            }
            boolean z23 = q151Var instanceof sz41;
            xgc xgcVar = this.f;
            if (z23) {
                return xgcVar.t(z551Var, (sz41) q151Var);
            }
            if (q151Var instanceof i151) {
                return xgcVar.u(z551Var, (i151) q151Var);
            }
            if (q151Var instanceof i051) {
                xrt0 xrt0Var = ((i051) q151Var).a;
                return !u890.j(z551Var.i, xrt0Var) ? Next.h(z551.a(z551Var, null, null, 0, null, null, null, null, null, xrt0Var, 0, null, null, false, null, false, 32511)) : Next.j();
            }
            if (q151Var instanceof b051) {
                return Next.h(z551.a(z551Var, null, null, 0, null, null, null, null, null, null, 2, null, null, false, null, false, 32255));
            }
            if (q151Var instanceof a051) {
                return Next.a(Effects.a(new tc51[]{new tc51(((a051) q151Var).a, (tv80) null, (gto1) null, 12)}));
            }
            if (q151Var instanceof t051) {
                return Next.h(z551.a(z551Var, null, null, 0, null, null, null, null, null, null, 0, ((t051) q151Var).a, null, false, null, false, 31743));
            }
            if (q151Var instanceof c051) {
                c051 c051Var = (c051) q151Var;
                return Next.a(Effects.a(new tc51[]{new tc51(c051Var.a, c051Var.b, (gto1) null, 12)}));
            }
            if (q151Var instanceof gz41) {
                return Next.a(Effects.a(new cx41[]{cx41.b}));
            }
            if (q151Var instanceof d051) {
                return Next.a(Effects.a(new uc51[]{uc51.b}));
            }
            if (q151Var instanceof oz41) {
                oz41 oz41Var = (oz41) q151Var;
                return Next.a(Effects.a(new bx41[]{new bx41(oz41Var.a, oz41Var.b, oz41Var.c)}));
            }
            if (q151Var instanceof nz41) {
                nz41 nz41Var = (nz41) q151Var;
                return Next.a(Effects.a(new bx41[]{new bx41(nz41Var.a.e, nz41Var.b)}));
            }
            if (q151Var instanceof n151) {
                return !z551Var.Z ? Next.h(z551.a(z551Var, null, null, 0, null, null, null, null, null, null, 0, null, null, true, null, false, 28671)) : Next.j();
            }
            if (q151Var instanceof e051) {
                return Next.a(Collections.singleton(new tc51(((e051) q151Var).a, (tv80) null, (gto1) null, 12)));
            }
            if (q151Var instanceof dz41) {
                dz41 dz41Var = (dz41) q151Var;
                return Next.a(f46.S0(new hd51[]{xyn1Var, new tc51(dz41Var.a, dz41Var.c, ob10.b, !z9)}));
            }
            if (q151Var instanceof ez41) {
                return Next.a(Effects.a(new xyn1[]{new ed51(((ez41) q151Var).a), gx41.b}));
            }
            if (q151Var instanceof g151) {
                return this.h.l(z551Var, (g151) q151Var);
            }
            if (q151Var instanceof m151) {
                m151 m151Var = (m151) q151Var;
                return Next.a(f46.S0(new xyn1[]{new zw41(m151Var.a, m151Var.b), xyn1Var}));
            }
            if (q151Var instanceof mz41) {
                mz41 mz41Var = (mz41) q151Var;
                return Next.a(Collections.singleton(new bd51(mz41Var.a, mz41Var.b, mz41Var.c, mz41Var.d)));
            }
            if (q151Var instanceof b151) {
                return Next.a(Effects.a(new sc51[]{xyn1Var}));
            }
            if (q151Var instanceof tz41) {
                return f0o1.p(z551Var);
            }
            if (q151Var instanceof j151) {
                String str25 = ((j151) q151Var).a;
                return !u890.j(str8, str25) ? Next.i(z551Var, Effects.a(new gd51[]{new gd51(str25)})) : Next.j();
            }
            if (q151Var instanceof rz41) {
                return this.i.j(z551Var, (rz41) q151Var);
            }
            if (q151Var instanceof lz41) {
                return ubc.h((lz41) q151Var);
            }
            if (q151Var instanceof q051) {
                return nhc.B((q051) q151Var);
            }
            if (q151Var instanceof xz41) {
                return lhc.l((xz41) q151Var);
            }
            if (q151Var instanceof fz41) {
                return nbc.v(z551Var, (fz41) q151Var);
            }
            if (q151Var instanceof h151) {
                return vhc.j((h151) q151Var);
            }
            if (q151Var instanceof cz41) {
                cz41 cz41Var = (cz41) q151Var;
                return Next.a(Collections.singleton(new yw41(cz41Var.a, cz41Var.b, cz41Var.c, cz41Var.d)));
            }
            if (q151Var instanceof r051) {
                r051 r051Var = (r051) q151Var;
                return Next.a(f46.S0(new hd51[]{xyn1Var, new tc51(r051Var.a, r051Var.c, rb10.b, 8)}));
            }
            if (q151Var instanceof jz41) {
                jz41 jz41Var = (jz41) q151Var;
                return Next.a(Collections.singleton(new tc51(nik1.w6.a, jz41Var.d, new pb10(jz41Var.a, jz41Var.c, jz41Var.b, jz41Var.e), 8)));
            }
            if (q151Var instanceof uz41) {
                return Next.a(Effects.a(new fd51[]{new fd51(((uz41) q151Var).a)}));
            }
            eg.o();
            return null;
        }
        v051 v051Var = (v051) q151Var;
        jqd0 jqd0Var = this.a;
        di4 di4Var = (di4) jqd0Var.d;
        z951 z951Var3 = v051Var.a;
        tv80 tv80Var = v051Var.b;
        String strP = z951Var3.p();
        fw41 fw41Var2 = z551Var.f;
        boolean z24 = fw41Var2.a;
        boolean z25 = fw41Var2.b;
        boolean z26 = (sgy.i(strP) || sgy.a(strP)) && (z24 || z25);
        if (z951Var3.r()) {
            setZ = Collections.singleton(new ad51(z951Var3.p()));
        } else {
            boolean z27 = z951Var3 instanceof x951;
            if (z27) {
                z = ((x951) z951Var3).m;
            } else if ((z951Var3 instanceof z951) && di4Var.d()) {
                z951 z951Var4 = z951Var3;
                if (!z951Var4.u || z951Var4.j) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
            } else if (z26) {
                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 0));
            } else {
                boolean z28 = z951Var3 instanceof z951;
                if (z28 && (p7wVar = (z951Var2 = z951Var3).h) != null) {
                    kl1 kl1Var = (kl1) jqd0Var.c;
                    if (kl1Var.a && sgy.i(p7wVar.a)) {
                        gmt gmtVar = (gmt) kl1Var.b;
                        try {
                            if (gmtVar.m(((yqg) gmtVar.b).b(), p7wVar.b).size() < 10) {
                                setZ = Collections.singleton(new ox41(z951Var2, tv80Var));
                            } else if (z28) {
                                z951Var = z951Var3;
                                if (!sgy.c(z951Var.e)) {
                                    if (z27) {
                                        x951Var = (x951) z951Var3;
                                        if (!sgy.c(x951Var.e)) {
                                            if (fw41Var2.a) {
                                                if (z28) {
                                                    z2 = z951Var3.t;
                                                } else if (z27) {
                                                    z2 = ((x951) z951Var3).l;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                                } else if (sgy.i(z951Var3.p())) {
                                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                                } else {
                                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                                }
                                            } else {
                                                if (z28) {
                                                    z2 = z951Var3.t;
                                                } else if (z27) {
                                                    z2 = ((x951) z951Var3).l;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                                } else if (sgy.i(z951Var3.p())) {
                                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                                } else {
                                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                                }
                                            }
                                        } else if (fw41Var2.a) {
                                            if (z28) {
                                                z2 = z951Var3.t;
                                            } else if (z27) {
                                                z2 = ((x951) z951Var3).l;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                            } else if (sgy.i(z951Var3.p())) {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                            } else {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                            }
                                        } else {
                                            if (z28) {
                                                z2 = z951Var3.t;
                                            } else if (z27) {
                                                z2 = ((x951) z951Var3).l;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                            } else if (sgy.i(z951Var3.p())) {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                            } else {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                            }
                                        }
                                    } else if (fw41Var2.a) {
                                        if (z28) {
                                            z2 = z951Var3.t;
                                        } else if (z27) {
                                            z2 = ((x951) z951Var3).l;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                        } else if (sgy.i(z951Var3.p())) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        } else {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        }
                                    } else {
                                        if (z28) {
                                            z2 = z951Var3.t;
                                        } else if (z27) {
                                            z2 = ((x951) z951Var3).l;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                        } else if (sgy.i(z951Var3.p())) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        } else {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        }
                                    }
                                } else if (z27) {
                                    x951Var = (x951) z951Var3;
                                    if (!sgy.c(x951Var.e)) {
                                        if (fw41Var2.a) {
                                            if (z28) {
                                                z2 = z951Var3.t;
                                            } else if (z27) {
                                                z2 = ((x951) z951Var3).l;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                            } else if (sgy.i(z951Var3.p())) {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                            } else {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                            }
                                        } else {
                                            if (z28) {
                                                z2 = z951Var3.t;
                                            } else if (z27) {
                                                z2 = ((x951) z951Var3).l;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                            } else if (sgy.i(z951Var3.p())) {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                            } else {
                                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                            }
                                        }
                                    } else if (fw41Var2.a) {
                                        if (z28) {
                                            z2 = z951Var3.t;
                                        } else if (z27) {
                                            z2 = ((x951) z951Var3).l;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                        } else if (sgy.i(z951Var3.p())) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        } else {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        }
                                    } else {
                                        if (z28) {
                                            z2 = z951Var3.t;
                                        } else if (z27) {
                                            z2 = ((x951) z951Var3).l;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                        } else if (sgy.i(z951Var3.p())) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        } else {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        }
                                    }
                                } else if (fw41Var2.a) {
                                    if (z28) {
                                        z2 = z951Var3.t;
                                    } else if (z27) {
                                        z2 = ((x951) z951Var3).l;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                    } else if (sgy.i(z951Var3.p())) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    } else {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    }
                                } else {
                                    if (z28) {
                                        z2 = z951Var3.t;
                                    } else if (z27) {
                                        z2 = ((x951) z951Var3).l;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                    } else if (sgy.i(z951Var3.p())) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    } else {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    }
                                }
                            } else if (z27) {
                                x951Var = (x951) z951Var3;
                                if (!sgy.c(x951Var.e)) {
                                    if (fw41Var2.a) {
                                        if (z28) {
                                            z2 = z951Var3.t;
                                        } else if (z27) {
                                            z2 = ((x951) z951Var3).l;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                        } else if (sgy.i(z951Var3.p())) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        } else {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        }
                                    } else {
                                        if (z28) {
                                            z2 = z951Var3.t;
                                        } else if (z27) {
                                            z2 = ((x951) z951Var3).l;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                        } else if (sgy.i(z951Var3.p())) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        } else {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        }
                                    }
                                } else if (fw41Var2.a) {
                                    if (z28) {
                                        z2 = z951Var3.t;
                                    } else if (z27) {
                                        z2 = ((x951) z951Var3).l;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                    } else if (sgy.i(z951Var3.p())) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    } else {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    }
                                } else {
                                    if (z28) {
                                        z2 = z951Var3.t;
                                    } else if (z27) {
                                        z2 = ((x951) z951Var3).l;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                    } else if (sgy.i(z951Var3.p())) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    } else {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    }
                                }
                            } else if (fw41Var2.a) {
                                if (z28) {
                                    z2 = z951Var3.t;
                                } else if (z27) {
                                    z2 = ((x951) z951Var3).l;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                } else if (sgy.i(z951Var3.p())) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                } else {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                }
                            } else {
                                if (z28) {
                                    z2 = z951Var3.t;
                                } else if (z27) {
                                    z2 = ((x951) z951Var3).l;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                } else if (sgy.i(z951Var3.p())) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                } else {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                }
                            }
                        } catch (IOException | SerializationException unused) {
                        }
                    } else if (z28) {
                        z951Var = z951Var3;
                        if (!sgy.c(z951Var.e)) {
                            if (z27) {
                                x951Var = (x951) z951Var3;
                                if (!sgy.c(x951Var.e)) {
                                    if (fw41Var2.a) {
                                        if (z28) {
                                            z2 = z951Var3.t;
                                        } else if (z27) {
                                            z2 = ((x951) z951Var3).l;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                        } else if (sgy.i(z951Var3.p())) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        } else {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        }
                                    } else {
                                        if (z28) {
                                            z2 = z951Var3.t;
                                        } else if (z27) {
                                            z2 = ((x951) z951Var3).l;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                        } else if (sgy.i(z951Var3.p())) {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        } else {
                                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                        }
                                    }
                                } else if (fw41Var2.a) {
                                    if (z28) {
                                        z2 = z951Var3.t;
                                    } else if (z27) {
                                        z2 = ((x951) z951Var3).l;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                    } else if (sgy.i(z951Var3.p())) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    } else {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    }
                                } else {
                                    if (z28) {
                                        z2 = z951Var3.t;
                                    } else if (z27) {
                                        z2 = ((x951) z951Var3).l;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                    } else if (sgy.i(z951Var3.p())) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    } else {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    }
                                }
                            } else if (fw41Var2.a) {
                                if (z28) {
                                    z2 = z951Var3.t;
                                } else if (z27) {
                                    z2 = ((x951) z951Var3).l;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                } else if (sgy.i(z951Var3.p())) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                } else {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                }
                            } else {
                                if (z28) {
                                    z2 = z951Var3.t;
                                } else if (z27) {
                                    z2 = ((x951) z951Var3).l;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                } else if (sgy.i(z951Var3.p())) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                } else {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                }
                            }
                        } else if (z27) {
                            x951Var = (x951) z951Var3;
                            if (!sgy.c(x951Var.e)) {
                                if (fw41Var2.a) {
                                    if (z28) {
                                        z2 = z951Var3.t;
                                    } else if (z27) {
                                        z2 = ((x951) z951Var3).l;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                    } else if (sgy.i(z951Var3.p())) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    } else {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    }
                                } else {
                                    if (z28) {
                                        z2 = z951Var3.t;
                                    } else if (z27) {
                                        z2 = ((x951) z951Var3).l;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                    } else if (sgy.i(z951Var3.p())) {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    } else {
                                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                    }
                                }
                            } else if (fw41Var2.a) {
                                if (z28) {
                                    z2 = z951Var3.t;
                                } else if (z27) {
                                    z2 = ((x951) z951Var3).l;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                } else if (sgy.i(z951Var3.p())) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                } else {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                }
                            } else {
                                if (z28) {
                                    z2 = z951Var3.t;
                                } else if (z27) {
                                    z2 = ((x951) z951Var3).l;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                } else if (sgy.i(z951Var3.p())) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                } else {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                }
                            }
                        } else if (fw41Var2.a) {
                            if (z28) {
                                z2 = z951Var3.t;
                            } else if (z27) {
                                z2 = ((x951) z951Var3).l;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                            } else if (sgy.i(z951Var3.p())) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            } else {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            }
                        } else {
                            if (z28) {
                                z2 = z951Var3.t;
                            } else if (z27) {
                                z2 = ((x951) z951Var3).l;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                            } else if (sgy.i(z951Var3.p())) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            } else {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            }
                        }
                    } else if (z27) {
                        x951Var = (x951) z951Var3;
                        if (!sgy.c(x951Var.e)) {
                            if (fw41Var2.a) {
                                if (z28) {
                                    z2 = z951Var3.t;
                                } else if (z27) {
                                    z2 = ((x951) z951Var3).l;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                } else if (sgy.i(z951Var3.p())) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                } else {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                }
                            } else {
                                if (z28) {
                                    z2 = z951Var3.t;
                                } else if (z27) {
                                    z2 = ((x951) z951Var3).l;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                                } else if (sgy.i(z951Var3.p())) {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                } else {
                                    setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                                }
                            }
                        } else if (fw41Var2.a) {
                            if (z28) {
                                z2 = z951Var3.t;
                            } else if (z27) {
                                z2 = ((x951) z951Var3).l;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                            } else if (sgy.i(z951Var3.p())) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            } else {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            }
                        } else {
                            if (z28) {
                                z2 = z951Var3.t;
                            } else if (z27) {
                                z2 = ((x951) z951Var3).l;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                            } else if (sgy.i(z951Var3.p())) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            } else {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            }
                        }
                    } else if (fw41Var2.a) {
                        if (z28) {
                            z2 = z951Var3.t;
                        } else if (z27) {
                            z2 = ((x951) z951Var3).l;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                        } else if (sgy.i(z951Var3.p())) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        } else {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        }
                    } else {
                        if (z28) {
                            z2 = z951Var3.t;
                        } else if (z27) {
                            z2 = ((x951) z951Var3).l;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                        } else if (sgy.i(z951Var3.p())) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        } else {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        }
                    }
                } else if (z28) {
                    z951Var = z951Var3;
                    if (!sgy.c(z951Var.e) && z951Var.s == 2 && di4Var.Q()) {
                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new m551(jqd0Var, (q1o1) z951Var3, tv80Var, v051Var));
                    } else if (z27) {
                        x951Var = (x951) z951Var3;
                        if (!sgy.c(x951Var.e) && x951Var.k) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 1));
                        } else if (fw41Var2.a || z25) {
                            if (z28) {
                                z2 = z951Var3.t;
                            } else if (z27) {
                                z2 = ((x951) z951Var3).l;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                            } else if (sgy.i(z951Var3.p()) || sgy.e(z951Var3.p()) || sgy.f(z951Var3.p())) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            } else {
                                setZ = jqd0.t(z951Var3, tv80Var);
                            }
                        } else if (sgy.i(z951Var3.p())) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        } else {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        }
                    } else if (fw41Var2.a) {
                        if (z28) {
                            z2 = z951Var3.t;
                        } else if (z27) {
                            z2 = ((x951) z951Var3).l;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                        } else if (sgy.i(z951Var3.p())) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        } else {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        }
                    } else {
                        if (z28) {
                            z2 = z951Var3.t;
                        } else if (z27) {
                            z2 = ((x951) z951Var3).l;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                        } else if (sgy.i(z951Var3.p())) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        } else {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        }
                    }
                } else if (z27) {
                    x951Var = (x951) z951Var3;
                    if (!sgy.c(x951Var.e)) {
                        if (fw41Var2.a) {
                            if (z28) {
                                z2 = z951Var3.t;
                            } else if (z27) {
                                z2 = ((x951) z951Var3).l;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                            } else if (sgy.i(z951Var3.p())) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            } else {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            }
                        } else {
                            if (z28) {
                                z2 = z951Var3.t;
                            } else if (z27) {
                                z2 = ((x951) z951Var3).l;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                            } else if (sgy.i(z951Var3.p())) {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            } else {
                                setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                            }
                        }
                    } else if (fw41Var2.a) {
                        if (z28) {
                            z2 = z951Var3.t;
                        } else if (z27) {
                            z2 = ((x951) z951Var3).l;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                        } else if (sgy.i(z951Var3.p())) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        } else {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        }
                    } else {
                        if (z28) {
                            z2 = z951Var3.t;
                        } else if (z27) {
                            z2 = ((x951) z951Var3).l;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                        } else if (sgy.i(z951Var3.p())) {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        } else {
                            setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                        }
                    }
                } else if (fw41Var2.a) {
                    if (z28) {
                        z2 = z951Var3.t;
                    } else if (z27) {
                        z2 = ((x951) z951Var3).l;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                    } else if (sgy.i(z951Var3.p())) {
                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                    } else {
                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                    }
                } else {
                    if (z28) {
                        z2 = z951Var3.t;
                    } else if (z27) {
                        z2 = ((x951) z951Var3).l;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, true, new l551(jqd0Var, z951Var3, z551Var, tv80Var, v051Var, (byte) 2));
                    } else if (sgy.i(z951Var3.p())) {
                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                    } else {
                        setZ = jqd0Var.z(z951Var3, z551Var, tv80Var, false, new rl21(jqd0Var, z951Var3, tv80Var));
                    }
                }
            }
        }
        return Next.a(setZ);
    }
}
