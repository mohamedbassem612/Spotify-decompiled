package p;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.provider.Settings;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f64 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f64(byte b, Object obj, Object obj2, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object e(Object obj, lnm lnmVar) {
        q1b q1bVar;
        if (lnmVar instanceof q1b) {
            q1bVar = (q1b) lnmVar;
            int i = q1bVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                q1bVar.b = i - Integer.MIN_VALUE;
            } else {
                q1bVar = new q1b(this, lnmVar);
            }
        } else {
            q1bVar = new q1b(this, lnmVar);
        }
        Object obj2 = q1bVar.a;
        int i2 = q1bVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            o1b o1bVar = new o1b(((n1b) this.c).b, ((Boolean) obj).booleanValue());
            q1bVar.b = 1;
            Object objEmit = vr20Var.emit(o1bVar, q1bVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(Object obj, lnm lnmVar) {
        v1b v1bVar;
        if (lnmVar instanceof v1b) {
            v1bVar = (v1b) lnmVar;
            int i = v1bVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v1bVar.b = i - Integer.MIN_VALUE;
            } else {
                v1bVar = new v1b(this, lnmVar);
            }
        } else {
            v1bVar = new v1b(this, lnmVar);
        }
        Object obj2 = v1bVar.a;
        int i2 = v1bVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            le30 le30VarA = ((me30) ((x1b) this.c).e).a((String) obj);
            v1bVar.b = 1;
            Object objEmit = vr20Var.emit(le30VarA, v1bVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object g(Object obj, lnm lnmVar) {
        g3b g3bVar;
        boolean z;
        if (lnmVar instanceof g3b) {
            g3bVar = (g3b) lnmVar;
            int i = g3bVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                g3bVar.b = i - Integer.MIN_VALUE;
            } else {
                g3bVar = new g3b(this, lnmVar);
            }
        } else {
            g3bVar = new g3b(this, lnmVar);
        }
        Object obj2 = g3bVar.a;
        int i2 = g3bVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Map map = ((cxc0) obj).f.q;
            Set set = ((h3b) this.c).b;
            if ((set instanceof Collection) && set.isEmpty()) {
                z = true;
            } else {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        CharSequence charSequence = (CharSequence) map.get((String) it.next());
                        if (charSequence == null || ihc1.y0(charSequence)) {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            g3bVar.b = 1;
            Object objEmit = vr20Var.emit(boolValueOf, g3bVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    private final Object h(Object obj, lnm lnmVar) {
        if (((String) obj).length() > 0) {
            ((iu30) this.b).invoke(new gg80((at80) this.c, md80.c, cg80.EDIT));
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    private final Object i(Object obj, lnm lnmVar) {
        lgb lgbVar;
        String string;
        f0u f0uVar;
        hmx hmxVar;
        f0u f0uVarSingletonList;
        f0u f0uVar2;
        ngb ngbVar = (ngb) this.c;
        Context context = ngbVar.a;
        if (lnmVar instanceof lgb) {
            lgbVar = (lgb) lnmVar;
            int i = lgbVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lgbVar.b = i - Integer.MIN_VALUE;
            } else {
                lgbVar = new lgb(this, lnmVar);
            }
        } else {
            lgbVar = new lgb(this, lnmVar);
        }
        Object obj2 = lgbVar.a;
        int i2 = lgbVar.b;
        f0u f0uVar3 = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            nnr nnrVarK = ngbVar.b.k();
            ArrayList<kx7> arrayList = new ArrayList();
            for (Object obj3 : (List) obj) {
                if (!((kx7) obj3).c) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (kx7 kx7Var : arrayList) {
                String str = kx7Var.a;
                luq0 luq0Var = kx7Var.d;
                f0u f0uVar4 = nnrVarK != null ? nnrVarK.d : f0uVar3;
                luq0 luq0Var2 = luq0.b;
                List listSingletonList = (luq0Var != luq0Var2 || f0uVar4 == null) ? z6x.a : Collections.singletonList(f0uVar4);
                if (luq0Var != luq0Var2 || nnrVarK == null) {
                    string = kx7Var.b;
                } else {
                    string = context.getString(a6o1.u(nnrVarK.c));
                    string.getClass();
                }
                uzd1 uzd1Var = new uzd1(string, 1);
                luq0 luq0Var3 = luq0.c;
                if (luq0Var != luq0Var2) {
                    f0uVar = f0uVar3;
                    if (!f46.M(new luq0[]{luq0Var3, luq0.f}, luq0Var)) {
                        up7 up7Var = kx7Var.e;
                        int i3 = up7Var != null ? up7Var.a : 0;
                        switch (i3 != 0 ? jgb.c[l1d.C(i3)] : -1) {
                            case -1:
                                hmxVar = jmx.c;
                                break;
                            case 0:
                            default:
                                eg.o();
                                return f0uVar;
                            case 1:
                                hmxVar = hmx.c;
                                break;
                            case 2:
                                hmxVar = unx.c;
                                break;
                            case 3:
                                hmxVar = lmx.c;
                                break;
                            case 4:
                                hmxVar = cux.c;
                                break;
                            case 5:
                                hmxVar = kmx.c;
                                break;
                            case 6:
                                hmxVar = fmx.c;
                                break;
                            case 7:
                                hmxVar = jmx.c;
                                break;
                        }
                    } else {
                        hmxVar = jmx.c;
                    }
                } else {
                    f0u f0uVar5 = nnrVarK != null ? nnrVarK.c : f0uVar3;
                    int i4 = f0uVar5 != null ? jgb.b[f0uVar5.ordinal()] : -1;
                    if (i4 != 1) {
                        f0uVar = f0uVar3;
                        hmxVar = (i4 == 2 || i4 == 3) ? gmx.c : hmx.c;
                    } else {
                        f0uVar = f0uVar3;
                        hmxVar = nmx.c;
                    }
                }
                qk70 qk70Var = new qk70(hmxVar);
                if (luq0Var == luq0Var2 || luq0Var == luq0Var3) {
                    f0uVarSingletonList = f0uVar;
                    f0uVar2 = f0uVarSingletonList;
                } else {
                    f0uVar2 = f0uVar;
                    f0uVarSingletonList = Collections.singletonList(new zqc1(new xqc1(wkx.c, 1), new brc1(context.getString(2131954245), 1, f0uVar2)));
                }
                arrayList2.add(new zv31(str, uzd1Var, qk70Var, false, true, listSingletonList, f0uVarSingletonList, (ArrayList) null, new hkb(luq0Var), 288));
                f0uVar3 = f0uVar2;
            }
            lgbVar.b = 1;
            Object objEmit = vr20Var.emit(arrayList2, lgbVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x012c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x012d -> B:51:0x0132). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object b(p.uv00 r13, p.lnm r14) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f64.b(p.uv00, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object c(y2r0 y2r0Var, lnm lnmVar) {
        ub6 ub6Var;
        c9n c9nVar = (c9n) this.c;
        vb6 vb6Var = (vb6) this.b;
        xe01 xe01Var = vb6Var.O0;
        if (lnmVar instanceof ub6) {
            ub6Var = (ub6) lnmVar;
            int i = ub6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ub6Var.d = i - Integer.MIN_VALUE;
            } else {
                ub6Var = new ub6(this, lnmVar);
            }
        } else {
            ub6Var = new ub6(this, lnmVar);
        }
        Object obj = ub6Var.b;
        int i2 = ub6Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            if (vb6Var.h.b == 1 && !y2r0Var.b.isEmpty()) {
                List list = ((x2r0) o7h.q0(y2r0Var.b)).b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((v2r0) it.next()).a == w2r0.Z) {
                            vb6Var.W0 = fn31.T(vb6Var.U0, (o8n) null, 0, new pb6(vb6Var, null), 3);
                            break;
                        }
                    }
                }
            }
            l2t[] l2tVarArr = {fn31.q(c9nVar, (o8n) null, 0, new qb6(vb6Var, y2r0Var, null, (byte) 0), 3), fn31.q(c9nVar, (o8n) null, 0, new qb6(vb6Var, y2r0Var, null, (byte) 1), 3)};
            ub6Var.a = y2r0Var;
            ub6Var.d = 1;
            Object objV = o1p1.v(l2tVarArr, ub6Var);
            d9n d9nVar = d9n.a;
            if (objV == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y2r0Var = ub6Var.a;
            hm5.M(obj);
        }
        try {
            String str = y2r0Var.a;
            hoj0 hoj0VarC = ((ioj0) xe01Var.a.getValue()).c(jo70.class, str);
            if (hoj0VarC != null && !(hoj0VarC instanceof goj0)) {
                throw new IOException("Failed to load metadata for ".concat(str));
            }
            cdr0 cdr0VarC = vb6Var.i.c(xe01Var, y2r0Var);
            cdr0VarC.start();
            vb6Var.P0 = cdr0VarC;
            bpb1 bpb1Var = vb6Var.Q0;
            ob6 ob6Var = new ob6(vb6Var, (byte) 1);
            bpb1Var.getClass();
            bpb1Var.m((Object) null, ob6Var);
            vb6Var.i();
        } catch (Exception e) {
            vb6Var.Y.a();
            vb6Var.Z.a();
            vb6Var.h(e);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0287  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:167:0x0376  */
    /* JADX WARN: Code duplicated, block: B:191:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:206:0x0422  */
    /* JADX WARN: Code duplicated, block: B:226:0x0472  */
    /* JADX WARN: Code duplicated, block: B:241:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:256:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:295:0x057f  */
    /* JADX WARN: Code duplicated, block: B:306:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:324:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:339:0x0627  */
    /* JADX WARN: Code duplicated, block: B:364:0x0690  */
    /* JADX WARN: Code duplicated, block: B:379:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:417:0x0762  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:434:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:471:0x0897  */
    /* JADX WARN: Code duplicated, block: B:515:0x095e  */
    /* JADX WARN: Code duplicated, block: B:533:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:592:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x014a  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    public final Object emit(Object obj, lnm lnmVar) {
        e64 e64Var;
        ij4 ij4Var;
        vs4 vs4Var;
        yv4 yv4Var;
        vr20 vr20Var;
        gap0 gap0Var;
        Object hap0Var;
        int i;
        vr20 vr20Var2;
        ly5 ly5Var;
        fn6 fn6Var;
        ir6 ir6Var;
        cu6 du6Var;
        at6 at6Var;
        yu6 yu6Var;
        sv6 sv6Var;
        a37 a37Var;
        cl7 cl7Var;
        ccu cyh1Var;
        j38 j38Var;
        y38 y38Var;
        xc8 xc8Var;
        u281 u281Var;
        wo8 wo8Var;
        yd9 yd9Var;
        vj9 vj9Var;
        di9 di9Var;
        um9 um9Var;
        kga kgaVar;
        rha rhaVar;
        List list;
        int i2;
        vr20 vr20Var3;
        vr20 vr20Var4;
        int i3;
        wya wyaVar;
        pib pibVar;
        vr20 vr20Var5;
        Map map;
        Set setKeySet;
        byte b = this.a;
        int i4 = 2;
        int i5 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        d9n d9nVar = d9n.a;
        ccu ccuVarUri = null;
        switch (b) {
            case 0:
                qie qieVarA = (qie) obj2;
                if (lnmVar instanceof e64) {
                    e64Var = (e64) lnmVar;
                    int i6 = e64Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        e64Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        e64Var = new e64(this, lnmVar);
                    }
                } else {
                    e64Var = new e64(this, lnmVar);
                }
                Object obj4 = e64Var.a;
                int i7 = e64Var.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                vr20 vr20Var6 = (vr20) obj3;
                List list2 = (List) obj;
                if (list2 != null) {
                    List list3 = qieVarA.d;
                    ArrayList arrayListS1 = o7h.s1(list2, 2, 2);
                    Iterator it = list3.iterator();
                    Iterator it2 = arrayListS1.iterator();
                    ArrayList arrayList = new ArrayList(Math.min(q7h.U(list3, 10), q7h.U(arrayListS1, 10)));
                    while (it.hasNext() && it2.hasNext()) {
                        Object next = it.next();
                        List list4 = (List) it2.next();
                        arrayList.add(bhe.a((bhe) next, ((vve1) list4.get(0)).a, ((vve1) list4.get(1)).a, false, 19));
                    }
                    qieVarA = qie.a(qieVarA, arrayList, false, 23);
                }
                e64Var.b = 1;
                return vr20Var6.emit(qieVarA, e64Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof ij4) {
                    ij4Var = (ij4) lnmVar;
                    int i8 = ij4Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        ij4Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        ij4Var = new ij4(this, lnmVar);
                    }
                } else {
                    ij4Var = new ij4(this, lnmVar);
                }
                Object obj5 = ij4Var.a;
                int i9 = ij4Var.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                vr20 vr20Var7 = (vr20) obj3;
                Boolean boolValueOf = Boolean.valueOf(Settings.Global.getInt(((jj4) obj2).c.getContentResolver(), "airplane_mode_on", 0) != 0);
                ij4Var.b = 1;
                return vr20Var7.emit(boolValueOf, ij4Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof vs4) {
                    vs4Var = (vs4) lnmVar;
                    int i10 = vs4Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        vs4Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        vs4Var = new vs4(this, lnmVar);
                    }
                } else {
                    vs4Var = new vs4(this, lnmVar);
                }
                Object obj6 = vs4Var.a;
                int i11 = vs4Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                vr20 vr20Var8 = (vr20) obj3;
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                spq0 spq0VarA = spq0.a(contextTrack != null ? ((ys4) obj2).a(contextTrack) : null);
                vs4Var.b = 1;
                return vr20Var8.emit(spq0VarA, vs4Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof yv4) {
                    yv4Var = (yv4) lnmVar;
                    int i12 = yv4Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        yv4Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        yv4Var = new yv4(this, lnmVar);
                    }
                } else {
                    yv4Var = new yv4(this, lnmVar);
                }
                Object obj7 = yv4Var.a;
                int i13 = yv4Var.b;
                if (i13 == 0) {
                    hm5.M(obj7);
                    vr20Var = (vr20) obj3;
                    icu icuVar = (ncu) obj;
                    if (icuVar instanceof icu) {
                        NsdServiceInfo nsdServiceInfo = icuVar.a;
                        yv4Var.c = vr20Var;
                        yv4Var.d = 0;
                        yv4Var.b = 1;
                        ohd ohdVar = new ohd(1, aym.t(yv4Var));
                        ohdVar.t();
                        ((NsdManager) obj2).resolveService(nsdServiceInfo, new xv4(ohdVar));
                        Object objR = ohdVar.r();
                        if (objR != d9nVar) {
                            vr20Var2 = vr20Var;
                            obj7 = objR;
                            i = 0;
                            hap0Var = obj7;
                            vr20Var = vr20Var2;
                        }
                    } else {
                        if (icuVar instanceof jcu) {
                            hap0Var = new dap0(((jcu) icuVar).a);
                        } else if (icuVar instanceof kcu) {
                            hap0Var = new fap0(((kcu) icuVar).a);
                        } else {
                            if (u890.j(icuVar, lcu.a)) {
                                gap0Var = gap0.a;
                            } else if (icuVar instanceof mcu) {
                                hap0Var = new hap0(((mcu) icuVar).a);
                            } else {
                                if (!u890.j(icuVar, lcu.b)) {
                                    eg.o();
                                    return null;
                                }
                                gap0Var = gap0.b;
                            }
                            hap0Var = gap0Var;
                        }
                        i = 0;
                    }
                    return d9nVar;
                }
                if (i13 != 1) {
                    if (i13 == 2) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = yv4Var.d;
                vr20Var2 = yv4Var.c;
                hm5.M(obj7);
                hap0Var = obj7;
                vr20Var = vr20Var2;
                yv4Var.c = null;
                yv4Var.d = i;
                yv4Var.b = 2;
                if (vr20Var.emit(hap0Var, yv4Var) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 4:
                Context context = ((my5) obj2).a;
                if (lnmVar instanceof ly5) {
                    ly5Var = (ly5) lnmVar;
                    int i14 = ly5Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        ly5Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        ly5Var = new ly5(this, lnmVar);
                    }
                } else {
                    ly5Var = new ly5(this, lnmVar);
                }
                Object obj8 = ly5Var.a;
                int i15 = ly5Var.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                vr20 vr20Var9 = (vr20) obj3;
                ArrayList<jy5> arrayList2 = new ArrayList();
                for (Object obj9 : (List) obj) {
                    if (!((jy5) obj9).f) {
                        arrayList2.add(obj9);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                for (jy5 jy5Var : arrayList2) {
                    String str = jy5Var.a;
                    String str2 = jy5Var.e;
                    List listSingletonList = str2.length() > 0 ? Collections.singletonList(str2) : z6x.a;
                    String string = jy5Var.b;
                    if (string.length() == 0) {
                        string = context.getString(2131952378);
                    }
                    arrayList3.add(new zv31(str, new uzd1(string, i4), new qk70(omx.c), false, str2.length() > 0, listSingletonList, Collections.singletonList(new brc1(context.getString(2131952397), 1, null)), (ArrayList) null, new sz5(jy5Var.d, jy5Var.a, str2), 288));
                    i4 = 2;
                }
                ly5Var.b = 1;
                return vr20Var9.emit(arrayList3, ly5Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                return c((y2r0) obj, lnmVar);
            case 6:
                if (lnmVar instanceof fn6) {
                    fn6Var = (fn6) lnmVar;
                    int i16 = fn6Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        fn6Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        fn6Var = new fn6(this, lnmVar);
                    }
                } else {
                    fn6Var = new fn6(this, lnmVar);
                }
                Object obj10 = fn6Var.a;
                int i17 = fn6Var.b;
                if (i17 == 0) {
                    hm5.M(obj10);
                    k1r map2 = ((k1r) obj).map(new ve3((ey81) obj2, (byte) 28));
                    fn6Var.b = 1;
                    return ((vr20) obj3).emit(map2, fn6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i17 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                jr6 jr6Var = (jr6) obj2;
                if (lnmVar instanceof ir6) {
                    ir6Var = (ir6) lnmVar;
                    int i18 = ir6Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ir6Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        ir6Var = new ir6(this, lnmVar);
                    }
                } else {
                    ir6Var = new ir6(this, lnmVar);
                }
                Object obj11 = ir6Var.a;
                int i19 = ir6Var.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                vr20 vr20Var10 = (vr20) obj3;
                PlayerState playerState = (PlayerState) obj;
                if (u890.j(playerState.contextUri(), jr6Var.a) || u890.j(playerState.contextUri(), jr6Var.e)) {
                    ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
                    ccuVarUri = contextTrack2 != null ? contextTrack2.uri() : null;
                    du6Var = (!playerState.isPlaying() || playerState.isPaused()) ? new du6(ccuVarUri != null ? ccuVarUri : "") : new eu6(ccuVarUri != null ? ccuVarUri : "");
                } else {
                    du6Var = cu6.a;
                }
                ir6Var.b = 1;
                return vr20Var10.emit(du6Var, ir6Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof at6) {
                    at6Var = (at6) lnmVar;
                    int i20 = at6Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        at6Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        at6Var = new at6(this, lnmVar);
                    }
                } else {
                    at6Var = new at6(this, lnmVar);
                }
                Object obj12 = at6Var.a;
                int i21 = at6Var.b;
                if (i21 == 0) {
                    hm5.M(obj12);
                    LinkedHashSet linkedHashSetX0 = dm61.x0(((vfr0) ((jkp0) ((d520) obj2).c).b).a, (Set) obj);
                    at6Var.b = 1;
                    return ((vr20) obj3).emit(linkedHashSetX0, at6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof yu6) {
                    yu6Var = (yu6) lnmVar;
                    int i22 = yu6Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        yu6Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        yu6Var = new yu6(this, lnmVar);
                    }
                } else {
                    yu6Var = new yu6(this, lnmVar);
                }
                Object obj13 = yu6Var.a;
                int i23 = yu6Var.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                vr20 vr20Var11 = (vr20) obj3;
                uje1 uje1Var = (uje1) obj;
                boolean z = ((bv6) obj2).g;
                boolean z2 = uje1Var.c;
                boolean z3 = uje1Var.b;
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(jx11.b);
                boolean z4 = uje1Var.a;
                if (z4 || z3 || z2) {
                    smc0VarN.add(jx11.c);
                }
                if (z4 || z3 || (z2 && z)) {
                    smc0VarN.add(jx11.d);
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                yu6Var.b = 1;
                return vr20Var11.emit(smc0VarK, yu6Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof sv6) {
                    sv6Var = (sv6) lnmVar;
                    int i24 = sv6Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        sv6Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        sv6Var = new sv6(this, lnmVar);
                    }
                } else {
                    sv6Var = new sv6(this, lnmVar);
                }
                Object obj14 = sv6Var.a;
                int i25 = sv6Var.b;
                if (i25 == 0) {
                    hm5.M(obj14);
                    yzc0 yzc0VarN = ((vv6) obj2).n((String) obj);
                    sv6Var.b = 1;
                    return ((vr20) obj3).emit(yzc0VarN, sv6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof a37) {
                    a37Var = (a37) lnmVar;
                    int i26 = a37Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        a37Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        a37Var = new a37(this, lnmVar);
                    }
                } else {
                    a37Var = new a37(this, lnmVar);
                }
                Object obj15 = a37Var.a;
                int i27 = a37Var.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                vr20 vr20Var12 = (vr20) obj3;
                String str3 = (String) obj;
                if (str3.length() == 0) {
                    str3 = ((x27) obj2).b;
                }
                a37Var.b = 1;
                return vr20Var12.emit(str3, a37Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof cl7) {
                    cl7Var = (cl7) lnmVar;
                    int i28 = cl7Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        cl7Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        cl7Var = new cl7(this, lnmVar);
                    }
                } else {
                    cl7Var = new cl7(this, lnmVar);
                }
                Object obj16 = cl7Var.a;
                int i29 = cl7Var.b;
                if (i29 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var13 = (vr20) obj3;
                    xvl1 xvl1Var = (xvl1) obj;
                    if (xvl1Var != null) {
                        UUID uuid = (UUID) obj2;
                        ewq ewqVar = xvl1Var.d;
                        int iOrdinal = xvl1Var.b.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1) {
                            cyh1Var = new cyh1("", uuid);
                            ccuVarUri = cyh1Var;
                        } else if (iOrdinal == 2) {
                            String strC = ewqVar.c("attachment_id");
                            if (strC == null) {
                                strC = "";
                            }
                            ccuVarUri = new byh1(strC, "");
                        } else if (iOrdinal != 3) {
                            if (iOrdinal == 4) {
                                cyh1Var = new cyh1("", uuid);
                            } else if (iOrdinal == 5) {
                                cyh1Var = ayh1.a;
                            } else {
                                eg.o();
                            }
                            ccuVarUri = cyh1Var;
                        } else {
                            String strC2 = ewqVar.c("error_reason");
                            if (strC2 == null) {
                                strC2 = "";
                            }
                            String strC3 = ewqVar.c("error_message");
                            if (strC3 == null) {
                                strC3 = "";
                            }
                            ccuVarUri = new zxh1((nhc1.Y(strC2, "ATTACHMENT_", false) || strC2.equals("UNSUPPORTED_CONTENT_TYPE")) ? new jk7(strC3) : kk7.a, "");
                        }
                    }
                    if (ccuVarUri == null) {
                        return rih1Var;
                    }
                    cl7Var.b = 1;
                    return vr20Var13.emit(ccuVarUri, cl7Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i29 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof j38) {
                    j38Var = (j38) lnmVar;
                    int i30 = j38Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        j38Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        j38Var = new j38(this, lnmVar);
                    }
                } else {
                    j38Var = new j38(this, lnmVar);
                }
                Object obj17 = j38Var.a;
                int i31 = j38Var.b;
                if (i31 == 0) {
                    hm5.M(obj17);
                    Object objApply = ((kr60) obj2).apply((ByteBuffer) obj);
                    j38Var.b = 1;
                    return ((vr20) obj3).emit(objApply, j38Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof y38) {
                    y38Var = (y38) lnmVar;
                    int i32 = y38Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        y38Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        y38Var = new y38(this, lnmVar);
                    }
                } else {
                    y38Var = new y38(this, lnmVar);
                }
                Object obj18 = y38Var.a;
                int i33 = y38Var.b;
                if (i33 == 0) {
                    hm5.M(obj18);
                    c790 c790Var = new c790(((a48) obj).b, ((z38) obj2).b.b());
                    y38Var.b = 1;
                    return ((vr20) obj3).emit(c790Var, y38Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i33 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof xc8) {
                    xc8Var = (xc8) lnmVar;
                    int i34 = xc8Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        xc8Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        xc8Var = new xc8(this, lnmVar);
                    }
                } else {
                    xc8Var = new xc8(this, lnmVar);
                }
                Object obj19 = xc8Var.a;
                int i35 = xc8Var.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                vr20 vr20Var14 = (vr20) obj3;
                w281 w281Var = ((uv00) obj).a(w281.class, ((yc8) obj2).b).b;
                if (w281Var != null && (u281Var = w281Var.g) != null) {
                    ccuVarUri = u281Var.a;
                }
                xc8Var.b = 1;
                return vr20Var14.emit(ccuVarUri, xc8Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof wo8) {
                    wo8Var = (wo8) lnmVar;
                    int i36 = wo8Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        wo8Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        wo8Var = new wo8(this, lnmVar);
                    }
                } else {
                    wo8Var = new wo8(this, lnmVar);
                }
                Object obj20 = wo8Var.a;
                int i37 = wo8Var.b;
                if (i37 == 0) {
                    hm5.M(obj20);
                    LinkedHashSet linkedHashSetX1 = dm61.x0(((vfr0) ((jkp0) ((em0) obj2).c).b).a, (Set) obj);
                    wo8Var.b = 1;
                    return ((vr20) obj3).emit(linkedHashSetX1, wo8Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i37 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                return b((uv00) obj, lnmVar);
            case 18:
                if (lnmVar instanceof yd9) {
                    yd9Var = (yd9) lnmVar;
                    int i38 = yd9Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        yd9Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        yd9Var = new yd9(this, lnmVar);
                    }
                } else {
                    yd9Var = new yd9(this, lnmVar);
                }
                Object obj21 = yd9Var.a;
                int i39 = yd9Var.b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                vr20 vr20Var15 = (vr20) obj3;
                String strP = nhc1.P(((ge9) obj).c);
                if (ihc1.y0(strP)) {
                    strP = null;
                }
                ccuVarUri = strP != null ? new ccu(strP, ((yqg) ((ic9) obj2).c).e()) : null;
                if (ccuVarUri == null) {
                    return rih1Var;
                }
                yd9Var.b = 1;
                return vr20Var15.emit(ccuVarUri, yd9Var) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof vj9) {
                    vj9Var = (vj9) lnmVar;
                    int i40 = vj9Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        vj9Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        vj9Var = new vj9(this, lnmVar);
                    }
                } else {
                    vj9Var = new vj9(this, lnmVar);
                }
                Object obj22 = vj9Var.a;
                int i41 = vj9Var.b;
                if (i41 == 0) {
                    hm5.M(obj22);
                    vr20 vr20Var16 = (vr20) obj3;
                    re9 re9Var = (re9) obj;
                    re9Var.getClass();
                    di9 di9Var2 = re9Var.b.b;
                    int iOrdinal2 = ((r65) obj2).a().ordinal();
                    di9 di9Var3 = di9.a;
                    di9 di9Var4 = di9.b;
                    if (iOrdinal2 == 0) {
                        di9Var = di9Var3;
                    } else if (iOrdinal2 == 1) {
                        di9Var = di9Var4;
                    } else if (iOrdinal2 == 2) {
                        di9Var = di9.c;
                    } else {
                        eg.o();
                    }
                    int iOrdinal3 = di9Var.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                if (iOrdinal3 == 3) {
                                    return rih1Var;
                                }
                                eg.o();
                            } else if (di9Var2 == di9.d) {
                                return rih1Var;
                            }
                        } else if (di9Var2 != di9Var3 && di9Var2 != di9Var4) {
                            return rih1Var;
                        }
                    } else if (di9Var2 != di9Var3) {
                        return rih1Var;
                    }
                    if (!re9Var.d.contains(jne.a)) {
                        return rih1Var;
                    }
                    vj9Var.b = 1;
                    return vr20Var16.emit(obj, vj9Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i41 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof um9) {
                    um9Var = (um9) lnmVar;
                    int i42 = um9Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        um9Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        um9Var = new um9(this, lnmVar);
                    }
                } else {
                    um9Var = new um9(this, lnmVar);
                }
                Object obj23 = um9Var.a;
                int i43 = um9Var.b;
                if (i43 != 0) {
                    if (i43 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                qev qevVar = (qev) obj2;
                rev revVar = new rev((lp9) qevVar.a.a.getValue(), ((Number) qevVar.b.a.getValue()).floatValue(), ((Boolean) qevVar.c.a.getValue()).booleanValue());
                um9Var.b = 1;
                return ((vr20) obj3).emit(revVar, um9Var) == d9nVar ? d9nVar : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof kga) {
                    kgaVar = (kga) lnmVar;
                    int i44 = kgaVar.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        kgaVar.b = i44 - Integer.MIN_VALUE;
                    } else {
                        kgaVar = new kga(this, lnmVar);
                    }
                } else {
                    kgaVar = new kga(this, lnmVar);
                }
                Object obj24 = kgaVar.a;
                int i45 = kgaVar.b;
                if (i45 != 0) {
                    if (i45 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                vr20 vr20Var17 = (vr20) obj3;
                Map map3 = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map3.size()));
                for (Map.Entry entry : map3.entrySet()) {
                    linkedHashMap.put(new jh5((zjd1) obj2, entry.getKey()), entry.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), (k3r) entry2.getValue());
                }
                kgaVar.b = 1;
                return vr20Var17.emit(linkedHashMap2, kgaVar) == d9nVar ? d9nVar : rih1Var;
            case 22:
                ic9 ic9Var = (ic9) obj2;
                if (lnmVar instanceof rha) {
                    rhaVar = (rha) lnmVar;
                    int i46 = rhaVar.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        rhaVar.b = i46 - Integer.MIN_VALUE;
                    } else {
                        rhaVar = new rha(this, lnmVar);
                    }
                } else {
                    rhaVar = new rha(this, lnmVar);
                }
                Object objS = rhaVar.a;
                int i47 = rhaVar.b;
                if (i47 == 0) {
                    hm5.M(objS);
                    vr20 vr20Var18 = (vr20) obj3;
                    list = (List) obj;
                    bpb1 bpb1Var = (bpb1) ic9Var.c;
                    nw5 nw5Var = new nw5(2, (lnm) null, (byte) 3);
                    rhaVar.c = vr20Var18;
                    rhaVar.f = list;
                    rhaVar.d = 0;
                    rhaVar.g = 0;
                    rhaVar.b = 1;
                    if (b5p1.j(bpb1Var, nw5Var, rhaVar) != d9nVar) {
                        i2 = 0;
                        vr20Var3 = vr20Var18;
                    }
                    return d9nVar;
                }
                if (i47 == 1) {
                    int i48 = rhaVar.g;
                    int i49 = rhaVar.d;
                    list = rhaVar.f;
                    vr20Var3 = rhaVar.c;
                    hm5.M(objS);
                    i2 = i48;
                    i5 = i49;
                } else {
                    if (i47 != 2) {
                        if (i47 == 3) {
                            hm5.M(objS);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = rhaVar.d;
                    List list5 = rhaVar.f;
                    vr20Var4 = rhaVar.c;
                    hm5.M(objS);
                }
                rhaVar.c = null;
                rhaVar.f = null;
                rhaVar.d = i3;
                rhaVar.b = 3;
                if (vr20Var4.emit(objS, rhaVar) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
                wc5 wc5Var = new wc5(list, ic9Var, (lnm) null, (byte) 28);
                rhaVar.c = vr20Var3;
                rhaVar.f = null;
                rhaVar.d = i5;
                rhaVar.g = i2;
                rhaVar.b = 2;
                objS = smo1.s(wc5Var, rhaVar);
                if (objS != d9nVar) {
                    vr20Var4 = vr20Var3;
                    i3 = i5;
                    rhaVar.c = null;
                    rhaVar.f = null;
                    rhaVar.d = i3;
                    rhaVar.b = 3;
                    if (vr20Var4.emit(objS, rhaVar) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (lnmVar instanceof wya) {
                    wyaVar = (wya) lnmVar;
                    int i50 = wyaVar.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        wyaVar.b = i50 - Integer.MIN_VALUE;
                    } else {
                        wyaVar = new wya(this, lnmVar);
                    }
                } else {
                    wyaVar = new wya(this, lnmVar);
                }
                Object obj25 = wyaVar.a;
                int i51 = wyaVar.b;
                if (i51 == 0) {
                    hm5.M(obj25);
                    List listL1 = o7h.l1(((Map) obj).values());
                    wyaVar.d = 0;
                    wyaVar.b = 1;
                    if (((vr20) obj3).emit(listL1, wyaVar) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i51 != 1) {
                    if (i51 == 2) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = wyaVar.d;
                hm5.M(obj25);
                long jIntValue = ((Number) ((xya) obj2).b.k.b()).intValue();
                wyaVar.d = i5;
                wyaVar.b = 2;
                if (hap1.i(jIntValue, wyaVar) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return e(obj, lnmVar);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return f(obj, lnmVar);
            case 26:
                return g(obj, lnmVar);
            case 27:
                return h(obj, lnmVar);
            case 28:
                return i(obj, lnmVar);
            default:
                if (lnmVar instanceof pib) {
                    pibVar = (pib) lnmVar;
                    int i52 = pibVar.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        pibVar.b = i52 - Integer.MIN_VALUE;
                    } else {
                        pibVar = new pib(this, lnmVar);
                    }
                } else {
                    pibVar = new pib(this, lnmVar);
                }
                Object objI = pibVar.a;
                int i53 = pibVar.b;
                if (i53 == 0) {
                    hm5.M(objI);
                    vr20Var5 = (vr20) obj3;
                    map = (Map) obj;
                    setKeySet = map.keySet();
                    pibVar.c = vr20Var5;
                    pibVar.f = map;
                    pibVar.g = setKeySet;
                    pibVar.d = 0;
                    pibVar.b = 1;
                    objI = b5p1.i((bpb1) obj2, pibVar);
                    if (objI != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i53 != 1) {
                    if (i53 == 2) {
                        hm5.M(objI);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = pibVar.d;
                setKeySet = pibVar.g;
                map = pibVar.f;
                vr20Var5 = pibVar.c;
                hm5.M(objI);
                Set setV0 = dm61.v0(setKeySet, (Iterable) objI);
                if (!setV0.isEmpty()) {
                    n57.e("Attempt to interact with non enabled Bluetooth LE characteristics " + setV0);
                }
                Map mapL = sqg0.L(map, setV0);
                pibVar.c = null;
                pibVar.f = null;
                pibVar.g = null;
                pibVar.d = i5;
                pibVar.b = 2;
                if (vr20Var5.emit(mapL, pibVar) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }

    public /* synthetic */ f64(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
