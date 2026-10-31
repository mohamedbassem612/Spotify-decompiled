package p;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ods implements kvn0, c690 {
    public final p9m X = hm5.P(xay.e(2, irn1.o0(100, 0, (dlv) null, 6)), xay.f(2, irn1.o0(100, 50, (dlv) null, 4)));
    public boolean Y;
    public int Z;
    public final mwn0 a;
    public final q7r0 b;
    public final c690 c;
    public final n431 d;
    public final los e;
    public final bab1 f;
    public final lwq0 g;
    public final ocp0 h;
    public final q2j0 i;
    public final abh0 t;

    public ods(mwn0 mwn0Var, q7r0 q7r0Var, c690 c690Var, n431 n431Var, pds pdsVar, los losVar, bab1 bab1Var, lwq0 lwq0Var, ocp0 ocp0Var, q2j0 q2j0Var, abh0 abh0Var) {
        this.a = mwn0Var;
        this.b = q7r0Var;
        this.c = c690Var;
        this.d = n431Var;
        this.e = losVar;
        this.f = bab1Var;
        this.g = lwq0Var;
        this.h = ocp0Var;
        this.i = q2j0Var;
        this.t = abh0Var;
        losVar.b(new vas(this, (byte) 3));
    }

    public final void a(String str, tv80 tv80Var, Bundle bundle) {
        e(str, bundle, tv80Var, null, null);
    }

    public final void b(String str, String str2, String str3) {
        e(str2, null, null, str, str3);
    }

    public final void c(Bundle bundle, String str, String str2, String str3) {
        e(str2, bundle, null, str, str3);
    }

    public final void d(List list, nsn0 nsn0Var, int i, Function0 function0) {
        gfq0 gfq0Var;
        int iNextIndex;
        String str;
        nsn0 nsn0Var2 = nsn0Var;
        List<ffq0> list2 = list;
        boolean z = list2 instanceof Collection;
        zeq0 zeq0Var = zeq0.a;
        if (!z || !list2.isEmpty()) {
            for (ffq0 ffq0Var : list2) {
                if (!u890.j(ffq0Var, zeq0Var) && !(ffq0Var instanceof cfq0)) {
                    mwn0 mwn0Var = this.a;
                    mwn0Var.e(nsn0Var2);
                    mwn0Var.f(nsn0Var2);
                    break;
                }
            }
        }
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            ffq0 ffq0Var2 = (ffq0) obj;
            p9m p9mVar = i2 == p7h.L(list) ? this.X : smg1.a;
            boolean z2 = ffq0Var2 instanceof bfq0;
            bab1 bab1Var = this.f;
            if (z2) {
                bab1Var.d.d(((bfq0) ffq0Var2).a, p9mVar);
            } else if (ffq0Var2 instanceof efq0) {
                gfq0 gfq0Var2 = ((efq0) ffq0Var2).a;
                mwq0 mwq0Var = this.g.a;
                mwq0Var.d = p9mVar;
                mwq0Var.b.add(new kwq0(UUID.randomUUID(), gfq0Var2));
            } else if (ffq0Var2 instanceof afq0) {
                c380 c380Var = (c380) bab1Var.b.getValue();
                v2g0 v2g0Var = ((afq0) ffq0Var2).a;
                if (v2g0Var.equals(t2g0.a)) {
                    Object objT0 = o7h.t0(p7h.L(c380Var) - 1, c380Var);
                    if (objT0 == null) {
                        eg.m("Required value was null.");
                        return;
                    }
                    gfq0Var = (gfq0) objT0;
                } else if (v2g0Var.equals(u2g0.a)) {
                    gfq0Var = (gfq0) o7h.q0(c380Var);
                } else {
                    if (!(v2g0Var instanceof s2g0)) {
                        eg.o();
                        return;
                    }
                    gfq0Var = ((s2g0) v2g0Var).a;
                }
                ListIterator listIterator = c380Var.listIterator(c380Var.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (u890.j((gfq0) listIterator.previous(), gfq0Var)) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex < 0) {
                    eg.m("Check failed.");
                    return;
                }
                if (i != 0) {
                    for (gfq0 gfq0Var3 : o7h.k0(c380Var, iNextIndex + 1)) {
                        if (i == 1 && (str = gfq0Var3.c) != null) {
                            this.d.b(str, l231.a, new zih1());
                        }
                    }
                }
                bab1Var.d.c(gfq0Var, p9mVar);
            } else if (u890.j(ffq0Var2, dfq0.a)) {
                if (i == 0) {
                    eg.m("Required value was null.");
                    return;
                } else {
                    this.Z = i;
                    this.i.invoke();
                }
            } else if (ffq0Var2 instanceof cfq0) {
                lzm lzmVar = new lzm(this, (cfq0) ffq0Var2, nsn0Var2, i, function0);
                if (i == 2) {
                    lzmVar.invoke();
                } else {
                    this.t.invoke(lzmVar);
                }
            } else if (u890.j(ffq0Var2, yeq0.a)) {
                this.Y = true;
                this.e.a(ixb.c);
            } else {
                if (!u890.j(ffq0Var2, zeq0Var)) {
                    eg.o();
                    return;
                }
                function0.invoke();
            }
            nsn0Var2 = nsn0Var;
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf A[LOOP:0: B:30:0x009d->B:38:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5 A[EDGE_INSN: B:61:0x00c5->B:40:0x00c5 BREAK  A[LOOP:0: B:30:0x009d->B:38:0x00bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2 A[SYNTHETIC] */
    public final void e(String str, Bundle bundle, tv80 tv80Var, String str2, String str3) {
        lsn0 lsn0Var;
        lsn0 lsn0Var2;
        gfq0 gfq0Var;
        List list;
        boolean z;
        ffq0 efq0Var;
        char c;
        v5b1 v5b1VarA;
        gfq0 gfq0Var2;
        ListIterator listIterator;
        char c2;
        Object objPrevious;
        List listSingletonList;
        v5b1 v5b1VarC;
        kab kabVar;
        rss0 rss0VarC;
        rss0 rss0Var;
        b3i1 type;
        List listSingletonList2;
        List list2;
        gfq0 gfq0Var3;
        if (tv80Var == null) {
            if (str3 != null) {
                ou80.Companion.getClass();
                lsn0Var2 = new lsn0(str, new ou80(str3));
            } else {
                lsn0Var = jsn0.a;
            }
            gfq0Var = new gfq0(str, str2, bundle);
            hfq0 hfq0VarG = g();
            list = hfq0VarG.b;
            z = hfq0VarG.a;
            efq0Var = zeq0.a;
            if (z) {
                c = 1;
                if (pds.a.contains(str) || (gfq0Var3 = (gfq0) o7h.C0(list)) == null) {
                    v5b1VarA = d7b1.a(str);
                    if (v5b1VarA == null) {
                        listSingletonList2 = Collections.singletonList(efq0Var);
                    } else {
                        if (v5b1VarA.getType().equals(lab.d)) {
                            gfq0Var2 = (gfq0) o7h.C0(list);
                            listIterator = list.listIterator(list.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    c2 = c;
                                    objPrevious = null;
                                    break;
                                }
                                objPrevious = listIterator.previous();
                                c2 = c;
                                rss0VarC = jss0.a.c(((gfq0) objPrevious).a);
                                if (rss0VarC instanceof rss0) {
                                    rss0Var = rss0VarC;
                                } else {
                                    rss0Var = null;
                                }
                                if (rss0Var != null) {
                                    break;
                                } else {
                                    c = c2;
                                }
                            }
                            gfq0 gfq0Var4 = (gfq0) objPrevious;
                            if (gfq0Var2 != null) {
                                v5b1VarC = sab.a.c(gfq0Var2.a);
                                if (v5b1VarC instanceof kab) {
                                    kabVar = (kab) v5b1VarC;
                                } else {
                                    kabVar = null;
                                }
                                if (kabVar != null || gfq0Var4 == null) {
                                    listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                                } else {
                                    afq0 afq0Var = new afq0(new s2g0(gfq0Var4));
                                    bfq0 bfq0Var = new bfq0(pds.a(gfq0Var, 3));
                                    ffq0[] ffq0VarArr = new ffq0[2];
                                    ffq0VarArr[0] = afq0Var;
                                    ffq0VarArr[c2] = bfq0Var;
                                    listSingletonList = p7h.M(ffq0VarArr);
                                }
                            } else {
                                listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                            }
                        } else {
                            listSingletonList = null;
                        }
                        if (listSingletonList != null) {
                            list2 = listSingletonList;
                        } else {
                            type = v5b1VarA.getType();
                            if (pds.b.contains(type)) {
                                efq0Var = new bfq0(gfq0Var);
                            } else if (pds.c.contains(type)) {
                                efq0Var = new efq0(gfq0Var);
                            }
                            listSingletonList2 = Collections.singletonList(efq0Var);
                        }
                    }
                } else {
                    v5b1 v5b1VarC2 = sab.a.c(gfq0Var3.a);
                    if ((v5b1VarC2 instanceof lab ? (lab) v5b1VarC2 : null) != null) {
                        listSingletonList2 = p7h.M(new ffq0[]{yeq0.a, efq0Var});
                    } else {
                        v5b1VarA = d7b1.a(str);
                        if (v5b1VarA == null) {
                            listSingletonList2 = Collections.singletonList(efq0Var);
                        } else {
                            if (v5b1VarA.getType().equals(lab.d)) {
                                listSingletonList = null;
                            } else {
                                gfq0Var2 = (gfq0) o7h.C0(list);
                                listIterator = list.listIterator(list.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        c2 = c;
                                        objPrevious = null;
                                        break;
                                    }
                                    objPrevious = listIterator.previous();
                                    c2 = c;
                                    rss0VarC = jss0.a.c(((gfq0) objPrevious).a);
                                    if (rss0VarC instanceof rss0) {
                                        rss0Var = rss0VarC;
                                    } else {
                                        rss0Var = null;
                                    }
                                    if (rss0Var != null) {
                                        break;
                                        break;
                                    }
                                    c = c2;
                                }
                                gfq0 gfq0Var5 = (gfq0) objPrevious;
                                if (gfq0Var2 != null) {
                                    v5b1VarC = sab.a.c(gfq0Var2.a);
                                    if (v5b1VarC instanceof kab) {
                                        kabVar = (kab) v5b1VarC;
                                    } else {
                                        kabVar = null;
                                    }
                                    if (kabVar != null) {
                                        listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                                    } else {
                                        listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                                    }
                                } else {
                                    listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                                }
                            }
                            if (listSingletonList != null) {
                                list2 = listSingletonList;
                            } else {
                                type = v5b1VarA.getType();
                                if (pds.b.contains(type)) {
                                    efq0Var = new bfq0(gfq0Var);
                                } else if (pds.c.contains(type)) {
                                    efq0Var = new efq0(gfq0Var);
                                }
                                listSingletonList2 = Collections.singletonList(efq0Var);
                            }
                        }
                    }
                }
                d(list2, lsn0Var2, 0, new dy7(str2, this, str, tv80Var, bundle, str3, (byte) 5));
            }
            listSingletonList2 = Collections.singletonList(efq0Var);
            list2 = listSingletonList2;
            d(list2, lsn0Var2, 0, new dy7(str2, this, str, tv80Var, bundle, str3, (byte) 5));
        }
        lsn0Var = new lsn0(str, tv80Var.a);
        lsn0Var2 = lsn0Var;
        gfq0Var = new gfq0(str, str2, bundle);
        hfq0 hfq0VarG2 = g();
        list = hfq0VarG2.b;
        z = hfq0VarG2.a;
        efq0Var = zeq0.a;
        if (z) {
            c = 1;
            if (pds.a.contains(str)) {
                v5b1VarA = d7b1.a(str);
                if (v5b1VarA == null) {
                    listSingletonList2 = Collections.singletonList(efq0Var);
                } else {
                    if (v5b1VarA.getType().equals(lab.d)) {
                        listSingletonList = null;
                    } else {
                        gfq0Var2 = (gfq0) o7h.C0(list);
                        listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                c2 = c;
                                objPrevious = null;
                                break;
                            }
                            objPrevious = listIterator.previous();
                            c2 = c;
                            rss0VarC = jss0.a.c(((gfq0) objPrevious).a);
                            if (rss0VarC instanceof rss0) {
                                rss0Var = rss0VarC;
                            } else {
                                rss0Var = null;
                            }
                            if (rss0Var != null) {
                                break;
                                break;
                            }
                            c = c2;
                        }
                        gfq0 gfq0Var6 = (gfq0) objPrevious;
                        if (gfq0Var2 != null) {
                            v5b1VarC = sab.a.c(gfq0Var2.a);
                            if (v5b1VarC instanceof kab) {
                                kabVar = (kab) v5b1VarC;
                            } else {
                                kabVar = null;
                            }
                            if (kabVar != null) {
                                listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                            } else {
                                listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                            }
                        } else {
                            listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                        }
                    }
                    if (listSingletonList != null) {
                        list2 = listSingletonList;
                    } else {
                        type = v5b1VarA.getType();
                        if (pds.b.contains(type)) {
                            efq0Var = new bfq0(gfq0Var);
                        } else if (pds.c.contains(type)) {
                            efq0Var = new efq0(gfq0Var);
                        }
                        listSingletonList2 = Collections.singletonList(efq0Var);
                    }
                }
            } else {
                v5b1VarA = d7b1.a(str);
                if (v5b1VarA == null) {
                    listSingletonList2 = Collections.singletonList(efq0Var);
                } else {
                    if (v5b1VarA.getType().equals(lab.d)) {
                        listSingletonList = null;
                    } else {
                        gfq0Var2 = (gfq0) o7h.C0(list);
                        listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                c2 = c;
                                objPrevious = null;
                                break;
                            }
                            objPrevious = listIterator.previous();
                            c2 = c;
                            rss0VarC = jss0.a.c(((gfq0) objPrevious).a);
                            if (rss0VarC instanceof rss0) {
                                rss0Var = rss0VarC;
                            } else {
                                rss0Var = null;
                            }
                            if (rss0Var != null) {
                                break;
                                break;
                            }
                            c = c2;
                        }
                        gfq0 gfq0Var7 = (gfq0) objPrevious;
                        if (gfq0Var2 != null) {
                            v5b1VarC = sab.a.c(gfq0Var2.a);
                            if (v5b1VarC instanceof kab) {
                                kabVar = (kab) v5b1VarC;
                            } else {
                                kabVar = null;
                            }
                            if (kabVar != null) {
                                listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                            } else {
                                listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                            }
                        } else {
                            listSingletonList = Collections.singletonList(new bfq0(pds.a(gfq0Var, 2)));
                        }
                    }
                    if (listSingletonList != null) {
                        list2 = listSingletonList;
                    } else {
                        type = v5b1VarA.getType();
                        if (pds.b.contains(type)) {
                            efq0Var = new bfq0(gfq0Var);
                        } else if (pds.c.contains(type)) {
                            efq0Var = new efq0(gfq0Var);
                        }
                        listSingletonList2 = Collections.singletonList(efq0Var);
                    }
                }
            }
            d(list2, lsn0Var2, 0, new dy7(str2, this, str, tv80Var, bundle, str3, (byte) 5));
        }
        listSingletonList2 = Collections.singletonList(efq0Var);
        list2 = listSingletonList2;
        d(list2, lsn0Var2, 0, new dy7(str2, this, str, tv80Var, bundle, str3, (byte) 5));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    public final void f(int i, String str) {
        yrn0 yrn0Var;
        Object afq0Var;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            ou80.Companion.getClass();
            yrn0Var = new yrn0(new ou80(str));
        } else {
            yrn0Var = new yrn0((ou80) null);
        }
        hfq0 hfq0VarG = g();
        List list = hfq0VarG.b;
        kfq0 kfq0Var = hfq0VarG.c;
        boolean z = true;
        if (kfq0Var.a != null) {
            afq0Var = dfq0.a;
        } else {
            afq0Var = list.size() > 1 ? new afq0(t2g0.a) : yeq0.a;
        }
        List listSingletonList = Collections.singletonList(afq0Var);
        if (kfq0Var.a != null) {
            z = kfq0Var.b;
        } else {
            gfq0 gfq0Var = (gfq0) o7h.C0(list);
            if (list.size() <= 1) {
                z = false;
            } else {
                if ((gfq0Var != null ? gfq0Var.c : null) != null || gfq0Var == null) {
                    z = false;
                } else {
                    v5b1 v5b1VarC = sab.a.c(gfq0Var.a);
                    if ((v5b1VarC instanceof lab ? (lab) v5b1VarC : null) == null) {
                        z = false;
                    }
                }
            }
        }
        if (z) {
            listSingletonList = Collections.singletonList(new cfq0(listSingletonList));
        }
        d(listSingletonList, yrn0Var, i, new nds(this, (byte) 0));
    }

    public final hfq0 g() {
        return new hfq0(this.Y, (List) this.f.b.getValue(), (kfq0) this.h.invoke());
    }

    public final void h(String str) {
        f(1, str);
    }

    public final void pop() {
        f(2, "");
    }
}
