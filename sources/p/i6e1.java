package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i6e1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i6e1(byte b, Object obj, Object obj2, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        qpk1 qpk1Var;
        if (lnmVar instanceof qpk1) {
            qpk1Var = (qpk1) lnmVar;
            int i = qpk1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qpk1Var.b = i - Integer.MIN_VALUE;
            } else {
                qpk1Var = new qpk1(this, lnmVar);
            }
        } else {
            qpk1Var = new qpk1(this, lnmVar);
        }
        Object obj2 = qpk1Var.a;
        int i2 = qpk1Var.b;
        dqk1 eqk1Var = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            long j = ((gfu0) this.c).c;
            k091 k091Var = ((i091) obj).h;
            if (k091Var instanceof n091) {
                eqk1Var = new dqk1(j);
            } else if (k091Var instanceof k091) {
                h091 h091Var = k091Var.a;
                if (!h091Var.equals(f091.a)) {
                    if (!h091Var.equals(e091.a) && !h091Var.equals(d091.a) && !h091Var.equals(g091.a)) {
                        eg.o();
                        return null;
                    }
                    eqk1Var = new eqk1(j);
                }
            }
            if (eqk1Var != null) {
                qpk1Var.b = 1;
                Object objEmit = vr20Var.emit(eqk1Var, qpk1Var);
                d9n d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
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

    /* JADX WARN: Code duplicated, block: B:130:0x0200  */
    /* JADX WARN: Code duplicated, block: B:146:0x024a  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:191:0x0341  */
    /* JADX WARN: Code duplicated, block: B:214:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:230:0x0420  */
    /* JADX WARN: Code duplicated, block: B:249:0x046c  */
    /* JADX WARN: Code duplicated, block: B:284:0x053a  */
    /* JADX WARN: Code duplicated, block: B:305:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:328:0x0600  */
    /* JADX WARN: Code duplicated, block: B:347:0x0677  */
    /* JADX WARN: Code duplicated, block: B:367:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:385:0x070c  */
    /* JADX WARN: Code duplicated, block: B:410:0x0781  */
    /* JADX WARN: Code duplicated, block: B:432:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:458:0x0833  */
    /* JADX WARN: Code duplicated, block: B:488:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:509:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:535:0x0968  */
    /* JADX WARN: Code duplicated, block: B:551:0x09b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183  */
    public final Object emit(Object obj, lnm lnmVar) {
        rfe1 rfe1Var;
        yke1 yke1Var;
        oue1 oue1Var;
        yah1 yah1VarB;
        mze1 mze1Var;
        vuf1 vuf1Var;
        m4m m4mVar;
        syf1 syf1Var;
        f5g1 f5g1Var;
        sag1 sag1Var;
        btg1 btg1Var;
        qah1 qah1Var;
        omh1 omh1Var;
        nxh1 nxh1Var;
        ryh1 ryh1Var;
        n8i1 n8i1Var;
        ArrayList arrayList;
        mdi1 mdi1Var;
        uvi1 uvi1Var;
        v8j1 v8j1Var;
        aij1 aij1Var;
        wlj1 wlj1Var;
        isj1 isj1Var;
        gak1 gak1Var;
        mak1 mak1Var;
        l2r0 l2r0Var;
        qqk1 qqk1Var;
        mt71 kt71Var;
        boolean z = false;
        yah1 hd80Var = null;
        switch (this.a) {
            case 0:
                Offset offset = (Offset) obj;
                long j = offset.a;
                rih1 rih1Var = rih1.a;
                j6e1 j6e1Var = (j6e1) this.b;
                o95 o95Var = j6e1Var.V0;
                if ((((Offset) o95Var.e()).a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((Offset) o95Var.e()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object objG = o95Var.g(offset, lnmVar);
                    return objG == d9n.a ? objG : rih1Var;
                }
                fn31.T((c9n) this.c, (o8n) null, 0, new kv2(j6e1Var, j, (lnm) null, (byte) 14), 3);
                return rih1Var;
            case 1:
                if (lnmVar instanceof rfe1) {
                    rfe1Var = (rfe1) lnmVar;
                    int i = rfe1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        rfe1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        rfe1Var = new rfe1(this, lnmVar);
                    }
                } else {
                    rfe1Var = new rfe1(this, lnmVar);
                }
                Object obj2 = rfe1Var.a;
                d9n d9nVar = d9n.a;
                int i2 = rfe1Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    vr20 vr20Var = (vr20) this.b;
                    List list = (List) obj;
                    hd80Var = list != null ? new hd80(new ufe1(list), (xpw) ((ynb0) ((y880) this.c).c).get()) : null;
                    rfe1Var.b = 1;
                    if (vr20Var.emit(hd80Var, rfe1Var) == d9nVar) {
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
            case 2:
                if (lnmVar instanceof yke1) {
                    yke1Var = (yke1) lnmVar;
                    int i3 = yke1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yke1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        yke1Var = new yke1(this, lnmVar);
                    }
                } else {
                    yke1Var = new yke1(this, lnmVar);
                }
                Object obj3 = yke1Var.a;
                d9n d9nVar2 = d9n.a;
                int i4 = yke1Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    vr20 vr20Var2 = (vr20) this.b;
                    vke1 vke1Var = new vke1((String) obj, ((zke1) this.c).c.d.j());
                    yke1Var.b = 1;
                    if (vr20Var2.emit(vke1Var, yke1Var) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj3);
                }
                return rih1.a;
            case 3:
                pue1 pue1Var = (pue1) this.c;
                if (lnmVar instanceof oue1) {
                    oue1Var = (oue1) lnmVar;
                    int i5 = oue1Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        oue1Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        oue1Var = new oue1(this, lnmVar);
                    }
                } else {
                    oue1Var = new oue1(this, lnmVar);
                }
                Object obj4 = oue1Var.a;
                d9n d9nVar3 = d9n.a;
                int i6 = oue1Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    vr20 vr20Var3 = (vr20) this.b;
                    Optional optional = (Optional) obj;
                    if (optional.isPresent()) {
                        int iOrdinal = ((gp20) optional.get()).ordinal();
                        if (iOrdinal == 0) {
                            LocalDate localDate = pue1.c;
                            yah1VarB = pue1Var.b(2131964174);
                        } else {
                            if (iOrdinal != 1) {
                                eg.o();
                                return null;
                            }
                            LocalDate localDate2 = pue1.c;
                            yah1VarB = pue1Var.b(2131957504);
                        }
                        hd80Var = yah1VarB;
                    }
                    oue1Var.b = 1;
                    if (vr20Var3.emit(hd80Var, oue1Var) == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return rih1.a;
            case 4:
                if (lnmVar instanceof mze1) {
                    mze1Var = (mze1) lnmVar;
                    int i7 = mze1Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        mze1Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        mze1Var = new mze1(this, lnmVar);
                    }
                } else {
                    mze1Var = new mze1(this, lnmVar);
                }
                Object obj5 = mze1Var.a;
                d9n d9nVar4 = d9n.a;
                int i8 = mze1Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var4 = (vr20) this.b;
                    if (((mdz) obj).r.length() > 0 && ((jqd0) this.c).b) {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    mze1Var.b = 1;
                    if (vr20Var4.emit(boolValueOf, mze1Var) == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1.a;
            case 5:
                ztf1 ztf1Var = (ztf1) this.c;
                if (lnmVar instanceof vuf1) {
                    vuf1Var = (vuf1) lnmVar;
                    int i9 = vuf1Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        vuf1Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        vuf1Var = new vuf1(this, lnmVar);
                    }
                } else {
                    vuf1Var = new vuf1(this, lnmVar);
                }
                Object obj6 = vuf1Var.a;
                d9n d9nVar5 = d9n.a;
                int i10 = vuf1Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var5 = (vr20) this.b;
                    y2u0 y2u0Var = (y2u0) obj;
                    xtf1 xtf1Var = (xtf1) ztf1Var;
                    int iC = l1d.C(xtf1Var.c);
                    if (iC == 0) {
                        m4mVar = m4m.c;
                    } else if (iC == 1) {
                        m4mVar = m4m.b;
                    } else if (iC != 2) {
                        if (iC != 3) {
                            eg.o();
                            return null;
                        }
                        m4mVar = m4m.c;
                    } else {
                        m4mVar = m4m.a;
                    }
                    ouf1 ouf1Var = y2u0Var.a(m4mVar) ? new ouf1(xtf1Var.b) : new nuf1(xtf1Var.a, xtf1Var.b);
                    vuf1Var.b = 1;
                    if (vr20Var5.emit(ouf1Var, vuf1Var) == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (i10 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1.a;
            case 6:
                if (lnmVar instanceof syf1) {
                    syf1Var = (syf1) lnmVar;
                    int i11 = syf1Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        syf1Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        syf1Var = new syf1(this, lnmVar);
                    }
                } else {
                    syf1Var = new syf1(this, lnmVar);
                }
                Object obj7 = syf1Var.a;
                d9n d9nVar6 = d9n.a;
                int i12 = syf1Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var6 = (vr20) this.b;
                    i1r i1rVar = (k1r) obj;
                    oxf1 oxf1Var = (oxf1) (i1rVar instanceof i1r ? i1rVar.a : null);
                    hd80Var = (oxf1Var != null ? oxf1Var.a : null) != null ? ((hyf1) this.c).a : null;
                    syf1Var.b = 1;
                    if (vr20Var6.emit(hd80Var, syf1Var) == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (i12 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1.a;
            case 7:
                if (lnmVar instanceof f5g1) {
                    f5g1Var = (f5g1) lnmVar;
                    int i13 = f5g1Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        f5g1Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        f5g1Var = new f5g1(this, lnmVar);
                    }
                } else {
                    f5g1Var = new f5g1(this, lnmVar);
                }
                Object obj8 = f5g1Var.a;
                d9n d9nVar7 = d9n.a;
                int i14 = f5g1Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var7 = (vr20) this.b;
                    i1r i1rVar2 = (k1r) obj;
                    x5g1 x5g1Var = (x5g1) this.c;
                    i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                    c5g1 c5g1Var = new c5g1(x5g1Var, i1rVar3 != null ? (e5g1) i1rVar3.a : null);
                    f5g1Var.b = 1;
                    if (vr20Var7.emit(c5g1Var, f5g1Var) == d9nVar7) {
                        return d9nVar7;
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1.a;
            case 8:
                rih1 rih1Var2 = rih1.a;
                o8n o8nVar = (o8n) this.b;
                j7g1 j7g1Var = (j7g1) this.c;
                if (o8nVar != null) {
                    Object objY = fn31.Y(o8nVar, new kwb1(j7g1Var, obj, (lnm) null, (byte) 16), lnmVar);
                    return objY == d9n.a ? objY : rih1Var2;
                }
                if (((m7g1) j7g1Var).c) {
                    return rih1Var2;
                }
                ((j7g1) this.c).e.invoke(obj);
                return rih1Var2;
            case 9:
                if (lnmVar instanceof sag1) {
                    sag1Var = (sag1) lnmVar;
                    int i15 = sag1Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        sag1Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        sag1Var = new sag1(this, lnmVar);
                    }
                } else {
                    sag1Var = new sag1(this, lnmVar);
                }
                Object obj9 = sag1Var.a;
                d9n d9nVar8 = d9n.a;
                int i16 = sag1Var.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    vr20 vr20Var8 = (vr20) this.b;
                    String strD = mqn1.D(((kng1) this.c).a, (List) obj);
                    sag1Var.b = 1;
                    if (vr20Var8.emit(strD, sag1Var) == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return rih1.a;
            case 10:
                if (lnmVar instanceof btg1) {
                    btg1Var = (btg1) lnmVar;
                    int i17 = btg1Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        btg1Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        btg1Var = new btg1(this, lnmVar);
                    }
                } else {
                    btg1Var = new btg1(this, lnmVar);
                }
                Object obj10 = btg1Var.a;
                d9n d9nVar9 = d9n.a;
                int i18 = btg1Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    vr20 vr20Var9 = (vr20) this.b;
                    if (((htg1) obj) == ((htg1) this.c)) {
                        btg1Var.b = 1;
                        if (vr20Var9.emit(obj, btg1Var) == d9nVar9) {
                            return d9nVar9;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1.a;
            case 11:
                if (lnmVar instanceof qah1) {
                    qah1Var = (qah1) lnmVar;
                    int i19 = qah1Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        qah1Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        qah1Var = new qah1(this, lnmVar);
                    }
                } else {
                    qah1Var = new qah1(this, lnmVar);
                }
                Object obj11 = qah1Var.a;
                d9n d9nVar10 = d9n.a;
                int i20 = qah1Var.b;
                if (i20 == 0) {
                    hm5.M(obj11);
                    vr20 vr20Var10 = (vr20) this.b;
                    qxc0 qxc0Var = (qxc0) ((py21) obj).c();
                    hd80Var = qxc0Var != null ? ((rah1) this.c).c(qxc0Var) : null;
                    if (hd80Var != null) {
                        qah1Var.b = 1;
                        if (vr20Var10.emit(hd80Var, qah1Var) == d9nVar10) {
                            return d9nVar10;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1.a;
            case 12:
                if (lnmVar instanceof omh1) {
                    omh1Var = (omh1) lnmVar;
                    int i21 = omh1Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        omh1Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        omh1Var = new omh1(this, lnmVar);
                    }
                } else {
                    omh1Var = new omh1(this, lnmVar);
                }
                Object obj12 = omh1Var.a;
                d9n d9nVar11 = d9n.a;
                int i22 = omh1Var.b;
                if (i22 == 0) {
                    hm5.M(obj12);
                    vr20 vr20Var11 = (vr20) this.b;
                    String str = (String) obj;
                    rmh1 rmh1Var = (rmh1) this.c;
                    smc0 smc0VarN = k4p1.n();
                    if (str != null) {
                        smc0VarN.add(new h8k1(new smh1(rmh1Var.c.getString(2131963496)), "upcoming-heading"));
                        smc0VarN.add(new h8k1(new tmh1(str), "upcoming-".concat(str)));
                    }
                    smc0 smc0VarK = k4p1.k(smc0VarN);
                    omh1Var.b = 1;
                    if (vr20Var11.emit(smc0VarK, omh1Var) == d9nVar11) {
                        return d9nVar11;
                    }
                } else {
                    if (i22 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1.a;
            case 13:
                oxh1 oxh1Var = (oxh1) this.c;
                if (lnmVar instanceof nxh1) {
                    nxh1Var = (nxh1) lnmVar;
                    int i23 = nxh1Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        nxh1Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        nxh1Var = new nxh1(this, lnmVar);
                    }
                } else {
                    nxh1Var = new nxh1(this, lnmVar);
                }
                Object obj13 = nxh1Var.a;
                d9n d9nVar12 = d9n.a;
                int i24 = nxh1Var.b;
                if (i24 == 0) {
                    hm5.M(obj13);
                    vr20 vr20Var12 = (vr20) this.b;
                    ea6 ea6Var = (ea6) obj;
                    if (oxh1Var.b.a.z() && oxh1Var.d.contains(ea6Var.a) && ea6Var.b == l2r0.a) {
                        z = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    nxh1Var.b = 1;
                    if (vr20Var12.emit(boolValueOf2, nxh1Var) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (i24 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1.a;
            case 14:
                if (lnmVar instanceof ryh1) {
                    ryh1Var = (ryh1) lnmVar;
                    int i25 = ryh1Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ryh1Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        ryh1Var = new ryh1(this, lnmVar);
                    }
                } else {
                    ryh1Var = new ryh1(this, lnmVar);
                }
                Object obj14 = ryh1Var.a;
                d9n d9nVar13 = d9n.a;
                int i26 = ryh1Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    vr20 vr20Var13 = (vr20) this.b;
                    cxc0 cxc0Var = (cxc0) obj;
                    bn1 bn1Var = (bn1) this.c;
                    Map map = cxc0Var.j;
                    Map map2 = cxc0Var.f.q;
                    if (gyo1.G(map, new dlc0[]{dlc0.d, dlc0.h}) && !((hod0) bn1Var.g).c(map2)) {
                        z = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    ryh1Var.b = 1;
                    if (vr20Var13.emit(boolValueOf3, ryh1Var) == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (i26 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1.a;
            case 15:
                if (lnmVar instanceof n8i1) {
                    n8i1Var = (n8i1) lnmVar;
                    int i27 = n8i1Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        n8i1Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        n8i1Var = new n8i1(this, lnmVar);
                    }
                } else {
                    n8i1Var = new n8i1(this, lnmVar);
                }
                Object obj15 = n8i1Var.a;
                d9n d9nVar14 = d9n.a;
                int i28 = n8i1Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    vr20 vr20Var14 = (vr20) this.b;
                    try {
                        Iterable iterable = (Iterable) ((nfa0) ((ltf1) this.c).b).a((String) obj, new r36(m8i1.Companion.serializer(), (byte) 0));
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj16 : iterable) {
                            if (!ihc1.y0(((m8i1) obj16).a)) {
                                arrayList2.add(obj16);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList<m8i1> arrayList3 = new ArrayList();
                        for (Object obj17 : arrayList2) {
                            if (hashSet.add(((m8i1) obj17).a)) {
                                arrayList3.add(obj17);
                            }
                        }
                        arrayList = new ArrayList(q7h.U(arrayList3, 10));
                        for (m8i1 m8i1Var : arrayList3) {
                            String str2 = m8i1Var.a;
                            arrayList.add(new bq10(str2, m8i1Var.b, 120, str2));
                        }
                    } catch (SerializationException unused) {
                        arrayList = z6x.a;
                    }
                    n8i1Var.b = 1;
                    if (vr20Var14.emit(arrayList, n8i1Var) == d9nVar14) {
                        return d9nVar14;
                    }
                    break;
                } else {
                    if (i28 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1.a;
            case 16:
                hii1 hii1Var = (hii1) this.c;
                if (lnmVar instanceof mdi1) {
                    mdi1Var = (mdi1) lnmVar;
                    int i29 = mdi1Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        mdi1Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        mdi1Var = new mdi1(this, lnmVar);
                    }
                } else {
                    mdi1Var = new mdi1(this, lnmVar);
                }
                Object obj18 = mdi1Var.a;
                d9n d9nVar15 = d9n.a;
                int i30 = mdi1Var.b;
                if (i30 == 0) {
                    hm5.M(obj18);
                    vr20 vr20Var15 = (vr20) this.b;
                    Object obj19 = ((cen0) obj).a.get(oqo1.o(hii1Var));
                    if (obj19 == null) {
                        obj19 = hii1Var.b;
                    }
                    mdi1Var.b = 1;
                    if (vr20Var15.emit(obj19, mdi1Var) == d9nVar15) {
                        return d9nVar15;
                    }
                } else {
                    if (i30 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj18);
                }
                return rih1.a;
            case 17:
                if (lnmVar instanceof uvi1) {
                    uvi1Var = (uvi1) lnmVar;
                    int i31 = uvi1Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        uvi1Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        uvi1Var = new uvi1(this, lnmVar);
                    }
                } else {
                    uvi1Var = new uvi1(this, lnmVar);
                }
                Object obj20 = uvi1Var.a;
                d9n d9nVar16 = d9n.a;
                int i32 = uvi1Var.b;
                if (i32 == 0) {
                    hm5.M(obj20);
                    vr20 vr20Var16 = (vr20) this.b;
                    s910 s910Var = new s910(((ijo) obj).a.contains(((svi1) this.c).a));
                    uvi1Var.b = 1;
                    if (vr20Var16.emit(s910Var, uvi1Var) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (i32 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1.a;
            case 18:
                int iIntValue = ((Number) obj).intValue();
                if (((Boolean) ((ven0) this.b).getValue()).booleanValue()) {
                    ((hdn0) this.c).t(iIntValue);
                }
                return rih1.a;
            case 19:
                ((iu30) this.b).invoke(d6j1.a((n6j1) this.c, (u810) obj));
                return rih1.a;
            case 20:
                if (lnmVar instanceof v8j1) {
                    v8j1Var = (v8j1) lnmVar;
                    int i33 = v8j1Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        v8j1Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        v8j1Var = new v8j1(this, lnmVar);
                    }
                } else {
                    v8j1Var = new v8j1(this, lnmVar);
                }
                Object obj21 = v8j1Var.a;
                d9n d9nVar17 = d9n.a;
                int i34 = v8j1Var.b;
                if (i34 == 0) {
                    hm5.M(obj21);
                    vr20 vr20Var17 = (vr20) this.b;
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    s7j1 s7j1Var = new s7j1((VideoSurfaceView) ((h72) ((yir) this.c).c).Y, bool.booleanValue());
                    v8j1Var.b = 1;
                    if (vr20Var17.emit(s7j1Var, v8j1Var) == d9nVar17) {
                        return d9nVar17;
                    }
                } else {
                    if (i34 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return rih1.a;
            case 21:
                en60 en60Var = (en60) obj;
                ji0 ji0Var = (ji0) ((n2o) this.b).c;
                if (ji0Var != null) {
                    ((x8j1) this.c).f.v(en60Var, ji0Var);
                }
                return rih1.a;
            case 22:
                r4h1 r4h1Var = (r4h1) this.c;
                if (lnmVar instanceof aij1) {
                    aij1Var = (aij1) lnmVar;
                    int i35 = aij1Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        aij1Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        aij1Var = new aij1(this, lnmVar);
                    }
                } else {
                    aij1Var = new aij1(this, lnmVar);
                }
                Object obj22 = aij1Var.a;
                d9n d9nVar18 = d9n.a;
                int i36 = aij1Var.b;
                if (i36 == 0) {
                    hm5.M(obj22);
                    vr20 vr20Var18 = (vr20) this.b;
                    cxc0 cxc0Var2 = (cxc0) obj;
                    le30 le30VarA = ((me30) r4h1Var.f).a(cxc0Var2.f.p);
                    d2f1 d2f1Var = (d2f1) r4h1Var.d;
                    String str3 = (String) r4h1Var.a;
                    kby kbyVar = cxc0Var2.f;
                    Boolean boolValueOf4 = Boolean.valueOf(d2f1Var.b(new cij1(str3, kbyVar.D, le30VarA, kbyVar.z, kbyVar.w, kbyVar.q)) == 2);
                    aij1Var.b = 1;
                    if (vr20Var18.emit(boolValueOf4, aij1Var) == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (i36 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj22);
                }
                return rih1.a;
            case 23:
                amj1 amj1Var = (amj1) this.c;
                if (lnmVar instanceof wlj1) {
                    wlj1Var = (wlj1) lnmVar;
                    int i37 = wlj1Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        wlj1Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        wlj1Var = new wlj1(this, lnmVar);
                    }
                } else {
                    wlj1Var = new wlj1(this, lnmVar);
                }
                Object obj23 = wlj1Var.a;
                d9n d9nVar19 = d9n.a;
                int i38 = wlj1Var.b;
                if (i38 == 0) {
                    hm5.M(obj23);
                    vr20 vr20Var19 = (vr20) this.b;
                    cxc0 cxc0Var3 = (cxc0) obj;
                    me30 me30Var = amj1Var.f;
                    kby kbyVar2 = cxc0Var3.f;
                    kby kbyVar3 = cxc0Var3.f;
                    Boolean boolValueOf5 = Boolean.valueOf(amj1Var.e.b(new cij1(amj1Var.b, kbyVar3.D, me30Var.a(kbyVar2.p), kbyVar3.z, kbyVar3.w, kbyVar3.q)) == 2 || kbyVar3.D);
                    wlj1Var.b = 1;
                    if (vr20Var19.emit(boolValueOf5, wlj1Var) == d9nVar19) {
                        return d9nVar19;
                    }
                } else {
                    if (i38 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj23);
                }
                return rih1.a;
            case 24:
                if (lnmVar instanceof isj1) {
                    isj1Var = (isj1) lnmVar;
                    int i39 = isj1Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        isj1Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        isj1Var = new isj1(this, lnmVar);
                    }
                } else {
                    isj1Var = new isj1(this, lnmVar);
                }
                Object obj24 = isj1Var.a;
                d9n d9nVar20 = d9n.a;
                int i40 = isj1Var.b;
                if (i40 == 0) {
                    hm5.M(obj24);
                    vr20 vr20Var20 = (vr20) this.b;
                    Object objInvoke = ((hij1) this.c).invoke((PlayerState) obj);
                    isj1Var.b = 1;
                    if (vr20Var20.emit(objInvoke, isj1Var) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (i40 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj24);
                }
                return rih1.a;
            case 25:
                if (lnmVar instanceof gak1) {
                    gak1Var = (gak1) lnmVar;
                    int i41 = gak1Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        gak1Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        gak1Var = new gak1(this, lnmVar);
                    }
                } else {
                    gak1Var = new gak1(this, lnmVar);
                }
                Object obj25 = gak1Var.a;
                d9n d9nVar21 = d9n.a;
                int i42 = gak1Var.b;
                if (i42 == 0) {
                    hm5.M(obj25);
                    vr20 vr20Var21 = (vr20) this.b;
                    ea6 ea6Var2 = (ea6) obj;
                    if (((hak1) this.c).b.contains(ea6Var2.a) && ea6Var2.b == l2r0.a) {
                        List list2 = ea6Var2.k;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (((kwx0) it.next()) instanceof iab) {
                                    z = true;
                                }
                            }
                        }
                    }
                    Boolean boolValueOf6 = Boolean.valueOf(z);
                    gak1Var.b = 1;
                    if (vr20Var21.emit(boolValueOf6, gak1Var) == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (i42 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj25);
                }
                return rih1.a;
            case 26:
                if (lnmVar instanceof mak1) {
                    mak1Var = (mak1) lnmVar;
                    int i43 = mak1Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        mak1Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        mak1Var = new mak1(this, lnmVar);
                    }
                } else {
                    mak1Var = new mak1(this, lnmVar);
                }
                Object obj26 = mak1Var.a;
                d9n d9nVar22 = d9n.a;
                int i44 = mak1Var.b;
                if (i44 == 0) {
                    hm5.M(obj26);
                    vr20 vr20Var22 = (vr20) this.b;
                    ea6 ea6Var3 = (ea6) obj;
                    if (((pm70) this.c).b.contains(ea6Var3.a) && (((l2r0Var = ea6Var3.b) == l2r0.a || l2r0Var == l2r0.b) && !ea6Var3.k.isEmpty())) {
                        z = true;
                    }
                    Boolean boolValueOf7 = Boolean.valueOf(z);
                    mak1Var.b = 1;
                    if (vr20Var22.emit(boolValueOf7, mak1Var) == d9nVar22) {
                        return d9nVar22;
                    }
                } else {
                    if (i44 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj26);
                }
                return rih1.a;
            case 27:
                return b(obj, lnmVar);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                if (lnmVar instanceof qqk1) {
                    qqk1Var = (qqk1) lnmVar;
                    int i45 = qqk1Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        qqk1Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        qqk1Var = new qqk1(this, lnmVar);
                    }
                } else {
                    qqk1Var = new qqk1(this, lnmVar);
                }
                Object obj27 = qqk1Var.a;
                d9n d9nVar23 = d9n.a;
                int i46 = qqk1Var.b;
                if (i46 == 0) {
                    hm5.M(obj27);
                    vr20 vr20Var23 = (vr20) this.b;
                    ea6 ea6Var4 = (ea6) obj;
                    if (((pm70) this.c).b.contains(ea6Var4.a) && ea6Var4.b == l2r0.b) {
                        z = true;
                    }
                    Boolean boolValueOf8 = Boolean.valueOf(z);
                    qqk1Var.b = 1;
                    if (vr20Var23.emit(boolValueOf8, qqk1Var) == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (i46 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj27);
                }
                return rih1.a;
            default:
                i091 i091Var = (i091) obj;
                rih1 rih1Var3 = rih1.a;
                vq71 vq71Var = ((g9l1) this.b).j;
                if (vq71Var != null && ((g9l1) this.b).h == ((r091) this.c)) {
                    lsm0 lsm0Var = i091Var.a;
                    if (u890.j(lsm0Var != null ? lsm0Var.a : null, vq71Var.b)) {
                        g9l1 g9l1Var = (g9l1) this.b;
                        k091 k091Var = i091Var.h;
                        if (u890.j(k091Var, j091.a) || u890.j(k091Var, n091.a)) {
                            kt71Var = new kt71(vq71Var.g);
                        } else if (u890.j(k091Var, m091.a)) {
                            kt71Var = new jt71(vq71Var.g);
                        } else if (k091Var instanceof k091) {
                            h091 h091Var = k091Var.a;
                            if (!h091Var.equals(f091.a)) {
                                if (!h091Var.equals(e091.a) && !h091Var.equals(d091.a) && !h091Var.equals(g091.a)) {
                                    eg.o();
                                    return null;
                                }
                                kt71Var = lt71.a;
                            }
                        } else if (!u890.j(k091Var, l091.a)) {
                            eg.o();
                            return null;
                        }
                        g9l1Var.e(kt71Var);
                    }
                }
                return rih1Var3;
        }
    }

    public /* synthetic */ i6e1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
