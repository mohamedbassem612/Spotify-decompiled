package p;

import android.net.Uri;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d9l implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public d9l(p811 p811Var, ui01 ui01Var, o811 o811Var, o811 o811Var2, o811 o811Var3) {
        this.a = (byte) 8;
        this.c = p811Var;
        this.b = ui01Var;
        this.d = o811Var;
        this.e = o811Var2;
        this.f = o811Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
    
        if (r5.d(r7) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        if (r5.d(r7) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0108, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(com.spotify.player.model.PlayerState r20, p.lnm r21) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d9l.b(com.spotify.player.model.PlayerState, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, lnm lnmVar) {
        jc01 jc01Var;
        if (lnmVar instanceof jc01) {
            jc01Var = (jc01) lnmVar;
            int i = jc01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jc01Var.c = i - Integer.MIN_VALUE;
            } else {
                jc01Var = new jc01(this, lnmVar);
            }
        } else {
            jc01Var = new jc01(this, lnmVar);
        }
        Object objB = jc01Var.a;
        int i2 = jc01Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                ed01 ed01Var = (ed01) this.b;
                String str2 = (String) this.c;
                jc01Var.c = 1;
                objB = ed01Var.b(str2, str, jc01Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            ven0 ven0Var = (ven0) this.d;
            id01 id01Var = zc01.a;
            ven0Var.setValue((sb01) objB);
            ((hdn0) this.e).t(0);
            ((hdn0) this.f).t(0);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(iud iudVar, lnm lnmVar) {
        ego egoVar;
        wkt wktVar;
        iu30 iu30Var;
        Uri uri;
        Uri uri2;
        Object objA;
        iu30 iu30Var2;
        Uri uri3;
        wkt wktVar2;
        Uri uri4;
        if (lnmVar instanceof ego) {
            egoVar = (ego) lnmVar;
            int i = egoVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                egoVar.g = i - Integer.MIN_VALUE;
            } else {
                egoVar = new ego(this, lnmVar);
            }
        } else {
            egoVar = new ego(this, lnmVar);
        }
        Object obj = egoVar.e;
        int i2 = egoVar.g;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (!(iudVar instanceof aud)) {
                if (iudVar instanceof ztd) {
                    wh71 wh71Var = (wh71) ((res) this.f).f;
                    ztd ztdVar = (ztd) iudVar;
                    dlw0 dlw0Var = new dlw0(ztdVar.b, ztdVar.c);
                    egoVar.g = 4;
                    if (wh71Var.a(dlw0Var, egoVar) == d9nVar) {
                    }
                }
                return rih1Var;
            }
            iu30 iu30Var3 = (iu30) this.b;
            wktVar = ((aud) iudVar).a;
            xwa xwaVar = (xwa) this.c;
            vwa[] vwaVarArr = {new vwa()};
            egoVar.a = wktVar;
            egoVar.b = iu30Var3;
            egoVar.g = 1;
            Object objA2 = xwaVar.a(vwaVarArr, egoVar);
            if (objA2 != d9nVar) {
                obj = objA2;
                iu30Var = iu30Var3;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            iu30Var = (iu30) egoVar.b;
            wktVar = egoVar.a;
            hm5.M(obj);
        } else {
            if (i2 == 2) {
                iu30Var = (iu30) egoVar.c;
                Uri uri5 = (Uri) egoVar.b;
                wkt wktVar3 = egoVar.a;
                hm5.M(obj);
                uri = uri5;
                wktVar = wktVar3;
                uri2 = ((wwa) o7h.V0((List) obj)).b;
                xwa xwaVar2 = (xwa) this.e;
                vwa[] vwaVarArr2 = {new vwa()};
                egoVar.a = wktVar;
                egoVar.b = uri;
                egoVar.c = uri2;
                egoVar.d = iu30Var;
                egoVar.g = 3;
                objA = xwaVar2.a(vwaVarArr2, egoVar);
                if (objA != d9nVar) {
                    obj = objA;
                    iu30Var2 = iu30Var;
                    uri3 = uri2;
                    wktVar2 = wktVar;
                    uri4 = uri;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iu30Var2 = egoVar.d;
            uri3 = (Uri) egoVar.c;
            uri4 = (Uri) egoVar.b;
            wktVar2 = egoVar.a;
            hm5.M(obj);
        }
        iu30Var2.invoke(new cgo(uri3, uri4, ((wwa) o7h.V0((List) obj)).b, wktVar2));
        return rih1Var;
        Uri uri6 = ((wwa) o7h.V0((List) obj)).b;
        xwa xwaVar3 = (xwa) this.d;
        vwa[] vwaVarArr3 = {new vwa()};
        egoVar.a = wktVar;
        egoVar.b = uri6;
        egoVar.c = iu30Var;
        egoVar.g = 2;
        Object objA3 = xwaVar3.a(vwaVarArr3, egoVar);
        if (objA3 != d9nVar) {
            uri = uri6;
            obj = objA3;
            uri2 = ((wwa) o7h.V0((List) obj)).b;
            xwa xwaVar4 = (xwa) this.e;
            vwa[] vwaVarArr4 = {new vwa()};
            egoVar.a = wktVar;
            egoVar.b = uri;
            egoVar.c = uri2;
            egoVar.d = iu30Var;
            egoVar.g = 3;
            objA = xwaVar4.a(vwaVarArr4, egoVar);
            if (objA != d9nVar) {
                obj = objA;
                iu30Var2 = iu30Var;
                uri3 = uri2;
                wktVar2 = wktVar;
                uri4 = uri;
                iu30Var2.invoke(new cgo(uri3, uri4, ((wwa) o7h.V0((List) obj)).b, wktVar2));
                return rih1Var;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:200:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:254:0x05be  */
    /* JADX WARN: Code duplicated, block: B:272:0x0621  */
    /* JADX WARN: Code duplicated, block: B:309:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x01be  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0200  */
    /* JADX WARN: Code duplicated, block: B:77:0x0218  */
    /* JADX WARN: Code duplicated, block: B:78:0x021b  */
    /* JADX WARN: Code duplicated, block: B:79:0x021d  */
    /* JADX WARN: Code duplicated, block: B:82:0x024b  */
    /* JADX WARN: Code duplicated, block: B:84:0x024e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0253  */
    /* JADX WARN: Code duplicated, block: B:88:0x0257  */
    /* JADX WARN: Code duplicated, block: B:90:0x025b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0261  */
    /* JADX WARN: Code duplicated, block: B:95:0x0268  */
    /* JADX WARN: Code duplicated, block: B:96:0x026d  */
    /* JADX WARN: Code duplicated, block: B:99:0x027f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032  */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x021b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object emit(Object obj, lnm lnmVar) throws Throwable {
        c9l c9lVar;
        p811 p811Var;
        p811 p811Var2;
        p811 p811Var3;
        Object obj2;
        vgn0 vgn0Var;
        ssw0 ssw0Var;
        long j;
        int i;
        p811 p811Var4;
        vu30 vu30Var;
        qjm qjmVar;
        boolean z;
        ok50 ok50Var;
        long j2;
        r091 r091Var;
        xu51 xu51Var;
        Object obj3;
        int iS;
        rih1 rih1Var;
        wb91 wb91VarB;
        int iMax;
        int iC;
        mmr0 mmr0Var;
        wb91 wb91VarB2;
        tr80 tr80VarK;
        tr80 tr80VarK2;
        int iIntValue;
        int iIntValue2;
        tr80 tr80Var;
        int iC2;
        byte b;
        int iC3;
        mmr0 mmr0Var2;
        som1 som1Var;
        vgn0 vgn0Var2 = obj;
        byte b2 = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var2 = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b2) {
            case 0:
                if (lnmVar instanceof c9l) {
                    c9lVar = (c9l) lnmVar;
                    int i2 = c9lVar.Z;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c9lVar.Z = i2 - Integer.MIN_VALUE;
                    } else {
                        c9lVar = new c9l(this, lnmVar);
                    }
                } else {
                    c9lVar = new c9l(this, lnmVar);
                }
                Object obj9 = c9lVar.X;
                int i3 = c9lVar.Z;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            int i4 = c9lVar.t;
                            long j3 = c9lVar.i;
                            vgn0 vgn0Var3 = c9lVar.h;
                            ssw0 ssw0Var2 = c9lVar.g;
                            p811Var3 = c9lVar.f;
                            p811Var2 = c9lVar.e;
                            vu30Var = c9lVar.d;
                            p811Var4 = c9lVar.c;
                            vgn0 vgn0Var4 = c9lVar.b;
                            Object obj10 = c9lVar.a;
                            hm5.M(obj9);
                            vgn0Var = vgn0Var3;
                            ssw0Var = ssw0Var2;
                            j = j3;
                            i = i4;
                            vgn0Var2 = vgn0Var4;
                            obj2 = obj10;
                        } else {
                            if (i3 != 2) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vgn0 vgn0Var5 = c9lVar.b;
                            hm5.M(obj9);
                            vgn0Var2 = vgn0Var5;
                        }
                        vgn0Var2 = vgn0Var2;
                        vgn0Var2.c((Object) null);
                        return rih1Var2;
                    }
                    hm5.M(obj9);
                    vgn0 vgn0Var6 = (xgn0) obj8;
                    p811 p811Var5 = (p811) obj7;
                    yzj yzjVar = yzj.V0;
                    p811Var2 = (p811) obj6;
                    p811Var3 = (p811) obj5;
                    ssw0 ssw0Var3 = (ssw0) obj4;
                    c9lVar.a = vgn0Var2;
                    c9lVar.b = vgn0Var6;
                    c9lVar.c = p811Var5;
                    c9lVar.d = yzjVar;
                    c9lVar.e = p811Var2;
                    c9lVar.f = p811Var3;
                    c9lVar.g = ssw0Var3;
                    c9lVar.h = vgn0Var6;
                    c9lVar.i = (short) 1000;
                    c9lVar.t = 0;
                    c9lVar.Z = 1;
                    if (vgn0Var6.a(c9lVar) == d9nVar) {
                        return d9nVar;
                    }
                    obj2 = vgn0Var2;
                    vgn0 vgn0Var7 = vgn0Var6;
                    vgn0Var = vgn0Var7;
                    ssw0Var = ssw0Var3;
                    j = 1000;
                    i = 0;
                    p811Var4 = p811Var5;
                    vu30Var = yzjVar;
                    vgn0Var2 = vgn0Var7;
                    Object obj11 = p811Var4.a;
                    p811Var4.a = obj2;
                    if (obj11 == null || ((Boolean) vu30Var.invoke(obj11, obj2)).booleanValue()) {
                        ssw0 ssw0Var4 = ssw0Var;
                        faa0 faa0Var = (faa0) p811Var2.a;
                        if (faa0Var != null) {
                            p811Var = null;
                            try {
                                faa0Var.d((CancellationException) null);
                            } catch (Throwable th) {
                                th = th;
                                vgn0Var2.c(p811Var);
                                throw th;
                            }
                        } else {
                            p811Var = null;
                        }
                        p811Var2.a = p811Var;
                        p811Var3.a = p811Var;
                        c9lVar.a = p811Var;
                        c9lVar.b = vgn0Var2;
                        c9lVar.c = p811Var;
                        c9lVar.d = p811Var;
                        c9lVar.e = p811Var;
                        c9lVar.f = p811Var;
                        c9lVar.g = p811Var;
                        c9lVar.h = p811Var;
                        c9lVar.t = i;
                        c9lVar.Z = 2;
                        vgn0Var2 = vgn0Var2;
                        if (ssw0Var4.b(obj2, c9lVar) == d9nVar) {
                            return d9nVar;
                        }
                        break;
                    } else {
                        p811Var3.a = obj2;
                        if (p811Var2.a == null) {
                            vgn0Var2 = vgn0Var2;
                            p811Var2.a = fn31.T(ssw0Var, (o8n) null, 0, new b9l(j, vgn0Var, p811Var3, p811Var2, ssw0Var, null), 3);
                            vgn0Var2 = vgn0Var2;
                        }
                    }
                    vgn0Var2 = vgn0Var2;
                    vgn0Var2.c((Object) null);
                    return rih1Var2;
                } catch (Throwable th2) {
                    th = th2;
                    p811Var = null;
                }
                break;
            case 1:
                if (lnmVar instanceof qjm) {
                    qjmVar = (qjm) lnmVar;
                    int i5 = qjmVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qjmVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        qjmVar = new qjm(this, lnmVar);
                    }
                } else {
                    qjmVar = new qjm(this, lnmVar);
                }
                Object obj12 = qjmVar.a;
                int i6 = qjmVar.b;
                if (i6 == 0) {
                    hm5.M(obj12);
                    vr20 vr20Var = (vr20) obj8;
                    zkm zkmVar = (zkm) vgn0Var2;
                    k9k k9kVar = (k9k) obj7;
                    gfw0 gfw0Var = ((lew0) obj6).b;
                    lew0 lew0Var = (lew0) obj5;
                    lew0 lew0Var2 = (lew0) obj4;
                    bpb1 bpb1Var = (bpb1) k9kVar.f;
                    zkm zkmVar2 = (zkm) bpb1Var.getValue();
                    bpb1Var.l(zkmVar);
                    sbw0 sbw0Var = gfw0Var.v;
                    boolean z2 = zkmVar.d;
                    boolean z3 = zkmVar.d;
                    boolean z4 = zkmVar.c;
                    boolean z5 = z2 && z4 && ((Boolean) lew0Var2.invoke()).booleanValue() && k9k.f(zkmVar, sbw0Var);
                    r091 r091Var2 = (r091) lew0Var.invoke();
                    sbw0 sbw0Var2 = gfw0Var.v;
                    if (r091Var2 == null) {
                        z = false;
                    } else {
                        i091 i091Var = (i091) r091Var2.g.getValue();
                        lsm0 lsm0Var = i091Var.a;
                        o091 o091Var = i091Var.h;
                        boolean z6 = (lsm0Var == null || u890.j(o091Var, l091.a) || (o091Var instanceof k091)) ? false : true;
                        if (!z3 && zkmVar2 != null && zkmVar2.d && ((Boolean) lew0Var2.invoke()).booleanValue() && k9k.f(zkmVar, sbw0Var2) && z6) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    pjm pjmVar = new pjm(z, z5, ((Boolean) lew0Var2.invoke()).booleanValue() && z3 && z4 && !((ugn0) k9kVar.e).a());
                    qjmVar.b = 1;
                    if (vr20Var.emit(pjmVar, qjmVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var2;
            case 2:
                return e((iud) vgn0Var2, lnmVar);
            case 3:
                hlu hluVar = (hlu) obj8;
                hluVar.a((List) ((ven0) obj7).getValue(), (i4d0) ((ven0) obj6).getValue(), ((Number) ((ven0) obj5).getValue()).intValue() == -1 ? ((Boolean) hluVar.e.getValue()).booleanValue() : ((Boolean) ((ven0) obj4).getValue()).booleanValue());
                return rih1Var2;
            case 4:
                if (lnmVar instanceof ok50) {
                    ok50Var = (ok50) lnmVar;
                    int i7 = ok50Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ok50Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        ok50Var = new ok50(this, lnmVar);
                    }
                } else {
                    ok50Var = new ok50(this, lnmVar);
                }
                Object obj13 = ok50Var.a;
                int i8 = ok50Var.b;
                if (i8 == 0) {
                    hm5.M(obj13);
                    vr20 vr20Var2 = (vr20) obj8;
                    l0l l0lVar = (l0l) vgn0Var2;
                    z6x z6xVar = z6x.a;
                    if (l0lVar != null && !l0lVar.l()) {
                        fj50 fj50VarU = l0lVar.u();
                        z6x z6xVar2 = fj50VarU != null ? fj50VarU.a : null;
                        if (z6xVar2 == null) {
                            z6xVar2 = z6xVar;
                        }
                        ArrayList arrayListN0 = o7h.N0((Iterable) (((dpb) obj7).isEnabled() ? ((fj50) ((Function0) obj6).invoke()).a : z6xVar), (Collection) z6xVar2);
                        if (!arrayListN0.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj14 : arrayListN0) {
                                if (((Set) obj5).contains(((lk50) obj14).f)) {
                                    arrayList.add(obj14);
                                }
                            }
                            z6x arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add((zv31) ((vu30) obj4).invoke((lk50) it.next(), l0lVar.j()));
                            }
                            z6xVar = arrayList2;
                        }
                    }
                    ok50Var.b = 1;
                    if (vr20Var2.emit(z6xVar, ok50Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var2;
            case 5:
                lu90 lu90Var = (lu90) vgn0Var2;
                bw91 bw91Var = (bw91) obj5;
                vyz0 vyz0Var = (vyz0) obj8;
                vyz0Var.getClass();
                if (lu90Var instanceof ju90) {
                    j2 = ((ju90) lu90Var).a;
                } else {
                    if (!(lu90Var instanceof ku90)) {
                        eg.o();
                        return null;
                    }
                    j2 = ((ku90) lu90Var).a;
                }
                mhs0 mhs0Var = (mhs0) vyz0Var.a.remove(Long.valueOf(j2));
                if (mhs0Var == null || !(lu90Var instanceof ku90)) {
                    mhs0Var = null;
                }
                if (mhs0Var != null) {
                    ((ss50) obj7).a(16);
                    qmm0 qmm0VarA = ((c9n) obj6).J().A(xj20.P0);
                    Float f = qmm0VarA != null ? new Float(qmm0VarA.i()) : null;
                    if ((f != null ? f.floatValue() : 1.0f) != 0.0f) {
                        eyz0 eyz0Var = new eyz0(mhs0Var.a, mhs0Var.c, mhs0Var.b);
                        if (bw91Var.size() == 64) {
                            bw91Var.remove(0);
                        }
                        bw91Var.add(eyz0Var);
                        ((iu30) obj4).invoke(eyz0Var);
                    }
                }
                return rih1Var2;
            case 6:
                z9l1 z9l1Var = (bal1) vgn0Var2;
                ven0 ven0Var = (ven0) obj6;
                if (!(z9l1Var instanceof z9l1)) {
                    if (!u890.j(z9l1Var, aal1.a)) {
                        eg.o();
                        return null;
                    }
                    r091 r091Var3 = (r091) ven0Var.getValue();
                    if (r091Var3 != null) {
                        r091Var3.e((tv80) ((iu30) ((ven0) obj5).getValue()).invoke(n3p1.q((clj1) obj8)), ((q9l1) obj7).f.b, (String) ((Function0) ((ven0) obj4).getValue()).invoke(), mky0.a);
                    }
                } else if (!z9l1Var.a && (r091Var = (r091) ven0Var.getValue()) != null) {
                    r091Var.d();
                }
                return rih1Var2;
            case 7:
                return c((String) vgn0Var2, lnmVar);
            case 8:
                return b((PlayerState) vgn0Var2, lnmVar);
            case 9:
                ven0 ven0Var2 = (ven0) obj6;
                if (((Number) vgn0Var2).longValue() > ((pu41) ven0Var2.getValue()).c) {
                    ven0Var2.setValue(((ru41) ((ven0) obj5).getValue()).a);
                    if (!((Boolean) ((ven0) obj4).getValue()).booleanValue()) {
                        ((drr0) obj8).t(((pu41) ven0Var2.getValue()).c(((yqg) obj7).b()));
                    }
                }
                return rih1Var2;
            case 10:
                if (lnmVar instanceof xu51) {
                    xu51Var = (xu51) lnmVar;
                    int i9 = xu51Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        xu51Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        xu51Var = new xu51(this, lnmVar);
                    }
                } else {
                    xu51Var = new xu51(this, lnmVar);
                }
                Object obj15 = xu51Var.a;
                int i10 = xu51Var.b;
                if (i10 == 0) {
                    hm5.M(obj15);
                    vr20 vr20Var3 = (vr20) obj8;
                    mmr0 mmr0Var3 = (mmr0) vgn0Var2;
                    ily0 ily0Var = (ily0) mmr0Var3.a;
                    String strD = ((l0l) mmr0Var3.b).d();
                    ((hf31) obj7).invoke(strD);
                    if (((Boolean) ((gpc) obj6).invoke()).booleanValue()) {
                        Iterator it2 = ily0Var.a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (nhc1.R(((pr31) next).a, strD, false)) {
                                    obj3 = next;
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        pr31 pr31Var = (pr31) obj3;
                        if (pr31Var != null) {
                            ((gpc) obj5).invoke();
                            zu51 zu51Var = (zu51) obj4;
                            lwh0 lwh0Var = pr31Var.l;
                            if (!(lwh0Var != null ? lwh0Var.f() : false)) {
                                String str = pr31Var.a;
                                p7s p7sVar = zu51Var.a;
                                p7sVar.c();
                                owh0.b();
                                if (!u890.j(str, e130.v(owh0.c().h(), p7sVar.f).a)) {
                                    xu51Var.b = 1;
                                    if (vr20Var3.emit(pr31Var, xu51Var) == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (i10 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var2;
            case 11:
                mmr0 mmr0Var4 = (mmr0) vgn0Var2;
                e4h1 e4h1Var = (e4h1) obj6;
                err0 err0Var = (hdn0) obj4;
                wxl wxlVar = (wxl) obj8;
                int iIntValue3 = ((Number) mmr0Var4.a).intValue();
                qtb0 qtb0Var = (qtb0) o7h.C0((List) mmr0Var4.b);
                int i11 = qtb0Var != null ? qtb0Var.a : iIntValue3;
                if (wxlVar != null) {
                    iS = wxlVar.c;
                } else {
                    df41 df41Var = x3h1.a;
                    iS = err0Var.s();
                }
                int i12 = iIntValue3 >= iS ? 1 : 2;
                df41 df41Var2 = x3h1.a;
                err0Var.t(iIntValue3);
                if (wxlVar != null) {
                    wxlVar.c = iIntValue3;
                }
                tr80 tr80VarA = e4h1Var.a();
                tr80 tr80Var2 = new tr80(iIntValue3, i11, 1);
                cc91 cc91Var = (cc91) ((dp5) obj7).b;
                boolean zIsEmpty = tr80Var2.isEmpty();
                int i13 = ((rr80) tr80Var2).b;
                int i14 = ((rr80) tr80Var2).a;
                if (zIsEmpty || (!tr80VarA.isEmpty() && i13 >= ((rr80) tr80VarA).a && i14 <= ((rr80) tr80VarA).b)) {
                    wb91 wb91Var = new wb91(tr80VarA, cc91Var);
                    int iC4 = l1d.C(i12);
                    cc91 cc91Var2 = wb91Var.b;
                    tr80 tr80Var3 = wb91Var.a;
                    if (iC4 != 0) {
                        if (iC4 != 1) {
                            eg.o();
                        } else if (i14 - ((rr80) tr80Var3).a <= ((int) Math.floor(cc91Var2.a * cc91Var2.b)) && ((rr80) tr80Var3).a > 0) {
                            rih1Var = rih1Var2;
                            b = cc91Var2.c;
                            iC3 = l1d.C(i12);
                            if (iC3 != 0) {
                                mmr0Var2 = new mmr0(Integer.valueOf(((rr80) tr80Var3).a + b), Integer.valueOf(((rr80) tr80Var3).b + b));
                            } else if (iC3 == 1) {
                                mmr0Var2 = new mmr0(Integer.valueOf(((rr80) tr80Var3).a - b), Integer.valueOf(((rr80) tr80Var3).b - b));
                            } else {
                                eg.o();
                            }
                            wb91VarB = wb91Var.b(((Number) mmr0Var2.a).intValue(), ((Number) mmr0Var2.b).intValue(), tr80Var2, i12);
                            if (wb91VarB != null) {
                                wb91Var = wb91VarB;
                            }
                            iMax = Math.max((int) wb91Var.b.a, (i13 - i14) + 1);
                            iC = l1d.C(i12);
                            if (iC != 0) {
                                if (iC == 1) {
                                    int i15 = (i14 + iMax) - 1;
                                    mmr0Var = new mmr0(Integer.valueOf(Math.max(0, (i15 - iMax) + 1)), Integer.valueOf(i15));
                                } else {
                                    eg.o();
                                }
                                if (wb91VarB2 != null) {
                                    wb91Var = wb91VarB2;
                                }
                                if (tr80Var2.isEmpty()) {
                                    tr80VarK = wb91Var.a();
                                } else {
                                    tr80VarK = y7y0.K(wb91Var.a(), tr80Var2, cc91Var.a(), i12);
                                }
                                if (u890.j(tr80VarK, tr80VarA)) {
                                    tr80VarK2 = null;
                                } else {
                                    tr80VarK2 = tr80VarK;
                                }
                            } else {
                                int iMax2 = Math.max(0, (i13 + 1) - iMax);
                                mmr0Var = new mmr0(Integer.valueOf(iMax2), Integer.valueOf((iMax + iMax2) - 1));
                            }
                            iIntValue = ((Number) mmr0Var.a).intValue();
                            iIntValue2 = ((Number) mmr0Var.b).intValue();
                            tr80Var = wb91Var.a;
                            iC2 = l1d.C(i12);
                            if (iC2 != 0) {
                                if (iC2 == 1) {
                                    wb91VarB2 = iIntValue2 < ((rr80) tr80Var).b ? wb91Var.b(iIntValue, iIntValue2, tr80Var2, i12) : null;
                                } else {
                                    eg.o();
                                }
                            } else if (iIntValue > ((rr80) tr80Var).a) {
                            }
                            if (wb91VarB2 != null) {
                                wb91Var = wb91VarB2;
                            }
                            if (tr80Var2.isEmpty()) {
                                tr80VarK = wb91Var.a();
                            } else {
                                tr80VarK = y7y0.K(wb91Var.a(), tr80Var2, cc91Var.a(), i12);
                            }
                            if (u890.j(tr80VarK, tr80VarA)) {
                                tr80VarK2 = null;
                            } else {
                                tr80VarK2 = tr80VarK;
                            }
                        }
                        rih1Var = rih1Var2;
                    } else {
                        rih1Var = rih1Var2;
                        if (((rr80) tr80Var3).b - i13 <= ((int) Math.floor(cc91Var2.a * cc91Var2.b))) {
                            b = cc91Var2.c;
                            iC3 = l1d.C(i12);
                            if (iC3 != 0) {
                                mmr0Var2 = new mmr0(Integer.valueOf(((rr80) tr80Var3).a + b), Integer.valueOf(((rr80) tr80Var3).b + b));
                            } else if (iC3 == 1) {
                                mmr0Var2 = new mmr0(Integer.valueOf(((rr80) tr80Var3).a - b), Integer.valueOf(((rr80) tr80Var3).b - b));
                            } else {
                                eg.o();
                            }
                            wb91VarB = wb91Var.b(((Number) mmr0Var2.a).intValue(), ((Number) mmr0Var2.b).intValue(), tr80Var2, i12);
                        }
                        if (wb91VarB != null) {
                            wb91Var = wb91VarB;
                        }
                        iMax = Math.max((int) wb91Var.b.a, (i13 - i14) + 1);
                        iC = l1d.C(i12);
                        if (iC != 0) {
                            if (iC == 1) {
                                int i16 = (i14 + iMax) - 1;
                                mmr0Var = new mmr0(Integer.valueOf(Math.max(0, (i16 - iMax) + 1)), Integer.valueOf(i16));
                            } else {
                                eg.o();
                            }
                            if (wb91VarB2 != null) {
                                wb91Var = wb91VarB2;
                            }
                            if (tr80Var2.isEmpty()) {
                                tr80VarK = wb91Var.a();
                            } else {
                                tr80VarK = y7y0.K(wb91Var.a(), tr80Var2, cc91Var.a(), i12);
                            }
                            if (u890.j(tr80VarK, tr80VarA)) {
                                tr80VarK2 = null;
                            } else {
                                tr80VarK2 = tr80VarK;
                            }
                        } else {
                            int iMax3 = Math.max(0, (i13 + 1) - iMax);
                            mmr0Var = new mmr0(Integer.valueOf(iMax3), Integer.valueOf((iMax + iMax3) - 1));
                        }
                        iIntValue = ((Number) mmr0Var.a).intValue();
                        iIntValue2 = ((Number) mmr0Var.b).intValue();
                        tr80Var = wb91Var.a;
                        iC2 = l1d.C(i12);
                        if (iC2 != 0) {
                            if (iC2 == 1) {
                                eg.o();
                            } else if (iIntValue2 < ((rr80) tr80Var).b) {
                            }
                        } else if (iIntValue > ((rr80) tr80Var).a) {
                        }
                        if (wb91VarB2 != null) {
                            wb91Var = wb91VarB2;
                        }
                        if (tr80Var2.isEmpty()) {
                            tr80VarK = wb91Var.a();
                        } else {
                            tr80VarK = y7y0.K(wb91Var.a(), tr80Var2, cc91Var.a(), i12);
                        }
                        if (u890.j(tr80VarK, tr80VarA)) {
                            tr80VarK2 = null;
                        } else {
                            tr80VarK2 = tr80VarK;
                        }
                    }
                    wb91VarB = null;
                    if (wb91VarB != null) {
                        wb91Var = wb91VarB;
                    }
                    iMax = Math.max((int) wb91Var.b.a, (i13 - i14) + 1);
                    iC = l1d.C(i12);
                    if (iC != 0) {
                        if (iC == 1) {
                            int i17 = (i14 + iMax) - 1;
                            mmr0Var = new mmr0(Integer.valueOf(Math.max(0, (i17 - iMax) + 1)), Integer.valueOf(i17));
                        } else {
                            eg.o();
                        }
                        if (wb91VarB2 != null) {
                            wb91Var = wb91VarB2;
                        }
                        if (tr80Var2.isEmpty()) {
                            tr80VarK = wb91Var.a();
                        } else {
                            tr80VarK = y7y0.K(wb91Var.a(), tr80Var2, cc91Var.a(), i12);
                        }
                        if (u890.j(tr80VarK, tr80VarA)) {
                            tr80VarK2 = null;
                        } else {
                            tr80VarK2 = tr80VarK;
                        }
                    } else {
                        int iMax4 = Math.max(0, (i13 + 1) - iMax);
                        mmr0Var = new mmr0(Integer.valueOf(iMax4), Integer.valueOf((iMax + iMax4) - 1));
                    }
                    iIntValue = ((Number) mmr0Var.a).intValue();
                    iIntValue2 = ((Number) mmr0Var.b).intValue();
                    tr80Var = wb91Var.a;
                    iC2 = l1d.C(i12);
                    if (iC2 != 0) {
                        if (iC2 == 1) {
                            eg.o();
                        } else if (iIntValue2 < ((rr80) tr80Var).b) {
                        }
                    } else if (iIntValue > ((rr80) tr80Var).a) {
                    }
                    if (wb91VarB2 != null) {
                        wb91Var = wb91VarB2;
                    }
                    if (tr80Var2.isEmpty()) {
                        tr80VarK = wb91Var.a();
                    } else {
                        tr80VarK = y7y0.K(wb91Var.a(), tr80Var2, cc91Var.a(), i12);
                    }
                    if (u890.j(tr80VarK, tr80VarA)) {
                        tr80VarK2 = null;
                    } else {
                        tr80VarK2 = tr80VarK;
                    }
                } else {
                    int iA = cc91Var.a();
                    int iMax5 = Math.max(0, i14 - (iA / 2));
                    tr80VarK2 = y7y0.K(yoi1.Q(iMax5, iA + iMax5), tr80Var2, cc91Var.a(), i12);
                    rih1Var = rih1Var2;
                }
                if (tr80VarK2 != null) {
                    e4h1Var.a.setValue(tr80VarK2);
                    ((v3h1) obj5).p(tr80VarK2);
                }
                return rih1Var;
            case 12:
                int iIntValue4 = ((Number) vgn0Var2).intValue();
                err0 err0Var2 = (hdn0) obj5;
                Consumer consumer = (Consumer) obj7;
                if (iIntValue4 >= 0) {
                    l0t l0tVar = ((q9l1) obj8).f;
                    l0tVar.b = Long.valueOf(l0tVar.a.b());
                    consumer.accept(new q9u(iIntValue4));
                    if (((jjr0) obj6).e) {
                        err0 err0Var3 = err0Var2;
                        if (iIntValue4 != err0Var3.s()) {
                            ((Function0) ((ven0) obj4).getValue()).invoke();
                            err0Var3.t(iIntValue4);
                        }
                        consumer.accept(new aau(iIntValue4));
                    }
                }
                return rih1Var2;
            default:
                if (lnmVar instanceof som1) {
                    som1Var = (som1) lnmVar;
                    int i18 = som1Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        som1Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        som1Var = new som1(this, lnmVar);
                    }
                } else {
                    som1Var = new som1(this, lnmVar);
                }
                Object obj16 = som1Var.a;
                int i19 = som1Var.b;
                if (i19 == 0) {
                    hm5.M(obj16);
                    mmr0 mmr0Var5 = (mmr0) vgn0Var2;
                    xsf1 xsf1Var = (xsf1) obj7;
                    oom1 oom1Var = new oom1(xsf1Var.a, xsf1Var.b, xsf1Var.d, (String) obj6, (String) obj5, new lom1((String) mmr0Var5.a, (String) mmr0Var5.b), ((fom1) ((kom1) obj4)).d);
                    som1Var.b = 1;
                    if (((vr20) obj8).emit(oom1Var, som1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i19 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var2;
        }
    }

    public /* synthetic */ d9l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
