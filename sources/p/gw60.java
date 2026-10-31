package p;

import com.spotify.ads.esperanto.proto.SubBreakChangedResponse;
import com.spotify.ads.esperanto.proto.SubInStreamResponse;
import com.spotify.connectivity.hosts.esperanto.proto.EsHosts;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.util.Base64;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gw60 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public gw60(vr20 vr20Var, bz80 bz80Var) {
        this.a = (byte) 23;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x0227  */
    /* JADX WARN: Code duplicated, block: B:161:0x027c  */
    /* JADX WARN: Code duplicated, block: B:176:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:211:0x034d  */
    /* JADX WARN: Code duplicated, block: B:231:0x039b  */
    /* JADX WARN: Code duplicated, block: B:246:0x03db  */
    /* JADX WARN: Code duplicated, block: B:265:0x0422  */
    /* JADX WARN: Code duplicated, block: B:293:0x0492  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:311:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:326:0x0511  */
    /* JADX WARN: Code duplicated, block: B:344:0x0552  */
    /* JADX WARN: Code duplicated, block: B:359:0x058e  */
    /* JADX WARN: Code duplicated, block: B:376:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:391:0x0609  */
    /* JADX WARN: Code duplicated, block: B:424:0x0675  */
    /* JADX WARN: Code duplicated, block: B:439:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:454:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:480:0x075b  */
    /* JADX WARN: Code duplicated, block: B:504:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        fw60 fw60Var;
        jw60 jw60Var;
        gx60 gx60Var;
        yx60 yx60Var;
        ay60 ay60Var;
        ny60 ny60Var;
        oy60 oy60Var;
        qy60 qy60Var;
        sy60 sy60Var;
        z270 z270Var;
        tu70 tu70Var;
        x080 x080Var;
        c480 c480Var;
        f480 h480Var;
        int i;
        d680 d680Var;
        o680 o680Var;
        b780 b780Var;
        c780 c780Var;
        e780 e780Var;
        f780 f780Var;
        bg80 bg80Var;
        tw80 tw80Var;
        xy80 xy80Var;
        uz80 uz80Var;
        f090 f090Var;
        t690 t690Var;
        z790 z790Var;
        a890 a890Var;
        p990 p990Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        String e331Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof fw60) {
                    fw60Var = (fw60) lnmVar;
                    int i2 = fw60Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        fw60Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        fw60Var = new fw60(this, lnmVar);
                    }
                } else {
                    fw60Var = new fw60(this, lnmVar);
                }
                Object obj2 = fw60Var.a;
                int i3 = fw60Var.b;
                if (i3 == 0) {
                    hm5.M(obj2);
                    os60 os60Var = (os60) obj;
                    Object cw60Var = bw60.a;
                    if (os60Var != null) {
                        ls60 ls60Var = os60Var.b;
                        if (!u890.j(ls60Var, is60.a)) {
                            if (ls60Var instanceof ls60) {
                                ls60 ls60Var2 = ls60Var;
                                if (!ls60Var2.b.a.isEmpty()) {
                                    aw60 aw60VarT = tto1.t(ls60Var2);
                                    cw60Var = new cw60(aw60VarT.a, aw60VarT.b, aw60VarT.c, aw60VarT.d, aw60VarT.e);
                                }
                            } else {
                                eg.o();
                            }
                        }
                    }
                    fw60Var.b = 1;
                    return vr20Var.emit(cw60Var, fw60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i3 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof jw60) {
                    jw60Var = (jw60) lnmVar;
                    int i4 = jw60Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        jw60Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        jw60Var = new jw60(this, lnmVar);
                    }
                } else {
                    jw60Var = new jw60(this, lnmVar);
                }
                Object obj3 = jw60Var.a;
                int i5 = jw60Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                os60 os60Var2 = (os60) obj;
                String str = os60Var2 != null ? os60Var2.b : null;
                e331Var = str instanceof ls60 ? (ls60) str : null;
                Integer num = new Integer(e331Var != null ? ((ls60) e331Var).b.a.size() : 0);
                jw60Var.b = 1;
                return vr20Var.emit(num, jw60Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof gx60) {
                    gx60Var = (gx60) lnmVar;
                    int i6 = gx60Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        gx60Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        gx60Var = new gx60(this, lnmVar);
                    }
                } else {
                    gx60Var = new gx60(this, lnmVar);
                }
                Object obj4 = gx60Var.a;
                int i7 = gx60Var.b;
                if (i7 == 0) {
                    hm5.M(obj4);
                    h1r h1rVar = (k1r) obj;
                    if (h1rVar instanceof h1r) {
                        e331Var = new e331(new m231(new Exception(h1rVar.a.getMessage())));
                    } else if (h1rVar instanceof i1r) {
                        e331Var = new e331(((i1r) h1rVar).a);
                    } else if (!u890.j(h1rVar, j1r.a)) {
                        eg.o();
                    }
                    if (e331Var == null) {
                        return rih1Var;
                    }
                    gx60Var.b = 1;
                    return vr20Var.emit(e331Var, gx60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i7 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof yx60) {
                    yx60Var = (yx60) lnmVar;
                    int i8 = yx60Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        yx60Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        yx60Var = new yx60(this, lnmVar);
                    }
                } else {
                    yx60Var = new yx60(this, lnmVar);
                }
                Object obj5 = yx60Var.a;
                int i9 = yx60Var.b;
                if (i9 == 0) {
                    hm5.M(obj5);
                    String strO = ((EsHosts.Hosts) obj).o();
                    yx60Var.b = 1;
                    return vr20Var.emit(strO, yx60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i9 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof ay60) {
                    ay60Var = (ay60) lnmVar;
                    int i10 = ay60Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        ay60Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        ay60Var = new ay60(this, lnmVar);
                    }
                } else {
                    ay60Var = new ay60(this, lnmVar);
                }
                Object obj6 = ay60Var.a;
                int i11 = ay60Var.b;
                if (i11 == 0) {
                    hm5.M(obj6);
                    String strP = ((EsHosts.Hosts) obj).p();
                    ay60Var.b = 1;
                    return vr20Var.emit(strP, ay60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i11 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof ny60) {
                    ny60Var = (ny60) lnmVar;
                    int i12 = ny60Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        ny60Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        ny60Var = new ny60(this, lnmVar);
                    }
                } else {
                    ny60Var = new ny60(this, lnmVar);
                }
                Object obj7 = ny60Var.a;
                int i13 = ny60Var.b;
                if (i13 == 0) {
                    hm5.M(obj7);
                    xu81 xu81Var = (zu81) obj;
                    if (!(xu81Var instanceof wu81)) {
                        if (xu81Var instanceof vu81) {
                            e331Var = gpa1.a;
                        } else if (xu81Var instanceof su81) {
                            e331Var = fpa1.a;
                        } else if (xu81Var instanceof xu81) {
                            e331Var = new hpa1(xu81Var.a);
                        } else if (xu81Var instanceof yu81) {
                            e331Var = new ipa1(((yu81) xu81Var).a);
                        } else {
                            eg.o();
                        }
                    }
                    if (e331Var == null) {
                        return rih1Var;
                    }
                    ny60Var.b = 1;
                    return vr20Var.emit(e331Var, ny60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i13 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof oy60) {
                    oy60Var = (oy60) lnmVar;
                    int i14 = oy60Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        oy60Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        oy60Var = new oy60(this, lnmVar);
                    }
                } else {
                    oy60Var = new oy60(this, lnmVar);
                }
                Object obj8 = oy60Var.a;
                int i15 = oy60Var.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                tu81 tu81Var = new tu81(new IllegalStateException("Bluetooth input route was lost"));
                oy60Var.b = 1;
                return vr20Var.emit(tu81Var, oy60Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof qy60) {
                    qy60Var = (qy60) lnmVar;
                    int i16 = qy60Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        qy60Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        qy60Var = new qy60(this, lnmVar);
                    }
                } else {
                    qy60Var = new qy60(this, lnmVar);
                }
                Object obj9 = qy60Var.a;
                int i17 = qy60Var.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                if (!(obj instanceof wu81)) {
                    return rih1Var;
                }
                qy60Var.b = 1;
                return vr20Var.emit(obj, qy60Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof sy60) {
                    sy60Var = (sy60) lnmVar;
                    int i18 = sy60Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        sy60Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        sy60Var = new sy60(this, lnmVar);
                    }
                } else {
                    sy60Var = new sy60(this, lnmVar);
                }
                Object obj10 = sy60Var.a;
                int i19 = sy60Var.b;
                if (i19 == 0) {
                    hm5.M(obj10);
                    ky60 ky60Var = new ky60((ByteBuffer) obj);
                    sy60Var.b = 1;
                    return vr20Var.emit(ky60Var, sy60Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i19 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof z270) {
                    z270Var = (z270) lnmVar;
                    int i20 = z270Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        z270Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        z270Var = new z270(this, lnmVar);
                    }
                } else {
                    z270Var = new z270(this, lnmVar);
                }
                Object obj11 = z270Var.a;
                int i21 = z270Var.b;
                if (i21 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf = Boolean.valueOf(((ywp0) obj).a == 3);
                    z270Var.b = 1;
                    return vr20Var.emit(boolValueOf, z270Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof tu70) {
                    tu70Var = (tu70) lnmVar;
                    int i22 = tu70Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        tu70Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        tu70Var = new tu70(this, lnmVar);
                    }
                } else {
                    tu70Var = new tu70(this, lnmVar);
                }
                Object obj12 = tu70Var.a;
                int i23 = tu70Var.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                Set set = (Set) obj;
                set.getClass();
                ru70 ru70Var = new ru70(z6x.a, set);
                tu70Var.b = 1;
                return vr20Var.emit(ru70Var, tu70Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof x080) {
                    x080Var = (x080) lnmVar;
                    int i24 = x080Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        x080Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        x080Var = new x080(this, lnmVar);
                    }
                } else {
                    x080Var = new x080(this, lnmVar);
                }
                Object obj13 = x080Var.a;
                int i25 = x080Var.b;
                if (i25 != 0) {
                    if (i25 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                String str2 = (String) obj;
                e331Var = str2.length() > 0 ? str2 : null;
                x080Var.b = 1;
                return vr20Var.emit(e331Var, x080Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof c480) {
                    c480Var = (c480) lnmVar;
                    int i26 = c480Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        c480Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        c480Var = new c480(this, lnmVar);
                    }
                } else {
                    c480Var = new c480(this, lnmVar);
                }
                Object obj14 = c480Var.a;
                int i27 = c480Var.b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                a480 a480Var = (a480) obj;
                boolean z = a480Var.b;
                float f = a480Var.c;
                if (z) {
                    h480Var = new f480(a480Var.f);
                } else {
                    boolean z2 = a480Var.a;
                    if (z2 || f < 1.0f) {
                        h480Var = (!z2 || (i = a480Var.e) <= 0) ? g480.a : new h480(a480Var.d, i, yoi1.p(jch0.U(f * 100.0f), 0, 100));
                    } else {
                        h480Var = e480.a;
                    }
                }
                c480Var.b = 1;
                return vr20Var.emit(h480Var, c480Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof d680) {
                    d680Var = (d680) lnmVar;
                    int i28 = d680Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        d680Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        d680Var = new d680(this, lnmVar);
                    }
                } else {
                    d680Var = new d680(this, lnmVar);
                }
                Object obj15 = d680Var.a;
                int i29 = d680Var.b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                Boolean bool = (Boolean) ((cma1) obj).a;
                Boolean boolValueOf2 = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                d680Var.b = 1;
                return vr20Var.emit(boolValueOf2, d680Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof o680) {
                    o680Var = (o680) lnmVar;
                    int i30 = o680Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        o680Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        o680Var = new o680(this, lnmVar);
                    }
                } else {
                    o680Var = new o680(this, lnmVar);
                }
                Object obj16 = o680Var.a;
                int i31 = o680Var.b;
                if (i31 == 0) {
                    hm5.M(obj16);
                    bcu bcuVar = new bcu(((Boolean) obj).booleanValue());
                    o680Var.b = 1;
                    return vr20Var.emit(bcuVar, o680Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof b780) {
                    b780Var = (b780) lnmVar;
                    int i32 = b780Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        b780Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        b780Var = new b780(this, lnmVar);
                    }
                } else {
                    b780Var = new b780(this, lnmVar);
                }
                Object obj17 = b780Var.a;
                int i33 = b780Var.b;
                if (i33 == 0) {
                    hm5.M(obj17);
                    byte[] bArr = (byte[]) obj;
                    try {
                        SubBreakChangedResponse subBreakChangedResponseO = SubBreakChangedResponse.o(bArr);
                        b780Var.b = 1;
                        return vr20Var.emit(subBreakChangedResponseO, b780Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.SubBreakChangedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i33 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 16:
                if (lnmVar instanceof c780) {
                    c780Var = (c780) lnmVar;
                    int i34 = c780Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        c780Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        c780Var = new c780(this, lnmVar);
                    }
                } else {
                    c780Var = new c780(this, lnmVar);
                }
                Object obj18 = c780Var.a;
                int i35 = c780Var.b;
                if (i35 == 0) {
                    hm5.M(obj18);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        SubInStreamResponse subInStreamResponseO = SubInStreamResponse.o(bArr2);
                        c780Var.b = 1;
                        return vr20Var.emit(subInStreamResponseO, c780Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.SubInStreamResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i35 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof e780) {
                    e780Var = (e780) lnmVar;
                    int i36 = e780Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        e780Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        e780Var = new e780(this, lnmVar);
                    }
                } else {
                    e780Var = new e780(this, lnmVar);
                }
                Object obj19 = e780Var.a;
                int i37 = e780Var.b;
                if (i37 == 0) {
                    hm5.M(obj19);
                    g780 g780Var = new g780(t2p1.y(((SubInStreamResponse) obj).n()));
                    e780Var.b = 1;
                    return vr20Var.emit(g780Var, e780Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i37 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof f780) {
                    f780Var = (f780) lnmVar;
                    int i38 = f780Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        f780Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        f780Var = new f780(this, lnmVar);
                    }
                } else {
                    f780Var = new f780(this, lnmVar);
                }
                Object obj20 = f780Var.a;
                int i39 = f780Var.b;
                if (i39 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf3 = Boolean.valueOf(((SubBreakChangedResponse) obj).n());
                    f780Var.b = 1;
                    return vr20Var.emit(boolValueOf3, f780Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i39 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Object objEmit = vr20Var.emit(obj, lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof bg80) {
                    bg80Var = (bg80) lnmVar;
                    int i40 = bg80Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        bg80Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        bg80Var = new bg80(this, lnmVar);
                    }
                } else {
                    bg80Var = new bg80(this, lnmVar);
                }
                Object obj21 = bg80Var.a;
                int i41 = bg80Var.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                f7l1 f7l1VarA = ((cxc0) obj).f.x.a(f7l1.class);
                Boolean boolValueOf4 = Boolean.valueOf((f7l1VarA != null ? f7l1VarA.a : null) instanceof a7l1);
                bg80Var.b = 1;
                return vr20Var.emit(boolValueOf4, bg80Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Object objEmit2 = vr20Var.emit((op80) obj, lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
            case 22:
                if (lnmVar instanceof tw80) {
                    tw80Var = (tw80) lnmVar;
                    int i42 = tw80Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        tw80Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        tw80Var = new tw80(this, lnmVar);
                    }
                } else {
                    tw80Var = new tw80(this, lnmVar);
                }
                Object obj22 = tw80Var.a;
                int i43 = tw80Var.b;
                if (i43 == 0) {
                    hm5.M(obj22);
                    uw80 uw80Var = new uw80((e090) obj);
                    tw80Var.b = 1;
                    return vr20Var.emit(uw80Var, tw80Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i43 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof xy80) {
                    xy80Var = (xy80) lnmVar;
                    int i44 = xy80Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        xy80Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        xy80Var = new xy80(this, lnmVar);
                    }
                } else {
                    xy80Var = new xy80(this, lnmVar);
                }
                Object obj23 = xy80Var.a;
                int i45 = xy80Var.b;
                if (i45 == 0) {
                    hm5.M(obj23);
                    jy80 jy80VarE = bz80.e((jre) obj);
                    xy80Var.b = 1;
                    return vr20Var.emit(jy80VarE, xy80Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i45 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof uz80) {
                    uz80Var = (uz80) lnmVar;
                    int i46 = uz80Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        uz80Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        uz80Var = new uz80(this, lnmVar);
                    }
                } else {
                    uz80Var = new uz80(this, lnmVar);
                }
                Object obj24 = uz80Var.a;
                int i47 = uz80Var.b;
                if (i47 == 0) {
                    hm5.M(obj24);
                    xs81 xs81Var = new xs81(((Boolean) obj).booleanValue());
                    uz80Var.b = 1;
                    return vr20Var.emit(xs81Var, uz80Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i47 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof f090) {
                    f090Var = (f090) lnmVar;
                    int i48 = f090Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        f090Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        f090Var = new f090(this, lnmVar);
                    }
                } else {
                    f090Var = new f090(this, lnmVar);
                }
                Object obj25 = f090Var.a;
                int i49 = f090Var.b;
                if (i49 == 0) {
                    hm5.M(obj25);
                    ys81 ys81Var = new ys81((e090) obj);
                    f090Var.b = 1;
                    return vr20Var.emit(ys81Var, f090Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i49 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof t690) {
                    t690Var = (t690) lnmVar;
                    int i50 = t690Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        t690Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        t690Var = new t690(this, lnmVar);
                    }
                } else {
                    t690Var = new t690(this, lnmVar);
                }
                Object obj26 = t690Var.a;
                int i51 = t690Var.b;
                if (i51 == 0) {
                    hm5.M(obj26);
                    ybu ybuVar = new ybu(((Boolean) obj).booleanValue());
                    t690Var.b = 1;
                    return vr20Var.emit(ybuVar, t690Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i51 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof z790) {
                    z790Var = (z790) lnmVar;
                    int i52 = z790Var.b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        z790Var.b = i52 - Integer.MIN_VALUE;
                    } else {
                        z790Var = new z790(this, lnmVar);
                    }
                } else {
                    z790Var = new z790(this, lnmVar);
                }
                Object obj27 = z790Var.a;
                int i53 = z790Var.b;
                if (i53 == 0) {
                    hm5.M(obj27);
                    Object obj28 = ((mmr0) obj).a;
                    z790Var.b = 1;
                    return vr20Var.emit(obj28, z790Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i53 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof a890) {
                    a890Var = (a890) lnmVar;
                    int i54 = a890Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        a890Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        a890Var = new a890(this, lnmVar);
                    }
                } else {
                    a890Var = new a890(this, lnmVar);
                }
                Object obj29 = a890Var.a;
                int i55 = a890Var.b;
                if (i55 == 0) {
                    hm5.M(obj29);
                    Object obj30 = ((mmr0) obj).b;
                    a890Var.b = 1;
                    return vr20Var.emit(obj30, a890Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i55 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof p990) {
                    p990Var = (p990) lnmVar;
                    int i56 = p990Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        p990Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        p990Var = new p990(this, lnmVar);
                    }
                } else {
                    p990Var = new p990(this, lnmVar);
                }
                Object obj31 = p990Var.a;
                int i57 = p990Var.b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                eww0 eww0Var = (eww0) o7h.s0((List) obj);
                i990 i990Var = new i990(eww0Var != null ? eww0Var.b : null, eww0Var != null ? eww0Var.f : null);
                p990Var.b = 1;
                return vr20Var.emit(i990Var, p990Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ gw60(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
